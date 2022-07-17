package com.jagex;

public class PlayerDefaults {
    static final int anInt7588 = 4;
    static final int anInt7590 = 4;
    static final int anInt7606 = 7;
    static final int anInt7608 = 4;
    public boolean npcMessagesEnabled;
    public int anInt7585;
    public int[] hitOffsetsX;
    public int[] hitOffsetsY;
    public short[][] originalColours;
    public int anInt7591;
    public int anInt7592;
    public int anInt7593;
    public int maximumHits = -1248071980;
    public int loginWindowInterfaceIndex;
    public int lobbyWindowInterfaceIndex;
    public int playerMessageDuration;
    public short aShort7598;
    public int anInt7599;
    public int anInt7600;
    public boolean aBool7601;
    public short[][][] replacementColours;
    public int anInt7603;
    public int npcMessageDuration;
    public boolean enablePlayerMessages;
    public int anInt7607;
    public boolean aBool7609;
    public byte aByte7610;
    public int profilingModel;
    public int anInt7612;
    public PlayerDefaults(Archive class406) {
        hitOffsetsX = null;
        hitOffsetsY = null;
        anInt7592 = 648870356;
        anInt7591 = -262041284;
        anInt7593 = -1948231603;
        profilingModel = 87226591;
        loginWindowInterfaceIndex = -340025287;
        lobbyWindowInterfaceIndex = -1894784493;
        aBool7601 = true;
        aShort7598 = (short) -1;
        anInt7600 = 558905412;
        npcMessagesEnabled = true;
        npcMessageDuration = 1202971282;
        enablePlayerMessages = true;
        playerMessageDuration = 1342258743;
        anInt7585 = -165783257;
        anInt7599 = 1690970165;
        anInt7603 = -1077854464;
        anInt7607 = -1789561995;
        anInt7612 = 412800384;
        byte[] data = class406.get(Class577.aClass577_7731.file * -1881625811);
        decode(new Buffer(data));
    }

    static final void method9578(Component class226, Interface class221, ScriptExecutionContext class613) {
        class226.aBool2536 = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] == 1;
        Component.redraw(class226);
        if (-1 == class226.index * -592186295 && !class221.closed) {
            Class296_Sub3_Sub1.method17524(class226.uid * 1857819631, (byte) -122);
        }
    }

    static final void method9579(Component class226, int i, int i_9_, int i_10_, ScriptExecutionContext class613) {
        if (null == class226.anIntArray2466) {
            throw new RuntimeException();
        }
        class226.anIntArray2466[i] = i_9_;
        class226.anIntArray2488[i] = i_10_;
    }

    static final void method9580(ScriptExecutionContext class613, int i) {
        Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
        Component class226 = class611.aClass226_7914;
        ScriptExecutionContext.method7000(class226, class613);
    }

    static final void method9581(ScriptExecutionContext class613, int i) {
        Class636 class636 = Class566.method9573(-732309487);
        String string = Class470.method8047((byte) 22);
        if (string == null) {
            string = "";
        }
        class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class636.getId();
        class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = string;
    }

    static final void animateComponents(Component[] class226s, int i) {
        for (Component class2262 : class226s) {
            Component component = class2262;
            if (null != component && 1920469085 * component.parentUid == i && !Client.method16857(component)) {
                if (0 == component.type * 1558474223) {
                    animateComponents(class226s, component.uid * 1857819631);
                    if (component.subComponents != null) {
                        animateComponents(component.subComponents, 1857819631 * component.uid);
                    }
                    InterfaceNode lw = Client.openInterfaces.get(component.uid * 1857819631);
                    if (lw != null) {
                        Interface.method9889(1021060255 * lw.id);
                    }
                }
                if (component.type * 1558474223 == 6 && -1 != component.animation * 1642844085) {
                    if (null == component.aAnimator_2541) {
                        component.aAnimator_2541 = new Animator_Sub3();
                        component.aAnimator_2541.update(component.animation * 1642844085);
                    }
                    if (component.aAnimator_2541.method13465(Client.anInt10595 * 360018919)
                            && component.aAnimator_2541.method13461()) {
                        component.aAnimator_2541.method13463();
                    }
                }
            }
        }
    }

    static final void method9583(ScriptExecutionContext class613, int i) {
        if (class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] == 0) {
            class613.counter += -160194073 * class613.anIntArray7943[1523704279 * class613.counter];
        }
    }

    void decode(Buffer buffer) {
        boolean loadedOffsets = false;
        for (; ; ) {
            int opcode = buffer.readUByte();
            if (0 == opcode) {
                break;
            }

            if (opcode == 1) {
                if (hitOffsetsX == null) {
                    maximumHits = -1248071980;
                    hitOffsetsX = new int[4];
                    hitOffsetsY = new int[4];
                }

                for (int index = 0; index < hitOffsetsX.length; index++) {
                    hitOffsetsX[index] = buffer.readShort();
                    hitOffsetsY[index] = buffer.readShort();
                }

                loadedOffsets = true;
            } else if (2 == opcode) {
                profilingModel = buffer.readSmart32() * -87226591;
            } else if (opcode == 3) {
                maximumHits = buffer.readUByte() * -1385759819;
                hitOffsetsX = new int[1647467165 * maximumHits];
                hitOffsetsY = new int[maximumHits * 1647467165];
            } else if (4 == opcode) {
                aBool7601 = false;
            } else if (5 == opcode) {
                loginWindowInterfaceIndex = buffer.readUTriByte() * 340025287;
            } else if (opcode == 6) {
                lobbyWindowInterfaceIndex = buffer.readUTriByte() * 1894784493;
            } else if (opcode == 7) {
                originalColours = new short[10][4];
                replacementColours = new short[10][4][];

                for (int i_2_ = 0; i_2_ < 10; i_2_++) {
                    for (int i_3_ = 0; i_3_ < 4; i_3_++) {
                        int original = buffer.readUShort();
                        if (65535 == original) {
                            original = -1;
                        }

                        originalColours[i_2_][i_3_] = (short) original;
                        int count = buffer.readUShort();
                        replacementColours[i_2_][i_3_] = new short[count];

                        for (int i_6_ = 0; i_6_ < count; i_6_++) {
                            int replacement = buffer.readUShort();
                            if (65535 == replacement) {
                                replacement = -1;
                            }

                            replacementColours[i_2_][i_3_][i_6_] = (short) replacement;
                        }
                    }
                }
            } else if (8 == opcode) {
                npcMessagesEnabled = false;
            } else if (9 == opcode) {
                npcMessageDuration = buffer.readUByte() * 601485641;
            } else if (10 == opcode) {
                enablePlayerMessages = false;
            } else if (opcode == 11) {
                playerMessageDuration = buffer.readUByte() * 447419581;
            } else if (12 == opcode) {
                anInt7585 = buffer.readUShort() * 165783257;
                anInt7599 = buffer.readUShort() * -1690970165;
            } else if (opcode == 13) {
                anInt7591 = buffer.readUByte() * -65510321;
            } else if (14 == opcode) {
                anInt7592 = buffer.readUByte() * 162217589;
            } else if (15 == opcode) {
                anInt7593 = buffer.readUByte() * -891885557;
            } else if (16 == opcode) {
                aBool7609 = true;
            } else if (opcode == 17) {
                anInt7603 = buffer.readInt() * -419348799;
            } else if (18 == opcode) {
                anInt7607 = buffer.readInt() * -173372277;
            } else if (19 == opcode) {
                anInt7612 = buffer.readInt() * 179795029;
            } else if (20 == opcode) {
                aShort7598 = (short) buffer.readUShort();
                aByte7610 = (byte) buffer.readUByte();
            } else if (21 == opcode) {
                anInt7600 = buffer.readUByte() * -2013045575;
            }
        }

        if (!loadedOffsets) {
            if (null == hitOffsetsX) {
                maximumHits = -1248071980;
                hitOffsetsX = new int[4];
                hitOffsetsY = new int[4];
            }

            for (int index = 0; index < hitOffsetsX.length; index++) {
                hitOffsetsX[index] = 0;
                hitOffsetsY[index] = 20 * index;
            }
        }
    }

}