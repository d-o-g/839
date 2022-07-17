package com.jagex;

public class Class264 {
    static Class264 aClass264_2956;
    static Class264 aClass264_2957 = new Class264(0, true);
    static Class264 aClass264_2958;
    static Sprite[] hintMapEdges;

    static {
        aClass264_2956 = new Class264(1, true);
        aClass264_2958 = new Class264(2, false);
    }

    int anInt2959;
    boolean aBool2960;
    Class264(int i, boolean bool) {
        anInt2959 = i * 1712987795;
        aBool2960 = bool;
    }

    public static void method5001(Component[] components, int i, int i_3_, int i_4_, boolean bool) {
        for (Component component : components) {
            if (null != component && 1920469085 * component.parentUid == i) {
                Component.method15084(component, i_3_, i_4_, bool, (byte) -13);
                Class197.method3866(component, i_3_, i_4_, (byte) -2);
                if (-1909412215 * component.anInt2382 > component.scrollWidth * 731337999 - component.width * 688089097) {
                    component.anInt2382 = component.scrollWidth * 199147735 - component.width * -1727361663;
                }
                if (component.anInt2382 * -1909412215 < 0) {
                    component.anInt2382 = 0;
                }
                if (component.scrollPosition * -1881455913 > -184691147 * component.scrollHeight - 1362321717 * component.height) {
                    component.scrollPosition = component.scrollHeight * 1461672403 - component.height * 73385683;
                }
                if (component.scrollPosition * -1881455913 < 0) {
                    component.scrollPosition = 0;
                }

                if (0 == component.type * 1558474223) {
                    Class171.method3489(components, component, bool);
                }
            }
        }
    }

}