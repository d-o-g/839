package com.jagex;

final class CutsceneVariableProvider implements VariableProvider {
    public static int anInt1902;

    static boolean method3346() {
        return AsynchronousHttpRequestCreator.method6956(Script.aClass580_11401.aClass557_7760);
    }

    @Override
    public int getVarpValue(Varp parameter) {
        IntegerNode linkable = Class163.variables.get(parameter.index * 169834903);
        if (linkable == null) {
            return PlayerFacade.instance.getVarpValue(parameter);
        }

        return -1189875169 * linkable.value;
    }

    @Override
    public int getVarpBitValue(VarpBit variable) {
        IntegerNode linkable = Class163.variables.get(0x100000000L | -2037338825 * variable.id);
        if (linkable == null) {
            return PlayerFacade.instance.getVarpBitValue(variable);
        }

        return -1189875169 * linkable.value;
    }

}