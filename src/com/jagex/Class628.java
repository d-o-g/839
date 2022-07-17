package com.jagex;

public class Class628 {
    public static int anInt8049;
    int anInt8045;
    int type;
    CoordGrid aClass553_8047;

    public Class628(CoordGrid class553, int i, int i_3_, int i_4_) {
        aClass553_8047 = class553;
        type = i * -1808415931;
        anInt8045 = i_4_ * 1004546277;
    }

    public static World method13097(int i) {
        return Class166_Sub19.method15132(-1113605561 * Class671.activeConnectionInfo.id);
    }

    public static final boolean method13100() {
        return -1087837371 * Class31.loginState != 3;
    }

    static final void method13096(ScriptExecutionContext class613, byte i) {
        class613.anInt7924 -= -926911801;
        Client.publicChatMode = -834397995 * class613.anIntArray7942[class613.anInt7924 * 1841827045];
        SceneGraphTile.aClass655_6685 = Class655.valueOf(class613.anIntArray7942[1 + 1841827045 * class613.anInt7924]);
        if (null == SceneGraphTile.aClass655_6685) {
            SceneGraphTile.aClass655_6685 = Class655.aClass655_8245;
        }
        Client.anInt10863 = class613.anIntArray7942[1841827045 * class613.anInt7924 + 2] * 1692699105;
        BufferedConnectionContext class83 = Client.getActiveConnection();
        OutgoingFrame class480_sub15 = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_4002, class83.encryptor);
        class480_sub15.payload.writeByte(2041602173 * Client.publicChatMode);
        class480_sub15.payload.writeByte(SceneGraphTile.aClass655_6685.anInt8247 * -1219686185);
        class480_sub15.payload.writeByte(829782561 * Client.anInt10863);
        class83.sendFrame(class480_sub15);
    }

    static final void method13098(ScriptExecutionContext class613, byte i) {
        int i_5_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
        ItemDefinition itemDefinition = ItemDefinition.loader.get(i_5_);
        class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 1795791411 * itemDefinition.anInt8321;
    }

    static void method13099(String string) {
        Client.settings = string;
        if (Class255.method4749() != Class465.aClass465_5274) {
            try {
                String string_6_ = Class454.applet.getParameter(ClientParameter.aClass385_4267.name);
                String string_7_ = Class454.applet.getParameter(ClientParameter.aClass385_4272.name);
                String string_8_ = new StringBuilder().append(string_6_).append("settings=").append(string)
                        .append("; version=1; path=/; domain=").append(string_7_).toString();
                if (string.length() == 0) {
                    string_8_ = new StringBuilder().append(string_8_)
                            .append("; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0").toString();
                } else {
                    string_8_ = new StringBuilder().append(string_8_).append("; Expires=")
                            .append(Client.method15279(TimeUtil.time() + 94608000000L)).append("; Max-Age=")
                            .append(94608000L).toString();
                }
                JavascriptUtils.eval(Class454.applet, new StringBuilder().append("document.cookie=\"")
                        .append(string_8_).append("\"").toString());
            } catch (Throwable throwable) {

            }
        }
    }

    public SceneObject method13090(int i) {
        SceneObject interface55 = method13091(2117969971);
        if (interface55 == null) {
            return null;
        }
        if (interface55.getId() != anInt8045 * -1377610515) {
            return null;
        }
        return interface55;
    }

    SceneObject method13091(int i) {
        int i_0_ = 394202151 * aClass553_8047.level;
        CoordGrid class553 = Client.scene.getBase();
        int i_1_ = aClass553_8047.x * 2051316501 - class553.x * 2051316501;
        int i_2_ = aClass553_8047.y * -180305283 - -180305283 * class553.y;
        if (i_1_ < 0 || i_2_ < 0 || i_1_ >= Client.scene.getMapWidth()
                || i_2_ >= Client.scene.getMapLength() || Client.scene.getGraph() == null) {
            return null;
        }
        switch (getGroup()) {
            case 3:
                return (SceneObject) Client.scene.getGraph().getTileDecoration(i_0_, i_1_, i_2_);
            default:
                return null;
            case 0:
                return (SceneObject) Client.scene.getGraph().getBoundary(i_0_, i_1_, i_2_);
            case 2:
                return (SceneObject) Client.scene.getGraph().getEntity(i_0_, i_1_, i_2_,
                        Client.anSceneEntityPredicate_10904);
            case 1:
                return (SceneObject) Client.scene.getGraph().getBoundaryDecoration(i_0_, i_1_, i_2_);
        }
    }

    int getGroup() {
        return Client.OBJECT_GROUPS[type * 702240653];
    }

}