package com.jagex;

public class Class398 {
    Class398() throws Throwable {
        throw new Error();
    }

    public static void method6540(Vector3f vector3f, Vector3f vector3f_0_, Vector3f vector3f_1_, float f,
                                  Vector3f[] vector3fs) {
        Vector3f vector3f_2_ = Vector3f.difference(vector3f, vector3f_1_);
        float f_3_ = Vector3f.method6452(vector3f_2_, vector3f_2_) - f * f;
        float f_4_ = Vector3f.method6452(vector3f_0_, vector3f_2_);
        float f_5_ = f_4_ * f_4_ - f_3_;
        if (f_5_ < 0.0F) {
            Vector3f[] vector3fS_6_ = vector3fs;
            vector3fs[1] = null;
            vector3fS_6_[0] = null;
        } else if (f_5_ >= 9.765625E-4F) {
            float f_7_ = (float) Math.sqrt(f_5_);
            vector3fs[0] = Vector3f.empty();
            vector3fs[0].copyFrom(vector3f);
            vector3fs[0].add(Vector3f.product(Vector3f.copyOf(vector3f_0_), -f_4_ - f_7_));
            vector3fs[1] = Vector3f.empty();
            vector3fs[1].copyFrom(vector3f);
            vector3fs[1].add(Vector3f.product(Vector3f.copyOf(vector3f_0_), -f_4_ + f_7_));
        } else {
            vector3fs[0] = Vector3f.empty();
            vector3fs[0].copyFrom(vector3f);
            vector3fs[0].add(Vector3f.product(Vector3f.copyOf(vector3f_0_), -f_4_));
            vector3fs[1] = null;
        }
    }
}
