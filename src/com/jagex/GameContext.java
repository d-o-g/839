package com.jagex;

public class GameContext {
    public static GameContext RUNESCAPE = new GameContext("runescape", "RuneScape", 0, Class25.aClass25_347);
    public static GameContext STELLAR_DAWN = new GameContext("stellardawn", "Stellar Dawn", 1, Class25.aClass25_340);
    static GameContext RUNESCAPE_2007 = new GameContext("oldscape", "RuneScape 2007", 5, Class25.aClass25_347);
    static GameContext aClass623_8018 = new GameContext("game3", "Game 3", 2, Class25.aClass25_347);
    static GameContext aClass623_8019 = new GameContext("game4", "Game 4", 3, Class25.aClass25_337);
    static GameContext aClass623_8020 = new GameContext("game5", "Game 5", 4, Class25.aClass25_342);
    public String domain;
    public String name;
    public int id;
    GameContext(String domain, String name, int id, Class25 class25) {
        this.domain = domain;
        this.name = name;
        this.id = id * 1459032409;
    }

    public static Interface method10444(int i, int[] is, Interface class221, boolean bool) {
        if (!UnboundedDefinitionLoaderIterator.interfaces.loadEntry(i)) {
            return null;
        }
        int i_2_ = UnboundedDefinitionLoaderIterator.interfaces.childSize(i);
        Component[] class226s;
        if (i_2_ == 0) {
            class226s = new Component[0];
        } else if (null == class221) {
            class226s = new Component[i_2_];
        } else {
            class226s = class221.components;
        }
        if (null == class221) {
            class221 = new Interface(bool, class226s);
        } else {
            class221.components = class226s;
            class221.closed = bool;
        }
        for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
            if (null == class221.components[i_3_]) {
                byte[] data = UnboundedDefinitionLoaderIterator.interfaces.get(i, i_3_, is);
                if (null != data) {
                    Component class226 = class221.components[i_3_] = new Component();
                    class226.uid = -1375110385 * (i_3_ + (i << 16));
                    class226.method4301(new Buffer(data));
                }
            }
        }
        return class221;
    }

    public static GameContext valueOf(int id) {
        GameContext[] values = GameContext.values();
        for (GameContext context : values) {
            if (context.id * -1589762327 == id) {
                return context;
            }
        }

        return null;
    }

    static GameContext[] values() {
        return new GameContext[]{aClass623_8019, aClass623_8020, RUNESCAPE_2007, aClass623_8018, RUNESCAPE,
                STELLAR_DAWN};
    }

}