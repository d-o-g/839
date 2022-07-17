package com.jagex;

public class StaticBoundary extends Boundary implements SceneObject {

    static int[] anIntArray11616;
    static int[] anIntArray11619 = {1, 2, 4, 8};

    static {
        anIntArray11616 = new int[]{16, 32, 64, 128};
    }

    public ObjectConfig config;
    boolean aBool11617;
    Class498 aClass498_11618;
    boolean aBool11621 = true;

    public StaticBoundary(SceneGraph sceneGraph, Toolkit class134, ObjectDefinitionLoader class678_sub17, ObjectDefinition class544,
                          int i, int i_9_, int i_10_, int i_11_, int i_12_, boolean bool, int i_13_, int i_14_, int i_15_, int i_16_) {
        super(sceneGraph, i_10_, i_11_, i_12_, i, i_9_, Class584.method9872(i_13_, i_14_, (byte) -1));
        config = new ObjectConfig(class134, class678_sub17, class544, i_13_, i_14_, i_9_, this, bool, i_15_, i_16_);
        aBool11617 = 0 != -1893691057 * class544.type && !bool;
        method16274(1);
    }

    public static byte[
            ] getStringBytes(CharSequence sequence) {
        int length = sequence.length();
        byte[] data = new byte[length];
        for (int index = 0; index < length; index++) {
            char c = sequence.charAt(index);
            if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff') {
                data[index] = (byte) c;
            } else if ('\u20ac' == c) {
                data[index] = (byte) -128;
            } else if (c == '\u201a') {
                data[index] = (byte) -126;
            } else if ('\u0192' == c) {
                data[index] = (byte) -125;
            } else if ('\u201e' == c) {
                data[index] = (byte) -124;
            } else if ('\u2026' == c) {
                data[index] = (byte) -123;
            } else if (c == '\u2020') {
                data[index] = (byte) -122;
            } else if ('\u2021' == c) {
                data[index] = (byte) -121;
            } else if (c == '\u02c6') {
                data[index] = (byte) -120;
            } else if ('\u2030' == c) {
                data[index] = (byte) -119;
            } else if (c == '\u0160') {
                data[index] = (byte) -118;
            } else if (c == '\u2039') {
                data[index] = (byte) -117;
            } else if ('\u0152' == c) {
                data[index] = (byte) -116;
            } else if (c == '\u017d') {
                data[index] = (byte) -114;
            } else if (c == '\u2018') {
                data[index] = (byte) -111;
            } else if ('\u2019' == c) {
                data[index] = (byte) -110;
            } else if ('\u201c' == c) {
                data[index] = (byte) -109;
            } else if ('\u201d' == c) {
                data[index] = (byte) -108;
            } else if ('\u2022' == c) {
                data[index] = (byte) -107;
            } else if ('\u2013' == c) {
                data[index] = (byte) -106;
            } else if ('\u2014' == c) {
                data[index] = (byte) -105;
            } else if (c == '\u02dc') {
                data[index] = (byte) -104;
            } else if (c == '\u2122') {
                data[index] = (byte) -103;
            } else if ('\u0161' == c) {
                data[index] = (byte) -102;
            } else if (c == '\u203a') {
                data[index] = (byte) -101;
            } else if (c == '\u0153') {
                data[index] = (byte) -100;
            } else if ('\u017e' == c) {
                data[index] = (byte) -98;
            } else if ('\u0178' == c) {
                data[index] = (byte) -97;
            } else {
                data[index] = (byte) 63;
            }
        }
        return data;
    }

    @Override
    public Class498 method16293(Toolkit toolkit) {
        return aClass498_11618;
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

    public void method18084(Class540 class540) {
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
    boolean method16257(Toolkit toolkit, int i, int i_4_) {
        ObjectDefinition class544 = config.method8206();
        if (class544.aClass379_7439 != null) {
            return toolkit.method2445(i, i_4_, updateAndGetMatrix(), class544.aClass379_7439);
        }
        Model class143 = config.method8201(toolkit, 131072, false, false);
        if (class143 == null) {
            return false;
        }
        return class143.method2918(i, i_4_, updateAndGetMatrix(), false, 0);
    }

    @Override
    boolean isTextured() {
        return false;
    }

    @Override
    boolean isCached() {
        return aBool11621;
    }

    @Override
    final void method16262(Toolkit toolkit, SceneNode class600_sub1, int i, int i_6_, int i_7_, boolean bool,
                           int i_8_) {
        throw new IllegalStateException();
    }

    @Override
    final void method16263() {
        throw new IllegalStateException();
    }

    @Override
    void method16265(Toolkit toolkit) {
        Model class143 = config.method8201(toolkit, 262144, true, true);
        if (class143 != null) {
            Matrix4x3 class405 = updateAndGetMatrix();
            CoordinateSpace coordinateSpace = getCoordinateSpace();
            int i_2_ = (int) coordinateSpace.translation.x >> 9;
            int i_3_ = (int) coordinateSpace.translation.z >> 9;
            config.method8184(toolkit, class143, class405, i_2_, i_2_, i_3_, i_3_, false);
        }
    }

    @Override
    LoadedEntity method16271(Toolkit toolkit) {
        Model class143 = config.method8201(toolkit, 2048, false, true);
        if (null == class143) {
            return null;
        }
        Matrix4x3 class405 = updateAndGetMatrix();
        CoordinateSpace coordinateSpace = getCoordinateSpace();
        LoadedEntity class506 = LoadedEntity.method570(aBool11617);
        int i_0_ = (int) coordinateSpace.translation.x >> 9;
        int i_1_ = (int) coordinateSpace.translation.z >> 9;
        config.method8184(toolkit, class143, class405, i_0_, i_0_, i_1_, i_1_, true);
        ObjectDefinition class544 = config.method8206();
        if (class544.aClass379_7439 != null) {
            class143.method2917(class405, null, 0);
            toolkit.method2447(class405, class139Array[0], class544.aClass379_7439);
        } else {
            class143.method2917(class405, class139Array[0], 0);
        }
        if (null != config.particles) {
            ParticleEntities particleEntities = config.particles.method9492();
            toolkit.method2470(particleEntities);
        }
        aBool11621 = class143.method2939() || config.particles != null;
        if (aClass498_11618 == null) {
            aClass498_11618 = Class498.create((int) coordinateSpace.translation.x, (int) coordinateSpace.translation.y,
                    (int) coordinateSpace.translation.z, class143);
        } else {
            Class545.method9300(aClass498_11618, (int) coordinateSpace.translation.x, (int) coordinateSpace.translation.y,
                    (int) coordinateSpace.translation.z, class143);
        }
        return class506;
    }

    @Override
    final boolean method16302() {
        return false;
    }
}
