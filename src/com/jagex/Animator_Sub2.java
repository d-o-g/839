package com.jagex;

public class Animator_Sub2 extends Animator {

    public boolean aBool10566 = false;
    Mobile target;

    Animator_Sub2(Mobile class600_sub1_sub3_sub1, boolean bool) {
        super(bool);
        target = class600_sub1_sub3_sub1;
    }

    static final void method16744(ScriptExecutionContext class613) {
        class613.anInt7924 -= -2049596966;
        int i_1_ = class613.anIntArray7942[class613.anInt7924 * 1841827045];
        int i_2_ = class613.anIntArray7942[1 + 1841827045 * class613.anInt7924];
        if (null != Client.localPlayer.appearance) {
            Client.localPlayer.appearance.equip(ItemDefinition.loader, i_2_, i_1_);
        }
    }

    @Override
    void method13467(Animation animation, int i) {
        if (!aBool10566 || !target.animator.hasAnimation()
                || target.animator.method13515()) {
            TurnMobCutsceneAction.aClass186_9434.method3714(animation, i, target);
        }
    }
}
