package com.jagex;

public class Native2DTextureCache {
    NativeToolkit toolkit;
    TextureLoader anTextureLoader_3414;
    ReferenceCache<Native2DTexture> cache = new ReferenceCache(10485760, 256);

    Native2DTextureCache(NativeToolkit toolkit, TextureLoader textureLoader) {
        this.toolkit = toolkit;
        anTextureLoader_3414 = textureLoader;
    }

    Native2DTexture get(TextureMetrics metrics) {
        return get(metrics, metrics.length * -931821243);
    }

    void sweep() {
        cache.sweep(5);
    }

    void clear() {
        cache.clear();
    }

    boolean loaded(TextureMetrics metrics, int i) {
        if (i == -1) {
            i = metrics.length * -931821243;
        }

        if (!metrics.aBool1701 || !toolkit.method2496()) {
            if (metrics.aClass554_1727 != Class554.aClass554_7499 || !Class279.method5212(metrics.aByte1719)) {
                return anTextureLoader_3414.loaded(TextureType.TEXTURE_AND_MATERIAL, metrics.id * -464558709);
            }

            return anTextureLoader_3414.loaded(TextureType.TEXTURE_AND_MATERIAL, metrics.id * -464558709);
        }

        return anTextureLoader_3414.loaded(TextureType.TEXTURE_AND_MATERIAL, metrics.id * -464558709);
    }

    Native2DTexture get(TextureMetrics metrics, int i) {
        long l = i << 16 | metrics.id * -464558709;
        Native2DTexture cached = cache.get(l);
        if (cached != null) {
            return cached;
        } else if (!loaded(metrics, i)) {
            return null;
        }

        if (i == -1) {
            i = metrics.length * -931821243;
        }

        Native2DTexture texture;
        if (!metrics.aBool1701 || !toolkit.method2496()) {
            int[] is;
            if (metrics.aClass554_1727 != Class554.aClass554_7499 || !Class279.method5212(metrics.aByte1719)) {
                is = anTextureLoader_3414.loadOpaque(TextureType.TEXTURE_AND_MATERIAL, metrics.id * -464558709, 0.7F);
            } else {
                is = anTextureLoader_3414.loadTranslucent(TextureType.TEXTURE_AND_MATERIAL, metrics.id * -464558709, 0.7F);
            }

            texture = toolkit.create2DTexture(i, i, true, is);
        } else {
            float[] fs = anTextureLoader_3414.loadCombined(TextureType.TEXTURE_AND_MATERIAL, metrics.id * -464558709, 0.7F);
            texture = toolkit.method14658(Class121.aClass121_1465, i, i, true, fs);
        }

        texture.setRepeating(metrics.aByte1709 == 1, metrics.aByte1705 == 1);
        cache.put(l, texture, i * i);
        return texture;
    }

}