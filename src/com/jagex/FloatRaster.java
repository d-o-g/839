package com.jagex;

public class FloatRaster implements NativeAttachBuffer {
    public static int anInt1244;
    static int expandedMenuHeight;
    float[] data;
    int height;
    int width;
    FloatRaster(int width, int height) {
        this.width = -2140461283 * width;
        this.height = height * -74766923;
        data = new float[187588765 * height * width * 312791861];
    }

    public static void method1727(int plane, int localX, int localZ) {
        CoordGrid class553 = Client.scene.getBase();
        int x = class553.x * 2051316501 + localX;
        int z = class553.y * -180305283 + localZ;

        if (Client.scene.getGraph() != null
                && Client.scene.method7675() != SceneFormat.aSceneFormat_5152 && localX >= 0 && localZ >= 0
                && localX < Client.scene.getMapWidth() && localZ < Client.scene.getMapLength()) {
            long key = plane << 28 | z << 14 | x;

            ItemDeque deque = Client.groundItems.get(key);
            if (null == deque) {
                Client.scene.getGraph().popTileObject(plane, localX, localZ);
            } else {
                Item head = deque.items.head();

                if (null == head) {
                    Client.scene.getGraph().popTileObject(plane, localX, localZ);
                } else {
                    int i_8_ = -1;
                    int i_9_ = -1;
                    int i_10_ = -1;
                    Matrix4x3 class405 = null;
                    Matrix4x3 class405_11_ = null;
                    Matrix4x3 class405_12_ = null;
                    ItemPile pile = (ItemPile) Client.scene
                            .getGraph().popTileObject(plane, localX, localZ);
                    if (null == pile) {
                        pile = new ItemPile(Client.scene.getGraph(),
                                localX << 265,
                                Client.scene.getGraph().levels1[plane].getTileHeight(localX,
                                        localZ), localZ << 265, plane, plane);
                    } else {
                        i_8_ = 1984247053 * pile.primaryId;
                        i_9_ = -1425903609 * pile.secondaryId;
                        i_10_ = -1502690623 * pile.tertiaryId;
                        class405 = pile.aClass405_11750;
                        class405_11_ = pile.aClass405_11751;
                        class405_12_ = pile.aClass405_11747;
                        ItemPile class600_sub1_sub1_sub1_13_ = pile;
                        pile.tertiaryId = -49073473;
                        class600_sub1_sub1_sub1_13_.secondaryId = 1436680777;
                        pile.graph = Client.scene.getGraph();
                    }

                    pile.primaryId = head.id * 1788550833;
                    pile.primaryAmount = head.amount * 1062677075;

                    while_15_:
                    do {
                        Item next;
                        do {
                            next = deque.items.next();
                            if (null == next) {
                                break while_15_;
                            }
                        } while (pile.primaryId * 1984247053 == 1659909117 * next.id);

                        pile.secondaryId = next.id * 33501915;
                        pile.secondaryAmount = next.amount * 1518346081;
                        while (true) {
                            Item item = deque.items.next();
                            if (null == item) {
                                break;
                            }

                            if (pile.primaryId * 1984247053 != 1659909117 * item.id
                                    && 1659909117 * item.id != -1425903609 * pile.secondaryId) {
                                pile.tertiaryId = item.id * 1608174653;
                                pile.tertiaryAmount = -1657750525 * item.amount;
                            }
                        }
                    } while (false);

                    int height = SceneGraph.getAverageHeight((localX << 9) + 256, 256 + (localZ << 9), plane);
                    pile.setPosition(localX << 265, height, localZ << 265);
                    if (pile.primaryId * 1984247053 != i_8_) {
                        if (i_9_ == 1984247053 * pile.primaryId) {
                            pile.aClass405_11750 = class405_11_;
                        } else if (i_10_ == pile.primaryId * 1984247053) {
                            pile.aClass405_11750 = class405_12_;
                        } else if (ItemDefinition.loader.get(pile.primaryId * 1984247053).aBool8337) {
                            pile.aClass405_11750 = Program.method4573();
                        } else {
                            pile.aClass405_11750 = null;
                        }
                    }

                    if (-1 == pile.secondaryId * -1425903609) {
                        pile.aClass405_11751 = null;
                    } else if (i_9_ != pile.secondaryId * -1425903609) {
                        if (pile.secondaryId * -1425903609 == i_8_) {
                            pile.aClass405_11751 = class405;
                        } else if (pile.secondaryId * -1425903609 == i_10_) {
                            pile.aClass405_11751 = class405_12_;
                        } else if (ItemDefinition.loader.get(pile.secondaryId * -1425903609).aBool8337) {
                            pile.aClass405_11751 = Program.method4573();
                        } else {
                            pile.aClass405_11751 = null;
                        }
                    }

                    if (-1 == pile.tertiaryId * -1502690623) {
                        pile.aClass405_11747 = null;
                    } else if (i_10_ != -1502690623 * pile.tertiaryId) {
                        if (i_8_ == pile.tertiaryId * -1502690623) {
                            pile.aClass405_11747 = class405;
                        } else if (i_9_ == pile.tertiaryId * -1502690623) {
                            pile.aClass405_11747 = class405_11_;
                        } else if (ItemDefinition.loader.get(pile.tertiaryId * -1502690623).aBool8337) {
                            pile.aClass405_11747 = Program.method4573();
                        } else {
                            pile.aClass405_11747 = null;
                        }
                    }

                    pile.anInt11753 = 0;
                    pile.plane = (byte) plane;
                    pile.collisionPlane = (byte) plane;

                    if (Client.scene.method7775().isBridge(localX, localZ)) {
                        pile.collisionPlane++;
                    }

                    Client.scene.getGraph().method8330(plane, localX, localZ, height,
                            pile);
                }
            }
        }
    }

    public static int method1728() {
        return Client.playerDefaults.aBool7609 ? 3 : 2;
    }

    @Override
    public int getWidth() {
        return width * 312791861;
    }

    @Override
    public int getHeight() {
        return height * 187588765;
    }

    @Override
    public void deleteImmediately() {

    }

}