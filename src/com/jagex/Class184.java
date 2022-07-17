package com.jagex;

public class Class184 implements VarpInstrution {
    public static VarDefinitionLoader aClass77_Sub1_Sub1_2006;
    Class195 this$0;
    int anInt2005;
    Class184(Class195 class195, Buffer buffer) {
        this$0 = class195;
        anInt2005 = buffer.readUShort() * 1075970037;
    }

    static int method3580(char character, Language language) {
        int i_3_ = character << 4;
        if (Character.isUpperCase(character) || Character.isTitleCase(character)) {
            character = Character.toLowerCase(character);
            i_3_ = 1 + (character << 4);
        }

        if (241 == character && language == Language.SPANISH) {
            i_3_ = 1762;
        }

        return i_3_;
    }

    @Override
    public void execute(MappingVarpProvider mappingVarpProvider) {
        SkillVarpProvider skillVarpProvider = mappingVarpProvider.method3806(anInt2005 * -115379107);
        skillVarpProvider.method3888();
        skillVarpProvider.method3930();
        mappingVarpProvider.method3777(-115379107 * anInt2005);
    }

}