package com.jagex;

public class Class196 implements VarpInstrution {
    SkillVarpProvider aSkillVarpProvider_2086;
    int anInt2087;
    Class195 this$0;

    Class196(Class195 class195, Buffer buffer) {
        this$0 = class195;
        anInt2087 = buffer.readUShort() * 1033577505;
        aSkillVarpProvider_2086 = new SkillVarpProvider(buffer, false, false, class195.anBigBoyVarpProvider_2085);
    }

    @Override
    public void execute(MappingVarpProvider mappingVarpProvider) {
        mappingVarpProvider.method3830(547184609 * anInt2087, aSkillVarpProvider_2086);
    }

}