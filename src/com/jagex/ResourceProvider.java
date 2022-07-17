package com.jagex;

public abstract class ResourceProvider {
    public static Archive npcs;
    static String[] cacheDirectories;

    abstract byte[] get(int file);

    abstract void request(int i);

    abstract ReferenceTable getTable();

    abstract int percentComplete(int file);

}