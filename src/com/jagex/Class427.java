package com.jagex;

public class Class427 {
    static Class427 aClass427_4873 = new Class427(3);
    static Class427 aClass427_4874 = new Class427(0);
    static Class427 aClass427_4875 = new Class427(6);
    static Class427 aClass427_4876 = new Class427(1);
    static Class427 aClass427_4877 = new Class427(5);
    static Class427 aClass427_4878 = new Class427(2);
    static Class427 aClass427_4879 = new Class427(4);
    int anInt4872;

    Class427(int i) {
        anInt4872 = i * -1756186431;
    }

    static void method7086(Component class226, int i, int i_0_) {
        Class56.aClass226_636 = class226;
        Class56.anInt637 = i * -1357380675;
        Class56.anInt638 = i_0_ * 534298803;
    }

    static final void method7091(Component[] class226s, int i) {
        for (Component class226 : class226s) {
            if (null != class226) {
                if (0 == 1558474223 * class226.type) {
                    if (class226.subComponents != null) {
                        method7091(class226.subComponents, i);
                    }
                    InterfaceNode lw = Client.openInterfaces.get(1857819631 * class226.uid);
                    if (lw != null) {
                        Component.method15440(lw.id * 1021060255, i);
                    }
                }
                if (0 == i && class226.anObjectArray2366 != null) {
                    ScriptContext class480_sub35 = new ScriptContext();
                    class480_sub35.source = class226;
                    class480_sub35.arguments = class226.anObjectArray2366;
                    Script.execute(class480_sub35);
                }
                if (i == 1 && class226.anObjectArray2454 != null) {
                    if (-592186295 * class226.index >= 0) {
                        Component class226_5_ = Component.lookup(class226.uid * 1857819631);
                        if (null == class226_5_ || null == class226_5_.components2
                                || -592186295 * class226.index >= class226_5_.components2.length
                                || class226 != class226_5_.components2[-592186295 * class226.index]) {
                            continue;
                        }
                    }
                    ScriptContext class480_sub35 = new ScriptContext();
                    class480_sub35.source = class226;
                    class480_sub35.arguments = class226.anObjectArray2454;
                    Script.execute(class480_sub35);
                }
            }
        }
    }

}