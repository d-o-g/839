package com.jagex;

public class Class24 {
    public static FontSpecification p12Full;
    static int p12FullIndex;
    static int b12FullIndex;
    static int p11FullIndex;
    static FontSpecification p11Full;
    static Class587 aClass587_336;

    Class24() throws Throwable {
        throw new Error();
    }

    public static boolean method772(int i, int i_0_, int i_1_) {
        if (Class593.aClass343_7835 == null || Class593.aClass343_7835.method5888() == null) {
            return false;
        }
        if (i == i_0_) {
            return true;
        }
        Class326 class326 = Class593.aClass343_7835.method5888().method5845(i);
        Class326 class326_2_ = Class593.aClass343_7835.method5888().method5845(i_0_);
        Class326 class326_3_ = class326;
        while_51_:
        do {
            do {
                if (class326_3_ == null) {
                    break while_51_;
                }
                class326_3_ = class326_3_.method5782();
                if (class326_3_ == class326_2_) {
                    return true;
                }
            } while (class326_3_ != class326);
            return false;
        } while (false);
        class326_3_ = class326_2_;
        while_52_:
        do {
            do {
                if (class326_3_ == null) {
                    break while_52_;
                }
                class326_3_ = class326_3_.method5782();
                if (class326 == class326_3_) {
                    return true;
                }
            } while (class326_3_ != class326_2_);
            return false;
        } while (false);
        return false;
    }

    static final void method773(ScriptExecutionContext class613) {
        int i_4_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
        class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class613.aClass480_Sub33_7935.aClass283Array10233[i_4_].rank;
    }

    static void method775(Component class226, ClippingMask class129, int i, int i_10_, int i_11_, int i_12_, int i_13_,
                          String string, Font class132, FontSpecification class9, int i_14_, int i_15_) {
        int i_16_;
        if (3 == 1212513917 * Client.mapState) {
            i_16_ = (int) (Client.camera.getYaw() * 2607.5945876176133) + Client.pendingWalkX
                    * 1093165775 & 0x3fff;
        } else if (1212513917 * Client.mapState == 6) {
            i_16_ = (int) Client.aFloat10787 & 0x3fff;
        } else {
            i_16_ = 1093165775 * Client.pendingWalkX + (int) Client.aFloat10787 & 0x3fff;
        }
        int i_17_ = Math.max(688089097 * class226.width / 2, 1362321717 * class226.height / 2) + 10;
        int i_18_ = i_11_ * i_11_ + i_12_ * i_12_;
        if (i_18_ <= i_17_ * i_17_) {
            int i_19_ = Class373.SINE[i_16_];
            int i_20_ = Class373.COSINE[i_16_];
            if (1212513917 * Client.mapState != 6) {
                i_19_ = i_19_ * 256 / (256 + -1894746741 * Client.pendingWalkY);
                i_20_ = 256 * i_20_ / (Client.pendingWalkY * -1894746741 + 256);
            }
            int i_21_ = i_19_ * i_12_ + i_20_ * i_11_ >> 14;
            int i_22_ = i_12_ * i_20_ - i_19_ * i_11_ >> 14;
            int i_23_ = class9.textWidth(string, 100, null);
            int i_24_ = class9.textHeight(string, 100, 0, null);
            i_21_ -= i_23_ / 2;
            if (i_21_ >= -(688089097 * class226.width) && i_21_ <= 688089097 * class226.width
                    && i_22_ >= -(1362321717 * class226.height) && i_22_ <= class226.height * 1362321717) {
                class132.method2294(string, 688089097 * class226.width / 2 + i + i_21_, i_10_ + 1362321717
                                * class226.height / 2 - i_22_ - i_13_ - i_24_, i_23_, 50, i_14_, 0, 1, 0, 0, null, null,
                        class129, i, i_10_);
            }
        }
    }

    static void method776(Mobile mobile, int i) {
        if (null != mobile.anIntArray11538) {
            MovementType class624 = CompressionType.findIdentifiable(MovementType.values(), i);
            int i_26_ = mobile.anIntArray11538[class624.getSpeed()];
            if (i_26_ != mobile.animator.getAnimationId()) {
                mobile.animator.method13450(i_26_, mobile.animator.method13455());
                mobile.anInt11550 = 2108830049 * mobile.pathLength;
            }
        }
    }

    static Class480_Sub31_Sub18 method777(Buffer buffer, int i) {
        Class480_Sub31_Sub18 class480_sub31_sub18 = new Class480_Sub31_Sub18(i, buffer.readString(),
                buffer.readString(), buffer.readInt(), buffer.readInt(), buffer.readUByte() == 1, buffer.readUByte(),
                buffer.readUByte());
        int i_28_ = buffer.readUByte();
        for (int i_29_ = 0; i_29_ < i_28_; i_29_++) {
            class480_sub31_sub18.aClass644_11418.pushBack(new Class480_Sub32(buffer.readUByte(), buffer.readUShort(),
                    buffer.readUShort(), buffer.readUShort(), buffer.readUShort(), buffer.readUShort(), buffer
                    .readUShort(), buffer.readUShort(), buffer.readUShort()));
        }
        class480_sub31_sub18.method17862();
        return class480_sub31_sub18;
    }

    public static void initFonts(Archive fonts) {
        p11FullIndex = fonts.index("p11_full") * -1329879443;
        p12FullIndex = fonts.index("p12_full") * 400982355;
        b12FullIndex = fonts.index("b12_full") * 1896965543;
    }

}