package com.jagex;

public class UnderlayDefinitionLoader extends CachedDefinitionLoader<UnderlayDefinition> {
    static int anInt10585;

    public UnderlayDefinitionLoader(GameContext context, Language language, Archive config) {
        super(context, language, config, Js5ConfigGroup.UNDERLAYS, 128, new ReflectiveDefinitionProvider(
                UnderlayDefinition.class));
    }

}