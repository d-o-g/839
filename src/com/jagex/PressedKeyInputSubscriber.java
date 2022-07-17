package com.jagex;

public class PressedKeyInputSubscriber implements InputSubscriber {
    int code;
    int flags;
    PressedKeyInputSubscriber(int code, int flags) {
        this.code = 1843736065 * code;
        this.flags = flags * 1253657801;
    }

    public static void method9182(boolean bool) {
        if (IgnoredPlayer.aClass266_670 == null) {
            Class266.method10430();
        }
        if (bool) {
            IgnoredPlayer.aClass266_670.method5020();
        }
    }

    static PressedKeyInputSubscriber decode(Buffer buffer) {
        int code = buffer.readUByte();
        int flags = buffer.readUByte();
        return new PressedKeyInputSubscriber(code, flags);
    }

    @Override
    public boolean valid(MouseRecord mouse, KeyRecord[] keys, int maximumHeldKeys, KeyRecorder recorder) {
        for (int index = 0; index < maximumHeldKeys && index < keys.length; index++) {
            KeyRecord record = keys[index];

            if (record != null && record.getCode() == -1369517567 * code && record.getFlags() == -702509703 * flags) {
                return true;
            }
        }

        return false;
    }

}