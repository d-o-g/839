package com.jagex;

public class ScriptContext extends Node {

    public int mouseY;
    public boolean aBool10248;
    public Component source;
    public Component target;
    public Object[] arguments;
    public int menuIndex;
    public int typedKeyChar;
    public int typedKeyCode;
    public int mouseX;
    public String menuOption;
    int anInt10257;

    static boolean method16107(InputSubscriber subscriber, MouseRecord record) {
        return null != subscriber
                && subscriber.valid(record, Client.anInterface59Array10640, Client.maximumHeldKeys * 767783973,
                Class193.keyRecorder);
    }

}