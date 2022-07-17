package com.jagex;

import java.util.Stack;

public class Class23 {
    public static Archive particles;
    static Class640 aClass640_326;
    public int anInt323;
    public int anInt324;
    public int anInt325;
    Class23(int i, int i_0_, int i_1_) {
        anInt325 = 95868497 * i;
        anInt323 = 1353269487 * i_0_;
        anInt324 = -1756324559 * i_1_;
    }

    public static void method752() {
        synchronized (LoadedEntity.stack) {
            LoadedEntity.stack = new Stack();
        }
    }

    static void method751() {
        ItemTable.models.clear();
    }

}