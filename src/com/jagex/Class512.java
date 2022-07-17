package com.jagex;

public class Class512 {
    static Archive models;
    static int anInt7004;
    static String aString7005;

    Class512() throws Throwable {
        throw new Error();
    }

    static boolean isObjectActionOpcode(int i) {
        if (3 == i || i == 4 || 5 == i || 6 == i || i == 1001 || i == 1002) {
            return true;
        }

        return 2 == i;
    }
}
