package com.jagex;

public class CombatBar extends Entity {
    public int fillWidth;
    public int anInt10074;
    public int cycle;
    public int anInt10076;

    CombatBar(int i, int i_4_, int i_5_, int i_6_) {
        anInt10076 = 496695 * i;
        cycle = i_4_ * 1497593843;
        fillWidth = -943116809 * i_5_;
        anInt10074 = i_6_ * -240240675;
    }

    void method15609(int i, int i_0_, int i_1_, int i_2_) {
        anInt10076 = i * 496695;
        cycle = i_0_ * 1497593843;
        fillWidth = -943116809 * i_1_;
        anInt10074 = -240240675 * i_2_;
    }
}
