package com.jagex;

public class Class455 {
    public static Class455 aClass455_5110;
    public static Class455 aClass455_5111;
    public static Class455 aClass455_5112;
    public static Class455 aClass455_5113;
    public static Class455 aClass455_5114;
    public static Class455 aClass455_5116;
    public static Class455 aClass455_5117;
    public static Class455 aClass455_5119 = new Class455(1);
    static Class455 aClass455_5115 = new Class455(0);
    static Class455 aClass455_5118;
    static boolean aBool1126 = false;

    static {
        aClass455_5111 = new Class455(2);
        aClass455_5113 = new Class455(3);
        aClass455_5114 = new Class455(4);
        aClass455_5110 = new Class455(5);
        aClass455_5112 = new Class455(6);
        aClass455_5117 = new Class455(7);
        aClass455_5118 = new Class455(8);
        aClass455_5116 = new Class455(9);
    }

    public int anInt5120;

    Class455(int i) {
        anInt5120 = 1616608619 * i;
    }

    public static void method7424() {
        if (!Class455.aBool1126) {
            IdentikitDefinitionProvider.method5491(Client.scene.getGraph().tiles1,
                    1686714818);
            if (Client.scene.getGraph().tiles2 != null) {
                IdentikitDefinitionProvider.method5491(
                        Client.scene.getGraph().tiles2, 203300215);
            }
            Class455.aBool1126 = true;
        }
    }

    static final void method7419(ScriptExecutionContext class613) {
        class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Client.anInt10795 * 1661404635;
    }

    static final void method7420(ScriptExecutionContext class613, int i) {
        class613.anInt7924 -= -2049596966;
        int i_0_ = class613.anIntArray7942[class613.anInt7924 * 1841827045];
        int i_1_ = class613.anIntArray7942[class613.anInt7924 * 1841827045 + 1];
        class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = i_0_ & i_1_;
    }

    static boolean method7421(int i) {
        return i == 59 || i == 2 || 8 == i || 17 == i || i == 15 || i == 16 || i == 58;
    }

    static boolean loadingState(int i) {
        return 4 == i || i == 5 || 19 == i;
    }

    static final void method7423(ScriptExecutionContext class613, int i) {
        Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
        Component class226 = class611.aClass226_7914;
        int i_1_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
        int i_2_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] - 1;
        if (class226.modelType * 286135323 != 6) {
            throw new RuntimeException("");
        }
        NpcDefinition npcDefinition = NpcDefinition.loader.get(-643054127 * class226.modelId);
        if (class226.aClass267_2361 == null) {
            class226.aClass267_2361 = new Class267(npcDefinition, true);
        }
        class226.aClass267_2361.aLong2977 = Class36.method992() * 359135170314717883L;
        if (i_2_ < 0 || i_2_ >= npcDefinition.models.length) {
            throw new RuntimeException(new StringBuilder().append(i_2_).toString());
        }
        class226.aClass267_2361.models[i_2_] = i_1_;
        Component.redraw(class226);
    }
}
