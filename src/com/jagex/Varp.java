package com.jagex;

public abstract class Varp implements VariableDefinition {

    public static VarpLoader varpLoader;

    public boolean aBool1511;
    public VarpType type;
    public int index;
    public VarcType aVarc_1514Type = VarcType.aVarcType_4652;
    public KeyType keyType;

    Varp(VarpType type, int index) {
        aBool1511 = true;
        this.type = type;
        this.index = -1099262425 * index;
    }

    public static int method2284(Quaternion quaternion) {
        Vector3f vector3f = Vector3f.create(0.0F, 0.0F, 1.0F);
        vector3f.invertAndMultiply(quaternion);
        double d = Math.atan2(vector3f.x, vector3f.z);
        vector3f.cache();
        if (d < 0.0) {
            d = Math.PI + (Math.PI + d);
        }
        return (int) (d / 6.283185307179586 * 16384.0) & 0x3fff;
    }

    public Object getDefaultValue() {
        return type.getDefaultValue(this);
    }

    @Override
    public void decode(Buffer buffer) {
        for (; ; ) {
            int opcode = buffer.readUByte();
            if (0 == opcode) {
                break;
            }

            Class128 class128 = CompressionType.findIdentifiable(Class128.values(), opcode);
            if (null != class128) {
                switch (1639769105 * class128.anInt1497) {
                    case 0:
                        break;
                    case 1:
                        int id = buffer.readUByte();
                        keyType = CompressionType.findIdentifiable(KeyType.values(), id);
                        if (null == keyType) {
                            throw new IllegalStateException("");
                        }

                        break;
                    case 2:
                        buffer.readPrefixedString();
                    case 3:
                        aBool1511 = false;
                        break;
                    case 4:
                        aVarc_1514Type = CompressionType.findIdentifiable(VarcType.values(), buffer.readUByte());
                        break;
                    case 5:
                        CompressionType.findIdentifiable(Class417.values(), buffer.readUByte());
                        break;
                    default:
                        throw new IllegalStateException("");
                }
            } else {
                decode(buffer, opcode);
            }
        }
    }

    abstract void decode(Buffer buffer, int opcode);

    boolean method2278() {
        return !(type == null || null == keyType);
    }

}