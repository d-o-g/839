package com.jagex;

public abstract class DefaultProvidingVarpLoader extends BaseVarpDefinitionLoader implements DefaultValueProvider {

    protected VarpType type;

    DefaultProvidingVarpLoader(GameContext context, VarpType type, Language language, int count) {
        super(context, language, count);
        this.type = type;
    }

    @Override
    public int count() {
        return count * -1710250107;
    }

    public void encode(Buffer buffer, DefaultMapEntry class383) {
        buffer.writeShort(class383.key * 1960527763);
        if (class383.value instanceof Integer) {
            buffer.writeInt((Integer) class383.value);
        } else if (class383.value instanceof Long) {
            buffer.writeLong((Long) class383.value);
        } else if (class383.value instanceof String) {
            buffer.writeString((String) class383.value);
        } else if (class383.value instanceof Serializable) {
            ((Serializable) class383.value).encode(buffer);
        } else {
            throw new IllegalStateException();
        }
    }

    @Override
    public abstract Varp get(int id);

    @Override
    public Object getDefaultValue(int id) {
        Varp parameter = get(id);
        if (null == parameter || !parameter.method2278()) {
            return null;
        }

        return parameter.getDefaultValue();
    }

    public int getEncodedSize(DefaultMapEntry class383) {
        int bytes = 2;
        if (class383.value instanceof Integer) {
            bytes += 4;
        } else if (class383.value instanceof Long) {
            bytes += 8;
        } else if (class383.value instanceof String) {
            bytes += TimeZoneUtils.method4000((String) class383.value);
        } else if (class383.value instanceof Serializable) {
            bytes += ((Serializable) class383.value).encodedSize();
        } else {
            throw new IllegalStateException();
        }

        return bytes;
    }

    public DefaultMapEntry decode(Buffer buffer) {
        int id = buffer.readUShort();
        Varp parameter = get(id);
        if (!parameter.method2278()) {
            throw new IllegalStateException("");
        }

        DefaultMapEntry entry = new DefaultMapEntry(id);
        Class clazz = parameter.keyType.getValueType().classType;

        if (Integer.class == clazz) {
            entry.value = buffer.readInt();
        } else if (clazz == java.lang.Long.class) {
            entry.value = buffer.readLong();
        } else if (clazz == java.lang.String.class) {
            entry.value = buffer.readPrefixedString();
        } else if (Serializable.class.isAssignableFrom(clazz)) {
            try {
                Serializable serializable = (Serializable) clazz.newInstance();
                serializable.decode(buffer);
                entry.value = serializable;
            } catch (InstantiationException ex) {
            } catch (IllegalAccessException ex) {
            }
        } else {
            throw new IllegalStateException();
        }

        return entry;
    }

    public DefaultMapEntry decodeTypedEntry(Buffer buffer, ValueType type) {
        int id = buffer.readUShort();
        DefaultMapEntry class383 = new DefaultMapEntry(id);
        Class clazz = type.classType;

        if (java.lang.Integer.class == clazz) {
            class383.value = buffer.readInt();
        } else if (clazz == java.lang.Long.class) {
            class383.value = buffer.readLong();
        } else if (clazz == java.lang.String.class) {
            class383.value = buffer.readPrefixedString();
        } else if (Serializable.class.isAssignableFrom(clazz)) {
            try {
                Serializable serializable = (Serializable) clazz.newInstance();
                serializable.decode(buffer);
                class383.value = serializable;
            } catch (InstantiationException | IllegalAccessException ignored) {

            }
        } else {
            throw new IllegalStateException();
        }

        Varp parameter = get(id);
        if (!parameter.method2278() || parameter.keyType.getValueType() != type) {
            return null;
        }

        return class383;
    }

}