package com.jagex;

public class Class604 {
    Object[] anObjectArray7881;
    int anInt7882 = -2083631521;
    int[] anIntArray7883;
    Script scripts;
    long[] aLongArray7885;

    static final void method10231() {
        Class626.anInt8034 -= -710535363;
    }

    static final void pushSceneMod(SceneMod sceneMod, boolean rotate) {
        if (sceneMod.aBool10063) {
            if (sceneMod.anInt10070 * 1634822171 < 0
                    || ObjectDefinition.modelsLoaded(Client.scene.getObjectLoader(),
                    1634822171 * sceneMod.anInt10070, sceneMod.anInt10062 * 1948855293)) {
                if (!rotate) {
                    Class268.method5051(-618261599 * sceneMod.plane, sceneMod.group * -677397461,
                            sceneMod.localX * 1155137153, 51547319 * sceneMod.localZ,
                            sceneMod.anInt10070 * 1634822171, sceneMod.anInt10060 * 1217658007,
                            sceneMod.anInt10062 * 1948855293, -1, 0);
                } else {
                    SceneGraph.rotateMod(-618261599 * sceneMod.plane, sceneMod.group * -677397461,
                            sceneMod.localX * 1155137153, sceneMod.localZ * 51547319, null);
                }
                sceneMod.unlink();
            }
        } else if (sceneMod.aBool10069
                && 1155137153 * sceneMod.localX >= 1
                && 51547319 * sceneMod.localZ >= 1
                && 1155137153 * sceneMod.localX <= Client.scene.getMapWidth() - 2
                && 51547319 * sceneMod.localZ <= Client.scene.getMapLength() - 2
                && (42318177 * sceneMod.id < 0 || ObjectDefinition.modelsLoaded(
                Client.scene.getObjectLoader(), 42318177 * sceneMod.id,
                sceneMod.type * 357065445))) {
            if (!rotate) {
                Class268.method5051(sceneMod.plane * -618261599, sceneMod.group * -677397461,
                        sceneMod.localX * 1155137153, 51547319 * sceneMod.localZ,
                        sceneMod.id * 42318177, 1727643 * sceneMod.orientation,
                        357065445 * sceneMod.type, -1, 0);
            } else {
                SceneGraph.rotateMod(sceneMod.plane * -618261599, sceneMod.group * -677397461,
                        1155137153 * sceneMod.localX, 51547319 * sceneMod.localZ,
                        sceneMod.aClass540_10066);
            }
            sceneMod.aBool10069 = false;
            if (!rotate && sceneMod.id * 42318177 == sceneMod.anInt10070 * 1634822171
                    && -1 == 1634822171 * sceneMod.anInt10070) {
                sceneMod.unlink();
            } else if (!rotate && 42318177 * sceneMod.id == sceneMod.anInt10070 * 1634822171
                    && sceneMod.orientation * 1727643 == 1217658007 * sceneMod.anInt10060
                    && sceneMod.anInt10062 * 1948855293 == 357065445 * sceneMod.type) {
                sceneMod.unlink();
            }
        }
    }

}