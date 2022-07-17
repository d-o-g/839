package com.jagex;

import java.util.*;

public class DefaultHashMap implements DefaultMap {

    DefaultValueProvider provider;
    Map<Integer, DefaultMapEntry> map;

    public DefaultHashMap(DefaultValueProvider provider) {
        this.provider = provider;
    }

    @Override
    public void clear() {
        if (map != null) {
            map.clear();
        }
    }

    @Override
    public int getOrDefaultInt(int key) {
        if (map != null) {
            DefaultMapEntry entry = map.get(key);
            if (entry != null) {
                return (Integer) entry.value;
            }
        }

        return (Integer) provider.getDefaultValue(key);
    }

    @Override
    public long getOrDefaultLong(int key) {
        if (map != null) {
            DefaultMapEntry entry = map.get(key);
            if (entry != null) {
                return (Long) entry.value;
            }
        }

        return (Long) provider.getDefaultValue(key);
    }

    @Override
    public Object getOrDefaultObject(int key) {
        if (map != null) {
            DefaultMapEntry entry = map.get(key);
            if (entry != null) {
                return entry.value;
            }
        }

        return provider.getDefaultValue(key);
    }

    @Override
    public Iterator<DefaultMapEntry> iterator() {
        if (map == null) {
            return Collections.emptyIterator();
        }

        return map.values().iterator();
    }

    @Override
    public void put(int key, int value) {
        if (map == null) {
            map = new HashMap<>();
            map.put(key, new DefaultMapEntry(key, value));
            return;
        }

        DefaultMapEntry entry = map.get(key);
        if (entry == null) {
            map.put(key, new DefaultMapEntry(key, value));
        } else {
            entry.value = value;
        }
    }

    @Override
    public void put(int key, long value) {
        if (map == null) {
            map = new HashMap<>();
            map.put(key, new DefaultMapEntry(key, value));
            return;
        }

        DefaultMapEntry entry = map.get(key);
        if (entry == null) {
            map.put(key, new DefaultMapEntry(key, value));
        } else {
            entry.value = value;
        }
    }

    @Override
    public void put(int key, Object object) {
        if (map == null) {
            map = new HashMap<>();
            map.put(key, new DefaultMapEntry(key, object));
            return;
        }

        DefaultMapEntry entry = map.get(key);
        if (entry == null) {
            map.put(key, new DefaultMapEntry(key, object));
        } else {
            entry.value = object;
        }
    }

    @Override
    public void remove(int key) {
        if (map != null) {
            map.remove(key);
        }
    }
}