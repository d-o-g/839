package com.jagex;

public abstract class KeyRecorder {
    public static final int anInt7070 = 84;
    public static final int anInt7099 = 28;
    public static final int anInt7103 = 96;
    public static final int anInt7114 = 66;
    public static final int anInt7122 = 80;
    public static final int anInt7123 = 81;
    public static final int anInt7124 = 82;
    public static final int anInt7126 = 67;
    public static final int anInt7127 = 85;
    public static final int anInt7128 = 86;
    public static final int anInt7138 = 97;
    public static final int anInt7139 = 98;
    public static final int anInt7142 = 101;
    public static final int anInt7143 = 102;
    public static final int anInt7144 = 103;
    public static final int anInt7145 = 104;
    public static final int anInt7158 = 99;
    public static final int anInt7165 = 105;
    static final int anInt7064 = 65;
    static final int anInt7065 = 1;
    static final int anInt7066 = 2;
    static final int anInt7067 = 3;
    static final int anInt7068 = 4;
    static final int anInt7069 = 5;
    static final int anInt7071 = 7;
    static final int anInt7072 = 8;
    static final int anInt7073 = 9;
    static final int anInt7074 = 10;
    static final int anInt7075 = 27;
    static final int anInt7076 = 12;
    static final int anInt7077 = 16;
    static final int anInt7078 = 17;
    static final int anInt7079 = 18;
    static final int anInt7080 = 19;
    static final int anInt7081 = 20;
    static final int anInt7082 = 21;
    static final int anInt7083 = 22;
    static final int anInt7084 = 23;
    static final int anInt7085 = 24;
    static final int anInt7086 = 137;
    static final int anInt7087 = 25;
    static final int anInt7088 = 26;
    static final int anInt7089 = 32;
    static final int anInt7090 = 33;
    static final int anInt7091 = 34;
    static final int anInt7092 = 35;
    static final int anInt7093 = 87;
    static final int anInt7094 = 134;
    static final int anInt7095 = 38;
    static final int anInt7096 = 39;
    static final int anInt7097 = 40;
    static final int anInt7098 = 41;
    static final int anInt7100 = 43;
    static final int anInt7101 = 162;
    static final int anInt7102 = 49;
    static final int anInt7104 = 51;
    static final int anInt7105 = 52;
    static final int anInt7106 = 136;
    static final int anInt7107 = 50;
    static final int anInt7108 = 135;
    static final int anInt7109 = 56;
    static final int anInt7110 = 57;
    static final int anInt7111 = 58;
    static final int anInt7112 = 64;
    static final int anInt7113 = 72;
    static final int anInt7115 = 150;
    static final int anInt7116 = 6;
    static final int anInt7117 = 69;
    static final int anInt7118 = 11;
    static final int anInt7119 = 13;
    static final int anInt7120 = 70;
    static final int anInt7121 = 68;
    static final int anInt7125 = 83;
    static final int anInt7129 = 48;
    static final int anInt7130 = 74;
    static final int anInt7131 = 59;
    static final int anInt7132 = 54;
    static final int anInt7133 = 88;
    static final int anInt7134 = 89;
    static final int anInt7135 = 90;
    static final int anInt7136 = 91;
    static final int anInt7137 = 42;
    static final int anInt7140 = 53;
    static final int anInt7141 = 100;
    static final int anInt7146 = 153;
    static final int anInt7147 = 128;
    static final int anInt7148 = 129;
    static final int anInt7149 = 130;
    static final int anInt7150 = 131;
    static final int anInt7151 = 139;
    static final int anInt7152 = 152;
    static final int anInt7153 = 55;
    static final int anInt7154 = 132;
    static final int anInt7155 = 142;
    static final int anInt7156 = 36;
    static final int anInt7157 = 138;
    static final int anInt7159 = 140;
    static final int anInt7160 = 141;
    static final int anInt7161 = 37;
    static final int anInt7162 = 143;
    static final int anInt7163 = 71;
    static final int anInt7164 = 151;
    static final int anInt7166 = 133;
    static final int anInt7167 = 160;
    static final int anInt7168 = 161;
    static final int anInt7169 = 73;

    static final int method8899(Mobile mobile) {
        if (mobile.anInt11540 * 1206344627 == 0) {
            return 0;
        }

        if (-1 != -209575893 * mobile.target) {
            Mobile other = null;
            if (mobile.target * -209575893 < 32768) {
                ObjectNode linkable = Client.npcTable.get(-209575893 * mobile.target);

                if (null != linkable) {
                    other = (Mobile) linkable.referent;
                }
            } else if (mobile.target * -209575893 >= 32768) {
                other = Client.players[mobile.target * -209575893 - 32768];
            }

            if (other != null) {
                Vector3f vector3f = Vector3f.difference(mobile.getCoordinateSpace().translation,
                        other.getCoordinateSpace().translation);
                int x = (int) vector3f.x;
                int z = (int) vector3f.z;

                if (x != 0 || z != 0) {
                    mobile.turn((int) (Math.atan2(x, z) * 2607.5945876176133) & 0x3fff);
                }
            }
        }

        if (mobile instanceof Player) {
            Player player = (Player) mobile;
            if (143575391 * player.nextDirection != -1
                    && (2071858351 * player.pathLength == 0 || player.anInt11513 * 344839627 > 0)) {
                player.turn(143575391 * player.nextDirection);
                player.nextDirection = -1484771999;
            }
        } else if (mobile instanceof Npc) {
            Npc npc = (Npc) mobile;
            if (-1 != 441094363 * npc.anInt11786
                    && (2071858351 * npc.pathLength == 0 || 344839627 * npc.anInt11513 > 0)) {
                Vector3f vector3f = npc.getCoordinateSpace().translation;
                CoordGrid class553 = Client.scene.getBase();
                int dx = (int) vector3f.x
                        - (1251007232 * npc.anInt11786 - class553.x * 1151014144 - class553.x * 1151014144);
                int dz = (int) vector3f.z
                        - (npc.anInt11787 * -1265829632 - 1086487808 * class553.z - class553.z * 1086487808);

                if (dx != 0 || dz != 0) {
                    npc.turn((int) (Math.atan2(dx, dz) * 2607.5945876176133) & 0x3fff);
                }

                npc.anInt11786 = -1454304083;
            }
        }

        return mobile.method18008();
    }

    public abstract void flush();

    public abstract boolean held(int index);

    public abstract KeyRecord getNext();

    public abstract void stop();

}