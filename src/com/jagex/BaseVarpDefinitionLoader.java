package com.jagex;

public abstract class BaseVarpDefinitionLoader implements DefinitionLoader<Varp> {
    public static int anInt1130;
    static int floorLevel;
    protected int count;

    BaseVarpDefinitionLoader(GameContext context, Language language, int count) {
        this.count = count * 375798093;
    }

    public static void method1630(String string) {
        if (6 == Client.connectionState * -1501875989) {
            OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3968,
                    Client.lobbyConnection.encryptor);
            frame.payload.writeByte(0);
            int start = frame.payload.caret * -165875887;
            frame.payload.writeCString(string);
            frame.payload.caret += 217060311;
            frame.payload.encodeXtea(Class34.anIntArray447, start, -165875887 * frame.payload.caret);
            frame.payload.writeSizeByte(frame.payload.caret * -165875887 - start);
            Client.lobbyConnection.sendFrame(frame);
            Class34.aClass630_449 = Class630.aClass630_8051;
        }
    }

    @Override
    public int count() {
        return count * -1710250107;
    }

}