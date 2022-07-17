package com.jagex;

import java.util.LinkedList;

public class Class461 implements Runnable {
    Scene aScene_5256 = new Scene(true);
    volatile boolean aBool5257 = false;

    LinkedList aLinkedList5258 = new LinkedList();

    public void method7824(ObjectDefinitionLoader loader) {
        aScene_5256.setObjectLoader(loader);
    }

    public void method7825(Class452 class452) {
        synchronized (aLinkedList5258) {
            aLinkedList5258.add(class452);
            aLinkedList5258.notify();
        }
    }

    public boolean method7826() {
        return aBool5257;
    }

    public Scene method7827() {
        return aScene_5256;
    }

    @Override
    public void run() {
        for (; ; ) {
            method7835();
        }
    }

    void method7830(Class452 class452) {
        if (SceneFormat.aSceneFormat_5159 == class452.aSceneFormat_5090) {
            aScene_5256.method7705();
        } else {
            aScene_5256.method7706(class452);
        }

        for (boolean bool = aScene_5256.method7810(); !bool; bool = aScene_5256.method7810()) {

        }

        aScene_5256.method7700();
        Client.scene.method7700();
    }

    void method7835() {
        Class452 class452;
        synchronized (aLinkedList5258) {
            try {
                aLinkedList5258.wait();
            } catch (InterruptedException ex) {

            }

            class452 = (Class452) aLinkedList5258.pollFirst();
        }

        try {
            try {
                if (null != class452) {
                    aBool5257 = true;
                    method7830(class452);
                }
            } catch (Exception exception) {
                aBool5257 = false;
                return;
            }

            aBool5257 = false;
        } catch (Exception ex) {
            aBool5257 = false;
        }
    }

    void method7840(Scene scene) {
        aScene_5256 = scene;
    }

}