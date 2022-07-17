package com.jagex;

public class Class486 implements SceneEntityPredicate {
    public static ClanChannel aClass480_Sub33_6643;
    HighObject aClass600_Sub1_Sub3_Sub4_6642;

    Class486(HighObject class600_sub1_sub3_sub4) {
        aClass600_Sub1_Sub3_Sub4_6642 = class600_sub1_sub3_sub4;
    }

    static void method8247(ScriptExecutionContext class613, int i) {
        class613.anIntArray7942[class613.anInt7924 * 1841827045 - 2] = QuestDefinition.loader.get(
                class613.anIntArray7942[class613.anInt7924 * 1841827045 - 2]).method4385(
                PlayerFacade.instance, class613.anIntArray7942[1841827045 * class613.anInt7924 - 1],
                65280) ? 1 : 0;
        class613.anInt7924 -= 1122685165;
    }

    static final void method8248(ScriptExecutionContext class613, int i) {
        int i_0_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
        Class199.preferences.setValue(Class199.preferences.removeRoofs, i_0_);
        Class199.preferences.setValue(Class199.preferences.aClass632_Sub22_10284, i_0_);
        Class199.preferences.removeRoofs.validate();
        Class199.preferences.aClass632_Sub22_10284.validate();
        Class591.method9995();
        Client.savePreferences();
        Client.sentPreferences = false;
    }

    static final void method8249(ScriptExecutionContext class613) {
        class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
    }

    @Override
    public boolean test(SceneEntity class600_sub1_sub3, byte i) {
        return aClass600_Sub1_Sub3_Sub4_6642 == class600_sub1_sub3;
    }
}
