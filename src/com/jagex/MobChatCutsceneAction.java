package com.jagex;

public class MobChatCutsceneAction extends CutsceneAction {
    public static ClanSettings aClass288_9645;
    public static Sprite aClass116_9646;
    int colour;
    String message;
    int index;
    int duration;
    MobChatCutsceneAction(Buffer buffer) {
        super(buffer);
        index = buffer.readUShort() * -549855097;
        message = buffer.readString();
        colour = buffer.readInt() * 2081763391;
        duration = buffer.readUShort() * -1818347887;
    }

    static long getObjectUid(SceneObject object, int regionX, int regionY) {
        long idk1 = 4194304L;
        long idk2 = -9223372036854775808L;
        ObjectDefinition definition = Client.scene.getObjectLoader().get(object.getId());
        long hash = regionX | regionY << 7 | object.getType() << 14 | object.getOrientation() << 20 | 0x40000000;

        if (-1893691057 * definition.type == 0) {
            hash |= idk2;
        }

        if (1 == definition.itemSupport * 36878635) {
            hash |= idk1;
        }

        return hash | (long) object.getId() << 32;
    }

    @Override
    public void execute() {
        CutsceneMobile.cutsceneMobiles[index * 1535698231].get()
                .setMessage(message, colour * -1773224001, 0, duration * -14398863);
    }

}