package com.jagex;

public class Interface {

    public boolean closed;
    public Component[] components;
    Component[] componentsCopy;

    Interface(boolean bool, Component[] components) {
        this.components = components;
        closed = bool;
    }

    public static String filterName(CharSequence sequence, Class25 class25) {
        if (sequence == null) {
            return null;
        }
        int start = 0;
        int end = sequence.length();
        while (start < end && ProgramDefinition.illegalNameCharacter(sequence.charAt(start))) {
            start++;
        }
        while (end > start && ProgramDefinition.illegalNameCharacter(sequence.charAt(end - 1))) {
            end--;
        }
        int length = end - start;
        if (length < 1 || length > Class474.maximumLength(class25)) {
            return null;
        }
        StringBuilder builder = new StringBuilder(length);
        for (int index = start; index < end; index++) {
            char c = sequence.charAt(index);
            if (MovementType.method10455(c)) {
                char character = Class593.method10044(c);
                if ('\0' != character) {
                    builder.append(character);
                }
            }
        }
        if (builder.length() == 0) {
            return null;
        }
        return builder.toString();
    }

    static final void method9889(int index) {
        if (Component.loadInterface(index, null)) {
            PlayerDefaults.animateComponents(Class598.loadedInterfaces[index].components, -1);
        }
    }

    static void method5417(Interface class221, Component class226) {
        if (null != class226) {
            if (-1 != class226.index * -592186295) {
                Component class226_0_ = class221.getChild(1920469085 * class226.parentUid);
                if (class226_0_ != null) {
                    if (class226_0_.components2 == class226_0_.subComponents) {
                        class226_0_.subComponents = new Component[class226_0_.components2.length];
                        class226_0_.subComponents[class226_0_.subComponents.length - 1] = class226;
                        Class627.method13077(class226_0_.components2, 0, class226_0_.subComponents, 0,
                                -592186295 * class226.index);
                        Class627.method13077(class226_0_.components2, 1 + -592186295 * class226.index,
                                class226_0_.subComponents, class226.index * -592186295,
                                class226_0_.components2.length - -592186295 * class226.index - 1);
                    } else {
                        int i_1_ = 0;
                        Component[] class226s = class226_0_.subComponents;
                        while (i_1_ < class226s.length
                                && class226s[i_1_] != class226) {
                            i_1_++;
                        }
                        if (i_1_ < class226s.length) {
                            Class627.method13077(class226s, i_1_ + 1, class226s, i_1_, class226s.length - i_1_ - 1);
                            class226s[class226_0_.subComponents.length - 1] = class226;
                        }
                    }
                }
            } else {
                Component[] components = class221.getChildren();
                int i_2_ = 0;
                while (i_2_ < components.length && class226 != components[i_2_]) {
                    i_2_++;
                }
                if (i_2_ < components.length) {
                    Class627.method13077(components, 1 + i_2_, components, i_2_, components.length - i_2_ - 1);
                    components[components.length - 1] = class226;
                }
            }
        }
    }

    public static Interface get(int id) {
        return Class598.loadedInterfaces[id >> 16];
    }

    public static void method8775(Interface class221, Component class226) {
        Component class226_13_ = Class339.method5850(class221, class226, 50579382);
        int i_14_;
        int i_15_;
        if (null == class226_13_) {
            i_14_ = 1319181337 * Engine.screenWidth;
            i_15_ = Engine.screenHeight * -551672947;
        } else {
            i_14_ = 688089097 * class226_13_.width;
            i_15_ = 1362321717 * class226_13_.height;
        }
        Component.method15084(class226, i_14_, i_15_, false, (byte) -70);
        Class197.method3866(class226, i_14_, i_15_, (byte) -33);
    }

    public Component getChild(int id) {
        if (1857819631 * components[0].uid >>> 16 != id >>> 16) {
            throw new IllegalArgumentException();
        }
        return components[id & 0xffff];
    }

    public Component[] getChildren() {
        if (null == componentsCopy) {
            int length = components.length;
            componentsCopy = new Component[length];
            System.arraycopy(components, 0, componentsCopy, 0, components.length);
        }

        return componentsCopy;
    }

    public Component[] getComponents() {
        return componentsCopy == null ? components : componentsCopy;
    }

}