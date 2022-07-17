package com.jagex;

public class Class480_Sub41_Sub1 extends InterfaceNode {
    Class606 aClass606_11269;

    public Class480_Sub41_Sub1(int i, int i_0_, Class606 class606) {
        super(i, i_0_);
        aClass606_11269 = class606;
    }

    @Override
    public boolean method16250() {
        ItemPile class600_sub1_sub1_sub1 = aClass606_11269.method10247((short) 128);
        if (class600_sub1_sub1_sub1 != null) {
            ScriptExecutionContext.method3463(Class520.aClass520_7188, id * 1021060255, -1, aClass606_11269,
                    class600_sub1_sub1_sub1, 347928517);
            return true;
        }
        return false;
    }
}
