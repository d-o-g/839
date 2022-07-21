package com.jagex;

import java.util.HashSet;
import java.util.Set;

public class Class622 implements Identifiable {
    public static Class622 aClass622_8003 = new Class622("", 4);
    public static Class622 aClass622_8007;
    public static Class622 aClass622_8008;
    public static Class622 aClass622_8009 = new Class622("", 3, Class620.aClass620_7991);
    public static Class622 aClass622_8010;
    public static Class622 aClass622_8012;
    public static Class622 aClass622_8013;
    static Class622 aClass622_8004;
    static Class622 aClass622_8005;
    static Class622 aClass622_8006;
    static Class622 aClass622_8011;

    static {
        aClass622_8005 = new Class622("", 11, Class620.aClass620_7991);
        aClass622_8007 = new Class622("", 5, Class620.aClass620_7991, Class620.aClass620_7992);
        aClass622_8011 = new Class622("", 8, Class620.aClass620_7991, Class620.aClass620_7992);
        aClass622_8008 = new Class622("", 2, Class620.aClass620_7991, Class620.aClass620_7990);
        aClass622_8004 = new Class622("", 9, Class620.aClass620_7991, Class620.aClass620_7990);
        aClass622_8010 = new Class622("", 1, Class620.aClass620_7991, Class620.aClass620_7992);
        aClass622_8006 = new Class622("", 6, Class620.aClass620_7992);
        aClass622_8012 = new Class622("", 0, Class620.aClass620_7992);
        aClass622_8013 = new Class622("", 10, Class620.aClass620_7991);
    }

    int id;
    Set<Class620> aSet8015 = new HashSet<Class620>();

    Class622(String name, int ordinal) {
        id = ordinal * -1624921801;
    }

    Class622(String string, int i, Class620... class620s) {
        aSet8015 = new HashSet();
        this.id = -1624921801 * i;

        for (Class620 class620 : class620s) {
            aSet8015.add(class620);
        }
    }

    public static void method10431() {
        if (null != Class593.aClass343_7835) {
            Class593.aClass343_7835.method5875();
            Class593.aClass343_7835 = null;
        }
    }

    public static Class622[] values() {
        return new Class622[]{aClass622_8005, aClass622_8003, aClass622_8011, aClass622_8009, aClass622_8004,
                aClass622_8006, aClass622_8013, aClass622_8007, aClass622_8008, aClass622_8010, aClass622_8012};
    }

    static void processMinimapRendering(Toolkit class134, Component component, int i, int i_2_, byte i_3_) {
        if (Client.localPlayer != null) {
            class134.method2456();
            Class211 class211 = null;
            ClippingMask class129 = null;
            if (5 == 1558474223 * component.type) {
                class211 = component.method4298(class134);
                if (null == class211) {
                    return;
                }
                class129 = class211.aClass129_2183;
                if (component.width * 688089097 != 881990655 * class211.anInt2182
                        || 1362321717 * component.height != class211.anInt2180 * 1644092335) {
                    throw new IllegalStateException("");
                }
            }
            class134.method2760(i, i_2_, i + component.width * 688089097, i_2_ + 1362321717 * component.height);
            if (422203915 * Class63.anInt954 != 2 && 5 != 422203915 * Class63.anInt954 && Class63.aClass116_951 != null) {
                class134.method2395(Class63.anIntArray942);
                class134.method2494();
                CoordGrid base = Client.scene.getBase();
                int i_4_;
                int i_5_;
                int i_6_;
                int i_7_;
                if (1212513917 * Client.mapState == 6) {
                    i_4_ = 1327138123 * Client.anInt10706;
                    i_5_ = -2128941351 * Client.anInt10707;
                    i_6_ = (int) -Client.aFloat10787 & 0x3fff;
                    i_7_ = 4096;
                } else {
                    Vector3f vector3f = Client.localPlayer.getCoordinateSpace().translation;
                    i_4_ = (int) vector3f.x;
                    i_5_ = (int) vector3f.z;
                    if (3 == Client.mapState * 1212513917) {
                        i_6_ = (int) -(Client.camera.getYaw() * 2607.5945876176133)
                                + Client.pendingWalkX * 1093165775 & 0x3fff;
                    } else {
                        i_6_ = (int) -Client.aFloat10787 + Client.pendingWalkX * 1093165775 & 0x3fff;
                    }
                    i_7_ = 4096 - -251176784 * Client.pendingWalkY;
                }
                int i_8_ = i_4_ / 128 + 48;
                int i_9_ = 48 + Client.scene.getMapLength() * 4 - i_5_ / 128;
                if (class129 != null) {
                    Class63.aClass116_951.method2092(i + component.width * 688089097 / 2.0F, 1362321717
                            * component.height / 2.0F + i_2_, i_8_, i_9_, i_7_, i_6_ << 2, class129, i, i_2_);
                } else {
                    Class63.aClass116_951.method2090(688089097 * component.width / 2.0F + i, i_2_ + component.height
                            * 1362321717 / 2.0F, i_8_, i_9_, i_7_, i_6_ << 2, 1, -1, 1);
                }
                Class488 class488 = Client.scene.method7729();
                for (IntegerNode class480_sub24 = (IntegerNode) Class63.aClass644_948.head(); null != class480_sub24; class480_sub24 = (IntegerNode) Class63.aClass644_948.next()) {
                    int i_10_ = -1189875169 * class480_sub24.value;
                    int i_11_ = (class488.anIntArray6670[i_10_] >> 14 & 0x3fff) - base.x * 2051316501;
                    int i_12_ = (class488.anIntArray6670[i_10_] & 0x3fff) - base.z * -180305283;
                    int i_13_ = 2 + i_11_ * 4 - i_4_ / 128;
                    int i_14_ = i_12_ * 4 + 2 - i_5_ / 128;
                    Component.method7346(class134, class129, component, i, i_2_, i_13_, i_14_,
                            class488.anIntArray6671[i_10_], -541076374);
                }
                for (int i_15_ = 0; i_15_ < -399051693 * Class63.anInt947; i_15_++) {
                    int i_16_ = 4 * Class63.anIntArray945[i_15_] + 2 - i_4_ / 128;
                    int i_17_ = 4 * Class63.anIntArray946[i_15_] + 2 - i_5_ / 128;
                    ObjectDefinition class544 = Client.scene.getObjectLoader().get(
                            Class63.anIntArray953[i_15_]);
                    if (class544.morphisms != null) {
                        class544 = class544
                                .transform(PlayerFacade.instance, PlayerFacade.instance);
                        if (null == class544 || 1294173105 * class544.mapFunction == -1) {
                            continue;
                        }
                    }
                    Component.method7346(class134, class129, component, i, i_2_, i_16_, i_17_,
                            1294173105 * class544.mapFunction, -541076374);
                }
                for (ItemDeque deque = Client.groundItems.first(); deque != null; deque = Client.groundItems.next()) {
                    int level = (int) (deque.linkedKey * -4821875126325281949L >> 28 & 0x3L);
                    if (level == Client.floorLevel * -1503545849) {
                        int x = (int) (deque.linkedKey * -4821875126325281949L & 0x3fffL) - 2051316501 * base.x;
                        int y = (int) (-4821875126325281949L * deque.linkedKey >> 14 & 0x3fffL)
                                - base.z * -180305283;
                        int absoluteX = 2 + 4 * x - i_4_ / 128;
                        int absoluteY = 4 * y + 2 - i_5_ / 128;
                        Class369.addMapSprite(component, class129, i, i_2_, absoluteX, absoluteY, Client.mapDots[0]);
                    }
                }
                Class545.renderNpcsOnMinimap(class134, i_4_, i_5_, component, class129, i, i_2_);
                CutsceneObject.renderPlayersOnMinimap(i_4_, i_5_, component, class129, i, i_2_, 237098637);
                Orientation.renderHintArrowsOnMinimap(i_4_, i_5_, component, class211, i, i_2_, -864966782);
                if (Client.mapState * 1212513917 != 6) {
                    if (-1 != Class63.destinationX * 1134492539) {
                        int i_23_ = 2 + 243002860 * Class63.destinationX - i_4_ / 128
                                + (Client.localPlayer.boundSize() - 1) * 2;
                        int i_24_ = 2 + Class63.destinationY * -1692973740 - i_5_ / 128
                                + (Client.localPlayer.boundSize() - 1) * 2;
                        Class369.addMapSprite(component, class129, i, i_2_, i_23_, i_24_,
                                ChatMessageIcon.mapflags[Class63.aBool955 ? 1 : 0]);
                    }
                    if (!Client.localPlayer.aBool11783) {
                        class134.method2805(i + 688089097 * component.width / 2 - 1, component.height * 1362321717
                                / 2 + i_2_ - 1, 3, 3, -1);
                    }
                }
                class134.method2566(Class63.anIntArray942[0], Class63.anIntArray942[1], Class63.anIntArray942[2],
                        Class63.anIntArray942[3]);
            } else if (null != class129) {
                class134.method2467(-16777216, class129, i, i_2_);
            }
        }
    }

    public boolean method10432(Class620 class620) {
        return aSet8015.contains(class620);
    }

    @Override
    public int getId() {
        return id * 575429767;
    }

}