package com.jagex;

public class StaticBoundaryDecoration extends BoundaryDecoration implements SceneObject {

    public ObjectConfig config;
    Class498 aClass498_11623;
    boolean aBool11624;
    boolean aBool11626 = true;

    public StaticBoundaryDecoration(SceneGraph sceneGraph, Toolkit toolkit, ObjectDefinitionLoader defloader,
                                    ObjectDefinition def, int i, int i_0_, int i_1_, int i_2_, int i_3_, boolean bool, int i_4_, int i_5_,
                                    int i_6_, int i_7_, int i_8_, int i_9_) {
        super(sceneGraph, i_1_, i_2_, i_3_, i, i_0_, i_4_, i_5_);
        config = new ObjectConfig(toolkit, defloader, def, i_6_, i_7_, i_0_, this, bool, i_8_, i_9_);
        aBool11624 = 0 != def.type * -1893691057 && !bool;
        method16274(1);
    }

    public static int method18092(int i, int i_16_, int i_17_, int i_18_) {
        if (Class495_Sub1.anInt10322 * 147042807 < 100) {
            return -2;
        }
        int i_19_ = -2;
        int i_20_ = 2147483647;
        int i_21_ = i_16_ - Class495.anInt6849;
        int i_22_ = i_17_ - Class495.anInt6823;
        for (Class480_Sub37 o = (Class480_Sub37) Class495.aClass644_6820.head(); o != null; o = (Class480_Sub37) Class495.aClass644_6820.next()) {
            if (o.id * 818539827 == i) {
                int i_23_ = o.anInt10310 * -1639918769;
                int i_24_ = o.anInt10308 * -342421335;
                int i_25_ = Class495.anInt6849 + i_23_ << 14 | i_24_ + Class495.anInt6823;
                int i_26_ = (i_21_ - i_23_) * (i_21_ - i_23_) + (i_22_ - i_24_) * (i_22_ - i_24_);
                if (i_19_ < 0 || i_26_ < i_20_) {
                    i_19_ = i_25_;
                    i_20_ = i_26_;
                }
            }
        }
        return i_19_;
    }

    static final void method18093(ScriptExecutionContext class613, byte i) {
        Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
        Component class226 = class611.aClass226_7914;
        Interface class221 = class611.aClass221_7913;
        class613.anInt7924 -= -2049596966;
        class226.scrollWidth = class613.anIntArray7942[class613.anInt7924 * 1841827045] * 1011153391;
        class226.scrollHeight = class613.anIntArray7942[1841827045 * class613.anInt7924 + 1] * 1575701533;
        Component.redraw(class226);
        if (class226.type * 1558474223 == 0) {
            Class548.method9327(class221, class226, false);
        }
    }

    @Override
    public Class498 method16293(Toolkit toolkit) {
        return aClass498_11623;
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
        return -38386243 * config.object;
    }

    public void method18090(Class540 class540) {
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
        return config.orientation * -1400492407;
    }

    @Override
    public int method48() {
        return -38386243 * config.object;
    }

    @Override
    boolean method16257(Toolkit toolkit, int i, int i_12_) {
        ObjectDefinition class544 = config.method8206();
        if (null != class544.aClass379_7439) {
            return toolkit.method2445(i, i_12_, updateAndGetMatrix(), class544.aClass379_7439);
        }
        Model class143 = config.method8201(toolkit, 131072, false, false);
        if (class143 == null) {
            return false;
        }
        return class143.method2918(i, i_12_, updateAndGetMatrix(), false, 0);
    }

    @Override
    boolean isTextured() {
        return false;
    }

    @Override
    boolean isCached() {
        return aBool11626;
    }

    @Override
    void method16265(Toolkit toolkit) {
        Model class143 = config.method8201(toolkit, 262144, false, true);
        if (class143 != null) {
            Matrix4x3 class405 = updateAndGetMatrix();
            CoordinateSpace coordinateSpace = getCoordinateSpace();
            int i_10_ = (int) coordinateSpace.translation.x >> 9;
            int i_11_ = (int) coordinateSpace.translation.z >> 9;
            config.method8184(toolkit, class143, class405, i_10_, i_10_, i_11_, i_11_, false);
        }
    }

    @Override
    LoadedEntity method16271(Toolkit toolkit) {
        Model class143 = config.method8201(toolkit, 2048, false, true);
        if (null == class143) {
            return null;
        }
        Matrix4x3 class405 = toolkit.getMatrix4x3();
        class405.copyFrom(updateAndGetMatrix());
        class405.method6744(aShort11453, 0.0F, aShort11451);
        CoordinateSpace coordinateSpace = getCoordinateSpace();
        LoadedEntity class506 = LoadedEntity.method570(aBool11624);
        int i_14_ = (int) coordinateSpace.translation.x >> 9;
        int i_15_ = (int) coordinateSpace.translation.z >> 9;
        config.method8184(toolkit, class143, class405, i_14_, i_14_, i_15_, i_15_, true);
        ObjectDefinition class544 = config.method8206();
        if (null != class544.aClass379_7439) {
            class143.method2917(class405, null, 0);
            toolkit.method2447(class405, class139Array[0], class544.aClass379_7439);
        } else {
            class143.method2917(class405, class139Array[0], 0);
        }
        if (null != config.particles) {
            ParticleEntities particleEntities = config.particles.method9492();
            toolkit.method2470(particleEntities);
        }
        aBool11626 = class143.method2939() || config.particles != null;
        if (null == aClass498_11623) {
            aClass498_11623 = Class498.create((int) coordinateSpace.translation.x, (int) coordinateSpace.translation.y,
                    (int) coordinateSpace.translation.z, class143);
        } else {
            Class545.method9300(aClass498_11623, (int) coordinateSpace.translation.x, (int) coordinateSpace.translation.y,
                    (int) coordinateSpace.translation.z, class143);
        }
        return class506;
    }
}
