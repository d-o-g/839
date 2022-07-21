package com.jagex;

public class Orientation {

    public int value;
    int step;

    static void method814(int i, int i_13_, int i_14_, int i_15_) {
        if (i == 1008) {
            ScriptExecutionContext.method6991(Class520.aClass520_7183, i_13_, i_14_);
        } else if (i == 1009) {
            ScriptExecutionContext.method6991(Class520.aClass520_7179, i_13_, i_14_);
        } else if (i == 1010) {
            ScriptExecutionContext.method6991(Class520.aClass520_7173, i_13_, i_14_);
        } else if (1011 == i) {
            ScriptExecutionContext.method6991(Class520.aClass520_7177, i_13_, i_14_);
        } else if (1012 == i) {
            ScriptExecutionContext.method6991(Class520.aClass520_7190, i_13_, i_14_);
        }
    }

    static void renderHintArrowsOnMinimap(int i, int i_16_, Component class226, Class211 class211, int i_17_, int i_18_, int i_19_) {
        HintArrow[] hintArrows = Client.hintArrows;
        for (HintArrow hintArrow : hintArrows) {
            if (null != hintArrow && -335735335 * hintArrow.type != 0 && Client.engineCycle % 20 < 10) {
                if (1 == -335735335 * hintArrow.type) {
                    ObjectNode class480_sub25 = Client.npcTable.get(1326506857 * hintArrow.targetIndex);
                    if (null != class480_sub25) {
                        Npc class600_sub1_sub3_sub1_sub2 = (Npc) class480_sub25.referent;
                        Vector3f vector3f = class600_sub1_sub3_sub1_sub2.getCoordinateSpace().translation;
                        int i_21_ = (int) vector3f.x / 128 - i / 128;
                        int i_22_ = (int) vector3f.z / 128 - i_16_ / 128;
                        StaticGameObject.method18054(class226, class211, i_17_, i_18_, i_21_, i_22_, -1698639133
                                * hintArrow.id, 360000L);
                    }
                }
                if (-335735335 * hintArrow.type == 2) {
                    int i_23_ = hintArrow.x * 1671278425 / 128 - i / 128;
                    int i_24_ = hintArrow.z * -1900171419 / 128 - i_16_ / 128;
                    long l = hintArrow.anInt1121 * -985121683 << 7;
                    l *= l;
                    StaticGameObject.method18054(class226, class211, i_17_, i_18_, i_23_, i_24_, hintArrow.id
                            * -1698639133, l);
                }
                if (-335735335 * hintArrow.type == 10 && hintArrow.targetIndex * 1326506857 >= 0
                        && 1326506857 * hintArrow.targetIndex < Client.players.length) {
                    Player class600_sub1_sub3_sub1_sub1 = Client.players[1326506857 * hintArrow.targetIndex];
                    if (null != class600_sub1_sub3_sub1_sub1) {
                        Vector3f vector3f = class600_sub1_sub3_sub1_sub1.getCoordinateSpace().translation;
                        int i_25_ = (int) vector3f.x / 128 - i / 128;
                        int i_26_ = (int) vector3f.z / 128 - i_16_ / 128;
                        StaticGameObject.method18054(class226, class211, i_17_, i_18_, i_25_, i_26_, -1698639133
                                * hintArrow.id, 360000L);
                    }
                }
            }
        }
    }

    static void method816(Toolkit toolkit, Deque class644, int i, int i_27_) {
        Class208.aClass644_2168.clear();
        if (!Class495_Sub1.aBool10328) {
            for (Class480_Sub37 class480_sub37 = (Class480_Sub37) class644.head(); class480_sub37 != null; class480_sub37 = (Class480_Sub37) class644
                    .next()) {
                Class224 class224 = (Class224) Class495.aClass678_Sub8_6803.get(818539827 * class480_sub37.id);
                if (Class360.method6048(class224)) {
                    boolean bool = Class578.method9812(toolkit, class480_sub37, class224, i, i_27_);
                    if (bool) {
                        QuestDefinitionProvider.method4613(toolkit, class480_sub37, class224);
                    }
                }
            }
        }
    }

    public boolean pulse(int target, int minimumChange, int maximumStep) {
        int initialStep = step * 1332187163;
        if (target == 2069603133 * value && 1332187163 * step == 0) {
            return false;
        }

        boolean reached;
        if (0 == step * 1332187163) {
            if (target > 2069603133 * value && target <= 2069603133 * value + minimumChange
                    || target < 2069603133 * value && target >= 2069603133 * value - minimumChange) {
                value = target * 326355989;
                return false;
            }

            reached = true;
        } else if (step * 1332187163 > 0 && target > value * 2069603133) {
            int change = step * 1332187163 * step * 1332187163 / (2 * minimumChange);
            int adjusted = value * 2069603133 + change;
            reached = !(adjusted >= target || adjusted < value * 2069603133);
        } else if (step * 1332187163 < 0 && target < 2069603133 * value) {
            int change = step * 1332187163 * 1332187163 * step / (minimumChange * 2);
            int adjusted = 2069603133 * value - change;
            reached = !(adjusted <= target || adjusted > 2069603133 * value);
        } else {
            reached = false;
        }

        if (reached) {
            if (target > value * 2069603133) {
                step += -1300116973 * minimumChange;

                if (maximumStep != 0 && 1332187163 * step > maximumStep) {
                    step = -1300116973 * maximumStep;
                }
            } else {
                step -= minimumChange * -1300116973;

                if (0 != maximumStep && step * 1332187163 < -maximumStep) {
                    step = -1300116973 * -maximumStep;
                }
            }

            if (1332187163 * step != initialStep) {
                int change = 1332187163 * step * 1332187163 * step / (2 * minimumChange);

                if (target > value * 2069603133) {
                    if (2069603133 * value + change > target) {
                        step = -1300116973 * initialStep;
                    }
                } else if (target < 2069603133 * value && 2069603133 * value - change < target) {
                    step = initialStep * -1300116973;
                }
            }
        } else if (1332187163 * step > 0) {
            step -= minimumChange * -1300116973;

            if (1332187163 * step < 0) {
                step = 0;
            }
        } else {
            step += -1300116973 * minimumChange;

            if (1332187163 * step > 0) {
                step = 0;
            }
        }

        value += 326355989 * (initialStep + 1332187163 * step >> 1);
        return reached;
    }

    public int value() {
        return 2069603133 * value & 0x3fff;
    }

    public void normalize() {
        value = (2069603133 * value & 0x3fff) * 326355989;
    }

    public void update(int value) {
        this.value = value * 326355989;
        step = 0;
    }

}