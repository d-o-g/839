package com.jagex;

public class HitMobCutsceneAction extends CutsceneAction {
    static String aString9556;
    int anInt9551;
    int type;
    int index;
    int anInt9554;
    int amount;
    HitMobCutsceneAction(Buffer buffer) {
        super(buffer);
        index = buffer.readUShort() * 1964967441;
        int attributes = buffer.readUByte();

        if ((attributes & 0x1) != 0) {
            type = buffer.readUShort() * 457555599;
            amount = buffer.readUShort() * -518567489;
        } else {
            type = -457555599;
            amount = 518567489;
        }

        if (0 != (attributes & 0x2)) {
            anInt9551 = buffer.readUShort() * -769703795;
            anInt9554 = buffer.readUShort() * 1409006173;
        } else {
            anInt9551 = 769703795;
            anInt9554 = -1409006173;
        }

        if (0 != (attributes & 0x4)) {
            int current = buffer.readUShort();
            int total = buffer.readUShort();
            int percentage = current * 255 / total;

            if (current > 0 && percentage < 1) {
                // only used in earlier clients
            }
        }
    }

    static final void renderSceneEntities(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
        int players = Class80.playerCount * -1784886003;
        int[] playerIndices = Class80.playerIndices;
        Client.anInt10907 = 0;
        int count;

        if (Client.cutsceneStatus * 2087248539 == 1) {
            count = CutsceneMobile.cutsceneMobiles.length;
        } else {
            count = Client.npcCount * 1746328619 + players;
        }

        for (int index = 0; index < count; index++) {
            NpcDefinition definition = null;
            Mobile mobile;

            if (2087248539 * Client.cutsceneStatus == 1) {
                CutsceneMobile cutsceneMobile = CutsceneMobile.cutsceneMobiles[index];
                if (!cutsceneMobile.initialised) {
                    continue;
                }

                mobile = cutsceneMobile.get();
                if (mobile.anInt11496 * 155246571 != Client.anInt10730 * 764752929) {
                    continue;
                }

                if (cutsceneMobile.id * 1379064581 >= 0) {
                    definition = ((Npc) mobile).definition;

                    if (null != definition.morphisms) {
                        definition = definition.morph(PlayerFacade.instance,
                                PlayerFacade.instance);

                        if (definition == null) {
                            continue;
                        }
                    }
                }
            } else {
                if (index < players) {
                    mobile = Client.players[playerIndices[index]];
                } else {
                    mobile = Client.npcTable.get(Client.npcIndices[index - players]).referent;
                    definition = ((Npc) mobile).definition;

                    if (definition.morphisms != null) {
                        definition = definition.morph(PlayerFacade.instance,
                                PlayerFacade.instance);

                        if (null == definition) {
                            continue;
                        }
                    }
                }

                if (-2109116613 * mobile.drawPriority < 0 || 764752929 * Client.anInt10730 != mobile.anInt11496 * 155246571
                        && mobile.plane != Client.localPlayer.plane) {
                    continue;
                }
            }

            Class281_Sub3.method15307(mobile, mobile.method16307(), false);
            if (!(Client.aFloatArray10736[0] < 0.0F)) {
                if (mobile.canMessage()) {
                    OverheadMessage message = mobile.getMessage();
                    if (null != message && Client.anInt10907 * 185353017 < -1095244621 * Client.anInt10856) {
                        Client.anIntArray10653[185353017 * Client.anInt10907] = Class281_Sub3.b12Full.textWidth(message
                                .getText()) / 2;
                        Client.anIntArray10629[Client.anInt10907 * 185353017] = (int) Client.aFloatArray10736[0];
                        Client.anIntArray10858[185353017 * Client.anInt10907] = (int) Client.aFloatArray10736[1];
                        Client.aClass482Array10860[185353017 * Client.anInt10907] = message;
                        Client.anInt10907 += -802178295;
                    }
                }

                int i_12_ = (int) (i_3_ + Client.aFloatArray10736[1]);
                i_12_ -= -1971642963 * Class281_Sub3.b12Full.topPadding;
                boolean bool = false;
                if (!mobile.aBool11499 && !mobile.combatGauges.isEmpty()) {
                    for (CombatGauge gauge = mobile.combatGauges.head(); gauge != null; gauge = mobile.combatGauges.next()) {
                        CombatBar combatBar = gauge.method15579(Client.engineCycle);
                        if (combatBar != null) {
                            HitbarDefinition hitbar = gauge.hitbar;
                            Player player = Client.players[playerIndices[index]];
                            Sprite class116;

                            Sprite class116_13_;
                            if (null != player && PlayerMapDot.aPlayerMapDot_2093 != player.aPlayerMapDot_11782) {
                                if (PlayerMapDot.aPlayerMapDot_2091 == player.aPlayerMapDot_11782) {
                                    class116 = hitbar.getSprite(Class60.activeToolkit, -250575 * hitbar.anInt7194);
                                    class116_13_ = hitbar
                                            .getSprite(Class60.activeToolkit, 759967969 * hitbar.anInt7203);
                                } else {
                                    class116 = hitbar.getSprite(Class60.activeToolkit, 524509161 * hitbar.anInt7206);
                                    class116_13_ = hitbar.getSprite(Class60.activeToolkit,
                                            1119789705 * hitbar.anInt7205);
                                }
                            } else {
                                class116 = hitbar.getSprite(Class60.activeToolkit, 1597504515 * hitbar.anInt7202);
                                class116_13_ = hitbar.getSprite(Class60.activeToolkit, -239895095 * hitbar.anInt7201);
                            }

                            if (class116 != null && null != class116_13_) {
                                int i_14_ = 255;
                                int i_15_ = -1;
                                int i_16_ = Client.engineCycle - combatBar.anInt10076 * 233333127;
                                int hpPercent = class116_13_.method2157() * combatBar.fillWidth * -1506827321 / 255;
                                if (1750521973 * combatBar.anInt10074 > i_16_) {
                                    int i_18_ = 1420553529 * hitbar.anInt7199 == 0 ? 0 : i_16_
                                            / (1420553529 * hitbar.anInt7199) * hitbar.anInt7199 * 1420553529;
                                    int i_19_ = class116_13_.method2157() * -182912709 * combatBar.cycle / 255;
                                    i_15_ = i_19_ + i_18_ * (hpPercent - i_19_) / (combatBar.anInt10074 * 1750521973);
                                } else {
                                    i_15_ = hpPercent;
                                    int i_20_ = 1750521973 * combatBar.anInt10074 + -946624537 * hitbar.anInt7204
                                            - i_16_;
                                    if (999461595 * hitbar.anInt7198 >= 0) {
                                        i_14_ = (i_20_ << 8)
                                                / (-946624537 * hitbar.anInt7204 - 999461595 * hitbar.anInt7198);
                                    }
                                }
                                if (-1506827321 * combatBar.fillWidth > 0 && i_15_ < 2) {
                                    i_15_ = 2;
                                }
                                int i_21_ = class116.method2119();
                                int i_22_ = (int) (Client.aFloatArray10736[0] + i - (class116.method2157() >> 1));
                                i_12_ -= i_21_;
                                if (i_14_ >= 0 && i_14_ < 255) {
                                    int i_23_ = i_14_ << 24;
                                    int i_24_ = i_23_ | 0xffffff;
                                    class116.method2142(i_22_, i_12_, 0, i_24_, 1);
                                    Class60.activeToolkit.method2511(i_22_, i_12_, i_22_ + i_15_, i_12_ + i_21_);
                                    class116_13_.method2142(i_22_, i_12_, 0, i_24_, 1);
                                } else {
                                    class116.method2079(i_22_, i_12_);
                                    Class60.activeToolkit.method2511(i_22_, i_12_, i_22_ + i_15_, i_21_ + i_12_);
                                    class116_13_.method2079(i_22_, i_12_);
                                }
                                Class60.activeToolkit.method2760(i, i_3_, i_4_ + i, i_3_ + i_5_);
                                i_12_ -= 2;
                                bool = true;
                            }
                        } else if (gauge.isEmpty()) {
                            gauge.unlink();
                        }
                    }
                }
                if (!bool) {
                    i_12_ -= Client.playerDefaults.anInt7593 * 654992291 + 2;
                }
                if (!mobile.aBool11499) {
                    if (definition == null) {
                        Player player = (Player) mobile;
                        for (int i_25_ = 0; i_25_ < player.overheadIconFlags.length; i_25_++) {
                            if (player.overheadIconFlags[i_25_] >= 0) {
                                int flag = player.overheadIconFlags[i_25_];
                                int icon = player.overheadIcons[i_25_];
                                long hash = icon << 8 | flag;
                                Sprite class116 = (Sprite) Client.aClass168_10649.get(hash);
                                if (class116 == null) {
                                    Image[] class152s = ImageUtils.load(DequeIterator.images, icon, 0);
                                    if (null == class152s) {
                                        continue;
                                    }
                                    class116 = Class60.activeToolkit.createSprite(class152s[flag], true);
                                    Client.aClass168_10649.put(hash, class116);
                                }
                                if (class116 != null) {
                                    i_12_ -= class116.method2119();
                                    class116.method2079((int) (Client.aFloatArray10736[0] + i - 12.0F), i_12_);
                                    i_12_ -= 2;
                                }
                            }
                        }
                    } else {
                        Npc npc = (Npc) mobile;
                        int[] overhead1 = null != npc.aClass265_11793 ? npc.aClass265_11793.anIntArray2962
                                : npc.definition.anIntArray3011;
                        short[] overheadSprites = npc.aClass265_11793 != null ? npc.aClass265_11793.aShortArray2963
                                : npc.definition.aShortArray3046;
                        if (overheadSprites != null && overhead1 != null) {
                            int i_30_ = 0;
                            while (i_30_ < overheadSprites.length) {
                                if (overheadSprites[i_30_] >= 0 && overhead1[i_30_] >= 0) {
                                    long l = overhead1[i_30_] << 8 | overheadSprites[i_30_];
                                    Sprite sprite = (Sprite) Client.aClass168_10649.get(l);
                                    if (null == sprite) {
                                        Image[] images = ImageUtils.load(DequeIterator.images, overhead1[i_30_], 0);
                                        if (images == null) {
                                            i_30_++;
                                            continue;
                                        }
                                        sprite = Class60.activeToolkit.createSprite(images[overheadSprites[i_30_]], true);
                                        Client.aClass168_10649.put(l, sprite);
                                    }
                                    if (null != sprite) {
                                        i_12_ -= sprite.method2119();
                                        sprite.method2079(
                                                (int) (Client.aFloatArray10736[0] + i - (sprite.method2157() >> 1)),
                                                i_12_);
                                        i_12_ -= 2;
                                    }
                                }
                                i_30_++;
                            }
                        }
                    }
                }
                if (mobile instanceof Player) {
                    if (index >= 0) {
                        int i_31_ = 0;
                        HintArrow[] hintArrows = Client.hintArrows;
                        for (HintArrow hintArrow : hintArrows) {
                            if (hintArrow != null && 10 == -335735335 * hintArrow.type
                                    && hintArrow.targetIndex * 1326506857 == playerIndices[index]) {
                                Sprite class116 = Sprite.headicons[-1698639133 * hintArrow.id];
                                if (class116.method2119() > i_31_) {
                                    i_31_ = class116.method2119();
                                }
                                class116.method2079((int) (Client.aFloatArray10736[0] + i - 12.0F),
                                        i_12_ - class116.method2119());
                            }
                        }
                        if (i_31_ > 0) {
                            i_12_ -= 2 + i_31_;
                        }
                    }
                } else {
                    int i_33_ = 0;
                    HintArrow[] hintArrows = Client.hintArrows;
                    for (HintArrow hintArrow : hintArrows) {
                        if (hintArrow != null && hintArrow.type * -335735335 == 1
                                && 1326506857 * hintArrow.targetIndex == Client.npcIndices[index - players]) {
                            Sprite class116 = Sprite.headicons[hintArrow.id * -1698639133];
                            if (class116.method2119() > i_33_) {
                                i_33_ = class116.method2119();
                            }
                            boolean bool_35_;
                            if (hintArrow.flashRate * -693261749 == 0) {
                                bool_35_ = true;
                            } else {
                                int i_36_ = EntityQueue.getFps() * 1000 / (-693261749 * hintArrow.flashRate) / 2;
                                bool_35_ = Client.engineCycle % (2 * i_36_) < i_36_;
                            }
                            if (bool_35_) {
                                class116.method2079((int) (Client.aFloatArray10736[0] + i - 12.0F),
                                        i_12_ - class116.method2119());
                            }
                        }
                    }
                    if (i_33_ > 0) {
                        i_12_ -= i_33_ + 2;
                    }
                }
                int i_37_ = 0;
                for (; i_37_ < Client.playerDefaults.maximumHits * 1647467165; i_37_++) {
                    int i_38_ = mobile.hitEndTicks[i_37_];
                    int i_39_ = mobile.hitTypes[i_37_];
                    HitsplatDefinition hitsplat = null;
                    int i_40_ = 0;
                    if (i_39_ >= 0) {
                        if (i_38_ <= Client.engineCycle) {
                            continue;
                        }
                        hitsplat = HitsplatDefinition.loader.get(mobile.hitTypes[i_37_]);
                        i_40_ = 1662747801 * hitsplat.duration;
                        if (null != hitsplat.morphisms) {
                            hitsplat = hitsplat.method9036(PlayerFacade.instance,
                                    PlayerFacade.instance);
                            if (null == hitsplat) {
                                mobile.hitEndTicks[i_37_] = -1;
                                continue;
                            }
                        }
                    } else if (i_38_ < 0) {
                        continue;
                    }
                    int i_41_ = mobile.hitsplatIds[i_37_];
                    HitsplatDefinition class532_42_ = null;
                    if (i_41_ >= 0) {
                        class532_42_ = HitsplatDefinition.loader.get(i_41_);
                        if (class532_42_ != null && class532_42_.morphisms != null) {
                            class532_42_ = class532_42_.method9036(PlayerFacade.instance,
                                    PlayerFacade.instance);
                        }
                    }
                    if (i_38_ - i_40_ <= Client.engineCycle) {
                        if (null == hitsplat) {
                            mobile.hitEndTicks[i_37_] = -1;
                        } else {
                            int i_43_ = mobile.method16307() / 2;
                            Class281_Sub3.method15307(mobile, i_43_, false);
                            if (Client.aFloatArray10736[0] > -1.0F) {
                                Client.aFloatArray10736[0] += Client.playerDefaults.hitOffsetsX[i_37_];
                                Client.aFloatArray10736[1] += Client.playerDefaults.hitOffsetsY[i_37_];
                                int i_47_ = 0;
                                int i_48_ = 0;
                                int i_49_ = 0;
                                int i_50_ = 0;
                                int i_51_ = 0;
                                int i_52_ = 0;
                                int i_53_ = 0;
                                int i_54_ = 0;
                                Sprite class116 = null;
                                Sprite class116_55_ = null;
                                Sprite class116_56_ = null;
                                Sprite class116_57_ = null;
                                int i_58_ = 0;
                                int i_59_ = 0;
                                int i_60_ = 0;
                                int i_61_ = 0;
                                int i_62_ = 0;
                                int i_63_ = 0;
                                int i_64_ = 0;
                                int i_65_ = 0;
                                Sprite class116_66_ = hitsplat.getIconSprite(Class60.activeToolkit);
                                if (null != class116_66_) {
                                    i_47_ = class116_66_.method2157();
                                    class116_66_.getOffsets(Client.anIntArray10926);
                                    i_51_ = Client.anIntArray10926[0];
                                }
                                Sprite class116_67_ = hitsplat.getMiddleSprite(Class60.activeToolkit);
                                if (class116_67_ != null) {
                                    i_48_ = class116_67_.method2157();
                                    class116_67_.getOffsets(Client.anIntArray10926);
                                    i_52_ = Client.anIntArray10926[0];
                                }
                                Sprite class116_68_ = hitsplat.getLeftSprite(Class60.activeToolkit);
                                if (null != class116_68_) {
                                    i_49_ = class116_68_.method2157();
                                    class116_68_.getOffsets(Client.anIntArray10926);
                                    i_53_ = Client.anIntArray10926[0];
                                }
                                Sprite class116_69_ = hitsplat.getRightSprite(Class60.activeToolkit);
                                if (class116_69_ != null) {
                                    i_50_ = class116_69_.method2157();
                                    class116_69_.getOffsets(Client.anIntArray10926);
                                    i_54_ = Client.anIntArray10926[0];
                                }
                                if (class532_42_ != null) {
                                    class116 = class532_42_.getIconSprite(Class60.activeToolkit);
                                    if (null != class116) {
                                        i_58_ = class116.method2157();
                                        class116.getOffsets(Client.anIntArray10926);
                                        i_62_ = Client.anIntArray10926[0];
                                    }
                                    class116_55_ = class532_42_.getMiddleSprite(Class60.activeToolkit);
                                    if (null != class116_55_) {
                                        i_59_ = class116_55_.method2157();
                                        class116_55_.getOffsets(Client.anIntArray10926);
                                        i_63_ = Client.anIntArray10926[0];
                                    }
                                    class116_56_ = class532_42_.getLeftSprite(Class60.activeToolkit);
                                    if (class116_56_ != null) {
                                        i_60_ = class116_56_.method2157();
                                        class116_56_.getOffsets(Client.anIntArray10926);
                                        i_64_ = Client.anIntArray10926[0];
                                    }
                                    class116_57_ = class532_42_.getRightSprite(Class60.activeToolkit);
                                    if (null != class116_57_) {
                                        i_61_ = class116_57_.method2157();
                                        class116_57_.getOffsets(Client.anIntArray10926);
                                        i_65_ = Client.anIntArray10926[0];
                                    }
                                }
                                Font class132 = Class558.p11Full;
                                Font class132_70_ = Class558.p11Full;
                                FontSpecification class9 = Class24.p11Full;
                                FontSpecification class9_71_ = Class24.p11Full;
                                int i_72_ = hitsplat.font * 425903007;
                                if (i_72_ >= 0) {
                                    Font class132_73_ = (Font) Class509.aClass374_6997.method6124(
                                            Client.anInterface47_10645, i_72_, true, hitsplat.aBool7236);
                                    FontSpecification class9_74_ = Class509.aClass374_6997.method6125(
                                            Client.anInterface47_10645, i_72_);
                                    if (class132_73_ != null && class9_74_ != null) {
                                        class132 = class132_73_;
                                        class9 = class9_74_;
                                    }
                                }
                                if (class532_42_ != null) {
                                    i_72_ = 425903007 * class532_42_.font;
                                    if (i_72_ >= 0) {
                                        Font class132_75_ = (Font) Class509.aClass374_6997.method6124(
                                                Client.anInterface47_10645, i_72_, true, class532_42_.aBool7236);
                                        FontSpecification class9_76_ = Class509.aClass374_6997.method6125(
                                                Client.anInterface47_10645, i_72_);
                                        if (class132_75_ != null && null != class9_76_) {
                                            class132_70_ = class132_75_;
                                            class9_71_ = class9_76_;
                                        }
                                    }
                                }
                                String string = null;
                                int i_79_ = 0;
                                String string_80_ = hitsplat.formatAmount(mobile.hitAmounts[i_37_]);
                                int i_81_ = class9.textWidth(string_80_);
                                if (class532_42_ != null) {
                                    string = class532_42_.formatAmount(mobile.specialHitsplatAmounts[i_37_]);
                                    i_79_ = class9_71_.textWidth(string);
                                }
                                int i_82_ = 0;
                                int i_83_ = 0;
                                if (i_48_ > 0) {
                                    i_82_ = 1 + i_81_ / i_48_;
                                }
                                if (null != class532_42_ && i_59_ > 0) {
                                    i_83_ = 1 + i_79_ / i_59_;
                                }
                                int i_84_ = 0;
                                int i_85_ = i_84_;
                                if (i_47_ > 0) {
                                    i_84_ += i_47_;
                                }
                                i_84_ += 2;
                                int i_86_ = i_84_;
                                if (i_49_ > 0) {
                                    i_84_ += i_49_;
                                }
                                int i_87_ = i_84_;
                                int i_88_ = i_84_;
                                if (i_48_ > 0) {
                                    int i_89_ = i_48_ * i_82_;
                                    i_84_ += i_89_;
                                    i_88_ += (i_89_ - i_81_) / 2;
                                } else {
                                    i_84_ += i_81_;
                                }
                                int i_90_ = i_84_;
                                if (i_50_ > 0) {
                                    i_84_ += i_50_;
                                }
                                int i_91_ = 0;
                                int i_92_ = 0;
                                int i_93_ = 0;
                                int i_94_ = 0;
                                int i_95_ = 0;
                                if (class532_42_ != null) {
                                    i_84_ += 2;
                                    i_91_ = i_84_;
                                    if (i_58_ > 0) {
                                        i_84_ += i_58_;
                                    }
                                    i_84_ += 2;
                                    i_92_ = i_84_;
                                    if (i_60_ > 0) {
                                        i_84_ += i_60_;
                                    }
                                    i_93_ = i_84_;
                                    i_95_ = i_84_;
                                    if (i_59_ > 0) {
                                        int i_96_ = i_59_ * i_83_;
                                        i_84_ += i_96_;
                                        i_95_ += (i_96_ - i_79_) / 2;
                                    } else {
                                        i_84_ += i_79_;
                                    }
                                    i_94_ = i_84_;
                                    if (i_61_ > 0) {
                                        i_84_ += i_61_;
                                    }
                                }
                                int i_97_ = mobile.hitEndTicks[i_37_] - Client.engineCycle;
                                int i_98_ = hitsplat.offsetX * 904305607 - hitsplat.offsetX * 904305607 * i_97_
                                        / (hitsplat.duration * 1662747801);
                                int i_99_ = -(hitsplat.offsetY * -1000831685) + i_97_ * hitsplat.offsetY * -1000831685
                                        / (hitsplat.duration * 1662747801);
                                int i_100_ = (int) (i_98_ + (i + Client.aFloatArray10736[0] - (i_84_ >> 1)));
                                int i_101_ = (int) (i_3_ + Client.aFloatArray10736[1] - 12.0F + i_99_);
                                int i_102_ = 15 + i_101_ + hitsplat.anInt7241 * 240766071;
                                int i_103_ = 0;
                                if (null != class532_42_) {
                                    i_103_ = 15 + i_101_ + 240766071 * class532_42_.anInt7241;
                                }
                                int i_104_ = 255;
                                if (1149422535 * hitsplat.fade >= 0) {
                                    i_104_ = (i_97_ << 8)
                                            / (1662747801 * hitsplat.duration - 1149422535 * hitsplat.fade);
                                }
                                if (i_104_ >= 0 && i_104_ < 255) {
                                    int i_105_ = i_104_ << 24;
                                    int i_106_ = i_105_ | 0xffffff;
                                    if (null != class116_66_) {
                                        class116_66_.method2142(i_100_ + i_85_ - i_51_, i_101_, 0, i_106_, 1);
                                    }
                                    if (null != class116_68_) {
                                        class116_68_.method2142(
                                                i_86_ + i_100_ - i_53_ + hitsplat.anInt7251 * -93001469,
                                                hitsplat.anInt7255 * 1154380751 + i_101_, 0, i_106_, 1);
                                    }
                                    if (null != class116_67_) {
                                        for (int i_107_ = 0; i_107_ < i_82_; i_107_++) {
                                            class116_67_.method2142(i_107_ * i_48_ + i_87_ + i_100_ - i_52_
                                                    + hitsplat.anInt7251 * -93001469, 1154380751 * hitsplat.anInt7255
                                                    + i_101_, 0, i_106_, 1);
                                        }
                                    }
                                    if (class116_69_ != null) {
                                        class116_69_.method2142(
                                                hitsplat.anInt7251 * -93001469 + i_90_ + i_100_ - i_54_,
                                                hitsplat.anInt7255 * 1154380751 + i_101_, 0, i_106_, 1);
                                    }
                                    class132.method2291(string_80_, i_88_ + i_100_, i_102_, 1204954955
                                            * hitsplat.textColour | i_105_, 0);
                                    if (class532_42_ != null) {
                                        if (class116 != null) {
                                            class116.method2142(i_100_ + i_91_ - i_62_, i_101_, 0, i_106_, 1);
                                        }
                                        if (null != class116_56_) {
                                            class116_56_.method2142(i_100_ + i_92_ - i_64_ + class532_42_.anInt7251
                                                            * -93001469, 1154380751 * class532_42_.anInt7255 + i_101_, 0,
                                                    i_106_, 1);
                                        }
                                        if (class116_55_ != null) {
                                            for (int i_108_ = 0; i_108_ < i_83_; i_108_++) {
                                                class116_55_.method2142(-93001469 * class532_42_.anInt7251 + i_108_
                                                        * i_59_ + i_93_ + i_100_ - i_63_, i_101_
                                                        + class532_42_.anInt7255 * 1154380751, 0, i_106_, 1);
                                            }
                                        }
                                        if (class116_57_ != null) {
                                            class116_57_
                                                    .method2142(class532_42_.anInt7251 * -93001469 + i_100_ + i_94_
                                                                    - i_65_, i_101_ + 1154380751 * class532_42_.anInt7255, 0,
                                                            i_106_, 1);
                                        }
                                        class132_70_.method2291(string, i_100_ + i_95_, i_103_, 1204954955
                                                * class532_42_.textColour | i_105_, 0);
                                    }
                                } else {
                                    if (class116_66_ != null) {
                                        class116_66_.method2079(i_85_ + i_100_ - i_51_, i_101_);
                                    }
                                    if (class116_68_ != null) {
                                        class116_68_.method2079(
                                                -93001469 * hitsplat.anInt7251 + i_100_ + i_86_ - i_53_, 1154380751
                                                        * hitsplat.anInt7255 + i_101_);
                                    }
                                    if (class116_67_ != null) {
                                        for (int i_109_ = 0; i_109_ < i_82_; i_109_++) {
                                            class116_67_.method2079(i_100_ + i_87_ - i_52_ + i_109_ * i_48_
                                                    + hitsplat.anInt7251 * -93001469, i_101_ + hitsplat.anInt7255
                                                    * 1154380751);
                                        }
                                    }
                                    if (class116_69_ != null) {
                                        class116_69_.method2079(
                                                i_100_ + i_90_ - i_54_ + -93001469 * hitsplat.anInt7251, i_101_
                                                        + 1154380751 * hitsplat.anInt7255);
                                    }
                                    class132.method2291(string_80_, i_88_ + i_100_, i_102_, 1204954955
                                            * hitsplat.textColour | ~0xffffff, 0);
                                    if (null != class532_42_) {
                                        if (class116 != null) {
                                            class116.method2079(i_100_ + i_91_ - i_62_, i_101_);
                                        }
                                        if (class116_56_ != null) {
                                            class116_56_.method2079(-93001469 * class532_42_.anInt7251 + i_100_ + i_92_
                                                    - i_64_, i_101_ + 1154380751 * class532_42_.anInt7255);
                                        }
                                        if (class116_55_ != null) {
                                            for (int i_110_ = 0; i_110_ < i_83_; i_110_++) {
                                                class116_55_.method2079(i_59_ * i_110_ + i_93_ + i_100_ - i_63_
                                                        + class532_42_.anInt7251 * -93001469, i_101_ + 1154380751
                                                        * class532_42_.anInt7255);
                                            }
                                        }
                                        if (null != class116_57_) {
                                            class116_57_.method2079(-93001469 * class532_42_.anInt7251 + i_100_ + i_94_
                                                    - i_65_, i_101_ + class532_42_.anInt7255 * 1154380751);
                                        }
                                        class132_70_.method2291(string, i_100_ + i_95_, i_103_, class532_42_.textColour
                                                * 1204954955 | ~0xffffff, 0);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int i_111_ = 0; i_111_ < Client.anInt10733 * 1448892127; i_111_++) {
            int index = Client.anIntArray10721[i_111_];
            Mobile mobile;
            if (index < 2048) {
                mobile = Client.players[index];
            } else {
                mobile = (Mobile) Client.npcTable.get(index - 2048).referent;
            }

            int i_113_ = Client.anIntArray10636[i_111_];
            Mobile mobile2;
            if (i_113_ < 2048) {
                mobile2 = Client.players[i_113_];
            } else {
                mobile2 = (Mobile) Client.npcTable.get(i_113_ - 2048).referent;
            }

            Class330.method5808(mobile, mobile2, (mobile.anInt11503 -= 468504059) * 2049586483, i, i_3_, i_4_, i_5_, i_6_, i_7_,
                    1828952771);
        }

        int i_115_ = -1971642963 * Class281_Sub3.b12Full.topPadding + Class281_Sub3.b12Full.bottomPadding * -1569538073
                + 2;
        for (int i_116_ = 0; i_116_ < 185353017 * Client.anInt10907; i_116_++) {
            int i_117_ = Client.anIntArray10629[i_116_];
            int i_118_ = Client.anIntArray10858[i_116_];
            int i_119_ = Client.anIntArray10653[i_116_];
            boolean bool = true;
            while (bool) {
                bool = false;
                for (int i_120_ = 0; i_120_ < i_116_; i_120_++) {
                    if (2 + i_118_ > Client.anIntArray10858[i_120_] - i_115_
                            && i_118_ - i_115_ < 2 + Client.anIntArray10858[i_120_]
                            && i_117_ - i_119_ < Client.anIntArray10629[i_120_] + Client.anIntArray10653[i_120_]
                            && i_117_ + i_119_ > Client.anIntArray10629[i_120_] - Client.anIntArray10653[i_120_]
                            && Client.anIntArray10858[i_120_] - i_115_ < i_118_) {
                        i_118_ = Client.anIntArray10858[i_120_] - i_115_;
                        bool = true;
                    }
                }
            }
            Client.anIntArray10858[i_116_] = i_118_;
            String string = Client.aClass482Array10860[i_116_].getText();
            if (0 == Client.anInt10732 * 1084346901) {
                int i_121_ = 16776960;
                int i_122_ = Client.aClass482Array10860[i_116_].getColour();
                if (i_122_ < 6) {
                    i_121_ = Client.anIntArray10861[i_122_];
                }
                if (6 == i_122_) {
                    i_121_ = Client.anInt10730 * 764752929 % 20 < 10 ? 16711680 : 16776960;
                }
                if (7 == i_122_) {
                    i_121_ = 764752929 * Client.anInt10730 % 20 < 10 ? 255 : 65535;
                }
                if (i_122_ == 8) {
                    i_121_ = Client.anInt10730 * 764752929 % 20 < 10 ? 45056 : 8454016;
                }
                if (9 == i_122_) {
                    int i_123_ = 150 - Client.aClass482Array10860[i_116_].getRemaining() * 150
                            / Client.aClass482Array10860[i_116_].getDuration();
                    if (i_123_ < 50) {
                        i_121_ = 1280 * i_123_ + 16711680;
                    } else if (i_123_ < 100) {
                        i_121_ = 16776960 - (i_123_ - 50) * 327680;
                    } else if (i_123_ < 150) {
                        i_121_ = (i_123_ - 100) * 5 + 65280;
                    }
                }
                if (10 == i_122_) {
                    int i_124_ = 150 - Client.aClass482Array10860[i_116_].getRemaining() * 150
                            / Client.aClass482Array10860[i_116_].getDuration();
                    if (i_124_ < 50) {
                        i_121_ = 5 * i_124_ + 16711680;
                    } else if (i_124_ < 100) {
                        i_121_ = 16711935 - (i_124_ - 50) * 327680;
                    } else if (i_124_ < 150) {
                        i_121_ = 255 + 327680 * (i_124_ - 100) - 5 * (i_124_ - 100);
                    }
                }
                if (11 == i_122_) {
                    int i_125_ = 150 - Client.aClass482Array10860[i_116_].getRemaining() * 150
                            / Client.aClass482Array10860[i_116_].getDuration();
                    if (i_125_ < 50) {
                        i_121_ = 16777215 - i_125_ * 327685;
                    } else if (i_125_ < 100) {
                        i_121_ = 327685 * (i_125_ - 50) + 65280;
                    } else if (i_125_ < 150) {
                        i_121_ = 16777215 - (i_125_ - 100) * 327680;
                    }
                }
                int i_126_ = i_121_ | ~0xffffff;
                int i_127_ = Client.aClass482Array10860[i_116_].getEffect();
                if (i_127_ == 0) {
                    Class450.b12Full.method2293(string, i + i_117_, i_118_ + i_3_, i_126_, -16777216);
                }
                if (1 == i_127_) {
                    Class450.b12Full.method2296(string, i_117_ + i, i_118_ + i_3_, i_126_, -16777216,
                            764752929 * Client.anInt10730, -2098460496);
                }
                if (2 == i_127_) {
                    Class450.b12Full.method2297(string, i_117_ + i, i_3_ + i_118_, i_126_, -16777216,
                            Client.anInt10730 * 764752929, 213055645);
                }
                if (3 == i_127_) {
                    int i_128_ = 150 - Client.aClass482Array10860[i_116_].getRemaining() * 150
                            / Client.aClass482Array10860[i_116_].getDuration();
                    Class450.b12Full.method2298(string, i + i_117_, i_3_ + i_118_, i_126_, -16777216,
                            Client.anInt10730 * 764752929, i_128_, -440685345);
                }
                if (i_127_ == 4) {
                    int i_129_ = 150 - Client.aClass482Array10860[i_116_].getRemaining() * 150
                            / Client.aClass482Array10860[i_116_].getDuration();
                    int i_130_ = i_129_ * (Class281_Sub3.b12Full.textWidth(string) + 100) / 150;
                    Class60.activeToolkit.method2511(i + i_117_ - 50, i_3_, i + i_117_ + 50, i_3_ + i_5_);
                    Class450.b12Full.method2291(string, i_117_ + i + 50 - i_130_, i_118_ + i_3_, i_126_, -16777216);
                    Class60.activeToolkit.method2760(i, i_3_, i + i_4_, i_3_ + i_5_);
                }
                if (i_127_ == 5) {
                    int i_131_ = 150 - Client.aClass482Array10860[i_116_].getRemaining() * 150
                            / Client.aClass482Array10860[i_116_].getDuration();
                    int i_132_ = 0;
                    if (i_131_ < 25) {
                        i_132_ = i_131_ - 25;
                    } else if (i_131_ > 125) {
                        i_132_ = i_131_ - 125;
                    }
                    int i_133_ = -1971642963 * Class281_Sub3.b12Full.topPadding + -1569538073
                            * Class281_Sub3.b12Full.bottomPadding;
                    Class60.activeToolkit.method2511(i, i_118_ + i_3_ - i_133_ - 1, i + i_4_, i_3_ + i_118_ + 5);
                    Class450.b12Full.method2293(string, i_117_ + i, i_132_ + i_118_ + i_3_, i_126_, -16777216);
                    Class60.activeToolkit.method2760(i, i_3_, i + i_4_, i_5_ + i_3_);
                }
            } else {
                Class450.b12Full.method2293(string, i_117_ + i, i_118_ + i_3_, -256, -16777216);
            }
        }
    }

    static long method15092() {
        return Engine.aClass467_6508.method7894();
    }

    @Override
    public void execute() {
        Mobile mobile = CutsceneMobile.cutsceneMobiles[-746280207 * index].get();
        mobile.hit(-2075680657 * type, amount * 1833805375, -990084539 * anInt9551, 165210613 * anInt9554, Client.engineCycle, 0);
    }

}