package com.jagex;

public class Class660 {
    Class660() throws Throwable {
        throw new Error();
    }

    static final void method13656(ScriptExecutionContext class613) {
        class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.desiredToolkit
                .method16484() ? 1 : 0;
    }

    static final void method13657() {
        CoordGrid class553 = Client.scene.getBase();
        Vector3f vector3f = Client.camera.getPosition();
        Client.cameraX = -224503671 * ((int) vector3f.x - (2051316501 * class553.x << 9));
        Class268.cameraY = -1128143643 * -(int) vector3f.y;
        Client.cameraZ = ((int) vector3f.z - (class553.y * -180305283 << 9)) * -187933039;
        Class155.cameraPitch = ((int) (Client.camera.getPitch((byte) 1) * 2607.5945876176133) & 0x3fff) * -1300105055;
        Class550.cameraYaw = ((int) (Client.camera.getYaw() * 2607.5945876176133) & 0x3fff) * -1726145155;
        IncomingFrameMeta.anInt4473 = 0;
    }

    static void method13658(ScriptExecutionContext class613) {
        class613.anIntArray7942[class613.anInt7924 * 1841827045 - 1] = QuestDefinition.loader
                .get(class613.anIntArray7942[1841827045 * class613.anInt7924 - 1]).requiredQuestPoints * 2106198419;
    }
}
