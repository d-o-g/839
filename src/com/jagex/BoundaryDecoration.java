package com.jagex;

public abstract class BoundaryDecoration extends SceneNode {

    protected short aShort11451;
    protected short aShort11453;
    PointLight[] pointLights;
    int anInt11452 = 0;

    BoundaryDecoration(SceneGraph sceneGraph, int x, int y, int z, int plane, int collisionPlane, int i_8_, int i_9_) {
        super(sceneGraph);
        pointLights = new PointLight[4];
        this.plane = (byte) plane;
        this.collisionPlane = (byte) collisionPlane;
        aShort11453 = (short) i_8_;
        aShort11451 = (short) i_9_;
        setPosition(new Vector3f(x, y, z));
        for (int i_10_ = 0; i_10_ < 4; i_10_++) {
            pointLights[i_10_] = null;
        }
    }

    @Override
    final void method16262(Toolkit toolkit, SceneNode class600_sub1, int i, int i_0_, int i_1_, boolean bool,
                           int i_2_) {
        throw new IllegalStateException();
    }

    @Override
    final void method16263() {
        throw new IllegalStateException();
    }

    @Override
    int method16267(PointLight[] class480_sub23s, int i) {
        if (pendingLighting) {
            Vector3f vector3f = getCoordinateSpace().translation;
            anInt11452 = method16270((int) vector3f.x >> -1911343043 * graph.tileScale,
                    (int) vector3f.z >> graph.tileScale * -1911343043, pointLights, 499770435)
                    * -1098709673;
            pendingLighting = false;
        }
        for (int i_3_ = 0; i_3_ < -1790200217 * anInt11452; i_3_++) {
            class480_sub23s[i_3_] = pointLights[i_3_];
        }
        return -1790200217 * anInt11452;
    }

    @Override
    boolean method16268(Toolkit class134, int i) {
        Vector3f vector3f = getCoordinateSpace().translation;
        return graph.aClass492_6695
                .method8521(collisionPlane, (int) vector3f.x >> -1911343043 * graph.tileScale,
                        (int) vector3f.z >> -1911343043 * graph.tileScale, getStartY());
    }

    @Override
    boolean method16269(int i) {
        Vector3f vector3f = getCoordinateSpace().translation;
        return graph.aBoolArrayArray6733[1414880535 * graph.anInt6686
                + ((int) vector3f.x >> graph.tileScale * -1911343043) - 1243106061
                * graph.anInt6723][graph.anInt6686 * 1414880535
                + ((int) vector3f.z >> -1911343043 * graph.tileScale) - graph.anInt6724
                * -1342442459];
    }

    @Override
    final boolean method16302() {
        return false;
    }
}
