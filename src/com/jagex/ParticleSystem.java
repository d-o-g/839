package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ParticleSystem {
    public static int[] maxParticleSystems = {3, 7, 15}; //systemcount[setting]
    static boolean[] aBoolArray7574 = new boolean[64];
    static boolean[] aBoolArray7575 = new boolean[16];
    static int particleCount;
    static int particleSetting = 1625351754;
    static int cachedCount;
    static ParticleSystem[] cache;
    public boolean stopped = false;
    ParticleEntities entities = new ParticleEntities();
    List<Class480_Sub27> aList7561 = new LinkedList<>();
    Particle[] particles = new Particle[8192];
    List<ParticleProducer> aList7563 = new LinkedList<>();
    long currentTick;
    long startTick;
    int producerCount;
    int anInt7568;
    int anInt7569;
    boolean aBool7570;
    boolean aBool7571;
    boolean aBool7572 = false;
    int plane;
    ParticleSystem(int tick, boolean bool) {
        init(tick, bool);
    }

    public static ParticleSystem create(int tick, boolean bool) {
        if (ParticleSystem.cachedCount * 770914151 != particleCount * 1022879265) {
            ParticleSystem system = ParticleSystem.cache[particleCount * 1022879265];
            particleCount = (particleCount * 1022879265 + 1 & maxParticleSystems[particleSetting
                    * -897945427]) * 963452385;
            system.init(tick, bool);
            return system;
        }

        return new ParticleSystem(tick, bool);
    }

    public static void method3934(Toolkit toolkit, long l) {
        Class570.anInt7640 = -1296846143 * Class570.anInt7633;
        Class570.anInt7633 = 0;
        TimeUtil.time();
        Iterator<ParticleSystem> iterator = Class570.particleSystems.iterator();

        while (iterator.hasNext()) {
            ParticleSystem system = iterator.next();
            boolean active = system.isActive(toolkit, l);

            if (!active) {
                iterator.remove();
                cache[cachedCount * 770914151] = system;
                cachedCount = (cachedCount * 770914151 + 1 & maxParticleSystems[-897945427
                        * particleSetting])
                        * -35195817;
            }
        }
    }

    public static int getParticleSetting() {
        return particleSetting * -897945427;
    }

    public static void setParticleSetting(int setting) {
        if (setting < 0 || setting > 2) {
            setting = 0;
        }

        particleSetting = setting * 812675877;
        ParticleSystem.cache = new ParticleSystem[1 + maxParticleSystems[-897945427
                * particleSetting]];
        particleCount = 0;
        ParticleSystem.cachedCount = 0;
    }

    public void method9482() {
        aBool7570 = true;
    }

    public void method9484() {
        aBool7572 = true;
    }

    public void method9485(int plane, int i_0_, int i_1_, int i_2_, int i_3_) {
        this.plane = plane;
    }

    public void method9487(long time) {
        startTick = time;
    }

    public void method9488(Toolkit toolkit, long time, Class145[] class145s, Class115[] class115s, boolean bool) {
        if (!stopped) {
            method9509(toolkit, class145s, bool);
            method9490(class115s, bool);
            startTick = time;
        }
    }

    public ParticleEntities method9492() {
        return entities;
    }

    public ParticleEntities method9494() {
        entities.entities.clear();
        for (Particle particle : particles) {
            if (particle != null && particle.emitter != null) {
                entities.entities.offer(particle);
            }
        }

        return entities;
    }

    void init(int tick, boolean bool) {
        Class570.particleSystems.add(this);
        startTick = tick;
        currentTick = tick;
        aBool7570 = true;
        aBool7571 = bool;
    }

    void stop() {
        stopped = true;
        Iterator<Class480_Sub27> iterator = aList7561.iterator();
        while (iterator.hasNext()) {
            Class480_Sub27 class480_sub27 = iterator.next();
            if (class480_sub27.aClass361_10188.anInt3894 * 939371847 == 1) {
                class480_sub27.unlink();
            }
        }

        for (int index = 0; index < particles.length; index++) {
            if (particles[index] != null) {
                particles[index].kill();
                particles[index] = null;
            }
        }

        anInt7568 = 0;
        aList7563 = new LinkedList();
        producerCount = 0;
        aList7561 = new LinkedList();
        anInt7569 = 0;
    }

    boolean isActive(Toolkit toolkit, long l) {
        if (startTick != currentTick) {
            method9484();
        } else {
            method9521();
        }

        if (l - startTick > 750L) {
            stop();
            return false;
        }

        int i = (int) (l - currentTick);
        if (aBool7570) {
            Iterator<ParticleProducer> iterator = aList7563.iterator();
            while (iterator.hasNext()) {
                ParticleProducer producer = iterator.next();
                for (int i_4_ = 0; i_4_ < producer.definition.anInt3763 * 2087177385; i_4_++) {
                    producer.method9676(toolkit, l, 1, !aBool7572);
                }
            }
            aBool7570 = false;
        }

        Iterator<ParticleProducer> iterator = aList7563.iterator();
        while (iterator.hasNext()) {
            ParticleProducer producer = iterator.next();
            producer.method9676(toolkit, l, i, !aBool7572);
        }

        currentTick = l;
        return true;
    }

    void method9490(Class115[] class115s, boolean bool) {
        for (int i = 0; i < 16; i++) {
            aBoolArray7575[i] = false;
        }
        Iterator iterator = aList7561.iterator();
        while_1_:
        while (iterator.hasNext()) {
            Class480_Sub27 class480_sub27 = (Class480_Sub27) iterator.next();
            if (class115s != null) {
                for (int i = 0; i < class115s.length; i++) {
                    if (class480_sub27.aClass115_10194 == class115s[i]
                            || class480_sub27.aClass115_10194 == class115s[i].aClass115_1441) {
                        aBoolArray7575[i] = true;
                        class480_sub27.method16037((byte) 61);
                        continue while_1_;
                    }
                }
            }
            if (!bool) {
                class480_sub27.unlink();
                anInt7569--;
                if (class480_sub27.isLinked()) {
                    class480_sub27.unlink();
                    Class570.anInt7643 -= -2143761211;
                }
            }
        }
        if (class115s != null) {
            for (int i = 0; i < class115s.length && i != 16 && anInt7569 != 16; i++) {
                if (!aBoolArray7575[i]) {
                    Class480_Sub27 class480_sub27 = null;
                    if (class115s[i].method2061(PlayerMapDot.anInterface44_2095).anInt3894 * 939371847 == 1
                            && Class570.anInt7643 * 718590477 < 32) {
                        class480_sub27 = new Class480_Sub27(class115s[i], this);
                        Class570.aClass667_7644.put(class115s[i].anInt1437 * 434135651, class480_sub27);
                        Class570.anInt7643 += -2143761211;
                    }
                    if (class480_sub27 == null) {
                        class480_sub27 = new Class480_Sub27(class115s[i], this);
                    }
                    aList7561.add(class480_sub27);
                    anInt7569++;
                    aBoolArray7575[i] = true;
                }
            }
        }
    }

    void method9509(Toolkit toolkit, Class145[] class145s, boolean bool) {
        for (int i = 0; i < 64; i++) {
            aBoolArray7574[i] = false;
        }

        Iterator<ParticleProducer> iterator = aList7563.iterator();
        producers:
        while (iterator.hasNext()) {
            ParticleProducer producer = iterator.next();

            if (class145s != null) {
                for (int i = 0; i < class145s.length && i != 64; i++) {
                    if (producer.particleMovement == class145s[i]
                            || producer.particleMovement == class145s[i].aClass145_1803) {
                        aBoolArray7574[i] = true;
                        producer.updatePosition();
                        producer.aBool7666 = false;
                        continue producers;
                    }
                }
            }

            if (!bool) {
                if (producer.particleCount * 766542015 == 0) {
                    iterator.remove();
                    producerCount--;
                } else {
                    producer.aBool7666 = true;
                }
            }
        }

        if (class145s != null) {
            for (int i = 0; i < class145s.length && i != 64 && producerCount != 64; i++) {
                if (!aBoolArray7574[i]) {
                    ParticleProducer producer = new ParticleProducer(toolkit, class145s[i], this, startTick);
                    aList7563.add(producer);
                    producerCount++;
                    aBoolArray7574[i] = true;
                }
            }
        }
    }

    void method9514(SceneGraph sceneGraph, Toolkit toolkit) {
        entities.entities.clear();
        Iterator<ParticleProducer> iterator = aList7563.iterator();

        while (iterator.hasNext()) {
            ParticleProducer emitter = iterator.next();
            emitter.method9675(sceneGraph, toolkit, currentTick);
        }
    }

    void method9521() {
        aBool7572 = false;
    }

}