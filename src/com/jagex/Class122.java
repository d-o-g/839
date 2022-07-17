package com.jagex;

import java.util.Comparator;

class Class122 implements Comparator<Class459> {
    public static int anInt1470;
    static int anInt1471;
    Class343_Sub1 this$0;

    Class122(Class343_Sub1 class343_sub1) {
        this$0 = class343_sub1;
    }

    public static void insertBefore(Entity first, Entity second) {
        if (first.previous != null) {
            first.unlink();
        }

        first.previous = second;
        first.next = second.next;
        first.previous.next = first;
        first.next.previous = first;
    }

    static void method2241(int mouseX, int mouseY) {
        if (Class56.anInt632 * 1777775317 == 1) {
            Class467_Sub2.processAction(Class293.aClass480_Sub31_Sub17_3254, mouseX, mouseY, false);
        } else if (2 == Class56.anInt632 * 1777775317) {
            ZoneProt.method6030(mouseX, mouseY);
        }
        Class56.anInt632 = 0;
        Class293.aClass480_Sub31_Sub17_3254 = null;
    }

    @Override
    public int compare(Class459 a, Class459 b) {
        float f = a.method7562();
        float f_1_ = b.method7562();

        if (f_1_ > f) {
            return 1;
        } else if (f_1_ < f) {
            return -1;
        }

        return 0;
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

}