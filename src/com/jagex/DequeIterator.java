package com.jagex;

import java.util.Iterator;

public class DequeIterator<T extends Node> implements Iterator<T> {

    public static Archive worldMapInfo;
    public static Archive images;

    Node current;
    Deque deque;
    Node previous = null;

    public DequeIterator(Deque<T> deque) {
        this.deque = deque;
        current = deque.tail.next;
    }

    static final void method13363(ScriptExecutionContext class613) {
        class613.anInt7924 -= -926911801;
        if (Client.camera.method4836() != Class257.aClass257_2850) {
            throw new RuntimeException();
        }
        ((Class642_Sub1) Client.camera.method4834()).method16691(
                class613.anIntArray7942[1841827045 * class613.anInt7924],
                class613.anIntArray7942[1 + 1841827045 * class613.anInt7924],
                class613.anIntArray7942[2 + 1841827045 * class613.anInt7924], 538692304);
    }

    static final void method13364(Component class226, Interface class221, ScriptExecutionContext class613) {
        class226.inventory = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] == 1;
        Component.redraw(class226);
    }

    public Node front() {
        reset();
        return next();
    }

    @Override
    public boolean hasNext() {
        return deque.tail != current;
    }

    @Override
    public T next() {
        Node node = current;
        if (deque.tail == node) {
            node = null;
            current = null;
        } else {
            current = node.next;
        }

        previous = node;
        return (T) node;
    }

    @Override
    public void remove() {
        if (null == previous) {
            throw new IllegalStateException();
        }

        previous.unlink();
        previous = null;
    }

    public void setDeque(Deque<T> deque) {
        this.deque = deque;
        current = deque.tail.next;
        previous = null;
    }

    void reset() {
        current = deque.tail.next;
        previous = null;
    }

}