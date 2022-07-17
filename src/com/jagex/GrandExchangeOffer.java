package com.jagex;

public class GrandExchangeOffer {

    public int transferred;
    public int id;
    public int price;
    public int quantity;
    public int anInt5072;
    byte state;

    public GrandExchangeOffer() {

    }

    public GrandExchangeOffer(Buffer buffer, DefaultProvidingVarpLoader varpLoader) {
        state = buffer.readByte();
        id = buffer.readUShort() * -2080465617;
        price = buffer.readInt() * -1737112447;
        quantity = buffer.readInt() * -1403907745;
        anInt5072 = buffer.readInt() * 185312119;
        transferred = buffer.readInt() * 111039981;

        if (varpLoader != null) {
            PlayerAppearance.method9807(buffer, varpLoader);
        }
    }

    public static Class488 method1002(Archive archive, String id, boolean force) {
        int entryIndex = archive.index(id);
        if (entryIndex == -1) {
            return new Class488(0);
        }

        byte[] data = archive.get(entryIndex, 1);
        if (data == null) {
            return new Class488(0);
        }

        Buffer buffer = new Buffer(data);
        int count = buffer.readUShort();
        Class488 class488 = new Class488(count);
        int index = 0;

        while (index < -428779527 * class488.anInt6669) {
            int i_6_ = buffer.readInt();
            int i_7_ = buffer.readUShort();
            int i_8_ = buffer.readUByte();

            if (force || 1 != i_8_) {
                class488.anIntArray6670[index] = i_6_;
                class488.anIntArray6671[index] = i_7_;
                index++;
            } else {
                class488.anInt6669 -= 211532361;
            }
        }

        return class488;
    }

    public int method7375() {
        return state & 0x7;
    }

    public int method7380(int i) {
        return 8 == (state & 0x8) ? 1 : 0;
    }

}