package com.jagex;

class Class193 implements Interface63 {
    public static KeyRecorder keyRecorder;
    Class186 this$0;

    Class193(Class186 class186) {
        this$0 = class186;
    }

    public static byte[] copy(byte[] array) {
        if (array == null) {
            return null;
        }
        byte[] is_4_ = new byte[array.length];
        System.arraycopy(array, 0, is_4_, 0, array.length);
        return is_4_;
    }

    static void method3844(int i, int i_6_) {
        for (MenuItem option = MenuItem.options.head(); option != null; option = MenuItem.options.next()) {
            if (MenuItem.method1628(option.opcode * -20536735) && i == 1353485821 * option.tertiary >> 16) {
                MenuItem.method727(option);
            }
        }
    }

    @Override
    public void method401(SomeSerializable interface66, int i, int i_0_, boolean bool) {
        this$0.method3649().add(interface66);
        if (bool) {
            this$0.method3588().put(i_0_, interface66);
        } else {
            this$0.method3587().put(i_0_, interface66, interface66.method445());
        }
    }

    @Override
    public void method404(SomeSerializable interface66) {
        if (null != interface66) {
            this$0.method3587().get(interface66.getId());
        }
    }

}