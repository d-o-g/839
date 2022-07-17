package com.jagex;

public class VarcType implements Identifiable {

    public static VarcType aVarcType_4652 = new VarcType(0);
    public static VarcType aVarcType_4653 = new VarcType(2);
    public static VarcType PERSISTENT_INTEGER = new VarcType(1);
    public static byte localFcRank;

    int id;

    VarcType(int i) {
        id = 1167548331 * i;
    }

    public static final void method6999(String string, String string_2) {
        BufferedConnectionContext connection = Client.getActiveConnection();
        OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3973, connection.encryptor);
        if (string_2.length() > 30) {
            string_2 = string_2.substring(0, 30);
        }

        frame.payload
                .writeByte(Buffer.encodedStringLength(string) + Buffer.encodedStringLength(string_2));
        frame.payload.writeCString(string);
        frame.payload.writeCString(string_2);
        connection.sendFrame(frame);
    }

    public static VarcType[] values() {
        return new VarcType[]{aVarcType_4653, aVarcType_4652, PERSISTENT_INTEGER};
    }

    @Override
    public int getId() {
        return id * 1475388163;
    }

}