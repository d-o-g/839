package com.jagex;

public class HashedVariableCollection implements VariableCollection {
    public static boolean aBool1483;
    public static Buffer aClass480_Sub17_1484;
    static int anInt1485;
    public DefaultMap map;

    public HashedVariableCollection(VarpType type, DefaultHashMap map) {
        this.map = map;
    }

    public HashedVariableCollection(DefaultProvidingVarpLoader loader) {
        this(loader, new DefaultHashMap(loader));
    }

    HashedVariableCollection(DefaultProvidingVarpLoader loader, DefaultHashMap map) {
        this(loader.type, map);
    }

    public static int method2262(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
        if ((i_6_ & 0x1) == 1) {
            int i_8_ = i_4_;
            i_4_ = i_5_;
            i_5_ = i_8_;
        }
        i_3_ &= 0x3;
        if (i_3_ == 0) {
            return i;
        }
        if (i_3_ == 1) {
            return i_2_;
        }
        if (i_3_ == 2) {
            return 7 - i - (i_4_ - 1);
        }
        return 7 - i_2_ - (i_5_ - 1);
    }

    @Override
    public int getVarpValue(Varp parameter) {
        return map.getOrDefaultInt(parameter.index * 169834903);
    }

    @Override
    public int getVarpBitValue(VarpBit varbit) {
        return varbit.getValue(getVarpValue(varbit.varp));
    }

    @Override
    public long getLongVarpValue(Varp parameter) {
        return map.getOrDefaultLong(169834903 * parameter.index);
    }

    @Override
    public void setIntVarp(Varp parameter, int value) {
        map.put(169834903 * parameter.index, value);
    }

    @Override
    public Object getStringVarpValue(Varp parameter) {
        return map.getOrDefaultObject(parameter.index * 169834903);
    }

    @Override
    public void setStringVarp(Varp parameter, Object object) {
        map.put(169834903 * parameter.index, object);
    }

    @Override
    public void setVarpBit(VarpBit varbit, int i) throws VarpBitException {
        setIntVarp(varbit.varp, varbit.getValue(getVarpValue(varbit.varp), i));
    }

    @Override
    public void setLongVarp(Varp parameter, long l) {
        map.put(parameter.index * 169834903, l);
    }

}