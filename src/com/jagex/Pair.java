package com.jagex;

public class Pair<L, R> {

    public L left;
    public R right;

    public Pair(L left, R right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || !(object instanceof Pair)) {
            return false;
        }
        Pair other = (Pair) object;
        if (left == null) {
            if (other.left != null) {
                return false;
            }
        } else if (!left.equals(other.left)) {
            return false;
        }

        if (right == null) {
            return other.right == null;
        } else return right.equals(other.right);
    }

    @Override
    public int hashCode() {
        int hashcode = 0;
        if (left != null) {
            hashcode += left.hashCode();
        }
        if (right != null) {
            hashcode += 31 * right.hashCode();
        }
        return hashcode;
    }

    @Override
    public String toString() {
        return left + ", " + right;
    }

}