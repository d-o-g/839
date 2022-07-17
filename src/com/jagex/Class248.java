package com.jagex;

import java.util.HashMap;
import java.util.Map;

public class Class248 {
    static int anInt2665;

    static HashTable<ChatMessage> messageCache = new HashTable<>(1024);
    //key being the container type
    static Map<Integer, ChatContainer> chatContainers = new HashMap<>();
    static Queue aClass638_2668 = new Queue();

    Class248() throws Throwable {
        throw new Error();
    }

    public static SomeSerializable method4643(Archive archive, int i, Interface63 interface63, boolean music,
                                              ReferenceCache class168) {
        if (null != Class593.aClass343_7835) {
            if (music) {
                return new Class571(archive, i, Class593.aClass343_7835, interface63);
            }
            return new Class552(archive, i, Class593.aClass343_7835, interface63, class168);
        }
        return null;
    }

    static boolean method4641() {
        return !Class455.loadingState(Client.connectionState * -1501875989);
    }

    public static void method4007() {
        chatContainers.clear();
        messageCache.clear();
        aClass638_2668.clear();
        anInt2665 = 0;
    }

    static int method8773() {
        return (anInt2665 += 1761049015) * 1234285575 - 1;
    }
}