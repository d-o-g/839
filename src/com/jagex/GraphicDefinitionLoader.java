package com.jagex;

public class GraphicDefinitionLoader extends CachedDefinitionLoader<EffectDefinition> {

    public GraphicDefinitionLoader(GameContext context, Language language, Archive spotAnimations, Archive models) {
        super(context, language, spotAnimations, Js5ConfigGroup.GRAPHICS, 64, new GraphicDefinitionProvider(models));
    }

    @Override
    public void reset() {
        super.reset();
        ((BaseGraphicDefinitionProvider) provider).reset();
    }

    @Override
    public void sweep(int maximumAge) {
        super.sweep(maximumAge);
        ((BaseGraphicDefinitionProvider) provider).sweep(maximumAge);
    }

    @Override
    public void clearSoft() {
        super.clearSoft();
        ((BaseGraphicDefinitionProvider) provider).clearSoft();
    }

    public void reset(int i) {
        ((BaseGraphicDefinitionProvider) provider).clear(i);
    }

}