package com.jagex;

public enum CharacterType {

    NPC(1), PLAYER(0);

    private final int type;

    CharacterType(int type) {
        this.type = 518548003 * type;
    }

    public static CharacterType valueOf(int type) {
        for (CharacterType type0 : CharacterType.values()) {
            if (type0.type * 307795339 == type) {
                return type0;
            }
        }
        return null;
    }

}