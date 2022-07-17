package com.jagex;

public class Class642_Sub1 extends Class642 {
    static float aFloat10535;
    static int anInt10537 = 0;
    static float aFloat10538;
    static int anInt10539;
    static int anInt10540;
    static float aFloat10541;
    static int anInt10543 = 0;
    static float aFloat10544;
    static float aFloat10545;
    static float aFloat10546;

    static {
        anInt10539 = 0;
        anInt10540 = 0;
        aFloat10541 = -1.0F;
        aFloat10545 = -1.0F;
        aFloat10535 = -1.0F;
        aFloat10544 = -1.0F;
        aFloat10538 = -1.0F;
        aFloat10546 = -1.0F;
    }

    Quaternion aQuaternion_10536;

    Quaternion aQuaternion_10542 = new Quaternion();

    public Class642_Sub1(Camera class261) {
        super(class261);
        aQuaternion_10536 = new Quaternion(Float.NaN, Float.NaN, Float.NaN, Float.NaN);
    }

    @Override
    public Vector3f method13222(byte i) {
        Vector3f vector3f = new Vector3f(0.0F, 0.0F, 1000.0F);
        vector3f.invertAndMultiply(Quaternion.invertedCopy(aQuaternion_10536));
        vector3f.y *= -1.0F;
        vector3f.add(aClass261_8163.getPosition());
        return vector3f;
    }

    @Override
    public void method13223(float f, int i) {
        Quaternion quaternion = method16693();
        if (-346928445 * anInt10537 != 0 || 0 != anInt10543 * -782221851) {
            Quaternion quaternion_15_ = Quaternion.cached();
            quaternion_15_.setByAngle(1.0F, 0.0F, 0.0F, (float) (2.0 * (Math.PI * (anInt10537 * -346928445))) / 16384.0F);
            quaternion.multiplyBy(quaternion_15_);
            Vector3f vector3f = Vector3f.create(0.0F, 1.0F, 0.0F);
            vector3f.invertAndMultiply(quaternion);
            Quaternion quaternion_16_ = Quaternion.cached();
            vector3f.normalise();
            quaternion_16_.setByAngle(vector3f, (float) (Math.PI * (-782221851 * anInt10543) * 2.0) / 16384.0F);
            quaternion.multiplyBy(quaternion_16_);
            method16685(quaternion);
            anInt10537 = 0;
            anInt10543 = 0;
        }
        if (aClass261_8163.method4837() == Class270.aClass270_2997
                && (0 != anInt10539 * 55627167 || anInt10540 * -1809448925 != 0)) {
            quaternion.invert();
            Class281_Sub3 class281_sub3 = (Class281_Sub3) aClass261_8163.method4876();
            Vector4i vector4i = class281_sub3.method5238((short) 17955);
            Vector3f vector3f = vector4i.toVector3f();
            Vector3f vector3f_17_ = Vector3f.create(0.0F, 0.0F, anInt10540 * -1809448925);
            vector3f_17_.invertAndMultiply(quaternion);
            vector3f_17_.y *= -1.0F;
            vector3f.add(vector3f_17_);
            Vector3f vector3f_18_ = Vector3f.create(55627167 * anInt10539, 0.0F, 0.0F);
            vector3f_18_.invertAndMultiply(quaternion);
            vector3f_18_.y *= -1.0F;
            vector3f.add(vector3f_18_);
            method16697(vector3f, (byte) 14);
            class281_sub3.method15304(new Vector4i(-841913453 * vector4i.plane, (int) vector3f.x,
                    (int) vector3f.y, (int) vector3f.z));
            anInt10539 = 0;
            anInt10540 = 0;
        }
    }

    @Override
    public boolean method13224() {
        return !Float.isNaN(aQuaternion_10542.x) && aClass261_8163.getPosition() != null;
    }

    @Override
    public void method13227(Class268 class268, Matrix4x3 class405, int i, int i_12_, float f, int i_13_) {
        Vector3f vector3f = Vector3f.copyOf(aClass261_8163.getPosition());
        vector3f.x -= i;
        vector3f.z -= i_12_;
        vector3f.y *= -1.0F;
        class405.method6737(Quaternion.invertedCopy(aQuaternion_10542));
        class405.method6747(vector3f);
        class405.method6735();
        vector3f.cache();
    }

    @Override
    public Vector3f method13235() {
        Vector3f vector3f = new Vector3f(0.0F, 0.0F, 1000.0F);
        vector3f.invertAndMultiply(Quaternion.invertedCopy(aQuaternion_10542));
        vector3f.y *= -1.0F;
        vector3f.add(aClass261_8163.getPosition());
        return vector3f;
    }

    @Override
    public void method13244(Buffer buffer, int i) {
        aQuaternion_10542.decode(buffer);
    }

    public void method16685(Quaternion quaternion) {
        aQuaternion_10536.x = quaternion.x;
        aQuaternion_10536.y = quaternion.y;
        aQuaternion_10536.z = quaternion.z;
        aQuaternion_10536.w = quaternion.w;
        aQuaternion_10542.copyFrom(aQuaternion_10536);
    }

    public void method16687(int i, int i_0_) {
        anInt10543 = i * -863455251;
    }

    public void method16688(int i, byte i_1_) {
        anInt10539 = 370871903 * i;
    }

    public void method16689(int i, int i_2_) {
        anInt10540 = i * -419254389;
    }

    public void method16691(int i, int i_3_, int i_4_, int i_5_) {
        Matrix4x3 class405 = new Matrix4x3();
        class405.method6731(0.0, 0.0, 0.0, i, -i_3_, i_4_, 0.0F, 1.0F, 0.0F);
        Class404 class404 = new Class404();
        class405.method6753(class404.aFloatArray4554);
        Quaternion quaternion = class404.method6718();
        quaternion.invert();
        aQuaternion_10542.copyFrom(quaternion);
    }

    public void method16692(Vector3f vector3f, int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, byte i_11_) {
        aFloat10541 = -1 == i ? -1.0F : vector3f.x - 512 * i;
        aFloat10545 = i_6_ == -1 ? -1.0F : 512 * i_6_ + vector3f.x;
        aFloat10535 = i_9_ == -1 ? -1.0F : -vector3f.y - 512 * i_9_;
        aFloat10544 = i_10_ == -1 ? -1.0F : -vector3f.y + i_10_ * 512;
        aFloat10538 = i_7_ == -1 ? -1.0F : vector3f.z - i_7_ * 512;
        aFloat10546 = i_8_ == -1 ? -1.0F : vector3f.z + 512 * i_8_;
    }

    public Quaternion method16693() {
        return new Quaternion(aQuaternion_10542);
    }

    public void method16703(int i) {
        anInt10537 = 409548267 * i;
    }

    void method16697(Vector3f vector3f, byte i) {
        if (-1.0F != aFloat10541 && vector3f.x < aFloat10541) {
            vector3f.x = aFloat10541;
        }
        if (aFloat10545 != -1.0F && vector3f.x > aFloat10545) {
            vector3f.x = aFloat10545;
        }
        if (-1.0F != aFloat10535 && vector3f.y < aFloat10535) {
            vector3f.y = aFloat10535;
        }
        if (-1.0F != aFloat10544 && vector3f.y > aFloat10544) {
            vector3f.y = aFloat10544;
        }
        if (-1.0F != aFloat10538 && vector3f.z < aFloat10538) {
            vector3f.z = aFloat10538;
        }
        if (aFloat10546 != -1.0F && vector3f.z > aFloat10546) {
            vector3f.z = aFloat10546;
        }
    }
}
