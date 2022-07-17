package com.jagex;

public abstract class TileDecoration extends SceneNode {

    public short aShort11466;
    int projectedLights = 0;
    PointLight[] lights = new PointLight[4];

    TileDecoration(SceneGraph sceneGraph, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
        super(sceneGraph);
        plane = (byte) i_2_;
        collisionPlane = (byte) i_3_;
        aShort11466 = (short) i_4_;
        setPosition(new Vector3f(i, i_0_, i_1_));
        for (int i_5_ = 0; i_5_ < 4; i_5_++) {
            lights[i_5_] = null;
        }
    }

    static final String method17914(String string, String string_7_, String string_8_) {
        for (int i_9_ = string.indexOf(string_7_); -1 != i_9_; i_9_ = string.indexOf(string_7_,
                i_9_ + string_8_.length())) {
            string = new StringBuilder().append(string, 0, i_9_).append(string_8_)
                    .append(string.substring(i_9_ + string_7_.length())).toString();
        }
        return string;
    }

    @Override
    int method16267(PointLight[] lights, int i) {
        if (pendingLighting) {
            Vector3f vector3f = getCoordinateSpace().translation;
            projectedLights = method16270((int) vector3f.x >> graph.tileScale * -1911343043,
                    (int) vector3f.z >> graph.tileScale * -1911343043, this.lights, 499770435)
                    * -1454249185;
            pendingLighting = false;
        }
        for (int index = 0; index < projectedLights * 1158009055; index++) {
            lights[index] = this.lights[index];
        }
        return projectedLights * 1158009055;
    }

    @Override
    boolean method16268(Toolkit toolkit, int i) {
        Vector3f vector3f = getCoordinateSpace().translation;
        return graph.aClass492_6695.method8492(collisionPlane, (int) vector3f.x >> graph.tileScale
                * -1911343043, (int) vector3f.z >> -1911343043 * graph.tileScale);
    }

    @Override
    boolean method16269(int i) {
        Vector3f vector3f = getCoordinateSpace().translation;
        return graph.aBoolArrayArray6733[1414880535 * graph.anInt6686
                + ((int) vector3f.x >> graph.tileScale * -1911343043) - graph.anInt6723
                * 1243106061][1414880535 * graph.anInt6686
                + ((int) vector3f.z >> graph.tileScale * -1911343043) - graph.anInt6724
                * -1342442459];
    }
}