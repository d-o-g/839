package com.jagex;

public class Class382_Sub2_Sub1 extends Class382_Sub2 {
    byte[] aByteArray11193;

    Class382_Sub2_Sub1() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @Override
    void method15439(int i, byte i_2_) {
        int i_3_ = i * 2;
        int i_4_ = i_2_ & 0xff;
        aByteArray11193[i_3_++] = (byte) (3 * i_4_ >> 5);
        aByteArray11193[i_3_] = (byte) (3 * i_4_ >> 5);
    }

    byte[] method17534(int i, int i_0_, int i_1_) {
        aByteArray11193 = new byte[i * i_0_ * i_1_ * 2];
        method6251(i, i_0_, i_1_);
        return aByteArray11193;
    }

}