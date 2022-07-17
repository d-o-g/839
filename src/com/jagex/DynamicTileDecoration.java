package com.jagex;

public class DynamicTileDecoration extends TileDecoration implements SceneObject {
    boolean aBool11577;
    byte aByte11578;
    Shadow aClass480_Sub31_Sub12_11579;
    Class498 aClass498_11580;
    int object;
    Model aClass143_11582;
    boolean aBool11583;
    ObjectDefinitionLoader aClass678_Sub17_11584;
    boolean aBool11585;
    boolean aBool11586;

    public DynamicTileDecoration(SceneGraph sceneGraph, Toolkit toolkit, ObjectDefinitionLoader loader,
                                 ObjectDefinition definition, int plane, int collisionPlane, int i_8_, int i_9_, int i_10_,
                                 boolean underwater, int i_11_, boolean bool_12_) {
        super(sceneGraph, i_8_, i_9_, i_10_, plane, collisionPlane, definition.anInt7445 * 906201759);
        aClass678_Sub17_11584 = loader;
        object = -2011950653 * definition.id2;
        aBool11583 = underwater;
        aByte11578 = (byte) i_11_;
        aBool11577 = -1893691057 * definition.type != 0 && !underwater;
        aBool11585 = bool_12_;
        aBool11586 = toolkit.method2820() && definition.aBool7383 && !aBool11583
                && Class199.preferences.sceneryShadows.getValue() != 0;

        int i_13_ = 2048;
        if (aBool11585) {
            i_13_ |= 0x10000;
        }
        if (definition.aBool7417) {
            i_13_ |= 0x80000;
        }

        Pair class674 = method18058(toolkit, i_13_, aBool11586);
        if (class674 != null) {
            aClass143_11582 = (Model) class674.left;
            aClass480_Sub31_Sub12_11579 = (Shadow) class674.right;

            if (aBool11585 || definition.aBool7417) {
                aClass143_11582 = aClass143_11582.method2890((byte) 0, i_13_, false);

                if (definition.aBool7417) {
                    Class450 class450 = Client.scene.method7683();
                    aClass143_11582.recolor(class450.anInt5076 * -179051851, class450.anInt5075 * 428317419,
                            1542605459 * class450.anInt5074, class450.anInt5077 * -1012034355);
                }
            }
        }

        method16274(1);
    }

    static final void method18061(ScriptExecutionContext class613, int i) {
        int i_16_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
        Component class226 = Component.lookup(i_16_);
        Interface class221 = Class598.loadedInterfaces[i_16_ >> 16];
        TimeUtil.method4148(class226, class221, class613, -1196475317);
    }

    static final void method18062(Component class226, Interface class221, ScriptExecutionContext class613, int i) {
        String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
        if (ScriptExecutionContext.method9239(string, class613) != null) {
            string = string.substring(0, string.length() - 1);
        }
        class226.anObjectArray2525 = World.method16248(string, class613);
        class226.aBool2483 = true;
    }

    @Override
    public Class498 method16293(Toolkit toolkit) {
        Vector3f vector3f = getCoordinateSpace().translation;
        if (aClass498_11580 == null) {
            aClass498_11580 = Class498.create((int) vector3f.x, (int) vector3f.y, (int) vector3f.z,
                    method18055(toolkit, 0));
        }

        return aClass498_11580;
    }

    @Override
    public int getStartY() {
        return null != aClass143_11582 ? aClass143_11582.minimumY() : 0;
    }

    @Override
    public int getId() {
        return -1979252017 * object;
    }

    @Override
    public boolean method212() {
        return aBool11586;
    }

    @Override
    public boolean method244() {
        return true;
    }

    @Override
    public int getType() {
        return -1050493863 * ObjectCategory.aClass541_7358.type;
    }

    @Override
    public void method335() {
        if (aClass143_11582 != null) {
            aClass143_11582.method3045();
        }
    }

    @Override
    public boolean shadow() {
        return aBool11586;
    }

    @Override
    public boolean method363() {
        return true;
    }

    @Override
    public void renderShadow(Toolkit toolkit) {
        Shadow shadow;
        if (aClass480_Sub31_Sub12_11579 == null && aBool11586) {
            Pair<?, Shadow> pair = method18058(toolkit, 262144, true);
            shadow = null != pair ? pair.right : null;
        } else {
            shadow = aClass480_Sub31_Sub12_11579;
            aClass480_Sub31_Sub12_11579 = null;
        }

        Vector3f vector3f = getCoordinateSpace().translation;
        if (shadow != null) {
            graph.method8362(shadow, collisionPlane, (int) vector3f.x, (int) vector3f.z, null);
        }
    }

    @Override
    public void method365(Toolkit toolkit) {
        Shadow shadow;
        if (aClass480_Sub31_Sub12_11579 == null && aBool11586) {
            Pair pair = method18058(toolkit, 262144, true);
            shadow = (Shadow) (null != pair ? pair.right : null);
        } else {
            shadow = aClass480_Sub31_Sub12_11579;
            aClass480_Sub31_Sub12_11579 = null;
        }

        Vector3f vector3f = getCoordinateSpace().translation;
        if (null != shadow) {
            graph.method8338(shadow, collisionPlane, (int) vector3f.x, (int) vector3f.z, null);
        }
    }

    @Override
    public void method372() {
        if (aClass143_11582 != null) {
            aClass143_11582.method3045();
        }
    }

    @Override
    public int getOrientation() {
        return aByte11578;
    }

    @Override
    public int method48() {
        return -1979252017 * object;
    }

    @Override
    boolean method16257(Toolkit toolkit, int i, int i_5_) {
        Class379 class379 = aClass678_Sub17_11584.get(object * -1979252017).aClass379_7439;
        if (class379 != null) {
            return toolkit.method2445(i, i_5_, updateAndGetMatrix(), class379);
        }

        Model model = method18055(toolkit, 131072);
        if (model != null) {
            Matrix4x3 class405 = updateAndGetMatrix();
            return model.method2918(i, i_5_, class405, false, 0);
        }

        return false;
    }

    @Override
    boolean isTextured() {
        if (aClass143_11582 != null) {
            return !aClass143_11582.isTextured();
        }
        return true;
    }

    @Override
    boolean isCached() {
        if (aClass143_11582 != null) {
            return aClass143_11582.method2939();
        }
        return false;
    }

    @Override
    void method16262(Toolkit toolkit, SceneNode class600_sub1, int i, int i_1_, int i_2_, boolean bool, int i_3_) {
        if (class600_sub1 instanceof DynamicTileDecoration) {
            DynamicTileDecoration class600_sub1_sub4_sub1_4_ = (DynamicTileDecoration) class600_sub1;
            if (aClass143_11582 != null && class600_sub1_sub4_sub1_4_.aClass143_11582 != null) {
                aClass143_11582.method2944(class600_sub1_sub4_sub1_4_.aClass143_11582, i, i_1_, i_2_, bool);
            }
        }
    }

    @Override
    void method16263() {
        aBool11585 = false;
        if (null != aClass143_11582) {
            aClass143_11582.updateFunctionMask(aClass143_11582.functionMask() & ~0x10000);
        }
    }

    @Override
    void method16265(Toolkit toolkit) {

    }

    @Override
    LoadedEntity method16271(Toolkit toolkit) {
        if (aClass143_11582 == null) {
            return null;
        }

        Matrix4x3 class405 = updateAndGetMatrix();
        LoadedEntity class506 = LoadedEntity.method570(aBool11577);
        Class379 class379 = aClass678_Sub17_11584.get(-1979252017 * object).aClass379_7439;

        if (class379 != null) {
            aClass143_11582.method2917(class405, null, 0);
            toolkit.method2447(class405, class139Array[0], class379);
        } else {
            aClass143_11582.method2917(class405, class139Array[0], 0);
        }

        return class506;
    }

    @Override
    boolean method16302() {
        return aBool11585;
    }

    Model method18055(Toolkit toolkit, int i) {
        if (aClass143_11582 != null && toolkit.method2637(aClass143_11582.functionMask(), i) == 0) {
            return aClass143_11582;
        }

        Pair<Model, Shadow> pair = method18058(toolkit, i, false);
        if (null != pair) {
            return pair.left;
        }

        return null;
    }

    Pair method18058(Toolkit toolkit, int i, boolean bool) {
        ObjectDefinition definition = aClass678_Sub17_11584.get(object * -1979252017);
        SceneGraphLevel ground;
        SceneGraphLevel other;

        if (aBool11583) {
            ground = graph.levels0[collisionPlane];
            other = graph.levels[0];
        } else {
            ground = graph.levels[collisionPlane];
            if (collisionPlane < 3) {
                other = graph.levels[1 + collisionPlane];
            } else {
                other = null;
            }
        }

        Vector3f vector3f = getCoordinateSpace().translation;
        return definition.getModelAndShadow(toolkit, i, ObjectCategory.aClass541_7358.type * -1050493863, aByte11578, ground,
                other, (int) vector3f.x, (int) vector3f.y, (int) vector3f.z, bool, null);
    }

}