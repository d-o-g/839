package com.jagex;

public abstract class Class467 {
    public static ParallelHttpProvider aClass432_6478;
    public static Archive materials;

    Class467() {

    }

    public static Class467 method6970() {
        Class467_Sub1 class467_sub1;
        try {
            class467_sub1 = new Class467_Sub1();
        } catch (Throwable throwable) {
            return new Class467_Sub2();
        }

        return class467_sub1;
    }

    public static final int safeLight(int colour, int light) {
        if (-2 == colour) {
            return 12345678;
        }
        if (colour == -1) {
            if (light < 2) {
                light = 2;
            } else if (light > 126) {
                light = 126;
            }

            return light;
        }

        light = light * (colour & 0x7f) >> 7;
        if (light < 2) {
            light = 2;
        } else if (light > 126) {
            light = 126;
        }

        return light + (colour & 0xff80);
    }

    static void method7906(int plane) {
        Class63.anInt947 = 0;
        int i_2_ = Client.scene.getMapWidth();
        int i_3_ = Client.scene.getMapLength();
        TileFlags flags = Client.scene.method7775();
        SceneGraph sceneGraph = Client.scene.getGraph();
        ObjectDefinitionLoader loader = Client.scene.getObjectLoader();

        int i_4_ = plane;
        if (null != Client.localPlayer) {
            int i_5_ = Client.localPlayer.pathX[0] >> 3;
            int i_6_ = Client.localPlayer.pathZ[0] >> 3;

            if (i_5_ >= 0 && i_5_ < IdentikitDefinitionProvider.aBoolArrayArray3303.length && i_6_ >= 0
                    && i_6_ < IdentikitDefinitionProvider.aBoolArrayArray3303[i_5_].length
                    && IdentikitDefinitionProvider.aBoolArrayArray3303[i_5_][i_6_]) {
                i_4_ = 0;
            }
        }

        for (int i_7_ = 0; i_7_ < i_2_; i_7_++) {
            for (int i_8_ = 0; i_8_ < i_3_; i_8_++) {
                for (int i_9_ = i_4_; i_9_ <= plane + 1 && i_9_ <= 3; i_9_++) {
                    if ((i_9_ < plane || flags.method7067(plane, i_9_, i_7_, i_8_))
                            && !Class494.method8545((SceneObject) sceneGraph.getTileDecoration(i_9_, i_7_, i_8_), loader, i_7_,
                            i_8_)
                            && !Class494.method8545(
                            (SceneObject) sceneGraph.getEntity(i_9_, i_7_, i_8_, Client.anSceneEntityPredicate_10904),
                            loader, i_7_, i_8_)
                            && !Class494.method8545((SceneObject) sceneGraph.getBoundary(i_9_, i_7_, i_8_), loader, i_7_,
                            i_8_)
                            && !Class494.method8545((SceneObject) sceneGraph.getBoundaryDecoration(i_9_, i_7_, i_8_), loader, i_7_,
                            i_8_)) {

                    }
                }
            }
        }
    }

    final int method7890(long l) {
        long time = method7897();
        if (time > 0L) {
            Client.sleep(time);
        }

        return method7905(l);
    }

    abstract void method7891();

    abstract long method7894();

    abstract long method7897();

    abstract int method7905(long l);

}