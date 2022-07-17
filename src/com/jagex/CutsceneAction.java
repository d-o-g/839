package com.jagex;

public abstract class CutsceneAction {

    public static CutsceneAction[] actions;
    public int startTime;

    CutsceneAction(Buffer buffer) {
        startTime = buffer.readUShort() * -547275695;
    }

    static CutsceneAction decode(Buffer buffer) {
        int typeid = buffer.readUByte();
        CutsceneActionType type = CutsceneActionType.valueOf(typeid);
        switch (type.id * 996932537) {
            case 11:
                return new ResetMobCutsceneAction(buffer);
            case 27:
                return new MoveMobCutsceneAction(buffer);
            case 21:
                return new MobWalkCutsceneAction(buffer);
            case 23:
                return new Class166_Sub13(buffer);
            case 5:
                return new AnimateObjectCutsceneAction(buffer);
            case 30:
                return new Class166_Sub15(buffer, true);
            case 0:
                return new Class166_Sub16(buffer);
            case 12:
                return new Class166_Sub19(buffer);
            case 26:
                return new Class166_Sub15(buffer, false);
            case 19:
                return new Class166_Sub17(buffer);
            case 28:
                return new Class166_Sub6(buffer);
            case 29:
                return new AnimateMobCutsceneAction(buffer);
            case 17:
                return new DespawnObjectCutsceneAction(buffer);
            case 13:
                return new ProjectileCutsceneAction(buffer, 1, 1);
            case 9:
                return new Class166_Sub8(buffer);
            default:
                return null;
            case 6:
                return new Class166_Sub3(buffer);
            case 7:
                return new ProjectileCutsceneAction(buffer, 0, 1);
            case 20:
                return new ExecuteScriptCutsceneAction(buffer);
            case 24:
                return new HitMobCutsceneAction(buffer);
            case 1:
                return new TurnMobCutsceneAction(buffer);
            case 10:
                return new Class166_Sub14(buffer);
            case 2:
                return new Class166_Sub20(buffer);
            case 16:
                return new Class166_Sub21(buffer);
            case 3:
                return new ProjectileCutsceneAction(buffer, 0, 0);
            case 25:
                return new MobChatCutsceneAction(buffer);
            case 14:
                return new ProjectileCutsceneAction(buffer, 1, 0);
            case 15:
                return new SpawnAnimatedObjectCutsceneAction(buffer);
            case 22:
                return new SpawnObjectCutsceneAction(buffer);
        }
    }

    static void method3408() {
        Class31.activeConnection.dropFrames();
        Class31.activeConnection.buffer.caret = 0;
        Class31.activeConnection.currentFrame = null;
        Class31.activeConnection.lastFrame = null;
        Class31.activeConnection.secondLastFrame = null;
        Class31.activeConnection.thirdLastFrame = null;
        Class31.activeConnection.currentFrameSize = 0;
        Class31.activeConnection.idleReadPulses = 0;
        Client.anInt10622 = 0;
        Class36.method993();
        AreaSoundVolumeNormaliser.method3849();

        for (int index = 0; index < 2048; index++) {
            Client.players[index] = null;
        }

        Client.localPlayer = null;
        for (int index = 0; index < -999337347 * Client.anInt10862; index++) {
            Mobile mobile = Client.npcs[index].referent;
            if (mobile != null) {
                mobile.target = 953311613;
            }
        }

        Class189.method3752();
        Class637.method13160(FloatRaster.method1728());
        Class536.setConnectionState(16);
        for (int i_6_ = 0; i_6_ < 104; i_6_++) {
            Client.validComponents[i_6_] = true;
        }
        Class530.sendWindowInfo(Class31.activeConnection);
        Class24.aClass587_336 = null;
        Class224.aLong2344 = 0L;
        Class255.method4748();
        Class199.aVarcs_2099.method14038();
    }

    public abstract void execute();

    void method3389() {

    }

    boolean ready() {
        return true;
    }

}