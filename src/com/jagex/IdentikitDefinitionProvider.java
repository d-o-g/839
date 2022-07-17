package com.jagex;

public class IdentikitDefinitionProvider implements DefinitionProvider<IdentikitDefinition> {
    static boolean[][] aBoolArrayArray3303;
    Archive models;

    IdentikitDefinitionProvider(Archive models) {
        this.models = models;
    }

    public static final void method5495(int i) {
        for (SceneMod sceneMod = SceneMod.pendingSpawns.head(); sceneMod != null; sceneMod = SceneMod.pendingSpawns
                .next()) {
            if (!sceneMod.aBool10063) {
                sceneMod.aBool10069 = true;
                if (sceneMod.localX * 1155137153 >= 0 && sceneMod.localZ * 51547319 >= 0
                        && sceneMod.localX * 1155137153 < Client.scene.getMapWidth()
                        && 51547319 * sceneMod.localZ < Client.scene.getMapLength()) {
                    Class27.method789(sceneMod);
                }
            } else {
                sceneMod.unlink();
            }
        }
        for (SceneMod sceneMod = SceneMod.pendingRotations.head(); sceneMod != null; sceneMod = SceneMod.pendingRotations
                .next()) {
            if (!sceneMod.aBool10063) {
                sceneMod.aBool10069 = true;
            } else {
                sceneMod.unlink();
            }
        }
    }

    static void method5491(SceneGraphTile[][][] sceneGraphTiles, int i) {
        for (SceneGraphTile[][] sceneGraphTileS_2_ : sceneGraphTiles) {
            for (SceneGraphTile[] element : sceneGraphTileS_2_) {
                for (int i_4_ = 0; i_4_ < element.length; i_4_++) {
                    SceneGraphTile sceneGraphTile = element[i_4_];
                    if (null != sceneGraphTile) {
                        if (sceneGraphTile.decoration instanceof SceneObject) {
                            ((SceneObject) sceneGraphTile.decoration).method372();
                        }
                        if (sceneGraphTile.boundaryDecoration instanceof SceneObject) {
                            ((SceneObject) sceneGraphTile.boundaryDecoration).method372();
                        }
                        if (sceneGraphTile.linkedBoundaryDecoration instanceof SceneObject) {
                            ((SceneObject) sceneGraphTile.linkedBoundaryDecoration).method372();
                        }
                        if (sceneGraphTile.boundary instanceof SceneObject) {
                            ((SceneObject) sceneGraphTile.boundary).method372();
                        }
                        if (sceneGraphTile.linkedBoundary instanceof SceneObject) {
                            ((SceneObject) sceneGraphTile.linkedBoundary).method372();
                        }
                        for (EntityIterator entityIterator = sceneGraphTile.entityIterator; entityIterator != null; entityIterator = entityIterator.next) {
                            SceneEntity class600_sub1_sub3 = entityIterator.current;
                            if (class600_sub1_sub3 instanceof SceneObject) {
                                ((SceneObject) class600_sub1_sub3).method372();
                            }
                        }
                    }
                }
            }
        }
    }

    static final void method5492(ScriptExecutionContext class613, byte i) {
        int i_5_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
        Component class226 = Component.lookup(i_5_);
        Interface class221 = Class598.loadedInterfaces[i_5_ >> 16];
        int i_1_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
        if (class226.animation * 1642844085 != i_1_) {
            if (i_1_ != -1) {
                if (null == class226.aAnimator_2541) {
                    class226.aAnimator_2541 = new Animator_Sub3();
                }
                class226.aAnimator_2541.update(i_1_);
            } else {
                class226.aAnimator_2541 = null;
            }
            class226.animation = 1473373853 * i_1_;
            Component.redraw(class226);
        }
        if (-1 == class226.index * -592186295 && !class221.closed) {
            Class642_Sub4.method16758(class226.uid * 1857819631, (byte) -1);
        }
    }

    static final void method5493(ScriptExecutionContext class613) {
        int i_6_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
        Component class226 = Component.lookup(i_6_);
        Interface class221 = Class598.loadedInterfaces[i_6_ >> 16];
        ScriptExecutionContext.method1138(class226, class221, class613);
    }

    static final void method5494(ScriptExecutionContext class613, int i) {
        int i_7_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
        Component class226 = Component.lookup(i_7_);
        Interface class221 = Class598.loadedInterfaces[i_7_ >> 16];
        ScriptExecutionContext.method3552(class226, class221, class613);
    }

    @Override
    public Class<IdentikitDefinition> getClassType() {
        return IdentikitDefinition.class;
    }

    @Override
    public IdentikitDefinition provide(int id, DefinitionLoader<IdentikitDefinition> cache) {
        return new IdentikitDefinition(models);
    }

}