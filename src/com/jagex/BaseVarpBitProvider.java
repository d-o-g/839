package com.jagex;

import java.util.Map;

public abstract class BaseVarpBitProvider implements DefinitionProvider<VarpBit> {
    static int[] anIntArray3291;
    Map<VarpType, DefinitionLoader<?>> loaders;

    BaseVarpBitProvider(Map map) {
        loaders = map;
    }

}