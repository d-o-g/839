package com.jagex;

public interface VariableCollection extends VariableProvider {

    @Override
    int getVarpValue(Varp parameter);

    long getLongVarpValue(Varp parameter);

    Object getStringVarpValue(Varp parameter);

    @Override
    int getVarpBitValue(VarpBit varbit);

    void setIntVarp(Varp parameter, int value);

    void setLongVarp(Varp parameter, long l);

    void setStringVarp(Varp parameter, Object object);

    void setVarpBit(VarpBit varbit, int i) throws VarpBitException;

}