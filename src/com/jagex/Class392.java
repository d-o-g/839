package com.jagex;

public class Class392 {
    float[] aFloatArray4503;
    float aFloat4504;
    Vector3f[] aVector3fArray4505 = new Vector3f[4];

    Class392() {
        for (int i = 0; i < 4; i++) {
            aVector3fArray4505[i] = new Vector3f();
        }
        method6325();
    }

    void method6325() {
        aFloat4504 = -1.0F;
        aFloatArray4503 = null;
    }

    void method6326(int i, Vector3f vector3f) {
        aVector3fArray4505[i].copyFrom(vector3f);
        method6325();
    }

    double[] method6328(float f) {
        double[] ds = new double[3];
        float f_0_ = f * f;
        float f_1_ = f_0_ * f;
        double d = 3.0F * (aVector3fArray4505[1].x - aVector3fArray4505[0].x);
        double d_2_ = 3.0F * (aVector3fArray4505[2].x - aVector3fArray4505[1].x) - d;
        double d_3_ = aVector3fArray4505[3].x - aVector3fArray4505[0].x - d - d_2_;
        ds[0] = d_3_ * f_1_ + d_2_ * f_0_ + d * f + aVector3fArray4505[0].x;
        d = 3.0F * (aVector3fArray4505[1].y - aVector3fArray4505[0].y);
        d_2_ = 3.0F * (aVector3fArray4505[2].y - aVector3fArray4505[1].y) - d;
        d_3_ = aVector3fArray4505[3].y - aVector3fArray4505[0].y - d - d_2_;
        ds[1] = d_3_ * f_1_ + d_2_ * f_0_ + d * f + aVector3fArray4505[0].y;
        d = 3.0F * (aVector3fArray4505[1].z - aVector3fArray4505[0].z);
        d_2_ = 3.0F * (aVector3fArray4505[2].z - aVector3fArray4505[1].z) - d;
        d_3_ = aVector3fArray4505[3].z - aVector3fArray4505[0].z - d - d_2_;
        ds[2] = d_3_ * f_1_ + d_2_ * f_0_ + d * f + aVector3fArray4505[0].z;
        return ds;
    }

    float method6330(float f) {
        if (aFloat4504 == -1.0F) {
            method6331();
        }
        if (f <= 0.0F) {
            return 0.0F;
        }
        if (f >= aFloat4504) {
            return 1.0F;
        }
        float f_4_ = 0.0F;
        float f_5_ = aFloatArray4503[0];
        for (int i = 1; i < aFloatArray4503.length; i++) {
            if (f < f_5_) {
                float f_6_ = (f - f_4_) / (f_5_ - f_4_);
                float f_7_ = (float) (i - 1) / (float) aFloatArray4503.length;
                float f_8_ = (float) i / (float) aFloatArray4503.length;
                return f_7_ + (f_8_ - f_7_) * f_6_;
            }
            f_4_ = f_5_;
            f_5_ += aFloatArray4503[i];
        }
        float f_9_ = (f - f_4_) / (f_5_ - f_4_);
        float f_10_ = (float) (aFloatArray4503.length - 1) / (float) aFloatArray4503.length;
        return f_10_ + (1.0F - f_10_) * f_9_;
    }

    void method6331() {
        int i = 20;
        double[] ds = method6328(0.0F);
        float f = 0.0F;
        Vector3f vector3f = Vector3f.empty();
        for (int i_11_ = 1; i_11_ <= i; i_11_++) {
            double[] ds_12_ = method6328((float) i_11_ / (float) i);
            vector3f.x = (float) (ds_12_[0] - ds[0]);
            vector3f.y = (float) (ds_12_[1] - ds[1]);
            vector3f.z = (float) (ds_12_[2] - ds[2]);
            f += vector3f.distance();
            ds = ds_12_;
        }
        int i_13_ = (int) (f / 20.0F);
        if (i_13_ < i) {
            i_13_ = i;
        }
        aFloatArray4503 = new float[i_13_];
        ds = method6328(0.0F);
        float f_14_ = 0.0F;
        for (int i_15_ = 1; i_15_ <= i_13_; i_15_++) {
            double[] ds_16_ = method6328((float) i_15_ / (float) i_13_);
            vector3f.x = (float) (ds_16_[0] - ds[0]);
            vector3f.y = (float) (ds_16_[1] - ds[1]);
            vector3f.z = (float) (ds_16_[2] - ds[2]);
            float f_17_ = vector3f.distance();
            f_14_ += f_17_;
            aFloatArray4503[i_15_ - 1] = f_17_;
            ds = ds_16_;
        }
        aFloat4504 = f_14_;
    }

    float method6332() {
        if (aFloat4504 == -1.0F) {
            method6331();
        }
        return aFloat4504;
    }

    Vector3f method6336(int i) {
        return aVector3fArray4505[i];
    }
}
