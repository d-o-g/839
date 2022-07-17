package com.jagex;

public class Class480_Sub21_Sub2 extends Class480_Sub21 {
    byte aByte11166;
    int anInt11167;
    int anInt11168;
    String aString11169;

    Class280 this$0;

    Class480_Sub21_Sub2(Class280 class280) {
        this$0 = class280;
        anInt11168 = -1465157993;
    }

    @Override
    void method15947(Buffer buffer) {
        anInt11168 = buffer.readUShort() * 1465157993;
        aByte11166 = buffer.readByte();
        anInt11167 = buffer.readUShort() * 78941123;
        buffer.readLong();
        aString11169 = buffer.readString();
    }

    @Override
    void method15948(ClanChannel class480_sub33) {
        ClanMember class283 = class480_sub33.aClass283Array10233[anInt11168 * -608921895];
        class283.rank = aByte11166;
        class283.world = anInt11167 * -461729475;
        class283.name = aString11169;
    }

}