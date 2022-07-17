package com.jagex;

public class PlayerInterfaceNode extends InterfaceNode {

    static MenuItem aClass480_Sub31_Sub17_11430;
    static int menuWidth;

    int index;

    public PlayerInterfaceNode(int id, int state, int index) {
        super(id, state);
        this.index = index * -1007889265;
    }

    @Override
    public boolean method16250() {
        Player player = Client.players[index * 2071579247];
        if (null != player) {
            Class253.fireScriptOnMobile(Class520.playerType, id * 1021060255, -1, player, 2071579247 * index);
            return true;
        }
        return false;
    }

}