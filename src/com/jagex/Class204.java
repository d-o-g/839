package com.jagex;

public class Class204 implements VarpInstrution {

    int anInt2128;
    int anInt2129;
    Class195 this$0;

    Class204(Class195 class195, Buffer buffer) {
        this$0 = class195;
        anInt2128 = buffer.readUShort() * 233026689;
        anInt2129 = buffer.readUShort() * -1994264369;
    }

    @Override
    public void execute(MappingVarpProvider mappingVarpProvider) {
        mappingVarpProvider.method3781(anInt2128 * -1119843455, 1031607855 * anInt2129, 644814181);
        mappingVarpProvider.method3806(anInt2128 * -1119843455).method3888();
    }

}