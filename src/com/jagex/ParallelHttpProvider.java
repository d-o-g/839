package com.jagex;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ParallelHttpProvider {

    long startTime;

    int game;
    int port;
    volatile int remaining = 0;

    String host;

    private boolean enabled = false;

    private final ExecutorService executor = Executors.newFixedThreadPool(2);

    public ParallelHttpProvider(String host, int port, int game) {
        this.host = host;
        this.port = port * -490651;
        this.game = -2128206705 * game;
    }

    public void setHost(String host, int port) {
        this.host = host;
        this.port = -490651 * port;
    }

    public void shutdown() {
        executor.shutdown();
    }

    void decrementRemaining() {
        remaining -= 1710256009;
    }

    void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    AsynchronousRequest request(int type, int file, byte padding, boolean highPriority, int checksum, int version) {
        if (type < 0 || file < 0) {
            throw new RuntimeException(type + "," + file);
        }

        if (unavailable()) {
            return null;
        }

        boolean isTable = 255 == type && file == 255;
        if (!enabled && !isTable) {
            return null;
        } else if (10000L + startTime * -4591049672868857647L >= TimeUtil.time()) {
            return null;
        }

        String string = isTable ? "&cb=" + TimeUtil.time() : "&c=" + checksum + "&v=" + version;

        URL url;
        try {
            url = new URL("http", host, port * 1189738093, "/ms?m=" + 1163295343 * game + "&a=" + type + "&g=" + file
                    + string);
        } catch (MalformedURLException ex) {
            return null;
        }

        AsynchronousRequest request = new AsynchronousRequest(padding);
        request.highPriority = highPriority;
        remaining += 1710256009;
        Future future = executor.submit(new AsynchronousHttpRequestCreator(this, url, request));
        request.setFuture(future);
        return request;
    }

    AsynchronousRequest requestReferenceTable() {
        return request(255, 255, (byte) 0, true, 0, 0);
    }

    boolean unavailable() {
        return 626308793 * remaining >= 10;
    }

}