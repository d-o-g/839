package com.jagex;

import java.util.Iterator;

class PlayerVarpDefinitionIterator implements Iterator<PlayerVariable> {
    VarpLoader loader;
    int index;

    PlayerVarpDefinitionIterator(VarpLoader loader) {
        this.loader = loader;
    }

    public static MenuItem method4143() {
        return MenuItem.aClass480_Sub31_Sub17_348;
    }

    static void method4139(Toolkit toolkit, Component component) {
        boolean bool = ItemDefinition.loader.getCachedSprite(toolkit, component.itemId * 1391525437, -1212380503
                        * component.itemAmount, component.borderThickness * 972044571, ~0xffffff | -1694773323 * component.shadowColor,
                1276796321 * component.anInt2435, component.item ? Client.localPlayer.appearance : null) == null;
        if (bool) {
            Class49.aClass644_579.pushBack(new Class480_Sub2(component.itemId * 1391525437, component.itemAmount * -1212380503,
                    component.borderThickness * 972044571, ~0xffffff | -1694773323 * component.shadowColor,
                    component.anInt2435 * 1276796321, component.item));
            Component.redraw(component);
        }
    }

    @Override
    public boolean hasNext() {
        return index * -612307497 < loader.count();
    }

    @Override
    public PlayerVariable next() {
        int next = (index += 1572296167) * -612307497 - 1;
        PlayerVariable definition = loader.cache.get(next);
        if (null != definition) {
            return definition;
        }

        return loader.load(next);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

}