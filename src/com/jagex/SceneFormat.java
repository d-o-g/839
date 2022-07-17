package com.jagex;

public class SceneFormat {
    public static SceneFormat aSceneFormat_5152;
    public static SceneFormat CONSTRUCTED;
    public static SceneFormat aSceneFormat_5154;
    public static SceneFormat aSceneFormat_5159;
    public static SceneFormat aSceneFormat_5161 = new SceneFormat(false, false);
    static SceneFormat aSceneFormat_5155;
    static SceneFormat aSceneFormat_5156;
    static SceneFormat aSceneFormat_5158;

    static {
        aSceneFormat_5152 = new SceneFormat(true, false);
        aSceneFormat_5154 = new SceneFormat(false, false);
        CONSTRUCTED = new SceneFormat(true, false);
        aSceneFormat_5156 = new SceneFormat(true, false);
        aSceneFormat_5155 = new SceneFormat(true, true);
        aSceneFormat_5158 = new SceneFormat(true, true);
        aSceneFormat_5159 = new SceneFormat(false, false);
    }

    boolean aBool5157;
    boolean dynamic;

    SceneFormat(boolean dynamic, boolean bool_0_) {
        this.dynamic = dynamic;
        aBool5157 = bool_0_;
    }

    public static void method7544(String string, String string_17_, int i, boolean bool, String string_18_) {
        if (6 == Client.connectionState * -1501875989) {
            OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3958,
                    Client.lobbyConnection.encryptor);
            frame.payload.writeShort(0);
            int start = frame.payload.caret * -165875887;
            frame.payload.writeCString(string);
            frame.payload.writeCString(string_17_);
            frame.payload.writeByte(i);
            frame.payload.writeByte(bool ? 1 : 0);
            frame.payload.writeCString(string_18_);
            frame.payload.caret += 217060311;
            frame.payload.encodeXtea(Class34.anIntArray447, start, frame.payload.caret * -165875887);
            frame.payload.writeSizeShort(frame.payload.caret * -165875887 - start, 558241984);
            Client.lobbyConnection.sendFrame(frame);
            if (i < 13) {
                Client.aBool10632 = true;
                PlayerVarpType.method15346(-1254058051);
            }
            Class23.aClass640_326 = Class640.aClass640_8156;
        }
    }

    public static void method7546(Varp class131, int i) {
        PulseEvent class480_sub31_sub5 = PulseEvent.create(1, class131.index * 169834903);
        class480_sub31_sub5.delay();
    }

    static final void method7542(Component class226, Interface class221, ScriptExecutionContext class613) {
        int i_9_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
        if (i_9_ == -687311621 * Component.anInt2398 || i_9_ == Component.anInt2350 * -1377754877
                || i_9_ == Component.anInt2351 * -116477801 || -721529179 * Component.anInt2352 == i_9_) {
            class226.anInt2481 = 1170733121 * i_9_;
        }
    }

    static Class340 method7543(Buffer buffer, int i) {
        Class349 class349 = Class349.values()[buffer.readUByte()];
        Class334 class334 = Class334.values()[buffer.readUByte()];
        int i_10_ = buffer.readShort();
        int i_11_ = buffer.readShort();
        int i_12_ = buffer.readUShort();
        int i_13_ = buffer.readUShort();
        int i_14_ = buffer.readShort();
        int i_15_ = buffer.readSmart32();
        int i_16_ = buffer.readInt();
        return new Class340(class349, class334, i_10_, i_11_, i_12_, i_13_, i_14_, i_15_, i_16_);
    }

    static void method7545(Toolkit class134, int i, int i_21_, Component class226, byte i_22_) {
        int i_23_ = 127;
        int i_24_ = 7;
        for (int i_25_ = 63; i_25_ >= 0; i_25_--) {
            int i_26_ = (i_25_ & 0x3f) << 10 | (i_24_ & 0x7) << 7 | i_23_ & 0x7f;
            Class44.method1067(false, true);
            int i_27_ = Class335.HSV_TABLE[i_26_];
            Class470.method8046(false, true);
            class134.method2434(i, i_21_ + (class226.height * 1362321717 * (63 - i_25_) >> 6),
                    class226.width * 688089097, (class226.height * 1362321717 >> 6) + 1, ~0xffffff | i_27_, 0);
        }
    }

    public boolean method7536() {
        return aBool5157;
    }

    boolean isDynamic() {
        return dynamic;
    }
}
