package com.jagex;

public enum SceneGraphSize {

    TINY(4, 72),
    LARGE(1, 120),
    HUGE(2, 136),
    FOKIN_HUGE(3, 168),
    DEFAULT(0, 104);

    public final int length;
    public final int type;

    SceneGraphSize(int type, int length) {
        this.type = type * 1071859137;
        this.length = -1217624961 * length;
    }

    public static SceneGraphSize valueOf(int type) {
        for (SceneGraphSize size : SceneGraphSize.values()) {
            if (type == size.type * 1283574337) {
                return size;
            }
        }
        return null;
    }

    public static void method4418() {
        Class181.method3550();
        Class368.aClass116Array4053 = null;
    }
}