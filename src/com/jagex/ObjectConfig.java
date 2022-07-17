package com.jagex;

public class ObjectConfig {

    public static int recoverySetDate;
    SceneNode entity;
    int orientation;
    boolean aBool6592;
    ObjectDefinitionLoader loader;
    int anInt6594;
    Shadow shadow;
    boolean aBool6596 = false;
    int object;
    Animator animator;
    Animator animator1;
    int anInt6600;
    int anInt6601 = -1219546649;
    Model model;
    boolean aBool6603;
    boolean aBool6604;
    int anInt6605 = 0;
    byte aByte6606;
    boolean[] aBoolArray6607;
    ParticleSystem particles;
    Class540 aClass540_6609;

    ObjectConfig(Toolkit toolkit, ObjectDefinitionLoader loader, ObjectDefinition definition, int i, int i_4_, int i_5_,
                 SceneNode entity, boolean bool, int i_6_, int i_7_) {
        this.loader = loader;
        object = -740390991 * definition.id2;
        anInt6594 = i * -441508725;
        orientation = i_4_ * 1376102329;
        this.entity = entity;
        aBool6603 = i_6_ != -1;
        aByte6606 = (byte) i_5_;
        aBool6596 = bool;
        aBool6592 = toolkit.method2820() && definition.aBool7383 && !aBool6596;
        animator = new EntityAnimator(entity, false);
        method8191(false, i_6_, 1, aBool6603 ? i_7_ : 0);
    }

    public static int[] method8209(int i, int i_19_, int i_20_, int i_21_, int i_22_, float f, boolean bool) {
        int[] is = new int[i];
        Class480_Sub40_Sub1 class480_sub40_sub1 = new Class480_Sub40_Sub1();
        class480_sub40_sub1.anInt11441 = i_19_ * 1690326339;
        class480_sub40_sub1.aBool11448 = bool;
        class480_sub40_sub1.anInt11442 = i_20_ * 2005410763;
        class480_sub40_sub1.anInt11445 = 1480267487 * i_21_;
        class480_sub40_sub1.anInt11446 = i_22_ * -407558729;
        class480_sub40_sub1.anInt11447 = (int) (4096.0F * f) * 1254205369;
        class480_sub40_sub1.method17902();
        Class12.method656(i, 1);
        class480_sub40_sub1.method17899(0, is);
        return is;
    }

    public void method8199(int animation, int i_14_) {
        animator1 = null;
        if (i_14_ > 0) {
            animator1 = new EntityAnimator(entity, false);
            animator1.method13453(animation, i_14_, 1, false);
        } else {
            aBool6603 = true;
            method8191(false, animation, 1, 0);
        }
    }

    void method8172(Toolkit toolkit) {
        if (null != shadow) {
            Vector3f vector3f = entity.getCoordinateSpace().translation;
            Client.scene.getGraph().method8338(shadow, aByte6606, (int) vector3f.x,
                    (int) vector3f.z, aBoolArray6607);
            aBoolArray6607 = null;
            shadow = null;
        }
    }

    int method8173() {
        return 957113349 * anInt6605;
    }

    void method8174(Class540 class540) {
        aClass540_6609 = class540;
        model = null;
    }

    int method8175() {
        return -method8173();
    }

    void method8176(SceneNode class600_sub1) {
        if (null != animator1 && animator1.hasAnimation()) {
            animator1.method13465(Client.engineCycle - 861512471 * anInt6600);
            if (!animator1.method13515()) {
                animator = animator1;
                aBool6603 = true;
                anInt6600 = Client.engineCycle * 1262470311;
                return;
            }
        }
        if (animator.hasAnimation()) {
            if (animator.method13465(Client.engineCycle - anInt6600 * 861512471)) {
                if (Class199.preferences.sceneryShadows.getValue() == 2) {
                    aBool6604 = false;
                }
                if (animator.method13461()) {
                    animator.update(-1);
                    aBool6603 = false;
                    method8191(false, -1, 0, 0);
                }
            }
        } else {
            method8191(false, -1, 0, 0);
        }
        anInt6600 = Client.engineCycle * 1262470311;
    }

    boolean method8179() {
        return aBool6592;
    }

    void method8180(Toolkit toolkit) {
        method8201(toolkit, 262144, true, true);
    }

    void method8184(Toolkit toolkit, Model model, Matrix4x3 class405, int i, int i_0_, int i_1_, int i_2_, boolean bool) {
        Class145[] class145s = model.method2942();
        Class115[] class115s = model.method2943();

        if ((particles == null || particles.stopped) && (class145s != null || null != class115s)) {
            ObjectDefinition definition = loader.get(-38386243 * object);
            if (definition.morphisms != null) {
                definition = definition.transform(PlayerFacade.instance,
                        1 == Client.cutsceneStatus * 2087248539 ? Class163.anInterface12_1911
                                : PlayerFacade.instance);
            }

            if (null != definition) {
                particles = ParticleSystem.create(Client.engineCycle, true);
            }
        }
        if (particles != null) {
            model.method3063(class405);

            if (bool) {
                particles.method9488(toolkit, Client.engineCycle, class145s, class115s, false);
            } else {
                particles.method9487(Client.engineCycle);
            }

            particles.method9485(aByte6606, i, i_0_, i_1_, i_2_);
        }
    }

    void method8191(boolean bool, int i, int i_8_, int i_9_) {
        int i_11_ = i;
        boolean bool_12_ = false;
        if (i_11_ == -1) {
            ObjectDefinition definition = loader.get(object * -38386243);
            ObjectDefinition original = definition;
            if (null != definition.morphisms) {
                definition = definition.transform(PlayerFacade.instance,
                        2087248539 * Client.cutsceneStatus == 1 ? Class163.anInterface12_1911
                                : PlayerFacade.instance);
            }

            if (null == definition) {
                return;
            }

            if (original == definition) {
                original = null;
            }

            if (definition.method9252()) {
                if (!definition.aBool7398 || Class199.preferences.aClass632_Sub11_10264.getValue() == 1) {
                    if (bool && animator.hasAnimation() && definition.method9261(animator.getAnimationId())) {
                        return;
                    } else if (anInt6601 * 1269476905 != definition.id2 * -894246227) {
                        bool_12_ = definition.aBool7434;
                    }

                    i_11_ = definition.method9269();

                    if (definition.method9253()) {
                        i_8_ = 0;
                    } else {
                        i_8_ = 1;
                    }
                }
            } else if (original != null && original.method9252()
                    && (!original.aBool7398 || Class199.preferences.aClass632_Sub11_10264.getValue() == 1)) {
                if (bool && animator.hasAnimation() && original.method9261(animator.getAnimationId())) {
                    return;
                }

                if (-894246227 * definition.id2 != 1269476905 * anInt6601) {
                    bool_12_ = original.aBool7434;
                }
                i_11_ = original.method9269();

                if (original.method9253()) {
                    i_8_ = 0;
                } else {
                    i_8_ = 1;
                }
            }
        }

        if (i_11_ == -1) {
            animator.method13451(-1, false);
        } else {
            animator.method13453(i_11_, i_9_, i_8_, bool_12_);
            anInt6600 = 1262470311 * Client.engineCycle;
            aBool6604 = false;
            model = null;
        }
    }

    final Model method8201(Toolkit toolkit, int i, boolean bool, boolean bool_16_) {
        ObjectDefinition definition = loader.get(object * -38386243);
        if (definition.morphisms != null) {
            definition = definition.transform(PlayerFacade.instance,
                    1 == Client.cutsceneStatus * 2087248539 ? Class163.anInterface12_1911
                            : PlayerFacade.instance);
        }

        if (null == definition) {
            method8172(toolkit);
            anInt6601 = -1219546649;
            return null;
        } else if (!aBool6603 && definition.id2 * -894246227 != anInt6601 * 1269476905) {
            method8191(true, -1, 0, 0);
            aBool6604 = false;
            model = null;
        }

        method8176(entity);
        if (bool_16_) {
            bool_16_ = bool_16_ & aBool6592 & !aBool6604 & Class199.preferences.sceneryShadows.getValue() != 0;
        }

        if (bool && !bool_16_) {
            anInt6601 = 1020221669 * definition.id2;
            return null;
        }

        Vector3f vector3f = entity.getCoordinateSpace().translation;
        SceneGraph sceneGraph = Client.scene.getGraph();
        if (bool_16_) {
            sceneGraph.method8338(shadow, aByte6606, (int) vector3f.x, (int) vector3f.z,
                    aBoolArray6607);
            aBool6604 = false;
        }

        SceneGraphLevel class120 = sceneGraph.levels1[aByte6606];
        SceneGraphLevel class120_18_;

        if (aBool6596) {
            class120_18_ = sceneGraph.levels[0];
        } else {
            class120_18_ = aByte6606 < 3 ? sceneGraph.levels1[1 + aByte6606] : null;
        }

        Model model = null;
        if (animator.hasAnimation()) {
            if (bool_16_) {
                i |= 0x40000;
            }

            model = definition.getModel(toolkit, i, 11 != 126053155 * anInt6594 ? anInt6594 * 126053155 : 10,
                    11 == anInt6594 * 126053155 ? -1400492407 * orientation + 4 : -1400492407 * orientation, class120,
                    class120_18_, (int) vector3f.x, class120.averageHeightAt((int) vector3f.x, (int) vector3f.z),
                    (int) vector3f.z, animator, aClass540_6609, -1029511885);
            if (null != model) {
                if (bool_16_) {
                    if (aBoolArray6607 == null) {
                        aBoolArray6607 = new boolean[4];
                    }

                    shadow = model.method3018(shadow);
                    sceneGraph.method8362(shadow, aByte6606, (int) vector3f.x, (int) vector3f.z,
                            aBoolArray6607);
                    aBool6604 = true;
                }

                anInt6605 = model.minimumY() * -97466163;
                model.method3016();
            } else {
                aBoolArray6607 = null;
                shadow = null;
                anInt6605 = 0;
            }
            this.model = null;
        } else if (this.model == null || (this.model.functionMask() & i) != i
                || 1269476905 * anInt6601 != definition.id2 * -894246227) {
            if (this.model != null) {
                i |= this.model.functionMask();
            }

            Pair class674 = definition.getModelAndShadow(toolkit, i,
                    anInt6594 * 126053155 != 11 ? 126053155 * anInt6594 : 10, 11 == anInt6594 * 126053155 ? 4
                            + -1400492407 * orientation : orientation * -1400492407, class120, class120_18_,
                    (int) vector3f.x, class120.averageHeightAt((int) vector3f.x, (int) vector3f.z), (int) vector3f.z,
                    bool_16_, aClass540_6609);
            if (class674 != null) {
                this.model = model = (Model) class674.left;
                if (bool_16_) {
                    shadow = (Shadow) class674.right;
                    aBoolArray6607 = null;
                    sceneGraph.method8362(shadow, aByte6606, (int) vector3f.x, (int) vector3f.z,
                            null);
                    aBool6604 = true;
                }
                anInt6605 = model.minimumY() * -97466163;
                model.method3016();
            } else {
                aBoolArray6607 = null;
                shadow = null;
                this.model = null;
                anInt6605 = 0;
            }
        } else {
            model = this.model;
        }

        anInt6601 = 1020221669 * definition.id2;
        return model;
    }

    ObjectDefinition method8206() {
        return loader.get(-38386243 * object);
    }

}