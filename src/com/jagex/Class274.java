package com.jagex;

public class Class274 implements Interface27 {
    public static Class364 aClass364_3093;
    static byte[] aByteArray3089 = {31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6, 14, 54, 54,
            118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17, 94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41,
            121, 57, 89, 41, 25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3, 67, 19, 19, 19, 121,
            117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112, 33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18,
            70, -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24, 25, 24, 89, 24, -107, 24, -104, 4, 25, -103,
            5, 25, 89, -108, 24, -2, 31, 97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97, 101, 99,
            -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56, -52, -52, -60, -62, -52, -54, -54, -62, 2, -108,
            -83, 5, -54, 51, -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24, 53, 78, 92, -56, -95,
            -20, -76, -15, -96, 104, -48, -59, 15, 42, -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22,
            26, -102, 90, 38, -90, 102, -26, 22, -106, 86, -50, 46, -82, 110, -18, 30, -98, 94, -63, 33, -95, 97, -31,
            17, -111, 81, -55, 41, -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85, -51, 45, -83,
            109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109, -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14,
            21, 43, 87, 109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56, -47, 99, -57, 79, -100, 60,
            117, -23, -14, -107, -85, -41, -82, -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123, -2, -30, -27, -85,
            -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2, 98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6,
            -117, -119, -123, -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86, 69, 67, 54, 33, -57,
            64, -10, -60, 66, 97, 37, -93, 70, 14, 17, -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116,
            -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50, 99, 77, 100, -7, 12, -18, 49, -124, -65,
            110, 49, -16, -79, 48, 2, -29, 15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49, 127, -79, -88,
            -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0};
    static ReferenceCache aClass168_3092 = new ReferenceCache(128, 4);
    int anInt3085;
    boolean aBool3086;
    Class42 aClass42_3087;
    Interface28[] anInterface28Array3088;
    int anInt3090;
    Toolkit toolkit;
    Class274(Class42 class42, int i, int i_1_, Class286 class286) {
        aClass42_3087 = class42;
        anInt3085 = i * 337542983;
        anInt3090 = i_1_ * -1261537635;
        anInterface28Array3088 = new Interface28[aClass42_3087.anInterface43Array547.length];

        for (int index = 0; index < anInterface28Array3088.length; index++) {
            anInterface28Array3088[index] = class286.method5287(aClass42_3087.anInterface43Array547[index]);
        }
    }

    static boolean method5148(int i) {
        return i == 0 || i == 18 || 15 == i || 6 == i || 2 == i || i == 1;
    }

    @Override
    public void method106() {
        if (Class60.activeToolkit != toolkit) {
            toolkit = Class60.activeToolkit;
            aBool3086 = true;
        }

        toolkit.method2426(3, 0);
        Interface28[] interface28s = anInterface28Array3088;
        for (Interface28 interface28 : interface28s) {
            if (null != interface28) {
                interface28.load();
            }
        }
    }

    @Override
    public void method156(boolean bool, int i) {
        bool = true;
        Interface28[] interface28s = anInterface28Array3088;
        for (Interface28 interface28 : interface28s) {
            if (null != interface28) {
                interface28.method176(bool || aBool3086);
            }
        }
        aBool3086 = false;
    }

    @Override
    public void method157(byte i) {

    }

    @Override
    public int method159(int i) {
        return 57917365 * anInt3090;
    }

    @Override
    public int method160() {
        int i_4_ = 0;
        Interface28[] interface28s = anInterface28Array3088;
        for (Interface28 interface28 : interface28s) {
            if (interface28 == null || interface28.ready()) {
                i_4_++;
            }
        }
        return i_4_ * 100 / anInterface28Array3088.length;
    }

    @Override
    public boolean method164(long l) {
        return TimeUtil.time() >= l + anInt3085 * 217938551;
    }

}