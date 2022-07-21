package com.jagex;

public class CoordGrid {

    public int level;
    public int x;
    public int z;

    public CoordGrid() {
        level = -854958999;
    }

    public CoordGrid(int hash) {
        if (hash == -1) {
            level = -854958999;
        } else {
            level = 854958999 * (hash >> 28 & 0x3);
            x = (hash >> 14 & 0x3fff) * -1155670979;
            z = 2125481685 * (hash & 0x3fff);
        }
    }

    public CoordGrid(int level, int x, int z) {
        this.level = level * 854958999;
        this.x = x * -1155670979;
        this.z = 2125481685 * z;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        } else if (!(object instanceof CoordGrid)) {
            return false;
        }

        return equals((CoordGrid) object);
    }

    @Override
    public int hashCode() {
        return hash();
    }

    public int hash() {
        return level * 394202151 << 28 | 2051316501 * x << 14 | -180305283 * z;
    }

    public void method9356(Vector4i vector4i) {
        level = vector4i.plane * 1739852981;
        x = (-61099889 * vector4i.x >> 9) * -1155670979;
        z = 2125481685 * (vector4i.z * -980788885 >> 9);
    }

    @Override
    public String toString() {
        return new StringBuilder().append(level * 394202151).append(",").append(x * 2051316501 >> 6).append(",")
                .append(-180305283 * z >> 6).append(",").append(x * 2051316501 & 0x3f).append(",")
                .append(z * -180305283 & 0x3f).toString();
    }

    boolean equals(CoordGrid other) {
        if (394202151 * level != other.level * 394202151) {
            return false;
        } else if (2051316501 * other.x != x * 2051316501) {
            return false;
        }

        return -180305283 * z == -180305283 * other.z;
    }

}