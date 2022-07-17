package com.jagex;

public abstract class Class639 {

    Class639() throws Throwable {
        throw new Error();
    }

    static void method13200(Component component, int i, int i_0_) {
        if (Client.componentSelected) {
            ParameterDefinition parameter = -410965469 * LookupTable.anInt2647 != -1 ? ParameterDefinition.loader
                    .get(-410965469 * LookupTable.anInt2647) : null;
            if (Client.method17050(component).method15636((byte) -68)
                    && 0 != (Class577.selectedComponentAttributes * -1564025309 & 0x20)
                    && (parameter == null || component.getIntOrDefault(LookupTable.anInt2647 * -410965469, -125275839
                    * parameter.defaultInt) != parameter.defaultInt * -125275839)) {
                MenuItem.add(Client.selectedComponentAction, new StringBuilder().append(Client.aString10789).append(" ")
                                .append(Class60.arrow).append(" ").append(component.name).toString(), -29134223
                                * Class166_Sub8.anInt9550, 58, 1391525437 * component.itemId, 0L, component.index * -592186295,
                        component.uid * 1857819631, true, false, -592186295 * component.index << 32 | 1857819631
                                * component.uid, false);
            }
        }
        for (int i_2_ = 9; i_2_ >= 5; i_2_--) {
            String string = Class335.method5818(component, i_2_);
            if (null != string) {
                MenuItem.add(string, component.name, Class166_Sub21.method15136(component, i_2_), 1007,
                        1391525437 * component.itemId, i_2_ + 1, component.index * -592186295, 1857819631 * component.uid,
                        true, false, component.index * -592186295 << 32 | 1857819631 * component.uid, false);
            }
        }
        String string = Class341.method5865(component);
        if (string != null) {
            MenuItem.add(string, component.name, -858628785 * component.anInt2524, 25, 1391525437 * component.itemId, 0L,
                    component.index * -592186295, 1857819631 * component.uid, true, false,
                    component.index * -592186295 << 32 | 1857819631 * component.uid, false);
        }
        for (int i_3_ = 4; i_3_ >= 0; i_3_--) {
            String string_4_ = Class335.method5818(component, i_3_);
            if (null != string_4_) {
                MenuItem.add(string_4_, component.name, Class166_Sub21.method15136(component, i_3_), 57,
                        component.itemId * 1391525437, 1 + i_3_, -592186295 * component.index, 1857819631 * component.uid,
                        true, false, -592186295 * component.index << 32 | component.uid * 1857819631, false);
            }
        }
        if (Client.method17050(component).method15631((short) -8268)) {
            if (null != component.toolTip) {
                MenuItem.add(component.toolTip, "", -1, 30, 1391525437 * component.itemId, 0L, -592186295
                        * component.index, component.uid * 1857819631, true, false, component.index * -592186295 << 32
                        | 1857819631 * component.uid, false);
            } else {
                MenuItem.add(TranslatableString.CONTINUE.translate(Client.currentLanguage), "", -1, 30,
                        1391525437 * component.itemId, 0L, component.index * -592186295, component.uid * 1857819631, true,
                        false, component.index * -592186295 << 32 | component.uid * 1857819631, false);
            }
        }
    }
}
