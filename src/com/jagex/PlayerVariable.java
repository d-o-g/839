package com.jagex;

public final class PlayerVariable extends Varp {

    public int anInt8631;

    PlayerVariable(VarpType type, int id) {
        super(type, id);
    }

    static final void method14016(int i, int i_2_, int i_3_, int i_4_) {
        int i_6_ = Client.crosshairX * -1578109451;
        int i_7_ = -1421049503 * Client.crosshairY;
        if (1212199165 * Client.crosshairState == 1) {
            Sprite sprite = Class293.crosses[Client.anInt10679 * -1156246329 / 100];
            sprite.method2079(i_6_ - 8, i_7_ - 8);
        }
        if (2 == Client.crosshairState * 1212199165) {
            Sprite sprite = Class293.crosses[Client.anInt10679 * -1156246329 / 100 + 4];
            sprite.method2079(i_6_ - 8, i_7_ - 8);
        }
    }

    @Override
    public void method35() {

    }

    @Override
    void decode(Buffer buffer, int opcode) {
        Class206 class206 = CompressionType.findIdentifiable(Class206.values(), opcode);
        if (Class206.aClass206_2150 == class206) {
            anInt8631 = buffer.readUShort() * 95505587;
        }
    }

}