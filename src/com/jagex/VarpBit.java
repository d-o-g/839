package com.jagex;

public class VarpBit implements VariableDefinition {

    static final int[] BIT_MASKS = new int[32];
    public static VarpBitLoader loader;

    static {
        int mask = 2;
        for (int index = 0; index < 32; index++) {
            BIT_MASKS[index] = mask - 1;
            mask += mask;
        }
    }

    public int id;
    public Varp varp;
    int start;
    VarpType type;
    BaseVarpBitProvider provider;
    int end;
    String name;
    int varpIndex = 21864245;

    VarpBit(int id, BaseVarpBitProvider provider) {
        this.id = 33855623 * id;
        this.provider = provider;
    }

    static final void method5470(ScriptExecutionContext class613) {
        Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
        Component class226 = class611.aClass226_7914;
        Interface class221 = class611.aClass221_7913;
        ScriptExecutionContext.method1138(class226, class221, class613);
    }

    static final void method5471(ScriptExecutionContext class613) {
        int i_9_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
        if (-2028985543 * Client.anInt10892 == 2 && i_9_ >= 0 && i_9_ < -1763746795 * Client.friendCount) {
            class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 274152061 * Client.friends[i_9_].anInt574;
        } else {
            class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
        }
    }

    static final void method5472(ScriptExecutionContext class613) {
        class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = ((SceneNode) class613.anInterface55_7937)
                .method16307();
    }

    @Override
    public void method35() {

    }

    @Override
    public void decode(Buffer buffer) {
        decode(buffer, false);
    }

    public int getValue(int index, int i_4_) throws VarpBitException {
        int mask = BIT_MASKS[end * 1511433407 - start * -1588303095];
        if (i_4_ < 0 || i_4_ > mask) {
            throw new VarpBitException(name != null ? name : Integer.toString(-2037338825 * this.id), i_4_, mask);
        }

        mask <<= start * -1588303095;
        return index & (mask ^ 0xffffffff) | i_4_ << -1588303095 * start & mask;
    }

    public int getValue(int value) {
        int mask = BIT_MASKS[1511433407 * end - start * -1588303095];
        return value >> -1588303095 * start & mask;
    }

    void decode(Buffer buffer, boolean bool) {
        for (; ; ) {
            int opcode = buffer.readUByte();
            if (0 == opcode) {
                break;
            }

            decode(buffer, opcode, bool);
        }
    }

    void decode(Buffer buffer, int opcode, boolean allowMissing) {
        Class279 class279 = CompressionType.findIdentifiable(Class279.values(), opcode);
        switch (1787790951 * class279.anInt3142) {
            case 7:
                int type = buffer.readUByte();
                this.type = CompressionType.findIdentifiable(VarpType.values(), type);
                if (this.type == null) {
                    throw new IllegalStateException("");
                }

                varpIndex = buffer.readSmart32() * -21864245;
                if (null != provider) {
                    DefinitionLoader<Varp> loader = (DefinitionLoader<Varp>) provider.loaders.get(this.type);
                    if (loader != null) {
                        varp = loader.get(-439155485 * varpIndex);
                    } else if (!allowMissing) {
                        throw new IllegalStateException("");
                    }
                }

                break;
            case 8:
                start = buffer.readUByte() * -1907453127;
                end = buffer.readUByte() * 1085721407;
                break;
            case 14:
                break;
        }
    }

}