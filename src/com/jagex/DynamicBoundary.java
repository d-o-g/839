package com.jagex;

public class DynamicBoundary extends Boundary implements SceneObject {
    static int[] anIntArray11600 = {1, 2, 4, 8};
    static int[] anIntArray11603 = {16, 32, 64, 128};
    Model model;
    byte aByte11592;
    boolean aBool11593;
    boolean aBool11594;
    Shadow shadow;
    Class498 aClass498_11596;
    int id;
    byte orienation;
    ObjectDefinitionLoader definitionLoader;
    boolean aBool11601;
    boolean aBool11602;

    public DynamicBoundary(SceneGraph sceneGraph, Toolkit class134, ObjectDefinitionLoader class678_sub17,
                           ObjectDefinition class544, int i, int i_9_, int i_10_, int i_11_, int i_12_, boolean bool, int i_13_,
                           int i_14_, boolean bool_15_) {
        super(sceneGraph, i_10_, i_11_, i_12_, i, i_9_, ReflectiveDefinitionProvider.method13896(i_13_, i_14_, (byte) 58));
        definitionLoader = class678_sub17;
        id = -1365917065 * class544.id2;
        aBool11593 = bool;
        aByte11592 = (byte) i_13_;
        orienation = (byte) i_14_;
        aBool11601 = class544.type * -1893691057 != 0 && !bool;
        aBool11602 = bool_15_;
        aBool11594 = class134.method2820() && class544.aBool7383 && !aBool11593
                && Class199.preferences.sceneryShadows.getValue() != 0;
        int i_16_ = 2048;
        if (aBool11602) {
            i_16_ |= 0x10000;
        }
        if (class544.aBool7417) {
            i_16_ |= 0x80000;
        }
        Pair class674 = getModelAndShadow(class134, i_16_, aBool11594);
        if (class674 != null) {
            model = (Model) class674.left;
            shadow = (Shadow) class674.right;
            if (aBool11602 || class544.aBool7417) {
                model = model.method2890((byte) 0, i_16_, false);
                if (class544.aBool7417) {
                    Class450 class450 = Client.scene.method7683();
                    model.recolor(class450.anInt5076 * -179051851, 428317419 * class450.anInt5075,
                            class450.anInt5074 * 1542605459, -1012034355 * class450.anInt5077);
                }
            }
        }
        method16274(1);
    }

    static final void method18071(ScriptExecutionContext class613, int i) {
        class613.anInt7924 -= -1853823602;
        int i_17_ = class613.anIntArray7942[1841827045 * class613.anInt7924];
        int i_18_ = class613.anIntArray7942[1 + class613.anInt7924 * 1841827045];
        int i_19_ = class613.anIntArray7942[2 + class613.anInt7924 * 1841827045];
        int i_20_ = class613.anIntArray7942[3 + class613.anInt7924 * 1841827045];
        int i_21_ = class613.anIntArray7942[class613.anInt7924 * 1841827045 + 4];
        int i_22_ = class613.anIntArray7942[5 + class613.anInt7924 * 1841827045];
        Class456 class456 = TurnMobCutsceneAction.aClass186_9434.method3609(Class171.aClass171_1947,
                TurnMobCutsceneAction.aClass186_9434, i_17_, i_18_, i_20_, Class156.aClass156_1876.method3293(),
                Class167.aClass167_1926, 0.0F, 0.0F, null, 0, i_21_, false);
        if (null != class456) {
            TurnMobCutsceneAction.aClass186_9434.method3593(class456, i_22_, i_19_, 1333460900);
        }
    }

    @Override
    public Class498 method16293(Toolkit toolkit) {
        Vector3f vector3f = getCoordinateSpace().translation;
        if (aClass498_11596 == null) {
            aClass498_11596 = Class498.create((int) vector3f.x, (int) vector3f.y, (int) vector3f.z,
                    method18066(toolkit, 0));
        }
        return aClass498_11596;
    }

    @Override
    public int getStartY() {
        return model != null ? model.minimumY() : 0;
    }

    @Override
    public int getId() {
        return -1956476677 * id;
    }

    @Override
    public boolean method212() {
        return aBool11594;
    }

    @Override
    public boolean method244() {
        return true;
    }

    @Override
    public int getType() {
        return aByte11592;
    }

    @Override
    public void method335() {
        if (null != model) {
            model.method3045();
        }
    }

    @Override
    public boolean shadow() {
        return aBool11594;
    }

    @Override
    public boolean method363() {
        return true;
    }

    @Override
    public void renderShadow(Toolkit toolkit) {
        Shadow shadow;
        if (null == this.shadow && aBool11594) {
            Pair class674 = getModelAndShadow(toolkit, 262144, true);
            shadow = (Shadow) (class674 != null ? class674.right : null);
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
        Shadow class480_sub31_sub12;
        if (null == shadow && aBool11594) {
            Pair class674 = getModelAndShadow(toolkit, 262144, true);
            class480_sub31_sub12 = (Shadow) (class674 != null ? class674.right : null);
        } else {
            class480_sub31_sub12 = shadow;
            shadow = null;
        }
        Vector3f vector3f = getCoordinateSpace().translation;
        if (class480_sub31_sub12 != null) {
            graph.method8338(class480_sub31_sub12, collisionPlane, (int) vector3f.x, (int) vector3f.z, null);
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
        return orienation;
    }

    @Override
    public int method48() {
        return -1956476677 * id;
    }

    @Override
    boolean method16257(Toolkit toolkit, int i, int i_3_) {
        Class379 class379 = definitionLoader.get(id * -1956476677).aClass379_7439;
        if (null != class379) {
            return toolkit.method2445(i, i_3_, updateAndGetMatrix(), class379);
        }
        Model class143 = method18066(toolkit, 131072);
        if (class143 != null) {
            Matrix4x3 class405 = updateAndGetMatrix();
            return class143.method2918(i, i_3_, class405, false, 0);
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
        if (model != null) {
            return model.method2939();
        }
        return false;
    }

    @Override
    void method16262(Toolkit toolkit, SceneNode class600_sub1, int i, int i_5_, int i_6_, boolean bool, int i_7_) {
        if (class600_sub1 instanceof DynamicBoundary) {
            DynamicBoundary class600_sub1_sub5_sub1_8_ = (DynamicBoundary) class600_sub1;
            if (null != model && null != class600_sub1_sub5_sub1_8_.model) {
                model.method2944(class600_sub1_sub5_sub1_8_.model, i, i_5_, i_6_, bool);
            }
        } else if (class600_sub1 instanceof DynamicGameObject) {
            DynamicGameObject class600_sub1_sub3_sub3 = (DynamicGameObject) class600_sub1;
            if (model != null && null != class600_sub1_sub3_sub3.model) {
                model.method2944(class600_sub1_sub3_sub3.model, i, i_5_, i_6_, bool);
            }
        }
    }

    @Override
    void method16263() {
        aBool11602 = false;
        if (null != model) {
            model.updateFunctionMask(model.functionMask() & ~0x10000);
        }
    }

    @Override
    void method16265(Toolkit toolkit) {

    }

    @Override
    MouseOverEntity method16271(Toolkit toolkit) {
        if (model == null) {
            return null;
        }
        Matrix4x3 class405 = updateAndGetMatrix();
        MouseOverEntity class506 = MouseOverEntity.method570(aBool11601);
        Class379 class379 = definitionLoader.get(-1956476677 * id).aClass379_7439;
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
        return aBool11602;
    }

    Model method18066(Toolkit class134, int i) {
        if (model != null && class134.method2637(model.functionMask(), i) == 0) {
            return model;
        }
        Pair class674 = getModelAndShadow(class134, i, false);
        if (class674 != null) {
            return (Model) class674.left;
        }
        return null;
    }

    Pair<Model, Shadow> getModelAndShadow(Toolkit toolkit, int i, boolean bool) {
        ObjectDefinition definition = definitionLoader.get(-1956476677 * id);
        SceneGraphLevel level;
        SceneGraphLevel class120_2_;
        if (aBool11593) {
            level = graph.levels0[collisionPlane];
            class120_2_ = graph.levels[0];
        } else {
            level = graph.levels[collisionPlane];
            if (collisionPlane < 3) {
                class120_2_ = graph.levels[collisionPlane + 1];
            } else {
                class120_2_ = null;
            }
        }
        Vector3f vec = getCoordinateSpace().translation;
        return definition.getModelAndShadow(toolkit, i, aByte11592, orienation, level, class120_2_, (int) vec.x,
                (int) vec.y, (int) vec.z, bool, null);
    }
}
