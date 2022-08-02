package com.jagex;

import java.util.Collection;
import java.util.Iterator;

public class Deque<T extends Node> implements Iterable<T>, Collection<T> {

    public static Archive frames;
    static int[] anIntArray8173;
    static int mapflagIndex;

    public Node tail = new Node();
    Node current;

    public Deque() {
        tail.next = tail;
        tail.previous = tail;
    }

    public static boolean method13350(int i) {
        return i == 0 || 1 == i || 2 == i;
    }

    static final void method13348(ScriptExecutionContext class613, int i) {
        int i_7_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
        Component class226 = Component.lookup(i_7_);
        Interface class221 = Class598.loadedInterfaces[i_7_ >> 16];
        MobileEffect.method7911(class226, class221, class613);
    }

    static void method13349() {
        if (null != Class60.activeToolkit) {
            Client.scene.method7805();
            Class679.method696();
            SceneGraphSize.method4418();
            Class23.method752();
            ItemTable.method15481(-529844570);
            Client.scene.method7788(true);
            Class475.method8117();
            HitbarDefinition.method8951();
            Client.gc(false);
            Class124.method2255();
            Vector4i.method15974();
            OverlayDefinition.method9930();
            for (int i_8_ = 0; i_8_ < Client.aClass473Array10624.length; i_8_++) {
                if (null != Client.aClass473Array10624[i_8_]) {
                    Client.aClass473Array10624[i_8_].model = null;
                }
            }
            for (int i_9_ = 0; i_9_ < 2048; i_9_++) {
                Player class600_sub1_sub3_sub1_sub1 = Client.players[i_9_];
                if (class600_sub1_sub3_sub1_sub1 != null) {
                    for (int i_10_ = 0; i_10_ < class600_sub1_sub3_sub1_sub1.cachedModels.length; i_10_++) {
                        class600_sub1_sub3_sub1_sub1.cachedModels[i_10_] = null;
                    }
                }
            }
            for (int i_11_ = 0; i_11_ < -999337347 * Client.anInt10862; i_11_++) {
                Npc class600_sub1_sub3_sub1_sub2 = Client.npcs[i_11_].referent;
                if (null != class600_sub1_sub3_sub1_sub2) {
                    for (int i_12_ = 0; i_12_ < class600_sub1_sub3_sub1_sub2.cachedModels.length; i_12_++) {
                        class600_sub1_sub3_sub1_sub2.cachedModels[i_12_] = null;
                    }
                }
            }
            Client.effects.clear();
            Class60.activeToolkit.method2373();
            Class60.activeToolkit = null;
        }
    }

    @Override
    public boolean add(T linkable) {
        pushBack(linkable);
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends T> collection) {
        throw new RuntimeException();
    }

    @Override
    public void clear() {
        while (tail != tail.next) {
            tail.next.unlink();
        }
    }

    @Override
    public boolean contains(Object object) {
        throw new RuntimeException();
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        throw new RuntimeException();
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public T head() {
        Node head = tail.next;

        if (tail == head) {
            current = null;
            return null;
        }

        current = head.next;
        return (T) head;
    }

    @Override
    public boolean isEmpty() {
        return tail == tail.next;
    }

    @Override
    public Iterator iterator() {
        return new DequeIterator(this);
    }

    public void join(Deque<T> other) {
        if (tail != tail.next) {
            join(other, tail.next);
        }
    }

    public T next() {
        Node node = current;
        if (node == tail) {
            current = null;
            return null;
        }
        current = node.next;
        return (T) node;
    }

    public T popHead() {
        Node node = tail.next;
        if (node == tail) {
            return null;
        }

        node.unlink();
        return (T) node;
    }

    public T previous() {
        Node node = current;
        if (node == tail) {
            current = null;
            return null;
        }

        current = node.previous;
        return (T) node;
    }

    public void pushBack(T linkable) {
        if (linkable.previous != null) {
            linkable.unlink();
        }

        linkable.previous = tail.previous;
        linkable.next = tail;
        linkable.previous.next = linkable;
        linkable.next.previous = linkable;
    }

    @Override
    public boolean remove(Object object) {
        throw new RuntimeException();
    }

    @Override
    public boolean removeAll(Collection collection) {
        throw new RuntimeException();
    }

    @Override
    public boolean retainAll(Collection collection) {
        throw new RuntimeException();
    }

    @Override
    public int size() {
        int size = 0;
        for (Node next = tail.next; tail != next; next = next.next) {
            size++;
        }
        return size;
    }

    public T tail() {
        Node back = tail.previous;

        if (tail == back) {
            current = null;
            return null;
        }

        current = back.previous;
        return (T) back;
    }

    @Override
    public Object[] toArray() {
        return getElements();
    }

    @Override
    public Object[] toArray(Object[] objects) {
        int index = 0;
        for (Node elements = tail.next; elements != tail; elements = elements.next) {
            objects[index++] = elements;
        }
        return objects;
    }

    Node[] getElements() {
        Node[] elements = new Node[size()];
        int index = 0;

        for (Node next = tail.next; next != tail; next = next.next) {
            elements[index++] = next;
        }

        return elements;
    }

    void join(Deque<T> other, Node front) {
        Node back = tail.previous;
        tail.previous = front.previous;
        front.previous.next = tail;

        if (front != tail) {
            front.previous = other.tail.previous;
            front.previous.next = front;
            back.next = other.tail;
            other.tail.previous = back;
        }
    }

}