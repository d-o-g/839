package com.jagex;

public class Class642_Sub2 extends Class642 {
    Vector3f aVector3f_10547;
    Vector3f aVector3f_10548 = new Vector3f(Float.NaN, Float.NaN, Float.NaN);
    Vector3f aVector3f_10549;

    public Class642_Sub2(Camera class261) {
        super(class261);
        aVector3f_10547 = new Vector3f(Float.NaN, Float.NaN, Float.NaN);
        aVector3f_10549 = new Vector3f();
    }

    @Override
    public Vector3f method13222(byte i) {
        return Vector3f.copyOf(aVector3f_10547);
    }

    @Override
    public void method13223(float f, int i) {
        aClass261_8163.method4862(false, f, aVector3f_10548, aClass261_8163.jagexAngleToQuaternion((byte) 86), aVector3f_10547,
                aVector3f_10549, -958958229);
    }

    @Override
    public boolean method13224() {
        return !Float.isNaN(aVector3f_10548.x);
    }

    @Override
    public void method13227(Class268 class268, Matrix4x3 class405, int i, int i_0_, float f, int i_1_) {
        Vector3f vector3f = Vector3f.copyOf(aClass261_8163.getPosition());
        vector3f.x -= i;
        vector3f.z -= i_0_;
        vector3f.y *= -1.0F;
        Vector3f vector3f_2_ = Vector3f.copyOf(aVector3f_10548);
        vector3f_2_.x -= i;
        vector3f_2_.z -= i_0_;
        vector3f_2_.y *= -1.0F;
        class405.method6731(vector3f.x, vector3f.y, vector3f.z, vector3f_2_.x, vector3f_2_.y, vector3f_2_.z, 0.0F,
                1.0F, 0.0F);
        vector3f.cache();
        vector3f_2_.cache();
    }

    @Override
    public Vector3f method13235() {
        return Vector3f.copyOf(aVector3f_10548);
    }

    @Override
    public void method13244(Buffer buffer, int i) {
        aVector3f_10547.decode(buffer);
    }

    public void method16708(Vector4i vector4i, int i) {
        aVector3f_10547.x = -61099889 * vector4i.x;
        aVector3f_10547.y = 1227419133 * vector4i.y;
        aVector3f_10547.z = vector4i.z * -980788885;
        if (Float.isNaN(aVector3f_10548.x)) {
            aVector3f_10548.copyFrom(aVector3f_10547);
            aVector3f_10549.reset();
        }
    }
}
