package com.jagex;

public class HintArrow {

    static ReferenceCache<Model> aClass168_1125 = new ReferenceCache<>(4);

    public int model = -1173898881;
    public int targetIndex;
    public int x;
    public int anInt1121;
    public int z;
    public int type;
    int id;
    int level;
    int flashRate;
    int heightOffset;

    public HintArrow() {

    }

    static void method1615(byte[] data) {
        Buffer buffer = new Buffer(data);
        while (true) {
            int opcode = buffer.readUByte();
            if (opcode == 0) {
                break;
            }

            if (opcode == 1) {
                int i_1_ = buffer.readUShort();
                TurnMobCutsceneAction.aClass186_9434.method3613(i_1_);
            }
        }
    }

}