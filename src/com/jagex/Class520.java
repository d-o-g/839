package com.jagex;

public class Class520 implements Identifiable {
    public static Class520 aClass520_7171;
    public static Class520 aClass520_7172;
    public static Class520 aClass520_7173;
    public static Class520 aClass520_7174;
    public static Class520 aClass520_7175;
    public static Class520 aClass520_7176;
    public static Class520 aClass520_7177;
    public static Class520 aClass520_7178;
    public static Class520 aClass520_7179;
    public static Class520 aClass520_7180;
    public static Class520 aClass520_7181;
    public static Class520 aClass520_7183 = new Class520("", 10, new KeyType[]{KeyType.aClass422_4719},
            null);
    public static Class520 aClass520_7184;
    public static Class520 npcType;
    public static Class520 playerType;
    public static Class520 aClass520_7187;
    public static Class520 aClass520_7188;
    public static Class520 aClass520_7189;
    public static Class520 aClass520_7190;
    static Class520 aClass520_7182;
    static Class520 aClass520_7191;
    static Class520 aClass520_7192;

    static {
        aClass520_7179 = new Class520("", 11, new KeyType[]{KeyType.aClass422_4719}, null);
        aClass520_7173 = new Class520("", 12, new KeyType[]{KeyType.aClass422_4719}, null);
        aClass520_7177 = new Class520("", 13, new KeyType[]{KeyType.aClass422_4719}, null);
        aClass520_7190 = new Class520("", 14, new KeyType[]{KeyType.aClass422_4719}, null);
        aClass520_7176 = new Class520("", 15, new KeyType[]{KeyType.aClass422_4719,
                KeyType.I_LOWER, KeyType.I_LOWER}, null);
        aClass520_7172 = new Class520("", 16, new KeyType[]{KeyType.aClass422_4719,
                KeyType.I_LOWER, KeyType.I_LOWER}, null);
        aClass520_7178 = new Class520("", 17, new KeyType[]{KeyType.aClass422_4719,
                KeyType.I_LOWER, KeyType.I_LOWER}, null);
        aClass520_7182 = new Class520("", 18);
        aClass520_7181 = new Class520("", 19);
        aClass520_7171 = new Class520("", 20, new KeyType[]{KeyType.S_LOWER, KeyType.I_LOWER},
                null);
        aClass520_7174 = new Class520("", 21);
        aClass520_7175 = new Class520("", 22);
        aClass520_7184 = new Class520("", 23, new KeyType[]{KeyType.P_LOWER}, null);
        npcType = new Class520("", 24);
        playerType = new Class520("", 25);
        aClass520_7187 = new Class520("", 26);
        aClass520_7188 = new Class520("", 27);
        aClass520_7189 = new Class520("", 28);
        aClass520_7180 = new Class520_Sub1("", 29, true, false);
        aClass520_7191 = new Class520("", 73, true, true);
        aClass520_7192 = new Class520("", 76, true, false);
    }

    public int id;

    Class520(String string, int i) {
        this(string, i, false, null, false, null);
    }

    Class520(String string, int i, boolean bool, boolean bool_1_) {
        this(string, i, bool, null, bool_1_, null);
    }

    Class520(String string, int i, boolean bool, KeyType[] class422s, boolean bool_3_,
             KeyType[] class422s_4_) {
        id = i * 75301955;
    }

    Class520(String string, int i, KeyType[] class422s, KeyType[] class422s_0_) {
        this(string, i, class422s != null, class422s, null != class422s_0_, class422s_0_);
    }

    @Override
    public int getId() {
        return -1817417621 * id;
    }

}