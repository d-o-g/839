package com.jagex;

public abstract class SceneNode extends Locatable {
    public Class139[] class139Array;
    public byte plane;
    public byte collisionPlane;
    public SceneGraph graph;
    SceneNode aClass600_Sub1_10374;
    int anInt10377;

    SceneNode(SceneGraph sceneGraph) {
        graph = sceneGraph;
    }

    public abstract Class498 method16293(Toolkit toolkit);

    public abstract int getStartY();

    public boolean method16296() {
        return true;
    }

    public int method16307() {
        return -getStartY();
    }

    abstract boolean method16257(Toolkit toolkit, int i, int i_0_);

    int itemAndNpcDefRelated() {
        return 0;
    }

    abstract boolean isTextured();

    abstract boolean isCached();

    abstract void method16262(Toolkit toolkit, SceneNode class600_sub1_2_, int i, int i_3_, int i_4_, boolean bool,
                              int i_5_);

    abstract void method16263();

    abstract void method16265(Toolkit toolkit);

    abstract int method16267(PointLight[] class480_sub23s, int i);

    abstract boolean method16268(Toolkit class134, int i);

    abstract boolean method16269(int i);

    int method16270(int i, int i_6_, PointLight[] class480_sub23s, int i_7_) {
        long l = graph.aLongArrayArrayArray6720[plane][i][i_6_];
        long l_8_ = 0L;
        int i_9_ = 0;
        for (; l_8_ <= 48L; l_8_ += 16L) {
            int i_10_ = (int) (l >> (int) l_8_ & 0xffffL);
            if (i_10_ <= 0) {
                break;
            }
            class480_sub23s[i_9_++] = graph.aClass504Array6742[i_10_ - 1].light;
        }
        for (int i_11_ = i_9_; i_11_ < 4; i_11_++) {
            class480_sub23s[i_11_] = null;
        }
        return i_9_;
    }

    abstract MouseOverEntity method16271(Toolkit toolkit);

    void method16274(int i) {
        class139Array = new Class139[i];
        for (int i_13_ = 0; i_13_ < class139Array.length; i_13_++) {
            class139Array[i_13_] = new Class139();
        }
    }

    abstract boolean method16302();
}
