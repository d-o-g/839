package com.jagex;

import java.util.Iterator;

public class Effect extends SceneEntity {

    int id;
    int anInt11725 = 0;
    Animator animator;
    int anInt11727 = 0;
    boolean aBool11728 = true;
    ParticleSystem particles;
    int anInt11730 = 0;

    public Effect(SceneGraph sceneGraph, int graphicId, int i_6_, int plane, int collisionPlane, int worldX,
                         int height, int worldZ, int startX, int endX, int startY, int endY, int i_16_, boolean bool, int i_17_) {
        super(sceneGraph, plane, collisionPlane, worldX, height, worldZ, startX, endX, startY, endY, false, (byte) 0);
        id = graphicId * 1008259317;
        anInt11725 = i_16_ * -1776123549;
        anInt11730 = 758058859 * i_17_;
        EffectDefinition graphic = EffectDefinition.loader.get(-1866376355 * graphicId);

        int animation = graphic.animation * 2053507375;
        if (animation != -1) {
            animator = new EntityAnimator(this, false);
            int i_19_ = graphic.aBool7986 ? 0 : 2;
            if (bool) {
                i_19_ = 1;
            }

            animator.method13453(animation, i_6_, i_19_, false);
        }

        method16274(1);
    }

    static final void method916() {
        Iterator iterator = Client.effects.iterator();

        while (iterator.hasNext()) {
            CacheableEffect cacheable = (CacheableEffect) iterator.next();
            Effect animated = cacheable.object;

            if (Client.scene.getGraph() != null && animated.method18211()) {
                Client.scene.getGraph().method8423(animated, true);
            }
        }
    }

    @Override
    public Class498 method16293(Toolkit toolkit) {
        return null;
    }

    @Override
    public int getStartY() {
        return anInt11727 * -977187077;
    }

    public int method18210() {
        return anInt11730 * -1845648061;
    }

    public final boolean method18211() {
        return null != animator && !animator.method13515();
    }

    public final boolean method18212() {
        return null == animator || animator.method13461();
    }

    public final void method18222(int i) {
        if (null != animator && !animator.method13461()) {
            animator.method13465(i);
        }
    }

    public void method18224() {
        if (null != particles) {
            particles.method9484();
        }
    }

    @Override
    boolean method16257(Toolkit toolkit, int i, int i_20_) {
        return false;
    }

    @Override
    boolean isTextured() {
        return false;
    }

    @Override
    boolean isCached() {
        return aBool11728;
    }

    @Override
    final void method16262(Toolkit toolkit, SceneNode class600_sub1, int i, int i_3_, int i_4_, boolean bool,
                           int i_5_) {
        throw new IllegalStateException();
    }

    @Override
    final void method16263() {
        throw new IllegalStateException();
    }

    @Override
    void method16265(Toolkit toolkit) {
        Model model = method18213(toolkit, 0, id * -1866376355);
        if (null != model) {
            method18214(toolkit, model, updateAndGetMatrix());
        }
    }

    @Override
    MouseOverEntity method16271(Toolkit toolkit) {
        Model model = method18213(toolkit, 0x800 | (anInt11725 * 210962507 != 0 ? 5 : 0), -1866376355 * id);
        if (null == model) {
            return null;
        }

        Matrix4x3 class405 = updateAndGetMatrix();
        method18214(toolkit, model, class405);
        MouseOverEntity class506 = MouseOverEntity.method570(false);
        model.method2917(class405, class139Array[0], 0);

        if (particles != null) {
            ParticleEntities particleEntities = particles.method9492();
            toolkit.method2470(particleEntities);
        }

        aBool11728 = model.method2939();
        anInt11727 = model.minimumY() * -668693453;
        model.method3016();
        return class506;
    }

    @Override
    final boolean method16302() {
        return false;
    }

    Model method18213(Toolkit toolkit, int i, int graphicId) {
        EffectDefinition graphic = EffectDefinition.loader.get(graphicId);
        SceneGraphLevel class120 = graph.levels[plane];
        SceneGraphLevel class120_2_ = collisionPlane < 3 ? graph.levels[1 + collisionPlane] : null;
        Vector3f vector3f = getCoordinateSpace().translation;

        return null != animator && !animator.method13461() ? graphic.method10391(toolkit, i, -1740482560
                        * anInt11725, class120, class120_2_, (int) vector3f.x, (int) vector3f.y, (int) vector3f.z,
                animator, (byte) 2) : graphic.method10391(toolkit, i, -1740482560 * anInt11725, class120,
                class120_2_, (int) vector3f.x, (int) vector3f.y, (int) vector3f.z, null, (byte) 2);
    }

    void method18214(Toolkit toolkit, Model model, Matrix4x3 class405) {
        model.method3063(class405);
        Class145[] class145s = model.method2942();
        Class115[] class115s = model.method2943();

        if ((particles == null || particles.stopped) && (null != class145s || class115s != null)) {
            particles = ParticleSystem.create(Client.engineCycle, true);
        }

        if (particles != null) {
            particles.method9488(toolkit, Client.engineCycle, class145s, class115s, false);
            particles.method9485(plane, startX, endX, startY, endY);
        }
    }

}