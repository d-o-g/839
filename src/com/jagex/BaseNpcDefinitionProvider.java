package com.jagex;

public abstract class BaseNpcDefinitionProvider implements DefinitionProvider {
    static String aString2994;
    String[] defaultActions;
    GameContext game;
    Archive models;
    boolean membersServer;
    ReferenceCache<Model> modelCache = new ReferenceCache<Model>(5);
    int anInt2992;
    ReferenceCache<Model> aClass168_2993 = new ReferenceCache<Model>(50);
    BaseNpcDefinitionProvider(boolean members, Archive models, Language language, GameContext game) {
        membersServer = members;
        this.models = models;
        this.game = game;

        if (GameContext.RUNESCAPE == game) {
            defaultActions = new String[]{null, null, null, null, null,
                    TranslatableString.EXAMINE.translate(language)};
        } else {
            defaultActions = new String[]{null, null, null, null, null, null};
        }
    }

    static final void method5067(ScriptExecutionContext class613) {
        Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
        Component class226 = class611.aClass226_7914;
        Interface class221 = class611.aClass221_7913;
        class226.fontId = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] * -1584868157;
        Component.redraw(class226);
        if (-1 == class226.index * -592186295 && !class221.closed) {
            PulseEvent.method13719(1857819631 * class226.uid);
        }
    }

    static final void method5068(ScriptExecutionContext class613) {
        Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
        Component class226 = class611.aClass226_7914;
        class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class226.scrollPosition
                * -1881455913;
    }

    void clear(int i) {
        anInt2992 = -557728759 * i;
        synchronized (aClass168_2993) {
            aClass168_2993.clear();
        }
        synchronized (modelCache) {
            modelCache.clear();
        }
    }

    void clear() {
        synchronized (aClass168_2993) {
            aClass168_2993.clear();
        }
        synchronized (modelCache) {
            modelCache.clear();
        }
    }

    void sweep(int i) {
        synchronized (aClass168_2993) {
            aClass168_2993.sweep(i);
        }
        synchronized (modelCache) {
            modelCache.sweep(i);
        }
    }

    void setMembers(boolean members) {
        if (members != membersServer) {
            membersServer = members;
            clear();
        }
    }

    void clearSoft() {
        synchronized (aClass168_2993) {
            aClass168_2993.clearSoft();
        }
        synchronized (modelCache) {
            modelCache.clearSoft();
        }
    }

}