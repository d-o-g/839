package com.jagex;

public class FriendsChatPlayer {

    public String aString1017;
    public String accountName;
    public int world;
    public byte rank;
    public String aString1022;
    String displayName;
    public FriendsChatPlayer() {
    }

    static void method1538() {
        Client.lobbyConnection.stopConnection();
        if (Class34.loginErrors * -1507527029 < 2) {
            Class671.lobbyConnectionInfo.swap();
            Class34.loginTicks = 0;
            Class34.loginErrors += 388710691;
            Class34.aClass40_450 = Class40.aClass40_542;
        } else {
            Class34.aClass40_450 = null;
            Class34.aClass653_451 = Class653.aClass653_8225;
            Class536.setConnectionState(0);
        }
    }

    static boolean method1539() {
        if (Client.aByteArray10716 != null) {
            return Class340.lobby();
        } else if (Class31.socialNetworkId * -1420488133 != -1) {
            return DefaultMapEntry.method6279();
        }

        return PlayerMapDot.method3871(Class31.accountUsername, Class31.accountPassword);
    }

    static void method1540() {
        for (ExpandableMenuItem emi = Class56.expandableMenuItems.getFront(); null != emi; emi = Class56.expandableMenuItems.next()) {
            if (713555001 * emi.optionCount > 1) {
                emi.optionCount = 0;
                ExpandableMenuItem.cache.put(((MenuItem) emi.options.tail.nextCacheable).key
                        * -6309744751763661005L, emi);
                emi.options.clear();
            }
        }
        ExpandableMenuItem.count = 0;
        Class56.menuOptionCount = 0;
        MenuItem.options.clear();
        ExpandableMenuItem.categories.clear();
        Class56.expandableMenuItems.clear();
        MenuItem.insert(Class56.aClass480_Sub31_Sub17_615);
    }

}