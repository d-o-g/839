package com.jagex;

import java.awt.Image;

public class ClanMember {
    public static Image anImage3166;
    public static int anInt3167;
    public byte rank;
    public int world;
    public String name;

    public static final void method3558(int index) {
        if (Class417.aClass480_Sub33_4650 != null && index >= 0
                && index < Class417.aClass480_Sub33_4650.memberCount * 1777256127) {
            ClanMember class283 = Class417.aClass480_Sub33_4650.aClass283Array10233[index];

            if (class283.rank == -1) {
                BufferedConnectionContext connection = Client.getActiveConnection();
                OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3928, connection.encryptor);
                frame.payload.writeByte(2 + Buffer.encodedStringLength(class283.name));
                frame.payload.writeShort(index);
                frame.payload.writeCString(class283.name);
                connection.sendFrame(frame);
            }
        }
    }

    static void method5268() {
        if (Class49.aClass134_581 != null) {
            Class49.aClass134_581.method2373();
            Class49.aClass134_581 = null;
            Class49.aClass132_580 = null;
        }
    }

}