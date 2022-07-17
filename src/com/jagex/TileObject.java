package com.jagex;

public abstract class TileObject extends SceneNode {

    TileObject(SceneGraph sceneGraph, int i, int i_3_, int i_4_, int i_5_, int i_6_) {
        super(sceneGraph);
        plane = (byte) i_5_;
        collisionPlane = (byte) i_6_;
        setPosition(new Vector3f(i, i_3_, i_4_));
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
        Vector3f vector3f = getCoordinateSpace().translation;
        return method16270((int) vector3f.x >> graph.tileScale * -1911343043,
                (int) vector3f.z >> graph.tileScale * -1911343043, class480_sub23s, 499770435);
    }

    @Override
    boolean method16268(Toolkit class134, int i) {
        Vector3f vector3f = getCoordinateSpace().translation;
        EntityIterator entityIterator = graph.getEntityIterator(collisionPlane, (int) vector3f.x >> graph.tileScale
                * -1911343043, (int) vector3f.z >> graph.tileScale * -1911343043, -1805913001);
        if (null != entityIterator && entityIterator.current.aBool11461) {
            return graph.aClass492_6695.method8521(collisionPlane,
                    (int) vector3f.x >> graph.tileScale * -1911343043, (int) vector3f.z >> -1911343043
                            * graph.tileScale, entityIterator.current.getStartY()
                            + getStartY());
        }
        return graph.aClass492_6695.method8492(collisionPlane, (int) vector3f.x >> graph.tileScale
                * -1911343043, (int) vector3f.z >> -1911343043 * graph.tileScale);
    }

    @Override
    boolean method16269(int i) {
        Vector3f vector3f = getCoordinateSpace().translation;
        return graph.aBoolArrayArray6733[1414880535 * graph.anInt6686
                + ((int) vector3f.x >> -1911343043 * graph.tileScale) - 1243106061
                * graph.anInt6723][((int) vector3f.z >> graph.tileScale * -1911343043)
                - graph.anInt6724 * -1342442459 + graph.anInt6686 * 1414880535];
    }

    @Override
    final boolean method16302() {
        return false;
    }
}
