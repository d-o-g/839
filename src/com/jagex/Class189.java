package com.jagex;

public class Class189 implements VarpInstrution {
    public static String osName;
    static int[] anIntArray2059;
    static Class25 aClass25_2060;
    int anInt2055;
    int anInt2056;
    Class195 this$0;
    Class189(Class195 class195, Buffer buffer) {
        this$0 = class195;
        int i = buffer.readUShort();
        if (i != 65535) {
            anInt2055 = -399665301 * i;
            anInt2056 = buffer.readInt() * -434519549;
        } else {
            anInt2055 = 399665301;
            anInt2056 = 0;
        }
    }

    public static Class653 method3754() {
        if (Class34.aClass653_451 == null) {
            return Class653.aClass653_8226;
        }
        return Class34.aClass653_451;
    }

    static void method3752() {
        ItemTable.cache.clear();
    }

    @Override
    public void execute(MappingVarpProvider mappingVarpProvider) {
        if (-1 != 1770970435 * anInt2055) {
            try {
                mappingVarpProvider.method3836().setVarpBit(this$0.anBigBoyVarpProvider_2085.method120().get(anInt2055 * 1770970435),
                        -727811925 * anInt2056);
            } catch (VarpBitException exception_sub4) {

            }
        }
    }

}