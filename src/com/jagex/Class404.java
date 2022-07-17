package com.jagex;

public final class Class404 {
    public float[] aFloatArray4554 = new float[9];

    public Class404() {
        method6719();
    }

    public Quaternion method6718() {
        Quaternion quaternion = new Quaternion();
        double d = 1.0F + aFloatArray4554[0] + aFloatArray4554[4] + aFloatArray4554[8];
        if (d > 1.0E-8) {
            float f = (float) (Math.sqrt(d) * 2.0);
            quaternion.x = (aFloatArray4554[7] - aFloatArray4554[5]) / f;
            quaternion.y = (aFloatArray4554[2] - aFloatArray4554[6]) / f;
            quaternion.z = (aFloatArray4554[3] - aFloatArray4554[1]) / f;
            quaternion.w = 0.25F * f;
        } else if (aFloatArray4554[0] > aFloatArray4554[4] && aFloatArray4554[0] > aFloatArray4554[8]) {
            float f = (float) (Math.sqrt(1.0F + aFloatArray4554[0] - aFloatArray4554[4] - aFloatArray4554[8]) * 2.0);
            quaternion.x = 0.25F * f;
            quaternion.y = (aFloatArray4554[3] + aFloatArray4554[1]) / f;
            quaternion.z = (aFloatArray4554[2] + aFloatArray4554[6]) / f;
            quaternion.w = (aFloatArray4554[7] - aFloatArray4554[5]) / f;
        } else if (aFloatArray4554[4] > aFloatArray4554[8]) {
            float f = (float) (Math.sqrt(1.0F + aFloatArray4554[4] - aFloatArray4554[0] - aFloatArray4554[8]) * 2.0);
            quaternion.x = (aFloatArray4554[3] + aFloatArray4554[1]) / f;
            quaternion.y = 0.25F * f;
            quaternion.z = (aFloatArray4554[7] + aFloatArray4554[5]) / f;
            quaternion.w = (aFloatArray4554[2] - aFloatArray4554[6]) / f;
        } else {
            float f = (float) (Math.sqrt(1.0F + aFloatArray4554[8] - aFloatArray4554[0] - aFloatArray4554[4]) * 2.0);
            quaternion.x = (aFloatArray4554[2] + aFloatArray4554[6]) / f;
            quaternion.y = (aFloatArray4554[7] + aFloatArray4554[5]) / f;
            quaternion.z = 0.25F * f;
            quaternion.w = (aFloatArray4554[3] - aFloatArray4554[1]) / f;
        }
        return quaternion;
    }

    void method6719() {
        aFloatArray4554[0] = 1.0F;
        aFloatArray4554[1] = 0.0F;
        aFloatArray4554[2] = 0.0F;
        aFloatArray4554[3] = 0.0F;
        aFloatArray4554[4] = 1.0F;
        aFloatArray4554[5] = 0.0F;
        aFloatArray4554[6] = 0.0F;
        aFloatArray4554[7] = 0.0F;
        aFloatArray4554[8] = 1.0F;
    }

}