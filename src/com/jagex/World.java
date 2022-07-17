package com.jagex;

public class World extends Server {
    public String aString10365;
    public String aString10366;
    public int index = 649883847;
    public int anInt10370;
    String aString10367;
    int anInt10369;

    World() {

    }

    static final Object[] method16248(String string, ScriptExecutionContext class613) {
        Object[] objects = new Object[string.length() + 1];
        for (int i_0_ = objects.length - 1; i_0_ >= 1; i_0_--) {
            if (string.charAt(i_0_ - 1) == 's') {
                objects[i_0_] = class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
            } else if (string.charAt(i_0_ - 1) == 'l') {
                objects[i_0_] = new Long(class613.aLongArray7934[(class613.anInt7928 -= 423292651) * -47101501]);
            } else {
                objects[i_0_] = new Integer(class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045]);
            }
        }
        int i_1_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
        if (-1 != i_1_) {
            objects[0] = new Integer(i_1_);
        } else {
            objects = null;
        }
        return objects;
    }

    static int compare(World worldA, World worldB, int compareType, boolean ascending) {
        if (compareType == 1) { //compare population
            int popA = worldA.population * -1320445881;
            int popB = worldB.population * -1320445881;
            if (!ascending) {
                if (-1 == popA) {
                    popA = 2001;
                }
                if (popB == -1) {
                    popB = 2001;
                }
            }
            return popA - popB;
        }
        if (compareType == 2) {
            return VarpDefinition.method13983(worldA.method16236(), worldB.method16236(), Client.currentLanguage);
        }

        if (compareType == 3) {
            if (worldA.aString10366.equals("-")) {
                if (worldB.aString10366.equals("-")) {
                    return 0;
                }
                return ascending ? -1 : 1;
            }
            if (worldB.aString10366.equals("-")) {
                return ascending ? 1 : -1;
            }
            return VarpDefinition.method13983(worldA.aString10366, worldB.aString10366, Client.currentLanguage);
        }

        if (compareType == 4) { //compare flags
            return worldA.method9468(-877465065) ? worldB.method9468(-567506690) ? 0 : 1
                    : worldB.method9468(-817015346) ? -1 : 0;
        }

        if (compareType == 5) { //compare flags
            return worldA.method9467(914280779) ? worldB.method9467(914280779) ? 0 : 1
                    : worldB.method9467(914280779) ? -1 : 0;
        }

        if (compareType == 6) { //compare flags
            return worldA.method9466((byte) 0) ? worldB.method9466((byte) 0) ? 0 : 1
                    : worldB.method9466((byte) 0) ? -1 : 0;
        }

        if (compareType == 7) { //compare flags
            return worldA.method9475((byte) 32) ? worldB.method9475((byte) 32) ? 0 : 1
                    : worldB.method9475((byte) 32) ? -1 : 0;
        }

        if (compareType == 8) {
            int indexA = worldA.index * 1668853513;
            int indexB = worldB.index * 1668853513;
            if (ascending) {
                if (1000 == indexA) {
                    indexA = -1;
                }
                if (indexB == 1000) {
                    indexB = -1;
                }
            } else {
                if (-1 == indexA) {
                    indexA = 1000;
                }
                if (-1 == indexB) {
                    indexB = 1000;
                }
            }
            return indexA - indexB;
        }
        return worldA.anInt10370 * -1741841871 - worldB.anInt10370 * -1741841871;
    }

    public String method16236() {
        if (1124271573 * anInt10369 != 0) {
            return aString10367;
        }
        return method16245((byte) 91).aString7738;
    }

    public int method16238() {
        if (1124271573 * anInt10369 != 0) {
            return 1124271573 * anInt10369;
        }
        return method16245((byte) 38).anInt7739 * -1489454561;
    }

    Class578 method16245(byte i) {
        return Class367.aClass578Array4049[-604159251 * anInt7555];
    }
}
