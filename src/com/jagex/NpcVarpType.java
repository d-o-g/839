package com.jagex;

final class NpcVarpType extends VarpType {
    static boolean aBool9950;

    NpcVarpType(Js5ConfigGroup config, int id) {
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