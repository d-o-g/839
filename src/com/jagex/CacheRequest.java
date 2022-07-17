package com.jagex;

public class CacheRequest extends ResourceRequest {

    byte[] data;
    int type;
    ResourceCache cache;

    CacheRequest() {

    }

    @Override
    int complete() {
        if (waiting) {
            return 0;
        }
        return 100;
    }

    @Override
    byte[] getData() {
        if (waiting) {
            throw new RuntimeException();
        }
        return data;
    }
}
