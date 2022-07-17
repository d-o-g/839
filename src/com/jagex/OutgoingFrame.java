package com.jagex;

public class OutgoingFrame extends Node {

    static OutgoingFrame[] frameCache = new OutgoingFrame[300];
    static int frameCacheIndex = 0;

    public int size;
    public BitBuffer payload;
    int payloadSize;
    OutgoingFrameMeta meta;

    public static OutgoingFrame empty() {
        OutgoingFrame frame = create();
        frame.meta = null;
        frame.payloadSize = 0;
        frame.payload = new BitBuffer(5000);
        return frame;
    }

    public static OutgoingFrame prepare(OutgoingFrameMeta meta, IsaacCipher cipher) {
        OutgoingFrame frame = create();
        frame.meta = meta;
        frame.payloadSize = meta.size * 1580530077;
        if (frame.payloadSize * 1915278141 == -1) {
            frame.payload = new BitBuffer(260);
        } else if (1915278141 * frame.payloadSize == -2) {
            frame.payload = new BitBuffer(10000);
        } else if (1915278141 * frame.payloadSize <= 18) {
            frame.payload = new BitBuffer(20);
        } else if (1915278141 * frame.payloadSize <= 98) {
            frame.payload = new BitBuffer(100);
        } else {
            frame.payload = new BitBuffer(260);
        }

        frame.payload.setCipher(cipher);
        frame.payload.writeOpcode(-701555801 * frame.meta.opcode);
        frame.size = 0;
        return frame;
    }

    static OutgoingFrame create() {
        if (frameCacheIndex * -343545235 == 0) {
            return new OutgoingFrame();
        }
        return frameCache[(frameCacheIndex -= -95244443) * -343545235];
    }

    static void method9168(OutgoingFrame frame, int i, int i_8_, int i_9_) {
        frame.payload.writeMEInt(i);
        frame.payload.writeLEShort(i_9_);
        frame.payload.writeShort(i_8_);
    }

    public void cache() {
        if (-343545235 * frameCacheIndex < frameCache.length) {
            frameCache[(frameCacheIndex += -95244443) * -343545235 - 1] = this;
        }
    }

}