package com.jagex;

import java.util.Iterator;
import java.util.List;

public class Class531 implements Encodeable {
    int anInt7228;

    Class531(int i) {
        anInt7228 = i * -1631706671;
    }

    public static void method9030(Toolkit toolkit, long l) {
        toolkit.method2416();
        Class533.aLinkedList7260.clear();
        Class533.aLinkedList7284.clear();
        Class533.aLong7285 = (l + Class533.anInt7261 * -1477979021) * 9110903633089232207L;
    }

    static void method9031(Npc npc, boolean bool) {
        if (Class56.menuOptionCount * 84366055 < 406) {
            NpcDefinition npcDefinition = npc.definition;
            String string = npc.name;
            if (null != npcDefinition.morphisms) {
                npcDefinition = npcDefinition.morph(PlayerFacade.instance, PlayerFacade.instance);
                if (null == npcDefinition) {
                    return;
                }
                string = npcDefinition.name;
            }
            if (npcDefinition.aBool3052) {
                if (2011629825 * npc.combat != 0) {
                    String string_0_ = GameContext.STELLAR_DAWN == Client.game ? TranslatableString.RATING
                            .translate(Client.currentLanguage) : TranslatableString.LEVEL
                            .translate(Client.currentLanguage);
                    string = new StringBuilder()
                            .append(string)
                            .append(Class167.getCombatDifferenceHtml(npc.combat * 2011629825,
                                    1340998367 * Client.localPlayer.combat)).append(Class60.LEFT_PARENTHESIS)
                            .append(string_0_).append(npc.combat * 2011629825).append(Class60.RIGHT_PARENTHESIS)
                            .toString();
                }
                if (Client.componentSelected && !bool) {
                    ParameterDefinition class33 = -410965469 * LookupTable.anInt2647 != -1 ? ParameterDefinition.loader
                            .get(-410965469 * LookupTable.anInt2647) : null;
                    if (0 != (Class577.selectedComponentAttributes * -1564025309 & 0x2)
                            && (class33 == null || npcDefinition.getParameter(-410965469 * LookupTable.anInt2647,
                            -125275839 * class33.defaultInt) != class33.defaultInt * -125275839)) {
                        MenuItem.add(Client.selectedComponentAction, new StringBuilder().append(Client.aString10789)
                                        .append(" ").append(Class60.arrow).append(" ")
                                        .append(Item.getColorTags(16776960)).append(string).toString(),
                                Class166_Sub8.anInt9550 * -29134223, 8, -1, 387935885 * npc.index, 0, 0, true, false,
                                npc.index * 387935885, false);
                    }
                }
                if (!bool) {
                    String[] strings = npcDefinition.actions;
                    if (Client.aBool10797) {
                        strings = Class572.method9673(strings, (byte) -39);
                    }
                    if (strings != null) {
                        for (int i_1_ = strings.length - 1; i_1_ >= 0; i_1_--) {
                            if (strings[i_1_] != null
                                    && (781778657 * npc.anInt11800 & 1 << i_1_) == 0
                                    && (npcDefinition.aByte3076 == 0 || !strings[i_1_]
                                    .equalsIgnoreCase(TranslatableString.ATTACK
                                            .translate(Client.currentLanguage))
                                    && !strings[i_1_].equalsIgnoreCase(TranslatableString.EXAMINE
                                    .translate(Client.currentLanguage)))) {
                                int i_2_ = 0;
                                int i_3_ = 377198047 * Client.anInt10783;
                                if (0 == i_1_) {
                                    i_2_ = 9;
                                }
                                if (i_1_ == 1) {
                                    i_2_ = 10;
                                }
                                if (i_1_ == 2) {
                                    i_2_ = 11;
                                }
                                if (i_1_ == 3) {
                                    i_2_ = 12;
                                }
                                if (i_1_ == 4) {
                                    i_2_ = 13;
                                }
                                if (5 == i_1_) {
                                    i_2_ = 1003;
                                }
                                int i_4_ = npcDefinition.method5112(i_1_, 71746589);
                                if (i_4_ != -1) {
                                    i_3_ = i_4_;
                                }
                                MenuItem.add(strings[i_1_], new StringBuilder().append(Item.getColorTags(16776960))
                                                .append(string).toString(),
                                        strings[i_1_].equalsIgnoreCase(TranslatableString.ATTACK
                                                .translate(Client.currentLanguage)) ? npcDefinition.attackCursor
                                                * -61212913 : i_3_, i_2_, -1, 387935885 * npc.index, 0, 0, true, false,
                                        npc.index * 387935885, false);
                            }
                        }
                        if (npcDefinition.aByte3076 == 1) {
                            for (int i_5_ = 0; i_5_ < strings.length; i_5_++) {
                                if (strings[i_5_] != null
                                        && (781778657 * npc.anInt11800 & 1 << i_5_) == 0
                                        && (strings[i_5_].equalsIgnoreCase(TranslatableString.ATTACK
                                        .translate(Client.currentLanguage)) || strings[i_5_]
                                        .equalsIgnoreCase(TranslatableString.EXAMINE
                                                .translate(Client.currentLanguage)))) {
                                    short i_6_ = 0;
                                    if (npc.combat * 2011629825 > 1340998367 * Client.localPlayer.combat) {
                                        i_6_ = (short) 2000;
                                    }
                                    short i_7_ = 0;
                                    int i_8_ = 377198047 * Client.anInt10783;
                                    if (i_5_ == 0) {
                                        i_7_ = (short) 9;
                                    }
                                    if (1 == i_5_) {
                                        i_7_ = (short) 10;
                                    }
                                    if (2 == i_5_) {
                                        i_7_ = (short) 11;
                                    }
                                    if (3 == i_5_) {
                                        i_7_ = (short) 12;
                                    }
                                    if (i_5_ == 4) {
                                        i_7_ = (short) 13;
                                    }
                                    if (i_5_ == 5) {
                                        i_7_ = (short) 1003;
                                    }
                                    if (0 != i_7_) {
                                        i_7_ += i_6_;
                                    }
                                    int i_9_ = npcDefinition.method5112(i_5_, 71746589);
                                    if (-1 != i_9_) {
                                        i_8_ = i_9_;
                                    }
                                    MenuItem.add(strings[i_5_],
                                            new StringBuilder().append(Item.getColorTags(16776960)).append(string)
                                                    .toString(),
                                            strings[i_5_].equalsIgnoreCase(TranslatableString.ATTACK
                                                    .translate(Client.currentLanguage)) ? npcDefinition.attackCursor
                                                    * -61212913 : i_8_, i_7_, -1, npc.index * 387935885, 0, 0, true,
                                            false, 387935885 * npc.index, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    static void method9032(Toolkit class134, int i, int i_10_) {
        if (i >= 0 && i_10_ >= 0 && null != Class56.aClass399_645) {
            CoordGrid class553 = Client.scene.getBase();
            Matrix4f class399 = class134.getMatrix4f();
            Toolkit.method2868(class134);
            class399.method6548(Class56.aClass405_625);
            class399.method6547(Class56.aClass399_645);
            class399.method6643();
            int i_12_ = i - Class56.anInt639 * -1318900375;
            int i_13_ = i_10_ - Class56.anInt640 * 633667639;
            if (Client.scene.getGraph() != null) {
                if (!Client.componentSelected || 0 != (Class577.selectedComponentAttributes * -1564025309 & 0x40)) {
                    int i_14_ = -1;
                    int i_15_ = -1;
                    float f = i_12_ * 2.0F / (Class56.anInt641 * 992277267) - 1.0F;
                    float f_16_ = i_13_ * 2.0F / (Class56.anInt621 * 1249343635) - 1.0F;
                    class399.method6553(f, f_16_, -1.0F, Class56.aFloatArray651);
                    float f_17_ = Class56.aFloatArray651[0] / Class56.aFloatArray651[3];
                    float f_18_ = Class56.aFloatArray651[1] / Class56.aFloatArray651[3];
                    float f_19_ = Class56.aFloatArray651[2] / Class56.aFloatArray651[3];
                    class399.method6553(f, f_16_, 1.0F, Class56.aFloatArray651);
                    float f_20_ = Class56.aFloatArray651[0] / Class56.aFloatArray651[3];
                    float f_21_ = Class56.aFloatArray651[1] / Class56.aFloatArray651[3];
                    float f_22_ = Class56.aFloatArray651[2] / Class56.aFloatArray651[3];
                    float f_23_ = Class55.method1182(f_17_, f_18_, f_19_, f_20_, f_21_, f_22_, 4);
                    if (f_23_ > 0.0F) {
                        float f_24_ = f_20_ - f_17_;
                        float f_25_ = f_22_ - f_19_;
                        int i_26_ = (int) (f_17_ + f_24_ * f_23_);
                        int i_27_ = (int) (f_19_ + f_23_ * f_25_);
                        i_14_ = i_26_ + (Client.localPlayer.boundSize() - 1 << 8) >> 9;
                        i_15_ = i_27_ + (Client.localPlayer.boundSize() - 1 << 8) >> 9;
                        int i_28_ = Client.localPlayer.plane;
                        if (i_28_ < 3
                                && (Client.scene.method7775().flags[1][i_26_ >> 9][i_27_ >> 9] & 0x2) != 0) {
                            i_28_++;
                        }
                    }
                    if (-1 != i_14_ && i_15_ != -1) {
                        if (Client.componentSelected && 0 != (Class577.selectedComponentAttributes * -1564025309 & 0x40)) {
                            Component class226 = Class185.method3584(SceneGraph.anInt6751 * 1969702363, Client.anInt10756
                                    * -800680953);
                            if (null != class226) {
                                MenuItem.add(Client.selectedComponentAction,
                                        new StringBuilder().append(" ").append(Class60.arrow).append(" ")
                                                .toString(), Class166_Sub8.anInt9550 * -29134223, 59, -1, 0L, i_14_,
                                        i_15_, true, false, i_14_ << 32 | i_15_, true);
                            } else {
                                PlayerFacade.method1560();
                            }
                        } else {
                            if (TextureMetrics.aBool1729) {
                                MenuItem.add(TranslatableString.FACE_HERE.translate(Client.currentLanguage), "", -1,
                                        60, -1, 0L, i_14_, i_15_, true, false, i_14_ << 32 | i_15_, true);
                            }
                            MenuItem.add(ParticleTriangle.walkHere, "", 675691335 * Client.anInt10775, 23, -1, 0L,
                                    i_14_, i_15_, true, false, i_14_ << 32 | i_15_, true);
                        }
                    }
                }
                LoadedEntityContainer container = Client.scene.getGraph().aClass497_6711;
                int i_29_ = i;
                int i_30_ = i_10_;
                List list = container.elements;
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    LoadedEntity elem = (LoadedEntity) iterator.next();
                    if ((Client.aBool10687 || elem.node.plane == Client.localPlayer.plane)
                            && elem.isUnderPoint(class134, i_29_, i_30_)) {
                        int i_32_;
                        int i_33_;
                        if (elem.node instanceof SceneEntity) {
                            i_32_ = ((SceneEntity) elem.node).startX;
                            i_33_ = ((SceneEntity) elem.node).startY;
                        } else {
                            Vector3f vector3f = elem.node.getCoordinateSpace().translation;
                            i_32_ = (int) vector3f.x >> 9;
                            i_33_ = (int) vector3f.z >> 9;
                        }
                        if (elem.node instanceof Player) {
                            Player class600_sub1_sub3_sub1_sub1 = (Player) elem.node;
                            int i_34_ = class600_sub1_sub3_sub1_sub1.boundSize();
                            Vector3f vector3f = class600_sub1_sub3_sub1_sub1.getCoordinateSpace().translation;
                            if (0 == (i_34_ & 0x1) && ((int) vector3f.x & 0x1ff) == 0
                                    && ((int) vector3f.z & 0x1ff) == 0 || (i_34_ & 0x1) == 1
                                    && ((int) vector3f.x & 0x1ff) == 256 && ((int) vector3f.z & 0x1ff) == 256) {
                                int i_35_ = (int) vector3f.x - (class600_sub1_sub3_sub1_sub1.boundSize() - 1 << 8);
                                int i_36_ = (int) vector3f.z - (class600_sub1_sub3_sub1_sub1.boundSize() - 1 << 8);
                                for (int i_37_ = 0; i_37_ < Client.npcCount * 1746328619; i_37_++) {
                                    ObjectNode class480_sub25 = Client.npcTable.get(Client.npcIndices[i_37_]);
                                    if (class480_sub25 != null) {
                                        Npc class600_sub1_sub3_sub1_sub2 = (Npc) class480_sub25.referent;
                                        if (-1061209915 * class600_sub1_sub3_sub1_sub2.anInt11547 != Client.engineCycle
                                                && class600_sub1_sub3_sub1_sub2.aBool11499) {
                                            Vector3f vector3f_38_ = class600_sub1_sub3_sub1_sub2.getCoordinateSpace().translation;
                                            int i_39_ = (int) vector3f_38_.x
                                                    - (2117527163 * class600_sub1_sub3_sub1_sub2.definition.boundSize - 1 << 8);
                                            int i_40_ = (int) vector3f_38_.z
                                                    - (2117527163 * class600_sub1_sub3_sub1_sub2.definition.boundSize - 1 << 8);
                                            if (i_39_ >= i_35_
                                                    && 2117527163 * class600_sub1_sub3_sub1_sub2.definition.boundSize <= class600_sub1_sub3_sub1_sub1
                                                    .boundSize() - (i_39_ - i_35_ >> 9)
                                                    && i_40_ >= i_36_
                                                    && class600_sub1_sub3_sub1_sub2.definition.boundSize * 2117527163 <= class600_sub1_sub3_sub1_sub1
                                                    .boundSize() - (i_40_ - i_36_ >> 9)) {
                                                method9031(class600_sub1_sub3_sub1_sub2,
                                                        Client.localPlayer.plane != elem.node.plane);
                                                class600_sub1_sub3_sub1_sub2.anInt11547 = Client.engineCycle * 2138539533;
                                            }
                                        }
                                    }
                                }
                                int i_41_ = -1784886003 * Class80.playerCount;
                                int[] is = Class80.playerIndices;
                                for (int i_42_ = 0; i_42_ < i_41_; i_42_++) {
                                    Player player = Client.players[is[i_42_]];
                                    if (player != null && player.anInt11547 * -1061209915 != Client.engineCycle
                                            && class600_sub1_sub3_sub1_sub1 != player && player.aBool11499) {
                                        Vector3f vector3f_44_ = player.getCoordinateSpace().translation;
                                        int i_45_ = (int) vector3f_44_.x - (player.boundSize() - 1 << 8);
                                        int i_46_ = (int) vector3f_44_.z - (player.boundSize() - 1 << 8);
                                        if (i_45_ >= i_35_
                                                && player.boundSize() <= class600_sub1_sub3_sub1_sub1.boundSize()
                                                - (i_45_ - i_35_ >> 9)
                                                && i_46_ >= i_36_
                                                && player.boundSize() <= class600_sub1_sub3_sub1_sub1.boundSize()
                                                - (i_46_ - i_36_ >> 9)) {
                                            BigBoyVarpProviderImpl.method781(player,
                                                    elem.node.plane != Client.localPlayer.plane);
                                            player.anInt11547 = 2138539533 * Client.engineCycle;
                                        }
                                    }
                                }
                            }
                            if (-1061209915 * class600_sub1_sub3_sub1_sub1.anInt11547 == Client.engineCycle) {
                                continue;
                            }
                            BigBoyVarpProviderImpl.method781(class600_sub1_sub3_sub1_sub1,
                                    Client.localPlayer.plane != elem.node.plane);
                            class600_sub1_sub3_sub1_sub1.anInt11547 = Client.engineCycle * 2138539533;
                        }
                        if (elem.node instanceof Npc) {
                            Npc npc = (Npc) elem.node;
                            if (npc.definition != null) {
                                Vector3f vector3f = npc.getCoordinateSpace().translation;
                                if (0 == (npc.definition.boundSize * 2117527163 & 0x1)
                                        && ((int) vector3f.x & 0x1ff) == 0 && 0 == ((int) vector3f.z & 0x1ff)
                                        || 1 == (npc.definition.boundSize * 2117527163 & 0x1)
                                        && 256 == ((int) vector3f.x & 0x1ff) && ((int) vector3f.z & 0x1ff) == 256) {
                                    int i_47_ = (int) vector3f.x - (2117527163 * npc.definition.boundSize - 1 << 8);
                                    int i_48_ = (int) vector3f.z - (npc.definition.boundSize * 2117527163 - 1 << 8);
                                    for (int i_49_ = 0; i_49_ < Client.npcCount * 1746328619; i_49_++) {
                                        ObjectNode linkable = Client.npcTable.get(Client.npcIndices[i_49_]);
                                        if (null != linkable) {
                                            Npc other = (Npc) linkable.referent;
                                            if (-1061209915 * other.anInt11547 != Client.engineCycle && npc != other
                                                    && other.aBool11499) {
                                                Vector3f vector3f_51_ = other.getCoordinateSpace().translation;
                                                int i_52_ = (int) vector3f_51_.x
                                                        - (other.definition.boundSize * 2117527163 - 1 << 8);
                                                int i_53_ = (int) vector3f_51_.z
                                                        - (other.definition.boundSize * 2117527163 - 1 << 8);
                                                if (i_52_ >= i_47_
                                                        && other.definition.boundSize * 2117527163 <= npc.definition.boundSize
                                                        * 2117527163 - (i_52_ - i_47_ >> 9)
                                                        && i_53_ >= i_48_
                                                        && 2117527163 * other.definition.boundSize <= npc.definition.boundSize
                                                        * 2117527163 - (i_53_ - i_48_ >> 9)) {
                                                    method9031(
                                                            other,
                                                            Client.localPlayer.plane != elem.node.plane);
                                                    other.anInt11547 = 2138539533 * Client.engineCycle;
                                                }
                                            }
                                        }
                                    }
                                    int playerCount = Class80.playerCount * -1784886003;
                                    int[] playerIndices = Class80.playerIndices;
                                    for (int index = 0; index < playerCount; index++) {
                                        Player player = Client.players[playerIndices[index]];
                                        if (player != null && Client.engineCycle != player.anInt11547 * -1061209915
                                                && player.aBool11499) {
                                            Vector3f vector3f_56_ = player.getCoordinateSpace().translation;
                                            int i_57_ = (int) vector3f_56_.x - (player.boundSize() - 1 << 8);
                                            int i_58_ = (int) vector3f_56_.z - (player.boundSize() - 1 << 8);
                                            if (i_57_ >= i_47_
                                                    && player.boundSize() <= npc.definition.boundSize * 2117527163
                                                    - (i_57_ - i_47_ >> 9)
                                                    && i_58_ >= i_48_
                                                    && player.boundSize() <= npc.definition.boundSize * 2117527163
                                                    - (i_58_ - i_48_ >> 9)) {
                                                BigBoyVarpProviderImpl.method781(player,
                                                        Client.localPlayer.plane != elem.node.plane);
                                                player.anInt11547 = Client.engineCycle * 2138539533;
                                            }
                                        }
                                    }
                                }
                                if (Client.engineCycle == npc.anInt11547 * -1061209915) {
                                    continue;
                                }
                                method9031(npc, elem.node.plane != Client.localPlayer.plane);
                                npc.anInt11547 = 2138539533 * Client.engineCycle;
                            }
                        }
                        if (elem.node instanceof ItemPile) {
                            int x = class553.x * 2051316501 + i_32_;
                            int z = class553.y * -180305283 + i_33_;
                            ItemDeque deque = Client.groundItems.get(elem.node.plane << 28 | z << 14 | x);
                            if (deque != null) {
                                int i_61_ = 0;
                                Item item = deque.items.tail();
                                while (item != null) {
                                    ItemDefinition definition = ItemDefinition.loader.get(1659909117 * item.id);
                                    int i_62_;
                                    if (definition.aBool8335) {
                                        i_62_ = -2006367341 * definition.anInt8294;
                                    } else if (definition.members) {
                                        i_62_ = -670718769 * Script.aClass580_11401.anInt7763;
                                    } else {
                                        i_62_ = Script.aClass580_11401.anInt7762 * -661273573;
                                    }

                                    if (Client.componentSelected && elem.node.plane == Client.localPlayer.plane) {
                                        ParameterDefinition parameter = -1 != -410965469 * LookupTable.anInt2647 ? ParameterDefinition.loader
                                                .get(LookupTable.anInt2647 * -410965469) : null;
                                        if (0 != (Class577.selectedComponentAttributes * -1564025309 & 0x1)
                                                && (null == parameter || definition.getOrDefault(-410965469
                                                * LookupTable.anInt2647, parameter.defaultInt * -125275839) != -125275839
                                                * parameter.defaultInt)) {
                                            MenuItem.add(
                                                    Client.selectedComponentAction,
                                                    new StringBuilder().append(Client.aString10789).append(" ")
                                                            .append(Class60.arrow).append(" ")
                                                            .append(Item.getColorTags(i_62_)).append(definition.name)
                                                            .toString(), -29134223 * Class166_Sub8.anInt9550, 17, -1,
                                                    1659909117 * item.id, i_32_, i_33_, true, false, i_61_, false);
                                        }
                                    }
                                    if (elem.node.plane == Client.localPlayer.plane) {
                                        String[] strings = definition.groundActions;
                                        for (int i_63_ = strings.length - 1; i_63_ >= 0; i_63_--) {
                                            if (null != strings[i_63_]) {
                                                int i_64_ = 0;
                                                int i_65_ = 377198047 * Client.anInt10783;
                                                if (i_63_ == 0) {
                                                    i_64_ = 18;
                                                }
                                                if (1 == i_63_) {
                                                    i_64_ = 19;
                                                }
                                                if (2 == i_63_) {
                                                    i_64_ = 20;
                                                }
                                                if (i_63_ == 3) {
                                                    i_64_ = 21;
                                                }
                                                if (i_63_ == 4) {
                                                    i_64_ = 22;
                                                }
                                                if (i_63_ == 5) {
                                                    i_64_ = 1004;
                                                }
                                                int i_66_ = definition.method13593(i_63_, -2011468712);
                                                if (-1 != i_66_) {
                                                    i_65_ = i_66_;
                                                }
                                                MenuItem.add(
                                                        strings[i_63_],
                                                        new StringBuilder().append(Item.getColorTags(i_62_))
                                                                .append(definition.name).toString(), i_65_, i_64_, -1,
                                                        1659909117 * item.id, i_32_, i_33_, true, false, i_61_, false);
                                            }
                                        }
                                    }
                                    item = deque.items.previous();
                                    i_61_++;
                                }
                            }
                        }
                        if (elem.node instanceof SceneObject) {
                            SceneObject interface55 = (SceneObject) elem.node;
                            ObjectDefinition object = Client.scene.getObjectLoader().get(interface55.getId());
                            if (null != object.morphisms) {
                                object = object.transform(PlayerFacade.instance,
                                        PlayerFacade.instance);
                            }

                            if (null != object) {
                                if (Client.componentSelected
                                        && elem.node.plane == Client.localPlayer.plane) {
                                    ParameterDefinition parameter = LookupTable.anInt2647 * -410965469 != -1 ? ParameterDefinition.loader
                                            .get(LookupTable.anInt2647 * -410965469) : null;
                                    if ((Class577.selectedComponentAttributes * -1564025309 & 0x4) != 0
                                            && (parameter == null || object.getParameter(LookupTable.anInt2647
                                            * -410965469, -125275839 * parameter.defaultInt) != -125275839
                                            * parameter.defaultInt)) {
                                        MenuItem.add(Client.selectedComponentAction, Client.aString10789 + " "
                                                        + Class60.arrow + " " + Item.getColorTags(65535) + object.name,
                                                -29134223 * Class166_Sub8.anInt9550, 2, -1,
                                                MobChatCutsceneAction.getObjectUid(interface55, i_32_, i_33_), i_32_,
                                                i_33_, true, false, interface55.hashCode(), false);
                                    }
                                }
                                if (elem.node.plane == Client.localPlayer.plane) {
                                    String[] strings = object.actions;
                                    if (null != strings) {
                                        for (int i_67_ = strings.length - 1; i_67_ >= 0; i_67_--) {
                                            if (null != strings[i_67_]) {
                                                int i_68_ = 0;
                                                int i_69_ = Client.anInt10783 * 377198047;
                                                if (0 == i_67_) {
                                                    i_68_ = 3;
                                                }
                                                if (i_67_ == 1) {
                                                    i_68_ = 4;
                                                }
                                                if (2 == i_67_) {
                                                    i_68_ = 5;
                                                }
                                                if (i_67_ == 3) {
                                                    i_68_ = 6;
                                                }
                                                if (i_67_ == 4) {
                                                    i_68_ = 1001;
                                                }
                                                if (i_67_ == 5) {
                                                    i_68_ = 1002;
                                                }
                                                int i_70_ = object.method9256(i_67_);
                                                if (i_70_ != -1) {
                                                    i_69_ = i_70_;
                                                }
                                                MenuItem.add(strings[i_67_], Item.getColorTags(65535) + object.name,
                                                        i_69_, i_68_, -1,
                                                        MobChatCutsceneAction.getObjectUid(interface55, i_32_, i_33_),
                                                        i_32_, i_33_, true, false, interface55.hashCode(), false);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public void encode() {
        OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3929, Client.gameConnection.encryptor);
        frame.payload.writeShort(1277548337 * anInt7228);
        Client.gameConnection.sendFrame(frame);
    }

}