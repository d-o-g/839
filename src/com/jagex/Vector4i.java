package com.jagex;

public class Vector4i extends Node implements Serializable {

    static Vector4i[] cache = new Vector4i[0];
    static int remainingCache;

    public int x;
    public int y;
    public int z;
    public int plane;

    public Vector4i() {
        plane = 380409189;
    }

    public Vector4i(int plane, int i_6_, int i_7_, int i_8_) {
        this.plane = -380409189 * plane;
        x = i_6_ * -904958353;
        y = i_7_ * 556291925;
        z = 1050217283 * i_8_;
    }

    Vector4i(Vector4i other) {
        plane = other.plane * 1;
        x = 1 * other.x;
        y = 1 * other.y;
        z = other.z * 1;
    }

    Vector4i(int positionHash, boolean bool) {
        if (positionHash == -1) {
            plane = 380409189;
        } else {
            plane = (positionHash >> 28 & 0x3) * -380409189;
            x = -904958353 * ((positionHash >> 14 & 0x3fff) << 9);
            y = 0;
            z = 1050217283 * ((positionHash & 0x3fff) << 9);

            if (bool) {
                x += 258895616;
                z += -1727315200;
            }
        }
    }

    public static Vector4i method14268(int i, boolean bool) {
        synchronized (cache) {
            if (0 == remainingCache * 1412746033) {
                return new Vector4i(i, bool);
            }
            cache[(remainingCache -= -612979247) * 1412746033].setByHash(i, bool);
            return cache[remainingCache * 1412746033];
        }
    }

    static void method15974() {
        int i_10_ = -1;
        if (Class495.aClass480_Sub31_Sub18_6808 != null) {
            i_10_ = Class495.aClass480_Sub31_Sub18_6808.anInt11426 * 1943328861;
        }
        CutsceneArea.method16040();
        for (int i_11_ = 0; i_11_ < 3; i_11_++) {
            for (int i_12_ = 0; i_12_ < 5; i_12_++) {
                Class495_Sub1.aClass132ArrayArray10329[i_11_][i_12_] = null;
                Class495_Sub1.aClass9ArrayArray10339[i_11_][i_12_] = null;
            }
        }
        Class495.aClass480_Sub31_Sub18_6808 = null;
        if (i_10_ != -1) {
            Mobile.method18041(i_10_, -1, -1, false);
        }
    }

    public static Vector4i create(int plane, int x, int y, int z) {
        synchronized (cache) {
            if (1412746033 * remainingCache == 0) {
                return new Vector4i(plane, x, y, z);
            }
            cache[(remainingCache -= -612979247) * 1412746033].set(plane, x, y, z);
            return cache[1412746033 * remainingCache];
        }
    }

    public Vector3f toVector3f() {
        return new Vector3f(x * -61099889, 1227419133 * y, -980788885 * z);
    }

    @Override
    public void decode(Buffer buffer) {
        plane = buffer.readUByte() * -380409189;
        x = buffer.readInt() * -904958353;
        y = buffer.readInt() * 556291925;
        z = buffer.readInt() * 1050217283;
    }

    @Override
    public void encode(Buffer buffer) {
        buffer.writeByte(-841913453 * plane);
        buffer.writeInt(x * -61099889);
        buffer.writeInt(1227419133 * y);
        buffer.writeInt(z * -980788885);
    }

    @Override
    public int encodedSize() {
        return 13;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Level: ").append(-841913453 * plane).append(" Coord: ")
                .append(x * -61099889).append(",").append(y * 1227419133).append(",")
                .append(z * -980788885).append(" Coord Split: ").append(x * -61099889 >> 15)
                .append(",").append(-980788885 * z >> 15).append(",")
                .append(x * -61099889 >> 9 & 0x3f).append(",").append(z * -980788885 >> 9 & 0x3f)
                .append(",").append(x * -61099889 & 0x1ff).append(",").append(z * -980788885 & 0x1ff)
                .toString();
    }

    void copyFrom(Vector4i other) {
        plane = other.plane;
        x = other.x;
        y = other.y;
        z = other.z;
    }

    void setByHash(int positionHash, boolean bool) {
        if (-1 == positionHash) {
            plane = 380409189;
        } else {
            plane = (positionHash >> 28 & 0x3) * -380409189;
            x = -904958353 * ((positionHash >> 14 & 0x3fff) << 9);
            y = 0;
            z = ((positionHash & 0x3fff) << 9) * 1050217283;
            if (bool) {
                x += 258895616;
                z += -1727315200;
            }
        }
    }

    void set(int plane, int x, int y, int z) {
        this.plane = plane * -380409189;
        this.x = -904958353 * x;
        this.y = y * 556291925;
        this.z = z * 1050217283;
    }

}