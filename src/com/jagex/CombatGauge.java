package com.jagex;

public class CombatGauge extends Entity {
    public HitbarDefinition hitbar;
    EntityList<CombatBar> barList = new EntityList<CombatBar>();

    public CombatGauge(HitbarDefinition hitbar) {
        this.hitbar = hitbar;
    }

    public static Class630 method15580(byte i) {
        if (null == Class34.aClass630_449) {
            return Class630.aClass630_8058;
        }
        return Class34.aClass630_449;
    }

    static final int method15582(int i, int i_9_, int i_10_, byte i_11_) {
        if (i_9_ == i) {
            return i;
        }
        int i_12_ = 128 - i_10_;
        int i_13_ = (i & 0x7f) * i_12_ + (i_9_ & 0x7f) * i_10_ >> 7;
        int i_14_ = i_10_ * (i_9_ & 0x380) + i_12_ * (i & 0x380) >> 7;
        int i_15_ = (i & 0xfc00) * i_12_ + (i_9_ & 0xfc00) * i_10_ >> 7;
        return i_15_ & 0xfc00 | i_14_ & 0x380 | i_13_ & 0x7f;
    }

    public boolean isEmpty() {
        return barList.isEmpty();
    }

    public void method15578(int i, int i_0_, int i_1_, int i_2_) {
        CombatBar combatBar = null;
        int index = 0;
        for (CombatBar health_Bar_ = barList.head(); health_Bar_ != null; health_Bar_ = barList
                .next()) {
            index++;

            if (i == health_Bar_.anInt10076 * 233333127) {
                health_Bar_.method15609(i, i_0_, i_1_, i_2_);
                return;
            } else if (233333127 * health_Bar_.anInt10076 <= i) {
                combatBar = health_Bar_;
            }
        }

        if (combatBar == null) {
            if (index < Client.playerDefaults.anInt7592 * -1142545955) {
                barList.add(new CombatBar(i, i_0_, i_1_, i_2_));
            }
        } else {
            Class122.insertBefore(new CombatBar(i, i_0_, i_1_, i_2_), combatBar);
            if (index >= -1142545955 * Client.playerDefaults.anInt7592) {
                barList.head().unlink();
            }
        }
    }

    public CombatBar method15579(int i) {
        CombatBar combatBar = barList.head();
        if (null == combatBar || combatBar.anInt10076 * 233333127 > i) {
            return null;
        }

        for (CombatBar health_Bar_7_ = barList.next(); null != health_Bar_7_
                && 233333127 * health_Bar_7_.anInt10076 <= i; health_Bar_7_ = barList.next()) {
            combatBar.unlink();
            combatBar = health_Bar_7_;
        }

        if (combatBar.anInt10074 * 1750521973 + combatBar.anInt10076 * 233333127 + -946624537
                * hitbar.anInt7204 > i) {
            return combatBar;
        }

        combatBar.unlink();
        return null;
    }

}