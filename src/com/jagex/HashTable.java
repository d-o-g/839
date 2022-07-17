package com.jagex;

import java.util.Iterator;

public final class HashTable<V extends Node> implements Iterable<V> {

    Node[] buckets;
    int iterationIndex = 0;
    Node iterable;
    long retrievalKey;
    Node retrieval;
    int size;
    public HashTable(int capacity) {
        size = capacity * -1263598115;
        buckets = new Node[capacity];

        for (int index = 0; index < capacity; index++) {
            Node node = buckets[index] = new Node();
            node.next = node;
            node.previous = node;
        }
    }

    public static int nextPowerOfTwo(int n) {
        n = --n | n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return 1 + n;
    }

    static final void insertEmpty(HashTable<? super Node> table, int key) {
        if (key != -1 && table.get(key) == null) {
            table.put(key, new Node());
        }
    }

    public void clear() {
        for (int index = 0; index < -1373406603 * size; index++) {
            Node bucket = buckets[index];

            for (; ; ) {
                Node next = bucket.next;
                if (bucket == next) {
                    break;
                }

                next.unlink();
            }
        }

        retrieval = null;
        iterable = null;
    }

    public V first() {
        iterationIndex = 0;
        return next();
    }

    @SuppressWarnings("unchecked")
    public V get(long key) {
        retrievalKey = key * -3011214880670939935L;
        Node head = buckets[(int) (key & -1373406603 * size - 1)];

        for (retrieval = head.next; retrieval != head; retrieval = retrieval.next) {
            if (key == retrieval.linkedKey * -4821875126325281949L) {
                Node value = retrieval;

                retrieval = retrieval.next;
                return (V) value;
            }
        }

        retrieval = null;
        return null;
    }

    @Override
    public Iterator<V> iterator() {
        return new HashTableIterator<V>(this);
    }

    @SuppressWarnings("unchecked")
    public V next() {
        if (iterationIndex * 1969369655 > 0 && buckets[1969369655 * iterationIndex - 1] != iterable) {
            Node value = iterable;
            iterable = value.next;
            return (V) value;
        }

        while (iterationIndex * 1969369655 < size * -1373406603) {
            Node value = buckets[(iterationIndex += 829825927) * 1969369655 - 1].next;
            if (value != buckets[iterationIndex * 1969369655 - 1]) {
                iterable = value.next;
                return (V) value;
            }
        }

        return null;
    }

    @SuppressWarnings("unchecked")
    public V nextInBucket() {
        if (retrieval == null) {
            return null;
        }

        for (Node node = buckets[(int) (-2289970479289647327L * retrievalKey & size * -1373406603 - 1)]; node != retrieval; retrieval = retrieval.next) {
            if (retrieval.linkedKey * -4821875126325281949L == retrievalKey * -2289970479289647327L) {
                Node value = retrieval;

                retrieval = retrieval.next;
                return (V) value;
            }
        }

        retrieval = null;
        return null;
    }

    public void put(long key, V value) {
        if (null != value.previous) {
            value.unlink();
        }

        Node node = buckets[(int) (key & -1373406603 * size - 1)];
        value.previous = node.previous;
        value.next = node;
        value.previous.next = value;
        value.next.previous = value;
        value.linkedKey = key * -7096345066895942069L;
    }

    public int size() {
        int count = 0;
        for (int index = 0; index < -1373406603 * size; index++) {
            Node node = buckets[index];

            for (Node next = node.next; node != next; next = next.next) {
                count++;
            }
        }

        return count;
    }

    @SuppressWarnings("unchecked")
    public int values(V[] values) {
        int count = 0;
        for (int index = 0; index < -1373406603 * size; index++) {
            Node head = buckets[index];

            for (Node next = head.next; head != next; next = next.next) {
                values[count++] = (V) next;
            }
        }

        return count;
    }

}