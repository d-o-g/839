package com.jagex;

public class TileFlags {

    public static final int BRIDGE_FLAG = 2;
    public static final int IDK_1_FLAG = 4;
    public static final int FORCE_BOTTOM_FLAG = 8;
    public static final int IDK_2_FLAG = 16;

    public byte[][][] flags;

    public TileFlags(int planes, int width, int length) {
        flags = new byte[planes][width][length];
    }

    public void init() {
        for (int plane = 0; plane < flags.length; plane++) {
            for (int x = 0; x < flags[0].length; x++) {
                for (int z = 0; z < flags[0][0].length; z++) {
                    flags[plane][x][z] = (byte) 0;
                }
            }
        }
    }

    public boolean isBridge(int x, int z) {
        if (x < 0 || z < 0 || x >= flags[1].length || z >= flags[1][x].length) {
            return false;
        }
        return (flags[1][x][z] & BRIDGE_FLAG) != 0;
    }

    public boolean method7066(int x, int z) {
        if (x < 0 || z < 0 || x >= flags[3].length || z >= flags[3][x].length) {
            return false;
        }
        return (flags[3][x][z] & BRIDGE_FLAG) != 0;
    }

    public boolean method7067(int i, int plane, int x, int z) {
        if ((flags[0][x][z] & BRIDGE_FLAG) != 0) {
            return true;
        } else if ((flags[plane][x][z] & 0x10) != 0) {
            return false;
        }
        return adjustPlane(plane, x, z) == i;
    }

    int adjustPlane(int plane, int x, int z) {
        if ((flags[plane][x][z] & FORCE_BOTTOM_FLAG) != 0) {
            return 0;
        } else if (plane > 0 && 0 != (flags[1][x][z] & BRIDGE_FLAG)) {
            return plane - 1;
        }
        return plane;
    }
}