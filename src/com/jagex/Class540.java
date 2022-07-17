package com.jagex;

public class Class540 {

    int[] anIntArray7331;
    long aLong7332;
    short[] aShortArray7333;
    short[] aShortArray7334;

    public Class540(long l, int[] is, short[] is_0_, short[] is_1_) {
        aLong7332 = -7895650378986125249L * l;
        anIntArray7331 = is;
        aShortArray7333 = is_0_;
        aShortArray7334 = is_1_;
    }

    public static void method9217() {
        if ((16 == Client.connectionState * -1501875989 || Client.connectionState * -1501875989 == 13)
                && null != Client.gameConnection) {
            for (; ; ) {
                Encodeable encodeable = Class529.aLinkedList7226.poll();
                if (null == encodeable) {
                    break;
                }

                encodeable.encode();
            }
        }
    }

}