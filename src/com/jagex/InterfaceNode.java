package com.jagex;

public class InterfaceNode extends Node {

    public int state;
    public int id;

    public InterfaceNode(int id, int state) {
        this.id = 1499985759 * id;
        this.state = state * -2058254549;
    }

    public static final InterfaceNode method4800(int interfaceIndex, InterfaceNode linkable, int[] is, boolean bool) {
        InterfaceNode open = Client.openInterfaces.get(interfaceIndex);
        if (null != open) {
            method9830(open, 1021060255 * linkable.id != open.id * 1021060255, bool);
        }
        Client.openInterfaces.put(interfaceIndex, linkable);
        ParticleProducer.method9684(1021060255 * linkable.id, is);
        Component component = Component.lookup(interfaceIndex);
        if (null != component) {
            Component.redraw(component);
        }
        if (Client.aClass226_10793 != null) {
            Component.redraw(Client.aClass226_10793);
            Client.aClass226_10793 = null;
        }

        if (component != null) {
            Class548.method9327(Class598.loadedInterfaces[1857819631 * component.uid >>> 16], component, !bool);
        }

        if (!bool) {
            Component.method5082(1021060255 * linkable.id, is);
        }

        if (!bool && Client.anInt10790 * 1764783361 != -1) {
            Component.method15440(Client.anInt10790 * 1764783361, 1);
        }

        return linkable;
    }

    public static final void method9830(InterfaceNode class480_sub41, boolean bool, boolean bool_5_) {
        int uid = class480_sub41.id * 1021060255;
        int key0 = (int) (-4821875126325281949L * class480_sub41.linkedKey);
        class480_sub41.unlink();
        if (bool) {
            Component.method10427(uid);
        }
        Class530.method9027(uid, -1899213702);
        Component class226 = Component.lookup(key0);
        if (class226 != null) {
            Component.redraw(class226);
        }
        Class193.method3844(uid, 1712775751);
        if (!bool_5_ && 1764783361 * Client.anInt10790 != -1) {
            Component.method15440(Client.anInt10790 * 1764783361, 1);
        }
        HashTableIterator<InterfaceNode> it = new HashTableIterator<>(Client.openInterfaces);
        for (InterfaceNode link = it.first(); link != null; link = it.next()) {
            if (!link.isLinked()) {
                link = it.first();
                if (link == null) {
                    break;
                }
            }
            if (link.state * -487784573 == 3) { //showing
                int key = (int) (-4821875126325281949L * link.linkedKey);
                if (key >>> 16 == uid) {
                    method9830(link, true, bool_5_);
                }
            }
        }
    }

    public boolean method16250() {
        return true;
    }
}