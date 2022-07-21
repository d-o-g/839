package com.jagex;

public class Class257 {
    public static Class257 aClass257_2848 = new Class257(0, false);
    public static Class257 aClass257_2850;
    public static Class257 aClass257_2855 = new Class257(1, false);
    static Class257 aClass257_2847;
    static Class257 aClass257_2849;
    static Class257 aClass257_2851;
    static Class257 aClass257_2852;

    static {
        aClass257_2849 = new Class257(2, true);
        aClass257_2850 = new Class257(3, false);
        aClass257_2851 = new Class257(4, true);
        aClass257_2852 = new Class257(5, true);
        aClass257_2847 = new Class257(6, true);
    }

    public int anInt2854;
    boolean aBool2853;

    Class257(int i, boolean bool) {
        anInt2854 = 1935974377 * i;
        aBool2853 = bool;
    }

    public static final void method4766() {
        for (int i_8_ = 0; i_8_ < 5; i_8_++) {
            Client.aBoolArray10873[i_8_] = false;
        }
        Client.anInt10620 = 1980304975;
        Client.anInt10722 = -1338730263;
        Class525.anInt7217 = 0;
        BefriendedPlayer.anInt576 = 0;
        Client.mapState = 1771678548;

        if (FloatRaster.method1728() == 3) {
            CoordGrid class553 = Client.scene.getBase();
            int i_9_ = class553.x * 2051316501 << 9;
            int i_10_ = class553.z * -180305283 << 9;
            int i_11_ = 1000 / EntityQueue.getFps();
            Client.camera.method4804(i_11_ / 1000.0F, Client.scene.method7696().tileHeights,
                    Client.scene.method7775(), i_9_, i_10_);
        }

        TurnMobCutsceneAction.anInt9433 = -1490979241;
        Class156.anInt1886 = -1672889529;
        Client.anInt10639 = 672999733 * Client.engineCycle;
        ValueType.anInt4856 = -1685255975 * Client.cameraX;
        HashedVariableCollection.anInt1485 = Class268.cameraY * -264037261;
        Class512.anInt7004 = Client.cameraZ * -1300916571;
        Class206.anInt2160 = -1864192179 * Class155.cameraPitch;
        AsynchronousHttpRequestCreator.anInt4613 = 1684172825 * Class550.cameraYaw;
        DrawableText.anInt9830 = -130767769 * Client.anInt10906;
    }

    static int method4760() {
        int i_0_ = 1189066767 * Class262.aClass262_2650.anInt2944;
        if (i_0_ < Class277.aClass262Array3115.length - 1) {
            Class262.aClass262_2650 = Class277.aClass262Array3115[i_0_ + 1];
        }
        return 100;
    }

    static final int method4765(int packed) {
        int type = packed & 0x3f;
        int orientation = packed >> 6 & 0x3;

        if (type == 18) {
            if (0 == orientation) {
                return 1;
            } else if (1 == orientation) {
                return 2;
            } else if (orientation == 2) {
                return 4;
            } else if (orientation == 3) {
                return 8;
            }
        } else if (19 == type || type == 21) {
            if (0 == orientation) {
                return 16;
            } else if (orientation == 1) {
                return 32;
            } else if (orientation == 2) {
                return 64;
            } else if (3 == orientation) {
                return 128;
            }
        }

        return 0;
    }

    public boolean method4757() {
        return aBool2853;
    }

}