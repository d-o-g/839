package com.jagex;

public class Class480_Sub31_Sub2 extends Cacheable implements Definition, Interface71 {

    public int[] anIntArray10932;
    public int[] anIntArray10933;
    public int capacity;
    public int anInt10935 = 0;

    static final boolean method17300(SceneGraphTile[][][] sceneGraphTiles, int i, int x, int z, boolean bool, int i_6_) {
        byte[][][] is = Client.scene.method7694();
        byte i_7_ = bool ? (byte) 1 : (byte) (764752929 * Client.anInt10730 & 0xff);
        if (is[SceneGraph.localPlane * 1611577177][x][z] == i_7_) {
            return false;
        }

        TileFlags flags = Client.scene.method7775();
        if (0 == (flags.flags[SceneGraph.localPlane * 1611577177][x][z] & 0x4)) {
            return false;
        }

        int i_8_ = 0;
        int i_9_ = 0;
        Client.anIntArray10713[i_8_] = x;
        Client.anIntArray10594[i_8_++] = z;
        is[SceneGraph.localPlane * 1611577177][x][z] = i_7_;

        while (i_9_ != i_8_) {
            int i_10_ = Client.anIntArray10713[i_9_] & 0xffff;
            int i_11_ = Client.anIntArray10713[i_9_] >> 16 & 0xff;
            int i_12_ = Client.anIntArray10713[i_9_] >> 24 & 0xff;
            int i_13_ = Client.anIntArray10594[i_9_] & 0xffff;
            int i_14_ = Client.anIntArray10594[i_9_] >> 16 & 0xff;
            i_9_ = 1 + i_9_ & 0xfff;
            boolean bool_15_ = false;
            if ((flags.flags[1611577177 * SceneGraph.localPlane][i_10_][i_13_] & 0x4) == 0) {
                bool_15_ = true;
            }
            boolean bool_16_ = false;
            if (null != sceneGraphTiles) {
                int i_17_ = 1 + SceneGraph.localPlane * 1611577177;
                while_5_:
                for (; i_17_ <= 3; i_17_++) {
                    if (sceneGraphTiles[i_17_] != null && 0 == (flags.flags[i_17_][i_10_][i_13_] & 0x8)) {
                        if (bool_15_ && null != sceneGraphTiles[i_17_][i_10_][i_13_]) {
                            if (null != sceneGraphTiles[i_17_][i_10_][i_13_].boundary) {
                                int i_18_ = Class257.method4765(i_11_);
                                if (i_18_ == sceneGraphTiles[i_17_][i_10_][i_13_].boundary.aShort11489
                                        || null != sceneGraphTiles[i_17_][i_10_][i_13_].linkedBoundary
                                        && i_18_ == sceneGraphTiles[i_17_][i_10_][i_13_].linkedBoundary.aShort11489) {
                                    continue;
                                }
                                if (i_12_ != 0) {
                                    int i_19_ = Class257.method4765(i_12_);
                                    if (i_19_ == sceneGraphTiles[i_17_][i_10_][i_13_].boundary.aShort11489
                                            || null != sceneGraphTiles[i_17_][i_10_][i_13_].linkedBoundary
                                            && sceneGraphTiles[i_17_][i_10_][i_13_].linkedBoundary.aShort11489 == i_19_) {
                                        continue;
                                    }
                                }
                                if (i_14_ != 0) {
                                    int i_20_ = Class257.method4765(i_14_);
                                    if (sceneGraphTiles[i_17_][i_10_][i_13_].boundary.aShort11489 == i_20_
                                            || sceneGraphTiles[i_17_][i_10_][i_13_].linkedBoundary != null
                                            && sceneGraphTiles[i_17_][i_10_][i_13_].linkedBoundary.aShort11489 == i_20_) {
                                        continue;
                                    }
                                }
                            }
                            SceneGraphTile sceneGraphTile = sceneGraphTiles[i_17_][i_10_][i_13_];
                            if (sceneGraphTile.entityIterator != null) {
                                for (EntityIterator entityIterator = sceneGraphTile.entityIterator; null != entityIterator; entityIterator = entityIterator.next) {
                                    SceneEntity class600_sub1_sub3 = entityIterator.current;
                                    if (class600_sub1_sub3 instanceof SceneObject) {
                                        SceneObject interface55 = (SceneObject) class600_sub1_sub3;
                                        int i_21_ = interface55.getType();
                                        int i_22_ = interface55.getOrientation();
                                        if (21 == i_21_) {
                                            i_21_ = 19;
                                        }
                                        int i_23_ = i_21_ | i_22_ << 6;
                                        if (i_23_ == i_11_ || 0 != i_12_ && i_12_ == i_23_ || 0 != i_14_
                                                && i_14_ == i_23_) {
                                            continue while_5_;
                                        }
                                    }
                                }
                            }
                        }
                        SceneGraphTile sceneGraphTile = sceneGraphTiles[i_17_][i_10_][i_13_];
                        if (sceneGraphTile != null && null != sceneGraphTile.entityIterator) {
                            for (EntityIterator entityIterator = sceneGraphTile.entityIterator; null != entityIterator; entityIterator = entityIterator.next) {
                                SceneEntity class600_sub1_sub3 = entityIterator.current;
                                if (class600_sub1_sub3.endX != class600_sub1_sub3.startX
                                        || class600_sub1_sub3.startY != class600_sub1_sub3.endY) {
                                    short i_24_ = class600_sub1_sub3.startX;
                                    short i_25_ = class600_sub1_sub3.endX;
                                    short i_26_ = class600_sub1_sub3.startY;
                                    short i_27_ = class600_sub1_sub3.endY;
                                    int i_28_ = Math.max(0, Math.min(i_24_, is[i_17_].length - 1));
                                    int i_29_ = Math.max(0, Math.min(i_26_, is[i_17_][0].length - 1));
                                    int i_30_ = Math.max(0, Math.min(i_25_, is[i_17_].length - 1));
                                    int i_31_ = Math.max(0, Math.min(i_27_, is[i_17_][0].length - 1));
                                    for (; i_28_ <= i_30_; i_28_++) {
                                        for (; i_29_ <= i_31_; i_29_++) {
                                            is[i_17_][i_28_][i_29_] = i_7_;
                                        }
                                    }
                                }
                            }
                        }
                        is[i_17_][i_10_][i_13_] = i_7_;
                        bool_16_ = true;
                    }
                }
            }
            if (bool_16_) {
                int i_32_ = Client.scene.getGraph().levels1[1611577177 * SceneGraph.localPlane + 1]
                        .getTileHeight(i_10_, i_13_);
                if (Client.anIntArray10746[i] < i_32_) {
                    Client.anIntArray10746[i] = i_32_;
                }
                int i_33_ = i_10_ << 9;
                int i_34_ = i_13_ << 9;
                if (Client.anIntArray10747[i] > i_33_) {
                    Client.anIntArray10747[i] = i_33_;
                } else if (Client.anIntArray10748[i] < i_33_) {
                    Client.anIntArray10748[i] = i_33_;
                }
                if (Client.anIntArray10750[i] > i_34_) {
                    Client.anIntArray10750[i] = i_34_;
                } else if (Client.anIntArray10749[i] < i_34_) {
                    Client.anIntArray10749[i] = i_34_;
                }
            }
            if (!bool_15_) {
                if (i_10_ >= 1 && i_7_ != is[1611577177 * SceneGraph.localPlane][i_10_ - 1][i_13_]) {
                    Client.anIntArray10713[i_8_] = i_10_ - 1 | 0x120000 | ~0x2cffffff;
                    Client.anIntArray10594[i_8_] = i_13_ | 0x130000;
                    i_8_ = i_8_ + 1 & 0xfff;
                    is[SceneGraph.localPlane * 1611577177][i_10_ - 1][i_13_] = i_7_;
                }
                if (++i_13_ < Client.scene.getMapLength()) {
                    if (i_10_ - 1 >= 0
                            && i_7_ != is[SceneGraph.localPlane * 1611577177][i_10_ - 1][i_13_]
                            && 0 == (flags.flags[SceneGraph.localPlane * 1611577177][i_10_][i_13_] & 0x4)
                            && 0 == (flags.flags[1611577177 * SceneGraph.localPlane][i_10_ - 1][i_13_ - 1] & 0x4)) {
                        Client.anIntArray10713[i_8_] = i_10_ - 1 | 0x120000 | 0x52000000;
                        Client.anIntArray10594[i_8_] = i_13_ | 0x130000;
                        i_8_ = i_8_ + 1 & 0xfff;
                        is[1611577177 * SceneGraph.localPlane][i_10_ - 1][i_13_] = i_7_;
                    }
                    if (i_7_ != is[1611577177 * SceneGraph.localPlane][i_10_][i_13_]) {
                        Client.anIntArray10713[i_8_] = i_10_ | 0x520000 | 0x13000000;
                        Client.anIntArray10594[i_8_] = i_13_ | 0x530000;
                        i_8_ = 1 + i_8_ & 0xfff;
                        is[1611577177 * SceneGraph.localPlane][i_10_][i_13_] = i_7_;
                    }
                    if (1 + i_10_ < Client.scene.getMapWidth()
                            && is[1611577177 * SceneGraph.localPlane][i_10_ + 1][i_13_] != i_7_
                            && (flags.flags[1611577177 * SceneGraph.localPlane][i_10_][i_13_] & 0x4) == 0
                            && 0 == (flags.flags[1611577177 * SceneGraph.localPlane][1 + i_10_][i_13_ - 1] & 0x4)) {
                        Client.anIntArray10713[i_8_] = i_10_ + 1 | 0x520000 | ~0x6dffffff;
                        Client.anIntArray10594[i_8_] = i_13_ | 0x530000;
                        i_8_ = i_8_ + 1 & 0xfff;
                        is[SceneGraph.localPlane * 1611577177][1 + i_10_][i_13_] = i_7_;
                    }
                }
                i_13_--;
                if (i_10_ + 1 < Client.scene.getMapWidth()
                        && is[1611577177 * SceneGraph.localPlane][1 + i_10_][i_13_] != i_7_) {
                    Client.anIntArray10713[i_8_] = i_10_ + 1 | 0x920000 | 0x53000000;
                    Client.anIntArray10594[i_8_] = i_13_ | 0x930000;
                    i_8_ = i_8_ + 1 & 0xfff;
                    is[SceneGraph.localPlane * 1611577177][i_10_ + 1][i_13_] = i_7_;
                }
                if (--i_13_ >= 0) {
                    if (i_10_ - 1 >= 0
                            && is[SceneGraph.localPlane * 1611577177][i_10_ - 1][i_13_] != i_7_
                            && (flags.flags[1611577177 * SceneGraph.localPlane][i_10_][i_13_] & 0x4) == 0
                            && 0 == (flags.flags[SceneGraph.localPlane * 1611577177][i_10_ - 1][1 + i_13_] & 0x4)) {
                        Client.anIntArray10713[i_8_] = i_10_ - 1 | 0xd20000 | 0x12000000;
                        Client.anIntArray10594[i_8_] = i_13_ | 0xd30000;
                        i_8_ = i_8_ + 1 & 0xfff;
                        is[SceneGraph.localPlane * 1611577177][i_10_ - 1][i_13_] = i_7_;
                    }
                    if (is[SceneGraph.localPlane * 1611577177][i_10_][i_13_] != i_7_) {
                        Client.anIntArray10713[i_8_] = i_10_ | 0xd20000 | ~0x6cffffff;
                        Client.anIntArray10594[i_8_] = i_13_ | 0xd30000;
                        i_8_ = 1 + i_8_ & 0xfff;
                        is[SceneGraph.localPlane * 1611577177][i_10_][i_13_] = i_7_;
                    }
                    if (1 + i_10_ < Client.scene.getMapWidth()
                            && is[SceneGraph.localPlane * 1611577177][i_10_ + 1][i_13_] != i_7_
                            && (flags.flags[SceneGraph.localPlane * 1611577177][i_10_][i_13_] & 0x4) == 0
                            && (flags.flags[1611577177 * SceneGraph.localPlane][1 + i_10_][1 + i_13_] & 0x4) == 0) {
                        Client.anIntArray10713[i_8_] = 1 + i_10_ | 0x920000 | ~0x2dffffff;
                        Client.anIntArray10594[i_8_] = i_13_ | 0x930000;
                        i_8_ = 1 + i_8_ & 0xfff;
                        is[SceneGraph.localPlane * 1611577177][i_10_ + 1][i_13_] = i_7_;
                    }
                }
            }
        }
        if (-1000000 != Client.anIntArray10746[i]) {
            Client.anIntArray10746[i] += 40;
            Client.anIntArray10747[i] -= 512;
            Client.anIntArray10748[i] += 512;
            Client.anIntArray10749[i] += 512;
            Client.anIntArray10750[i] -= 512;
        }
        return true;
    }

    @Override
    public void method35() {

    }

    @Override
    public void decode(Buffer buffer) {
        for (; ; ) {
            int opcode = buffer.readUByte();
            if (opcode == 0) {
                break;
            }

            decode(buffer, opcode);
        }
    }

    @Override
    public void method40(int i) {

    }

    @Override
    public void setId(int id) {

    }

    void decode(Buffer buffer, int opcode) {
        if (opcode == 2) {
            capacity = buffer.readUShort() * 650036707;
        } else if (4 == opcode) {
            anInt10935 = buffer.readUByte() * 893155949;
            anIntArray10933 = new int[anInt10935 * -79519899];
            anIntArray10932 = new int[anInt10935 * -79519899];

            for (int index = 0; index < -79519899 * anInt10935; index++) {
                anIntArray10933[index] = buffer.readUShort();
                anIntArray10932[index] = buffer.readUShort();
            }
        }
    }

}