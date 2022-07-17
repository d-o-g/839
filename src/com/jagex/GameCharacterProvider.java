package com.jagex;

public interface GameCharacterProvider {

    GameCharacter get(CharacterType type, int index);

}