package com.jagex;

public class Class188 implements Identifiable {
    static Class188 aClass188_2039;
    static Class188 aClass188_2040;
    static Class188 aClass188_2041;
    static Class188 aClass188_2042;
    static Class188 aClass188_2043;
    static Class188 aClass188_2044;
    static Class188 aClass188_2045;
    static Class188 aClass188_2046;
    static Class188 aClass188_2047;
    static Class188 aClass188_2048 = new Class188(10, 1);
    static Class188 aClass188_2049;
    static Class188 aClass188_2050;
    static Class188 aClass188_2051;
    static Class188 aClass188_2052;

    static {
        aClass188_2040 = new Class188(9, 2);
        aClass188_2039 = new Class188(4, 3);
        aClass188_2042 = new Class188(8, 4);
        aClass188_2043 = new Class188(7, 5);
        aClass188_2044 = new Class188(12, 6);
        aClass188_2045 = new Class188(2, 7);
        aClass188_2050 = new Class188(3, 8);
        aClass188_2047 = new Class188(0, 9);
        aClass188_2052 = new Class188(13, 10);
        aClass188_2049 = new Class188(11, 11);
        aClass188_2041 = new Class188(6, 12);
        aClass188_2051 = new Class188(1, 13);
        aClass188_2046 = new Class188(5, 14);
    }

    int anInt2053;
    int id;

    Class188(int i, int id) {
        anInt2053 = 681685897 * i;
        this.id = -2052569373 * id;
    }

    static Class188[] values() {
        return new Class188[]{aClass188_2047, aClass188_2051, aClass188_2045, aClass188_2050, aClass188_2039,
                aClass188_2046, aClass188_2041, aClass188_2043, aClass188_2042, aClass188_2040, aClass188_2048,
                aClass188_2049, aClass188_2044, aClass188_2052};
    }

    static void method3746(int i) {
        synchronized (Class38.aClass168_538) {
            Class38.aClass168_538.sweep(i);
        }
    }

    static final void method3749(Mobile mobile) {
        Animator animator = mobile.animator;
        if (Client.engineCycle == mobile.anInt11522 * -1506188915 || !animator.hasAnimation() || animator.method13507(1)) {
            int i_2_ = -1506188915 * mobile.anInt11522 - -589638007 * mobile.anInt11560;
            int i_3_ = Client.engineCycle - -589638007 * mobile.anInt11560;
            int i_4_ = mobile.anInt11521 * -1939636736 + mobile.boundSize() * 256;
            int i_5_ = -1221436928 * mobile.anInt11523 + mobile.boundSize() * 256;
            int i_6_ = -1211277824 * mobile.anInt11527 + mobile.boundSize() * 256;
            int i_7_ = -1882168832 * mobile.anInt11524 + mobile.boundSize() * 256;
            Vector3f vector3f = mobile.getCoordinateSpace().translation;
            mobile.setPosition((i_4_ * (i_2_ - i_3_) + i_3_ * i_6_) / i_2_, (int) vector3f.y, (i_5_ * (i_2_ - i_3_) + i_7_
                    * i_3_)
                    / i_2_);
        }
        mobile.anInt11513 = 0;
        mobile.turn(mobile.anInt11501 * 1723039953, false);
    }

    static boolean method3751(BitBuffer buffer, int index) {
        int type = buffer.readBits(2);
        if (0 == type) {
            if (buffer.readBits(1) != 0) {
                method3751(buffer, index);
            }

            int mapX = buffer.readBits(6);
            int mapZ = buffer.readBits(6);
            boolean bool = buffer.readBits(1) == 1;
            if (bool) {
                Class80.maskUpdateIndices[(Class80.anInt1163 += 604640591) * 55566767 - 1] = index;
            }

            if (Client.players[index] != null) {
                throw new RuntimeException();
            }

            GlobalPlayer global = GlobalPlayer.globals[index];
            Player player = Client.players[index] = new Player(Client.scene.getGraph());
            player.index = index * 1228997701;

            if (Class80.playerAppearanceBuffers[index] != null) {
                player.method18251(Class80.playerAppearanceBuffers[index]);
            }

            if (null != Class80.aClass480_Sub17Array1160[index]) {
                player.decodeOverheads(Class80.aClass480_Sub17Array1160[index]);
            }

            player.turn(-576444747 * global.direction, true);
            player.target = 987581099 * global.target;
            int position = 1396904643 * global.position;
            int plane = position >> 28;
            int dx = position >> 14 & 0xff;
            int dz = position & 0xff;

            CoordGrid offset = Client.scene.getBase();
            int x = mapX + (dx << 6) - offset.x * 2051316501;
            int z = (dz << 6) + mapZ - -180305283 * offset.y;

            player.aPlayerMapDot_11782 = global.aPlayerMapDot_562;
            player.clanmate = global.clanmate;
            player.pathSpeed[0] = Class80.playerMovementSpeeds[index];
            player.plane = player.collisionPlane = (byte) plane;

            if (Client.scene.method7775().isBridge(x, z)) {
                player.collisionPlane++;
            }

            player.move(x, z);
            GlobalPlayer.globals[index] = null;
            return true;
        } else if (1 == type) {
            int i_19_ = buffer.readBits(2);
            int i_20_ = GlobalPlayer.globals[index].position * 1396904643;
            GlobalPlayer.globals[index].position = 1866509803 * ((((i_20_ >> 28) + i_19_ & 0x3) << 28) + (i_20_ & 0xfffffff));
            return false;
        } else if (2 == type) {
            int packed = buffer.readBits(5);
            int dy = packed >> 3 & 0x3;
            int direction = packed & 0x7;
            int position = 1396904643 * GlobalPlayer.globals[index].position;
            if (!Class80.$assertionsDisabled
                    && (Class80.playerMovementSpeeds[index] < 0 || Class80.playerMovementSpeeds[index] > 3)) {
                throw new AssertionError();
            }
            int plane = (position >> 28) + dy & 0x3;
            int x = position >> 14 & 0xff;
            int z = position & 0xff;

            if (0 == direction) {
                x--;
                z--;
            } else if (1 == direction) {
                z--;
            } else if (2 == direction) {
                x++;
                z--;
            } else if (direction == 3) {
                x--;
            } else if (4 == direction) {
                x++;
            } else if (5 == direction) {
                x--;
                z++;
            } else if (6 == direction) {
                z++;
            } else if (direction == 7) {
                x++;
                z++;
            }

            CompressionType.findIdentifiable(MovementType.values(), Class80.playerMovementSpeeds[index]);
            GlobalPlayer.globals[index].position = 1866509803 * (z + (plane << 28) + (x << 14));
            return false;
        }

        int packed = buffer.readBits(20);
        int speed = packed >> 18 & 0x3;
        int i_30_ = packed >> 16 & 0x3;
        int i_31_ = packed >> 8 & 0xff;
        int i_32_ = packed & 0xff;
        int i_33_ = 1396904643 * GlobalPlayer.globals[index].position;

        Class80.playerMovementSpeeds[index] = (byte) (speed - 1);
        if (!Class80.$assertionsDisabled
                && (Class80.playerMovementSpeeds[index] < 0 || Class80.playerMovementSpeeds[index] > 3)) {
            throw new AssertionError();
        }

        int i_34_ = i_30_ + (i_33_ >> 28) & 0x3;
        int i_35_ = i_31_ + (i_33_ >> 14) & 0xff;
        int i_36_ = i_32_ + i_33_ & 0xff;
        CompressionType.findIdentifiable(MovementType.values(), speed - 1);
        GlobalPlayer.globals[index].position = 1866509803 * ((i_35_ << 14) + (i_34_ << 28) + i_36_);
        return false;
    }

    @Override
    public int getId() {
        return -1823396149 * id;
    }
}
