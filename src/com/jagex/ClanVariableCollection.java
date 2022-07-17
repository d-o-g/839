package com.jagex;

public class ClanVariableCollection implements VariableCollection {

    ClanSettings settings;

    ClanVariableCollection(ClanSettings settings) {
        this.settings = settings;
    }

    static VariableCollection create(ClanSettings setting) {
        return new ClanVariableCollection(setting);
    }

    @Override
    public int getVarpValue(Varp parameter) {
        Integer integer = settings.getIntVariable(Client.game.id * -1589762327 << 16 | 169834903 * parameter.index);
        if (null == integer) {
            return (Integer) parameter.getDefaultValue();
        }

        return integer;
    }

    @Override
    public int getVarpBitValue(VarpBit varbit) {
        return varbit.getValue(getVarpValue(varbit.varp));
    }

    @Override
    public long getLongVarpValue(Varp parameter) {
        Long value = settings.getLongVariable(-1589762327 * Client.game.id << 16 | 169834903 * parameter.index);
        if (null == value) {
            return (Long) parameter.getDefaultValue();
        }

        return value;
    }

    @Override
    public void setIntVarp(Varp parameter, int value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object getStringVarpValue(Varp parameter) {
        if (KeyType.S_LOWER != parameter.keyType) {
            throw new IllegalArgumentException("");
        }

        return settings.getStringVariable(-1589762327 * Client.game.id << 16 | parameter.index * 169834903);
    }

    @Override
    public void setStringVarp(Varp parameter, Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setVarpBit(VarpBit varbit, int i) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setLongVarp(Varp parameter, long l) {
        throw new UnsupportedOperationException();
    }

}