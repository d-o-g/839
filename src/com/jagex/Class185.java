package com.jagex;

public class Class185 implements VarpInstrution {
    static int localRegionX;
    Class195 this$0;

    Class185(Class195 class195) {
        this$0 = class195;
    }

    public static boolean method3582() {
        return Class277.aBool3118;
    }

    public static Component method3584(int id, int child) {
        Component component = Component.lookup(id);
        if (child == -1) {
            return component;
        } else if (component == null || null == component.components2 || child >= component.components2.length) {
            return null;
        }

        return component.components2[child];
    }

    @Override
    public void execute(MappingVarpProvider mappingVarpProvider) {
        mappingVarpProvider.method3785();
    }

}