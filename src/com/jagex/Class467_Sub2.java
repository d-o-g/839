package com.jagex;

public class Class467_Sub2 extends Class467 {
    long aLong9837;
    int anInt9838;
    long aLong9839;
    long[] aLongArray9840;
    int anInt9841;
    long aLong9842 = 0L;

    Class467_Sub2() {
        aLong9837 = 0L;
        aLong9839 = 0L;
        aLongArray9840 = new long[10];
        anInt9841 = 0;
        anInt9838 = -1226479421;
        aLong9842 = System.nanoTime() * 2553089956175584773L;
        aLong9837 = System.nanoTime() * 1856464366422168743L;
    }

    static final void method15326(ScriptExecutionContext class613, byte i) {
        int i_3_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
        Component class226 = Component.lookup(i_3_);
        Interface class221 = Class598.loadedInterfaces[i_3_ >> 16];
        ScriptExecutionContext.method1632(class226, class221, class613);
    }

    static void processAction(MenuItem item, int mousex, int mousey, boolean notsure) {
        if (null != item && MenuItem.options.tail != item) {
            int secondary = item.secondary * -1800080575;
            int tertiary = item.tertiary * 1353485821;
            int op = item.opcode * -20536735;
            int primary = (int) (item.primary * -1867655888037237139L);
            long primaryL = -1867655888037237139L * item.primary;
            if (op >= 2000) {
                op -= 2000;
            }
            CoordGrid base = Client.scene.getBase();
            if (op == 17) {
                Client.crosshairX = mousex * -1837674915;
                Client.crosshairY = mousey * 1535894177;
                Client.crosshairState = -216409942;
                Client.anInt10679 = 0;
                OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3951,
                        Client.gameConnection.encryptor);
                frame.payload.writeLEShortA(-800680953 * Client.anInt10756);
                frame.payload.writeShortA(Client.anInt10867 * -224153241);
                frame.payload.writeShortA(tertiary + base.z * -180305283);
                frame.payload.writeLEShort(primary);
                frame.payload.writeByteA(ThemeMusicVolumeNormaliser.method3755() ? 1 : 0);
                frame.payload.writeInt(SceneGraph.anInt6751 * 1969702363);
                frame.payload.writeShortA(secondary + 2051316501 * base.x);
                Client.gameConnection.sendFrame(frame);
                Class20.setDestination(secondary, tertiary);
            }

            OutgoingFrameMeta meta = null;
            if (op == 44) {
                meta = OutgoingFrameMeta.aClass366_3982;
            } else if (45 == op) {
                meta = OutgoingFrameMeta.aClass366_4023;
            } else if (op == 46) {
                meta = OutgoingFrameMeta.aClass366_3942;
            } else if (op == 47) {
                meta = OutgoingFrameMeta.aClass366_4021;
            } else if (48 == op) {
                meta = OutgoingFrameMeta.aClass366_3967;
            } else if (49 == op) {
                meta = OutgoingFrameMeta.aClass366_3975;
            } else if (op == 50) {
                meta = OutgoingFrameMeta.aClass366_3972;
            } else if (51 == op) {
                meta = OutgoingFrameMeta.aClass366_3965;
            } else if (op == 52) {
                meta = OutgoingFrameMeta.aClass366_3974;
            } else if (op == 53) {
                meta = OutgoingFrameMeta.aClass366_4028;
            }

            if (meta != null) {
                Player player = Client.players[primary];
                if (player != null) {
                    Client.crosshairX = mousex * -1837674915;
                    Client.crosshairY = mousey * 1535894177;
                    Client.crosshairState = -216409942;
                    Client.anInt10679 = 0;
                    OutgoingFrame class480_sub15 = OutgoingFrame.prepare(meta, Client.gameConnection.encryptor);
                    class480_sub15.payload.writeShortA(primary);
                    class480_sub15.payload.writeByteS(ThemeMusicVolumeNormaliser.method3755() ? 1 : 0);
                    Client.gameConnection.sendFrame(class480_sub15);
                    Class20.setDestination(player.pathX[0], player.pathZ[0]);
                }
            }

            if (op == 23) {
                if (Client.localPrivilege * 1667858447 > 0 && CutsceneVariableProvider.method3346()) {
                    Client.teleport(Client.localPlayer.plane, secondary + base.x * 2051316501, tertiary + base.z
                            * -180305283);
                } else {
                    OutgoingFrame frame = Class195.createWalkFrame(primary, secondary, tertiary);
                    if (primary == 1) { //primary == 1 == minimap type
                        frame.payload.writeByte(-1);
                        frame.payload.writeByte(-1);
                        frame.payload.writeShort((int) Client.aFloat10787); //not sure
                        frame.payload.writeByte(57);
                        frame.payload.writeByte(Client.pendingWalkX * 1093165775);
                        frame.payload.writeByte(Client.pendingWalkY * -1894746741);
                        frame.payload.writeByte(89);
                        Vector3f vector3f = Client.localPlayer.getCoordinateSpace().translation;
                        frame.payload.writeShort((int) vector3f.x);
                        frame.payload.writeShort((int) vector3f.z);
                        frame.payload.writeByte(63);
                    } else { //viewport type
                        Client.crosshairX = mousex * -1837674915;
                        Client.crosshairY = 1535894177 * mousey;
                        Client.crosshairState = 2039278677;
                        Client.anInt10679 = 0;
                    }
                    Client.gameConnection.sendFrame(frame);
                    Class20.setDestination(secondary, tertiary);
                }
            }

            if (op == 8) {
                ObjectNode node = Client.npcTable.get(primary);
                if (node != null) {
                    Npc npc = (Npc) node.referent;
                    Client.crosshairX = mousex * -1837674915;
                    Client.crosshairY = mousey * 1535894177;
                    Client.crosshairState = -216409942;
                    Client.anInt10679 = 0;
                    OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_4000,
                            Client.gameConnection.encryptor);
                    frame.payload.writeLEShort(primary);
                    frame.payload.writeInt(SceneGraph.anInt6751 * 1969702363);
                    frame.payload.writeByte(ThemeMusicVolumeNormaliser.method3755() ? 1 : 0);
                    frame.payload.writeShortA(Client.anInt10756 * -800680953);
                    frame.payload.writeShortA(Client.anInt10867 * -224153241);
                    Client.gameConnection.sendFrame(frame);
                    Class20.setDestination(npc.pathX[0], npc.pathZ[0]);
                }
            }

            if (op == 25) {
                Component class226 = Class185.method3584(tertiary, secondary);
                if (null != class226) {
                    PlayerFacade.method1560();
                    Class480_Sub16 class480_sub16 = Client.method17050(class226);
                    Class57.method1361(class226, class480_sub16.method15633(), class480_sub16.anInt10101 * 1945403175);
                    Client.selectedComponentAction = Class341.method5865(class226);
                    if (Client.selectedComponentAction == null) {
                        Client.selectedComponentAction = "Null";
                    }
                    Client.aString10789 = class226.name + Item.getColorTags(16777215);
                }
            } else {
                if (op == 30 && Client.aClass226_10793 == null) {
                    Class276.method5162(tertiary, secondary, (short) 26389);
                    Client.aClass226_10793 = Class185.method3584(tertiary, secondary);
                    if (Client.aClass226_10793 != null) {
                        Component.redraw(Client.aClass226_10793);
                    }
                }
                OutgoingFrameMeta class366_10_ = null;
                if (op == 9) {
                    class366_10_ = OutgoingFrameMeta.aClass366_3923;
                } else if (10 == op) {
                    class366_10_ = OutgoingFrameMeta.aClass366_3947;
                } else if (op == 11) {
                    class366_10_ = OutgoingFrameMeta.aClass366_3943;
                } else if (op == 12) {
                    class366_10_ = OutgoingFrameMeta.aClass366_3931;
                } else if (13 == op) {
                    class366_10_ = OutgoingFrameMeta.aClass366_4019;
                } else if (1003 == op) {
                    class366_10_ = OutgoingFrameMeta.aClass366_3978;
                }
                if (null != class366_10_) {
                    ObjectNode npc = Client.npcTable.get(primary);
                    if (null != npc) {
                        Npc class600_sub1_sub3_sub1_sub2 = (Npc) npc.referent;
                        Client.crosshairX = -1837674915 * mousex;
                        Client.crosshairY = 1535894177 * mousey;
                        Client.crosshairState = -216409942;
                        Client.anInt10679 = 0;
                        OutgoingFrame class480_sub15 = OutgoingFrame.prepare(class366_10_,
                                Client.gameConnection.encryptor);
                        class480_sub15.payload.writeByteS(ThemeMusicVolumeNormaliser.method3755() ? 1 : 0);
                        class480_sub15.payload.writeShort(primary);
                        Client.gameConnection.sendFrame(class480_sub15);
                        Class20.setDestination(class600_sub1_sub3_sub1_sub2.pathX[0], class600_sub1_sub3_sub1_sub2.pathZ[0]);
                    }
                }
                if (op == 15) {
                    Player class600_sub1_sub3_sub1_sub1 = Client.players[primary];
                    if (class600_sub1_sub3_sub1_sub1 != null) {
                        Client.crosshairX = mousex * -1837674915;
                        Client.crosshairY = 1535894177 * mousey;
                        Client.crosshairState = -216409942;
                        Client.anInt10679 = 0;
                        OutgoingFrame class480_sub15 = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_4017,
                                Client.gameConnection.encryptor);
                        class480_sub15.payload.writeLEShort(Client.anInt10867 * -224153241);
                        class480_sub15.payload.writeLEShort(Client.anInt10756 * -800680953);
                        class480_sub15.payload.writeNegatedByte(ThemeMusicVolumeNormaliser.method3755() ? 1 : 0);
                        class480_sub15.payload.writeLEShort(primary);
                        class480_sub15.payload.writeLEInt(SceneGraph.anInt6751 * 1969702363);
                        Client.gameConnection.sendFrame(class480_sub15);
                        Class20.setDestination(class600_sub1_sub3_sub1_sub1.pathX[0], class600_sub1_sub3_sub1_sub1.pathZ[0]);
                    }
                }
                if (op == 16) {
                    Client.crosshairX = mousex * -1837674915;
                    Client.crosshairY = mousey * 1535894177;
                    Client.crosshairState = -216409942;
                    Client.anInt10679 = 0;
                    OutgoingFrame class480_sub15 = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_4017,
                            Client.gameConnection.encryptor);
                    class480_sub15.payload.writeLEShort(Client.anInt10867 * -224153241);
                    class480_sub15.payload.writeLEShort(-800680953 * Client.anInt10756);
                    class480_sub15.payload.writeNegatedByte(ThemeMusicVolumeNormaliser.method3755() ? 1 : 0);
                    class480_sub15.payload.writeLEShort(387935885 * Client.localPlayer.index);
                    class480_sub15.payload.writeLEInt(SceneGraph.anInt6751 * 1969702363);
                    Client.gameConnection.sendFrame(class480_sub15);
                }
                if (57 == op || op == 1007) {
                    ConnectionInfo.method13843(primary, tertiary, secondary, item.target);
                }
                OutgoingFrameMeta meta2 = null;
                if (3 == op) {
                    meta2 = OutgoingFrameMeta.aClass366_4014;
                } else if (op == 4) {
                    meta2 = OutgoingFrameMeta.aClass366_3966;
                } else if (op == 5) {
                    meta2 = OutgoingFrameMeta.aClass366_3932;
                } else if (op == 6) {
                    meta2 = OutgoingFrameMeta.aClass366_4010;
                } else if (1001 == op) {
                    meta2 = OutgoingFrameMeta.aClass366_4009;
                } else if (1002 == op) {
                    meta2 = OutgoingFrameMeta.aClass366_3941;
                }
                if (meta2 != null) {
                    Client.crosshairX = mousex * -1837674915;
                    Client.crosshairY = mousey * 1535894177;
                    Client.crosshairState = -216409942;
                    Client.anInt10679 = 0;
                    OutgoingFrame class480_sub15 = OutgoingFrame.prepare(meta2, Client.gameConnection.encryptor);
                    class480_sub15.payload.writeByte(ThemeMusicVolumeNormaliser.method3755() ? 1 : 0);
                    class480_sub15.payload.writeLEShortA(tertiary + base.z * -180305283);
                    class480_sub15.payload.writeShortA(base.x * 2051316501 + secondary);
                    class480_sub15.payload.writeInt((int) (primaryL >>> 32) & 0x7fffffff);
                    Client.gameConnection.sendFrame(class480_sub15);
                    Class20.setDestination(secondary, tertiary);
                }
                if (1008 == op || 1009 == op || 1010 == op || 1011 == op || op == 1012) {
                    Orientation.method814(op, primary, secondary, 984955062);
                }
                if (op == 59) {
                    Client.crosshairX = mousex * -1837674915;
                    Client.crosshairY = mousey * 1535894177;
                    Client.crosshairState = 2039278677;
                    Client.anInt10679 = 0;
                    OutgoingFrame class480_sub15 = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3930,
                            Client.gameConnection.encryptor);
                    class480_sub15.payload.writeLEShortA(-800680953 * Client.anInt10756);
                    class480_sub15.payload.writeLEShort(2051316501 * base.x + secondary);
                    class480_sub15.payload.writeShortA(Client.anInt10867 * -224153241);
                    class480_sub15.payload.writeShort(tertiary + -180305283 * base.z);
                    class480_sub15.payload.writeMEInt(1969702363 * SceneGraph.anInt6751);
                    Client.gameConnection.sendFrame(class480_sub15);
                    Class20.setDestination(secondary, tertiary);
                }
                if (60 == op) {
                    if (1667858447 * Client.localPrivilege > 0 && CutsceneVariableProvider.method3346()) {
                        Client.teleport(Client.localPlayer.plane, base.x * 2051316501 + secondary, -180305283
                                * base.z + tertiary);
                    } else {
                        Client.crosshairX = -1837674915 * mousex;
                        Client.crosshairY = 1535894177 * mousey;
                        Client.crosshairState = 2039278677;
                        Client.anInt10679 = 0;
                        OutgoingFrame class480_sub15 = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3986,
                                Client.gameConnection.encryptor);
                        class480_sub15.payload.writeLEShort(-180305283 * base.z + tertiary);
                        class480_sub15.payload.writeLEShort(2051316501 * base.x + secondary);
                        Client.gameConnection.sendFrame(class480_sub15);
                    }
                }
                if (op == 2) {
                    Client.crosshairX = mousex * -1837674915;
                    Client.crosshairY = mousey * 1535894177;
                    Client.crosshairState = -216409942;
                    Client.anInt10679 = 0;
                    OutgoingFrame class480_sub15 = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3940,
                            Client.gameConnection.encryptor);
                    class480_sub15.payload.writeByteA(ThemeMusicVolumeNormaliser.method3755() ? 1 : 0);
                    class480_sub15.payload.writeLEShortA(Client.anInt10756 * -800680953);
                    class480_sub15.payload.writeLEShort(-180305283 * base.z + tertiary);
                    class480_sub15.payload.writeShortA(base.x * 2051316501 + secondary);
                    class480_sub15.payload.writeLEShort(-224153241 * Client.anInt10867);
                    class480_sub15.payload.writeIMEInt(1969702363 * SceneGraph.anInt6751);
                    class480_sub15.payload.writeMEInt((int) (primaryL >>> 32) & 0x7fffffff);
                    Client.gameConnection.sendFrame(class480_sub15);
                    Class20.setDestination(secondary, tertiary);
                }
                if (58 == op) {
                    Component class226 = Class185.method3584(tertiary, secondary);
                    if (null != class226) {
                        Class480_Sub40.method16234(class226, -1393513011);
                    }
                }
                OutgoingFrameMeta class366_12_ = null;
                if (18 == op) {
                    class366_12_ = OutgoingFrameMeta.aClass366_3983;
                } else if (op == 19) {
                    class366_12_ = OutgoingFrameMeta.aClass366_4013;
                } else if (op == 20) {
                    class366_12_ = OutgoingFrameMeta.aClass366_3985;
                } else if (21 == op) {
                    class366_12_ = OutgoingFrameMeta.aClass366_3939;
                } else if (op == 22) {
                    class366_12_ = OutgoingFrameMeta.aClass366_3926;
                } else if (op == 1004) {
                    class366_12_ = OutgoingFrameMeta.aClass366_3953;
                }
                if (class366_12_ != null) {
                    Client.crosshairX = mousex * -1837674915;
                    Client.crosshairY = mousey * 1535894177;
                    Client.crosshairState = -216409942;
                    Client.anInt10679 = 0;
                    OutgoingFrame class480_sub15 = OutgoingFrame.prepare(class366_12_, Client.gameConnection.encryptor);
                    class480_sub15.payload.writeLEShort(base.z * -180305283 + tertiary);
                    class480_sub15.payload.writeShort(secondary + 2051316501 * base.x);
                    class480_sub15.payload.writeByteS((notsure ? 2 : 0)
                            | (ThemeMusicVolumeNormaliser.method3755() ? 1 : 0));
                    class480_sub15.payload.writeLEShortA(primary);
                    Client.gameConnection.sendFrame(class480_sub15);
                    Class20.setDestination(secondary, tertiary);
                }
                if (Client.componentSelected) {
                    PlayerFacade.method1560();
                }
                if (null != DrawableText.aClass226_9829 && 444672209 * Client.anInt10741 == 0) {
                    Component.redraw(DrawableText.aClass226_9829);
                }
            }
        }
    }

    long method15322(int i) {
        long l = System.nanoTime();
        long l_0_ = l - aLong9839 * 3631060314329852889L;
        aLong9839 = 1243060601205924969L * l;
        if (l_0_ > -5000000000L && l_0_ < 5000000000L) {
            aLongArray9840[anInt9841 * 1918849569] = l_0_;
            anInt9841 = (1 + 1918849569 * anInt9841) % 10 * 611365345;
            if (anInt9838 * -1752266773 < 1) {
                anInt9838 += -1226479421;
            }
        }
        long l_1_ = 0L;
        for (int i_2_ = 1; i_2_ <= anInt9838 * -1752266773; i_2_++) {
            l_1_ += aLongArray9840[(10 + anInt9841 * 1918849569 - i_2_) % 10];
        }
        return l_1_ / (anInt9838 * -1752266773);
    }

    @Override
    void method7891() {
        aLong9839 = 0L;
        if (aLong9837 * -8400346072457096425L > -5790302255800811827L * aLong9842) {
            aLong9842 += 7401816915789631859L * aLong9837 - 1L * aLong9842;
        }
    }

    @Override
    long method7894() {
        return -5790302255800811827L * aLong9842;
    }

    @Override
    long method7897() {
        aLong9842 += method15322(-367903253) * 2553089956175584773L;
        if (aLong9837 * -8400346072457096425L > -5790302255800811827L * aLong9842) {
            return (aLong9837 * -8400346072457096425L - -5790302255800811827L * aLong9842) / 1000000L;
        }
        return 0L;
    }

    @Override
    int method7905(long l) {
        if (-8400346072457096425L * aLong9837 > aLong9842 * -5790302255800811827L) {
            aLong9839 += aLong9837 * 4104000515390066799L - aLong9842 * -8360114898687666667L;
            aLong9842 += aLong9837 * 7401816915789631859L - aLong9842 * 1L;
            aLong9837 += l * 1856464366422168743L;
            return 1;
        }
        int i = 0;
        do {
            i++;
            aLong9837 += l * 1856464366422168743L;
        } while (i < 10 && -8400346072457096425L * aLong9837 < -5790302255800811827L * aLong9842);
        if (aLong9837 * -8400346072457096425L < aLong9842 * -5790302255800811827L) {
            aLong9837 = aLong9842 * 2635160276237237179L;
        }
        return i;
    }
}
