package com.jagex;

public class Skill {

    static final int anInt7579 = 2000000000;

    SkillLevel level;

    int rawLevel = -1182317223;
    boolean raw;
    int experience = 0;
    int currentLevel = 511065337;

    public Skill(SkillLevel level, boolean raw) {
        this.level = level;
        this.raw = raw;
    }

    static final void method9560(byte i) {
        byte[][][] is = Client.scene.method7694();
        if (null == is) {
            is = new byte[4][Client.scene.getMapWidth()][Client.scene.getMapLength()];
            Client.scene.method7770(is);
        }

        for (int i_7_ = 0; i_7_ < 4; i_7_++) {
            for (int i_8_ = 0; i_8_ < Client.scene.getMapWidth(); i_8_++) {
                for (int i_9_ = 0; i_9_ < Client.scene.getMapLength(); i_9_++) {
                    is[i_7_][i_8_][i_9_] = i;
                }
            }
        }
    }

    public void method9529(int i) {
        currentLevel = i * 511065337;
    }

    public int getExperience() {
        return 1440396249 * experience;
    }

    public void method9532(int i) {
        experience = i * -1261134743;

        if (experience * 1440396249 < 0) {
            experience = 0;
        } else if (raw && 1440396249 * experience > 2000000000) {
            experience = 455717888;
        } else if (!raw && experience * 1440396249 > 200000000) {
            experience = 904565248;
        }

        method9540();
    }

    public int method9534(Class615 class615) {
        if (class615 == Class615.aClass615_7954 && level.isCappedInF2p() && level.method9453()) {
            int maximum = level.getMaximumLevel();

            if (-340086039 * rawLevel > maximum) {
                return maximum;
            }
        }

        return -340086039 * rawLevel;
    }

    public int method9536() {
        return rawLevel * -340086039;
    }

    public int method9543() {
        return currentLevel * 1451607369;
    }

    public int method9556(Class615 class615) {
        if (Class615.aClass615_7954 == class615 && level.isCappedInF2p() && level.method9453()) {
            int experience = level.getExperience();
            if (!raw) {
                experience /= 10;
            }

            if (this.experience * 1440396249 > experience) {
                return experience;
            }
        }

        return experience * 1440396249;
    }

    void method9540() {
        if (raw) {
            rawLevel = level.levelForRawExperience(1440396249 * experience) * -1182317223;
        } else {
            rawLevel = level.levelForExperience(1440396249 * experience) * -1182317223;
        }
    }

}