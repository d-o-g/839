package com.jagex;

public class Player extends Mobile {

    public boolean aBool11773;
    public boolean aBool11783;
    public boolean clanmate;
    public byte gender = 0;
    public String accountName;
    public PlayerMapDot aPlayerMapDot_11782;
    public int anInt11760;
    public int anInt11763;
    public int team;
    public int combat;
    public int boosted;
    public int combatRange;
    public int skillRating;
    public int nextDirection;
    public int anInt11776;
    public int anInt11777;
    public int anInt11778;
    public int anInt11780;
    public int[] overheadIcons;
    public int[] overheadIconFlags;
    public PlayerAppearance appearance;
    public String displayName;
    int anInt11781;
    String prefix;
    String postfix;

    public Player(SceneGraph sceneGraph) {
        super(sceneGraph, Varp.varpLoader);
        overheadIconFlags = new int[8];
        overheadIcons = new int[8];
        combatRange = -1556939827;
        nextDirection = -1484771999;
        anInt11763 = -1754357015;
        anInt11776 = -1921443553;
        anInt11777 = 1271591479;
        anInt11778 = 1887134709;
        anInt11780 = -44110485;
        aPlayerMapDot_11782 = PlayerMapDot.aPlayerMapDot_2093;
        method18241();
    }

    public Player(SceneGraph sceneGraph, int i) {
        super(sceneGraph, i, Varp.varpLoader);
        overheadIconFlags = new int[8];
        overheadIcons = new int[8];
        combatRange = -1556939827;
        nextDirection = -1484771999;
        anInt11763 = -1754357015;
        anInt11776 = -1921443553;
        anInt11777 = 1271591479;
        anInt11778 = 1887134709;
        anInt11780 = -44110485;
        aPlayerMapDot_11782 = PlayerMapDot.aPlayerMapDot_2093;
        method18241();
    }

    static void method16728(BitBuffer buffer, int index) {
        CoordGrid class553 = Client.scene.getBase();
        boolean bool = buffer.readBits(1) == 1;
        if (bool) {
            Class80.maskUpdateIndices[(Class80.anInt1163 += 604640591) * 55566767 - 1] = index;
        }

        int type = buffer.readBits(2);
        Player player = Client.players[index];
        if (0 == type) {
            if (!bool) {
                if (index == -406165969 * Client.localPlayerIndex) {
                    throw new RuntimeException();
                }

                GlobalPlayer class680 = GlobalPlayer.globals[index] = new GlobalPlayer();
                MovementType.values();
                class680.position = 1866509803 * ((player.plane << 28)
                        + (player.pathX[0] + class553.x * 2051316501 >> 6 << 14) + (-180305283 * class553.z
                        + player.pathZ[0] >> 6));

                if (-1 != player.nextDirection * 143575391) {
                    class680.direction = -1833498557 * player.nextDirection;
                } else {
                    class680.direction = player.yaw.value() * 1706170269;
                }

                class680.target = -96968701 * player.target;
                class680.aPlayerMapDot_562 = player.aPlayerMapDot_11782;
                class680.clanmate = player.clanmate;

                if (player.anInt11760 * -930097605 > 0) {
                    Class480_Sub18.method8883(player);
                }

                Client.players[index] = null;
                if (buffer.readBits(1) != 0) {
                    Class188.method3751(buffer, index);
                }
            }
        } else if (1 == type) {
            int direction = buffer.readBits(3);
            int running = buffer.readBits(1);
            int x = player.pathX[0];
            int z = player.pathZ[0];

            if (1 == running) {
                int second = buffer.readBits(2);
                switch (second) {
                    case 3:
                        player.move(x, z - 1, Class80.playerMovementSpeeds[index]);
                        break;
                    case 0:
                        player.move(x, 1 + z, Class80.playerMovementSpeeds[index]);
                        break;
                    case 1:
                        player.move(x - 1, z, Class80.playerMovementSpeeds[index]);
                        break;
                    case 2:
                        player.move(x + 1, z, Class80.playerMovementSpeeds[index]);
                        break;
                }
            }

            if (0 == direction) {
                x--;
                z--;
            } else if (direction == 1) {
                z--;
            } else if (2 == direction) {
                x++;
                z--;
            } else if (3 == direction) {
                x--;
            } else if (direction == 4) {
                x++;
            } else if (5 == direction) {
                x--;
                z++;
            } else if (direction == 6) {
                z++;
            } else if (7 == direction) {
                x++;
                z++;
            }

            player.move(x, z, Class80.playerMovementSpeeds[index]);
        } else if (type == 2) {
            int direction = buffer.readBits(4);
            int x = player.pathX[0];
            int z = player.pathZ[0];

            if (direction == 0) {
                x -= 2;
                z -= 2;
            } else if (1 == direction) {
                x--;
                z -= 2;
            } else if (2 == direction) {
                z -= 2;
            } else if (3 == direction) {
                x++;
                z -= 2;
            } else if (direction == 4) {
                x += 2;
                z -= 2;
            } else if (direction == 5) {
                x -= 2;
                z--;
            } else if (direction == 6) {
                x += 2;
                z--;
            } else if (direction == 7) {
                x -= 2;
            } else if (direction == 8) {
                x += 2;
            } else if (9 == direction) {
                x -= 2;
                z++;
            } else if (direction == 10) {
                x += 2;
                z++;
            } else if (direction == 11) {
                x -= 2;
                z += 2;
            } else if (12 == direction) {
                x--;
                z += 2;
            } else if (13 == direction) {
                z += 2;
            } else if (direction == 14) {
                x++;
                z += 2;
            } else if (direction == 15) {
                x += 2;
                z += 2;
            }

            player.move(x, z, Class80.playerMovementSpeeds[index]);
        } else {
            int local = buffer.readBits(1);
            if (0 == local) {
                int packed = buffer.readBits(15);
                int speed = packed >> 12 & 0x7;
                int dy = (byte) (packed >> 10) & 0x3;

                int dx = packed >> 5 & 0x1f;
                if (dx > 15) {
                    dx -= 32;
                }

                int dz = packed & 0x1f;
                if (dz > 15) {
                    dz -= 32;
                }

                int x = player.pathX[0] + dx;
                int z = player.pathZ[0] + dz;

                if (speed == MovementType.aClass624_8029.anInt8027 * -1461930423) {
                    player.move(x, z);
                } else {
                    Class80.playerMovementSpeeds[index] = (byte) (speed - 1);
                    player.move(x, z, Class80.playerMovementSpeeds[index]);
                }

                player.plane = player.collisionPlane = (byte) (player.plane + dy & 0x3);
                if (Client.scene.method7775().isBridge(x, z)) {
                    player.collisionPlane++;
                }

                if (Client.localPlayerIndex * -406165969 == index
                        && player.plane != 1611577177 * SceneGraph.localPlane) {
                    SceneGraph.localPlane = player.plane * -751820567;
                }
            } else {
                int speed = buffer.readBits(3);
                int packed = buffer.readBits(30);
                int dy = packed >> 28 & 0x3;
                int dx = packed >> 14 & 0x3fff;
                int dz = packed & 0x3fff;
                int x = (player.pathX[0] + 2051316501 * class553.x + dx & 0x3fff) - 2051316501 * class553.x;
                int z = (dz + class553.z * -180305283 + player.pathZ[0] & 0x3fff) - -180305283 * class553.z;

                if (MovementType.aClass624_8029.anInt8027 * -1461930423 == speed) {
                    player.move(x, z);
                } else {
                    Class80.playerMovementSpeeds[index] = (byte) (speed - 1);
                    player.move(x, z, Class80.playerMovementSpeeds[index]);
                }

                player.plane = player.collisionPlane = (byte) (dy + player.plane & 0x3);
                if (Client.scene.method7775().isBridge(x, z)) {
                    player.collisionPlane++;
                }

                if (index == -406165969 * Client.localPlayerIndex) {
                    SceneGraph.localPlane = -751820567 * player.plane;
                }
            }
        }
    }

    public static void method16018(Player player) {
        Class480_Sub18 class480_sub18 = (Class480_Sub18) Class480_Sub18.aClass667_10113.get(387935885 * player.index);
        if (null == class480_sub18) {
            Class262.method4972(player.plane, player.pathX[0], player.pathZ[0], 0, null, null, player);
        } else {
            class480_sub18.method15898();
        }
    }

    static final void method14180(BitBuffer buffer) {
        int i_2_ = 0;
        buffer.disableBitAccess();

        for (int i = 0; i < -1784886003 * Class80.playerCount; i++) {
            int index = Class80.playerIndices[i];

            if ((Class80.playerUpdateState[index] & 0x1) == 0) {
                if (i_2_ > 0) {
                    i_2_--;
                    Class80.playerUpdateState[index] |= 0x2;
                } else {
                    int i_5_ = buffer.readBits(1);
                    if (i_5_ == 0) {
                        i_2_ = AreaSoundVolumeNormaliser.method3851(buffer);
                        Class80.playerUpdateState[index] |= 0x2;
                    } else {
                        Player.method16728(buffer, index);
                    }
                }
            }
        }

        buffer.enableBitAccess();
        if (0 != i_2_) {
            throw new RuntimeException();
        }

        buffer.disableBitAccess();
        for (int i = 0; i < -1784886003 * Class80.playerCount; i++) {
            int index = Class80.playerIndices[i];
            if (0 != (Class80.playerUpdateState[index] & 0x1)) {
                if (i_2_ > 0) {
                    i_2_--;
                    Class80.playerUpdateState[index] |= 0x2;
                } else {
                    int i_8_ = buffer.readBits(1);

                    if (0 == i_8_) {
                        i_2_ = AreaSoundVolumeNormaliser.method3851(buffer);
                        Class80.playerUpdateState[index] |= 0x2;
                    } else {
                        Player.method16728(buffer, index);
                    }
                }
            }
        }

        buffer.enableBitAccess();
        if (i_2_ != 0) {
            throw new RuntimeException();
        }

        buffer.disableBitAccess();

        for (int i_9_ = 0; i_9_ < Class80.globalPlayerCount * 2144332775; i_9_++) {
            int i_10_ = Class80.globalPlayerIndices[i_9_];
            if (0 != (Class80.playerUpdateState[i_10_] & 0x1)) {
                if (i_2_ > 0) {
                    i_2_--;
                    Class80.playerUpdateState[i_10_] |= 0x2;
                } else {
                    int i_11_ = buffer.readBits(1);
                    if (0 == i_11_) {
                        i_2_ = AreaSoundVolumeNormaliser.method3851(buffer);
                        Class80.playerUpdateState[i_10_] |= 0x2;
                    } else if (Class188.method3751(buffer, i_10_)) {
                        Class80.playerUpdateState[i_10_] |= 0x2;
                    }
                }
            }
        }

        buffer.enableBitAccess();
        if (i_2_ != 0) {
            throw new RuntimeException();
        }
        buffer.disableBitAccess();

        for (int i_12_ = 0; i_12_ < 2144332775 * Class80.globalPlayerCount; i_12_++) {
            int i_13_ = Class80.globalPlayerIndices[i_12_];
            if ((Class80.playerUpdateState[i_13_] & 0x1) == 0) {
                if (i_2_ > 0) {
                    i_2_--;
                    Class80.playerUpdateState[i_13_] |= 0x2;
                } else {
                    int i_14_ = buffer.readBits(1);
                    if (i_14_ == 0) {
                        i_2_ = AreaSoundVolumeNormaliser.method3851(buffer);
                        Class80.playerUpdateState[i_13_] |= 0x2;
                    } else if (Class188.method3751(buffer, i_13_)) {
                        Class80.playerUpdateState[i_13_] |= 0x2;
                    }
                }
            }
        }

        buffer.enableBitAccess();
        if (0 != i_2_) {
            throw new RuntimeException();
        }

        Class80.playerCount = 0;
        Class80.globalPlayerCount = 0;
        for (int index = 1; index < 2048; index++) {
            Class80.playerUpdateState[index] >>= 1;
            Player player = Client.players[index];

            if (player != null) {
                Class80.playerIndices[(Class80.playerCount += 385075653) * -1784886003 - 1] = index;
            } else {
                Class80.globalPlayerIndices[(Class80.globalPlayerCount += -176949289) * 2144332775 - 1] = index;
            }
        }
    }

    static final void decodePlayerInfo(BitBuffer buffer) {
        buffer.disableBitAccess();
        int index = Client.localPlayerIndex * -406165969;
        Player player = Client.localPlayer = Client.players[index] = new Player(Client.scene.getGraph());
        player.index = 1228997701 * index;

        int localPosition = buffer.readBits(30);
        byte localPlane = (byte) (localPosition >> 28);
        int localX = localPosition >> 14 & 0x3fff;
        int localZ = localPosition & 0x3fff;

        CoordGrid class553 = Client.scene.getBase();

        player.pathX[0] = localX - 2051316501 * class553.x;
        player.pathZ[0] = localZ - class553.z * -180305283;
        player.setPosition((player.pathX[0] << 9) + (player.boundSize() << 8), player.method10180().translation.y,
                (player.pathZ[0] << 9) + (player.boundSize() << 8));

        SceneGraph.localPlane = (player.plane = player.collisionPlane = localPlane) * -751820567;
        if (Client.scene.method7775().isBridge(player.pathX[0], player.pathZ[0])) {
            player.collisionPlane++;
        }

        if (Class80.playerAppearanceBuffers[index] != null) {
            player.method18251(Class80.playerAppearanceBuffers[index]);
        }

        if (Class80.aClass480_Sub17Array1160[index] != null) {
            player.decodeOverheads(Class80.aClass480_Sub17Array1160[index]);
        }

        Class80.playerCount = 0;
        Class80.playerIndices[(Class80.playerCount += 385075653) * -1784886003 - 1] = index;
        Class80.playerUpdateState[index] = (byte) 0;
        Class80.globalPlayerCount = 0;

        for (int slot = 1; slot < 2048; slot++) {
            if (index != slot) {
                int position = buffer.readBits(18);
                int plane = position >> 16 & 0x3;
                int x = position >> 8 & 0xff;
                int z = position & 0xff;

                GlobalPlayer global = GlobalPlayer.globals[slot] = new GlobalPlayer();
                global.position = 1866509803 * (z + (plane << 28) + (x << 14));
                global.direction = 0;
                global.target = -195165065;
                global.aPlayerMapDot_562 = PlayerMapDot.aPlayerMapDot_2093;
                global.clanmate = false;

                Class80.globalPlayerIndices[(Class80.globalPlayerCount += -176949289) * 2144332775 - 1] = slot;
                Class80.playerUpdateState[slot] = (byte) 0;
            }
        }

        buffer.enableBitAccess();
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

    static final void updatePlayers(BitBuffer buffer, int length) {
        Class80.anInt1163 = 0;
        Player.method14180(buffer);
        decodePlayerMask(buffer);
        if (-165875887 * buffer.caret != length) {
            throw new RuntimeException(new StringBuilder().append(-165875887 * buffer.caret).append(" ")
                    .append(length).toString());
        }
    }

    static final void decodePlayerMask(BitBuffer buffer) {
        for (int i = 0; i < 55566767 * Class80.anInt1163; i++) {
            buffer.readUShort();
            int index = Class80.maskUpdateIndices[i];
            Player player = Client.players[index];
            int mask = buffer.readUByte();

            if (0 != (mask & 0x1)) {
                mask += buffer.readUByte() << 8;
            }

            if ((mask & 0x200) != 0) {
                mask += buffer.readUByte() << 16;
            }

            decodePlayerMask(buffer, index, player, mask);
        }
    }

    static final void decodePlayerMask(BitBuffer buffer, int index, Player player, int mask) {
        if ((mask & 0x10) != 0) {
            int hits = buffer.readNegatedUByte();
            if (hits > 0) {
                for (int i = 0; i < hits; i++) {
                    int i_7_ = -1;
                    int amount = -1;
                    int i_9_ = -1;
                    int type = buffer.readUSmart();

                    if (32767 == type) {
                        type = buffer.readUSmart();
                        amount = buffer.readUSmart();
                        i_7_ = buffer.readUSmart();
                        i_9_ = buffer.readUSmart();
                    } else if (type != 32766) {
                        amount = buffer.readUSmart();
                    } else {
                        type = -1;
                        amount = buffer.readUByteS();
                    }

                    int delay = buffer.readUSmart();
                    player.hit(type, amount, i_7_, i_9_, Client.engineCycle, delay);
                }
            }

            int i_12_ = buffer.readUByteS();
            if (i_12_ > 0) {
                for (int i = 0; i < i_12_; i++) {
                    int id = buffer.readUSmart();
                    int i_15_ = buffer.readUSmart();

                    if (32767 != i_15_) {
                        int i_16_ = buffer.readUSmart();
                        int i_17_ = buffer.readUByte();
                        int i_18_ = i_15_ > 0 ? buffer.readUByte() : i_17_;
                        player.method17952(id, Client.engineCycle, i_15_, i_16_, i_17_, i_18_);
                    } else {
                        player.method17953(id);
                    }
                }
            }
        }
        if (0 != (mask & 0x10000)) {
            player.clanmate = buffer.readUByteA() == 1;
        }
        if ((mask & 0x80) != 0) {
            player.nextDirection = buffer.readUShortA() * 1484771999;
            if (player.pathLength * 2071858351 == 0) {
                player.turn(player.nextDirection * 143575391);
                player.nextDirection = -1484771999;
            }
        }
        if (0 != (mask & 0x100000)) {
            String string = buffer.readString();
            int i_19_ = buffer.readNegatedUByte();
            if (0 != (i_19_ & 0x1)) {
                Class176.addChatMessage(2, i_19_, player.formattedName(true), player.getName(false),
                        player.displayName, string, null);
            }
            player.setMessage(string, 0, 0);
        }
        if ((mask & 0x400) != 0) {
            int length = buffer.readNegatedUByte();
            byte[] bytes = new byte[length];
            Buffer buf = new Buffer(bytes);
            buffer.readReverseBytesA(bytes, 0, length);
            Class80.aClass480_Sub17Array1160[index] = buf;
            player.decodeOverheads(buf);
        }
        if ((mask & 0x800000) != 0) {
            int i_21_ = buffer.readUShortA();
            int i_22_ = buffer.readMEInt();
            if (65535 == i_21_) {
                i_21_ = -1;
            }

            int i_23_ = buffer.readUByteA();
            int i_24_ = i_23_ & 0x7;
            int i_25_ = i_23_ >> 3 & 0xf;
            if (i_25_ == 15) {
                i_25_ = -1;
            }

            boolean bool = (i_23_ >> 7 & 0x1) == 1;
            player.method18035(i_21_, i_22_, i_24_, i_25_, bool, 4);
        }
        if ((mask & 0x1000) != 0) {
            String string = buffer.readString();
            if (Client.localPlayer == player) {
                Class176.addChatMessage(2, 0, player.formattedName(true), player.getName(false), player.displayName,
                        string, null);
            }
            player.setMessage(string, 0, 0);
        }
        if ((mask & 0x8000) != 0) {
            int count = buffer.readUByteA();
            int[] animations = new int[count];
            int[] is_27_ = new int[count];
            int[] is_28_ = new int[count];

            for (int i = 0; i < count; i++) {
                animations[i] = buffer.readSmart32();
                is_27_[i] = buffer.readUByteA();
                is_28_[i] = buffer.readLEUShortA();
            }

            Class166_Sub14.method15118(player, animations, is_27_, is_28_);
        }
        if (0 != (mask & 0x40)) {
            int[] animations = new int[4];
            for (int i_30_ = 0; i_30_ < 4; i_30_++) {
                animations[i_30_] = buffer.readSmart32();
            }

            int i_31_ = buffer.readUByteS();
            Mobile.method8795(player, animations, i_31_, false);
        }
        if ((mask & 0x20000) != 0) {
            int count = buffer.readUByteS();
            int[] is = new int[count];
            int[] is_33_ = new int[count];

            for (int i_34_ = 0; i_34_ < count; i_34_++) {
                int i_35_ = buffer.readUShort();
                if ((i_35_ & 0xc000) == 49152) {
                    int i_36_ = buffer.readLEUShortA();
                    is[i_34_] = i_35_ << 16 | i_36_;
                } else {
                    is[i_34_] = i_35_;
                }

                is_33_[i_34_] = buffer.readUShortA();
            }

            player.method17946(is, is_33_);
        }
        if ((mask & 0x200000) != 0) {
            player.anInterface73_11556.clear();
            buffer.caret += -1778683038;
            int i_37_ = buffer.payload[(buffer.caret += 1258142129) * -165875887 - 1] & 0xff;

            for (int i_38_ = 0; i_38_ < i_37_; i_38_++) {
                int id = buffer.readUByte();
                ValueType type = CompressionType.findIdentifiable(ValueType.values(), id);
                DefaultMapEntry class383 = Varp.varpLoader.decodeTypedEntry(buffer,
                        type);
                player.anInterface73_11556.put(class383.key * 1960527763, class383.value);
            }
        }
        if (0 != (mask & 0x4000)) {
            int i_40_ = buffer.readUShort();
            int i_41_ = buffer.readMEInt();
            if (i_40_ == 65535) {
                i_40_ = -1;
            }

            int i_42_ = buffer.readNegatedUByte();
            int i_43_ = i_42_ & 0x7;
            int i_44_ = i_42_ >> 3 & 0xf;
            if (15 == i_44_) {
                i_44_ = -1;
            }

            boolean bool = 1 == (i_42_ >> 7 & 0x1);
            player.method18035(i_40_, i_41_, i_43_, i_44_, bool, 2);
        }
        if (0 != (mask & 0x20)) {
            int i_45_ = buffer.readLEUShort();
            int i_46_ = buffer.readMEInt();
            if (65535 == i_45_) {
                i_45_ = -1;
            }

            int i_47_ = buffer.readUByteS();
            int i_48_ = i_47_ & 0x7;
            int i_49_ = i_47_ >> 3 & 0xf;
            if (15 == i_49_) {
                i_49_ = -1;
            }

            boolean bool = (i_47_ >> 7 & 0x1) == 1;
            player.method18035(i_45_, i_46_, i_48_, i_49_, bool, 0);
        }
        if (0 != (mask & 0x80000)) {
            buffer.caret += -1778683038;
            int i_50_ = buffer.payload[(buffer.caret += 1258142129) * -165875887 - 1] & 0xff;

            for (int i_51_ = 0; i_51_ < i_50_; i_51_++) {
                int i_52_ = buffer.readUByteA();
                ValueType class423 = CompressionType.findIdentifiable(ValueType.values(), i_52_);
                DefaultMapEntry class383 = Varp.varpLoader.decodeTypedEntry(buffer,
                        class423);
                player.anInterface73_11556.put(class383.key * 1960527763, class383.value);
            }
        }
        if ((mask & 0x100) != 0) {
            int i_53_ = buffer.readLEUShort();
            int i_54_ = buffer.readInt();
            if (i_53_ == 65535) {
                i_53_ = -1;
            }
            int i_55_ = buffer.readUByteA();
            int i_56_ = i_55_ & 0x7;
            int i_57_ = i_55_ >> 3 & 0xf;
            if (15 == i_57_) {
                i_57_ = -1;
            }
            boolean bool = 1 == (i_55_ >> 7 & 0x1);
            player.method18035(i_53_, i_54_, i_56_, i_57_, bool, 1);
        }
        if (0 != (mask & 0x2000)) {
            player.aPlayerMapDot_11782 = CompressionType.findIdentifiable(PlayerMapDot.values(), buffer.readNegatedUByte());
            if (player.aPlayerMapDot_11782 == null) {
                player.aPlayerMapDot_11782 = PlayerMapDot.aPlayerMapDot_2093;
            }
        }
        if (0 != (mask & 0x40000)) {
            int i_58_ = buffer.readUShort();
            int i_59_ = buffer.readInt();
            if (65535 == i_58_) {
                i_58_ = -1;
            }

            int i_60_ = buffer.readUByte();
            int i_61_ = i_60_ & 0x7;
            int i_62_ = i_60_ >> 3 & 0xf;
            if (15 == i_62_) {
                i_62_ = -1;
            }

            boolean bool = 1 == (i_60_ >> 7 & 0x1);
            player.method18035(i_58_, i_59_, i_61_, i_62_, bool, 3);
        }
        if ((mask & 0x8) != 0) {
            player.anInt11521 = buffer.readByte() * -1909277121;
            player.anInt11523 = buffer.readByte() * -1771102555;
            player.anInt11527 = buffer.readByteA() * 1041051727;
            player.anInt11524 = buffer.readByteA() * -1458147119;
            player.anInt11560 = (buffer.readLEUShortA() + Client.engineCycle) * 1321566137;
            player.anInt11522 = (buffer.readUShortA() + Client.engineCycle) * 771082565;
            player.anInt11501 = buffer.readLEUShortA() * 1354029105;
            player.anInt11521 += -1909277121 * player.pathX[0];
            player.anInt11523 += player.pathZ[0] * -1771102555;
            player.anInt11527 += player.pathX[0] * 1041051727;
            player.anInt11524 += -1458147119 * player.pathZ[0];
            player.pathLength = -379008433;
            player.anInt11550 = 0;
        }
        if ((mask & 0x4) != 0) {
            int i_63_ = buffer.readUShort();
            if (65535 == i_63_) {
                i_63_ = -1;
            }

            player.target = -953311613 * i_63_;
        }
        if ((mask & 0x400000) != 0) {
            player.aByte11530 = buffer.readByte();
            player.aByte11531 = buffer.readNegatedByte(2030529681);
            player.aByte11492 = buffer.readByteS();
            player.aByte11533 = (byte) buffer.readUByteS();
            player.anInt11528 = (Client.engineCycle + buffer.readUShort()) * -1044838623;
            player.anInt11529 = (Client.engineCycle + buffer.readUShort()) * 1372621715;
        }
        if ((mask & 0x2) != 0) {
            int length = buffer.readNegatedUByte();
            byte[] is = new byte[length];
            Buffer buf = new Buffer(is);
            buffer.readReverseBytes(is, 0, length);
            Class80.playerAppearanceBuffers[index] = buf;
            player.method18251(buf);
        }
    }

    @Override
    public int boundSize() {
        if (null != appearance && -1 != 1639350421 * appearance.npc) {
            return NpcDefinition.loader.get(1639350421 * appearance.npc).boundSize * 2117527163;
        }

        return super.boundSize();
    }

    @Override
    public int getArmyIcon() {
        return -1;
    }

    @Override
    public OverheadMessage getMessage() {
        if (null != message) {
            if (null == message.text) {
                return null;
            }

            if (2041602173 * Client.publicChatMode == 0 || Client.publicChatMode * 2041602173 == 3
                    || Client.publicChatMode * 2041602173 == 1 && Client.isFriend(accountName)) {
                return message;
            }
        }

        return null;
    }

    public String getName(boolean display) {
        return display ? displayName : accountName;
    }

    public final boolean hasAppearance() {
        return null != appearance;
    }

    @Override
    public Vector4i method140() {
        CoordGrid class553 = Client.scene.getBase();
        return Vector4i.create(plane, (int) getCoordinateSpace().translation.x + class553.x * -1992939008,
                -(int) getCoordinateSpace().translation.y, (int) getCoordinateSpace().translation.z + class553.z * -2121991680);
    }

    @Override
    public Quaternion method142() {
        Quaternion quaternion = Quaternion.cached();
        quaternion.method6413(Class373.method6114(yaw.value * 2069603133), 0.0F, 0.0F);
        return quaternion;
    }

    @Override
    public Vector3f method143() {
        return Vector3f.empty();
    }

    @Override
    public CharacterType getType() {
        return CharacterType.PLAYER;
    }

    @Override
    public Class498 method16293(Toolkit toolkit) {
        return null;
    }

    @Override
    public boolean canMessage() {
        return Client.playerDefaults.enablePlayerMessages;
    }

    @Override
    public int method17969() {
        return -(index * 387935885) - 1;
    }

    public void decodeOverheads(Buffer buffer) {
        buffer.caret = 0;
        int i_0_ = buffer.readUByte();

        for (int index = 0; index < overheadIconFlags.length; index++) {
            if (0 != (i_0_ & 1 << index)) {
                int i_2_ = buffer.readUByte();
                int i_3_ = buffer.readUShort();

                overheadIconFlags[index] = i_2_;
                overheadIcons[index] = i_3_;
            } else {
                overheadIconFlags[index] = -1;
                overheadIcons[index] = -1;
            }
        }
    }

    public String formattedName(boolean display) {
        String string = "";
        if (null != prefix) { // title?
            string = prefix;
        }

        string += display ? displayName : accountName;

        if (null != postfix) {
            string += postfix;
        }

        return string;
    }

    public final void method18251(Buffer buffer) {
        buffer.caret = 0;
        int attributes = buffer.readUByte();
        byte i_51_ = (byte) (attributes & 0x1);
        boolean bool = 0 != (attributes & 0x4);
        int size = super.boundSize();
        setBoundSize(1 + (attributes >> 3 & 0x7));
        boolean bool_53_ = (attributes & 0x40) != 0;
        boolean bool_54_ = 0 != (attributes & 0x80);

        Vector3f vector3f = Vector3f.copyOf(getCoordinateSpace().translation);
        vector3f.x += boundSize() - size << 8;
        vector3f.z += boundSize() - size << 8;
        setPosition(vector3f);
        vector3f.cache();

        if (bool_53_) {
            prefix = buffer.readPrefixedString();
        } else {
            prefix = null;
        }

        if (bool_54_) {
            postfix = buffer.readPrefixedString();
        } else {
            postfix = null;
        }

        aBool11783 = buffer.readByte() == 1;
        if (ArchiveLoader.aClass622_4521 == Class622.aClass622_8012 && Client.localPrivilege * 1667858447 >= 2) {
            aBool11783 = false;
        }

        decodeAppearance(buffer, i_51_);
        displayName = buffer.readString();
        accountName = displayName;

        if (this == Client.localPlayer) {
            ContainerDecodingException.localDisplayName = displayName;
        }

        combat = buffer.readUByte() * -675923681;
        if (bool) {
            skillRating = buffer.readUShort() * -1030141993;
            if (skillRating * -432563225 == 65535) {
                skillRating = 1030141993;
            }

            boosted = -2068796835 * combat;
            combatRange = -1556939827;
        } else {
            skillRating = 0;
            boosted = buffer.readUByte() * -1603185085;
            combatRange = buffer.readUByte() * 1556939827;

            if (255 == combatRange * 878548731) {
                combatRange = -1556939827;
            }
        }

        int i_55_ = -930097605 * anInt11760;
        anInt11760 = buffer.readUByte() * -817982733;

        if (0 != -930097605 * anInt11760) {
            int i_56_ = 274573991 * anInt11763;
            int i_57_ = 1288494369 * anInt11776;
            int i_58_ = anInt11777 * 1968610425;
            int i_59_ = -1010561117 * anInt11778;
            int i_60_ = -1345492035 * anInt11780;
            anInt11763 = buffer.readUShort() * 1754357015;
            anInt11776 = buffer.readUShort() * 1921443553;
            anInt11777 = buffer.readUShort() * -1271591479;
            anInt11778 = buffer.readUShort() * -1887134709;
            anInt11780 = buffer.readUByte() * 1263052693;
            if (anInt11760 * -930097605 != i_55_ || i_56_ != anInt11763 * 274573991 || anInt11776 * 1288494369 != i_57_
                    || i_58_ != anInt11777 * 1968610425 || i_59_ != -1010561117 * anInt11778
                    || i_60_ != anInt11780 * -1345492035) {
                Player.method16018(this);
            }
        } else {
            Class480_Sub18.method8883(this);
        }
    }

    public final void move(int x, int z, byte speed) {
        if (animator.hasAnimation() && animator.getAnimation().walkingPrecedence * 1425418197 == 1) {
            anIntArray11538 = null;
            animator.update(-1);
        }

        for (int index = 0; index < effects.length; index++) {
            if (-1 != effects[index].id * -2008549027) {
                EffectDefinition animation = EffectDefinition.loader.get(-2008549027
                        * effects[index].id);
                if (animation.aBool7986
                        && animation.animation * 2053507375 != -1
                        && Animation.loader.get(animation.animation * 2053507375).walkingPrecedence * 1425418197 == 1) {
                    effects[index].animator.update(-1);
                    effects[index].id = 738188555;
                }
            }
        }

        nextDirection = -1484771999;
        if (x < 0 || x >= Client.scene.getMapWidth() || z < 0 || z >= Client.scene.getMapLength()) {
            move(x, z);
        } else if (pathX[0] < 0 || pathX[0] >= Client.scene.getMapWidth() || pathZ[0] < 0
                || pathZ[0] >= Client.scene.getMapLength()) {
            move(x, z);
        } else {
            step(x, z, speed);
        }
    }

    public void decodeAppearance(Buffer buffer, byte gender) {
        this.gender = gender;
        int npc = -1;
        team = 0;
        int[] equipment = new int[EquipmentDefaults.defaults.hidden.length];
        CustomisedItem[] customs = new CustomisedItem[EquipmentDefaults.defaults.hidden.length];
        ItemDefinition[] definitions = new ItemDefinition[EquipmentDefaults.defaults.hidden.length];

        for (int index = 0; index < EquipmentDefaults.defaults.hidden.length; index++) {
            if (EquipmentDefaults.defaults.hidden[index] != 1) {
                int msb = buffer.readUByte();
                if (msb == 0) {
                    equipment[index] = 0;
                } else {
                    int lsb = buffer.readUByte();
                    int id = (msb << 8) + lsb;

                    if (index == 0 && id == 65535) {
                        npc = buffer.readSmart32();
                        team = buffer.readUByte() * -2117659587;
                        break;
                    }

                    if (id >= 16384) {
                        id -= 16384;
                        equipment[index] = id | 0x40000000;
                        definitions[index] = ItemDefinition.loader.get(id);
                        int team = definitions[index].team * -1562170807;

                        if (0 != team) {
                            this.team = -2117659587 * team;
                        }
                    } else {
                        equipment[index] = id - 256 | ~0x7fffffff;
                    }
                }
            }
        }

        if (-1 == npc) {
            int count = buffer.readUShort();
            int current = 0;

            for (int index = 0; index < EquipmentDefaults.defaults.hidden.length; index++) {
                if (EquipmentDefaults.defaults.hidden[index] == 0) {
                    if (0 != (count & 1 << current)) {
                        customs[index] = CustomisedItem.create(definitions[index], buffer);
                    }

                    current++;
                }
            }
        }

        int[] colours = new int[10];
        for (int part = 0; part < 10; part++) {
            int colour = buffer.readUByte();
            if (HuffmanCodec.replacementBodyColours.length < 1 || colour < 0
                    || colour >= HuffmanCodec.replacementBodyColours[part][0].length) {
                colour = 0;
            }

            colours[part] = colour;
        }

        anInt11781 = buffer.readUShort() * 1965000379;
        if (null == appearance) {
            appearance = new PlayerAppearance();
        }

        int currentNpc = 1639350421 * appearance.npc;
        int[] bodyColours = appearance.bodyColours;
        appearance.update(method17959(), equipment, customs, colours, this.gender == 1, npc);
        if (npc != currentNpc) {
            Vector3f vector3f = Vector3f.copyOf(getCoordinateSpace().translation);
            vector3f.x = (pathX[0] << 9) + (boundSize() << 8);
            vector3f.z = (pathZ[0] << 9) + (boundSize() << 8);
            setPosition(vector3f);
            vector3f.cache();
        }

        if (387935885 * index == Client.localPlayerIndex * -406165969 && null != bodyColours) {
            for (int index = 0; index < colours.length; index++) {
                if (bodyColours[index] != colours[index]) {
                    ItemDefinition.loader.clearSpriteCache();
                    break;
                }
            }
        }

        if (aClass564_11552 != null) {
            aClass564_11552.method9482();
        }

        if (aClass650_Sub2_11525.hasAnimation() && aClass650_Sub2_11525.aBool10566) {
            Class515 class515 = method17958();
            if (!class515.method8829(aClass650_Sub2_11525.getAnimationId())) {
                aClass650_Sub2_11525.update(-1);
                aClass650_Sub2_11525.aBool10566 = false;
            }
        }
    }

    @Override
    public int getIndex() {
        return 387935885 * index;
    }

    @Override
    public int method48() {
        return 387935885 * index;
    }

    public void setMessage(String text, int colour, int effect) {
        setMessage(text, colour, effect, EntityQueue.getFps() * Client.playerDefaults.playerMessageDuration * -1308981611);
    }

    public void move(int x, int z) {
        pathLength = 0;
        anInt11550 = 0;
        anInt11513 = 0;

        pathX[0] = x;
        pathZ[0] = z;

        int size = boundSize();
        Vector3f vector3f = Vector3f.copyOf(getCoordinateSpace().translation);
        vector3f.x = pathX[0] * 512 + size * 256;
        vector3f.z = 512 * pathZ[0] + 256 * size;

        setPosition(vector3f);
        vector3f.cache();

        if (Client.localPlayer == this) {
            Client.scene.method7690().method9709();
        }

        if (null != aClass564_11552) {
            aClass564_11552.method9482();
        }
    }

    @Override
    boolean method16257(Toolkit toolkit, int i, int i_41_) {
        if (null == appearance || !method18243(toolkit, 131072)) {
            return false;
        }

        Matrix4x3 class405 = updateAndGetMatrix();
        boolean bool = false;

        for (Model model : cachedModels) {
            if (null != model && model.aBool1751 && model.method2918(i, i_41_, class405, true, 0)) {
                bool = true;
                break;
            }
        }

        for (int index = 0; index < cachedModels.length; index++) {
            cachedModels[index] = null;
        }

        return bool;
    }

    @Override
    final void method16262(Toolkit toolkit, SceneNode class600_sub1, int i, int i_45_, int i_46_, boolean bool,
                           int i_47_) {
        throw new IllegalStateException();
    }

    @Override
    final void method16263() {
        throw new IllegalStateException();
    }

    @Override
    void method16265(Toolkit toolkit) {
        if (null != appearance && (aBool11504 || method18243(toolkit, 0))) {
            Matrix4x3 class405 = toolkit.getMatrix4x3();
            class405.method6728(getCoordinateSpace());
            class405.method6744(0.0F, -5.0F, 0.0F);
            method17948(toolkit, cachedModels, class405, aBool11504);

            for (int i_21_ = 0; i_21_ < cachedModels.length; i_21_++) {
                cachedModels[i_21_] = null;
            }
        }
    }

    @Override
    MouseOverEntity method16271(Toolkit toolkit) {
        if (null == appearance || !method18243(toolkit, 2048)) {
            return null;
        }
        Matrix4x3 class405 = toolkit.getMatrix4x3();
        Matrix4x3 class405_6_ = updateAndGetMatrix();
        CoordinateSpace coordinateSpace = getCoordinateSpace();
        int i_7_ = yaw.value();
        SceneGraphTile sceneGraphTile = graph.tiles[plane][(int) coordinateSpace.translation.x >> 9][(int) coordinateSpace.translation.z >> 9];
        if (sceneGraphTile != null && null != sceneGraphTile.decoration) {
            int i_8_ = -635471227 * anInt11506 - sceneGraphTile.decoration.aShort11466;
            anInt11506 = (int) (-635471227 * anInt11506 - i_8_ / 10.0F) * 1195863629;
        } else {
            anInt11506 = (int) (anInt11506 * -635471227 - -635471227 * anInt11506 / 10.0F) * 1195863629;
        }
        class405.copyFrom(class405_6_);
        class405.method6744(0.0F, -20 - -635471227 * anInt11506, 0.0F);
        MouseOverEntity class506 = null;
        aBool11554 = false;
        if (Class199.preferences.mobShadows.getValue() == 1) {
            Class515 class515 = method17958();
            if (class515.aBool7015
                    && (appearance.npc * 1639350421 == -1 || NpcDefinition.loader.get(appearance.npc * 1639350421).animateIdle)) {
                Animator animator = this.animator.hasAnimation() && this.animator.method13515() ? this.animator
                        : null;
                Animator_Sub2 class650_sub2 = aClass650_Sub2_11525.hasAnimation()
                        && (!aClass650_Sub2_11525.aBool10566 || null == animator) ? aClass650_Sub2_11525 : null;
                short i_9_ = Client.playerDefaults.aShort7598;
                byte i_10_ = Client.playerDefaults.aByte7610;
                if (appearance.npc * 1639350421 != -1) {
                    i_9_ = NpcDefinition.loader.get(1639350421 * appearance.npc).aShort3059;
                    i_10_ = NpcDefinition.loader.get(appearance.npc * 1639350421).aByte3060;
                }
                Model class143;
                if (i_9_ > -1 && Class199.preferences.textures.getValue() == 1) {
                    class143 = Class31.getTexturedMobModel(toolkit, i_7_, anInt11507 * -170688293, anInt11551 * 1861793885,
                            2119207177 * anInt11505, cachedModels[0], i_9_, i_10_,
                            class650_sub2 != null ? class650_sub2 : animator, 1895096767);
                } else {
                    class143 = MouseOverEntities.getMobModel(toolkit, i_7_, anInt11507 * -170688293, 1861793885 * anInt11551,
                            2119207177 * anInt11505, 1, cachedModels[0], 0, 0, 160, 240,
                            null != class650_sub2 ? class650_sub2 : animator);
                }
                if (null != class143) {
                    if (null == class139Array || class139Array.length < 1 + cachedModels.length) {
                        method16274(1 + cachedModels.length);
                    }
                    class506 = MouseOverEntity.method570(true);
                    aBool11554 = true;
                    toolkit.method2473(false);
                    class143.method2917(class405, class139Array[cachedModels.length], 0);
                    toolkit.method2473(true);
                }
            }
        }
        if (this == Client.localPlayer) {
            for (int i = Client.hintArrows.length - 1; i >= 0; i--) {
                HintArrow hintArrow = Client.hintArrows[i];
                if (hintArrow != null && -1294861951 * hintArrow.model != -1) {
                    if (hintArrow.type * -335735335 == 1) {
                        ObjectNode<Npc> node = Client.npcTable.get(hintArrow.targetIndex * 1326506857);
                        if (node != null) {
                            Npc npc = node.referent;
                            Vector3f diff = Vector3f.difference(
                                    npc.getCoordinateSpace().translation,
                                    Client.localPlayer.getCoordinateSpace().translation);
                            int dx = (int) diff.x;
                            int dz = (int) diff.z;
                            method18242(toolkit, class405, cachedModels[0], dx, dz, hintArrow.model * -1294861951, 92160000L);
                        }
                    }
                    if (hintArrow.type * -335735335 == 2) {
                        Vector3f vector3f = Client.localPlayer.getCoordinateSpace().translation;
                        long l = hintArrow.x * 1671278425 - (int) vector3f.x;
                        long l_14_ = hintArrow.z * -1900171419 - (int) vector3f.z;
                        long l_15_ = hintArrow.anInt1121 * -985121683 << 9;
                        l_15_ *= l_15_;
                        method18242(toolkit, class405, cachedModels[0], l, l_14_, -1294861951
                                * hintArrow.model, l_15_);
                    }
                    if (10 == -335735335 * hintArrow.type && hintArrow.targetIndex * 1326506857 >= 0
                            && hintArrow.targetIndex * 1326506857 < Client.players.length) {
                        Player player = Client.players[1326506857 * hintArrow.targetIndex];
                        if (player != null) {
                            Vector3f difference = Vector3f.difference(player.getCoordinateSpace().translation,
                                    Client.localPlayer.getCoordinateSpace().translation);
                            int i_17_ = (int) difference.x;
                            int i_18_ = (int) difference.z;
                            method18242(toolkit, class405, cachedModels[0], i_17_, i_18_, hintArrow.model
                                    * -1294861951, 92160000L);
                        }
                    }
                }
            }
        }
        class405.copyFrom(class405_6_);
        class405.method6744(0.0F, -5 - anInt11506 * -635471227, 0.0F);
        if (null == class139Array || class139Array.length < cachedModels.length) {
            method16274(cachedModels.length);
        }
        if (class506 == null) {
            class506 = MouseOverEntity.method570(true);
        }
        method17948(toolkit, cachedModels, class405, false);
        for (int i_19_ = 0; i_19_ < cachedModels.length; i_19_++) {
            if (null != cachedModels[i_19_]) {
                cachedModels[i_19_].method2917(class405, class139Array[i_19_],
                        Client.localPlayer == this ? 1 : 0);
            } else {
                class139Array[i_19_].aBool1581 = false;
            }
        }
        if (null != aClass564_11552) {
            ParticleEntities particleEntities = aClass564_11552.method9492();
            toolkit.method2470(particleEntities);
        }
        for (int i_20_ = 0; i_20_ < cachedModels.length; i_20_++) {
            if (null != cachedModels[i_20_]) {
                aBool11554 |= cachedModels[i_20_].method2939();
            }
            cachedModels[i_20_] = null;
        }
        anInt11496 = 558171427 * Client.anInt10730;
        return class506;
    }

    @Override
    final boolean method16302() {
        return false;
    }

    @Override
    int method17959() {
        return -461058445 * anInt11781;
    }

    void method18241() {
        for (int i_4_ = 0; i_4_ < overheadIconFlags.length; i_4_++) {
            overheadIconFlags[i_4_] = -1;
        }
        for (int i_5_ = 0; i_5_ < overheadIcons.length; i_5_++) {
            overheadIcons[i_5_] = -1;
        }
    }

    void method18242(Toolkit class134, Matrix4x3 class405, Model class143, long l, long l_22_, int i, long l_23_) {
        long l_24_ = l_22_ * l_22_ + l * l;
        if (l_24_ >= 262144L && l_24_ <= l_23_) {
            int i_25_ = (int) (Math.atan2(l, l_22_) * 2607.5945876176133 - yaw.value()) & 0x3fff;
            Model class143_26_ = Class619.method10416(class134, i_25_, anInt11507 * -170688293,
                    1861793885 * anInt11551, anInt11505 * 2119207177, i);
            if (null != class143_26_) {
                class134.method2473(false);
                class143_26_.method2917(class405, null, 0);
                class134.method2473(true);
            }
        }
    }

    boolean method18243(Toolkit toolkit, int i) {
        int i_28_ = i;
        Class515 class515 = method17958();
        Animator animator = this.animator.hasAnimation() && !this.animator.method13515() ? this.animator : null;
        Animator_Sub2 class650_sub2 = aClass650_Sub2_11525.hasAnimation() && !aBool11773
                && (!aClass650_Sub2_11525.aBool10566 || null == animator) ? aClass650_Sub2_11525 : null;
        int i_29_ = -810085733 * class515.anInt7039;
        int i_30_ = -230428805 * class515.anInt7040;
        if (i_29_ != 0 || i_30_ != 0 || 0 != -1664597871 * class515.anInt7019 || 0 != class515.anInt7052 * -278696585) {
            i |= 0x7;
        }
        int i_31_ = yaw.value();
        boolean bool = 0 != aByte11533 && Client.engineCycle >= -1458225951 * anInt11528
                && Client.engineCycle < -1276032357 * anInt11529;
        if (bool) {
            i |= 0x80000;
        }

        Model class143 = cachedModels[0] = appearance.method9773(toolkit, i, ProxyingVariableLoader.aClass678_Sub6_3003,
                IdentikitDefinition.loader, NpcDefinition.loader, ItemDefinition.loader,
                PlayerFacade.instance, PlayerFacade.instance, animator,
                class650_sub2, aClass650_Sub1_Sub1Array11537, anIntArray11518, i_31_, true, EquipmentDefaults.defaults);

        int i_32_ = Js5ConfigGroup.method1003();
        if (1926618523 * Engine.heapSize < 96 && i_32_ > 50) {
            Class455.method7424();
        }
        if (ArchiveLoader.aClass622_4521 != Class622.aClass622_8012 && i_32_ < 50) {
            int i_33_;
            for (i_33_ = 50 - i_32_; i_33_ > Client.anInt10617 * -485226109; Client.anInt10617 += 1262636331) {
                Class591.aByteArrayArray7833[Client.anInt10617 * -485226109] = new byte[102400];
            }
            while (i_33_ < Client.anInt10617 * -485226109) {
                Client.anInt10617 -= 1262636331;
                Class591.aByteArrayArray7833[Client.anInt10617 * -485226109] = null;
            }
        } else if (ArchiveLoader.aClass622_4521 != Class622.aClass622_8012) {
            Class591.aByteArrayArray7833 = new byte[50][];
            Client.anInt10617 = 0;
        }
        if (class143 == null) {
            return false;
        }
        anInt11510 = class143.minimumY() * -68872337;
        anInt11498 = class143.method2928() * -383074927;
        class143.method3016();

        method17978(class143);
        if (0 != i_29_ || 0 != i_30_) {
            method17973(i_31_, i_29_, i_30_, 1923259871 * class515.anInt7058, 522314919 * class515.anInt7042);
            if (0 != anInt11507 * -170688293) {
                class143.pitch(-170688293 * anInt11507);
            }

            if (0 != anInt11551 * 1861793885) {
                class143.roll(1861793885 * anInt11551);
            }

            if (0 != 2119207177 * anInt11505) {
                class143.translate(0, anInt11505 * 2119207177, 0);
            }
        } else {
            method17973(i_31_, boundSize() << 9, boundSize() << 9, 0, 0);
        }

        if (bool) {
            class143.recolor(aByte11530, aByte11531, aByte11492, aByte11533 & 0xff);
        }

        if (!aBool11773) {
            method17957(toolkit, class515, i_28_, i_29_, i_30_, i_31_);
        }

        return true;
    }

    final void step(int x, int z, byte speed) {
        if (2071858351 * pathLength < pathX.length - 1) {
            pathLength += -379008433;
        }

        for (int index = pathLength * 2071858351; index > 0; index--) {
            pathX[index] = pathX[index - 1];
            pathZ[index] = pathZ[index - 1];
            pathSpeed[index] = pathSpeed[index - 1];
        }

        pathX[0] = x;
        pathZ[0] = z;
        pathSpeed[0] = speed;
    }

}