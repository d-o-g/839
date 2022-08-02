package com.jagex;

public class DynamicGameObject extends SceneEntity implements SceneObject {
    boolean aBool11604;
    Model model;
    Class498 aClass498_11606;
    byte aByte11607;
    ObjectDefinitionLoader loader;
    byte aByte11609;
    int id;
    boolean aBool11611;
    boolean aBool11612;
    boolean aBool11613;
    Shadow shadow;
    boolean aBool11615;
    public DynamicGameObject(SceneGraph sceneGraph, Toolkit toolkit, ObjectDefinitionLoader loader,
                             ObjectDefinition definition, int i, int i_9_, int i_10_, int i_11_, int i_12_, boolean bool, int i_13_,
                             int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, boolean bool_19_, boolean bool_20_) {
        super(sceneGraph, i, i_9_, i_10_, i_11_, i_12_, i_13_, i_14_, i_15_, i_16_, 1 == 36878635 * definition.itemSupport,
                ObjectCategory.method6714(i_17_, i_18_));
        this.loader = loader;
        id = definition.id2 * 1978328041;
        collisionPlane = (byte) i_9_;
        aBool11611 = bool;
        aByte11609 = (byte) i_17_;
        aByte11607 = (byte) i_18_;
        aBool11612 = 0 != -1893691057 * definition.type && !bool;
        aBool11613 = bool_19_;
        aBool11604 = toolkit.method2820() && definition.aBool7383 && !aBool11611
                && Class199.preferences.sceneryShadows.getValue() != 0;
        aBool11615 = bool_20_;

        int i_21_ = 2048;
        if (aBool11613) {
            i_21_ |= 0x10000;
        }
        if (definition.aBool7417) {
            i_21_ |= 0x80000;
        }

        Pair<Model, Shadow> pair = method18073(toolkit, i_21_, aBool11604);
        if (pair != null) {
            model = pair.left;
            shadow = pair.right;

            if (aBool11613 || definition.aBool7417) {
                model = model.method2890((byte) 0, i_21_, false);

                if (definition.aBool7417) {
                    Class450 class450 = Client.scene.method7683();
                    model.recolor(-179051851 * class450.anInt5076, 428317419 * class450.anInt5075,
                            class450.anInt5074 * 1542605459, class450.anInt5077 * -1012034355);
                }
            }
        }

        method16274(1);
    }

    public static void method18082(int i, int i_22_, int i_23_, int i_24_) {
        Class533.aLinkedList7260.addLast(new Class522(i, i_22_, i_23_ - i, i_24_ - i_22_));
    }

    static Class272 method18083(int i) {
        if (i == 818944887 * Class272.aClass272_3006.anInt3005) {
            return Class272.aClass272_3006;
        }
        if (818944887 * Class272.aClass272_3007.anInt3005 == i) {
            return Class272.aClass272_3007;
        }
        return null;
    }

    @Override
    public Class498 method16293(Toolkit toolkit) {
        Vector3f vector3f = getCoordinateSpace().translation;
        if (aClass498_11606 == null) {
            aClass498_11606 = Class498.create((int) vector3f.x, (int) vector3f.y, (int) vector3f.z,
                    method18072(toolkit, 0));
        }
        return aClass498_11606;
    }

    @Override
    public int getStartY() {
        return model != null ? model.minimumY() : 0;
    }

    @Override
    public int getId() {
        return 2076385829 * id;
    }

    public int method18074(int i) {
        return model != null ? model.method2920() / 4 : 15;
    }

    @Override
    public boolean method212() {
        return aBool11604;
    }

    @Override
    public boolean method244() {
        return aBool11615;
    }

    @Override
    public int getType() {
        return aByte11609;
    }

    @Override
    public void method335() {
        if (null != model) {
            model.method3045();
        }
    }

    @Override
    public boolean shadow() {
        return aBool11604;
    }

    @Override
    public boolean method363() {
        return aBool11615;
    }

    @Override
    public void renderShadow(Toolkit toolkit) {
        Shadow shadow;
        if (null == this.shadow && aBool11604) {
            Pair<Model, Shadow> pair = method18073(toolkit, 262144, true);
            shadow = pair != null ? pair.right : null;
        } else {
            shadow = this.shadow;
            this.shadow = null;
        }

        Vector3f vector3f = getCoordinateSpace().translation;
        if (shadow != null) {
            graph.method8362(shadow, collisionPlane, (int) vector3f.x, (int) vector3f.z, null);
        }
    }

    @Override
    public void method365(Toolkit toolkit) {
        Shadow shadow;
        if (null == this.shadow && aBool11604) {
            Pair<Model, Shadow> pair = method18073(toolkit, 262144, true);
            shadow = pair != null ? pair.right : null;
        } else {
            shadow = this.shadow;
            this.shadow = null;
        }

        Vector3f vector3f = getCoordinateSpace().translation;
        if (null != shadow) {
            graph.method8338(shadow, collisionPlane, (int) vector3f.x, (int) vector3f.z, null);
        }
    }

    @Override
    public void method372() {
        if (null != model) {
            model.method3045();
        }
    }

    @Override
    public int getOrientation() {
        return aByte11607;
    }

    @Override
    public int method48() {
        return 2076385829 * id;
    }

    @Override
    boolean method16257(Toolkit toolkit, int i, int i_3_) {
        Class379 class379 = loader.get(id * 2076385829).aClass379_7439;
        if (class379 != null) {
            return toolkit.method2445(i, i_3_, updateAndGetMatrix(), class379);
        }
        Model model = method18072(toolkit, 131072);
        if (model != null) {
            Matrix4x3 class405 = updateAndGetMatrix();
            return model.method2918(i, i_3_, class405, false, 0);
        }
        return false;
    }

    @Override
    boolean isTextured() {
        if (model != null) {
            return !model.isTextured();
        }
        return true;
    }

    @Override
    boolean isCached() {
        if (null != model) {
            return model.method2939();
        }
        return false;
    }

    @Override
    void method16262(Toolkit toolkit, SceneNode class600_sub1, int i, int i_5_, int i_6_, boolean bool, int i_7_) {
        if (class600_sub1 instanceof DynamicBoundary) {
            DynamicBoundary class600_sub1_sub5_sub1 = (DynamicBoundary) class600_sub1;
            if (null != model && class600_sub1_sub5_sub1.model != null) {
                model.method2944(class600_sub1_sub5_sub1.model, i, i_5_, i_6_, bool);
            }
        } else if (class600_sub1 instanceof DynamicGameObject) {
            DynamicGameObject class600_sub1_sub3_sub3_8_ = (DynamicGameObject) class600_sub1;
            if (null != model && class600_sub1_sub3_sub3_8_.model != null) {
                model.method2944(class600_sub1_sub3_sub3_8_.model, i, i_5_, i_6_, bool);
            }
        }
    }

    @Override
    void method16263() {
        aBool11613 = false;
        if (null != model) {
            model.updateFunctionMask(model.functionMask() & ~0x10000);
        }
    }

    @Override
    void method16265(Toolkit toolkit) {

    }

    @Override
    MouseOverEntity method16271(Toolkit toolkit) {
        if (null == model) {
            return null;
        }

        Matrix4x3 class405 = updateAndGetMatrix();
        MouseOverEntity class506 = MouseOverEntity.method570(aBool11612);
        Class379 class379 = loader.get(id * 2076385829).aClass379_7439;

        if (class379 != null) {
            model.method2917(class405, null, 0);
            toolkit.method2447(class405, class139Array[0], class379);
        } else {
            model.method2917(class405, class139Array[0], 0);
        }

        return class506;
    }

    @Override
    boolean method16302() {
        return aBool11613;
    }

    Model method18072(Toolkit toolkit, int i) {
        if (model != null && toolkit.method2637(model.functionMask(), i) == 0) {
            return model;
        }
        Pair<Model, Shadow> pair = method18073(toolkit, i, false);
        if (null != pair) {
            return pair.left;
        }
        return null;
    }

    Pair<Model, Shadow> method18073(Toolkit toolkit, int i, boolean bool) {
        ObjectDefinition definition = loader.get(id * 2076385829);
        SceneGraphLevel class120;
        SceneGraphLevel class120_2_;

        if (aBool11611) {
            class120 = graph.levels0[collisionPlane];
            class120_2_ = graph.levels[0];
        } else {
            class120 = graph.levels[collisionPlane];
            if (collisionPlane < 3) {
                class120_2_ = graph.levels[1 + collisionPlane];
            } else {
                class120_2_ = null;
            }
        }

        Vector3f vector3f = getCoordinateSpace().translation;
        return definition.getModelAndShadow(toolkit, i,
                aByte11609 != ObjectCategory.aClass541_7357.type * -1050493863 ? (int) aByte11609 : -1050493863
                        * ObjectCategory.aClass541_7338.type, aByte11609 == -1050493863
                        * ObjectCategory.aClass541_7357.type ? aByte11607 + 4 : aByte11607, class120, class120_2_,
                (int) vector3f.x, (int) vector3f.y, (int) vector3f.z, bool, null);
    }

}