package com.jagex;

public class Js5ConfigGroup {

    public static Js5ConfigGroup aClass37_469 = new Js5ConfigGroup(9, 7);
    public static Js5ConfigGroup ANIMATIONS = new Js5ConfigGroup(12, 7);
    public static Js5ConfigGroup PLAYER_VARIABLES = new Js5ConfigGroup(60);
    public static Js5ConfigGroup CLAN_SETTING_VARIABLES = new Js5ConfigGroup(67);
    public static Js5ConfigGroup aClass37_479 = new Js5ConfigGroup(80);
    public static Js5ConfigGroup aClass37_491 = new Js5ConfigGroup(31);
    public static Js5ConfigGroup aClass37_492 = new Js5ConfigGroup(32);
    public static Js5ConfigGroup WORLD_MAP_INFO = new Js5ConfigGroup(36);
    public static Js5ConfigGroup CLIENT_VARIABLES = new Js5ConfigGroup(62);
    public static Js5ConfigGroup aClass37_514 = new Js5ConfigGroup(26, 5);
    public static Js5ConfigGroup INVENTORIES = new Js5ConfigGroup(5);
    public static Js5ConfigGroup WORLD_VARIABLES = new Js5ConfigGroup(63);
    public static Js5ConfigGroup REGION_VARIABLES = new Js5ConfigGroup(64);
    public static Js5ConfigGroup CLAN_VARIABLES = new Js5ConfigGroup(66);
    public static Js5ConfigGroup GRAPHICS = new Js5ConfigGroup(13, 8);
    public static Js5ConfigGroup aClass37_522 = new Js5ConfigGroup(68);
    public static Js5ConfigGroup VARIABLE_BITS = new Js5ConfigGroup(69);
    public static Js5ConfigGroup aClass37_528 = new Js5ConfigGroup(75);
    public static Js5ConfigGroup NPC_VARIABLES = new Js5ConfigGroup(61);
    public static Js5ConfigGroup aClass37_530 = new Js5ConfigGroup(77);
    public static Js5ConfigGroup OBJECT_VARIABLES = new Js5ConfigGroup(65);
    public static Js5ConfigGroup CURSORS = new Js5ConfigGroup(33);
    public static Js5ConfigGroup ENUMERATIONS = new Js5ConfigGroup(8, 8);
    public static Js5ConfigGroup HITBARS = new Js5ConfigGroup(72);
    public static Js5ConfigGroup HITSPLATS = new Js5ConfigGroup(46);
    public static Js5ConfigGroup IDENTIKITS = new Js5ConfigGroup(3);
    public static Js5ConfigGroup ITEMS = new Js5ConfigGroup(10, 8);
    public static Js5ConfigGroup MAP_SCENES = new Js5ConfigGroup(34);
    public static Js5ConfigGroup OBJECTS = new Js5ConfigGroup(6, 8);
    public static Js5ConfigGroup OVERLAYS = new Js5ConfigGroup(4);
    public static Js5ConfigGroup PARAMETERS = new Js5ConfigGroup(11);
    public static Js5ConfigGroup QUESTS = new Js5ConfigGroup(35);
    public static Js5ConfigGroup SKYBOXES = new Js5ConfigGroup(29);
    public static Js5ConfigGroup SUNS = new Js5ConfigGroup(30);
    public static Js5ConfigGroup UNDERLAYS = new Js5ConfigGroup(1);
    static Js5ConfigGroup aClass37_461 = new Js5ConfigGroup(76);
    static Js5ConfigGroup aClass37_462 = new Js5ConfigGroup(2);
    static Js5ConfigGroup aClass37_465 = new Js5ConfigGroup(70);
    static Js5ConfigGroup aClass37_467 = new Js5ConfigGroup(18);
    static Js5ConfigGroup aClass37_473 = new Js5ConfigGroup(82);
    static Js5ConfigGroup aClass37_474 = new Js5ConfigGroup(14, 10);
    static Js5ConfigGroup aClass37_476 = new Js5ConfigGroup(16);
    static Js5ConfigGroup aClass37_478 = new Js5ConfigGroup(37);
    static Js5ConfigGroup aClass37_480 = new Js5ConfigGroup(20);
    static Js5ConfigGroup aClass37_481 = new Js5ConfigGroup(39);
    static Js5ConfigGroup aClass37_482 = new Js5ConfigGroup(53);
    static Js5ConfigGroup aClass37_483 = new Js5ConfigGroup(23);
    static Js5ConfigGroup aClass37_484 = new Js5ConfigGroup(24);
    static Js5ConfigGroup aClass37_485 = new Js5ConfigGroup(25);
    static Js5ConfigGroup aClass37_486 = new Js5ConfigGroup(44);
    static Js5ConfigGroup aClass37_487 = new Js5ConfigGroup(27);
    static Js5ConfigGroup aClass37_488 = new Js5ConfigGroup(28);
    static Js5ConfigGroup aClass37_497 = new Js5ConfigGroup(54);
    static Js5ConfigGroup aClass37_498 = new Js5ConfigGroup(38);
    static Js5ConfigGroup aClass37_500 = new Js5ConfigGroup(40);
    static Js5ConfigGroup aClass37_502 = new Js5ConfigGroup(42);
    static Js5ConfigGroup aClass37_503 = new Js5ConfigGroup(43);
    static Js5ConfigGroup aClass37_504 = new Js5ConfigGroup(17);
    static Js5ConfigGroup aClass37_505 = new Js5ConfigGroup(45);
    static Js5ConfigGroup aClass37_507 = new Js5ConfigGroup(78);
    static Js5ConfigGroup aClass37_508 = new Js5ConfigGroup(22);
    static Js5ConfigGroup aClass37_509 = new Js5ConfigGroup(49);
    static Js5ConfigGroup aClass37_510 = new Js5ConfigGroup(50);
    static Js5ConfigGroup aClass37_511 = new Js5ConfigGroup(51);
    static Js5ConfigGroup aClass37_513 = new Js5ConfigGroup(47);
    static Js5ConfigGroup aClass37_517 = new Js5ConfigGroup(41);
    static Js5ConfigGroup aClass37_519 = new Js5ConfigGroup(48);
    static Js5ConfigGroup aClass37_524 = new Js5ConfigGroup(7);
    static Js5ConfigGroup aClass37_526 = new Js5ConfigGroup(73);
    static Js5ConfigGroup aClass37_527 = new Js5ConfigGroup(74);
    static Js5ConfigGroup aClass37_531 = new Js5ConfigGroup(15);
    static Js5ConfigGroup aClass37_532 = new Js5ConfigGroup(79);
    static Js5ConfigGroup aClass37_533 = new Js5ConfigGroup(21);
    static Js5ConfigGroup aClass37_534 = new Js5ConfigGroup(81);
    static Js5ConfigGroup aClass37_535 = new Js5ConfigGroup(19);
    public int entry;
    int size;

    Js5ConfigGroup(int entry) {
        this(entry, 0);
    }
    Js5ConfigGroup(int entry, int shift) {
        this.entry = 1149718113 * entry;
        size = shift * -1788832647;
    }

    public static int method1003() {
        synchronized (PlayerAppearance.aClass168_7723) {
            return PlayerAppearance.aClass168_7723.hardCount();
        }
    }

    public static void method1004(int i) {
        if (i < 1) {
            Class495_Sub1.anInt10334 = Class495_Sub1.anInt10325 * 205337113;
        } else {
            Class495_Sub1.anInt10334 = i * 2118464807;
        }
    }

    static byte[] get(Archive archive, Js5ConfigGroup entry, int id) {
        if (entry.getTypeSize() > 1) {
            return archive.get(entry.getType(id), entry.getFile(id));
        }

        return archive.get(1179768225 * entry.entry, id);
    }

    public int getFile(int i) {
        return i & (1 << 1820956105 * size) - 1;
    }

    public int getType(int i) {
        return i >>> size * 1820956105;
    }

    public int getTypeSize() {
        return 1 << size * 1820956105;
    }

}