package com.jagex;

import java.util.Iterator;

public class Class655 {

    public static Class655 aClass655_8245 = new Class655(1);
    static Class655 aClass655_8244 = new Class655(0);
    static Class655 aClass655_8246 = new Class655(2);

    public int anInt8247;

    Class655(int i) {
        anInt8247 = -1456938265 * i;
    }

    static final void method13548(boolean bool) {
        Client.removedNpcCount = 0;
        Client.anInt10914 = 0;
        Client.anInt10660 += -649086263;
        Npc.method10244();
        Class62.method1383(bool);
        Class558.method9423();

        boolean bool_0_ = false;
        for (int i = 0; i < Client.removedNpcCount * -1916211251; i++) {
            int index = Client.removedNpcIndices[i];
            ObjectNode linkable = Client.npcTable.get(index);
            Npc npc = (Npc) linkable.referent;

            if (-1964015751 * Client.anInt10660 != 1024539063 * npc.lastUpdate) {
                if (Class56.menuOpen && Class220.method4154(index)) {
                    HitbarDefinition.method8950();
                }
                if (npc.definition.method5111()) {
                    Class480_Sub18.method8150(npc);
                }
                npc.setDefinition(null);
                linkable.unlink();
                bool_0_ = true;
            }
        }
        if (bool_0_) {
            int i_3_ = -999337347 * Client.anInt10862;
            Client.anInt10862 = Client.npcTable.size() * 1526871765;
            int i_4_ = 0;
            Iterator iterator = Client.npcTable.iterator();
            while (iterator.hasNext()) {
                ObjectNode class480_sub25 = (ObjectNode) iterator.next();
                Client.npcs[i_4_++] = class480_sub25;
            }
            for (int i_5_ = Client.anInt10862 * -999337347; i_5_ < i_3_; i_5_++) {
                Client.npcs[i_5_] = null;
            }
            Class270 class270 = Client.camera.method4837();
            if (Class270.aClass270_2995 == class270) {
                Class281_Sub2 class281_sub2 = (Class281_Sub2) Client.camera.method4876();
                class281_sub2.method15238();
            }
            Class257 class257 = Client.camera.method4836();
            if (class257 == Class257.aClass257_2855) {
                Class642_Sub3 class642_sub3 = (Class642_Sub3) Client.camera.method4834();
                class642_sub3.method16723();
            }
        }
        if (-842560185 * Client.gameConnection.currentFrameSize != -165875887 * Client.gameConnection.buffer.caret) {
            throw new RuntimeException(new StringBuilder().append(-165875887 * Client.gameConnection.buffer.caret)
                    .append(" ").append(Client.gameConnection.currentFrameSize * -842560185).toString());
        }
        for (int i_6_ = 0; i_6_ < Client.npcCount * 1746328619; i_6_++) {
            if (Client.npcTable.get(Client.npcIndices[i_6_]) == null) {
                throw new RuntimeException(new StringBuilder().append(i_6_).append(" ")
                        .append(1746328619 * Client.npcCount).toString());
            }
        }
        if (0 != Client.anInt10862 * -999337347 - Client.npcCount * 1746328619) {
            throw new RuntimeException(new StringBuilder()
                    .append(-999337347 * Client.anInt10862 - Client.npcCount * 1746328619).toString());
        }
        for (int i_7_ = 0; i_7_ < -999337347 * Client.anInt10862; i_7_++) {
            if (Client.anInt10660 * -1964015751 != Client.npcs[i_7_].referent.lastUpdate * 1024539063) {
                throw new RuntimeException(new StringBuilder()
                        .append(Client.npcs[i_7_].referent.index * 387935885).toString());
            }
        }
    }

    static final void method13549(ScriptExecutionContext class613, int i) {
        class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = ItemDefinition.aMappingVarpProvider_8339
                .method3768() ? 1 : 0;
    }

    static final void method13550(Component class226, Interface class221, ScriptExecutionContext class613, int i) {
        String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
        if (ScriptExecutionContext.method9239(string, class613) != null) {
            string = string.substring(0, string.length() - 1);
        }
        class226.anObjectArray2495 = World.method16248(string, class613);
        class226.aBool2483 = true;
    }

    static Class655[] values() {
        return new Class655[]{aClass655_8244, aClass655_8246, aClass655_8245};
    }

    public static Class655 valueOf(int i) {
        Class655[] class655s = values();
        for (Class655 class655 : class655s) {
            if (-1219686185 * class655.anInt8247 == i) {
                return class655;
            }
        }
        return null;
    }
}
