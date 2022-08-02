package com.jagex;

public abstract class Mobile extends SceneEntity implements GameCharacter {
    static final int anInt11493 = 5;
    static final int anInt11549 = 20;

    static int anInt11561;
    public boolean aBool11499;
    public byte aByte11492;
    public byte aByte11530;
    public byte aByte11531;
    public byte aByte11533;
    public Model[] cachedModels;
    public MobileEffect[] effects;
    public EntityList<CombatGauge> combatGauges;
    public Animator animator;
    public EntityAnimator_Sub1_[] aClass650_Sub1_Sub1Array11537;
    public Animator_Sub2 aClass650_Sub2_11525;
    public int index = -1228997701;
    public int anInt11496;
    public int anInt11501;
    public int drawPriority;
    public int anInt11503;
    public int anInt11513;
    public int anInt11521;
    public int anInt11522;
    public int anInt11523;
    public int anInt11524;
    public int anInt11527;
    public int anInt11528;
    public int anInt11529;
    public int anInt11532;
    public int lastUpdate;
    public int anInt11540;
    public int anInt11547;
    public int anInt11550;
    public int anInt11560;
    public int[] specialHitsplatAmounts;
    public int[] hitTypes;
    public int[] hitEndTicks;
    public int[] hitsplatIds;
    public int[] hitAmounts;
    public int[] anIntArray11518;
    public int[] anIntArray11538;
    public int[] anIntArray11553;
    public VariableCollection anInterface13_11517;
    public DefaultMap anInterface73_11556;
    public int direction;
    public int target;
    public int pathLength;
    public byte[] pathSpeed;
    public int[] pathX;
    public int[] pathZ;
    public Orientation pitch;
    public Orientation roll;
    public int turningTicks;
    public Orientation yaw;
    boolean aBool11504;
    boolean aBool11554;
    byte hitCount;
    Interface aClass221_11557;
    ParticleSystem aClass564_11552;
    int anInt11498;
    int anInt11505;
    int anInt11506;
    int anInt11507;
    int anInt11510;
    int anInt11534;
    int anInt11535;
    int anInt11551;
    int anInt11558;
    int anInt11559;
    int boundSize = 485098307;
    OverheadMessage message;
    Mobile(SceneGraph sceneGraph, DefaultProvidingVarpLoader class77_sub1) {
        this(sceneGraph, 10, class77_sub1);
    }

    Mobile(SceneGraph sceneGraph, int maximumPath, DefaultProvidingVarpLoader class77_sub1) {
        super(sceneGraph, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, (byte) 0);
        anInt11510 = 1950908416;
        anInt11498 = -1590198272;
        aBool11499 = true;
        anInt11547 = -2138539533;
        hitTypes = new int[1647467165 * Client.playerDefaults.maximumHits];
        hitAmounts = new int[1647467165 * Client.playerDefaults.maximumHits];
        hitEndTicks = new int[Client.playerDefaults.maximumHits * 1647467165];
        hitsplatIds = new int[Client.playerDefaults.maximumHits * 1647467165];
        specialHitsplatAmounts = new int[Client.playerDefaults.maximumHits * 1647467165];
        combatGauges = new EntityList<>();
        target = 953311613;
        aClass650_Sub2_11525 = new Animator_Sub2(this, false);
        animator = new EntityAnimator(this, false);
        anInt11528 = 1044838623;
        anInt11529 = -1372621715;
        anInt11534 = 939090807;
        anInt11540 = 1623948032;
        yaw = new Orientation();
        roll = new Orientation();
        pitch = new Orientation();
        anInt11558 = 929009801;
        anInt11559 = -525593315;
        anInterface13_11517 = new MobVariableCollection(this);
        pathX = new int[maximumPath];
        pathZ = new int[maximumPath];
        pathSpeed = new byte[maximumPath];
        cachedModels = new Model[6];
        effects = new MobileEffect[5];
        for (int i_122_ = 0; i_122_ < 5; i_122_++) {
            effects[i_122_] = new MobileEffect(this);
        }
        aClass650_Sub1_Sub1Array11537 = new EntityAnimator_Sub1_[EquipmentDefaults.defaults.hidden.length];
        anInterface73_11556 = new DefaultHashMap(class77_sub1);
    }

    public static void method18041(int i, int i_158_, int i_159_, boolean bool) {
        Class480_Sub31_Sub18 class480_sub31_sub18 = Class495.aClass480_Sub31_Sub18_6808;
        Class495.method8550(i);
        Class495.aBool6845 = false;
        if (class480_sub31_sub18 != Class495.aClass480_Sub31_Sub18_6808) {
            CutsceneArea.method16040();
        }
        Class495_Sub1.anInt10326 = 238998875 * i_158_;
        Class495_Sub1.anInt10330 = i_159_ * 499380035;
        Class495_Sub1.aBool10321 = bool;
    }

    static void method3172(Mobile mobile) {
        if (mobile instanceof Npc) {
            Npc npc = (Npc) mobile;
            if (null != npc.definition) {
                Class531.method9031(npc, npc.plane != Client.localPlayer.plane);
            }
        } else if (mobile instanceof Player) {
            Player player = (Player) mobile;
            BigBoyVarpProviderImpl.method781(player, Client.localPlayer.plane != player.plane);
        }
    }

    static Mobile getTopAt(int plane, int x, int z) {
        SceneGraphTile sceneGraphTile = Client.scene.getGraph().tiles[plane][x][z];
        if (null == sceneGraphTile) {
            return null;
        }

        Mobile maximumMobile = null;
        int i_7_ = -1;
        for (EntityIterator entityIterator = sceneGraphTile.entityIterator; null != entityIterator; entityIterator = entityIterator.next) {
            SceneEntity entity = entityIterator.current;

            if (entity instanceof Mobile) {
                Mobile mobile = (Mobile) entity;
                int size = (mobile.boundSize() - 1) * 256 + 252;
                Vector3f vector3f = mobile.getCoordinateSpace().translation;
                int minX = (int) vector3f.x - size >> 9;
                int minZ = (int) vector3f.z - size >> 9;
                int maxX = size + (int) vector3f.x >> 9;
                int maxZ = (int) vector3f.z + size >> 9;

                if (minX <= x && minZ <= z && maxX >= x && maxZ >= z) {
                    int i_14_ = (1 + maxZ - z) * (maxX + 1 - x);
                    if (i_14_ > i_7_) {
                        maximumMobile = mobile;
                        i_7_ = i_14_;
                    }
                }
            }
        }

        return maximumMobile;
    }

    public static void method8795(Mobile mobile, int[] animations, int i, boolean bool) {
        if (null != mobile.anIntArray11538) {
            boolean identical = true;
            for (int index = 0; index < mobile.anIntArray11538.length; index++) {
                if (animations[index] != mobile.anIntArray11538[index]) {
                    identical = false;
                    break;
                }
            }

            Animator animator = mobile.animator;
            if (identical && animator.hasAnimation()) {
                Animation animation = mobile.animator.getAnimation();
                int replayMode = -1719904053 * animation.replayMode;

                if (1 == replayMode) {
                    animator.method13464(i);
                } else if (replayMode == 2) {
                    animator.method13496();
                }
            }
        }

        boolean bool_21_ = true;
        for (int index = 0; index < animations.length; index++) {
            if (animations[index] != -1) {
                bool_21_ = false;
            }

            if (mobile.anIntArray11538 == null
                    || -1 == mobile.anIntArray11538[index]
                    || Animation.loader.get(animations[index]).priority * 739199743 >= Animation.loader
                    .get(mobile.anIntArray11538[index]).priority * 739199743) {
                mobile.anIntArray11538 = animations;
                mobile.animator.method13462(i);

                if (bool) {
                    mobile.anInt11550 = 2108830049 * mobile.pathLength;
                }
            }
        }

        if (bool_21_) {
            mobile.anIntArray11538 = animations;
            mobile.animator.method13462(i);
            if (bool) {
                mobile.anInt11550 = mobile.pathLength * 2108830049;
            }
        }
    }

    public int boundSize() {
        return boundSize * -1940446869;
    }

    public abstract boolean canMessage();

    @Override
    public void finalize() {
        if (aClass564_11552 != null) {
            aClass564_11552.method9484();
        }
    }

    public abstract int getArmyIcon();

    public abstract OverheadMessage getMessage();

    @Override
    public int getStartY() {
        if (-32768 == anInt11510 * 401221519) {
            return 0;
        }
        return 401221519 * anInt11510;
    }

    @Override
    public int method16307() {
        Class515 class515 = method17958();
        int i_48_;
        if (class515.anInt7057 * -2044338879 != -1) {
            i_48_ = class515.anInt7057 * -2044338879;
        } else if (anInt11498 * 1795138417 == -32768) {
            i_48_ = 200;
        } else {
            i_48_ = -(1795138417 * anInt11498);
        }
        CoordinateSpace coordinateSpace = getCoordinateSpace();
        int i_49_ = (int) coordinateSpace.translation.x >> 9;
        int i_50_ = (int) coordinateSpace.translation.z >> 9;
        if (graph != null && i_49_ >= 1 && i_50_ >= 1 && i_49_ <= Client.scene.getMapWidth() - 1
                && i_50_ <= Client.scene.getMapLength() - 1) {
            SceneGraphTile sceneGraphTile = graph.tiles[plane][i_49_][i_50_];
            if (sceneGraphTile != null && sceneGraphTile.decoration != null) {
                return i_48_ + sceneGraphTile.decoration.aShort11466;
            }
        }
        return i_48_;
    }

    @Override
    public void method17912() {
        int size = 240 + (boundSize * -1940446869 - 1 << 8);
        Vector3f vector3f = getCoordinateSpace().translation;
        startX = (short) ((int) vector3f.x - size >> 9);
        startY = (short) ((int) vector3f.z - size >> 9);
        endX = (short) (size + (int) vector3f.x >> 9);
        endY = (short) (size + (int) vector3f.z >> 9);
    }

    public void method17946(int[] is, int[] is_2_) {
        if (anIntArray11553 == null && is != null) {
            anIntArray11553 = new int[EquipmentDefaults.defaults.hidden.length];
        } else if (is == null) {
            anIntArray11553 = null;
            return;
        }

        for (int i_3_ = 0; i_3_ < anIntArray11553.length; i_3_++) {
            anIntArray11553[i_3_] = -1;
        }

        for (int i_4_ = 0; i_4_ < is.length; i_4_++) {
            int i_5_ = is_2_[i_4_];
            int i_6_ = 0;
            while (i_6_ < anIntArray11553.length) {
                if ((i_5_ & 0x1) != 0) {
                    anIntArray11553[i_6_] = is[i_4_];
                }
                i_6_++;
                i_5_ >>= 1;
            }
        }
    }

    public final void hit(int id, int amount, int i_22_, int i_23_, int currentTick, int delay) {
        boolean empty = true;
        boolean bool_27_ = true;

        for (int index = 0; index < 1647467165 * Client.playerDefaults.maximumHits; index++) {
            if (hitEndTicks[index] > currentTick) {
                empty = false;
            } else {
                bool_27_ = false;
            }
        }

        int replaced = -1;
        int type = -1;
        int duration = 0;

        if (id >= 0) {
            HitsplatDefinition hitsplat = HitsplatDefinition.loader.get(id);
            type = 942427987 * hitsplat.comparisonType;
            duration = hitsplat.duration * 1662747801;
        }

        if (bool_27_) {
            if (type == -1) {
                return;
            }

            replaced = 0;
            int value = 0;
            if (type == 0) {
                value = hitEndTicks[0];
            } else if (type == 1) {
                value = hitAmounts[0];
            }

            for (int index = 1; index < 1647467165 * Client.playerDefaults.maximumHits; index++) {
                if (0 == type) {
                    if (hitEndTicks[index] < value) {
                        replaced = index;
                        value = hitEndTicks[index];
                    }
                } else if (type == 1 && hitAmounts[index] < value) {
                    replaced = index;
                    value = hitAmounts[index];
                }
            }

            if (1 == type && value >= amount) {
                return;
            }
        } else {
            if (empty) {
                hitCount = (byte) 0;
            }

            for (int i_34_ = 0; i_34_ < Client.playerDefaults.maximumHits * 1647467165; i_34_++) {
                int index = hitCount;
                hitCount = (byte) ((hitCount + 1) % (Client.playerDefaults.maximumHits * 1647467165));

                if (hitEndTicks[index] <= currentTick) {
                    replaced = index;
                    break;
                }
            }
        }

        if (replaced >= 0) {
            hitTypes[replaced] = id;
            hitAmounts[replaced] = amount;
            hitsplatIds[replaced] = i_22_;
            specialHitsplatAmounts[replaced] = i_23_;
            hitEndTicks[replaced] = delay + currentTick + duration;
        }
    }

    public final void method17952(int id, int i_36_, int i_37_, int i_38_, int i_39_, int i_40_) {
        HitbarDefinition hitbar = HitbarDefinition.loader.get(id);
        CombatGauge class477_sub3 = null;
        CombatGauge combatGauge_42_ = null;
        int i_43_ = 955350565 * hitbar.anInt7197;
        int i_44_ = 0;
        for (CombatGauge gauge = combatGauges.head(); gauge != null; gauge = combatGauges.next()) {
            i_44_++;
            if (gauge.hitbar == hitbar) {
                gauge.method15578(i_36_ + i_38_, i_39_, i_40_, i_37_);
                return;
            }
            if (-858360193 * gauge.hitbar.anInt7195 <= -858360193 * hitbar.anInt7195) {
                class477_sub3 = gauge;
            }
            if (gauge.hitbar.anInt7197 * 955350565 > i_43_) {
                combatGauge_42_ = gauge;
                i_43_ = gauge.hitbar.anInt7197 * 955350565;
            }
        }
        if (combatGauge_42_ != null || i_44_ < 562311855 * Client.playerDefaults.anInt7591) {
            CombatGauge combatGauge_46_ = new CombatGauge(hitbar);
            if (null == class477_sub3) {
                combatGauges.add(combatGauge_46_);
            } else {
                Class122.insertBefore(combatGauge_46_, class477_sub3);
            }
            combatGauge_46_.method15578(i_38_ + i_36_, i_39_, i_40_, i_37_);
            if (i_44_ >= 562311855 * Client.playerDefaults.anInt7591) {
                combatGauge_42_.unlink();
            }
        }
    }

    public final void method17953(int i) {
        HitbarDefinition def = HitbarDefinition.loader.get(i);
        for (CombatGauge gauge = combatGauges.head(); null != gauge; gauge = combatGauges.next()) {
            if (gauge.hitbar == def) {
                gauge.unlink();
                break;
            }
        }
    }

    public Class515 method17958() {
        int i_67_ = method17959();
        if (i_67_ == -1) {
            return Class678_Sub6.aClass515_10562;
        }
        return ProxyingVariableLoader.aClass678_Sub6_3003.get(i_67_);
    }

    public void method17968(int i, int i_72_, boolean bool) {
        if (method17965()) {
            Class264.method5001(aClass221_11557.components, -1, i, i_72_, bool);
        }
    }

    public abstract int method17969();

    public CoordGrid method17970() {
        Vector3f vector3f = getCoordinateSpace().translation;
        CoordGrid class553 = Client.scene.getBase();
        int i_74_ = class553.x * 2051316501 + ((int) vector3f.x >> 9);
        int i_75_ = ((int) vector3f.z >> 9) + -180305283 * class553.z;
        return new CoordGrid(plane, i_74_, i_75_);
    }

    public Vector4i method17971() {
        Vector3f vector3f = getCoordinateSpace().translation;
        CoordGrid class553 = Client.scene.getBase();
        int i_76_ = -1992939008 * class553.x + (int) vector3f.x;
        int i_77_ = (int) vector3f.y;
        int i_78_ = (int) vector3f.z + class553.z * -2121991680;
        return new Vector4i(plane, i_76_, i_77_, i_78_);
    }

    public void method17972(int i, int i_79_, int i_80_, int i_81_, int i_82_, int i_83_, int i_84_) {
        if (!method17965()) {
            if (i != -1) {
                Client.validComponents[i] = true;
            } else {
                for (int i_86_ = 0; i_86_ < 104; i_86_++) {
                    Client.validComponents[i_86_] = true;
                }
            }
        } else {
            Component.handleEvents(aClass221_11557.getComponents(), -1, i_79_, i_80_, i_81_, i_82_, i_83_, i_84_, i, false);
        }
    }

    public final void method17985() {
        pathLength = 0;
        anInt11550 = 0;
    }

    public int method18008() {
        Class515 class515 = method17958();
        int initialYaw = yaw.value * 2069603133;
        boolean bool;

        if (0 != -1465317167 * class515.anInt7048) {
            bool = yaw.pulse(direction * 1149508617, class515.anInt7048 * -1465317167, class515.anInt7028 * 97623381);
        } else {
            bool = yaw.pulse(direction * 1149508617, 1206344627 * anInt11540, anInt11540 * 1206344627);
        }

        int i_127_ = yaw.value * 2069603133 - initialYaw;
        if (i_127_ != 0) {
            turningTicks += -511450151;
        } else {
            turningTicks = 0;
            yaw.update(direction * 1149508617);
        }

        if (bool) {
            if (0 != class515.anInt7054 * -332194967) {
                if (i_127_ > 0) {
                    roll.pulse(class515.anInt7019 * -1664597871, -332194967 * class515.anInt7054,
                            818577901 * class515.anInt7037);
                } else {
                    roll.pulse(-(-1664597871 * class515.anInt7019), -332194967 * class515.anInt7054,
                            818577901 * class515.anInt7037);
                }
            }
            if (0 != -942985511 * class515.anInt7053) {
                pitch.pulse(class515.anInt7052 * -278696585, class515.anInt7053 * -942985511, -504551603
                        * class515.anInt7051);
            }
        } else {
            if (0 != -332194967 * class515.anInt7054) {
                roll.pulse(0, class515.anInt7054 * -332194967, 818577901 * class515.anInt7037);
            } else {
                roll.update(0);
            }
            if (-942985511 * class515.anInt7053 != 0) {
                pitch.pulse(0, -942985511 * class515.anInt7053, -504551603 * class515.anInt7051);
            } else {
                pitch.update(0);
            }
        }
        return i_127_;
    }

    public void method18018(int i, int i_128_, int i_129_, int i_130_, int i_131_, int i_132_, int i_133_, int i_134_,
                            int i_135_) {
        if (method17965()) {
            Client.method17015(aClass221_11557, aClass221_11557.getComponents(), -1, i, i_128_, i_129_, i_130_, i_131_,
                    i_132_, i_133_, i_134_);
        }
    }

    public boolean method18024(int i, int i_136_, byte i_137_) {
        if (null == anIntArray11518) {
            if (i_136_ == -1) {
                return true;
            }

            anIntArray11518 = new int[EquipmentDefaults.defaults.hidden.length];
            for (int index = 0; index < EquipmentDefaults.defaults.hidden.length; index++) {
                anIntArray11518[index] = -1;
            }
        }

        Class515 class515 = method17958();
        int i_139_ = 256;
        if (class515.anIntArray7026 != null && class515.anIntArray7026[i] > 0) {
            i_139_ = class515.anIntArray7026[i];
        }
        if (i_136_ == -1) {
            if (anIntArray11518[i] == -1) {
                return true;
            }
            int yaw = this.yaw.value();
            int i_141_ = anIntArray11518[i];
            int i_142_ = yaw - i_141_;

            if (i_142_ >= -i_139_ && i_142_ <= i_139_) {
                anIntArray11518[i] = -1;
                for (int index = 0; index < EquipmentDefaults.defaults.hidden.length; index++) {
                    if (anIntArray11518[index] != -1) {
                        return true;
                    }
                }

                anIntArray11518 = null;
                return true;
            }

            if (i_142_ > 0 && i_142_ <= 8192 || i_142_ <= -8192) {
                anIntArray11518[i] = i_141_ + i_139_ & 0x3fff;
            } else {
                anIntArray11518[i] = i_141_ - i_139_ & 0x3fff;
            }

            return false;
        }

        if (anIntArray11518[i] == -1) {
            anIntArray11518[i] = yaw.value();
        }

        int i_144_ = anIntArray11518[i];
        int i_145_ = i_136_ - i_144_;
        if (i_145_ >= -i_139_ && i_145_ <= i_139_) {
            anIntArray11518[i] = i_136_;
            return true;
        }

        if (i_145_ > 0 && i_145_ <= 8192 || i_145_ <= -8192) {
            anIntArray11518[i] = i_139_ + i_144_ & 0x3fff;
        } else {
            anIntArray11518[i] = i_144_ - i_139_ & 0x3fff;
        }

        return false;
    }

    public final void method18035(int primaryId, int height, int i_149_, int i_150_, boolean bool, int i_151_) {
        MobileEffect effect = effects[i_151_];
        int secondaryId = effect.id * -2008549027;
        if (primaryId != -1 && -1 != secondaryId) {
            if (primaryId == secondaryId) {
                EffectDefinition graphic = EffectDefinition.loader.get(primaryId);

                if (graphic.aBool7986 && graphic.animation * 2053507375 != -1) {
                    Animation animation = Animation.loader.get(2053507375 * graphic.animation);
                    int mode = animation.replayMode * -1719904053;

                    if (0 == mode) {
                        return;
                    }

                    if (2 == mode) {
                        effect.animator.method13496();
                        return;
                    }
                }
            } else {
                EffectDefinition primary = EffectDefinition.loader.get(primaryId);
                EffectDefinition secondary = EffectDefinition.loader.get(secondaryId);

                if (primary.animation * 2053507375 != -1 && 2053507375 * secondary.animation != -1) {
                    Animation primaryAnimation = Animation.loader
                            .get(primary.animation * 2053507375);
                    Animation secondaryAnimation = Animation.loader
                            .get(2053507375 * secondary.animation);
                    if (739199743 * primaryAnimation.priority < 739199743 * secondaryAnimation.priority) {
                        return;
                    }
                }
            }
        }

        int i_157_ = 0;
        if (primaryId != -1 && !EffectDefinition.loader.get(primaryId).aBool7986) {
            i_157_ = 2;
        }

        if (-1 != primaryId && bool) {
            i_157_ = 1;
        }

        effect.id = -738188555 * primaryId;
        effect.anInt6481 = i_150_ * -508611417;
        effect.yTranslation = (height >> 16) * 272663415;
        effect.anInt6483 = 925563113 * i_149_;
        effect.animator.method13453(
                primaryId != -1 ? EffectDefinition.loader.get(primaryId).animation * 2053507375 : -1, height & 0xffff,
                i_157_, false);
    }

    public void pulseChat() {
        if (null != message && null != message.text) {
            message.remaining -= 1527896669;
            if (-807155211 * message.remaining == 0) {
                message.text = null;
            }
        }
    }

    public void setBoundSize(int size) {
        boundSize = 485098307 * size;
    }

    public void setMessage(String text, int colour, int effect, int duration) {
        if (message == null) {
            message = new OverheadMessage();
        }

        message.text = text;
        message.colour = 661408175 * colour;
        message.effect = effect * -863905089;
        message.remaining = (message.duration = 490159667 * duration) * -2061511377;
    }

    public void turn(int direction) {
        Class515 class515 = method17958();
        if (0 != -1465317167 * class515.anInt7048 || 1206344627 * anInt11540 != 0) {
            yaw.normalize();

            int change = direction - yaw.value * 2069603133 & 0x3fff;
            if (change > 8192) {
                this.direction = 658256441 * (yaw.value * 2069603133 - (16384 - change));
            } else {
                this.direction = (2069603133 * yaw.value + change) * 658256441;
            }
        }
    }

    public void turn(int direction, boolean force) {
        Class515 class515 = method17958();

        if (force || class515.anInt7048 * -1465317167 != 0 || 1206344627 * anInt11540 != 0) {
            this.direction = 658256441 * (direction & 0x3fff);
            yaw.update(1149508617 * this.direction);
        }
    }

    @Override
    boolean isTextured() {
        return false;
    }

    @Override
    boolean isCached() {
        return aBool11554;
    }

    void method17948(Toolkit toolkit, Model[] models, Matrix4x3 class405, boolean bool) {
        if (!bool) {
            int i_7_ = 0;
            int i_8_ = 0;
            int i_9_ = 0;
            int i_10_ = 0;
            int i_11_ = -1;
            int i_12_ = -1;
            Class145[][] class145s = new Class145[models.length][];
            Class115[][] class115s = new Class115[models.length][];
            for (int i_13_ = 0; i_13_ < models.length; i_13_++) {
                if (models[i_13_] != null) {
                    models[i_13_].method3063(class405);
                    class145s[i_13_] = models[i_13_].method2942();
                    class115s[i_13_] = models[i_13_].method2943();
                    if (class145s[i_13_] != null) {
                        i_11_ = i_13_;
                        i_8_++;
                        i_7_ += class145s[i_13_].length;
                    }
                    if (class115s[i_13_] != null) {
                        i_12_ = i_13_;
                        i_10_++;
                        i_9_ += class115s[i_13_].length;
                    }
                }
            }
            if ((aClass564_11552 == null || aClass564_11552.stopped) && (i_8_ > 0 || i_10_ > 0)) {
                aClass564_11552 = ParticleSystem.create(Client.engineCycle, true);
            }
            if (aClass564_11552 != null) {
                Class145[] class145s_14_;
                if (1 == i_8_) {
                    class145s_14_ = class145s[i_11_];
                } else {
                    class145s_14_ = new Class145[i_7_];
                    int i_15_ = 0;
                    for (int i_16_ = 0; i_16_ < models.length; i_16_++) {
                        if (null != class145s[i_16_]) {
                            System.arraycopy(class145s[i_16_], 0, class145s_14_, i_15_, class145s[i_16_].length);
                            i_15_ += class145s[i_16_].length;
                        }
                    }
                }
                Class115[] class115s_18_;
                if (i_10_ == 1) {
                    class115s_18_ = class115s[i_12_];
                } else {
                    class115s_18_ = new Class115[i_9_];
                    int i_19_ = 0;
                    for (int i_20_ = 0; i_20_ < models.length; i_20_++) {
                        if (null != class115s[i_20_]) {
                            System.arraycopy(class115s[i_20_], 0, class115s_18_, i_19_, class115s[i_20_].length);
                            i_19_ += class115s[i_20_].length;
                        }
                    }
                }
                aClass564_11552.method9488(toolkit, Client.engineCycle, class145s_14_, class115s_18_, false);
                aBool11504 = true;
            }
        } else if (aClass564_11552 != null) {
            aClass564_11552.method9487(Client.engineCycle);
        }
        if (null != aClass564_11552) {
            aClass564_11552.method9485(plane, startX, endX, startY, endY);
        }
    }

    void method17957(Toolkit toolkit, Class515 class515, int i, int i_52_, int i_53_, int i_54_) {
        for (int i_56_ = 0; i_56_ < effects.length; i_56_++) {
            byte i_57_ = 0;
            if (i_56_ == 0) {
                i_57_ = (byte) 2;
            } else if (1 == i_56_) {
                i_57_ = (byte) 5;
            } else if (2 == i_56_) {
                i_57_ = (byte) 1;
            } else if (i_56_ == 3) {
                i_57_ = (byte) 7;
            } else if (4 == i_56_) {
                i_57_ = (byte) 8;
            }
            MobileEffect effect = effects[i_56_];
            if (-1 != effect.id * -2008549027 && !effect.animator.method13515()) {
                EffectDefinition graphic = EffectDefinition.loader.get(-2008549027 * effect.id);
                int i_58_ = i;
                if (0 != effect.anInt6483 * 1938382681) {
                    i_58_ |= 0x5;
                }
                if (0 != effect.yTranslation * -1218492857) {
                    i_58_ |= 0x2;
                }
                if (effect.anInt6481 * 397619991 >= 0) {
                    i_58_ |= 0x7;
                }
                if (effect.anInt6481 * 397619991 >= 0 && null != class515.anIntArrayArray7043
                        && class515.anIntArrayArray7043[397619991 * effect.anInt6481] != null) {
                    Model model = cachedModels[i_56_ + 1] = graphic.method10394(toolkit, i_58_,
                            effect.animator, i_57_);
                    if (model != null) {
                        int i_59_ = 0;
                        int i_60_ = 0;
                        int i_61_ = 0;
                        if (null != class515.anIntArrayArray7043
                                && class515.anIntArrayArray7043[397619991 * effect.anInt6481] != null) {
                            i_59_ += class515.anIntArrayArray7043[397619991 * effect.anInt6481][0];
                            i_60_ += class515.anIntArrayArray7043[397619991 * effect.anInt6481][1];
                            i_61_ += class515.anIntArrayArray7043[397619991 * effect.anInt6481][2];
                        }
                        if (null != class515.anIntArrayArray7044
                                && class515.anIntArrayArray7044[effect.anInt6481 * 397619991] != null) {
                            i_59_ += class515.anIntArrayArray7044[effect.anInt6481 * 397619991][0];
                            i_60_ += class515.anIntArrayArray7044[effect.anInt6481 * 397619991][1];
                            i_61_ += class515.anIntArrayArray7044[397619991 * effect.anInt6481][2];
                        }
                        if (0 != i_61_ || i_59_ != 0) {
                            int i_62_ = i_54_;
                            if (anIntArray11518 != null && anIntArray11518[effect.anInt6481 * 397619991] != -1) {
                                i_62_ = anIntArray11518[397619991 * effect.anInt6481];
                            }
                            int i_63_ = effect.anInt6483 * 1257949184 + i_62_ - i_54_ & 0x3fff;
                            if (0 != i_63_) {
                                model.yaw(i_63_);
                            }
                            int i_64_ = Class373.SINE[i_63_];
                            int i_65_ = Class373.COSINE[i_63_];
                            int i_66_ = i_64_ * i_61_ + i_59_ * i_65_ >> 14;
                            i_61_ = i_61_ * i_65_ - i_59_ * i_64_ >> 14;
                            i_59_ = i_66_;
                        }
                        model.translate(i_59_, i_60_, i_61_);
                        if (effect.yTranslation * -1218492857 != 0) {
                            model.translate(0, -(effect.yTranslation * -1218492857) << 2, 0);
                        }
                        model.aBool1751 = false;
                    }
                } else {
                    Model class143 = cachedModels[1 + i_56_] = graphic.method10402(toolkit, i_58_,
                            effect.anInt6483 * 1257949184, -170688293 * anInt11507, anInt11551 * 1861793885,
                            2119207177 * anInt11505, effect.animator, i_57_, 1158820469);
                    if (class143 != null) {
                        if (-1218492857 * effect.yTranslation != 0) {
                            class143.translate(0, -(-1218492857 * effect.yTranslation) << 2, 0);
                        }
                        class143.aBool1751 = false;
                    }
                }
            } else {
                cachedModels[i_56_ + 1] = null;
            }
        }
    }

    abstract int method17959();

    boolean method17965() {
        if (-1631671605 * anInt11559 == -1) {
            return false;
        }
        return method17966(-1631671605 * anInt11559);
    }

    boolean method17966(int i) {
        if (i == 1124670023 * anInt11558) {
            return true;
        }
        aClass221_11557 = GameContext.method10444(i, null, null, true);
        if (null == aClass221_11557) {
            return false;
        }
        anInt11558 = -929009801 * i;
        PriorityQueueElement.method6072(aClass221_11557.components);
        return true;
    }

    void method17973(int i, int i_87_, int i_88_, int i_89_, int i_90_) {
        Vector3f vector3f = getCoordinateSpace().translation;
        int i_92_ = endX + startX >> 1;
        int i_93_ = endY + startY >> 1;
        int i_94_ = Class373.SINE[i];
        int i_95_ = Class373.COSINE[i];
        int i_96_ = -i_87_ / 2;
        int i_97_ = -i_88_ / 2;
        int i_98_ = i_94_ * i_97_ + i_95_ * i_96_ >> 14;
        int i_99_ = i_97_ * i_95_ - i_96_ * i_94_ >> 14;
        int i_100_ = Class515.method8841(i_98_ + (int) vector3f.x, i_99_ + (int) vector3f.z, i_92_, i_93_, plane);
        int i_101_ = i_87_ / 2;
        int i_102_ = -i_88_ / 2;
        int i_103_ = i_101_ * i_95_ + i_94_ * i_102_ >> 14;
        int i_104_ = i_95_ * i_102_ - i_94_ * i_101_ >> 14;
        int i_105_ = Class515.method8841((int) vector3f.x + i_103_, i_104_ + (int) vector3f.z, i_92_, i_93_, plane);
        int i_106_ = -i_87_ / 2;
        int i_107_ = i_88_ / 2;
        int i_108_ = i_107_ * i_94_ + i_106_ * i_95_ >> 14;
        int i_109_ = i_95_ * i_107_ - i_106_ * i_94_ >> 14;
        int i_110_ = Class515.method8841(i_108_ + (int) vector3f.x, i_109_ + (int) vector3f.z, i_92_, i_93_, plane);
        int i_111_ = i_87_ / 2;
        int i_112_ = i_88_ / 2;
        int i_113_ = i_94_ * i_112_ + i_95_ * i_111_ >> 14;
        int i_114_ = i_112_ * i_95_ - i_94_ * i_111_ >> 14;
        int i_115_ = Class515.method8841(i_113_ + (int) vector3f.x, i_114_ + (int) vector3f.z, i_92_, i_93_, plane);
        int i_116_ = i_100_ < i_105_ ? i_100_ : i_105_;
        int i_117_ = i_110_ < i_115_ ? i_110_ : i_115_;
        int i_118_ = i_105_ < i_115_ ? i_105_ : i_115_;
        int i_119_ = i_100_ < i_110_ ? i_100_ : i_110_;
        anInt11507 = ((int) (Math.atan2(i_116_ - i_117_, i_88_) * 2607.5945876176133) & 0x3fff) * -1379108013;
        anInt11551 = ((int) (Math.atan2(i_119_ - i_118_, i_87_) * 2607.5945876176133) & 0x3fff) * -1153377291;
        if (anInt11507 * -170688293 != 0 && 0 != i_89_) {
            int i_120_ = 16384 - i_89_;
            if (-170688293 * anInt11507 > 8192) {
                if (anInt11507 * -170688293 < i_120_) {
                    anInt11507 = i_120_ * -1379108013;
                }
            } else if (anInt11507 * -170688293 > i_89_) {
                anInt11507 = -1379108013 * i_89_;
            }
        }
        if (0 != 1861793885 * anInt11551 && 0 != i_90_) {
            int i_121_ = 16384 - i_90_;
            if (1861793885 * anInt11551 > 8192) {
                if (anInt11551 * 1861793885 < i_121_) {
                    anInt11551 = -1153377291 * i_121_;
                }
            } else if (1861793885 * anInt11551 > i_90_) {
                anInt11551 = -1153377291 * i_90_;
            }
        }
        anInt11505 = (i_100_ + i_115_) * 1105581369;
        if (i_105_ + i_110_ < 2119207177 * anInt11505) {
            anInt11505 = (i_110_ + i_105_) * 1105581369;
        }
        anInt11505 = ((anInt11505 * 2119207177 >> 1) - (int) vector3f.y) * 1105581369;
    }

    void method17978(Model model) {
        int roll = this.roll.value * 2069603133;
        int pitch = 2069603133 * this.pitch.value;

        if (0 != roll || pitch != 0) {
            int y = model.minimumY() / 2;
            model.translate(0, -y, 0);
            model.roll(roll & 0x3fff);
            model.pitch(pitch & 0x3fff);
            model.translate(0, y, 0);
        }
    }

}