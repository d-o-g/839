package com.jagex;

public class SunDefinitionLoader extends CachedDefinitionLoader {

    public SunDefinitionLoader(GameContext context, Language language, Archive config) {
        super(context, language, config, Js5ConfigGroup.SUNS, 16, new ReflectiveDefinitionProvider(SunDefinition.class));
    }

}