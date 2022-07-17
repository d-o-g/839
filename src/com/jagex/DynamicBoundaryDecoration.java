package com.jagex;

public class DynamicBoundaryDecoration extends BoundaryDecoration implements SceneObject {
    Shadow aClass480_Sub31_Sub12_11627;
    Model aClass143_11628;
    byte aByte11629;
    ObjectDefinitionLoader loader;
    int anInt11631;
    boolean aBool11632;
    byte aByte11633;
    boolean aBool11634;
    boolean aBool11635;
    Class498 aClass498_11636;

    public DynamicBoundaryDecoration(SceneGraph sceneGraph, Toolkit class134, ObjectDefinitionLoader class678_sub17,
                                     ObjectDefinition class544, int i, int i_5_, int i_6_, int i_7_, int i_8_, boolean bool, int i_9_,
                                     int i_10_, int i_11_, int i_12_) {
        super(sceneGraph, i_6_, i_7_, i_8_, i, i_5_, i_9_, i_10_);
        loader = class678_sub17;
        anInt11631 = -1341656093 * class544.id2;
        aBool11634 = bool;
        aByte11633 = (byte) i_12_;
        aByte11629 = (byte) i_11_;
        aBool11635 = class544.type * -1893691057 != 0 && !bool;
        aBool11632 = class134.method2820() && class544.aBool7383 && !aBool11634
                && Class199.preferences.sceneryShadows.getValue() != 0;
        int i_13_ = 2048;
        if (class544.aBool7417) {
            i_13_ |= 0x80000;
        }
        Pair class674 = method18095(class134, i_13_, aBool11632);
        if (class674 != null) {
            aClass143_11628 = (Model) class674.left;
            aClass480_Sub31_Sub12_11627 = (Shadow) class674.right;
            if (class544.aBool7417) {
                aClass143_11628 = aClass143_11628.method2890((byte) 0, i_13_, false);
                if (class544.aBool7417) {
                    Class450 class450 = Client.scene.method7683();
                    aClass143_11628.recolor(-179051851 * class450.anInt5076, class450.anInt5075 * 428317419,
                            1542605459 * class450.anInt5074, class450.anInt5077 * -1012034355);
                }
            }
        }
        method16274(1);
    }

    @Override
    public Class498 method16293(Toolkit toolkit) {
        Vector3f vector3f = getCoordinateSpace().translation;
        if (aClass498_11636 == null) {
            aClass498_11636 = Class498.create((int) vector3f.x, (int) vector3f.y, (int) vector3f.z,
                    method18096(toolkit, 0, (byte) -42));
        }
        return aClass498_11636;
    }

    @Override
    public int getStartY() {
        return null != aClass143_11628 ? aClass143_11628.minimumY() : 0;
    }

    @Override
    public int getId() {
        return anInt11631 * 569455663;
    }

    @Override
    public boolean method212() {
        return aBool11632;
    }

    @Override
    public boolean method244() {
        return true;
    }

    @Override
    public int getType() {
        return aByte11629;
    }

    @Override
    public void method335() {
        if (aClass143_11628 != null) {
            aClass143_11628.method3045();
        }
    }

    @Override
    public boolean shadow() {
        return aBool11632;
    }

    @Override
    public boolean method363() {
        return true;
    }

    @Override
    public void renderShadow(Toolkit toolkit) {
        Shadow class480_sub31_sub12;
        if (null == aClass480_Sub31_Sub12_11627 && aBool11632) {
            Pair class674 = method18095(toolkit, 262144, true);
            class480_sub31_sub12 = (Shadow) (class674 != null ? class674.right : null);
        } else {
            class480_sub31_sub12 = aClass480_Sub31_Sub12_11627;
            aClass480_Sub31_Sub12_11627 = null;
        }
        Vector3f vector3f = getCoordinateSpace().translation;
        if (null != class480_sub31_sub12) {
            graph.method8362(class480_sub31_sub12, collisionPlane, (int) vector3f.x, (int) vector3f.z, null);
        }
    }

    @Override
    public void method365(Toolkit toolkit) {
        Shadow class480_sub31_sub12;
        if (null == aClass480_Sub31_Sub12_11627 && aBool11632) {
            Pair class674 = method18095(toolkit, 262144, true);
            class480_sub31_sub12 = (Shadow) (null != class674 ? class674.right : null);
        } else {
            class480_sub31_sub12 = aClass480_Sub31_Sub12_11627;
            aClass480_Sub31_Sub12_11627 = null;
        }
        Vector3f vector3f = getCoordinateSpace().translation;
        if (null != class480_sub31_sub12) {
            graph.method8338(class480_sub31_sub12, collisionPlane, (int) vector3f.x, (int) vector3f.z, null);
        }
    }

    @Override
    public void method372() {
        if (aClass143_11628 != null) {
            aClass143_11628.method3045();
        }
    }

    @Override
    public int getOrientation() {
        return aByte11633;
    }

    @Override
    public int method48() {
        return anInt11631 * 569455663;
    }

    @Override
    boolean method16257(Toolkit toolkit, int i, int i_3_) {
        Class379 class379 = loader.get(anInt11631 * 569455663).aClass379_7439;
        if (class379 != null) {
            return toolkit.method2445(i, i_3_, updateAndGetMatrix(), class379);
        }
        Model class143 = method18096(toolkit, 131072, (byte) -37);
        if (null != class143) {
            Matrix4x3 class405 = updateAndGetMatrix();
            return class143.method2918(i, i_3_, class405, false, 0);
        }
        return false;
    }

    @Override
    boolean isTextured() {
        if (null != aClass143_11628) {
            return !aClass143_11628.isTextured();
        }
        return true;
    }

    @Override
    boolean isCached() {
        if (aClass143_11628 != null) {
            return aClass143_11628.method2939();
        }
        return false;
    }

    @Override
    void method16265(Toolkit toolkit) {

    }

    @Override
    LoadedEntity method16271(Toolkit toolkit) {
        if (aClass143_11628 == null) {
            return null;
        }
        Matrix4x3 class405 = toolkit.getMatrix4x3();
        class405.copyFrom(updateAndGetMatrix());
        class405.method6744(aShort11453, 0.0F, aShort11451);
        LoadedEntity class506 = LoadedEntity.method570(aBool11635);
        Class379 class379 = loader.get(569455663 * anInt11631).aClass379_7439;
        if (class379 != null) {
            aClass143_11628.method2917(class405, null, 0);
            toolkit.method2447(class405, class139Array[0], class379);
        } else {
            aClass143_11628.method2917(class405, class139Array[0], 0);
        }
        return class506;
    }

    Pair method18095(Toolkit toolkit, int i, boolean bool) {
        ObjectDefinition class544 = loader.get(569455663 * anInt11631);
        SceneGraphLevel class120;
        SceneGraphLevel class120_1_;
        if (aBool11634) {
            class120 = graph.levels0[collisionPlane];
            class120_1_ = graph.levels[0];
        } else {
            class120 = graph.levels[collisionPlane];
            if (collisionPlane < 3) {
                class120_1_ = graph.levels[1 + collisionPlane];
            } else {
                class120_1_ = null;
            }
        }
        Vector3f vector3f = getCoordinateSpace().translation;
        return class544.getModelAndShadow(toolkit, i, aByte11629, aByte11633, class120, class120_1_, (int) vector3f.x,
                (int) vector3f.y, (int) vector3f.z, bool, null);
    }

    Model method18096(Toolkit class134, int i, byte i_2_) {
        if (aClass143_11628 != null && class134.method2637(aClass143_11628.functionMask(), i) == 0) {
            return aClass143_11628;
        }
        Pair class674 = method18095(class134, i, false);
        if (class674 != null) {
            return (Model) class674.left;
        }
        return null;
    }
}
