package com.jagex;

final class WorldVarpType extends VarpType {
    WorldVarpType(Js5ConfigGroup config, int id) {
        super(config, id);
    }

    public static final void method15405(int index, boolean bool) {
        if (null != Class417.aClass480_Sub33_4650 && index >= 0
                && index < Class417.aClass480_Sub33_4650.memberCount * 1777256127) {
            ClanMember class283 = Class417.aClass480_Sub33_4650.aClass283Array10233[index];
            BufferedConnectionContext connection = Client.getActiveConnection();
            OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3936, connection.encryptor);
            frame.payload.writeByte(3 + Buffer.encodedStringLength(class283.name));
            frame.payload.writeShort(index);
            frame.payload.writeByte(bool ? 1 : 0);
            frame.payload.writeCString(class283.name);
            connection.sendFrame(frame);
        }
    }

    @Override
    Object method7337(Varp parameter) {
        if (KeyType.ONE == parameter.keyType) {
            return -1;
        }

        return parameter.keyType.method7017();
    }

}