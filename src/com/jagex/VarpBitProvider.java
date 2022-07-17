package com.jagex;

import java.util.Map;

public class VarpBitProvider extends BaseVarpBitProvider {

    static Font aClass132_9779;

    VarpBitProvider(Map map) {
        super(map);
    }

    @Override
    public Class getClassType() {
        return VarpBit.class;
    }

    @Override
    public VarpBit provide(int id, DefinitionLoader interface7) {
        return new VarpBit(id, this);
    }

}