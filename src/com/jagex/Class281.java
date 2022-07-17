package com.jagex;

public abstract class Class281 {

    Camera camera;

    Class281(Camera class261) {
        camera = class261;
    }

    public static int getMessageCount(int containerType, int i_4_) {
        ChatContainer chatContainer = Class248.chatContainers.get(containerType);
        if (chatContainer == null) {
            return 0;
        }
        return chatContainer.getMessageCount();
    }

    public abstract Vector3f method5224();

    public abstract void method5225(float f, int[][][] is, TileFlags flags, int i, int i_0_, byte i_1_);

    public abstract boolean method5226();

    public abstract double[] method5228();

    public abstract float method5230(byte i);

    public abstract Vector4i method5238(short i);

    public abstract void method5248(Class268 class268, int i, int i_2_, byte i_3_);

    public abstract void method5256(Buffer buffer, byte i);

}