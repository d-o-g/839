package com.jagex;

import java.applet.Applet;

public class Class474 {
    public static final int anInt6546 = 1;
    static final int anInt6547 = 3;
    static final int anInt6548 = 0;
    static final int anInt6550 = 2;
    static String osName;
    static Applet applet = null;

    Class474() throws Throwable {
        throw new Error();
    }

    public static void method8102(int i, int i_2_, int i_3_) {
        i <<= 3;
        i_2_ <<= 3;
        i_3_ <<= 3;

        if (3 == Client.mapState * 1212513917) {
            if (Client.camera.method4837() == Class270.aClass270_2995) {
                Class281_Sub2 class281_sub2 = (Class281_Sub2) Client.camera.method4876();
                Quaternion quaternion = new Quaternion();
                Quaternion quaternion_5_ = new Quaternion();
                quaternion.setByAngle(0.0F, 1.0F, 0.0F, ((float) Math.PI) - (float) (Math.PI * i_2_ * 2.0 / 16384.0));
                Vector3f vector3f = new Vector3f(1.0F, 0.0F, 0.0F);
                vector3f.invertAndMultiply(quaternion);
                vector3f.invert();
                quaternion_5_.setByAngle(vector3f, (float) (2.0 * (Math.PI * i)) / 16384.0F);
                quaternion.multiplyBy(quaternion_5_);
                class281_sub2.aQuaternion_9749.copyFrom(quaternion);
            }
        } else {
            Client.aFloat10708 = i;
            Client.aFloat10787 = i_2_;

            if (Client.mapState * 1212513917 == 5) {
                Class155.cameraPitch = -1300105055 * i;
                Class550.cameraYaw = -1726145155 * i_2_;
                IncomingFrameMeta.anInt4473 = i_3_ * 796245051;
            }

            MovementType.method10452();
        }

        Client.aBool10611 = true;
    }

    static final int maximumLength(Class25 class25) {
        if (class25 == null) {
            return 12;
        }

        switch (class25.anInt345 * 1282054285) {
            default:
                return 12;
            case 6:
                return 20;
        }
    }

    static void method8101() {
        Class75.aClass168_1125.clear();
    }

    public static void init(Applet applet, String os) {
        Class474.applet = applet;
        Class474.osName = os;
    }

}