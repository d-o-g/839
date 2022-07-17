package com.jagex;

public abstract class Boundary extends SceneNode {
    public static final int anInt11480 = 1;
    public static final int anInt11481 = 2;
    public static final int anInt11482 = 4;
    public static final int anInt11483 = 8;
    public static final int anInt11484 = 16;
    public static final int anInt11486 = 64;
    public static final int anInt11488 = 128;
    public static final int anInt11490 = 32;
    static int[] anIntArray11485 = {19, 55, 38, 155, 255, 110, 137, 205, 76};
    public short aShort11489;
    int projectedLights = 0;
    PointLight[] lights = new PointLight[4];

    Boundary(SceneGraph sceneGraph, int i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_) {
        super(sceneGraph);
        plane = (byte) i_7_;
        collisionPlane = (byte) i_8_;
        aShort11489 = (short) i_9_;
        setPosition(new Vector3f(i, i_5_, i_6_));
        for (int i_10_ = 0; i_10_ < 4; i_10_++) {
            lights[i_10_] = null;
        }
    }

    @Override
    int method16267(PointLight[] class480_sub23s, int i) {
        if (pendingLighting) {
            Vector3f vector3f = getCoordinateSpace().translation;
            int i_0_ = (int) vector3f.x >> graph.tileScale * -1911343043;
            int i_1_ = (int) vector3f.z >> -1911343043 * graph.tileScale;
            int i_2_ = 0;
            if (i_0_ == graph.anInt6723 * 1243106061) {
                i_2_++;
            } else if (graph.anInt6723 * 1243106061 < i_0_) {
                i_2_ += 2;
            }
            if (i_1_ == graph.anInt6724 * -1342442459) {
                i_2_ += 3;
            } else if (graph.anInt6724 * -1342442459 > i_1_) {
                i_2_ += 6;
            }
            int i_3_ = anIntArray11485[i_2_];
            if ((aShort11489 & i_3_) == 0) {
                if (aShort11489 == 1 && i_0_ > 0) {
                    i_0_--;
                } else if (4 == aShort11489 && i_0_ <= graph.width * 173827901) {
                    i_0_++;
                } else if (8 == aShort11489 && i_1_ > 0) {
                    i_1_--;
                } else if (aShort11489 == 2 && i_1_ <= graph.length * 134933557) {
                    i_1_++;
                } else if (16 == aShort11489 && i_0_ > 0 && i_1_ <= 134933557 * graph.length) {
                    i_0_--;
                    i_1_++;
                } else if (32 == aShort11489 && i_0_ <= 173827901 * graph.width
                        && i_1_ <= graph.length * 134933557) {
                    i_0_++;
                    i_1_++;
                } else if (aShort11489 == 128 && i_0_ > 0 && i_1_ > 0) {
                    i_0_--;
                    i_1_--;
                } else if (aShort11489 == 64 && i_0_ <= 173827901 * graph.width && i_1_ > 0) {
                    i_0_++;
                    i_1_--;
                } else {
                    throw new RuntimeException("");
                }
            }
            projectedLights = method16270(i_0_, i_1_, lights, 499770435) * 1214459931;
            pendingLighting = false;
        }
        for (int i_4_ = 0; i_4_ < projectedLights * 304949779; i_4_++) {
            class480_sub23s[i_4_] = lights[i_4_];
        }
        return 304949779 * projectedLights;
    }

    @Override
    boolean method16268(Toolkit class134, int i) {
        Vector3f vector3f = getCoordinateSpace().translation;
        return graph.aClass492_6695.method8493(this, collisionPlane, (int) vector3f.x >> -1911343043
                * graph.tileScale, (int) vector3f.z >> -1911343043 * graph.tileScale);
    }

    @Override
    boolean method16269(int i) {
        Vector3f vector3f = getCoordinateSpace().translation;
        return graph.aBoolArrayArray6733[((int) vector3f.x >> -1911343043 * graph.tileScale)
                - graph.anInt6723 * 1243106061 + 1414880535 * graph.anInt6686][((int) vector3f.z >> -1911343043
                * graph.tileScale)
                - -1342442459 * graph.anInt6724 + 1414880535 * graph.anInt6686];
    }
}
