package com.jagex;

public class Class417 implements Identifiable {
    public static ClanChannel aClass480_Sub33_4650;
    static Class417 aClass417_4646 = new Class417(1);
    static Class417 aClass417_4647 = new Class417(0);
    static Class417 aClass417_4648 = new Class417(2);
    int id;

    Class417(int i) {
        id = 1477438597 * i;
    }

    public static void method6981(String string, boolean bool, int i) {
        if (Client.connectionState * -1501875989 == 8 && !Class628.method13100() && !SkillVarpProvider.method3939()) {
            Class31.accountAuthenticator = string;
            Class31.loginBool = bool;
            Class536.setConnectionState(11);
        }
    }

    public static Class417[] values() {
        return new Class417[]{aClass417_4646, aClass417_4647, aClass417_4648};
    }

    @Override
    public int getId() {
        return id * 1292053581;
    }

}