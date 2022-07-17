package com.jagex;

public class ClanChannel extends Node {

    public byte aByte10226;
    public int memberCount = 0;
    public String aString10231 = null;
    public byte aByte10232;
    public ClanMember[] aClass283Array10233;
    boolean aBool10225 = true;
    boolean aBool10227;
    int[] anIntArray10229;
    long aLong10230;
    public ClanChannel(Buffer buffer) {
        decode(buffer);
    }

    static void method16088() {
        Class63.anInt954 = 0;
        Client.floorLevel = 742271049;
        Class63.destinationX = 517887053;
        Class63.destinationY = -224109565;
    }

    public int[] method16073(int i) {
        if (anIntArray10229 == null) {
            String[] strings = new String[1777256127 * memberCount];
            anIntArray10229 = new int[1777256127 * memberCount];

            for (int index = 0; index < 1777256127 * memberCount; index++) {
                strings[index] = aClass283Array10233[index].name;
                anIntArray10229[index] = index;
            }

            ArrayUtils.sort(strings, anIntArray10229);
        }

        return anIntArray10229;
    }

    public int method16076(String string) {
        for (int index = 0; index < memberCount * 1777256127; index++) {
            if (aClass283Array10233[index].name.equalsIgnoreCase(string)) {
                return index;
            }
        }

        return -1;
    }

    void method16075(int i) {
        memberCount -= -432559809;
        if (0 == 1777256127 * memberCount) {
            aClass283Array10233 = null;
        } else {
            System.arraycopy(aClass283Array10233, i + 1, aClass283Array10233, i, 1777256127 * memberCount - i);
        }

        anIntArray10229 = null;
    }

    void decode(Buffer buffer) {
        int attributes = buffer.readUByte();
        if ((attributes & 0x1) != 0) {
            aBool10227 = true;
        }

        if (0 != (attributes & 0x2)) {
            aBool10225 = true;
        }

        int i_4_ = 2;
        if (0 != (attributes & 0x4)) {
            i_4_ = buffer.readUByte();
        }

        linkedKey = buffer.readLong() * -7096345066895942069L;
        aLong10230 = buffer.readLong() * -7326488349242084039L;
        aString10231 = buffer.readString();
        buffer.readUByte();
        aByte10226 = buffer.readByte();
        aByte10232 = buffer.readByte();
        memberCount = buffer.readUShort() * -432559809;

        if (memberCount * 1777256127 > 0) {
            aClass283Array10233 = new ClanMember[memberCount * 1777256127];

            for (int index = 0; index < memberCount * 1777256127; index++) {
                ClanMember class283 = new ClanMember();
                if (aBool10227) {
                    buffer.readLong();
                }

                if (aBool10225) {
                    class283.name = buffer.readString();
                }

                class283.rank = buffer.readByte();
                class283.world = buffer.readUShort() * -1457733513;

                if (i_4_ >= 3) {
                    buffer.readUByte();
                }

                aClass283Array10233[index] = class283;
            }
        }
    }

    void method16083(int i) {
        if (aClass283Array10233 != null) {
            System.arraycopy(aClass283Array10233, 0, aClass283Array10233 = new ClanMember[i], 0, memberCount * 1777256127);
        } else {
            aClass283Array10233 = new ClanMember[i];
        }
    }

    void method16085(ClanMember class283) {
        if (aClass283Array10233 == null || 1777256127 * memberCount >= aClass283Array10233.length) {
            method16083(1777256127 * memberCount + 5);
        }

        aClass283Array10233[(memberCount += -432559809) * 1777256127 - 1] = class283;
        anIntArray10229 = null;
    }

}