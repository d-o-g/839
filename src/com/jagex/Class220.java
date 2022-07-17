package com.jagex;

public class Class220 implements Identifiable {
    public static Class220 aClass220_2273;
    static Class220 aClass220_2272;
    static Class220 aClass220_2274 = new Class220(1, 0);

    static {
        aClass220_2273 = new Class220(0, 1);
        aClass220_2272 = new Class220(2, 2);
    }

    public int anInt2275;
    int id;

    Class220(int i, int i_0_) {
        anInt2275 = i * 1769124323;
        id = 123571521 * i_0_;
    }

    public static boolean method4154(int i) {
        for (MenuItem class480_sub31_sub17 = MenuItem.options.head(); null != class480_sub31_sub17; class480_sub31_sub17 = MenuItem.options
                .next()) {
            if (Class31.method905(-20536735 * class480_sub31_sub17.opcode)
                    && i == -1867655888037237139L * class480_sub31_sub17.primary) {
                return true;
            }
        }
        return false;
    }

    static Class220[] values() {
        return new Class220[]{aClass220_2273, aClass220_2274, aClass220_2272};
    }

    @Override
    public int getId() {
        return id * -102890815;
    }

}