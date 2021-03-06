package com.jagex;

public class SkyboxDefinitionLoader extends CachedDefinitionLoader {

    public SkyboxDefinitionLoader(GameContext context, Language language, Archive config) {
        super(context, language, config, Js5ConfigGroup.SKYBOXES, 16, new ReflectiveDefinitionProvider(
                SkyboxDefinition.class));
    }

}