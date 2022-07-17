package com.jagex;

public final class TimedVariableCollection implements VariableCollection {

    //constants
    static final long aLong7458 = 4611686018427387904L;
    static final long aLong7459 = 1L;
    static final long aLong7460 = 500L;
    static final long aLong7462 = 4611686018427387903L;

    int[] updatedVarps;
    int[] varps;
    HashTable<LongNode> updates = new HashTable<>(128);

    public TimedVariableCollection() {
        updatedVarps = new int[Varp.varpLoader.count()];
        varps = new int[Varp.varpLoader.count()];
    }

    @Override
    public int getVarpValue(Varp varp) {
        return varps[varp.index * 169834903];
    }

    @Override
    public int getVarpBitValue(VarpBit varpbit) {
        return varpbit.getValue(varps[169834903 * varpbit.varp.index]);
    }

    @Override
    public long getLongVarpValue(Varp varp) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setIntVarp(Varp varp, int value) {
        varps[varp.index * 169834903] = value;
        LongNode linkable = updates.get(varp.index * 169834903);

        if (linkable != null) {
            linkable.value = (TimeUtil.time() + 500L) * 5662570005588035225L;
        } else {
            linkable = new LongNode(TimeUtil.time() + 500L);
            updates.put(169834903 * varp.index, linkable);
        }
    }

    public void update(Varp varp, int value) {
        updatedVarps[169834903 * varp.index] = value;
        LongNode linkable = updates.get(169834903 * varp.index);

        if (null != linkable) {
            if (4611686018427387905L != linkable.value * -8280988991890543191L) {
                linkable.value = (TimeUtil.time() + 500L | 0x4000000000000000L) * 5662570005588035225L;
            }
        } else {
            linkable = new LongNode(4611686018427387905L);
            updates.put(169834903 * varp.index, linkable);
        }
    }

    @Override
    public Object getStringVarpValue(Varp parameter) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setStringVarp(Varp parameter, Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setVarpBit(VarpBit varbit, int i) throws VarpBitException {
        int value = varbit.getValue(varps[169834903 * varbit.varp.index], i);
        setIntVarp(varbit.varp, value);
    }

    @Override
    public void setLongVarp(Varp parameter, long l) {
        throw new UnsupportedOperationException();
    }

    public int poll(boolean top) {
        long time = TimeUtil.time();
        for (LongNode linkable = top ? updates.first() : updates.next(); null != linkable; linkable = updates.next()) {
            if ((linkable.value * -8280988991890543191L & 0x3fffffffffffffffL) < time) {
                if ((-8280988991890543191L * linkable.value & 0x4000000000000000L) != 0L) {
                    int var = (int) (linkable.linkedKey * -4821875126325281949L);
                    varps[var] = updatedVarps[var];
                    linkable.unlink();
                    return var;
                }

                linkable.unlink();
            }
        }

        return -1;
    }

    public void reset() {
        for (int index = 0; index < Varp.varpLoader.count(); index++) {
            PlayerVariable var = Varp.varpLoader.get(index);
            if (var != null) {
                updatedVarps[index] = 0;
                varps[index] = 0;
            }
        }

        updates = new HashTable<>(128);
    }

    public void updateVarpBit(VarpBit varbit, int i) {
        try {
            int value = varbit.getValue(updatedVarps[varbit.varp.index * 169834903], i);
            update(varbit.varp, value);
        } catch (VarpBitException exception) {

        }
    }

}