package com.jagex;

public class Node {

    public Node next;
    public Node previous;

    public long linkedKey;

    public static void insertBefore(Node first, Node second) {
        if (first.previous != null) {
            first.unlink();
        }

        first.previous = second.previous;
        first.next = second;
        first.previous.next = first;
        first.next.previous = first;
    }

    public boolean isLinked() {
        return previous != null;
    }

    public void unlink() {
        if (previous != null) {
            previous.next = next;
            next.previous = previous;
            next = null;
            previous = null;
        }
    }
}
