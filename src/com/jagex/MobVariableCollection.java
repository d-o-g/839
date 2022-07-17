package com.jagex;

public class MobVariableCollection implements VariableCollection {
    static int menuY;

    Mobile mobile;

    MobVariableCollection(Mobile mobile) {
        this.mobile = mobile;
    }

    @Override
    public int getVarpValue(Varp parameter) {
        return mobile.anInterface73_11556.getOrDefaultInt(parameter.index * 169834903);
    }

    @Override
    public int getVarpBitValue(VarpBit varbit) {
        return varbit.getValue(getVarpValue(varbit.varp));
    }

    @Override
    public long getLongVarpValue(Varp parameter) {
        return mobile.anInterface73_11556.getOrDefaultLong(parameter.index * 169834903);
    }

    @Override
    public void setIntVarp(Varp parameter, int value) {
        mobile.anInterface73_11556.put(parameter.index * 169834903, value);
    }

    @Override
    public Object getStringVarpValue(Varp parameter) {
        return mobile.anInterface73_11556.getOrDefaultObject(parameter.index * 169834903);
    }

    @Override
    public void setStringVarp(Varp parameter, Object object) {
        mobile.anInterface73_11556.put(parameter.index * 169834903, object);
    }

    @Override
    public void setVarpBit(VarpBit varbit, int i) throws VarpBitException {
        setIntVarp(varbit.varp, varbit.getValue(getVarpValue(varbit.varp), i));
    }

    @Override
    public void setLongVarp(Varp parameter, long l) {
        mobile.anInterface73_11556.put(parameter.index * 169834903, l);
    }

}