package com.jagex;

public class Class642_Sub4 extends Class642 {
    Class401 aClass401_10571 = null;
    Class281_Sub1 aClass281_Sub1_10572 = null;

    public Class642_Sub4(Camera class261) {
        super(class261);
    }

    public static void method16758(int i, byte i_5_) {
        PulseEvent class480_sub31_sub5 = PulseEvent.create(5, i);
        class480_sub31_sub5.delay();
    }

    @Override
    public Vector3f method13222(byte i) {
        return method13235();
    }

    @Override
    public void method13223(float f, int i) {

    }

    @Override
    public boolean method13224() {
        return null != aClass401_10571 && aClass281_Sub1_10572 != null && aClass281_Sub1_10572.method5226();
    }

    @Override
    public void method13227(Class268 class268, Matrix4x3 class405, int i, int i_0_, float f, int i_1_) {
        double[] ds = aClass261_8163.method4839();
        ds[0] -= i;
        ds[2] -= i_0_;
        double[] ds_2_ = method16755((byte) -10);
        ds_2_[0] -= i;
        ds_2_[2] -= i_0_;
        ds[1] *= -1.0;
        ds_2_[1] *= -1.0;
        Vector3f vector3f = Vector3f.empty();
        vector3f.x = (float) (ds_2_[0] - ds[0]);
        vector3f.y = (float) (ds_2_[1] - ds[1]);
        vector3f.z = (float) (ds_2_[2] - ds[2]);
        vector3f.normalise();
        Quaternion quaternion = new Quaternion();
        quaternion.setByAngle(vector3f, f);
        Vector3f vector3f_3_ = Vector3f.create(0.0F, 1.0F, 0.0F);
        Vector3f vector3f_4_ = Vector3f.method6454(vector3f, vector3f_3_);
        vector3f_3_ = Vector3f.method6454(vector3f_4_, vector3f);
        vector3f_3_.invertAndMultiply(quaternion);
        class405.method6731(ds[0], ds[1], ds[2], ds_2_[0], ds_2_[1], ds_2_[2], vector3f_3_.x, vector3f_3_.y,
                vector3f_3_.z);
        vector3f_3_.cache();
    }

    @Override
    public Vector3f method13235() {
        Vector3f vector3f = Vector3f.empty();
        double[] ds = aClass401_10571.method6671(aClass281_Sub1_10572.method15226((short) 27779));
        vector3f.x = (float) ds[0];
        vector3f.y = (float) ds[1];
        vector3f.z = (float) ds[2];
        return vector3f;
    }

    @Override
    public void method13244(Buffer buffer, int i) {
        aClass401_10571 = new Class401(buffer);
    }

    double[] method16755(byte i) {
        return aClass401_10571.method6671(aClass281_Sub1_10572.method15226((short) 31437));
    }
}
