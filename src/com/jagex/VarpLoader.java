package com.jagex;

import java.util.Iterator;

public class VarpLoader extends DefaultProvidingVarpLoader {
    Archive archive;
    ReferenceCache<PlayerVariable> cache = new ReferenceCache<PlayerVariable>(64);

    public VarpLoader(GameContext context, VarpType type, Language language, Archive archive) {
        super(context, type, language, null != archive ? archive.childSize(type.getConfig().entry * 1179768225) : 0);
        this.archive = archive;
    }

    @Override
    public Iterator iterator() {
        return new PlayerVarpDefinitionIterator(this);
    }

    public void clear() {
        synchronized (cache) {
            cache.clear();
        }
    }

    public void sweep(int age) {
        synchronized (cache) {
            cache.sweep(age);
        }
    }

    public void clearSoft() {
        synchronized (cache) {
            cache.clearSoft();
        }
    }

    @Override
    public int count() {
        return super.count();
    }

    @Override
    public PlayerVariable get(int id) {
        PlayerVariable parameter;

        synchronized (cache) {
            parameter = cache.get(id);
            if (null == parameter) {
                parameter = load(id);
                cache.put(id, parameter);
            }
        }

        return parameter;
    }

    PlayerVariable load(int id) {
        byte[] data = archive.get(type.getConfig().entry * 1179768225, id);
        PlayerVariable parameter = new PlayerVariable(type, id);

        if (null != data) {
            parameter.decode(new Buffer(data));
        }

        return parameter;
    }

}