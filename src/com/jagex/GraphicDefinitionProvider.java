package com.jagex;

public class GraphicDefinitionProvider extends BaseGraphicDefinitionProvider {

    GraphicDefinitionProvider(Archive models) {
        super(models);
    }

    @Override
    public Class<EffectDefinition> getClassType() {
        return EffectDefinition.class;
    }

    @Override
    public EffectDefinition provide(int id, DefinitionLoader loader) {
        return new EffectDefinition(id, this);
    }

}