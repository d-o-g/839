package com.jagex;

import java.io.File;

public class Class637 implements Identifiable {
    public static Class637 aClass637_8129;
    public static Class637 aClass637_8130 = new Class637(-2);
    public static Class637 aClass637_8133 = new Class637(-3);
    static Class637 aClass637_8131;
    static Class637 aClass637_8132;
    static Class637 aClass637_8134;
    static File aFile8136;

    static {
        aClass637_8131 = new Class637(2);
        aClass637_8129 = new Class637(3);
        aClass637_8132 = new Class637(21);
        aClass637_8134 = new Class637(20);
    }

    int anInt8135;

    Class637(int i) {
        anInt8135 = -1871265429 * i;
    }

    public static final void method13160(int i) {
        for (int i_1_ = 0; i_1_ < 5; i_1_++) {
            Client.aBoolArray10873[i_1_] = false;
        }
        Client.anInt10620 = 1980304975;
        Client.anInt10722 = -1338730263;
        Class525.anInt7217 = 0;
        BefriendedPlayer.anInt576 = 0;
        TurnMobCutsceneAction.anInt9433 = -1490979241;
        Class156.anInt1886 = -1672889529;
        Client.mapState = 442919637 * i;
        if (Client.mapState * 1212513917 != 3) {
            Class171.aLong1960 = 0L;
        }
    }

    public static Class637[] values() {
        return new Class637[]{aClass637_8131, aClass637_8129, aClass637_8133, aClass637_8134, aClass637_8132,
                aClass637_8130};
    }

    @Override
    public int getId() {
        return -786603197 * anInt8135;
    }
}
