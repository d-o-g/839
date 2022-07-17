package com.jagex;

public class MobileSpotAnimation {

    public int graphic = 738188555;
    public int anInt6481;
    public int yTranslation;
    public int anInt6483;
    public Animator animator;

    MobileSpotAnimation(Mobile mobile) {
        animator = new EntityAnimator(mobile, false);
    }

    static final void method7911(Component component, Interface class221, ScriptExecutionContext script) {
        script.anInt7924 -= 195773364;
        component.basePositionX = script.anIntArray7942[1841827045 * script.anInt7924] * 2065256071;
        component.basePositionY = script.anIntArray7942[1 + script.anInt7924 * 1841827045] * -970876179;
        int i_0_ = script.anIntArray7942[script.anInt7924 * 1841827045 + 2];
        if (i_0_ < 0) {
            i_0_ = 0;
        } else if (i_0_ > 5) {
            i_0_ = 5;
        }
        int i_1_ = script.anIntArray7942[script.anInt7924 * 1841827045 + 3];
        if (i_1_ < 0) {
            i_1_ = 0;
        } else if (i_1_ > 5) {
            i_1_ = 5;
        }
        component.aByte2400 = (byte) i_0_;
        component.aByte2381 = (byte) i_1_;
        Component.redraw(component);
        Interface.method8775(class221, component);
        if (component.type * 1558474223 == 0) {
            Class548.method9327(class221, component, false);
        }
        if (-592186295 * component.index == -1 && !class221.closed) {
            PulseEvent.resetComponentPosition(1857819631 * component.uid);
        }
    }

}