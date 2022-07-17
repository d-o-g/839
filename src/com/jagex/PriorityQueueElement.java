package com.jagex;

public final class PriorityQueueElement<T> {
    int index;
    T object;

    PriorityQueueElement(T object, int index) {
        this.object = object;
        this.index = index * -769776549;
    }

    public static void method6072(Component[] components) {
        for (Component component : components) {
            if (null != component.loadListeners) {
                ScriptContext context = new ScriptContext();
                context.source = component;
                context.arguments = component.loadListeners;
                Script.execute(context, 2000000);
            }
        }
    }

    static Class275 method6074(int i) {
        if (948674401 * Class275.aClass275_3097.anInt3096 == i) {
            return Class275.aClass275_3097;
        } else if (i == Class275.aClass275_3095.anInt3096 * 948674401) {
            return Class275.aClass275_3095;
        } else if (i == Class275.aClass275_3094.anInt3096 * 948674401) {
            return Class275.aClass275_3094;
        }

        return null;
    }

}