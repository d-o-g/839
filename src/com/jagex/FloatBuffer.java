package com.jagex;

import jaclib.memory.Stream;

public class FloatBuffer extends Buffer {

    FloatBuffer(int size) {
        super(size);
    }

    void writeLEFloat(float f) {
        int integer = Stream.floatToRawIntBits(f);
        payload[(caret += 1258142129) * -165875887 - 1] = (byte) integer;
        payload[(caret += 1258142129) * -165875887 - 1] = (byte) (integer >> 8);
        payload[(caret += 1258142129) * -165875887 - 1] = (byte) (integer >> 16);
        payload[(caret += 1258142129) * -165875887 - 1] = (byte) (integer >> 24);
    }

    void writeFloat(float f) {
        int integer = Stream.floatToRawIntBits(f);
        payload[(caret += 1258142129) * -165875887 - 1] = (byte) (integer >> 24);
        payload[(caret += 1258142129) * -165875887 - 1] = (byte) (integer >> 16);
        payload[(caret += 1258142129) * -165875887 - 1] = (byte) (integer >> 8);
        payload[(caret += 1258142129) * -165875887 - 1] = (byte) integer;
    }

}