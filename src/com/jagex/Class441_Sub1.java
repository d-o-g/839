package com.jagex;

final class Class441_Sub1 extends VarpType {

    Class441_Sub1(Js5ConfigGroup config, int id) {
        super(config, id);
    }

    @Override
    Object method7337(Varp parameter) {
        if (KeyType.ONE == parameter.keyType) {
            return -1;
        }

        return parameter.keyType.method7017();
    }

}