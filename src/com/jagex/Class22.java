package com.jagex;

public class Class22 implements Identifiable {
    public static Class22 aClass22_306 = new Class22(8);
    public static Class22 aClass22_308 = new Class22(13);
    public static Class22 aClass22_309 = new Class22(3);
    public static Class22 aClass22_310 = new Class22(4);
    public static Class22 aClass22_315 = new Class22(9);
    public static Class22 aClass22_316 = new Class22(10);
    public static Class22 aClass22_318 = new Class22(12);
    public static Archive defaults;
    static Class22 aClass22_307 = new Class22(1);
    static Class22 aClass22_311 = new Class22(0);
    static Class22 aClass22_312 = new Class22(6);
    static Class22 aClass22_313 = new Class22(7);
    static Class22 aClass22_314 = new Class22(5);
    static Class22 aClass22_317 = new Class22(11);
    static Class22 aClass22_319 = new Class22(2);
    static int anInt322;
    int id;

    Class22(int i) {
        id = 1163972649 * i;
    }

    static void method749() {
        Class281_Sub3 class281_sub3 = (Class281_Sub3) Class50.camera.method4876();
        Class642_Sub1 class642_sub1 = (Class642_Sub1) Class50.camera.method4834();
        Vector3f vector3f = class281_sub3.method5224();
        Quaternion quaternion = class642_sub1.method16693();

        if (null != Client.aClass226_10798) {
            int i_0_ = Client.aClass226_10798.width * 688089097;
            int i_1_ = 1362321717 * Client.aClass226_10798.height;
            float f = 1000.0F;
            float f_2_ = (float) (2.0 * Math.atan(i_0_ / 2.0F / f));
            float f_3_ = (float) (2.0 * Math.atan(i_1_ / 2.0F / f));

            try {
                Class50.camera.method4854(f_2_, f_3_);
            } catch (ScriptException exception_sub3) {

            }
        }

        if (Client.recorder.rightButtonDown()) {
            Quaternion quaternion_4_ = Quaternion.cached();
            quaternion_4_.setByAngle(1.0F, 0.0F, 0.0F,
                    (Client.recorder.getMouseY() - Class50.mouseY * 962001503) / 200.0F);
            quaternion.multiplyBy(quaternion_4_);
            Vector3f vector3f_5_ = Vector3f.create(0.0F, 1.0F, 0.0F);
            vector3f_5_.invertAndMultiply(quaternion);
            Quaternion quaternion_6_ = Quaternion.cached();
            quaternion_6_.setByAngle(vector3f_5_,
                    (1055432981 * ScriptException.mouseX - Client.recorder.getMouseX()) / 200.0F);
            quaternion.multiplyBy(quaternion_6_);
            class642_sub1.method16685(quaternion);
        }

        ScriptException.mouseX = Client.recorder.getMouseX() * 2099684925;
        Class50.mouseY = Client.recorder.getMouseY() * -265035361;
        quaternion.invert();

        if (Class193.keyRecorder.held(98)) {
            Vector3f vector3f_7_ = Vector3f.create(0.0F, 0.0F, 25.0F);
            vector3f_7_.invertAndMultiply(quaternion);
            vector3f_7_.y *= -1.0F;
            vector3f.add(vector3f_7_);
        }

        if (Class193.keyRecorder.held(99)) {
            Vector3f vector3f_8_ = Vector3f.create(0.0F, 0.0F, -25.0F);
            vector3f_8_.invertAndMultiply(quaternion);
            vector3f_8_.y *= -1.0F;
            vector3f.add(vector3f_8_);
        }

        if (Class193.keyRecorder.held(96)) {
            Vector3f vector3f_9_ = Vector3f.create(-25.0F, 0.0F, 0.0F);
            vector3f_9_.invertAndMultiply(quaternion);
            vector3f_9_.y *= -1.0F;
            vector3f.add(vector3f_9_);
        }

        if (Class193.keyRecorder.held(97)) {
            Vector3f vector3f_10_ = Vector3f.create(25.0F, 0.0F, 0.0F);
            vector3f_10_.invertAndMultiply(quaternion);
            vector3f_10_.y *= -1.0F;
            vector3f.add(vector3f_10_);
        }

        Vector4i vector4i = new Vector4i(0, (int) vector3f.x, (int) vector3f.y, (int) vector3f.z);
        class281_sub3.method15304(vector4i);
        CoordGrid class553 = Client.scene.getBase();
        int i_11_ = 2051316501 * class553.x << 9;
        int i_12_ = class553.y * -180305283 << 9;
        Class50.camera.method4804(0.02F, Client.scene.method7696().tileHeights,
                Client.scene.method7775(), i_11_, i_12_);
    }

    @Override
    public int getId() {
        return id * 800312345;
    }

}