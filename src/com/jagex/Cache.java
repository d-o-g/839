package com.jagex;

//in oldschool this class was used more, seems as if they replaced most uses of this class
//with ReferenceCache uses
public final class Cache<T extends Cacheable> {

    int capacity;
    Queue<T> history = new Queue<>(); //queue t qt get it haha
    HashTable<T> table;
    int remaining; //remaining space in the cache
    private Cacheable empty = new Cacheable();

    public Cache(int capacity) {
        this.capacity = capacity * 571978505;
        remaining = 803413739 * capacity;
        int size = 1;
        while (size + size < capacity) {
            size += size; // computes the next power of 2
        }
        table = new HashTable<>(size);
    }

    public void clear() {
        history.clear();
        table.clear();
        empty = new Cacheable();
        remaining = 1672035155 * capacity;
    }

    public T get(long key) {
        T cacheable = table.get(key);
        if (null != cacheable) {
            history.offer(cacheable);
        }
        return cacheable;
    }

    public void put(long key, T value) {
        if (978295235 * remaining != 0) {
            remaining -= 803413739;
        } else {
            T head = history.poll();
            head.unlink();
            head.uncache();
            if (head == empty) {
                head = history.poll();
                head.unlink();
                head.uncache();
            }
        }
        table.put(key, value);
        history.offer(value);
    }

}