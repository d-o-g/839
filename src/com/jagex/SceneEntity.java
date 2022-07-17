package com.jagex;

public abstract class SceneEntity extends SceneNode {
    public short startX;
    public short endX;
    public short endY;
    public boolean aBool11461;
    public short startY;
    PointLight[] aClass480_Sub23Array11460;
    byte aByte11462;
    int anInt11463 = 0;

    SceneEntity(SceneGraph sceneGraph, int plane, int collisionPlane, int worldX, int height, int worldZ, int startX,
                int endX, int startY, int endY, boolean bool, byte i_12_) {
        super(sceneGraph);
        aClass480_Sub23Array11460 = new PointLight[4];
        this.plane = (byte) plane;
        this.collisionPlane = (byte) collisionPlane;
        setPosition(new Vector3f(worldX, height, worldZ));
        this.startX = (short) startX;
        this.endX = (short) endX;
        this.startY = (short) startY;
        this.endY = (short) endY;
        aBool11461 = bool;
        aByte11462 = i_12_;

        for (int i_13_ = 0; i_13_ < 4; i_13_++) {
            aClass480_Sub23Array11460[i_13_] = null;
        }
    }

    @Override
    int method16267(PointLight[] class480_sub23s, int i) {
        if (pendingLighting) {
            anInt11463 = 0;
            int i_14_ = Math.max(0, startX);
            int i_15_ = Math.min(graph.aLongArrayArrayArray6720[plane].length - 1, endX);
            int i_16_ = Math.max(0, startY);
            int i_17_ = Math.min(graph.aLongArrayArrayArray6720[plane][i_14_].length - 1, endY);

            outer:
            for (; i_14_ <= i_15_; i_14_++) {
                for (; i_16_ <= i_17_; i_16_++) {
                    long l = graph.aLongArrayArrayArray6720[plane][i_14_][i_16_];
                    long l_18_ = 0L;

                    inner:
                    while (l_18_ <= 48L) {
                        int i_19_ = (int) (l >>> (int) l_18_ & 0xffffL);
                        if (i_19_ <= 0) {
                            break;
                        }

                        Class504 class504 = graph.aClass504Array6742[i_19_ - 1];
                        for (int i_20_ = 0; i_20_ < 418224773 * anInt11463; i_20_++) {
                            if (class504.light == aClass480_Sub23Array11460[i_20_]) {
                                l_18_ += 16L;
                                continue inner;
                            }
                        }

                        aClass480_Sub23Array11460[(anInt11463 += -1713090995) * 418224773 - 1] = class504.light;
                        if (418224773 * anInt11463 == 4) {
                            break outer;
                        }

                        l_18_ += 16L;
                    }
                }
            }

            for (int i_21_ = 418224773 * anInt11463; i_21_ < 4; i_21_++) {
                aClass480_Sub23Array11460[i_21_] = null;
            }

            if (aByte11462 != 0) {
                int i_22_ = startX - 1243106061 * graph.anInt6723;
                int i_23_ = startY - graph.anInt6724 * -1342442459;
                short i_24_;
                int i_25_;
                int i_26_;
                short i_27_;

                if (1 == aByte11462) {
                    if (i_23_ > i_22_) {
                        i_24_ = startX;
                        i_25_ = startY - 1;
                        i_26_ = 1 + startX;
                        i_27_ = startY;
                    } else {
                        i_24_ = startX;
                        i_25_ = startY + 1;
                        i_26_ = startX - 1;
                        i_27_ = startY;
                    }
                } else if (i_23_ > -i_22_) {
                    i_24_ = startX;
                    i_25_ = startY - 1;
                    i_26_ = startX - 1;
                    i_27_ = startY;
                } else {
                    i_24_ = startX;
                    i_25_ = 1 + startY;
                    i_26_ = 1 + startX;
                    i_27_ = startY;
                }

                int i_28_ = 0;
                while_41_:
                for (; i_28_ < anInt11463 * 418224773; i_28_++) {
                    long l = graph.aLongArrayArrayArray6720[plane][i_24_][i_25_];
                    while (0L != l) {
                        Class504 class504 = graph.aClass504Array6742[(int) ((l & 0xffffL) - 1L)];
                        l >>>= 16;
                        if (class504.light == aClass480_Sub23Array11460[i_28_]) {
                            continue while_41_;
                        }
                    }

                    l = graph.aLongArrayArrayArray6720[plane][i_26_][i_27_];
                    while (0L != l) {
                        Class504 class504 = graph.aClass504Array6742[(int) ((l & 0xffffL) - 1L)];
                        l >>>= 16;
                        if (aClass480_Sub23Array11460[i_28_] == class504.light) {
                            continue while_41_;
                        }
                    }

                    for (int i_29_ = i_28_; i_29_ < 418224773 * anInt11463 - 1; i_29_++) {
                        aClass480_Sub23Array11460[i_29_] = aClass480_Sub23Array11460[1 + i_29_];
                    }
                    anInt11463 -= -1713090995;
                }
            }

            pendingLighting = false;
        }

        for (int i_30_ = 0; i_30_ < anInt11463 * 418224773; i_30_++) {
            class480_sub23s[i_30_] = aClass480_Sub23Array11460[i_30_];
        }

        return anInt11463 * 418224773;
    }

    @Override
    boolean method16268(Toolkit toolkit, int i) {
        return graph.aClass492_6695.method8487(collisionPlane, startX, endX, startY,
                endY, method16293(toolkit));
    }

    @Override
    boolean method16269(int i) {
        for (int i_0_ = startX; i_0_ <= endX; i_0_++) {
            for (int i_1_ = startY; i_1_ <= endY; i_1_++) {
                int i_2_ = 1414880535 * graph.anInt6686 + i_0_ - 1243106061 * graph.anInt6723;
                if (i_2_ >= 0 && i_2_ < graph.aBoolArrayArray6733.length) {
                    int i_3_ = i_1_ - -1342442459 * graph.anInt6724 + graph.anInt6686 * 1414880535;
                    if (i_3_ >= 0 && i_3_ < graph.aBoolArrayArray6733.length
                            && graph.aBoolArrayArray6733[i_2_][i_3_]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    void method17912() {

    }

}