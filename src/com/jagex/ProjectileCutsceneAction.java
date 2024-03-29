package com.jagex;

public class ProjectileCutsceneAction extends CutsceneAction {
    static final int anInt9615 = 1;
    static final int anInt9624 = 0;

    int anInt9614;
    int anInt9626;
    int anInt9628;
    int graphic;
    int longetivity;
    int originX;
    int originZ;
    int plane;
    int senderIndex;
    int targetIndex;
    int targetX;
    int targetZ;
    int verticalPitch;

    ProjectileCutsceneAction(Buffer buffer, int sent, int targeted) {
        super(buffer);
        if (0 == sent) {
            int origin = buffer.readInt();
            originX = -39567103 * (origin >>> 16);
            originZ = -1557375331 * (origin & 0xffff);
            senderIndex = -289869859;
        } else {
            originX = 39567103;
            originZ = 1557375331;
            senderIndex = buffer.readUShort() * 289869859;
        }

        if (targeted == 0) {
            int target = buffer.readInt();
            targetX = 1652381187 * (target >>> 16);
            targetZ = (target & 0xffff) * -1800078659;
            targetIndex = -630364567;
        } else {
            targetX = -1652381187;
            targetZ = 1800078659;
            targetIndex = buffer.readUShort() * 630364567;
        }

        if (0 == sent && targeted == 0) {
            plane = buffer.readUByte() * -223228861;
        } else {
            plane = 223228861;
        }

        graphic = buffer.readUShort() * -140406657;
        anInt9614 = buffer.readUByte() * -249720641;
        anInt9626 = buffer.readUByte() * 1115465925;
        longetivity = buffer.readUTriByte() * -1427981723;
        verticalPitch = buffer.readUShort() * -656087761;
        anInt9628 = buffer.readUByte() * -950879005;
    }

    @Override
    public void execute() {
        int worldX;
        int worldZ;
        int plane;

        if (originX * -1713586431 >= 0) {
            worldX = originX * -1182924288 + 256;
            worldZ = 256 + originZ * -1983944192;
            plane = this.plane * 443015275;
        } else {
            Mobile mobile = CutsceneMobile.cutsceneMobiles[senderIndex * 722608011].get();
            Vector3f vector3f = mobile.getCoordinateSpace().translation;
            worldX = (int) vector3f.x;
            worldZ = (int) vector3f.z;
            plane = mobile.plane;
        }

        int targetX;
        int targetZ;

        if (originZ * -624631883 >= 0) {
            targetX = 256 + -183937536 * this.targetX;
            targetZ = 256 + this.targetZ * -157210112;
        } else {
            Mobile mobile = CutsceneMobile.cutsceneMobiles[targetIndex * 821655079].get();
            Vector3f vector3f = mobile.getCoordinateSpace().translation;
            targetX = (int) vector3f.x;
            targetZ = (int) vector3f.z;

            if (plane < 0) {
                plane = mobile.plane;
            }
        }

        int initialDisplacement = 1631086795 * anInt9628 << 2;
        Projectile projectile = new Projectile(Client.scene.getGraph(), 967716735 * graphic, plane, plane,
                worldX, worldZ, anInt9614 * 1025367871 << 2, Client.engineCycle, Client.engineCycle + longetivity * 790128493,
                verticalPitch * 804422095, initialDisplacement, 722608011 * senderIndex + 1,
                821655079 * targetIndex + 1, anInt9626 * -1104636403 << 2, false, 0, 0);
        projectile.target(targetX, targetZ, -1104636403 * anInt9626 << 2, Client.engineCycle + 790128493 * longetivity);
        Client.projectiles.pushBack(new CacheableProjectile(projectile));
    }

    @Override
    boolean ready() {
        EffectDefinition graphic = EffectDefinition.loader.get(this.graphic * 967716735);
        boolean loaded = graphic.loaded();
        Animation animation = Animation.loader.get(2053507375 * graphic.animation);
        loaded &= animation.ready();
        return loaded;
    }

}