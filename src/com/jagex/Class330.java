package com.jagex;

public class Class330 implements Interface43 {
    public int anInt3566;
    public Class334 aClass334_3567;
    public int anInt3568;
    public int anInt3569;
    public int anInt3570;
    public int anInt3571;
    public int anInt3572;
    public Class349 aClass349_3573;
    public int anInt3574;
    public int anInt3575;
    public boolean aBool3576;
    Class330(int i, Class349 class349, Class334 class334, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_,
             int i_6_, boolean bool) {
        anInt3566 = i * 1247630969;
        aClass349_3573 = class349;
        aClass334_3567 = class334;
        anInt3568 = 235167759 * i_0_;
        anInt3569 = 1168615367 * i_1_;
        anInt3575 = i_2_ * -313798429;
        anInt3574 = i_3_ * 171480775;
        anInt3570 = i_4_ * 18612075;
        anInt3571 = 1518978903 * i_5_;
        anInt3572 = i_6_ * -113237917;
        aBool3576 = bool;
    }

    static final void method5804(ScriptExecutionContext class613) {
        Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
        Component class226 = class611.aClass226_7914;
        class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = class226.text;
    }

    static void method5806(Matrix4f class399, boolean bool, float f, float f_11_, float f_12_, float f_13_, int i,
                           int i_14_) {
        int i_16_ = Client.scene.method7686();
        int i_17_ = Client.scene.method7685();
        class399.method6559(f, f_11_, f_12_, f_13_, i_17_, i_16_, i, i_14_);
    }

    static final void method5807(Mobile mobile) {
        if (null != mobile.anIntArray11553 || mobile.anIntArray11518 != null) {
            boolean bool = true;
            CoordGrid class553 = Client.scene.getBase();
            for (int i_18_ = 0; i_18_ < mobile.anIntArray11553.length; i_18_++) {
                int i_19_ = -1;
                if (mobile.anIntArray11553 != null) {
                    i_19_ = mobile.anIntArray11553[i_18_];
                }
                if (-1 == i_19_) {
                    if (!mobile.method18024(i_18_, -1, (byte) -39)) {
                        bool = false;
                    }
                } else {
                    bool = false;
                    Vector3f vector3f = mobile.getCoordinateSpace().translation;
                    int i_22_;
                    int i_23_;
                    if (-1073741824 == (i_19_ & ~0x3fffffff)) {
                        int i_24_ = i_19_ & 0xfffffff;
                        int i_25_ = i_24_ >> 14;
                        int i_26_ = i_24_ & 0x3fff;
                        i_22_ = (int) vector3f.x - (256 + (i_25_ - class553.x * 2051316501) * 512);
                        i_23_ = (int) vector3f.z - ((i_26_ - -180305283 * class553.z) * 512 + 256);
                    } else if ((i_19_ & 0x8000) != 0) {
                        int i_27_ = i_19_ & 0x7fff;
                        Player class600_sub1_sub3_sub1_sub1 = Client.players[i_27_];
                        if (class600_sub1_sub3_sub1_sub1 != null) {
                            Vector3f vector3f_28_ = class600_sub1_sub3_sub1_sub1.getCoordinateSpace().translation;
                            i_22_ = (int) vector3f.x - (int) vector3f_28_.x;
                            i_23_ = (int) vector3f.z - (int) vector3f_28_.z;
                        } else {
                            mobile.method18024(i_18_, -1, (byte) 14);
                            continue;
                        }
                    } else {
                        ObjectNode class480_sub25 = Client.npcTable.get(i_19_);
                        if (class480_sub25 != null) {
                            Npc class600_sub1_sub3_sub1_sub2 = (Npc) class480_sub25.referent;
                            Vector3f vector3f_29_ = class600_sub1_sub3_sub1_sub2.getCoordinateSpace().translation;
                            i_22_ = (int) vector3f.x - (int) vector3f_29_.x;
                            i_23_ = (int) vector3f.z - (int) vector3f_29_.z;
                        } else {
                            mobile.method18024(i_18_, -1, (byte) -26);
                            continue;
                        }
                    }
                    if (i_22_ != 0 || 0 != i_23_) {
                        mobile.method18024(i_18_, (int) (Math.atan2(i_22_, i_23_) * 2607.5945876176133) & 0x3fff,
                                (byte) 56);
                    }
                }
            }
            if (bool) {
                mobile.anIntArray11553 = null;
                mobile.anIntArray11518 = null;
            }
        }
    }

    static final void method5808(Mobile m1, Mobile m2, int absolute, int xOffset,
                                 int yOffset, int i_33_, int i_34_, int i_35_, int i_36_, int i_37_) {
        int id = m2.getArmyIcon();
        if (id != -1) {
            Sprite sprite = (Sprite) Client.aClass168_10883.get(id);

            if (sprite == null) {
                Image[] images = ImageUtils.load(DequeIterator.images, id, 0);
                if (null == images) {
                    return;
                }

                sprite = Class60.activeToolkit.createSprite(images[0], true);
                Client.aClass168_10883.put(id, sprite);
            }

            Vector3f vector3f = m1.getCoordinateSpace().translation;
            Class42.method1043(m1.plane, (int) vector3f.x, (int) vector3f.z,
                    m1.boundSize() * 256, 0, false, false);
            int i_39_ = (int) (Client.aFloatArray10736[0] + xOffset - 18.0F);
            int i_40_ = (int) (yOffset + Client.aFloatArray10736[1] - 16.0F - 54.0F);
            i_39_ += absolute / 4 * 18;
            i_40_ += 18 * (absolute % 4);
            sprite.method2079(i_39_, i_40_);

            if (m2 == m1) {
                Class60.activeToolkit.method2747(i_39_ - 1, i_40_ - 1, 18, 18, -256);
            }

            Class477_Sub2 class477_sub2 = Class477_Sub2.method13574();
            class477_sub2.mobile = m2;
            class477_sub2.anInt9979 = -915276225 * i_39_;
            class477_sub2.anInt9980 = i_40_ * -162992783;
            class477_sub2.anInt9976 = -1830746149 * (16 + i_39_);
            class477_sub2.anInt9978 = -882224571 * (i_40_ + 16);
            Client.aClass649_10734.offer(class477_sub2);
        }
    }

    public static Class330 decode(Buffer buffer) {
        int i_6_ = buffer.readUByte();
        Class349 class349 = Class349.values()[buffer.readUByte()];
        Class334 class334 = Class334.values()[buffer.readUByte()];
        int i_7_ = buffer.readShort();
        int i_8_ = buffer.readShort();
        int i_9_ = buffer.readUShort();
        int i_10_ = buffer.readUShort();
        int i_11_ = buffer.readInt();
        int i_12_ = buffer.readInt();
        int i_13_ = buffer.readInt();
        boolean bool = buffer.readUByte() == 1;
        return new Class330(i_6_, class349, class334, i_7_, i_8_, i_9_, i_10_, i_11_, i_12_, i_13_, bool);
    }

    @Override
    public Class360 method316() {
        return Class360.aClass360_3881;
    }
}
