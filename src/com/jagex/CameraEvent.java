package com.jagex;

public abstract class CameraEvent extends Cacheable {

    public int anInt11433;

    CameraEvent(int i) {
        anInt11433 = i * -1238969663;
    }

    static final void method17893(ScriptExecutionContext class613) {
        int i_0_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
        class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.mobShadows
                .compatible(i_0_);
    }

    public abstract void method17880(float f, byte i);

    public abstract void method17881(Class268 class268, Matrix4x3 class405, Matrix4f class399, byte i);

    public abstract void method17882(Buffer buffer, int i);
}
