package com.jagex;

public class Class572 {
    static final int anInt7652 = -1;
    static final int anInt7653 = 1;
    static final int anInt7656 = 2;
    public static int anInt7654;
    public static int anInt7657;
    static boolean aBool7655 = false;
    static int floorShadowsIndex;

    Class572() throws Throwable {
        throw new Error();
    }

    static final void method9669(ScriptExecutionContext class613, int i) {
        Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
        Component class226 = class611.aClass226_7914;
        Interface class221 = class611.aClass221_7913;
        ScriptExecutionContext.method3552(class226, class221, class613);
    }

    static final void method9670(ScriptExecutionContext class613, int i) {
        Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
        Component class226 = class611.aClass226_7914;
        ScriptExecutionContext.method5045(class226, class613, 2051232483);
    }

    static final void method9671(ScriptExecutionContext class613, int i) {
        class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -2033165835
                * SystemInformation.systemInfo.processorInfoInt < 512
                || Client.aBool10598 || Client.aBool10896 ? 1 : 0;
    }

    static final void method9672(ScriptExecutionContext class613, int i) {
        int i_0_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
        Component class226 = Component.lookup(i_0_);
        Interface class221 = Class598.loadedInterfaces[i_0_ >> 16];
        ScriptExecutionContext.method1069(class226, class221, class613);
    }

    static final String[] method9673(String[] strings, byte i) {
        String[] strings_1_ = new String[5];
        for (int i_2_ = 0; i_2_ < 5; i_2_++) {
            strings_1_[i_2_] = new StringBuilder().append(i_2_).append(" ").toString();
            if (strings != null && null != strings[i_2_]) {
                strings_1_[i_2_] = new StringBuilder().append(strings_1_[i_2_]).append(strings[i_2_]).toString();
            }
        }
        return strings_1_;
    }
}
