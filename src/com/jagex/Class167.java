package com.jagex;

public class Class167 {
    public static Class167 aClass167_1926 = new Class167();
    public static Class167 aClass167_1927 = new Class167();
    protected static Class478 aClass478_1931;
    static Class167 aClass167_1928 = new Class167();
    static Class167 aClass167_1929 = new Class167();
    static Class167 aClass167_1930 = new Class167();

    static String getCombatDifferenceHtml(int i, int i_0_) {
        int difference = i_0_ - i;
        if (difference < -9) {
            return Item.getColorTags(16711680);
        } else if (difference < -6) {
            return Item.getColorTags(16723968);
        } else if (difference < -3) {
            return Item.getColorTags(16740352);
        } else if (difference < 0) {
            return Item.getColorTags(16756736);
        } else if (difference > 9) {
            return Item.getColorTags(65280);
        } else if (difference > 6) {
            return Item.getColorTags(4259584);
        } else if (difference > 3) {
            return Item.getColorTags(8453888);
        } else if (difference > 0) {
            return Item.getColorTags(12648192);
        }

        return Item.getColorTags(16776960);
    }

    static void method3414(Matrix4f matrix) {
        Class56.aClass399_644.copyFrom(matrix);
    }

}