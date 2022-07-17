package com.jagex;

public class HitbarDefinitionProvider extends BaseHitbarDefinitionProvider implements DefinitionProvider<HitbarDefinition> {

    HitbarDefinitionProvider(Archive images) {
        super(images);
    }

    @Override
    public Class<HitbarDefinition> getClassType() {
        return HitbarDefinition.class;
    }

    @Override
    public HitbarDefinition provide(int id, DefinitionLoader loader) {
        return new HitbarDefinition(id, this);
    }

}