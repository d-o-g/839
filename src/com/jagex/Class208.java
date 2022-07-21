package com.jagex;

public final class Class208 {
    static final String aString2167 = "#";
    static Deque aClass644_2168;

    Class208() throws Throwable {
        throw new Error();
    }

    static final void method3994(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
        HintArrow[] hintArrows = Client.hintArrows;
        for (HintArrow hintArrow : hintArrows) {
            if (hintArrow != null && hintArrow.type * -335735335 == 2) {
                Class42.method1043(
                        hintArrow.level * 407489623,
                        hintArrow.x * 1671278425,
                        hintArrow.z * -1900171419,
                        0,
                        hintArrow.heightOffset * -768979482,
                        false,
                        false
                );
                if (Client.aFloatArray10736[0] > -1.0F && Client.engineCycle % 20 < 10) {
                    Sprite class116 = Sprite.headicons[-1698639133 * hintArrow.id];
                    int i_8_ = (int) (Client.aFloatArray10736[0] + i - 12.0F);
                    int i_9_ = (int) (i_1_ + Client.aFloatArray10736[1] - 28.0F);
                    class116.method2079(i_8_, i_9_);
                }
            }
        }
    }

    static void method3995() {
        if (Class248.method4641()) {
            if (Class65.consoleMessages == null) {
                Class526.initConsole();
            }
            Class65.aBool1012 = true;
            Class65.anInt1011 = 0;
        }
    }

}