package com.jagex;

public class IdentikitDefinitionLoader extends CachedDefinitionLoader<IdentikitDefinition> {

    public IdentikitDefinitionLoader(GameContext context, Language language, Archive config, Archive models) {
        super(context, language, config, Js5ConfigGroup.IDENTIKITS, 64, new IdentikitDefinitionProvider(models));
    }

}