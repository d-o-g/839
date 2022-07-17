package com.jagex;

public class EntityList<T extends Entity> {
    Entity pointer;
    Entity head = new Entity();

    public EntityList() {
        head.next = head;
        head.previous = head;
    }

    public void clear() {
        while (true) {
            Entity entity = head.next;
            if (entity == head) {
                break;
            }

            entity.unlink();
        }

        pointer = null;
    }

    public void offer(T entity) {
        if (entity.previous != null) {
            entity.unlink();
        }

        entity.previous = head.previous;
        entity.next = head;
        entity.previous.next = entity;
        entity.next.previous = entity;
    }

    public void add(T entity) {
        if (entity.previous != null) {
            entity.unlink();
        }

        entity.previous = head;
        entity.next = head.next;
        entity.previous.next = entity;
        entity.next.previous = entity;
    }

    public T head() {
        Entity entity = head.next;
        if (head == entity) {
            pointer = null;
            return null;
        }

        pointer = entity.next;
        return (T) entity;
    }

    public T next() {
        Entity entity = pointer;
        if (head == entity) {
            pointer = null;
            return null;
        }

        pointer = entity.next;
        return (T) entity;
    }

    public boolean isEmpty() {
        return head.next == head;
    }

    public T method13443() {
        Entity entity = head.next;
        if (head == entity) {
            return null;
        }

        entity.unlink();
        return (T) entity;
    }

}