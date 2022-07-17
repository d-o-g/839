package com.jagex;

public class SkillLevel {

    static int[] SKILL_EXPERIENCES = new int[120];

    //build xp table
    static {
        int experience = 0;
        for (int level = 0; level < 120; level++) {
            int lvl = 1 + level;
            int offset = (int) (lvl + 300.0 * Math.pow(2.0, lvl / 7.0));
            experience += offset;
            SKILL_EXPERIENCES[level] = experience / 4;
        }
    }

    boolean cappedInF2p; //formerly membersOnly. since 'member skills' r now free up to lvl 5 i named this capped
    int index; //index within the array
    int maximumLevel; //120 or 99
    int experience; //current experience
    int anInt7520;

    SkillLevel(int index, int i_0_, boolean bool, int level) {
        this.index = -354006147 * index;
        anInt7520 = -959862575 * i_0_;
        cappedInF2p = bool;

        if (bool) {
            maximumLevel = level * -593761733;
            experience = rawExperienceForLevel(level) * 192354091;
        } else {
            maximumLevel = 593761733;
            experience = -192354091;
        }
    }

    public int levelForExperience(int experience) {
        int level = 1;
        int max = -5787599 * anInt7520 - 1;

        for (int index = 0; index < max && experience >= SKILL_EXPERIENCES[index]; index++) {
            level = 2 + index;
        }

        return level;
    }

    public int levelForRawExperience(int experience) {
        return levelForExperience(experience / 10);
    }

    public int getExperience() {
        return experience * 1128984451;
    }

    public int getMaximumLevel() {
        return 688742131 * maximumLevel;
    }

    public boolean isCappedInF2p() {
        return cappedInF2p;
    }

    public boolean method9453() {
        return 1128984451 * experience != -1;
    }

    int experienceForLevel(int level) {
        if (level < 0) {
            level = 0;
        }
        if (level > anInt7520 * -5787599) {
            level = anInt7520 * -5787599;
        }

        if (level < 2) {
            return 0;
        }

        return SKILL_EXPERIENCES[level - 2];
    }

    int getIndex() {
        return index * 1228719573;
    }

    int rawExperienceForLevel(int level) {
        return experienceForLevel(level) * 10;
    }

}