package com.jagex;

public class CacheableDynamicEntity extends Cacheable {

    DynamicEntity animated;

    public CacheableDynamicEntity(DynamicEntity object) {
        animated = object;
    }

}