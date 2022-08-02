package com.jagex;

public class Class364 implements Interface44 {

    public static PaddedResourceWorker<Connection> netWorker;

    ReferenceCache<Class361> cache = new ReferenceCache<Class361>(64);
    Archive particles;

    public Class364(Archive patricles) {
        particles = patricles;
    }

    public static final void method6081() {
        if (-1087837371 * Class31.loginState != 3) {
            Class31.activeConnection.stopConnection();
            Class410.method6946();
            Client.method5397();
        }
    }

    static final void sweepLoaderCaches() {
        OverlayDefinition.loader.sweep(5);
        UnderlayDefinition.loader.sweep(5);
        IdentikitDefinition.loader.sweep(5);
        Client.scene.getObjectLoader().sweep(5);
        NpcDefinition.loader.sweep(5);
        ItemDefinition.loader.sweep(5);
        Animation.loader.sweep(5);
        EffectDefinition.loader.sweep(5);
        VarpBit.loader.sweep(5);
        Varp.varpLoader.sweep(5);
        Npc.varpLoader.sweep(5);
        Class501.aClass77_Sub1_Sub1_6903.sweep(5);
        Class184.aClass77_Sub1_Sub1_2006.sweep(5);
        SunDefinition.aClass77_Sub1_Sub1_2846.sweep(5);
        ProxyingVariableLoader.aClass678_Sub6_3003.sweep(5);
        Queue.aClass678_Sub8_8139.sweep(5);
        MapSceneDefinition.loader.sweep(5);
        ParameterDefinition.loader.sweep(5);
        SkyboxDefinition.loader.sweep(5);
        SunDefinition.loader.sweep(5);
        Class457.aClass678_Sub21_5151.sweep(5);
        CursorDefinition.loader.sweep(5);
        HitsplatDefinition.loader.sweep(5);
        HitbarDefinition.loader.sweep(5);
        PlayerAppearance.method6947(5);
        Component.method3326(50);
        Class509.aClass374_6997.sweep(50);
        Class580.method9829(5);
        Class188.method3746(5);
        Client.aClass168_10883.sweep(5);
        Client.aClass168_10649.sweep(5);
        Class56.aClass168_617.sweep(5);
        Class626.aClass168_8035.sweep(5);
        Client.aClass168_10778.sweep(5);
    }

    public void clearCache() {
        cache.clear();
    }

    @Override
    public Class361 load(int id) {
        Class361 class361 = cache.get(id);
        if (class361 != null) {
            return class361;
        }

        byte[] data = particles.get(1, id);
        class361 = new Class361();
        class361.id = id * -2125905417;
        if (null != data) {
            class361.decode(new Buffer(data));
        }

        class361.method6054();
        cache.put(id, class361);
        return class361;
    }

}