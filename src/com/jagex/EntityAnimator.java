package com.jagex;

public class EntityAnimator extends Animator {
    SceneNode aClass600_Sub1_10550;

    EntityAnimator(SceneNode class600_sub1, boolean bool) {
        super(bool);
        aClass600_Sub1_10550 = class600_sub1;
    }

    static final void method16709(Component component, int i, byte[] is, byte[] is_1_, ScriptExecutionContext class613,
                                  int i_2_) {
        if (null == component.aByteArrayArray2549) {
            if (null != is) {
                component.aByteArrayArray2549 = new byte[11][];
                component.aByteArrayArray2467 = new byte[11][];
                component.anIntArray2466 = new int[11];
                component.anIntArray2488 = new int[11];
                component.anIntArray2380 = new int[11];
            } else {
                return;
            }
        }
        component.aByteArrayArray2549[i] = is;
        if (null != is) {
            component.visible = true;
        } else {
            component.visible = false;
            for (int i_3_ = 0; i_3_ < component.aByteArrayArray2549.length; i_3_++) {
                if (component.aByteArrayArray2549[i_3_] != null || component.anIntArray2380[i_3_] > 0) {
                    component.visible = true;
                    break;
                }
            }
        }
        component.aByteArrayArray2467[i] = is_1_;
    }

    @Override
    void method13467(Animation animation, int i) {
        TurnMobCutsceneAction.aClass186_9434.method3714(animation, i, aClass600_Sub1_10550);
    }

}