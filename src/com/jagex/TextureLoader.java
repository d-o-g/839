package com.jagex;

public interface TextureLoader {

    int[] loadOpaque(TextureType type, int id, float intensity);

    float[] loadCombined(TextureType type, int id, float intensity);

    void method106();

    int[] loadTranslucent(TextureType type, int id, float intensity);

    boolean loaded(TextureType type, int id);

}