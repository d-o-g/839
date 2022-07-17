package com.jagex;

public class MobProvider implements GameCharacterProvider {

    @Override
    public GameCharacter get(CharacterType type, int index) {
        if (type == CharacterType.PLAYER) {
            return Client.players[index];
        }

        if (CharacterType.NPC == type) {
            ObjectNode<Npc> linkable = Client.npcTable.get(index);
            if (linkable != null) {
                return linkable.referent;
            }
        }

        return null;
    }

}