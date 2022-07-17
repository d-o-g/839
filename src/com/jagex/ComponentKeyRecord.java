package com.jagex;

public final class ComponentKeyRecord extends Node implements KeyRecord {
    static final int anInt10207 = -1;
    public static int cameraViewX;
    char character;
    int code;
    int flags;
    long time;
    int type;

    public static int encodeHuffman(Buffer buffer, String string) {
        int start = buffer.caret * -165875887;
        byte[] bytes = StaticBoundary.getStringBytes(string);
        buffer.method15674(bytes.length);
        buffer.caret += HuffmanCodec.huffman.encode(bytes, 0, bytes.length, buffer.payload, buffer.caret * -165875887,
                -217208797) * 1258142129;
        return -165875887 * buffer.caret - start;
    }

    @Override
    public char getCharacter() {
        return character;
    }

    @Override
    public int getCode() {
        return code * -74310129;
    }

    @Override
    public int getFlags() {
        return 77359267 * flags;
    }

    @Override
    public long getTime() {
        return time * -6413391820341679733L;
    }

    @Override
    public int getType() {
        return 1466963227 * type;
    }

}