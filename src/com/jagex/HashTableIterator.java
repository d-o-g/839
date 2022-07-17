package com.jagex;

import java.util.Iterator;

public class HashTableIterator<T extends Node> implements Iterator<T> {

    static Player aClass600_Sub1_Sub3_Sub1_Sub1_8361;

    Node pointer;
    HashTable table;
    int index;
    Node previous = null;

    public HashTableIterator(HashTable table) {
        this.table = table;
        reset();
    }

    static final void method13669(Mobile mobile) {
        int i_0_ = mobile.anInt11560 * -589638007 - Client.engineCycle;
        int i_1_ = -1939636736 * mobile.anInt11521 + mobile.boundSize() * 256;
        int i_2_ = mobile.anInt11523 * -1221436928 + mobile.boundSize() * 256;
        Vector3f vector3f = mobile.getCoordinateSpace().translation;
        mobile.setPosition((int) vector3f.x + (i_1_ - (int) vector3f.x) / i_0_, (int) vector3f.y,
                (i_2_ - (int) vector3f.z) / i_0_ + (int) vector3f.z);
        mobile.anInt11513 = 0;
        mobile.turn(mobile.anInt11501 * 1723039953);
    }

    static void method13671(int i) {
        if (-1955604939 * Class31.loginType == 156) {
            Class31.loginResponse1 = -1384596895 * i;
        } else if (203 == Class31.loginType * -1955604939) {
            Class31.loginResponse2 = 1410936033 * i;
        }
    }

    @Override
    public boolean hasNext() {
        if (pointer != table.buckets[867456899 * index - 1]) {
            return true;
        }

        while (index * 867456899 < table.size * -1373406603) {
            if (table.buckets[(index += -1353257173) * 867456899 - 1].next != table.buckets[index * 867456899 - 1]) {
                pointer = table.buckets[index * 867456899 - 1].next;
                return true;
            }

            pointer = table.buckets[867456899 * index - 1];
        }

        return false;
    }

    public T first() {
        reset();
        return next();
    }

    @Override
    public T next() {
        if (table.buckets[867456899 * index - 1] != pointer) {
            Node node = pointer;
            pointer = node.next;
            previous = node;
            return (T) node;
        }

        while (867456899 * index < table.size * -1373406603) {
            Node node = table.buckets[(index += -1353257173) * 867456899 - 1].next;
            if (node != table.buckets[index * 867456899 - 1]) {
                pointer = node.next;
                previous = node;
                return (T) node;
            }
        }

        return null;
    }

    @Override
    public void remove() {
        if (previous == null) {
            throw new IllegalStateException();
        }

        previous.unlink();
        previous = null;
    }

    void reset() {
        pointer = table.buckets[0].next;
        index = -1353257173;
        previous = null;
    }
}