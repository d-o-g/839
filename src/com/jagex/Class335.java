package com.jagex;

public class Class335 {
    public static Class335 aClass335_3604 = new Class335();
    public static Class335 aClass335_3605 = new Class335();
    public static int[] HSV_TABLE;

    static String method5818(Component component, int index) {
        if (!Client.method17050(component).method15632(index) && null == component.anObjectArray2553) {
            return null;
        }

        if (component.actions == null || component.actions.length <= index
                || component.actions[index] == null || component.actions[index].trim().length() == 0) {
            if (Client.aBool10603) {
                return "Hidden-" + index;
            }

            return null;
        }

        return component.actions[index];
    }

}