package com.jagex;

class Class449 implements Interface37 {
    Class459 this$0;

    Class449(Class459 class459) {
        this$0 = class459;
    }

    static final void method7388(Mobile mobile) {
        Animator_Sub2 class650_sub2 = mobile.aClass650_Sub2_11525;
        if (class650_sub2.hasAnimation() && class650_sub2.method13465(1) && class650_sub2.method13461()) {
            if (class650_sub2.aBool10566) {
                class650_sub2.method13452(mobile.method17958().method8824(), false, true);
                class650_sub2.aBool10566 = class650_sub2.hasAnimation();
            }

            class650_sub2.method13463();
        }

        for (int i_0_ = 0; i_0_ < mobile.graphics.length; i_0_++) {
            if (-1 != -2008549027 * mobile.graphics[i_0_].graphic) {
                Animator animator = mobile.graphics[i_0_].animator;
                if (animator.method13515()) {
                    GraphicDefinition graphic = GraphicDefinition.loader.get(mobile.graphics[i_0_].graphic
                            * -2008549027);
                    Animation animation = animator.getAnimation();
                    if (graphic.aBool7986) {
                        if (3 == animation.animatingPrecedence * -999236133) {
                            if (135669775 * mobile.anInt11550 > 0 && mobile.anInt11560 * -589638007 <= Client.engineCycle
                                    && mobile.anInt11522 * -1506188915 < Client.engineCycle) {
                                animator.update(-1);
                                mobile.graphics[i_0_].graphic = 738188555;
                                continue;
                            }
                        } else if (animation.animatingPrecedence * -999236133 == 1 && 135669775 * mobile.anInt11550 > 0
                                && -589638007 * mobile.anInt11560 <= Client.engineCycle
                                && mobile.anInt11522 * -1506188915 < Client.engineCycle) {
                            continue;
                        }
                    }
                }
                if (animator.method13465(1) && animator.method13461()) {
                    animator.update(-1);
                    mobile.graphics[i_0_].graphic = 738188555;
                }
            }
        }
        Animator animator = mobile.animator;
        do {
            if (animator.hasAnimation()) {
                Animation animation = animator.getAnimation();
                if (3 == -999236133 * animation.animatingPrecedence) {
                    if (mobile.anInt11550 * 135669775 > 0 && mobile.anInt11560 * -589638007 <= Client.engineCycle
                            && -1506188915 * mobile.anInt11522 < Client.engineCycle) {
                        mobile.anIntArray11538 = null;
                        animator.update(-1);
                        break;
                    }
                } else if (-999236133 * animation.animatingPrecedence == 1) {
                    if (135669775 * mobile.anInt11550 > 0 && -589638007 * mobile.anInt11560 <= Client.engineCycle
                            && mobile.anInt11522 * -1506188915 < Client.engineCycle) {
                        animator.method13462(1);
                        break;
                    }
                    animator.method13462(0);
                }
                if (animator.method13465(1) && animator.method13461()) {
                    mobile.anIntArray11538 = null;
                    animator.update(-1);
                }
            }
        } while (false);
        for (int i_1_ = 0; i_1_ < mobile.aClass650_Sub1_Sub1Array11537.length; i_1_++) {
            EntityAnimator_Sub1_ class650_sub1_sub1 = mobile.aClass650_Sub1_Sub1Array11537[i_1_];

            if (class650_sub1_sub1 != null) {
                if (class650_sub1_sub1.anInt11454 * 1111156689 > 0) {
                    class650_sub1_sub1.anInt11454 -= 1509478705;
                } else if (class650_sub1_sub1.method13465(1) && class650_sub1_sub1.method13461()) {
                    mobile.aClass650_Sub1_Sub1Array11537[i_1_] = null;
                }
            }
        }
    }

    static final void loadInterface(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
        if (!Component.loadInterface(i, null)) {
            if (i_8_ != -1) {
                Client.validComponents[i_8_] = true;
            } else {
                for (int i_10_ = 0; i_10_ < 104; i_10_++) {
                    Client.validComponents[i_10_] = true;
                }
            }
        } else {
            Component.handleEvents(Class598.loadedInterfaces[i].getComponents(), -1, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_, i_8_,
                    i_8_ < 0);
        }
    }

    @Override
    public void method172(int i) {
        this$0.method7575(true);
    }

    @Override
    public void method233() {
        this$0.method7575(true);
    }

    @Override
    public void method98() {
        this$0.method7575(true);
    }

}