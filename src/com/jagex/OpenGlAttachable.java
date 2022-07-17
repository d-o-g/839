package com.jagex;

public interface OpenGlAttachable extends NativeAttachment, NativeAttachBuffer {

    void attach(int attachment);

}