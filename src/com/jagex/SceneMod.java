package com.jagex;

//modifications are pushed onto the scenegraph as a 'scenemod' object
public final class SceneMod extends Node {

    public static Deque<SceneMod> pendingRotations = new Deque<>();
    public static Deque<SceneMod> pendingSpawns = new Deque<>();

    static Component[] mainComponents;

    static long aLong10071 = 3866542625567148507L;

    public int id;
    public int localX;
    public int localZ;
    public int orientation;
    int anInt10060;
    int anInt10062;
    int anInt10070;
    int group;
    int plane;
    int type;

    boolean aBool10063;
    boolean aBool10069 = true;
    Class540 aClass540_10066;
}