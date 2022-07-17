package com.jagex;

public class NpcInterfaceNode extends InterfaceNode {

    int index;

    public NpcInterfaceNode(int id, int state, int index) {
        super(id, state);
        this.index = index * 390350975;
    }

    @Override
    public boolean method16250() {
        ObjectNode<Npc> npc = Client.npcTable.get(-1441564801 * index);
        if (npc != null) {
            Class253.fireScriptOnMobile(Class520.npcType, 1021060255 * id, -1, npc.referent, index * -1441564801);
            return true;
        }
        return false;
    }
}
