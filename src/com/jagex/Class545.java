package com.jagex;

public class Class545 {

    Class545() throws Throwable {
        throw new Error();
    }

    static void method9300(Class498 class498, int i, int i_2_, int i_3_, Model class143) {
        if (class143 != null) {
            class498.method8679(i, i_2_, i_3_, class143.method2920(), class143.minimumX(), class143.maximumX(),
                    class143.minimumY(), class143.maximumY(), class143.minimumZ(), class143.maximumZ());
        }
    }

    static void renderNpcsOnMinimap(Toolkit toolkit, int i, int i_5_, Component component, ClippingMask clipping, int i_6_, int i_7_) {
        for (int index = 0; index < 1746328619 * Client.npcCount; index++) {
            ObjectNode<Npc> linkable = Client.npcTable.get(Client.npcIndices[index]);
            if (null != linkable) {
                Npc npc = linkable.referent;

                if (npc.hasDefinition() && Client.localPlayer.plane == npc.plane) {
                    NpcDefinition definition = npc.definition;
                    if (null != definition && null != definition.morphisms) {
                        definition = definition.morph(PlayerFacade.instance, PlayerFacade.instance);
                    }

                    if (null != definition && definition.drawMapdot && definition.aBool3052) {
                        Vector3f vector3f = npc.getCoordinateSpace().translation;
                        int i_10_ = (int) vector3f.x / 128 - i / 128;
                        int i_11_ = (int) vector3f.z / 128 - i_5_ / 128;

                        if (-1 != definition.mapFunction * -27195067) {
                            Component.method7346(toolkit, clipping, component, i_6_, i_7_, i_10_, i_11_,
                                    definition.mapFunction * -27195067, -541076374);
                        } else {
                            Class369.addMapSprite(component, clipping, i_6_, i_7_, i_10_, i_11_, Client.mapDots[1]);
                        }
                    }
                }
            }
        }
    }

}