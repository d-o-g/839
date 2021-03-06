package com.jagex;

public class Class401 {
    public static Class401 aClass401_8081;
    Class392[] aClass392Array4533 = new Class392[1];
    float[] aFloatArray4534 = new float[2];

    public Class401(Buffer buffer) {
        int i = buffer.readUSmart();
        aClass392Array4533[0] = new Class392();
        aClass392Array4533[0].method6326(0, Vector3f.from(buffer));
        aClass392Array4533[0].method6326(1, Vector3f.from(buffer));
        aFloatArray4534[0] = buffer.readFloat();
        Vector3f vector3f = Vector3f.from(buffer);
        Vector3f vector3f_3_ = Vector3f.from(buffer);
        Vector3f vector3f_4_ = Vector3f.difference(vector3f, vector3f_3_);
        vector3f_3_.cache();
        vector3f_3_ = vector3f_4_;
        vector3f_3_.add(vector3f);
        aClass392Array4533[0].method6326(3, vector3f);
        aClass392Array4533[0].method6326(2, vector3f_3_);
        aFloatArray4534[1] = buffer.readFloat();
        for (int i_5_ = 2; i_5_ < i; i_5_++) {
            Vector3f vector3f_6_ = Vector3f.from(buffer);
            Vector3f vector3f_7_ = Vector3f.from(buffer);
            Vector3f vector3f_8_ = Vector3f.difference(vector3f_6_, vector3f_7_);
            vector3f_7_.cache();
            vector3f_7_ = vector3f_8_;
            vector3f_7_.add(vector3f_6_);
            method6691(vector3f_6_, vector3f_7_, buffer.readFloat());
        }
    }

    public double[] method6666(float f) {
        float f_0_ = 0.0F;
        float f_1_ = 0.0F;
        for (Class392 element : aClass392Array4533) {
            f_1_ += element.method6332();
            if (f < f_1_) {
                float f_2_ = element.method6330(f - f_0_);
                return element.method6328(f_2_);
            }
            f_0_ = f_1_;
        }
        return aClass392Array4533[aClass392Array4533.length - 1].method6328(1.0F);
    }

    public float method6668() {
        float f = 0.0F;
        for (Class392 element : aClass392Array4533) {
            f += element.method6332();
        }
        return f;
    }

    public double[] method6671(float f) {
        int i = (int) f;
        if (i < aClass392Array4533.length) {
            return aClass392Array4533[i].method6328(f - i);
        }
        return aClass392Array4533[aClass392Array4533.length - 1].method6328(1.0F);
    }

    public float method6680(float f) {
        float f_9_ = 0.0F;
        float f_10_ = 0.0F;
        for (int i = 0; i < aClass392Array4533.length; i++) {
            f_10_ += aClass392Array4533[i].method6332();
            if (f < f_10_) {
                return aClass392Array4533[i].method6330(f - f_9_) + i;
            }
            f_9_ = f_10_;
        }
        return aClass392Array4533.length;
    }

    public float method6683(float f) {
        return method6689(method6680(f));
    }

    public int method6684() {
        return aClass392Array4533.length;
    }

    public float method6689(float f) {
        int i = (int) f;
        if (i + 1 < aFloatArray4534.length) {
            float f_11_ = aFloatArray4534[i];
            float f_12_ = aFloatArray4534[i + 1];
            float f_13_ = f - i;
            return (1.0F - f_13_) * f_11_ + f_13_ * f_12_;
        }
        return aFloatArray4534[aFloatArray4534.length - 1];
    }

    void method6691(Vector3f vector3f, Vector3f vector3f_14_, float f) {
        Class392[] class392s = new Class392[aClass392Array4533.length + 1];
        System.arraycopy(aClass392Array4533, 0, class392s, 0, aClass392Array4533.length);
        Class392 class392 = new Class392();
        Class392 class392_15_ = aClass392Array4533[aClass392Array4533.length - 1];
        class392.method6326(0, class392_15_.method6336(3));
        Vector3f vector3f_16_ = Vector3f.difference(class392_15_.method6336(3), class392_15_.method6336(2));
        class392.method6326(1, Vector3f.sum(class392_15_.method6336(3), vector3f_16_));
        class392.method6326(3, vector3f);
        class392.method6326(2, vector3f_14_);
        class392s[class392s.length - 1] = class392;
        aClass392Array4533 = class392s;
        float[] fs = new float[aFloatArray4534.length + 1];
        System.arraycopy(aFloatArray4534, 0, fs, 0, aFloatArray4534.length);
        fs[fs.length - 1] = f;
        aFloatArray4534 = fs;
    }
}
