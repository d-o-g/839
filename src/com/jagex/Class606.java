package com.jagex;

public class Class606 {
    int anInt7905;
    CoordGrid base;

    public Class606(CoordGrid class553, int i) {
        base = class553;
        anInt7905 = i * 903024319;
    }

    public static boolean setWorld(int id, String host) {
        Class671.activeConnectionInfo = new ConnectionInfo(false);
        Class671.activeConnectionInfo.id = -212349065 * id;
        Class671.activeConnectionInfo.host = host;

        if (Class622.aClass622_8012 != ArchiveLoader.aClass622_4521) {
            Class671.activeConnectionInfo.port = -1309620211 * Class671.activeConnectionInfo.id + 759363264;
            Class671.activeConnectionInfo.alternatePort = Class671.activeConnectionInfo.id * 733597859 + 380423312;
        }
        return true;
    }

    public ItemPile method10247(short i) {
        ItemDeque class480_sub3 = Client.groundItems.get(base.level * 394202151 << 28 | base.y * -180305283 << 14 | base.x * 2051316501);
        if (class480_sub3 == null) {
            return null;
        }
        CoordGrid class553 = Client.scene.getBase();
        int x = 2051316501 * base.x - class553.x * 2051316501;
        int y = base.y * -180305283 - -180305283 * class553.y;
        if (x >= 0 && y >= 0 && x < Client.scene.getMapWidth() && y < Client.scene.getMapLength()
                && Client.scene.getGraph() != null) {
            for (Item item = class480_sub3.items.head(); item != null; item = class480_sub3.items.next()) {
                if (item.id * 1659909117 == anInt7905 * 784818495) {
                    return (ItemPile) Client.scene.getGraph().getTileObject(
                            394202151 * base.level, x, y, (byte) -8);
                }
            }
        }
        return null;
    }

}