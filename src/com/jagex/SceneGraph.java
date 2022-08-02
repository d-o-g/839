package com.jagex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class SceneGraph {

    static final int anInt6739 = 4;
    public static boolean renderLight = true;
    public static int localPlane;
    static int anInt6751;
    static int floorLevel;
    public int length;
    public int tileScale;
    public int levelCount;
    public int width;
    public SceneGraphLevel[] levels1;
    public SceneGraphLevel[] levels;
    public SceneGraphLevel[] levels0;
    public SceneGraphTile[][][] tiles2;
    public SceneGraphTile[][][] tiles1;
    public SceneGraphTile[][][] tiles;
    public Class492 aClass492_6695;
    public MouseOverEntities aClass497_6711;
    int anInt6686;
    int anInt6688;
    int anInt6689;
    int anInt6690 = 16; //unused/inlined
    int anInt6697;
    int anInt6699;
    int anInt6710;
    int anInt6714 = 5079;
    int anInt6734;
    int anInt6723;
    int anInt6724;
    int anInt6725;
    int anInt6726;
    int anInt6727;
    int entityCount = 0;
    int anInt6730;
    int anInt6731;
    int anInt6732 = 5067;
    int anInt6738 = 65279;
    int anInt6741 = 10072; //unused/inlined
    int anInt6750;
    int anInt6745;
    int anInt6746;
    int anInt6718;
    int[] anIntArray6748;
    int[][] anIntArrayArray6735;
    boolean aBool6693;
    boolean aBool6694;
    boolean[] aBoolArray6743;
    boolean[][] aBoolArrayArray6733;
    boolean[][] aBoolArrayArray6747;
    boolean[][] aBoolArrayArray6749;
    float[] aFloatArray6736;
    long[][][] aLongArrayArrayArray6720;
    short[][] aShortArrayArray6722;
    byte[][] aByteArrayArray6696;
    byte[][] aByteArrayArray6707;
    byte[][] aByteArrayArray6708;
    byte[][] aByteArrayArray6709;
    HashMap<Integer, PointLight> pointLightMap;
    HashMap<Integer, List<Class504>> class504Map;
    Toolkit toolkit;

    SceneEntity[] entities;

    NanoTimer nanoTimer;

    SceneNode[] aSceneNodeArray6714;
    SceneNode[] nodes;
    SceneNode[] cached;
    SceneNode[] aSceneNodeArray6717;
    SceneNode[] aSceneNodeArray6721;

    PointLight[] lights;

    Class504[] aClass504Array6742;

    public SceneGraph(Toolkit toolkit, int tileScale, int levelCount, int width, int length, int i_234_, boolean bool,
                      boolean bool_235_) {
        anInt6732 = 5067;
        anInt6714 = 5079;
        aFloatArray6736 = new float[3];
        lights = new PointLight[8];
        anInt6738 = 65279;
        class504Map = new HashMap<>();
        pointLightMap = new HashMap<>();
        this.toolkit = toolkit;
        aBool6693 = toolkit.method2480() > 0;
        this.tileScale = tileScale * 1675697941;
        anInt6688 = (1 << this.tileScale * -1911343043) * 1330551115;
        anInt6689 = (anInt6688 * -57333661 >> 1) * 32298205;
        this.levelCount = 443938227 * levelCount;
        this.width = -2079184875 * width;
        this.length = -2087582179 * length;
        anInt6686 = 1020897959 * i_234_;
        nanoTimer = new NanoTimer();
        aClass492_6695 = new Class492(this);
        tiles1 = new SceneGraphTile[levelCount][173827901 * width][length * 134933557];
        levels = new SceneGraphLevel[levelCount];
        if (bool) {
            anIntArrayArray6735 = new int[width * 173827901][length * 134933557];
            aByteArrayArray6707 = new byte[173827901 * width][length * 134933557];
            aShortArrayArray6722 = new short[173827901 * width][134933557 * length];
            aByteArrayArray6708 = new byte[173827901 * width][134933557 * length];
            aByteArrayArray6709 = new byte[width * 173827901][134933557 * length];
            aByteArrayArray6696 = new byte[width * 173827901][length * 134933557];
            tiles2 = new SceneGraphTile[1][width * 173827901][length * 134933557];
            levels0 = new SceneGraphLevel[1];
        }
        if (bool_235_) {
            aLongArrayArrayArray6720 = new long[levelCount][width][length];
            aClass504Array6742 = new Class504[65279];
            aBoolArray6743 = new boolean[65279];
            anInt6731 = 0;
        }
        method8315(false);
        nodes = new SceneNode[2];
        cached = new SceneNode[2];
        aSceneNodeArray6717 = new SceneNode[2];
        aSceneNodeArray6721 = new SceneNode[10072];
        aSceneNodeArray6714 = new SceneNode[5067];
        entities = new SceneEntity[5079];
        entityCount = 0;
        anInt6718 = 0;
        anInt6726 = 0;
        aBoolArrayArray6733 = new boolean[1 + anInt6686 * 1414880535 + 1414880535 * anInt6686][1 + 1414880535
                * anInt6686 + anInt6686 * 1414880535];
        aBoolArrayArray6747 = new boolean[1414880535 * anInt6686 + 1414880535 * anInt6686 + 2][2 + anInt6686
                * 1414880535 + 1414880535 * anInt6686];
        anIntArray6748 = new int[2 + 1414880535 * anInt6686 + 1414880535 * anInt6686];
        aClass497_6711 = new MouseOverEntities(false);
    }

    public static final void method8472() {
        if (!Client.aBool10828) {
            Client.aFloat10711 += (12.0F - Client.aFloat10711) / 2.0F;
            Client.aBool10611 = true;
            Client.aBool10828 = true;
        }
    }

    static final void method8470(Component class226, Interface class221, ScriptExecutionContext class613, int i) {
        class613.anInt7924 -= -926911801;
        int i_303_ = class613.anIntArray7942[class613.anInt7924 * 1841827045];
        short i_304_ = (short) class613.anIntArray7942[class613.anInt7924 * 1841827045 + 1];
        short i_305_ = (short) class613.anIntArray7942[2 + class613.anInt7924 * 1841827045];
        if (i_303_ >= 0 && i_303_ < 5) {
            class226.method4249(i_303_, i_304_, i_305_);
            Component.redraw(class226);
            if (-1 == -592186295 * class226.index && !class221.closed) {
                Class50.method1129(class226.uid * 1857819631, i_303_, -1007422058);
            }
        }
    }

    static final void method8471(Component class226, Interface class221, ScriptExecutionContext class613, int i) {
        String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
        if (ScriptExecutionContext.method9239(string, class613) != null) {
            string = string.substring(0, string.length() - 1);
        }
        class226.parameterListeners = World.method16248(string, class613);
        class226.aBool2483 = true;
    }

    static final void method8473(Component class226, Interface class221, ScriptExecutionContext class613, byte i) {
        class613.anInt7924 -= -1853823602;
        class226.spriteOffsetX = -682189589 * class613.anIntArray7942[class613.anInt7924 * 1841827045];
        class226.spriteOffsetY = -1985774615 * class613.anIntArray7942[1 + 1841827045 * class613.anInt7924];
        class226.spritePitch = class613.anIntArray7942[1841827045 * class613.anInt7924 + 2] * 1513530733;
        class226.spriteRoll = 1225722821 * class613.anIntArray7942[class613.anInt7924 * 1841827045 + 3];
        class226.spriteYaw = 746962885 * class613.anIntArray7942[class613.anInt7924 * 1841827045 + 4];
        class226.spriteScale = class613.anIntArray7942[5 + 1841827045 * class613.anInt7924] * 1495301125;
        Component.redraw(class226);
        if (-1 == class226.index * -592186295 && !class221.closed) {
            PulseEvent.method4741(class226.uid * 1857819631);
            PulseEvent.method17579(1857819631 * class226.uid);
        }
    }

    public static final int getAverageHeight(int worldX, int worldZ, int plane) {
        if (Client.scene.getGraph() == null) {
            return 0;
        }

        int x = worldX >> 9;
        int z = worldZ >> 9;
        if (x < 0 || z < 0 || x > Client.scene.getMapWidth() - 1
                || z > Client.scene.getMapLength() - 1) {
            return 0;
        }

        int y = plane;
        if (y < 3 && (Client.scene.method7775().flags[1][x][z] & 0x2) != 0) {
            y++;
        }

        return Client.scene.getGraph().levels1[y].averageHeightAt(worldX, worldZ);
    }

    static final void rotateMod(int level, int type, int x, int y, Class540 class540) {
        if (x >= 1 && y >= 1 && x <= Client.scene.getMapWidth() - 2
                && y <= Client.scene.getMapLength() - 2) {
            if (Client.scene.getGraph() != null) {
                SceneObject object = Client.scene.method7696().getObject(level, type, x, y);
                if (object != null) {
                    if (object instanceof StaticGameObject) {
                        ((StaticGameObject) object).method18048(class540);
                    } else if (object instanceof StaticTileDecoration) {
                        ((StaticTileDecoration) object).method18063(class540);
                    } else if (object instanceof StaticBoundary) {
                        ((StaticBoundary) object).method18084(class540);
                    } else if (object instanceof StaticBoundaryDecoration) {
                        ((StaticBoundaryDecoration) object).method18090(class540);
                    }
                }
            }
        }
    }

    public void method8313(int i) {

    }

    public void method8314(Font font) {

    }

    public void method8315(boolean bool) {
        if (bool) {
            tiles = tiles2;
            levels1 = levels0;
        } else {
            tiles = tiles1;
            levels1 = levels;
        }
        levelCount = tiles.length * 443938227;
    }

    public int getScale(int i, int i_1_) {
        return aShortArrayArray6722 != null ? aShortArrayArray6722[i][i_1_] & 0xffff : 0;
    }

    public void method8317(int i, int i_3_, byte i_4_) {
        SceneGraphTile sceneGraphTile = tiles[0][i][i_3_];
        for (int i_5_ = 0; i_5_ < 3; i_5_++) {
            SceneGraphTile sceneGraphTile_6_ = tiles[i_5_][i][i_3_] = tiles[1 + i_5_][i][i_3_];
            if (null != sceneGraphTile_6_) {
                for (EntityIterator entityIterator = sceneGraphTile_6_.entityIterator; null != entityIterator; entityIterator = entityIterator.next) {
                    SceneEntity class600_sub1_sub3 = entityIterator.current;
                    if (i == class600_sub1_sub3.startX && class600_sub1_sub3.startY == i_3_) {
                        class600_sub1_sub3.plane--;
                    }
                }
                if (sceneGraphTile_6_.decoration != null) {
                    sceneGraphTile_6_.decoration.plane--;
                }
                if (sceneGraphTile_6_.boundary != null) {
                    sceneGraphTile_6_.boundary.plane--;
                }
                if (null != sceneGraphTile_6_.linkedBoundary) {
                    sceneGraphTile_6_.linkedBoundary.plane--;
                }
                if (null != sceneGraphTile_6_.boundaryDecoration) {
                    sceneGraphTile_6_.boundaryDecoration.plane--;
                }
                if (null != sceneGraphTile_6_.linkedBoundaryDecoration) {
                    sceneGraphTile_6_.linkedBoundaryDecoration.plane--;
                }
            }
        }
        if (null == tiles[0][i][i_3_]) {
            tiles[0][i][i_3_] = new SceneGraphTile(0);
            tiles[0][i][i_3_].level = (byte) 1;
        }
        tiles[0][i][i_3_].base = sceneGraphTile;
        tiles[3][i][i_3_] = null;
    }

    public void method8320(int i, SceneGraphLevel class120) {
        levels1[i] = class120;
    }

    public void method8325() {
        for (int i_11_ = 0; i_11_ < 173827901 * width; i_11_++) {
            for (int i_12_ = 0; i_12_ < 134933557 * length; i_12_++) {
                if (null == tiles[0][i_11_][i_12_]) {
                    tiles[0][i_11_][i_12_] = new SceneGraphTile(0);
                }
            }
        }
    }

    public void method8330(int level, int x, int y, int z, TileObject grounditem) {
        SceneGraphTile sceneGraphTile = getTileAt(level, x, y, -1692072569);
        if (null != sceneGraphTile) {
            grounditem.setPosition(new Vector3f(-142433419 * anInt6689 + (x << -1911343043 * tileScale),
                    z, anInt6689 * -142433419 + (y << tileScale * -1911343043)));
            sceneGraphTile.tileObject = grounditem;
            int i_17_ = levels1 == levels0 ? 1 : 0;
            if (grounditem.isTextured()) {
                if (grounditem.isCached()) {
                    grounditem.aClass600_Sub1_10374 = cached[i_17_];
                    cached[i_17_] = grounditem;
                } else {
                    grounditem.aClass600_Sub1_10374 = nodes[i_17_];
                    nodes[i_17_] = grounditem;
                }
            } else {
                grounditem.aClass600_Sub1_10374 = aSceneNodeArray6717[i_17_];
                aSceneNodeArray6717[i_17_] = grounditem;
            }
        }
    }

    public void method8333(int i, int i_37_, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_, int i_44_) {
        if (anIntArrayArray6735 != null) {
            anIntArrayArray6735[i][i_37_] = ~0xffffff | i_38_;
        }
        if (null != aShortArrayArray6722) {
            aShortArrayArray6722[i][i_37_] = (short) i_39_;
        }
        if (null != aByteArrayArray6707) {
            aByteArrayArray6707[i][i_37_] = (byte) i_40_;
        }
        if (null != aByteArrayArray6708) {
            aByteArrayArray6708[i][i_37_] = (byte) i_41_;
        }
        if (null != aByteArrayArray6709) {
            aByteArrayArray6709[i][i_37_] = (byte) i_42_;
        }
        if (aByteArrayArray6696 != null) {
            aByteArrayArray6696[i][i_37_] = (byte) i_43_;
        }
    }

    public void method8334(int i, int i_45_, int i_46_, int i_47_, int i_48_) {
        SceneGraphTile sceneGraphTile = tiles[i][i_45_][i_46_];
        if (null != sceneGraphTile) {
            BoundaryDecoration class600_sub1_sub2 = sceneGraphTile.boundaryDecoration;
            BoundaryDecoration class600_sub1_sub2_49_ = sceneGraphTile.linkedBoundaryDecoration;
            if (null != class600_sub1_sub2) {
                class600_sub1_sub2.aShort11453 = (short) (class600_sub1_sub2.aShort11453 * i_47_ / (16 << tileScale
                        * -1911343043 - 7));
                class600_sub1_sub2.aShort11451 = (short) (i_47_ * class600_sub1_sub2.aShort11451 / (16 << -1911343043
                        * tileScale - 7));
            }
            if (null != class600_sub1_sub2_49_) {
                class600_sub1_sub2_49_.aShort11453 = (short) (i_47_ * class600_sub1_sub2_49_.aShort11453 / (16 << -1911343043
                        * tileScale - 7));
                class600_sub1_sub2_49_.aShort11451 = (short) (i_47_ * class600_sub1_sub2_49_.aShort11451 / (16 << -1911343043
                        * tileScale - 7));
            }
        }
    }

    public void deleteEntities() {
        for (int i = 0; i < entityCount * -2097639891; i++) {
            SceneEntity entity = entities[i];
            method8397(entity, true, -2053691528);
            entities[i] = null;
        }
        entityCount = 0;
    }

    public Boundary method8336(int i, int i_51_, int i_52_, int i_53_) {
        SceneGraphTile sceneGraphTile = tiles[i][i_51_][i_52_];
        if (null != sceneGraphTile) {
            method8344(sceneGraphTile.boundary);
            if (null != sceneGraphTile.boundary) {
                Boundary class600_sub1_sub5 = sceneGraphTile.boundary;
                sceneGraphTile.boundary = null;
                return class600_sub1_sub5;
            }
        }
        return null;
    }

    public Boundary method8337(int i, int i_54_, int i_55_, int i_56_) {
        SceneGraphTile sceneGraphTile = tiles[i][i_54_][i_55_];
        if (null != sceneGraphTile) {
            method8344(sceneGraphTile.linkedBoundary);
            if (null != sceneGraphTile.linkedBoundary) {
                Boundary class600_sub1_sub5 = sceneGraphTile.linkedBoundary;
                sceneGraphTile.linkedBoundary = null;
                return class600_sub1_sub5;
            }
        }
        return null;
    }

    public void method8338(Shadow shadow, int plane, int x, int z, boolean[] bools) {
        if (levels0 != levels1) {
            int height = levels[plane].averageHeightAt(x, z);

            for (int index = 0; index <= plane; index++) {
                if (null == bools || bools[index]) {
                    SceneGraphLevel ground = levels[index];
                    if (null != ground) {
                        ground.addShadow(shadow, x, height - ground.averageHeightAt(x, z), z, 0, false);
                    }
                }
            }
        }
    }

    public BoundaryDecoration method8339(int i, int i_62_, int i_63_, int i_64_) {
        SceneGraphTile sceneGraphTile = tiles[i][i_62_][i_63_];
        if (sceneGraphTile != null) {
            method8344(sceneGraphTile.linkedBoundaryDecoration);
            if (sceneGraphTile.linkedBoundaryDecoration != null) {
                BoundaryDecoration class600_sub1_sub2 = sceneGraphTile.linkedBoundaryDecoration;
                sceneGraphTile.linkedBoundaryDecoration = null;
                return class600_sub1_sub2;
            }
        }
        return null;
    }

    public void method8340(int i, int x, int z) {
        boolean top = null != tiles[0][x][z]
                && null != tiles[0][x][z].base;
        for (int plane = i; plane >= 0; plane--) {
            if (null == tiles[plane][x][z]) {
                SceneGraphTile sceneGraphTile = tiles[plane][x][z] = new SceneGraphTile(plane);
                if (top) {
                    sceneGraphTile.level++;
                }
            }
        }
    }

    public TileObject popTileObject(int plane, int x, int z) {
        SceneGraphTile sceneGraphTile = tiles[plane][x][z];
        if (null == sceneGraphTile) {
            return null;
        }
        TileObject class600_sub1_sub1 = sceneGraphTile.tileObject;
        sceneGraphTile.tileObject = null;
        method8344(class600_sub1_sub1);
        return class600_sub1_sub1;
    }

    public SceneEntity getTopEntity(int i, int i_72_, int i_73_, SceneEntityPredicate sceneEntityPredicate) {
        SceneGraphTile sceneGraphTile = tiles[i][i_72_][i_73_];
        if (sceneGraphTile == null) {
            return null;
        }
        for (EntityIterator entityIterator = sceneGraphTile.entityIterator; null != entityIterator; entityIterator = entityIterator.next) {
            SceneEntity class600_sub1_sub3 = entityIterator.current;
            if ((null == sceneEntityPredicate || sceneEntityPredicate.test(class600_sub1_sub3, (byte) -117))
                    && i_72_ == class600_sub1_sub3.startX && i_73_ == class600_sub1_sub3.startY) {
                method8397(class600_sub1_sub3, false, -2003004464);
                return class600_sub1_sub3;
            }
        }
        return null;
    }

    public Boundary getBoundary(int i, int i_80_, int i_81_) {
        SceneGraphTile sceneGraphTile = tiles[i][i_80_][i_81_];
        if (sceneGraphTile == null) {
            return null;
        }
        return sceneGraphTile.boundary;
    }

    public Boundary getLinkedBoundary(int plane, int x, int z) {
        SceneGraphTile sceneGraphTile = tiles[plane][x][z];
        if (null == sceneGraphTile) {
            return null;
        }
        return sceneGraphTile.linkedBoundary;
    }

    public BoundaryDecoration getBoundaryDecoration(int i, int i_86_, int i_87_) {
        SceneGraphTile sceneGraphTile = tiles[i][i_86_][i_87_];
        if (sceneGraphTile == null) {
            return null;
        }
        return sceneGraphTile.boundaryDecoration;
    }

    public TileObject getTileObject(int i, int i_89_, int i_90_, byte i_91_) {
        SceneGraphTile sceneGraphTile = tiles[i][i_89_][i_90_];
        if (sceneGraphTile == null) {
            return null;
        }
        return sceneGraphTile.tileObject;
    }

    public SceneEntity getEntity(int i, int i_92_, int i_93_, SceneEntityPredicate sceneEntityPredicate) {
        SceneGraphTile sceneGraphTile = tiles[i][i_92_][i_93_];
        if (null == sceneGraphTile) {
            return null;
        }
        for (EntityIterator entityIterator = sceneGraphTile.entityIterator; entityIterator != null; entityIterator = entityIterator.next) {
            SceneEntity class600_sub1_sub3 = entityIterator.current;
            if ((null == sceneEntityPredicate || sceneEntityPredicate.test(class600_sub1_sub3, (byte) -73))
                    && i_92_ == class600_sub1_sub3.startX && i_93_ == class600_sub1_sub3.startY) {
                return class600_sub1_sub3;
            }
        }
        return null;
    }

    public EntityIterator getEntityIterator(int i, int i_95_, int i_96_, int i_97_) {
        SceneGraphTile sceneGraphTile = tiles[i][i_95_][i_96_];
        if (sceneGraphTile == null) {
            return null;
        }
        return sceneGraphTile.entityIterator;
    }

    public TileDecoration getTileDecoration(int plane, int x, int z) {
        SceneGraphTile sceneGraphTile = tiles[plane][x][z];
        if (null == sceneGraphTile || null == sceneGraphTile.decoration) {
            return null;
        }

        return sceneGraphTile.decoration;
    }

    public void method8352() {
        for (int i = 0; i < 453886331 * levelCount; i++) {
            for (int i_101_ = 0; i_101_ < width * 173827901; i_101_++) {
                for (int i_102_ = 0; i_102_ < length * 134933557; i_102_++) {
                    SceneGraphTile sceneGraphTile = tiles[i][i_101_][i_102_];
                    if (null != sceneGraphTile) {
                        Boundary class600_sub1_sub5 = sceneGraphTile.boundary;
                        Boundary class600_sub1_sub5_103_ = sceneGraphTile.linkedBoundary;
                        if (null != class600_sub1_sub5 && class600_sub1_sub5.method16302()) {
                            method8464(class600_sub1_sub5, i, i_101_, i_102_, 1, 1);
                            if (class600_sub1_sub5_103_ != null && class600_sub1_sub5_103_.method16302()) {
                                method8464(class600_sub1_sub5_103_, i, i_101_, i_102_, 1, 1);
                                class600_sub1_sub5_103_.method16262(toolkit, class600_sub1_sub5, 0, 0, 0, false,
                                        -1803335401);
                                class600_sub1_sub5_103_.method16263();
                            }
                            class600_sub1_sub5.method16263();
                        }
                        for (EntityIterator entityIterator = sceneGraphTile.entityIterator; entityIterator != null; entityIterator = entityIterator.next) {
                            SceneEntity class600_sub1_sub3 = entityIterator.current;
                            if (class600_sub1_sub3 != null && class600_sub1_sub3.method16302()) {
                                method8464(class600_sub1_sub3, i, i_101_, i_102_, class600_sub1_sub3.endX
                                        - class600_sub1_sub3.startX + 1, 1 + class600_sub1_sub3.endY
                                        - class600_sub1_sub3.startY);
                                class600_sub1_sub3.method16263();
                            }
                        }
                        TileDecoration class600_sub1_sub4 = sceneGraphTile.decoration;
                        if (null != class600_sub1_sub4 && class600_sub1_sub4.method16302()) {
                            method8412(class600_sub1_sub4, i, i_101_, i_102_, (byte) -29);
                            class600_sub1_sub4.method16263();
                        }
                    }
                }
            }
        }
    }

    public void method8353(int i, int i_104_, int i_105_, BoundaryDecoration class600_sub1_sub2,
                           BoundaryDecoration class600_sub1_sub2_106_, int i_107_) {
        SceneGraphTile sceneGraphTile = getTileAt(i, i_104_, i_105_, -1648840922);
        if (null != sceneGraphTile) {
            sceneGraphTile.boundaryDecoration = class600_sub1_sub2;
            sceneGraphTile.linkedBoundaryDecoration = class600_sub1_sub2_106_;
            int i_108_ = levels1 == levels0 ? 1 : 0;
            if (class600_sub1_sub2.isTextured()) {
                if (class600_sub1_sub2.isCached()) {
                    class600_sub1_sub2.aClass600_Sub1_10374 = cached[i_108_];
                    cached[i_108_] = class600_sub1_sub2;
                } else {
                    class600_sub1_sub2.aClass600_Sub1_10374 = nodes[i_108_];
                    nodes[i_108_] = class600_sub1_sub2;
                }
            } else {
                class600_sub1_sub2.aClass600_Sub1_10374 = aSceneNodeArray6717[i_108_];
                aSceneNodeArray6717[i_108_] = class600_sub1_sub2;
            }
            if (null != class600_sub1_sub2_106_) {
                if (class600_sub1_sub2_106_.isTextured()) {
                    if (class600_sub1_sub2_106_.isCached()) {
                        class600_sub1_sub2_106_.aClass600_Sub1_10374 = cached[i_108_];
                        cached[i_108_] = class600_sub1_sub2_106_;
                    } else {
                        class600_sub1_sub2_106_.aClass600_Sub1_10374 = nodes[i_108_];
                        nodes[i_108_] = class600_sub1_sub2_106_;
                    }
                } else {
                    class600_sub1_sub2_106_.aClass600_Sub1_10374 = aSceneNodeArray6717[i_108_];
                    aSceneNodeArray6717[i_108_] = class600_sub1_sub2_106_;
                }
            }
        }
    }

    public void method8355(int var0, int var1, int var2, int var3, byte[][][] var4, int[] var5, int[] var6,
                           int[] var7, int[] var8, int[] var9, int var10, byte var11, int var12, int var13, boolean var14,
                           boolean var15, int var16, boolean var17) {
        aClass492_6695.aBool6757 = true;
        aBool6694 = var15;
        anInt6723 = 1081834437 * (var1 >> -1911343043 * tileScale);
        anInt6724 = 908265389 * (var3 >> -1911343043 * tileScale);
        anInt6725 = var1 * 864500771;
        anInt6750 = var3 * -1462243815;
        anInt6727 = var2 * -1779660115;
        anInt6697 = 863365335 * anInt6723 - anInt6686 * -158480555;
        if (1982708411 * anInt6697 < 0) {
            anInt6730 = -(722138169 * anInt6697);
            anInt6697 = 0;
        } else {
            anInt6730 = 0;
        }
        anInt6734 = 409409009 * anInt6724 - anInt6686 * 471261915;
        if (anInt6734 * -328417931 < 0) {
            anInt6699 = -(-1540791759 * anInt6734);
            anInt6734 = 0;
        } else {
            anInt6699 = 0;
        }
        anInt6710 = 580530761 * anInt6723 + anInt6686 * 891293707;
        if (-1010380123 * anInt6710 > width * 173827901) {
            anInt6710 = 1124341433 * width;
        }
        anInt6746 = 438041823 * anInt6724 + 874882069 * anInt6686;
        if (-1594872965 * anInt6746 > length * 134933557) {
            anInt6746 = 785063951 * length;
        }
        boolean[][] bools = aBoolArrayArray6733;
        boolean[][] bools_124_ = aBoolArrayArray6747;
        if (aBool6694) {
            for (int i_125_ = 0; i_125_ < 2 + 1414880535 * anInt6686 + anInt6686 * 1414880535; i_125_++) {
                int i_126_ = 0;
                int i_127_ = 0;
                for (int i_128_ = 0; i_128_ < 1414880535 * anInt6686 + 1414880535 * anInt6686 + 2; i_128_++) {
                    if (i_128_ > 1) {
                        anIntArray6748[i_128_ - 2] = i_126_;
                    }
                    i_126_ = i_127_;
                    int i_129_ = i_125_ + 1243106061 * anInt6723 - 1414880535 * anInt6686;
                    int i_130_ = -1342442459 * anInt6724 - 1414880535 * anInt6686 + i_128_;
                    if (i_129_ >= 0 && i_130_ >= 0 && i_129_ < width * 173827901 && i_130_ < length * 134933557) {
                        int i_131_ = i_129_ << tileScale * -1911343043;
                        int i_132_ = i_130_ << -1911343043 * tileScale;
                        int i_133_ = levels[levels.length - 1].getTileHeight(i_129_, i_130_)
                                - (1000 << tileScale * -1911343043 - 7);
                        int i_134_ = (levels0 != null ? levels0[0].getTileHeight(i_129_, i_130_)
                                + -57333661 * anInt6688 : levels[0].getTileHeight(i_129_, i_130_)
                                + anInt6688 * -57333661)
                                + (1000 << -1911343043 * tileScale - 7);
                        i_127_ = toolkit.update(i_131_, i_133_, i_132_, i_131_, i_134_, i_132_);
                        aBoolArrayArray6747[i_125_][i_128_] = i_127_ == 0;
                    } else {
                        i_127_ = -1;
                        aBoolArrayArray6747[i_125_][i_128_] = false;
                    }
                    if (i_125_ > 0 && i_128_ > 0) {
                        int i_135_ = anIntArray6748[i_128_ - 1] & anIntArray6748[i_128_] & i_126_ & i_127_;
                        aBoolArrayArray6733[i_125_ - 1][i_128_ - 1] = i_135_ == 0;
                    }
                }
                anIntArray6748[1414880535 * anInt6686 + anInt6686 * 1414880535] = i_126_;
                anIntArray6748[anInt6686 * 1414880535 + anInt6686 * 1414880535 + 1] = i_127_;
            }
            if (!var17) {
                aClass492_6695.aBool6757 = false;
            } else {
                aClass492_6695.anIntArray6775 = var5;
                aClass492_6695.anIntArray6764 = var6;
                aClass492_6695.anIntArray6784 = var7;
                aClass492_6695.anIntArray6772 = var8;
                aClass492_6695.anIntArray6779 = var9;
                aClass492_6695.method8488(toolkit, var10);
            }
        } else {
            if (aBoolArrayArray6749 == null) {
                aBoolArrayArray6749 = new boolean[2 + 1414880535 * anInt6686 + 1414880535 * anInt6686][2 + anInt6686
                        * 1414880535 + anInt6686 * 1414880535];
            }
            for (int i_136_ = 0; i_136_ < aBoolArrayArray6749.length; i_136_++) {
                for (int i_137_ = 0; i_137_ < aBoolArrayArray6749[0].length; i_137_++) {
                    aBoolArrayArray6749[i_136_][i_137_] = true;
                }
            }
            aBoolArrayArray6747 = aBoolArrayArray6749;
            aBoolArrayArray6733 = aBoolArrayArray6749;
            anInt6697 = 0;
            anInt6734 = 0;
            anInt6710 = width * 1124341433;
            anInt6746 = length * 785063951;
            aClass492_6695.aBool6757 = false;
        }
        Camera.method4960(this, toolkit);
        if (!aClass497_6711.aBool6882) {
            Iterator iterator = aClass497_6711.elements.iterator();
            while (iterator.hasNext()) {
                MouseOverEntity class506 = (MouseOverEntity) iterator.next();
                iterator.remove();
                ArchiveFileLoader.method6965(class506);
            }
        }
        if (aBool6693) {
            for (int i_138_ = 0; i_138_ < anInt6731 * 743040281; i_138_++) {
                aClass504Array6742[i_138_].method8713(var0, var14);
            }
        }
        if (tiles2 != null) {
            method8315(true);
            toolkit.method2414(-1, new Class150(1583160, 40, 127, 63, 0, 0, 0));
            method8332(true, var4, var10, var11, var16);
            toolkit.method2501();
            method8315(false);
        }
        method8332(false, var4, var10, var11, var16);
        if (!aBool6694) {
            aBoolArrayArray6733 = bools;
            aBoolArrayArray6747 = bools_124_;
        }
    }

    public HashMap method8358() {
        pointLightMap.clear();
        for (Entry<Integer, List<Class504>> entry : class504Map.entrySet()) {
            pointLightMap.put(entry.getKey(), ((Class504) ((List) entry.getValue()).get(0)).light);
        }
        return pointLightMap;
    }

    public void method8359(int i, int i_139_, int i_140_, Boundary class600_sub1_sub5,
                           Boundary class600_sub1_sub5_141_, int i_142_) {
        SceneGraphTile sceneGraphTile = getTileAt(i, i_139_, i_140_, -1966362450);
        if (null != sceneGraphTile) {
            sceneGraphTile.boundary = class600_sub1_sub5;
            sceneGraphTile.linkedBoundary = class600_sub1_sub5_141_;
            int i_143_ = levels0 == levels1 ? 1 : 0;
            if (class600_sub1_sub5.isTextured()) {
                if (class600_sub1_sub5.isCached()) {
                    class600_sub1_sub5.aClass600_Sub1_10374 = cached[i_143_];
                    cached[i_143_] = class600_sub1_sub5;
                } else {
                    class600_sub1_sub5.aClass600_Sub1_10374 = nodes[i_143_];
                    nodes[i_143_] = class600_sub1_sub5;
                }
            } else {
                class600_sub1_sub5.aClass600_Sub1_10374 = aSceneNodeArray6717[i_143_];
                aSceneNodeArray6717[i_143_] = class600_sub1_sub5;
            }
            if (class600_sub1_sub5_141_ != null) {
                if (class600_sub1_sub5_141_.isTextured()) {
                    if (class600_sub1_sub5_141_.isCached()) {
                        class600_sub1_sub5_141_.aClass600_Sub1_10374 = cached[i_143_];
                        cached[i_143_] = class600_sub1_sub5_141_;
                    } else {
                        class600_sub1_sub5_141_.aClass600_Sub1_10374 = nodes[i_143_];
                        nodes[i_143_] = class600_sub1_sub5_141_;
                    }
                } else {
                    class600_sub1_sub5_141_.aClass600_Sub1_10374 = aSceneNodeArray6717[i_143_];
                    aSceneNodeArray6717[i_143_] = class600_sub1_sub5_141_;
                }
            }
        }
    }

    public boolean method8362(Shadow class480_sub31_sub12, int i, int i_155_, int i_156_, boolean[] bools) {
        boolean bool = false;
        if (levels1 != levels0) {
            int i_158_ = levels[i].averageHeightAt(i_155_, i_156_);
            int i_159_ = 0;
            for (; i_159_ <= i; i_159_++) {
                SceneGraphLevel class120 = levels[i_159_];
                if (class120 != null) {
                    int i_160_ = i_158_ - class120.averageHeightAt(i_155_, i_156_);
                    if (null != bools) {
                        bools[i_159_] = class120.method2197(class480_sub31_sub12, i_155_, i_160_, i_156_, 0, false);
                        if (!bools[i_159_]) {
                            continue;
                        }
                    }
                    class120.deleteShadow(class480_sub31_sub12, i_155_, i_160_, i_156_, 0, false);
                    bool = true;
                }
            }
        }
        return bool;
    }

    public int getConfig4(int x, int z) {
        return aByteArrayArray6708 != null ? aByteArrayArray6708[x][z] & 0xff : 0;
    }

    public void method8366(Class504 class504, int i) {
        if (743040281 * anInt6731 < 65279) {
            PointLight light = class504.light;
            aClass504Array6742[743040281 * anInt6731] = class504;
            aBoolArray6743[anInt6731 * 743040281] = false;
            anInt6731 += 693085993;

            int i_176_ = class504.anInt6948 * 297507485;
            if (class504.aBool6947) {
                i_176_ = 0;
            }

            int i_177_ = 297507485 * class504.anInt6948;
            if (class504.aBool6923) {
                i_177_ = levelCount * 453886331 - 1;
            }

            for (int i_178_ = i_176_; i_178_ <= i_177_; i_178_++) {
                int i_179_ = 0;
                int i_180_ = light.getZ() - light.getRange() + -142433419 * anInt6689 >> tileScale * -1911343043;
                if (i_180_ < 0) {
                    i_179_ -= i_180_;
                    i_180_ = 0;
                }
                int i_181_ = light.getZ() + light.getRange() - anInt6689 * -142433419 >> -1911343043 * tileScale;
                if (i_181_ >= 134933557 * length) {
                    i_181_ = length * 134933557 - 1;
                }
                for (int i_182_ = i_180_; i_182_ <= i_181_; i_182_++) {
                    int i_183_ = class504.aShortArray6940[i_179_++];
                    int i_184_ = (light.getX() - light.getRange() + -142433419 * anInt6689 >> tileScale * -1911343043)
                            + (i_183_ >>> 8);
                    int i_185_ = i_184_ + (i_183_ & 0xff) - 1;
                    if (i_184_ < 0) {
                        i_184_ = 0;
                    }
                    if (i_185_ >= width * 173827901) {
                        i_185_ = 173827901 * width - 1;
                    }
                    for (int i_186_ = i_184_; i_186_ <= i_185_; i_186_++) {
                        long l = aLongArrayArrayArray6720[i_178_][i_186_][i_182_];
                        if ((l & 0xffffL) == 0L) {
                            aLongArrayArrayArray6720[i_178_][i_186_][i_182_] = l | 743040281 * anInt6731;
                        } else if (0L == (l & 0xffff0000L)) {
                            aLongArrayArrayArray6720[i_178_][i_186_][i_182_] = l | (long) (743040281 * anInt6731) << 16;
                        } else if (0L == (l & 0xffff00000000L)) {
                            aLongArrayArrayArray6720[i_178_][i_186_][i_182_] = l | (long) (743040281 * anInt6731) << 32;
                        } else if (0L == (l & ~0xffffffffffffL)) {
                            aLongArrayArrayArray6720[i_178_][i_186_][i_182_] = l | (long) (743040281 * anInt6731) << 48;
                        }
                    }
                }
            }
            if (-1 != class504.anInt6931 * -2115562621) {
                List<Class504> list = class504Map.get(Integer.valueOf(class504.anInt6931 * -2115562621));
                if (null == list) {
                    list = new ArrayList<>();
                    class504Map.put(Integer.valueOf(class504.anInt6931 * -2115562621), list);
                }
                list.add(class504);
                PointLight class480_sub23_187_ = pointLightMap.get(Integer.valueOf(class504.anInt6931
                        * -2115562621));
                if (null != class480_sub23_187_) {
                    class504.light.method15986(class480_sub23_187_.getColour());
                    class504.light.method15987(class480_sub23_187_.method15984(), class480_sub23_187_.method15985());
                }
            }
        }
    }

    public void method8367(int i) {
        for (int i_188_ = 0; i_188_ < anInt6731 * 743040281; i_188_++) {
            if (!aBoolArray6743[i_188_]) {
                Class504 class504 = aClass504Array6742[i_188_];
                PointLight class480_sub23 = class504.light;
                int i_189_ = 297507485 * class504.anInt6948;
                int i_190_ = class480_sub23.getRange() - anInt6689 * -142433419;
                int i_191_ = 1 + (2 * i_190_ >> -1911343043 * tileScale);
                int i_192_ = 0;
                int[] is = new int[i_191_ * i_191_];
                int i_193_ = class480_sub23.getX() - i_190_ >> -1911343043 * tileScale;
                int i_194_ = class480_sub23.getZ() - i_190_ >> -1911343043 * tileScale;
                int i_195_ = class480_sub23.getZ() + i_190_ >> tileScale * -1911343043;
                if (i_194_ < 0) {
                    i_192_ -= i_194_;
                    i_194_ = 0;
                }
                if (i_195_ >= length * 134933557) {
                    i_195_ = length * 134933557 - 1;
                }
                for (int i_196_ = i_194_; i_196_ <= i_195_; i_196_++) {
                    int i_197_ = class504.aShortArray6940[i_192_];
                    int i_198_ = i_197_ >>> 8;
                    int i_199_ = i_198_ + i_192_ * i_191_;
                    int i_200_ = (i_197_ >>> 8) + i_193_;
                    int i_201_ = (i_197_ & 0xff) + i_200_ - 1;
                    if (i_200_ < 0) {
                        i_199_ -= i_200_;
                        i_200_ = 0;
                    }
                    if (i_201_ >= 173827901 * width) {
                        i_201_ = width * 173827901 - 1;
                    }
                    for (int i_202_ = i_200_; i_202_ <= i_201_; i_202_++) {
                        int i_203_ = 1;
                        SceneEntity class600_sub1_sub3 = getEntity(i_189_, i_202_, i_196_, null);
                        if (class600_sub1_sub3 != null && 0 != class600_sub1_sub3.aByte11462) {
                            if (1 == class600_sub1_sub3.aByte11462) {
                                boolean bool = i_202_ - 1 >= i_200_;
                                boolean bool_204_ = 1 + i_202_ <= i_201_;
                                if (!bool && i_196_ + 1 <= i_195_) {
                                    int i_205_ = class504.aShortArray6940[1 + i_192_];
                                    int i_206_ = i_193_ + (i_205_ >>> 8);
                                    int i_207_ = i_206_ + (i_205_ & 0xff);
                                    bool = i_202_ > i_206_ && i_202_ < i_207_;
                                }
                                if (!bool_204_ && i_196_ - 1 >= i_194_) {
                                    int i_208_ = class504.aShortArray6940[i_192_ - 1];
                                    int i_209_ = (i_208_ >>> 8) + i_193_;
                                    int i_210_ = (i_208_ & 0xff) + i_209_;
                                    bool_204_ = i_202_ > i_209_ && i_202_ < i_210_;
                                }
                                if (bool && !bool_204_) {
                                    i_203_ = 4;
                                } else if (bool_204_ && !bool) {
                                    i_203_ = 2;
                                }
                            } else {
                                boolean bool = i_202_ - 1 >= i_200_;
                                boolean bool_211_ = 1 + i_202_ <= i_201_;
                                if (!bool && i_196_ - 1 >= i_194_) {
                                    int i_212_ = class504.aShortArray6940[i_192_ - 1];
                                    int i_213_ = i_193_ + (i_212_ >>> 8);
                                    int i_214_ = i_213_ + (i_212_ & 0xff);
                                    bool = i_202_ > i_213_ && i_202_ < i_214_;
                                }
                                if (!bool_211_ && 1 + i_196_ <= i_195_) {
                                    int i_215_ = class504.aShortArray6940[1 + i_192_];
                                    int i_216_ = (i_215_ >>> 8) + i_193_;
                                    int i_217_ = (i_215_ & 0xff) + i_216_;
                                    bool_211_ = i_202_ > i_216_ && i_202_ < i_217_;
                                }
                                if (bool && !bool_211_) {
                                    i_203_ = 3;
                                } else if (bool_211_ && !bool) {
                                    i_203_ = 5;
                                }
                            }
                        }
                        is[i_199_++] = i_203_;
                    }
                    i_192_++;
                }
                aBoolArray6743[i_188_] = true;
                if (renderLight) {
                    levels1[i_189_].addLight(class480_sub23, is);
                }
            }
        }
    }

    public int getColor(int i, int i_218_) {
        return anIntArrayArray6735 != null ? anIntArrayArray6735[i][i_218_] & 0xffffff : 0;
    }

    public void method8370(HashMap hashmap) {
        pointLightMap = hashmap;
    }

    public int getIntensity(int i, int i_220_) {
        return null != aByteArrayArray6707 ? aByteArrayArray6707[i][i_220_] & 0xff : 0;
    }

    public TileDecoration method8382(int i, int i_222_, int i_223_, int i_224_) {
        SceneGraphTile sceneGraphTile = tiles[i][i_222_][i_223_];
        if (null == sceneGraphTile) {
            return null;
        }
        method8344(sceneGraphTile.decoration);
        if (null != sceneGraphTile.decoration) {
            TileDecoration class600_sub1_sub4 = sceneGraphTile.decoration;
            sceneGraphTile.decoration = null;
            return class600_sub1_sub4;
        }
        return null;
    }

    public void method8406(int i) {
        method8364(1, levelCount * 453886331, (byte) -44);
    }

    public boolean method8423(SceneEntity class600_sub1_sub3, boolean bool) {
        boolean bool_253_ = levels1 == levels0;
        int i_254_ = 0;
        short i_255_ = 0;
        byte i_256_ = 0;
        class600_sub1_sub3.method17912();
        short i_257_ = 0;
        int i_258_ = Math.min(width * 173827901 - 1, Math.max(0, class600_sub1_sub3.startX));
        int i_259_ = Math.min(width * 173827901 - 1, Math.max(0, class600_sub1_sub3.endX));
        int i_260_ = Math.min(134933557 * length - 1, Math.max(0, class600_sub1_sub3.startY));
        int i_261_ = Math.min(134933557 * length - 1, Math.max(0, class600_sub1_sub3.endY));
        for (int i_262_ = i_258_; i_262_ <= i_259_; i_262_++) {
            for (int i_263_ = i_260_; i_263_ <= i_261_; i_263_++) {
                SceneGraphTile sceneGraphTile = method8319(class600_sub1_sub3.plane, i_262_, i_263_, -821118350);
                if (sceneGraphTile != null) {
                    EntityIterator entityIterator = EntityIterator.method5373(class600_sub1_sub3, -1311145111);
                    EntityIterator entityIterator_264_ = sceneGraphTile.entityIterator;
                    if (entityIterator_264_ == null) {
                        sceneGraphTile.entityIterator = entityIterator;
                    } else {
                        for (; entityIterator_264_.next != null; entityIterator_264_ = entityIterator_264_.next) {

                        }
                        entityIterator_264_.next = entityIterator;
                    }
                    if (bool_253_ && (anIntArrayArray6735[i_262_][i_263_] & ~0xffffff) != 0) {
                        i_254_ = anIntArrayArray6735[i_262_][i_263_];
                        i_255_ = aShortArrayArray6722[i_262_][i_263_];
                        i_256_ = aByteArrayArray6707[i_262_][i_263_];
                    }
                    if (!bool && sceneGraphTile.decoration != null
                            && sceneGraphTile.decoration.aShort11466 > i_257_) {
                        i_257_ = sceneGraphTile.decoration.aShort11466;
                    }
                }
            }
        }
        if (bool_253_ && (i_254_ & ~0xffffff) != 0) {
            for (int i_265_ = i_258_; i_265_ <= i_259_; i_265_++) {
                for (int i_266_ = i_260_; i_266_ <= i_261_; i_266_++) {
                    if ((anIntArrayArray6735[i_265_][i_266_] & ~0xffffff) == 0) {
                        anIntArrayArray6735[i_265_][i_266_] = i_254_;
                        aShortArrayArray6722[i_265_][i_266_] = i_255_;
                        aByteArrayArray6707[i_265_][i_266_] = i_256_;
                    }
                }
            }
        }
        if (bool) {
            entities[(entityCount += -1538985563) * -2097639891 - 1] = class600_sub1_sub3;
            class600_sub1_sub3.graph = this;
        } else {
            int i_267_ = levels0 == levels1 ? 1 : 0;
            if (class600_sub1_sub3.isTextured()) {
                if (class600_sub1_sub3.isCached()) {
                    class600_sub1_sub3.aClass600_Sub1_10374 = cached[i_267_];
                    cached[i_267_] = class600_sub1_sub3;
                } else {
                    class600_sub1_sub3.aClass600_Sub1_10374 = nodes[i_267_];
                    nodes[i_267_] = class600_sub1_sub3;
                }
            } else {
                class600_sub1_sub3.aClass600_Sub1_10374 = aSceneNodeArray6717[i_267_];
                aSceneNodeArray6717[i_267_] = class600_sub1_sub3;
            }
        }
        if (bool) {
            Vector3f vector3f = Vector3f.copyOf(class600_sub1_sub3.getCoordinateSpace().translation);
            vector3f.y -= i_257_;
            class600_sub1_sub3.setPosition(vector3f);
            vector3f.cache();
        }
        return true;
    }

    public int getConfig2(int x, int z) {
        return aByteArrayArray6709 != null ? aByteArrayArray6709[x][z] & 0xff : 0;
    }

    public void method8446(int i, int i_270_, int i_271_, TileDecoration class600_sub1_sub4, int i_272_) {
        SceneGraphTile sceneGraphTile = getTileAt(i, i_270_, i_271_, -1527857148);
        if (sceneGraphTile != null) {
            sceneGraphTile.decoration = class600_sub1_sub4;
            int i_273_ = levels0 == levels1 ? 1 : 0;
            if (class600_sub1_sub4.isTextured()) {
                if (class600_sub1_sub4.isCached()) {
                    class600_sub1_sub4.aClass600_Sub1_10374 = cached[i_273_];
                    cached[i_273_] = class600_sub1_sub4;
                } else {
                    class600_sub1_sub4.aClass600_Sub1_10374 = nodes[i_273_];
                    nodes[i_273_] = class600_sub1_sub4;
                }
            } else {
                class600_sub1_sub4.aClass600_Sub1_10374 = aSceneNodeArray6717[i_273_];
                aSceneNodeArray6717[i_273_] = class600_sub1_sub4;
            }
        }
    }

    public void method8461(int i, int i_280_, int i_281_, byte i_282_) {
        List list = class504Map.get(Integer.valueOf(i));
        if (list != null) {
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                Class504 class504 = (Class504) iterator.next();
                class504.light.method15987(i_280_, i_281_);
            }
        }
    }

    public BoundaryDecoration method8463(int i, int i_283_, int i_284_, int i_285_) {
        SceneGraphTile sceneGraphTile = tiles[i][i_283_][i_284_];
        if (null != sceneGraphTile) {
            method8344(sceneGraphTile.boundaryDecoration);
            if (null != sceneGraphTile.boundaryDecoration) {
                BoundaryDecoration class600_sub1_sub2 = sceneGraphTile.boundaryDecoration;
                sceneGraphTile.boundaryDecoration = null;
                return class600_sub1_sub2;
            }
        }
        return null;
    }

    public int getConfig3(int x, int z) {
        return null != aByteArrayArray6696 ? aByteArrayArray6696[x][z] & 0xff : 0;
    }

    SceneGraphTile method8319(int i, int i_7_, int i_8_, int i_9_) {
        return getTileAt(i, Math.min(173827901 * width - 1, Math.max(0, i_7_)),
                Math.min(134933557 * length - 1, Math.max(0, i_8_)), -2056490941);
    }

    void method8332(boolean bool, byte[][][] is, int i, byte i_18_, int i_19_) {
        int i_20_ = bool ? 1 : 0;
        anInt6718 = 0;
        anInt6726 = 0;
        anInt6745 += -1521792793;
        if (0 == (i_19_ & 0x2)) {
            for (SceneNode class600_sub1 = nodes[i_20_]; null != class600_sub1; class600_sub1 = class600_sub1.aClass600_Sub1_10374) {
                method8357(class600_sub1, -1477055610);
                if (-1777491969 * class600_sub1.anInt10377 != -1 && !method8360(class600_sub1, bool, is, i, i_18_)) {
                    aSceneNodeArray6721[(anInt6718 += 1664304179) * 568415995 - 1] = class600_sub1;
                }
            }
        }
        if ((i_19_ & 0x1) == 0) {
            for (SceneNode class600_sub1 = cached[i_20_]; null != class600_sub1; class600_sub1 = class600_sub1.aClass600_Sub1_10374) {
                method8357(class600_sub1, -1098160415);
                if (class600_sub1.anInt10377 * -1777491969 != -1 && !method8360(class600_sub1, bool, is, i, i_18_)) {
                    aSceneNodeArray6714[(anInt6726 += -91806295) * 5852825 - 1] = class600_sub1;
                }
            }
            for (SceneNode class600_sub1 = aSceneNodeArray6717[i_20_]; class600_sub1 != null; class600_sub1 = class600_sub1.aClass600_Sub1_10374) {
                method8357(class600_sub1, -2132436841);
                if (class600_sub1.anInt10377 * -1777491969 != -1 && !method8360(class600_sub1, bool, is, i, i_18_)) {
                    if (class600_sub1.isCached()) {
                        aSceneNodeArray6714[(anInt6726 += -91806295) * 5852825 - 1] = class600_sub1;
                    } else {
                        aSceneNodeArray6721[(anInt6718 += 1664304179) * 568415995 - 1] = class600_sub1;
                    }
                }
            }
            if (!bool) {
                for (int i_21_ = 0; i_21_ < -2097639891 * entityCount; i_21_++) {
                    method8357(entities[i_21_], -532847517);
                    if (entities[i_21_].anInt10377 * -1777491969 != -1
                            && !method8360(entities[i_21_], bool, is, i, i_18_)) {
                        if (entities[i_21_].isCached()) {
                            aSceneNodeArray6714[(anInt6726 += -91806295) * 5852825 - 1] = entities[i_21_];
                        } else {
                            aSceneNodeArray6721[(anInt6718 += 1664304179) * 568415995 - 1] = entities[i_21_];
                        }
                    }
                }
            }
        }
        if (568415995 * anInt6718 > 0) {
            method8390(aSceneNodeArray6721, 0, anInt6718 * 568415995 - 1);
            for (int i_22_ = 0; i_22_ < 568415995 * anInt6718; i_22_++) {
                method8361(aSceneNodeArray6721[i_22_], lights);
            }
        }
        if (aBool6693) {
            toolkit.method2482(0, null);
        }
        if ((i_19_ & 0x2) == 0) {
            for (int i_23_ = 0; i_23_ < levelCount * 453886331; i_23_++) {
                if (i_23_ >= i && null != is) {
                    int i_24_ = aBoolArrayArray6733.length;
                    if (aBoolArrayArray6733.length + anInt6697 * 1982708411 > width * 173827901) {
                        i_24_ -= anInt6697 * 1982708411 + aBoolArrayArray6733.length - width * 173827901;
                    }
                    int i_25_ = aBoolArrayArray6733[0].length;
                    if (anInt6734 * -328417931 + aBoolArrayArray6733[0].length > length * 134933557) {
                        i_25_ -= anInt6734 * -328417931 + aBoolArrayArray6733[0].length - 134933557 * length;
                    }
                    boolean[][] bools = aBoolArrayArray6747;
                    if (aBool6694) {
                        for (int i_26_ = -410292589 * anInt6730; i_26_ < i_24_; i_26_++) {
                            int i_27_ = 1982708411 * anInt6697 + i_26_ - anInt6730 * -410292589;
                            for (int i_28_ = anInt6699 * -545269115; i_28_ < i_25_; i_28_++) {
                                bools[i_26_][i_28_] = false;
                                if (aBoolArrayArray6733[i_26_][i_28_]) {
                                    int i_29_ = anInt6734 * -328417931 + i_28_ - anInt6699 * -545269115;
                                    for (int i_30_ = i_23_; i_30_ >= 0; i_30_--) {
                                        if (tiles[i_30_][i_27_][i_29_] != null
                                                && tiles[i_30_][i_27_][i_29_].level == i_23_) {
                                            bools[i_26_][i_28_] = !(i_30_ >= i && is[i_30_][i_27_][i_29_] == i_18_ || aClass492_6695
                                                    .method8492(i_23_, i_27_, i_29_));
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    levels1[i_23_].method2216(1243106061 * anInt6723, anInt6724 * -1342442459,
                            1414880535 * anInt6686, aBoolArrayArray6747, false, i_19_);
                } else {
                    int i_31_ = aBoolArrayArray6733.length;
                    if (aBoolArrayArray6733.length + 1982708411 * anInt6697 > width * 173827901) {
                        i_31_ -= aBoolArrayArray6733.length + anInt6697 * 1982708411 - 173827901 * width;
                    }
                    int i_32_ = aBoolArrayArray6733[0].length;
                    if (anInt6734 * -328417931 + aBoolArrayArray6733[0].length > length * 134933557) {
                        i_32_ -= anInt6734 * -328417931 + aBoolArrayArray6733[0].length - length * 134933557;
                    }
                    boolean[][] bools = aBoolArrayArray6747;
                    if (aBool6694) {
                        for (int i_33_ = -410292589 * anInt6730; i_33_ < i_31_; i_33_++) {
                            int i_34_ = anInt6697 * 1982708411 + i_33_ - -410292589 * anInt6730;
                            for (int i_35_ = anInt6699 * -545269115; i_35_ < i_32_; i_35_++) {
                                bools[i_33_][i_35_] = aBoolArrayArray6733[i_33_][i_35_]
                                        && !aClass492_6695.method8492(i_23_, i_34_, i_35_ + -328417931 * anInt6734
                                        - -545269115 * anInt6699);
                            }
                        }
                    }
                    levels1[i_23_].method2216(anInt6723 * 1243106061, anInt6724 * -1342442459,
                            1414880535 * anInt6686, aBoolArrayArray6747, true, i_19_);
                }
            }
        }
        if (5852825 * anInt6726 > 0) {
            method8448(aSceneNodeArray6714, 0, 5852825 * anInt6726 - 1);
            for (int i_36_ = 0; i_36_ < 5852825 * anInt6726; i_36_++) {
                method8361(aSceneNodeArray6714[i_36_], lights);
            }
        }
    }

    void method8344(SceneNode class600_sub1) {
        if (class600_sub1 != null) {
            class600_sub1.method10174();
            for (int i_75_ = 0; i_75_ < 2; i_75_++) {
                SceneNode class600_sub1_76_ = null;
                for (SceneNode class600_sub1_77_ = nodes[i_75_]; class600_sub1_77_ != null; class600_sub1_77_ = class600_sub1_77_.aClass600_Sub1_10374) {
                    if (class600_sub1_77_ == class600_sub1) {
                        if (class600_sub1_76_ != null) {
                            class600_sub1_76_.aClass600_Sub1_10374 = class600_sub1_77_.aClass600_Sub1_10374;
                        } else {
                            nodes[i_75_] = class600_sub1_77_.aClass600_Sub1_10374;
                        }
                        return;
                    }
                    class600_sub1_76_ = class600_sub1_77_;
                }
                class600_sub1_76_ = null;
                for (SceneNode class600_sub1_78_ = cached[i_75_]; null != class600_sub1_78_; class600_sub1_78_ = class600_sub1_78_.aClass600_Sub1_10374) {
                    if (class600_sub1_78_ == class600_sub1) {
                        if (null != class600_sub1_76_) {
                            class600_sub1_76_.aClass600_Sub1_10374 = class600_sub1_78_.aClass600_Sub1_10374;
                        } else {
                            cached[i_75_] = class600_sub1_78_.aClass600_Sub1_10374;
                        }
                        return;
                    }
                    class600_sub1_76_ = class600_sub1_78_;
                }
                class600_sub1_76_ = null;
                for (SceneNode class600_sub1_79_ = aSceneNodeArray6717[i_75_]; null != class600_sub1_79_; class600_sub1_79_ = class600_sub1_79_.aClass600_Sub1_10374) {
                    if (class600_sub1_79_ == class600_sub1) {
                        if (class600_sub1_76_ != null) {
                            class600_sub1_76_.aClass600_Sub1_10374 = class600_sub1_79_.aClass600_Sub1_10374;
                        } else {
                            aSceneNodeArray6717[i_75_] = class600_sub1_79_.aClass600_Sub1_10374;
                        }
                        return;
                    }
                    class600_sub1_76_ = class600_sub1_79_;
                }
            }
        }
    }

    void method8357(SceneNode class600_sub1, int i) {
        Vector3f vector3f = class600_sub1.getCoordinateSpace().translation;
        toolkit.method2424((int) vector3f.x, (int) vector3f.z, (int) vector3f.y + (class600_sub1.getStartY() >> 1),
                aFloatArray6736);
        class600_sub1.anInt10377 = -973971457 * (int) aFloatArray6736[2];
    }

    boolean method8360(SceneNode class600_sub1, boolean bool, byte[][][] is, int i, byte i_144_) {
        if (!aBool6694) {
            return false;
        }
        if (class600_sub1 instanceof SceneEntity) {
            int i_145_ = ((SceneEntity) class600_sub1).endX;
            int i_146_ = ((SceneEntity) class600_sub1).endY;
            int i_147_ = ((SceneEntity) class600_sub1).startX;
            int i_148_ = ((SceneEntity) class600_sub1).startY;
            for (int i_149_ = i_147_; i_149_ <= i_145_; i_149_++) {
                for (int i_150_ = i_148_; i_150_ <= i_146_; i_150_++) {
                    if (class600_sub1.collisionPlane < levelCount * 453886331 && i_149_ >= 1982708411 * anInt6697
                            && i_149_ < -1010380123 * anInt6710 && i_150_ >= anInt6734 * -328417931
                            && i_150_ < anInt6746 * -1594872965) {
                        if (null != is && class600_sub1.plane >= i && is[class600_sub1.plane][i_149_][i_150_] == i_144_
                                || !class600_sub1.method16269(2006500232)
                                || class600_sub1.method16268(toolkit, 1741064138)) {
                            if (!bool && i_149_ >= anInt6723 * 1243106061 - 16 && i_149_ <= 16 + anInt6723 * 1243106061
                                    && i_150_ >= anInt6724 * -1342442459 - 16 && i_150_ <= anInt6724 * -1342442459 + 16) {
                                class600_sub1.method16265(toolkit);
                            }
                            return true;
                        }
                        return false;
                    }
                }
            }
            return true;
        }
        Vector3f vector3f = class600_sub1.getCoordinateSpace().translation;
        int i_151_ = (int) vector3f.x >> -1911343043 * tileScale;
        int i_152_ = (int) vector3f.z >> tileScale * -1911343043;
        if (class600_sub1.collisionPlane < levelCount * 453886331 && i_151_ >= anInt6697 * 1982708411
                && i_151_ < -1010380123 * anInt6710 && i_152_ >= anInt6734 * -328417931
                && i_152_ < anInt6746 * -1594872965) {
            if (null != is && class600_sub1.plane >= i && is[class600_sub1.plane][i_151_][i_152_] == i_144_
                    || !class600_sub1.method16269(2056546783) || class600_sub1.method16268(toolkit, 1377150685)) {
                if (!bool && i_151_ >= 1243106061 * anInt6723 - 16 && i_151_ <= 1243106061 * anInt6723 + 16
                        && i_152_ >= -1342442459 * anInt6724 - 16 && i_152_ <= -1342442459 * anInt6724 + 16) {
                    class600_sub1.method16265(toolkit);
                }
                return true;
            }
            return false;
        }
        return true;
    }

    void method8361(SceneNode class600_sub1, PointLight[] class480_sub23s) {
        if (aBool6693) {
            int i = class600_sub1.method16267(class480_sub23s, -1064442271);
            toolkit.method2482(i, class480_sub23s);
        }
        if (levels0 == levels1) {
            Vector3f vector3f = class600_sub1.getCoordinateSpace().translation;
            int i;
            int i_154_;
            if (class600_sub1 instanceof SceneEntity) {
                i = ((SceneEntity) class600_sub1).startX;
                i_154_ = ((SceneEntity) class600_sub1).startY;
            } else {
                i = (int) vector3f.x >> tileScale * -1911343043;
                i_154_ = (int) vector3f.z >> tileScale * -1911343043;
            }
            i = Math.min(173827901 * width - 1, Math.max(0, i));
            i_154_ = Math.min(length * 134933557 - 1, Math.max(0, i_154_));
            Class150 class150 = new Class150();
            class150.colour = getColor(i, i_154_) * 791213269;
            class150.scale = getScale(i, i_154_) * 1591951847;
            class150.intensity = getIntensity(i, i_154_) * 1370254837;
            class150.anInt1848 = getConfig4(i, i_154_) * 471935851;
            class150.anInt1847 = getConfig2(i, i_154_) * -2072444281;
            class150.anInt1846 = getConfig3(i, i_154_) * -1720335367;
            toolkit.method2804(levels[0].averageHeightAt((int) vector3f.x, (int) vector3f.z), class150);
        }
        MouseOverEntity class506 = class600_sub1.method16271(toolkit);
        if (null != class506) {
            if (class506.aBool6964) {
                class506.node = class600_sub1;
                aClass497_6711.method8668(class506, (byte) 95);
            } else {
                ArchiveFileLoader.method6965(class506);
            }
        }
    }

    void method8364(int i, int i_161_, byte i_162_) {
        Shadow class480_sub31_sub12 = null;
        for (int i_163_ = i; i_163_ < i_161_; i_163_++) {
            SceneGraphLevel class120 = levels[i_163_];
            if (null != class120) {
                for (int i_164_ = 0; i_164_ < length * 134933557; i_164_++) {
                    for (int i_165_ = 0; i_165_ < 173827901 * width; i_165_++) {
                        class480_sub31_sub12 = class120.method2194(i_165_, i_164_, class480_sub31_sub12);
                        if (class480_sub31_sub12 != null) {
                            int i_166_ = i_165_ << tileScale * -1911343043;
                            int i_167_ = i_164_ << tileScale * -1911343043;
                            for (int i_168_ = i_163_ - 1; i_168_ >= 0; i_168_--) {
                                SceneGraphLevel class120_169_ = levels[i_168_];
                                if (null != class120_169_) {
                                    int i_170_ = class120.getTileHeight(i_165_, i_164_)
                                            - class120_169_.getTileHeight(i_165_, i_164_);
                                    int i_171_ = class120.getTileHeight(1 + i_165_, i_164_)
                                            - class120_169_.getTileHeight(i_165_ + 1, i_164_);
                                    int i_172_ = class120.getTileHeight(1 + i_165_, i_164_ + 1)
                                            - class120_169_.getTileHeight(1 + i_165_, i_164_ + 1);
                                    int i_173_ = class120.getTileHeight(i_165_, i_164_ + 1)
                                            - class120_169_.getTileHeight(i_165_, i_164_ + 1);
                                    class120_169_.deleteShadow(class480_sub31_sub12, i_166_,
                                            (i_171_ + i_170_ + i_172_ + i_173_) / 4, i_167_, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    void method8390(SceneNode[] class600_sub1s, int i, int i_225_) {
        if (i < i_225_) {
            int i_226_ = (i_225_ + i) / 2;
            int i_227_ = i;
            SceneNode class600_sub1 = class600_sub1s[i_226_];
            class600_sub1s[i_226_] = class600_sub1s[i_225_];
            class600_sub1s[i_225_] = class600_sub1;
            int i_228_ = -1777491969 * class600_sub1.anInt10377;
            for (int i_229_ = i; i_229_ < i_225_; i_229_++) {
                if (class600_sub1s[i_229_].anInt10377 * -1777491969 < i_228_ + (i_229_ & 0x1)) {
                    SceneNode class600_sub1_230_ = class600_sub1s[i_229_];
                    class600_sub1s[i_229_] = class600_sub1s[i_227_];
                    class600_sub1s[i_227_++] = class600_sub1_230_;
                }
            }
            class600_sub1s[i_225_] = class600_sub1s[i_227_];
            class600_sub1s[i_227_] = class600_sub1;
            method8390(class600_sub1s, i, i_227_ - 1);
            method8390(class600_sub1s, i_227_ + 1, i_225_);
        }
    }

    void method8397(SceneEntity entity, boolean bool, int i) {
        int i_236_ = Math.min(width * 173827901 - 1, Math.max(0, entity.startX));
        int i_237_ = Math.min(173827901 * width - 1, Math.max(0, entity.endX));
        int i_238_ = Math.min(134933557 * length - 1, Math.max(0, entity.startY));
        int i_239_ = Math.min(length * 134933557 - 1, Math.max(0, entity.endY));
        for (int i_240_ = i_236_; i_240_ <= i_237_; i_240_++) {
            for (int i_241_ = i_238_; i_241_ <= i_239_; i_241_++) {
                SceneGraphTile sceneGraphTile = tiles[entity.plane][i_240_][i_241_];
                if (null != sceneGraphTile) {
                    EntityIterator iterator = sceneGraphTile.entityIterator;
                    EntityIterator entityIterator_242_ = null;
                    while (iterator != null) {
                        if (entity == iterator.current) {
                            if (null != entityIterator_242_) {
                                entityIterator_242_.next = iterator.next;
                            } else {
                                sceneGraphTile.entityIterator = iterator.next;
                            }
                            iterator.method8474(-1702953337);
                            break;
                        }
                        entityIterator_242_ = iterator;
                        iterator = iterator.next;
                    }
                }
            }
        }
        if (!bool) {
            method8344(entity);
        }
    }

    void method8412(SceneNode class600_sub1, int i, int i_243_, int i_244_, byte i_245_) {
        if (i_243_ < width * 173827901) {
            SceneGraphTile sceneGraphTile = tiles[i][i_243_ + 1][i_244_];
            if (sceneGraphTile != null && null != sceneGraphTile.decoration
                    && sceneGraphTile.decoration.method16302()) {
                int i_246_ = (levels1[i].getTileHeight(i_243_ + 1, i_244_)
                        + levels1[i].getTileHeight(1 + i_243_ + 1, i_244_)
                        + levels1[i].getTileHeight(1 + i_243_, 1 + i_244_) + levels1[i]
                        .getTileHeight(i_243_ + 1 + 1, i_244_ + 1))
                        / 4
                        - (levels1[i].getTileHeight(i_243_, i_244_)
                        + levels1[i].getTileHeight(1 + i_243_, i_244_)
                        + levels1[i].getTileHeight(i_243_, i_244_ + 1) + levels1[i]
                        .getTileHeight(i_243_ + 1, i_244_ + 1)) / 4;
                class600_sub1.method16262(toolkit, sceneGraphTile.decoration, -57333661 * anInt6688, i_246_, 0,
                        true, 461000929);
            }
        }
        if (i_244_ < 173827901 * width) {
            SceneGraphTile sceneGraphTile = tiles[i][i_243_][1 + i_244_];
            if (null != sceneGraphTile && null != sceneGraphTile.decoration
                    && sceneGraphTile.decoration.method16302()) {
                int i_247_ = (levels1[i].getTileHeight(i_243_, i_244_)
                        + levels1[i].getTileHeight(i_243_ + 1, 1 + i_244_)
                        + levels1[i].getTileHeight(i_243_, 1 + 1 + i_244_) + levels1[i]
                        .getTileHeight(1 + i_243_, 1 + 1 + i_244_))
                        / 4
                        - (levels1[i].getTileHeight(i_243_, i_244_)
                        + levels1[i].getTileHeight(i_243_ + 1, i_244_)
                        + levels1[i].getTileHeight(i_243_, 1 + i_244_) + levels1[i]
                        .getTileHeight(1 + i_243_, i_244_ + 1)) / 4;
                class600_sub1.method16262(toolkit, sceneGraphTile.decoration, 0, i_247_, anInt6688 * -57333661,
                        true, -1216492144);
            }
        }
        if (i_243_ < 173827901 * width && i_244_ < 134933557 * length) {
            SceneGraphTile sceneGraphTile = tiles[i][i_243_ + 1][1 + i_244_];
            if (null != sceneGraphTile && null != sceneGraphTile.decoration
                    && sceneGraphTile.decoration.method16302()) {
                int i_248_ = (levels1[i].getTileHeight(i_243_ + 1, 1 + i_244_)
                        + levels1[i].getTileHeight(1 + i_243_ + 1, i_244_ + 1)
                        + levels1[i].getTileHeight(i_243_ + 1, 1 + i_244_ + 1) + levels1[i]
                        .getTileHeight(1 + i_243_ + 1, 1 + i_244_ + 1))
                        / 4
                        - (levels1[i].getTileHeight(i_243_, i_244_)
                        + levels1[i].getTileHeight(i_243_ + 1, i_244_)
                        + levels1[i].getTileHeight(i_243_, i_244_ + 1) + levels1[i]
                        .getTileHeight(i_243_ + 1, 1 + i_244_)) / 4;
                class600_sub1.method16262(toolkit, sceneGraphTile.decoration, -57333661 * anInt6688, i_248_,
                        -57333661 * anInt6688, true, -1098565606);
            }
        }
        if (i_243_ < width * 173827901 && i_244_ > 0) {
            SceneGraphTile sceneGraphTile = tiles[i][i_243_ + 1][i_244_ - 1];
            if (sceneGraphTile != null && null != sceneGraphTile.decoration
                    && sceneGraphTile.decoration.method16302()) {
                int i_249_ = (levels1[i].getTileHeight(i_243_ + 1, i_244_ - 1)
                        + levels1[i].getTileHeight(i_243_ + 1 + 1, i_244_ - 1)
                        + levels1[i].getTileHeight(i_243_ + 1, i_244_ + 1 - 1) + levels1[i]
                        .getTileHeight(1 + i_243_ + 1, 1 + i_244_ - 1))
                        / 4
                        - (levels1[i].getTileHeight(i_243_, i_244_)
                        + levels1[i].getTileHeight(1 + i_243_, i_244_)
                        + levels1[i].getTileHeight(i_243_, i_244_ + 1) + levels1[i]
                        .getTileHeight(1 + i_243_, 1 + i_244_)) / 4;
                class600_sub1.method16262(toolkit, sceneGraphTile.decoration, -57333661 * anInt6688, i_249_,
                        -(-57333661 * anInt6688), true, -1905947300);
            }
        }
    }

    SceneGraphTile getTileAt(int level, int x, int y, int i_252_) {
        if (null == tiles[level][x][y]) {
            boolean valid = null != tiles[0][x][y]
                    && null != tiles[0][x][y].base;
            if (valid && level >= levelCount * 453886331 - 1) {
                return null;
            }
            method8340(level, x, y);
        }
        return tiles[level][x][y];
    }

    void method8448(SceneNode[] class600_sub1s, int i, int i_274_) {
        if (i < i_274_) {
            int i_275_ = (i + i_274_) / 2;
            int i_276_ = i;
            SceneNode class600_sub1 = class600_sub1s[i_275_];
            class600_sub1s[i_275_] = class600_sub1s[i_274_];
            class600_sub1s[i_274_] = class600_sub1;
            int i_277_ = -1777491969 * class600_sub1.anInt10377;
            for (int i_278_ = i; i_278_ < i_274_; i_278_++) {
                if (class600_sub1s[i_278_].anInt10377 * -1777491969 > i_277_ + (i_278_ & 0x1)) {
                    SceneNode class600_sub1_279_ = class600_sub1s[i_278_];
                    class600_sub1s[i_278_] = class600_sub1s[i_276_];
                    class600_sub1s[i_276_++] = class600_sub1_279_;
                }
            }
            class600_sub1s[i_274_] = class600_sub1s[i_276_];
            class600_sub1s[i_276_] = class600_sub1;
            method8448(class600_sub1s, i, i_276_ - 1);
            method8448(class600_sub1s, 1 + i_276_, i_274_);
        }
    }

    void method8464(SceneNode class600_sub1, int i, int i_286_, int i_287_, int i_288_, int i_289_) {
        boolean bool = true;
        int i_290_ = i_286_;
        int i_291_ = i_288_ + i_286_;
        int i_292_ = i_287_ - 1;
        int i_293_ = i_289_ + i_287_;
        for (int i_294_ = i; i_294_ <= 1 + i; i_294_++) {
            if (i_294_ != levelCount * 453886331) {
                for (int i_295_ = i_290_; i_295_ <= i_291_; i_295_++) {
                    if (i_295_ >= 0 && i_295_ < width * 173827901) {
                        for (int i_296_ = i_292_; i_296_ <= i_293_; i_296_++) {
                            if (i_296_ >= 0
                                    && i_296_ < 134933557 * length
                                    && (!bool || i_295_ >= i_291_ || i_296_ >= i_293_ || i_296_ < i_287_
                                    && i_295_ != i_286_)) {
                                SceneGraphTile sceneGraphTile = tiles[i_294_][i_295_][i_296_];
                                if (null != sceneGraphTile) {
                                    int i_297_ = (levels1[i_294_].getTileHeight(i_295_, i_296_)
                                            + levels1[i_294_].getTileHeight(1 + i_295_, i_296_)
                                            + levels1[i_294_].getTileHeight(i_295_, 1 + i_296_) + levels1[i_294_]
                                            .getTileHeight(1 + i_295_, 1 + i_296_))
                                            / 4
                                            - (levels1[i].getTileHeight(i_286_, i_287_)
                                            + levels1[i].getTileHeight(1 + i_286_, i_287_)
                                            + levels1[i].getTileHeight(i_286_, 1 + i_287_) + levels1[i]
                                            .getTileHeight(i_286_ + 1, 1 + i_287_)) / 4;
                                    Boundary class600_sub1_sub5 = sceneGraphTile.boundary;
                                    Boundary class600_sub1_sub5_298_ = sceneGraphTile.linkedBoundary;
                                    if (class600_sub1_sub5 != null && class600_sub1_sub5.method16302()) {
                                        class600_sub1.method16262(toolkit, class600_sub1_sub5, (1 - i_288_) * anInt6689
                                                        * -142433419 + (i_295_ - i_286_) * anInt6688 * -57333661, i_297_,
                                                (1 - i_289_) * -142433419 * anInt6689 + (i_296_ - i_287_) * anInt6688
                                                        * -57333661, bool, -716194538);
                                    }
                                    if (class600_sub1_sub5_298_ != null && class600_sub1_sub5_298_.method16302()) {
                                        class600_sub1.method16262(toolkit, class600_sub1_sub5_298_, (1 - i_288_)
                                                        * anInt6689 * -142433419 + anInt6688 * -57333661 * (i_295_ - i_286_),
                                                i_297_, anInt6688 * -57333661 * (i_296_ - i_287_) + anInt6689
                                                        * -142433419 * (1 - i_289_), bool, -544235274);
                                    }
                                    for (EntityIterator entityIterator = sceneGraphTile.entityIterator; entityIterator != null; entityIterator = entityIterator.next) {
                                        SceneEntity class600_sub1_sub3 = entityIterator.current;
                                        if (null != class600_sub1_sub3 && class600_sub1_sub3.method16302()
                                                && (i_295_ == class600_sub1_sub3.startX || i_295_ == i_290_)
                                                && (class600_sub1_sub3.startY == i_296_ || i_292_ == i_296_)) {
                                            int i_299_ = 1 + class600_sub1_sub3.endX
                                                    - class600_sub1_sub3.startX;
                                            int i_300_ = 1 + class600_sub1_sub3.endY
                                                    - class600_sub1_sub3.startY;
                                            class600_sub1.method16262(toolkit, class600_sub1_sub3, (i_299_ - i_288_)
                                                    * anInt6689 * -142433419 + -57333661 * anInt6688
                                                    * (class600_sub1_sub3.startX - i_286_), i_297_, -57333661
                                                    * anInt6688 * (class600_sub1_sub3.startY - i_287_)
                                                    + (i_300_ - i_289_) * -142433419 * anInt6689, bool, 211798349);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i_290_--;
                bool = false;
            }
        }
    }
}
