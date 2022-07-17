package com.jagex;

public class Class281_Sub3 extends Class281 {
    static FontSpecification b12Full;
    int anInt9811;
    Vector3f aVector3f_9812 = new Vector3f(Float.NaN, Float.NaN, Float.NaN);
    Vector3f aVector3f_9813 = new Vector3f(Float.NaN, Float.NaN, Float.NaN);
    Vector3f aVector3f_9814 = new Vector3f();
    boolean aBool9815 = false;

    public Class281_Sub3(Camera class261) {
        super(class261);
    }

    static final void method15307(SceneNode class600_sub1, int i, boolean bool) {
        Animation.method3522(class600_sub1, i, false, bool);
    }

    public void method15297(boolean bool) {
        aBool9815 = bool;
    }

    public void method15304(Vector4i vector4i) {
        aVector3f_9813.x = vector4i.x * -61099889;
        aVector3f_9813.y = 1227419133 * vector4i.y;
        aVector3f_9813.z = -980788885 * vector4i.z;
        if (Float.isNaN(aVector3f_9812.x)) {
            aVector3f_9812.copyFrom(aVector3f_9813);
            aVector3f_9814.reset();
        }
        anInt9811 = -1531586685 * vector4i.plane;
    }

    @Override
    public Vector3f method5224() {
        return Vector3f.copyOf(aVector3f_9812);
    }

    @Override
    public void method5225(float f, int[][][] is, TileFlags class425, int i, int i_0_, byte i_1_) {
        if (aBool9815) {
            method15300(is, class425, i, i_0_, -1784581298);
        }
        camera.method4862(true, f, aVector3f_9812, camera.jagexAngleToQuaternion((byte) 70), aVector3f_9813,
                aVector3f_9814, -958958229);
    }

    @Override
    public boolean method5226() {
        return !Float.isNaN(aVector3f_9812.x);
    }

    @Override
    public double[] method5228() {
        double[] ds = new double[3];
        Vector3f vector3f = method5224();
        ds[0] = vector3f.x;
        ds[1] = vector3f.y;
        ds[2] = vector3f.z;
        return ds;
    }

    @Override
    public float method5230(byte i) {
        return 0.0F;
    }

    @Override
    public Vector4i method5238(short i) {
        return new Vector4i(anInt9811 * 954519217, (int) aVector3f_9812.x, (int) aVector3f_9812.y,
                (int) aVector3f_9812.z);
    }

    @Override
    public void method5248(Class268 class268, int i, int i_9_, byte i_10_) {
        class268.anInt2983 = ((int) aVector3f_9812.x - i) * 1771748405;
        class268.anInt2982 = 600782361 * (int) -aVector3f_9812.y;
        class268.anInt2984 = 994250225 * ((int) aVector3f_9812.z - i_9_);
    }

    @Override
    public void method5256(Buffer buffer, byte i) {
        aVector3f_9813.decode(buffer);
    }

    void method15300(int[][][] is, TileFlags flags, int i, int i_2_, int i_3_) {
        if (method5226() && (camera.method4845() || camera.method4855())
                && camera.method4855() && is != null) {
            int i_4_ = (int) aVector3f_9813.x - i >> 9;
            int i_5_ = (int) aVector3f_9813.z - i_2_ >> 9;
            if (i_4_ >= 0 && i_5_ >= 0 && 1 + i_4_ < is[0].length && 1 + i_5_ < is[0][0].length) {
                int i_6_ = anInt9811 * 954519217;
                if (flags.isBridge(i_4_, i_5_)) {
                    i_6_ = 1 + anInt9811 * 954519217;
                }
                long l = (long) aVector3f_9813.x % 512L;
                long l_7_ = (long) aVector3f_9813.z % 512L;
                long l_8_ = is[i_6_][i_4_][i_5_] * (512L - l) * (512L - l_7_);
                l_8_ += (512L - l_7_) * l * is[i_6_][1 + i_4_][i_5_];
                l_8_ += is[i_6_][i_4_][1 + i_5_] * (512L - l) * l_7_;
                l_8_ += l_7_ * l * is[i_6_][i_4_ + 1][1 + i_5_];
                l_8_ /= 262144L;
                l_8_ -= 512L;
                float f = (-l_8_) - aVector3f_9813.y;
                if (f > 0.0F) {
                    aVector3f_9813.y = -l_8_;
                }
            }
        }
    }

}