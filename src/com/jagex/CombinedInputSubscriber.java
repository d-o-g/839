package com.jagex;

public class CombinedInputSubscriber implements InputSubscriber {

    int clickType;
    int minimumClicks;
    int[] requiredKeys;
    CombinedInputSubscriber(int clickType, int minimumClicks, int[] requiredKeys) {
        this.clickType = 1443641811 * clickType;
        this.minimumClicks = minimumClicks * -2063217599;
        this.requiredKeys = requiredKeys;
    }

    static CombinedInputSubscriber decode(Buffer buffer) {
        int clickType = buffer.readUByte();
        int minimumClicks = buffer.readUByte();
        int count = buffer.readUByte();
        int[] keys = new int[count];

        for (int index = 0; index < count; index++) {
            keys[index] = buffer.readUByte();
        }

        return new CombinedInputSubscriber(clickType, minimumClicks, keys);
    }

    @Override
    public boolean valid(MouseRecord mouse, KeyRecord[] keys, int maximumHeldKeys, KeyRecorder recorder) {
        if (null == mouse) {
            return 103908955 * clickType == -1;
        } else {
            if (clickType * 103908955 != mouse.getClickType()) {
                return false;
            } else if (1462518721 * minimumClicks > mouse.getMeta()) {
                return false;
            }

            for (int key : requiredKeys) {
                if (!recorder.held(key)) {
                    return false;
                }
            }
        }

        return true;
    }

}