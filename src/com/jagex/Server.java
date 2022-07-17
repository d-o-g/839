package com.jagex;

public abstract class Server {

    static final int anInt7550 = 8;
    static final int anInt7551 = 2;
    static final int anInt7552 = 4;
    static final int anInt7556 = 1;

    public int population;
    public int mask;

    int anInt7555;

    Server() {

    }

    static final void method9476(ScriptExecutionContext class613) {
        int i_0_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
        Class224 class224 = (Class224) Queue.aClass678_Sub8_8139.get(i_0_);
        class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class224.anInt2303 * 1606761481;
    }

    static boolean method9477(Component class226, int i) {
        Class480_Sub16 class480_sub16 = Client.method17050(class226);
        if (class480_sub16.method15634(493408954) > 0) {
            return true;
        }
        if (class480_sub16.method15630(1754788389)) {
            return true;
        }
        return class226.parent != null;
    }

    public boolean method9466(byte i) {
        return 0 != (-1833179177 * mask & 0x4);
    }

    public boolean method9467(int i) {
        return (mask * -1833179177 & 0x2) != 0;
    }

    public boolean method9468(int i) {
        return 0 != (mask * -1833179177 & 0x8);
    }

    public boolean method9475(byte i) {
        return (mask * -1833179177 & 0x1) != 0;
    }
}
