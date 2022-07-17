package com.jagex;

public class Class480_Sub37 extends Node {

    static DequeIterator<Class480_Sub37> iterator;

    public boolean aBool10311 = false;
    public int anInt10308;
    public int anInt10310;
    public int anInt10312;
    public int anInt10313;
    public int anInt10314;
    public int id = -2142492155;

    Class480_Sub37(int id) {
        this.id = 2142492155 * id;
    }

    public static Class480_Sub37 method7529() {
        if (null == Class495.aClass644_6820 || Class480_Sub37.iterator == null) {
            return null;
        }

        for (Class480_Sub37 o = Class480_Sub37.iterator.next(); o != null; o = Class480_Sub37.iterator.next()) {
            Class224 class224 = (Class224) Class495.aClass678_Sub8_6803.get(818539827 * o.id);
            if (null != class224 && class224.aBool2340
                    && class224.method4205(Class495.anInterface14_6806, Class495.anInterface12_6805)) {
                return o;
            }
        }

        return null;
    }

}