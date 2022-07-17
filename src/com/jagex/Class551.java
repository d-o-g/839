package com.jagex;

public class Class551 implements Identifiable {
    public static HostNameIdentifier identifier;
    public static FriendsChatPlayer[] friendsChat;
    static Class551 aClass551_7477;
    static Class551 aClass551_7478 = new Class551(0);
    static Class551 aClass551_7479 = new Class551(1);
    static Class551 aClass551_7480;
    static Class551 aClass551_7481;
    static Class551 aClass551_7482;

    static {
        aClass551_7477 = new Class551(2);
        aClass551_7480 = new Class551(3);
        aClass551_7481 = new Class551(4);
        aClass551_7482 = new Class551(5);
    }

    int id;

    Class551(int i) {
        id = -1866722179 * i;
    }

    public static Class551[] values() {
        return new Class551[]{aClass551_7479, aClass551_7478, aClass551_7480, aClass551_7477, aClass551_7481,
                aClass551_7482};
    }

    @Override
    public int getId() {
        return id * -1950022443;
    }

}