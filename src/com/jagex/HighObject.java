package com.jagex;

public class HighObject extends SceneEntity {

    Class473 aClass473_11701;

    HighObject(SceneGraph sceneGraph, Class473 class473, int plane, int collisionPlane, int startX, int height, int worldZ) {
        super(sceneGraph, plane, collisionPlane, startX, height, worldZ,
                startX >> 9, startX >> 9, worldZ >> 9,
                worldZ >> 9, false, (byte) 0);
        aClass473_11701 = class473;
    }

    @Override
    public Class498 method16293(Toolkit toolkit) {
        return null;
    }

    @Override
    public int getStartY() {
        if (aClass473_11701.model == null) {
            return 0;
        }

        return aClass473_11701.model.minimumY();
    }

    @Override
    boolean method16257(Toolkit toolkit, int i, int i_5_) {
        return false;
    }

    @Override
    boolean isTextured() {
        return true;
    }

    @Override
    boolean isCached() {
        return false;
    }

    @Override
    void method16262(Toolkit toolkit, SceneNode class600_sub1, int i, int i_7_, int i_8_, boolean bool, int i_9_) {

    }

    @Override
    void method16263() {

    }

    @Override
    void method16265(Toolkit toolkit) {

    }

    @Override
    MouseOverEntity method16271(Toolkit toolkit) {
        if (aClass473_11701.model == null) {
            return null;
        }

        Matrix4x3 class405 = toolkit.getMatrix4x3();
        Matrix4x3 class405_4_ = updateAndGetMatrix();
        CoordinateSpace coordinateSpace = getCoordinateSpace();
        class405.copyFrom(class405_4_);
        SceneGraphTile sceneGraphTile = graph.tiles[plane][(int) coordinateSpace.translation.x >> 9][(int) coordinateSpace.translation.z >> 9];

        if (null != sceneGraphTile && sceneGraphTile.decoration != null) {
            class405.method6744(0.0F, -sceneGraphTile.decoration.aShort11466, 0.0F);
        }

        aClass473_11701.model.method2917(class405, null, 0);
        return null;
    }

    @Override
    boolean method16302() {
        return false;
    }

}