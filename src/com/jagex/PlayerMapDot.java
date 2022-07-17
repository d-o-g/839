package com.jagex;

import java.awt.datatransfer.Clipboard;

public class PlayerMapDot implements Identifiable {
    public static PlayerMapDot aPlayerMapDot_2091 = new PlayerMapDot(2, 1);
    public static PlayerMapDot aPlayerMapDot_2092 = new PlayerMapDot(1, 2);
    public static PlayerMapDot aPlayerMapDot_2093 = new PlayerMapDot(0, 0);
    public static Clipboard aClipboard2096;
    static Interface44 anInterface44_2095;
    int anInt2090;
    int id;

    PlayerMapDot(int i, int i_0_) {
        anInt2090 = i * -2065857869;
        id = i_0_ * 281529283;
    }

    public static PlayerMapDot[] values() {
        return new PlayerMapDot[]{aPlayerMapDot_2093, aPlayerMapDot_2092, aPlayerMapDot_2091};
    }

    public static int method3870(Quaternion quaternion) {
        Vector3f vector3f = Vector3f.create(0.0F, 0.0F, 1.0F);
        vector3f.invertAndMultiply(quaternion);
        double d = 1.5707963267948966 - Math.acos(vector3f.y);
        vector3f.cache();
        if (d < 0.0) {
            d = d + Math.PI + Math.PI;
        }
        return (int) (d / 6.283185307179586 * 16384.0) & 0x3fff;
    }

    public static void method3873(boolean bool) {
        Class495_Sub1.aBool10335 = bool;
    }

    static void method3869(Interface class221, Component class226) {
        if (null != class226) {
            if (-592186295 * class226.index != -1) {
                Component class226_1_ = class221.components[class226.parentUid * 1920469085 & 0xffff];
                if (class226_1_ != null) {
                    if (class226_1_.components2 == class226_1_.subComponents) {
                        class226_1_.subComponents = new Component[class226_1_.components2.length];
                        class226_1_.subComponents[0] = class226;
                        Class627.method13077(class226_1_.components2, 0, class226_1_.subComponents, 1,
                                class226.index * -592186295);
                        Class627.method13077(class226_1_.components2, class226.index * -592186295 + 1,
                                class226_1_.subComponents, class226.index * -592186295 + 1,
                                class226_1_.components2.length - -592186295 * class226.index - 1);
                    } else {
                        int i_2_ = 0;
                        Component[] class226s;
                        for (class226s = class226_1_.subComponents; i_2_ < class226s.length
                                && class226 != class226s[i_2_]; i_2_++) {

                        }
                        if (i_2_ < class226s.length) {
                            Class627.method13077(class226s, 0, class226s, 1, i_2_);
                            class226s[0] = class226;
                        }
                    }
                }
            } else {
                Component[] class226s = class221.getChildren();
                int i_3_;
                for (i_3_ = 0; i_3_ < class226s.length && class226 != class226s[i_3_]; i_3_++) {

                }
                if (i_3_ < class226s.length) {
                    Class627.method13077(class226s, 0, class226s, 1, i_3_);
                    class226s[0] = class226;
                }
            }
        }
    }

    static boolean method3871(String string, String string_4_) {
        Class31.loginType = 472539564;
        Class31.activeConnection = Client.lobbyConnection;
        return Class110.method2024(false, false, string, string_4_, -1L);
    }

    static final void method3872(Component class226, Interface class221, ScriptExecutionContext class613) {
        String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
        if (ScriptExecutionContext.method9239(string, class613) != null) {
            string = string.substring(0, string.length() - 1);
        }
        class226.anObjectArray2359 = World.method16248(string, class613);
        class226.aBool2483 = true;
    }

    @Override
    public int getId() {
        return -1750270741 * id;
    }

}