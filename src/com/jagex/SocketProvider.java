package com.jagex;

import java.io.IOException;
import java.net.Socket;

public abstract class SocketProvider {

    int port;
    String host;

    SocketProvider() {

    }

    public static String toUrlSafe(CharSequence sequence) {
        int length = sequence.length();
        StringBuilder builder = new StringBuilder(length);

        for (int index = 0; index < length; index++) {
            char character = sequence.charAt(index);
            if (character >= 'a' && character <= 'z' || character >= 'A' && character <= 'Z' || character >= '0'
                    && character <= '9' || character == '.' || character == '-' || character == '*' || character == '_') {
                builder.append(character);
            } else if (character == ' ') {
                builder.append('+');
            } else {
                int b = Class483.charToByte(character);
                builder.append('%');
                int packed = b >> 4 & 0xf;
                if (packed >= 10) {
                    builder.append((char) (packed + 55));
                } else {
                    builder.append((char) (packed + 48));
                }

                packed = b & 0xf;
                if (packed >= 10) {
                    builder.append((char) (55 + packed));
                } else {
                    builder.append((char) (packed + 48));
                }
            }
        }

        return builder.toString();
    }

    public static void method13763() {
        if (Class31.loginState * -1087837371 == 108) {
            Class31.loginState = -781018025;
        }
    }

    static void method13762(int plane, int localX, int localZ, int group, int i_7_, int type, Class540 class540) {
        SceneMod sceneMod = null;
        for (SceneMod mod = SceneMod.pendingRotations.head(); null != mod; mod = SceneMod.pendingRotations.next()) {
            if (plane == mod.plane * -618261599 && localX == 1155137153 * mod.localX
                    && localZ == 51547319 * mod.localZ && group == -677397461 * mod.group) {
                sceneMod = mod;
                break;
            }
        }

        if (sceneMod == null) {
            sceneMod = new SceneMod();
            sceneMod.plane = plane * 1586008161;
            sceneMod.group = -1555094909 * group;
            sceneMod.localX = localX * -1064812159;
            sceneMod.localZ = localZ * 1342836999;
            SceneMod.pendingRotations.pushBack(sceneMod);
        }

        sceneMod.id = i_7_ * 340568737;
        sceneMod.type = -1339454739 * type;
        sceneMod.aClass540_10066 = class540;
        sceneMod.aBool10069 = true;
        sceneMod.aBool10063 = false;
    }

    public abstract Socket provide() throws IOException;

    Socket direct() throws IOException {
        return new Socket(host, 147585685 * port);
    }

}