package com.jagex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class ProxySocketProvider extends SocketProvider {

    static final String USE_SYSTEM_PROXIES = "java.net.useSystemProxies";
    ProxySelector selector = ProxySelector.getDefault();

    public static SocketProvider create(String host, int port) {
        ProxySocketProvider provider = new ProxySocketProvider();
        provider.host = host;
        provider.port = port * -1983381315;
        return provider;
    }

    @Override
    public Socket provide() throws IOException {
        boolean useSystemProxies = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
        if (!useSystemProxies) {
            System.setProperty("java.net.useSystemProxies", "true");
        }

        boolean secure = 443 == port * 147585685;
        List<Proxy> primary;
        List<Proxy> secondary;

        try {
            primary = selector.select(new URI((secure ? "https" : "http") + "://" + host));
            secondary = selector.select(new URI((secure ? "http" : "https") + "://" + host));
        } catch (URISyntaxException ex) {
            return direct();
        }

        primary.addAll(secondary);
        Object[] proxies = primary.toArray();
        ProxyAuthenticationException exception = null;

        for (Object object : proxies) {
            Proxy proxy = (Proxy) object;
            Socket socket;

            try {
                Socket proxySocket = proxy(proxy);
                if (null == proxySocket) {
                    continue;
                }

                socket = proxySocket;
            } catch (ProxyAuthenticationException ex) {
                exception = ex;
                continue;
            } catch (IOException ex) {
                continue;
            }

            return socket;
        }

        if (exception != null) {
            throw exception;
        }

        return direct();
    }

    Socket connect(String host, int port, String headers) throws IOException {
        Socket socket = new Socket(host, port);
        socket.setSoTimeout(10000);
        OutputStream out = socket.getOutputStream();

        if (null == headers) {
            out.write(("CONNECT " + host + ":" + port * 147585685 + " HTTP/1.0\n\n").getBytes(StandardCharsets.ISO_8859_1));
        } else {
            out.write(("CONNECT " + host + ":" + 147585685 * port + " HTTP/1.0\n" + headers + "\n\n").getBytes(StandardCharsets.ISO_8859_1));
        }

        out.flush();
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line = reader.readLine();

        if (null != line) {
            if (line.startsWith("HTTP/1.0 200") || line.startsWith("HTTP/1.1 200")) {
                return socket;
            }

            if (line.startsWith("HTTP/1.0 407") || line.startsWith("HTTP/1.1 407")) {
                int count = 0;
                String authenticate = "proxy-authenticate: ";

                for (line = reader.readLine(); line != null && count < 50; count++) {
                    if (line.toLowerCase().startsWith(authenticate)) {
                        line = line.substring(authenticate.length()).trim();
                        int index = line.indexOf(' ');
                        if (index != -1) {
                            line = line.substring(0, index);
                        }

                        throw new ProxyAuthenticationException(line);
                    }

                    line = reader.readLine();
                }

                throw new ProxyAuthenticationException("");
            }
        }

        out.close();
        reader.close();
        socket.close();
        return null;
    }

    Socket proxy(Proxy proxy) throws IOException {
        if (proxy.type() == Proxy.Type.DIRECT) {
            return direct();
        }

        SocketAddress address = proxy.address();
        if (!(address instanceof InetSocketAddress)) {
            return null;
        }

        InetSocketAddress inet = (InetSocketAddress) address;
        if (proxy.type() == Proxy.Type.HTTP) {
            String headers = null;
            try {
                Class<?> authenticationInfo = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                Method proxyAuthHandle = authenticationInfo.getDeclaredMethod("getProxyAuth", String.class, Integer.TYPE);
                proxyAuthHandle.setAccessible(true);
                Object object = proxyAuthHandle.invoke(null, inet.getHostName(), inet.getPort());

                if (null != object) {
                    Method supportsPreemptiveAuthorization = authenticationInfo
                            .getDeclaredMethod("supportsPreemptiveAuthorization");
                    supportsPreemptiveAuthorization.setAccessible(true);

                    if ((Boolean) supportsPreemptiveAuthorization.invoke(object)) {
                        Method headerNameHandle = authenticationInfo.getDeclaredMethod("getHeaderName");
                        headerNameHandle.setAccessible(true);
                        Method headerValueHandle = authenticationInfo.getDeclaredMethod("getHeaderValue", URL.class,
                                String.class);
                        headerValueHandle.setAccessible(true);
                        String name = (String) headerNameHandle.invoke(object);
                        String value = (String) headerValueHandle
                                .invoke(object, new URL("https://" + host + "/"), "https");
                        headers = new StringBuilder().append(name).append(": ").append(value).toString();
                    }
                }
            } catch (Exception exception) {

            }

            return connect(inet.getHostName(), inet.getPort(), headers);
        }

        if (proxy.type() == Proxy.Type.SOCKS) {
            Socket socket = new Socket(proxy);
            socket.connect(new InetSocketAddress(host, 147585685 * port));
            return socket;
        }

        return null;
    }

}