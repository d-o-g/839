package com.jagex;

public class AnimationDefinitionProvider extends BaseAnimationDefinitionProvider {

    AnimationDefinitionProvider(DefinitionLoader loader, Archive frames, Archive bases) {
        super(loader, frames, bases);
    }

    @Override
    public Class getClassType() {
        return Animation.class;
    }

    @Override
    public Animation provide(int id, DefinitionLoader cache) {
        return new Animation(id, this);
    }

}