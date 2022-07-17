package com.jagex;

public class Class80 {
    static final int anInt1170 = 1;
    static final int anInt1171 = 2;
    public static int playerCount;
    public static Archive fonts;
    public static int anInt2578;
    static Buffer[] aClass480_Sub17Array1160;
    static int[] globalPlayerIndices;
    static byte[] playerUpdateState;
    static int anInt1163;
    static Buffer[] playerAppearanceBuffers;
    static int[] playerIndices;
    static int globalPlayerCount;
    static byte[] playerMovementSpeeds;
    static int[] maskUpdateIndices;
    static boolean $assertionsDisabled = !Class80.class.desiredAssertionStatus();
    static int anInt578;
    static Image aClass152_7063;

    static {
        playerUpdateState = new byte[2048];
        playerMovementSpeeds = new byte[2048];
        playerAppearanceBuffers = new Buffer[2048];
        aClass480_Sub17Array1160 = new Buffer[2048];
        playerIndices = new int[2048];
        globalPlayerIndices = new int[2048];
        GlobalPlayer.globals = new GlobalPlayer[2048];
        maskUpdateIndices = new int[2048];
    }

    Class80() throws Throwable {
        throw new Error();
    }

    public static boolean method1677(char c, int i) {
        if (c >= ' ' && c <= '~') {
            return true;
        }
        if (c >= '\u00a0' && c <= '\u00ff') {
            return true;
        }
        return '\u20ac' == c || c == '\u0152' || '\u2014' == c || '\u0153' == c || '\u0178' == c;
    }

    public static void method1678(boolean bool, byte[] is) {
        if (null == SkyboxDefinition.aClass480_Sub17_7011) {
            SkyboxDefinition.aClass480_Sub17_7011 = new Buffer(20000);
        }
        SkyboxDefinition.aClass480_Sub17_7011.writeBytes(is, 0, is.length);
        if (bool) {
            Class529.method9019(SkyboxDefinition.aClass480_Sub17_7011.payload);
            Class671.worlds = new World[Class572.anInt7657 * 704263327];
            int i_0_ = 0;
            for (int i_1_ = Class80.anInt2578 * -910063499; i_1_ <= Class572.anInt7654 * -397285031; i_1_++) {
                World class562_sub1 = Class166_Sub19.method15132(i_1_);
                if (null != class562_sub1) {
                    Class671.worlds[i_0_++] = class562_sub1;
                }
            }
            Class671.aBool8458 = false;
            TimeUtil.aLong9966 = TimeUtil.time() * 852222975926160771L;
            SkyboxDefinition.aClass480_Sub17_7011 = null;
        }
    }

    static boolean method1676() {
        boolean bool = true;
        if (Class82.aClass152_1178 == null) {
            if (DequeIterator.images.fileLoaded(-191614949 * Class82.anInt1185)) {
                Class82.aClass152_1178 = ImageUtils.loadFirst(DequeIterator.images, Class82.anInt1185 * -191614949);
            } else {
                bool = false;
            }
        }
        if (null == ItemDeque.aClass152_9984) {
            if (DequeIterator.images.fileLoaded(Class80.anInt578 * 2091453963)) {
                ItemDeque.aClass152_9984 = ImageUtils.loadFirst(DequeIterator.images, Class80.anInt578 * 2091453963);
            } else {
                bool = false;
            }
        }
        if (null == Class80.aClass152_7063) {
            if (DequeIterator.images.fileLoaded(Class82.anInt1183 * -1069294661)) {
                Class80.aClass152_7063 = ImageUtils.loadFirst(DequeIterator.images, -1069294661 * Class82.anInt1183);
            } else {
                bool = false;
            }
        }
        if (null == Class110.aClass9_1411) {
            if (fonts.fileLoaded(Class82.anInt1181 * 576943161)) {
                Class110.aClass9_1411 = FontSpecification.load(fonts, 576943161 * Class82.anInt1181);
            } else {
                bool = false;
            }
        }
        if (null == Class82.aClass152_Sub1Array1186) {
            if (DequeIterator.images.fileLoaded(576943161 * Class82.anInt1181)) {
                Class82.aClass152_Sub1Array1186 = (IndexedImage[]) ImageUtils.load(DequeIterator.images,
                        576943161 * Class82.anInt1181);
            } else {
                bool = false;
            }
        }
        return bool;
    }

}