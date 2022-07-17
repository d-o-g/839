package com.jagex;

import java.util.Iterator;

public class CameraImpl extends Camera {

    int anInt9650 = 0;

    public CameraImpl(GameCharacterProvider provider) {
        super(Class278.aClass278_3127, provider);
    }

    public void method15142(Buffer buffer, int i) {
        int i_1_ = buffer.caret * -165875887;
        int i_2_ = buffer.readUByte();
        method4806(DynamicGameObject.method18083(i_2_ & 0x1));
        if (0 != (i_2_ & 0x8)) {
            Class257 class257 = Class157.method3301(buffer.readUByte());
            if (aClass257_2911 != class257) {
                try {
                    method4889(class257, true);
                } catch (ScriptException exception_sub3) {
                    exception_sub3.printStackTrace();
                }
            }
        }
        if ((i_2_ & 0x10) != 0) {
            Class270 class270 = Class626.method13054(buffer.readUByte());
            if (aClass270_2890 != class270) {
                try {
                    method4903(class270, true);
                } catch (ScriptException exception_sub3) {
                    exception_sub3.printStackTrace();
                }
            }
        }
        if (1 == (i_2_ >> 7 & 0x1)) {
            int i_3_ = buffer.readUShort();
            if ((i_3_ >> 426780991 * Class276.aClass276_3100.anInt3098 & 0x1) == 1) {
                aVector3f_2896.decode(buffer);
            }
            if ((i_3_ >> Class276.aClass276_3099.anInt3098 * 426780991 & 0x1) == 1) {
                aVector3f_2912.decode(buffer);
            }
            if (1 == (i_3_ >> 426780991 * Class276.aClass276_3102.anInt3098 & 0x1)) {
                aVector3f_2898.decode(buffer);
            }
            if ((i_3_ >> Class276.aClass276_3101.anInt3098 * 426780991 & 0x1) == 1) {
                aVector3f_2900.decode(buffer);
            }
            if (1 == (i_3_ >> 426780991 * Class276.aClass276_3108.anInt3098 & 0x1)) {
                aFloat2889 = buffer.readFloat();
                aFloat2921 = buffer.readFloat();
            }
            if ((i_3_ >> 426780991 * Class276.aClass276_3104.anInt3098 & 0x1) == 1) {
                aFloat2901 = buffer.readFloat();
                aFloat2916 = buffer.readFloat();
            }
            if (1 == (i_3_ >> Class276.aClass276_3103.anInt3098 * 426780991 & 0x1)) {
                aClass275_2887 = PriorityQueueElement.method6074(buffer.readUByte());
            }
            if (1 == (i_3_ >> 426780991 * Class276.aClass276_3105.anInt3098 & 0x1)) {
                anInt2894 = buffer.readUTriByte() * -1621565917;
                buffer.readUByte();
            }
            if ((i_3_ >> 426780991 * Class276.aClass276_3113.anInt3098 & 0x1) == 1) {
                int i_4_ = buffer.readUByte();
                aBool2917 = 1 == (i_4_ & 0x1);
                aBool2918 = (i_4_ & 0x2) == 2;
            }
            if (1 == (i_3_ >> Class276.aClass276_3107.anInt3098 * 426780991 & 0x1)) {
                int i_5_ = buffer.readUByte();
                for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
                    int i_7_ = buffer.readUByte();
                    int i_8_ = buffer.readUByte();
                    if (i_7_ == 0) {
                        method4827(i_8_, 578223817);
                    } else {
                        Class228 class228 = Class16.method688(buffer.readUByte(), -487603469);
                        boolean bool = true;
                        Iterator iterator = events.iterator();
                        while (iterator.hasNext()) {
                            CameraEvent cameraEvent = (CameraEvent) iterator.next();
                            if (i_8_ == cameraEvent.anInt11433 * 361545025) {
                                cameraEvent.method17882(buffer, 2109154231);
                                bool = false;
                                break;
                            }
                        }
                        if (bool) {
                            put(Class614.method10358(i_8_, class228, buffer, 1515023121));
                        }
                    }
                }
            }
            if (1 == (i_3_ >> Class276.aClass276_3106.anInt3098 * 426780991 & 0x1)) {
                anInt2919 = buffer.readUShort() * 676493399;
                aFloat2920 = buffer.readFloat();
            }
            if ((i_3_ >> Class276.aClass276_3109.anInt3098 * 426780991 & 0x1) == 1) {
                aClass264_2893 = Class40.method1029(buffer.readUByte());
            }
            if (1 == (i_3_ >> Class276.aClass276_3110.anInt3098 * 426780991 & 0x1)) {
                aVector3f_2907.decode(buffer);
                aVector3f_2904.decode(buffer);
                aFloat2891 = buffer.readFloat();
                aFloat2910 = buffer.readFloat();
            }
            if ((i_3_ >> 426780991 * Class276.aClass276_3111.anInt3098 & 0x1) == 1) {
                buffer.readFloat();
            }
            if ((i_3_ >> Class276.aClass276_3112.anInt3098 * 426780991 & 0x1) == 1) {
                aFloat2895 = buffer.readFloat();
            }
        }
        if (aClass642_2915 != null && (i_2_ >> 5 & 0x1) == 1) {
            aClass642_2915.method13244(buffer, -1307538733);
        }
        if (aClass281_2885 != null && (i_2_ >> 6 & 0x1) == 1) {
            aClass281_2885.method5256(buffer, (byte) -103);
        }
        if (-165875887 * buffer.caret - i_1_ != i) {
            throw new RuntimeException(new StringBuilder().append(-165875887 * buffer.caret - i_1_).append(",")
                    .append(i).toString());
        }
    }

    public int method15144() {
        anInt9650 += -1351553585;
        if (anInt9650 * -517277393 == 126) {
            anInt9650 = 0;
        }
        return anInt9650 * -517277393;
    }

}