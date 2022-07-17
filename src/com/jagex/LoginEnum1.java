package com.jagex;

public class LoginEnum1 implements Identifiable {
    public static LoginEnum1 aLoginEnum1_2673 = new LoginEnum1(0, 1);
    public static LoginEnum1 aLoginEnum1_2674 = new LoginEnum1(2, 0);
    public static LoginEnum1 aLoginEnum1_2675 = new LoginEnum1(3, 3);
    public static LoginEnum1 aLoginEnum1_2676 = new LoginEnum1(1, 2);
    public int anInt2672;
    int id;
    LoginEnum1(int i, int i_0_) {
        anInt2672 = i * -989854357;
        id = i_0_ * 1339968803;
    }

    public static final void method4708(String string, String string_1_) {
        BufferedConnectionContext connection = Client.getActiveConnection();
        OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_4004, connection.encryptor);
        if (string_1_.length() > 30) {
            string_1_ = string_1_.substring(0, 30);
        }

        frame.payload.writeByte(Buffer.encodedStringLength(string)
                + Buffer.encodedStringLength(string_1_));
        frame.payload.writeCString(string_1_);
        frame.payload.writeCString(string);
        connection.sendFrame(frame);
    }

    @Override
    public int getId() {
        return id * 536889995;
    }

}