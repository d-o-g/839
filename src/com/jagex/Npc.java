package com.jagex;

public class Npc extends Mobile {
    public static int anInt11790;
    public static int anInt11796 = 496476511;
    public static VarDefinitionLoader varpLoader;

    static {
        anInt11790 = -1667568083;
    }

    public int combat;
    public int anInt11786 = -1454304083;
    public int anInt11787 = 28936887;
    public Class267 aClass267_11788;
    public String name;
    public Class265 aClass265_11793;
    public NpcDefinition definition;
    public int anInt11800;
    public int anInt11801 = 1977066073;
    int anInt11791;
    int[] anIntArray11792;
    int[] anIntArray11795;
    int anInt11797;
    int anInt11798;
    int anInt11799;

    public Npc(SceneGraph sceneGraph) {
        super(sceneGraph, Npc.varpLoader);
        anIntArray11795 = new int[6];
        anIntArray11792 = new int[6];
        method18305();
    }

    public Npc(SceneGraph sceneGraph, int i) {
        super(sceneGraph, i, Npc.varpLoader);
        anIntArray11795 = new int[6];
        anIntArray11792 = new int[6];
        method18305();
    }

    static final void method750() {
        for (int i = 0; i < 1746328619 * Client.npcCount; i++) {
            int index = Client.npcIndices[i];
            ObjectNode<Npc> linkable = Client.npcTable.get(index);
            if (linkable != null) {
                Npc npc = linkable.referent;
                TranslatableString.method559(npc, false);
            }
        }
    }

    static final void method10244() {
        BitBuffer buffer = Client.gameConnection.buffer;
        buffer.disableBitAccess();
        int count = buffer.readBits(8);

        if (count < 1746328619 * Client.npcCount) {
            for (int index = count; index < 1746328619 * Client.npcCount; index++) {
                Client.removedNpcIndices[(Client.removedNpcCount += 2055574789) * -1916211251 - 1] = Client.npcIndices[index];
            }
        }

        if (count > 1746328619 * Client.npcCount) {
            throw new RuntimeException();
        }

        Client.npcCount = 0;
        for (int i = 0; i < count; i++) {
            int index = Client.npcIndices[i];
            Npc npc = (Npc) Client.npcTable.get(index).referent;

            int moved = buffer.readBits(1);
            if (moved == 0) {
                Client.npcIndices[(Client.npcCount += 541000323) * 1746328619 - 1] = index;
                npc.lastUpdate = Client.anInt10660 * 840355919;
            } else {
                int type = buffer.readBits(2);

                if (0 == type) {
                    Client.npcIndices[(Client.npcCount += 541000323) * 1746328619 - 1] = index;
                    npc.lastUpdate = 840355919 * Client.anInt10660;
                    Client.anIntArray10659[(Client.anInt10914 += 2038945077) * 1947309341 - 1] = index;
                } else if (type == 1) {
                    Client.npcIndices[(Client.npcCount += 541000323) * 1746328619 - 1] = index;
                    npc.lastUpdate = Client.anInt10660 * 840355919;
                    NpcDirection direction = CompressionType.findIdentifiable(NpcDirection.values(),
                            buffer.readBits(3));
                    npc.move(direction, MovementType.WALKING.id);

                    int maskUpdate = buffer.readBits(1);
                    if (maskUpdate == 1) {
                        Client.anIntArray10659[(Client.anInt10914 += 2038945077) * 1947309341 - 1] = index;
                    }
                } else if (2 == type) {
                    Client.npcIndices[(Client.npcCount += 541000323) * 1746328619 - 1] = index;
                    npc.lastUpdate = Client.anInt10660 * 840355919;

                    if (buffer.readBits(1) == 1) {
                        NpcDirection first = CompressionType.findIdentifiable(NpcDirection.values(),
                                buffer.readBits(3));
                        npc.move(first, MovementType.RUNNING.id);

                        NpcDirection second = CompressionType.findIdentifiable(NpcDirection.values(),
                                buffer.readBits(3));
                        npc.move(second, MovementType.RUNNING.id);
                    } else {
                        NpcDirection direction = CompressionType.findIdentifiable(NpcDirection.values(),
                                buffer.readBits(3));
                        npc.move(direction, MovementType.TELEPORTING.id);
                    }

                    int i_14_ = buffer.readBits(1);
                    if (1 == i_14_) {
                        Client.anIntArray10659[(Client.anInt10914 += 2038945077) * 1947309341 - 1] = index;
                    }
                } else if (type == 3) {
                    Client.removedNpcIndices[(Client.removedNpcCount += 2055574789) * -1916211251 - 1] = index;
                }
            }
        }
    }

    @Override
    public Vector4i method140() {
        CoordGrid class553 = Client.scene.getBase();
        return Vector4i.create(plane, (int) getCoordinateSpace().translation.x + -1992939008 * class553.x,
                -(int) getCoordinateSpace().translation.y, (int) getCoordinateSpace().translation.z + -2121991680 * class553.z);
    }

    @Override
    public Quaternion method142() {
        Quaternion quaternion = Quaternion.cached();
        quaternion.method6413(Class373.method6114(2069603133 * yaw.value), 0.0F, 0.0F);
        return quaternion;
    }

    @Override
    public Vector3f method143() {
        return Vector3f.empty();
    }

    @Override
    public CharacterType getType() {
        return CharacterType.NPC;
    }

    @Override
    public Class498 method16293(Toolkit toolkit) {
        return null;
    }

    @Override
    public boolean method16296() {
        return !(null != definition.morphisms && definition.morph(PlayerFacade.instance,
                PlayerFacade.instance) == null);
    }

    @Override
    public int method16307() {
        if (null != definition.morphisms) {
            NpcDefinition npcDefinition = definition.morph(PlayerFacade.instance,
                    PlayerFacade.instance);
            if (npcDefinition != null && -56434629 * npcDefinition.height != -1) {
                return -56434629 * npcDefinition.height;
            }
        }
        return -56434629 * definition.height != -1 ? -56434629 * definition.height : super.method16307();
    }

    @Override
    public int getArmyIcon() {
        if (definition.morphisms != null) {
            NpcDefinition definition = this.definition.morph(PlayerFacade.instance,
                    PlayerFacade.instance);
            if (null != definition && definition.armyIcon * -1093029493 != -1) {
                return -1093029493 * definition.armyIcon;
            }
        }

        return definition.armyIcon * -1093029493;
    }

    @Override
    public boolean canMessage() {
        return Client.playerDefaults.npcMessagesEnabled;
    }

    @Override
    public OverheadMessage getMessage() {
        if (null != message && message.text == null) {
            return null;
        }
        return message;
    }

    @Override
    public int method17969() {
        return 1 + index * 387935885;
    }

    public void method18269() {
        anInt11535 = 418603325;
        anInt11534 = -939090807 * Client.engineCycle;
    }

    public void setDefinition(NpcDefinition definition) {
        method18271(definition, true, true, true);
    }

    public void method18271(NpcDefinition definition, boolean updateName, boolean updateCombat, boolean bool_1_) {
        if (definition != this.definition && Class56.menuOpen && Class220.method4154(387935885 * index)) {
            HitbarDefinition.method8950();
        }

        this.definition = definition;
        if (definition != null) {
            if (updateName) {
                name = definition.name;
            }
            if (updateCombat) {
                combat = definition.combat * 1050562515;
            }
            if (bool_1_) {
                aClass265_11793 = null;
            }
        }

        if (aClass564_11552 != null) {
            aClass564_11552.method9482();
        }
    }

    public void method18273(int i, int i_8_, int i_9_, int i_10_) {
        anIntArray11795[i] = i_8_;
        anIntArray11792[i] = i_9_;
    }

    public final boolean hasDefinition() {
        return definition != null;
    }

    public int method18277(int i) {
        return anIntArray11792[i];
    }

    public void setMessage(String string, int i, int i_19_) {
        int duration = EntityQueue.getFps() * -298725127 * Client.playerDefaults.npcMessageDuration;
        setMessage(string, i, i_19_, duration);
    }

    public void move(int x, int z, int plane, boolean stopMoving, int size) {
        this.plane = collisionPlane = (byte) plane;
        if (Client.scene.method7775().isBridge(x, z)) {
            collisionPlane++;
        }

        if (animator.hasAnimation() && animator.getAnimation().walkingPrecedence * 1425418197 == 1) {
            anIntArray11538 = null;
            animator.update(-1);
        }

        for (int index = 0; index < effects.length; index++) {
            if (-2008549027 * effects[index].id != -1) {
                EffectDefinition graphic = EffectDefinition.loader.get(-2008549027
                        * effects[index].id);
                if (graphic.aBool7986
                        && graphic.animation * 2053507375 != -1
                        && Animation.loader.get(graphic.animation * 2053507375).walkingPrecedence * 1425418197 == 1) {
                    effects[index].animator.update(-1);
                    effects[index].id = 738188555;
                }
            }
        }
        if (!stopMoving) {
            int dx = x - pathX[0];
            int dz = z - pathZ[0];
            if (dx >= -8 && dx <= 8 && dz >= -8 && dz <= 8) {
                if (pathLength * 2071858351 < pathX.length - 1) {
                    pathLength += -379008433;
                }

                for (int index = 2071858351 * pathLength; index > 0; index--) {
                    pathX[index] = pathX[index - 1];
                    pathZ[index] = pathZ[index - 1];
                    pathSpeed[index] = pathSpeed[index - 1];
                }

                pathX[0] = x;
                pathZ[0] = z;
                pathSpeed[0] = MovementType.WALKING.id;
                return;
            }
        }

        pathLength = 0;
        anInt11550 = 0;
        anInt11513 = 0;
        pathX[0] = x;
        pathZ[0] = z;
        Vector3f vector3f = Vector3f.copyOf(getCoordinateSpace().translation);
        vector3f.x = (pathX[0] << 9) + (size << 8);
        vector3f.z = (size << 8) + (pathZ[0] << 9);
        setPosition(vector3f);
        vector3f.cache();

        if (aClass564_11552 != null) {
            aClass564_11552.method9482();
        }
    }

    public int method18280(int i) {
        return anIntArray11795[i];
    }

    public final void move(NpcDirection direction, int speed) {
        int x = pathX[0];
        int z = pathZ[0];

        switch (direction) {
            case NORTH_WEST:
                x--;
                z++;
                break;
            case WEST:
                x--;
                break;
            case NORTH:
                z++;
                break;
            case SOUTH_EAST:
                x++;
                z--;
                break;
            case SOUTH:
                z--;
                break;
            case NORTH_EAST:
                x++;
                z++;
                break;
            case SOUTH_WEST:
                x--;
                z--;
                break;
            case EAST:
                x++;
                break;
        }

        if (animator.hasAnimation() && animator.getAnimation().walkingPrecedence * 1425418197 == 1) {
            anIntArray11538 = null;
            animator.update(-1);
        }

        for (int i_34_ = 0; i_34_ < effects.length; i_34_++) {
            if (-2008549027 * effects[i_34_].id != -1) {
                EffectDefinition graphic = EffectDefinition.loader.get(-2008549027
                        * effects[i_34_].id);
                if (graphic.aBool7986
                        && -1 != 2053507375 * graphic.animation
                        && Animation.loader.get(2053507375 * graphic.animation).walkingPrecedence * 1425418197 == 1) {
                    effects[i_34_].animator.update(-1);
                    effects[i_34_].id = 738188555;
                }
            }
        }

        if (pathLength * 2071858351 < pathX.length - 1) {
            pathLength += -379008433;
        }

        for (int index = pathLength * 2071858351; index > 0; index--) {
            pathX[index] = pathX[index - 1];
            pathZ[index] = pathZ[index - 1];
            pathSpeed[index] = pathSpeed[index - 1];
        }

        pathX[0] = x;
        pathZ[0] = z;
        pathSpeed[0] = (byte) speed;
    }

    @Override
    public int getIndex() {
        return 387935885 * index;
    }

    @Override
    public int method48() {
        return 387935885 * index;
    }

    @Override
    boolean method16257(Toolkit toolki, int i, int i_11_) {
        if (definition == null) {
            return false;
        }
        if (null != definition.aClass379_3043) {
            return toolki.method2445(i, i_11_, updateAndGetMatrix(), definition.aClass379_3043);
        }
        if (!method18272(toolki, 131072)) {
            return false;
        }
        Matrix4x3 class405 = updateAndGetMatrix();
        boolean bool = false;
        for (int i_13_ = 0; i_13_ < cachedModels.length; i_13_++) {
            if (cachedModels[i_13_] != null && cachedModels[i_13_].aBool1751) {
                boolean bool_14_;
                while_42_:
                do {
                    do {
                        if (definition.anInt3081 * 300010577 <= 0) {
                            if (-1 == 104991589 * definition.anInt3073) {
                                if (1 != 2117527163 * definition.boundSize) {
                                    break;
                                }
                            } else if (104991589 * definition.anInt3073 != 1) {
                                break;
                            }
                        }
                        bool_14_ = true;
                        break while_42_;
                    } while (false);
                    bool_14_ = false;
                } while (false);
                boolean bool_15_ = bool_14_;
                boolean bool_16_ = cachedModels[i_13_].method2918(i, i_11_, class405, bool_15_,
                        300010577 * definition.anInt3081);
                if (bool_16_) {
                    bool = true;
                    break;
                }
            }
        }
        for (int i_17_ = 0; i_17_ < cachedModels.length; i_17_++) {
            cachedModels[i_17_] = null;
        }
        return bool;
    }

    @Override
    int itemAndNpcDefRelated() {
        if (null == definition) {
            return 0;
        }
        return 300010577 * definition.anInt3081;
    }

    @Override
    final void method16262(Toolkit toolkit, SceneNode class600_sub1, int i, int i_44_, int i_45_, boolean bool,
                           int i_46_) {
        throw new IllegalStateException();
    }

    @Override
    final void method16263() {
        throw new IllegalStateException();
    }

    @Override
    void method16265(Toolkit toolkit) {
        if (null != definition && (aBool11504 || method18272(toolkit, 0))) {
            Matrix4x3 class405 = toolkit.getMatrix4x3();
            class405.copyFrom(updateAndGetMatrix());
            class405.method6744(0.0F, -5.0F, 0.0F);
            method17948(toolkit, cachedModels, class405, aBool11504);

            for (int i_43_ = 0; i_43_ < cachedModels.length; i_43_++) {
                cachedModels[i_43_] = null;
            }
        }
    }

    @Override
    MouseOverEntity method16271(Toolkit toolkit) {
        if (definition == null || !method18272(toolkit, 526336)) {
            return null;
        }

        Matrix4x3 class405 = updateAndGetMatrix();
        CoordinateSpace pos = getCoordinateSpace();
        Matrix4x3 class405_36_ = toolkit.getMatrix4x3();

        int i_37_ = yaw.value();
        SceneGraphTile tile = graph.tiles[plane][(int) pos.translation.x >> 9][(int) pos.translation.z >> 9];
        if (tile != null && null != tile.decoration) {
            int i_38_ = anInt11506 * -635471227 - tile.decoration.aShort11466;
            anInt11506 = 1195863629 * (int) (anInt11506 * -635471227 - i_38_ / 10.0F);
        } else {
            anInt11506 = (int) (-635471227 * anInt11506 - -635471227 * anInt11506 / 10.0F) * 1195863629;
        }

        class405_36_.copyFrom(class405);
        class405_36_.method6744(0.0F, -20 - -635471227 * anInt11506, 0.0F);
        Class515 class515 = method17958();
        NpcDefinition dfinition = definition.morphisms != null ? definition.morph(
                PlayerFacade.instance, PlayerFacade.instance) : definition;
        boolean bool = null != dfinition.aClass379_3043;
        aBool11554 = false;
        MouseOverEntity class506 = null;
        if (Class199.preferences.mobShadows.getValue() == 1 && dfinition.animateIdle && class515.aBool7015) {
            Animator animator = this.animator.hasAnimation() && this.animator.method13515() ? this.animator
                    : null;
            Animator_Sub2 class650_sub2 = aClass650_Sub2_11525.hasAnimation()
                    && (!aClass650_Sub2_11525.aBool10566 || null == animator) ? aClass650_Sub2_11525 : null;
            short i_39_ = Client.playerDefaults.aShort7598;
            byte i_40_ = Client.playerDefaults.aByte7610;
            if (definition.aShort3059 > -1) {
                i_39_ = definition.aShort3059;
                i_40_ = definition.aByte3060;
            }
            Model model;
            if (i_39_ > -1 && Class199.preferences.textures.getValue() == 1) {
                model = Class31.getTexturedMobModel(toolkit, i_37_, anInt11507 * -170688293, anInt11551 * 1861793885,
                        anInt11505 * 2119207177, cachedModels[0], i_39_, i_40_,
                        null != class650_sub2 ? class650_sub2 : animator, 1895096767);
            } else {
                model = MouseOverEntities.getMobModel(toolkit, i_37_, -170688293 * anInt11507, 1861793885 * anInt11551,
                        anInt11505 * 2119207177, definition.boundSize * 2117527163, cachedModels[0],
                        definition.aShort3055 & 0xffff, definition.aShort3067 & 0xffff, definition.aByte3024 & 0xff,
                        definition.aByte3058 & 0xff, null != class650_sub2 ? class650_sub2 : animator);
            }
            if (model != null) {
                class506 = MouseOverEntity.method570(method18275(408991959));
                aBool11554 = true;
                toolkit.method2473(false);
                if (bool) {
                    model.method2917(class405_36_, null, 0);
                } else {
                    if (null == class139Array || class139Array.length < 1 + cachedModels.length) {
                        method16274(1 + cachedModels.length);
                    }
                    model.method2917(class405_36_, class139Array[cachedModels.length], 0);
                }
                toolkit.method2473(true);
            }
        }
        if (bool) {
            if (null == class139Array || class139Array.length > 1) {
                method16274(1);
            }
            toolkit.method2447(class405_36_, class139Array[0], dfinition.aClass379_3043);
        } else if (class139Array == null || class139Array.length < cachedModels.length) {
            method16274(cachedModels.length);
        }
        if (null == class506) {
            class506 = MouseOverEntity.method570(method18275(-1246690340));
        }
        method17948(toolkit, cachedModels, class405_36_, false);
        for (int i_41_ = 0; i_41_ < cachedModels.length; i_41_++) {
            if (null != cachedModels[i_41_]) {
                if (definition.aBool3078) {
                    cachedModels[i_41_].recolor(anInt11797 * 493678609, -170650987 * anInt11798,
                            787607859 * anInt11799, 1501933363 * anInt11791);
                }
                if (bool) {
                    cachedModels[i_41_].method2917(class405_36_, null, 0);
                } else {
                    cachedModels[i_41_].method2917(class405_36_, class139Array[i_41_], 0);
                }
            } else if (!bool) {
                class139Array[i_41_].aBool1581 = false;
            }
        }
        if (null != aClass564_11552) {
            ParticleEntities particleEntities = aClass564_11552.method9492();
            toolkit.method2470(particleEntities);
        }
        for (int i_42_ = 0; i_42_ < cachedModels.length; i_42_++) {
            if (null != cachedModels[i_42_]) {
                aBool11554 |= cachedModels[i_42_].method2939();
            }
            cachedModels[i_42_] = null;
        }
        anInt11496 = 558171427 * Client.anInt10730;
        return class506;
    }

    @Override
    final boolean method16302() {
        return false;
    }

    @Override
    int method17959() {
        if (-1 != -1676510697 * anInt11801) {
            return -1676510697 * anInt11801;
        }
        if (null != definition.morphisms) {
            NpcDefinition npcDefinition = definition.morph(PlayerFacade.instance,
                    PlayerFacade.instance);
            if (null != npcDefinition && -1 != 995718295 * npcDefinition.anInt3021) {
                return 995718295 * npcDefinition.anInt3021;
            }
        }
        return definition.anInt3021 * 995718295;
    }

    boolean method18272(Toolkit toolkit, int i) {
        int i_3_ = i;
        Class515 class515 = method17958();
        Animator animator = this.animator.hasAnimation() && !this.animator.method13515() ? this.animator : null;
        Animator_Sub2 class650_sub2 = aClass650_Sub2_11525.hasAnimation()
                && (!aClass650_Sub2_11525.aBool10566 || null == animator) ? aClass650_Sub2_11525 : null;
        int i_4_ = -810085733 * class515.anInt7039;
        int i_5_ = class515.anInt7040 * -230428805;
        if (i_4_ != 0 || i_5_ != 0 || -1664597871 * class515.anInt7019 != 0 || 0 != -278696585 * class515.anInt7052) {
            i |= 0x7;
        }
        boolean bool = aByte11533 != 0 && Client.engineCycle >= -1458225951 * anInt11528
                && Client.engineCycle < anInt11529 * -1276032357;
        if (bool) {
            i |= 0x80000;
        }
        boolean bool_6_ = false;
        if (anInt11535 * 365729515 != 0) {
            NpcDefinition npcDefinition = null != definition.morphisms ? definition.morph(
                    PlayerFacade.instance, PlayerFacade.instance) : definition;
            if (npcDefinition == null || Client.engineCycle >= npcDefinition.anInt3039 * -2123396755 + 1972607417 * anInt11534) {
                anInt11535 = 0;
            } else {
                anInt11535 = (255 - (Client.engineCycle - anInt11534 * 1972607417) * 255
                        / (-2123396755 * npcDefinition.anInt3039)) * 1433297347;
                bool_6_ = true;
            }
        }
        if (bool_6_) {
            i |= 0x100;
        }
        int i_7_ = yaw.value();
        Model class143 = cachedModels[0] = definition.method5104(toolkit, i, ProxyingVariableLoader.aClass678_Sub6_3003,
                PlayerFacade.instance, PlayerFacade.instance, animator,
                class650_sub2, aClass650_Sub1_Sub1Array11537, anIntArray11518, i_7_, aClass267_11788, method17959(),
                false);
        if (null == class143) {
            return false;
        }
        anInt11510 = class143.minimumY() * -68872337;
        anInt11498 = class143.method2928() * -383074927;
        class143.method3016();
        method17978(class143);
        if (i_4_ != 0 || 0 != i_5_) {
            method17973(i_7_, i_4_, i_5_, 1923259871 * class515.anInt7058, class515.anInt7042 * 522314919);
            if (0 != -170688293 * anInt11507) {
                cachedModels[0].pitch(-170688293 * anInt11507);
            }
            if (1861793885 * anInt11551 != 0) {
                cachedModels[0].roll(anInt11551 * 1861793885);
            }
            if (0 != 2119207177 * anInt11505) {
                cachedModels[0].translate(0, anInt11505 * 2119207177, 0);
            }
        } else {
            method17973(i_7_, boundSize() << 9, boundSize() << 9, 0, 0);
        }
        if (bool) {
            class143.recolor(aByte11530, aByte11531, aByte11492, aByte11533 & 0xff);
        }
        if (bool_6_) {
            class143.method2935((byte) (anInt11535 * 365729515), null);
        }
        method17957(toolkit, class515, i_3_, i_4_, i_5_, i_7_);
        return true;
    }

    boolean method18275(int i) {
        return definition.aBool3052;
    }

    void method18305() {
        anInt11797 = (32 + (int) (Math.random() * 4.0)) * -145620751;
        anInt11798 = (3 + (int) (Math.random() * 2.0)) * -1632950083;
        anInt11799 = (16 + (int) (Math.random() * 3.0)) * 795570683;
        if (Class199.preferences.textures.getValue() == 1) {
            anInt11791 = (int) (Math.random() * 6.0) * 2116150267;
        } else {
            anInt11791 = (int) (Math.random() * 12.0) * 2116150267;
        }
    }
}
