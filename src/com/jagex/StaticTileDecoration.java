package com.jagex;

public class StaticTileDecoration extends TileDecoration implements SceneObject {

    public ObjectConfig config;
    boolean aBool11587;
    Class498 aClass498_11589;
    boolean aBool11590 = true;
    public StaticTileDecoration(SceneGraph sceneGraph, Toolkit toolkit, ObjectDefinitionLoader loader, ObjectDefinition object,
                                int i, int i_9_, int i_10_, int i_11_, int i_12_, boolean bool, int i_13_, int i_14_, int i_15_) {
        super(sceneGraph, i_10_, i_11_, i_12_, i, i_9_, object.anInt7445 * 906201759);
        config = new ObjectConfig(toolkit, loader, object, -1050493863 * ObjectCategory.aClass541_7358.type, i_13_,
                i_9_, this, bool, i_14_, i_15_);
        aBool11587 = 0 != object.type * -1893691057 && !bool;
        method16274(1);
    }

    public static void method18064(HuffmanCodec huffman) {
        HuffmanCodec.huffman = huffman;
    }

    @Override
    public Class498 method16293(Toolkit toolkit) {
        return aClass498_11589;
    }

    @Override
    public int getStartY() {
        return config.method8173();
    }

    @Override
    public int method16307() {
        return config.method8175();
    }

    @Override
    public int getId() {
        return config.object * -38386243;
    }

    public void method18063(Class540 class540) {
        config.method8174(class540);
    }

    @Override
    public boolean method212() {
        return config.method8179();
    }

    @Override
    public boolean method244() {
        return true;
    }

    @Override
    public int getType() {
        return 126053155 * config.anInt6594;
    }

    @Override
    public void method335() {

    }

    @Override
    public boolean shadow() {
        return config.method8179();
    }

    @Override
    public boolean method363() {
        return true;
    }

    @Override
    public void renderShadow(Toolkit toolkit) {
        config.method8180(toolkit);
    }

    @Override
    public void method365(Toolkit toolkit) {
        config.method8172(toolkit);
    }

    @Override
    public void method372() {

    }

    @Override
    public int getOrientation() {
        return -1400492407 * config.orientation;
    }

    @Override
    public int method48() {
        return config.object * -38386243;
    }

    @Override
    boolean method16257(Toolkit toolkit, int i, int i_2_) {
        ObjectDefinition class544 = config.method8206();
        if (null != class544.aClass379_7439) {
            return toolkit.method2445(i, i_2_, updateAndGetMatrix(), class544.aClass379_7439);
        }

        Model model = config.method8201(toolkit, 131072, false, false);
        if (model == null) {
            return false;
        }

        return model.method2918(i, i_2_, updateAndGetMatrix(), false, 0);
    }

    @Override
    boolean isTextured() {
        return false;
    }

    @Override
    boolean isCached() {
        return aBool11590;
    }

    @Override
    final void method16262(Toolkit toolkit, SceneNode class600_sub1, int i, int i_4_, int i_5_, boolean bool,
                           int i_6_) {
        throw new IllegalStateException();
    }

    @Override
    final void method16263() {
        throw new IllegalStateException();
    }

    @Override
    void method16265(Toolkit toolkit) {
        Model model = config.method8201(toolkit, 262144, true, true);
        if (model != null) {
            Vector3f vector3f = getCoordinateSpace().translation;
            int x = (int) vector3f.x >> 9;
            int i_1_ = (int) vector3f.z >> 9;
            config.method8184(toolkit, model, updateAndGetMatrix(), x, x, i_1_, i_1_, false);
        }
    }

    @Override
    MouseOverEntity method16271(Toolkit toolkit) {
        Model class143 = config.method8201(toolkit, 2048, false, true);
        if (null == class143) {
            return null;
        }
        Matrix4x3 class405 = updateAndGetMatrix();
        CoordinateSpace coordinateSpace = getCoordinateSpace();
        MouseOverEntity class506 = MouseOverEntity.method570(aBool11587);
        int i_7_ = (int) coordinateSpace.translation.x >> 9;
        int i_8_ = (int) coordinateSpace.translation.z >> 9;
        config.method8184(toolkit, class143, class405, i_7_, i_7_, i_8_, i_8_, true);
        ObjectDefinition definition = config.method8206();
        if (null != definition.aClass379_7439) {
            class143.method2917(class405, null, 0);
            toolkit.method2447(class405, class139Array[0], definition.aClass379_7439);
        } else {
            class143.method2917(class405, class139Array[0], 0);
        }
        if (null != config.particles) {
            ParticleEntities particleEntities = config.particles.method9492();
            toolkit.method2470(particleEntities);
        }
        aBool11590 = class143.method2939() || config.particles != null;
        if (aClass498_11589 == null) {
            aClass498_11589 = Class498.create((int) coordinateSpace.translation.x, (int) coordinateSpace.translation.y,
                    (int) coordinateSpace.translation.z, class143);
        } else {
            Class545.method9300(aClass498_11589, (int) coordinateSpace.translation.x, (int) coordinateSpace.translation.y,
                    (int) coordinateSpace.translation.z, class143);
        }
        return class506;
    }

    @Override
    final boolean method16302() {
        return false;
    }

}