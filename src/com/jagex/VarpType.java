package com.jagex;

public class VarpType implements Identifiable {

    public static VarpType aClass441_5047 = new VarpType(Js5ConfigGroup.aClass37_479, 9);
    public static VarpType CLAN = new VarpType(Js5ConfigGroup.CLAN_VARIABLES, 6);
    public static VarpType CLAN_SETTING = new VarpType(Js5ConfigGroup.CLAN_SETTING_VARIABLES, 7);
    public static VarpType CLIENT = new ClientVarpType(Js5ConfigGroup.CLIENT_VARIABLES, 2);
    public static VarpType NPC = new NpcVarpType(Js5ConfigGroup.NPC_VARIABLES, 1);
    public static VarpType PLAYER = new PlayerVarpType(Js5ConfigGroup.PLAYER_VARIABLES, 0);
    static VarpType aClass441_5046 = new Class441_Sub1(Js5ConfigGroup.aClass37_522, 8);
    static VarpType aClass441_5048 = new VarpType(Js5ConfigGroup.aClass37_528, 10);
    static VarpType OBJECT = new VarpType(Js5ConfigGroup.OBJECT_VARIABLES, 5);
    static VarpType REGION = new VarpType(Js5ConfigGroup.REGION_VARIABLES, 4);
    static VarpType WORLD = new WorldVarpType(Js5ConfigGroup.WORLD_VARIABLES, 3);
    Js5ConfigGroup config;
    int id;
    VarpType(Js5ConfigGroup config, int id) {
        this.config = config;
        this.id = id * 1178777311;
    }

    public static VarpType[] values() {
        return new VarpType[]{REGION, OBJECT, aClass441_5047, CLIENT, NPC, aClass441_5046, CLAN, aClass441_5048,
                CLAN_SETTING, PLAYER, WORLD};
    }

    public final Js5ConfigGroup getConfig() {
        return config;
    }

    @Override
    public int getId() {
        return id * 1515619615;
    }

    public Object getDefaultValue(Varp parameter) {
        if (parameter.aBool1511) {
            return method7337(parameter);
        }

        return parameter.keyType.method7017();
    }

    Object method7337(Varp parameter) {
        return parameter.keyType.method7017();
    }

}