package com.jagex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Class339 {

    Class343 aClass343_3627;
    Map<Integer, Class326> aMap3628 = new HashMap<Integer, Class326>();

    public Class339(Class343 class343) {
        aClass343_3627 = class343;
    }

    public static final Component method5850(Interface class221, Component class226, int i) {
        if (class226.parentUid * 1920469085 != -1) {
            return class221.getChild(1920469085 * class226.parentUid);
        } else if (!class221.closed) {
            int i_6_ = class226.uid * 1857819631 >>> 16;
            HashTableIterator<InterfaceNode> iterator = new HashTableIterator<>(Client.openInterfaces);
            for (InterfaceNode lw = iterator.first(); null != lw; lw = iterator.next()) {
                if (lw.id * 1021060255 == i_6_) {
                    return Component.lookup((int) (-4821875126325281949L * lw.linkedKey));
                }
            }
        }

        return null;
    }

    static void method5852() {
        DiskFile preferences = PriorityQueueIterator.getPreferences("2", Client.game.domain, false);
        Class199.aVarcs_2099.readFromFile(preferences);
    }

    public Class326 method5837(int i, int i_0_, float f, VolumeNormaliser normaliser) {
        if (method5845(i) != null) {
            return null;
        }

        Class326 class326 = null;
        if (-1 != i_0_) {
            class326 = method5845(i_0_);
        }

        Object object = aClass343_3627.method5879(class326);
        Class326 class326_2_ = new Class326(i, f, object, this, normaliser, class326);
        aMap3628.put(i, class326_2_);
        return class326_2_;
    }

    public void method5838() {
        Iterator iterator = aMap3628.values().iterator();
        while (iterator.hasNext()) {
            Class326 class326 = (Class326) iterator.next();
            class326.method5778(1683739721);
        }
    }

    public Class326 method5845(int i) {
        return aMap3628.get(i);
    }

}