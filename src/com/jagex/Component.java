package com.jagex;

import com.jagex.twitch.TwitchTV;

import java.net.MalformedURLException;
import java.net.URL;

public class Component {

    public static final int anInt2451 = 5;
    public static final int anInt2469 = 1;
    public static final int anInt2470 = 2;
    public static final int anInt2471 = 4;
    public static final int anInt2472 = 8;
    public static int anInt2350;
    public static int anInt2351;
    public static int anInt2352;
    public static int anInt2353;
    public static int anInt2354;
    public static int anInt2355;
    public static int anInt2356;
    public static int anInt2360;
    public static int anInt2362;
    public static int anInt2365;
    public static int anInt2369;
    public static ReferenceCache aClass168_2372;
    public static int anInt2398 = 0;
    public static int anInt2411;
    public static int anInt2413;
    public static int anInt2457;
    public static ReferenceCache aClass168_2468;
    public static int anInt2509;
    public static boolean aBool2512;
    public static int anInt2514;
    public static int anInt2537;
    static ReferenceCache aClass168_2370;
    static ReferenceCache aClass168_2371;
    static boolean[] aBoolArray2558;

    static {
        anInt2350 = -1878044245;
        anInt2351 = -1344299442;
        anInt2352 = 1763500935;
        anInt2353 = 411973768;
        anInt2354 = 2048789307;
        anInt2355 = -1053045293;
        anInt2356 = 25505114;
        anInt2413 = 546342771;
        anInt2537 = 435455048;
        anInt2457 = 1028733021;
        anInt2360 = 743622415;
        anInt2411 = -1300253106;
        anInt2362 = -1581349641;
        anInt2369 = -852096384;
        anInt2514 = 1146507479;
        anInt2365 = -1878510102;
        anInt2509 = -1341826015;
        aClass168_2468 = new ReferenceCache(6000000, 200);
        aClass168_2370 = new ReferenceCache(8);
        aClass168_2371 = new ReferenceCache(4);
        aClass168_2372 = new ReferenceCache(50);
        aBool2512 = false;
    }

    public int anInt2349;
    public Object[] anObjectArray2357;
    public byte aByte2358;
    public Object[] anObjectArray2359;
    public Class267 aClass267_2361;
    public Object[] anObjectArray2364;
    public Object[] anObjectArray2366;
    public String toolTip;
    public int anInt2374;
    public int anInt2375;
    public int uid = 1375110385;
    public int index = 776847879;
    public int[] anIntArray2378;
    public int contentType = 0;
    public int[] anIntArray2380;
    public byte aByte2381;
    public int anInt2382;
    public byte aByte2383;
    public int basePositionX;
    public int basePositionY;
    public int boundsIndex;
    public int baseHeight;
    public int positionX;
    public int anInt2389;
    public int width;
    public int anInt2391;
    public int renderCycle;
    public int anInt2393;
    public String aString2394;
    public boolean hidden;
    public int anInt2396;
    public Object[] anObjectArray2397;
    public boolean disableHover;
    public byte aByte2400 = 0;
    public int scrollPosition;
    public int scrollWidth;
    public int scrollHeight;
    public int textColor;
    public boolean filled;
    public int anInt2406;
    public int anInt2407;
    public int anInt2408;
    public int textureId;
    public int type;
    public int anInt2412;
    public boolean visible;
    public boolean verticallyFlipped;
    public boolean aBool2416;
    public boolean aBool2417;
    public int modelType;
    public int anInt2419;
    public int anInt2420;
    public int anInt2421;
    public int spriteOffsetX;
    public boolean aBool2423;
    public int spritePitch;
    public int shadowColor;
    public int spriteYaw;
    public int anInt2427;
    public int anInt2428;
    public int anInt2429;
    public String[] actions;
    public int anInt2431;
    public int borderThickness;
    public int animation;
    public boolean aBool2434;
    public int anInt2435;
    public int spriteOffsetY;
    public Object[] loadListeners;
    public int spriteRoll;
    public int anInt2442;
    public int spriteScale;
    public boolean aBool2444;
    public int anInt2445;
    public int anInt2446;
    public Object[] anObjectArray2447;
    public int anInt2448;
    public int anInt2449;
    public int anInt2450;
    public Object[] anObjectArray2452;
    public int fontId;
    public Object[] anObjectArray2454;
    public String text;
    public int anInt2456;
    public int anInt2458;
    public int anInt2459;
    public int anInt2460;
    public boolean aBool2461;
    public Class480_Sub16 settings;
    public int anInt2463;
    public int anInt2465;
    public int[] anIntArray2466;
    public byte[][] aByteArrayArray2467;
    public String name;
    public int baseWidth;
    public boolean aBool2475;
    public int[] cursors;
    public int height;
    public Component parent;
    public boolean horizontallyFlipped;
    public String selectedAction;
    public int anInt2481;
    public boolean aBool2483;
    public int anInt2484;
    public int parentUid;
    public int modelId;
    public Object[] anObjectArray2487;
    public int[] anIntArray2488;
    public Object[] mouseEnterListeners;
    public Object[] hoverListeners;
    public Object[] mouseLeaveListeners;
    public Object[] anObjectArray2492;
    public Object[] anObjectArray2493;
    public Object[] anObjectArray2494;
    public Object[] anObjectArray2495;
    public Object[] anObjectArray2496;
    public int[] configListeners;
    public Object[] anObjectArray2498;
    public int[] anIntArray2499;
    public Object[] anObjectArray2500;
    public int[] anIntArray2501;
    public Object[] anObjectArray2502;
    public int[] anIntArray2503;
    public Object[] anObjectArray2504;
    public int[] anIntArray2505;
    public Object[] anObjectArray2506;
    public int[] anIntArray2507;
    public Object[] anObjectArray2508;
    public Object[] parameterListeners;
    public boolean aBool2511;
    public Object[] anObjectArray2513;
    public Object[] anObjectArray2515;
    public Object[] anObjectArray2516;
    public Object[] anObjectArray2517;
    public Object[] anObjectArray2518;
    public Object[] anObjectArray2519;
    public boolean inventory;
    public Component[] subComponents;
    public Object[] anObjectArray2522;
    public Object[] anObjectArray2523;
    public int anInt2524;
    public Object[] anObjectArray2525;
    public Object[] anObjectArray2526;
    public int positionY;
    public int itemId;
    public int itemAmount;
    public String aString2530;
    public Class227 aClass227_2531;
    public boolean item;
    public int anInt2533;
    public int anInt2534;
    public int anInt2535;
    public boolean aBool2536;
    public boolean aBool2539;
    public int anInt2540;
    public Animator aAnimator_2541;
    public Component[] components2;
    public int anInt2543;
    public boolean aBool2544;
    public boolean aBool2545;
    public int anInt2546;
    public int anInt2547;
    public int anInt2548;
    public byte[][] aByteArrayArray2549;
    public int anInt2550;
    public int anInt2551;
    public int anInt2552;
    public Object[] anObjectArray2553;
    public int anInt2554;
    public int anInt2555;
    public ParticleSystem aClass564_2556;
    public Object[] anObjectArray2557;
    short[] aShortArray2363;
    HashTable parameters;
    short[] aShortArray2436;
    short[] aShortArray2437;
    short[] aShortArray2438;
    int anInt2464;
    int anInt2482;
    int anInt2538;

    public Component() {
        aByte2381 = (byte) 0;
        aByte2358 = (byte) 0;
        aByte2383 = (byte) 0;
        basePositionX = 0;
        basePositionY = 0;
        baseWidth = 0;
        baseHeight = 0;
        positionX = 0;
        positionY = 0;
        width = 0;
        height = 0;
        anInt2408 = 1526136459;
        anInt2393 = -970300639;
        parentUid = 107738123;
        hidden = false;
        anInt2484 = 1887779447;
        anInt2463 = 1132968959;
        anInt2427 = 592771235;
        disableHover = false;
        anInt2382 = 0;
        scrollPosition = 0;
        scrollWidth = 0;
        scrollHeight = 0;
        textColor = 0;
        filled = false;
        anInt2406 = 0;
        anInt2407 = -1334030119;
        aBool2539 = false;
        textureId = 470325955;
        anInt2391 = 0;
        aBool2475 = false;
        borderThickness = 0;
        shadowColor = 0;
        aBool2416 = false;
        aBool2417 = true;
        modelType = -512645613;
        anInt2420 = 903294167;
        spriteOffsetX = 0;
        spriteOffsetY = 0;
        spritePitch = 0;
        spriteRoll = 0;
        spriteYaw = 0;
        anInt2554 = 0;
        anInt2428 = 0;
        anInt2429 = 0;
        spriteScale = -793742860;
        anInt2431 = 0;
        anInt2551 = 0;
        aBool2423 = false;
        aBool2434 = false;
        anInt2435 = -583955262;
        aBool2444 = false;
        fontId = 1584868157;
        aBool2536 = true;
        text = "";
        anInt2456 = 0;
        anInt2546 = 0;
        anInt2458 = 0;
        inventory = false;
        anInt2374 = 0;
        aBool2461 = false;
        settings = Class480_Sub16.aClass480_Sub16_10092;
        visible = false;
        name = "";
        anInt2524 = -657627567;
        parent = null;
        anInt2446 = 0;
        anInt2465 = 0;
        anInt2481 = anInt2398 * 1620433851;
        selectedAction = "";
        aBool2483 = false;
        itemId = 702084843;
        itemAmount = 0;
        aString2530 = null;
        item = false;
        anInt2533 = -1401896043;
        anInt2396 = -1115802887;
        animation = -1473373853;
        aBool2544 = false;
        aBool2545 = false;
        anInt2389 = 1271108187;
        anInt2547 = 0;
        anInt2548 = 0;
        anInt2460 = 0;
        anInt2550 = 0;
        anInt2419 = 0;
        anInt2552 = 0;
        boundsIndex = 1364952095;
        renderCycle = 1515435387;
    }

    public static void method4321() {
        aClass168_2468.clearSoft();
        aClass168_2372.clearSoft();
        aClass168_2370.clearSoft();
        aClass168_2371.clearSoft();
    }

    public static void method4324(int i) {
        Class533.anInt7259 = -627915947;
    }

    static int[] method4318(MenuItem option) {
        int[] data = null;
        if (Class530.method9028(-20536735 * option.opcode)) {
            data = ItemDefinition.loader.get((int) (-1867655888037237139L * option.primary)).anIntArray8304;
        } else if (827700557 * option.item != -1) {
            data = ItemDefinition.loader.get(option.item * 827700557).anIntArray8304;
        } else if (Class31.method905(option.opcode * -20536735)) {
            ObjectNode<Npc> linkable = Client.npcTable.get((int) (option.primary * -1867655888037237139L));
            if (null != linkable) {
                Npc npc = linkable.referent;
                NpcDefinition definition = npc.definition;

                if (null != definition.morphisms) {
                    definition = definition.morph(PlayerFacade.instance, PlayerFacade.instance);
                }

                if (null != definition) {
                    data = definition.anIntArray3075;
                }
            }
        } else if (Class512.isObjectActionOpcode(option.opcode * -20536735)) {
            ObjectDefinition definition = Client.scene.getObjectLoader().get(
                    (int) (option.primary * -1867655888037237139L >>> 32 & 0x7fffffffL));
            if (null != definition.morphisms) {
                definition = definition.transform(PlayerFacade.instance, PlayerFacade.instance);
            }

            if (definition != null) {
                data = definition.anIntArray7440;
            }
        }

        return data;
    }

    static final void method4319(ScriptExecutionContext class613, int i) {
        class613.anInt7924 -= -2049596966;
        int i_67_ = class613.anIntArray7942[1841827045 * class613.anInt7924];
        boolean bool = class613.anIntArray7942[1 + 1841827045 * class613.anInt7924] == 1;
        class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = Vector4i.method14268(
                i_67_, bool);
    }

    static final void method4322(int i, int i_69_) {
        Class480_Sub18.method7082();
        int i_70_ = Varp.varpLoader.get(i).anInt8631 * -758234501;
        if (i_70_ != 0) {
            int i_71_ = PlayerFacade.instance.getVarpValue(Varp.varpLoader
                    .get(i));
            if (i_70_ == 5) {
                Client.anInt10780 = -1761902507 * i_71_;
            } else if (6 == i_70_) {
                Client.anInt10732 = -863605443 * i_71_;
            }
        }
    }

    static void method2232(Component class226) {
        if (5 == 1558474223 * class226.type && -1 != class226.itemId * 1391525437) {
            PlayerVarpDefinitionIterator.method4139(Class60.activeToolkit, class226);
        }
    }

    static void method14089(Interface class221, int i, int i_12_, int i_13_, boolean bool,
                            ScriptExecutionContext class613) {
        if (i_12_ == 0) {
            throw new RuntimeException();
        }
        Component class226 = class221.components[i];
        if (class226.components2 == null) {
            class226.components2 = new Component[1 + i_13_];
            class226.subComponents = class226.components2;
        }
        if (class226.components2.length <= i_13_) {
            if (class226.subComponents == class226.components2) {
                Component[] class226s = new Component[1 + i_13_];
                for (int i_15_ = 0; i_15_ < class226.components2.length; i_15_++) {
                    class226s[i_15_] = class226.components2[i_15_];
                }
                class226.components2 = class226.subComponents = class226s;
            } else {
                Component[] class226s = new Component[i_13_ + 1];
                Component[] class226s_16_ = new Component[i_13_ + 1];
                for (int i_17_ = 0; i_17_ < class226.components2.length; i_17_++) {
                    class226s[i_17_] = class226.components2[i_17_];
                    class226s_16_[i_17_] = class226.subComponents[i_17_];
                }
                class226.components2 = class226s;
                class226.subComponents = class226s_16_;
            }
        }
        if (i_13_ > 0 && class226.components2[i_13_ - 1] == null) {
            throw new RuntimeException(new StringBuilder().append(i_13_ - 1).toString());
        }
        Component class226_18_ = new Component();
        class226_18_.type = 1147822351 * i_12_;
        class226_18_.parentUid = (class226_18_.uid = class226.uid * 1) * 201742523;
        class226_18_.index = i_13_ * -776847879;
        class226.components2[i_13_] = class226_18_;
        if (class226.subComponents != class226.components2) {
            class226.subComponents[i_13_] = class226_18_;
        }
        Class611 class611;
        if (bool) {
            class611 = class613.aClass611_7945;
        } else {
            class611 = class613.aClass611_7931;
        }
        class611.aClass221_7913 = class221;
        class611.aClass226_7914 = class226_18_;
        redraw(class226);
    }

    public static void method5082(int id, int[] is) {
        if (id != -1 && loadInterface(id, is)) {
            Component[] components = Class598.loadedInterfaces[id].components;
            PriorityQueueElement.method6072(components);
        }
    }

    static void method5437(int i) {
        if (i != -1 && !aBoolArray2558[i]) {
            UnboundedDefinitionLoaderIterator.interfaces.clearUnpacked(i);
            Class598.loadedInterfaces[i] = null;
        }
    }

    static void method15084(Component component, int i, int i_0_, boolean bool, byte i_1_) {
        int i_2_ = 688089097 * component.width;
        int i_3_ = component.height * 1362321717;
        if (0 == component.aByte2358) {
            component.width = component.baseWidth * 956604535;
        } else if (component.aByte2358 == 1) {
            component.width = (i - -759235537 * component.baseWidth) * 1149806137;
        } else if (2 == component.aByte2358) {
            component.width = (component.baseWidth * -759235537 * i >> 14) * 1149806137;
        }
        if (0 == component.aByte2383) {
            component.height = 603403001 * component.baseHeight;
        } else if (1 == component.aByte2383) {
            component.height = (i_0_ - component.baseHeight * 219735693) * -331699939;
        } else if (component.aByte2383 == 2) {
            component.height = (i_0_ * component.baseHeight * 219735693 >> 14) * -331699939;
        }
        if (4 == component.aByte2358) {
            component.width = 1149806137 * (component.anInt2408 * -1028458205 * component.height * 1362321717 / (component.anInt2393 * -1077747487));
        }
        if (component.aByte2383 == 4) {
            component.height = component.anInt2393 * -1077747487 * component.width * 688089097
                    / (-1028458205 * component.anInt2408) * -331699939;
        }
        if (Client.aBool10603
                && (Client.method17050(component).anInt10100 * -528482985 != 0 || 0 == 1558474223 * component.type)) {
            if (component.height * 1362321717 < 5 && component.width * 688089097 < 5) {
                component.height = -1658499695;
                component.width = 1454063389;
            } else {
                if (component.height * 1362321717 <= 0) {
                    component.height = -1658499695;
                }
                if (688089097 * component.width <= 0) {
                    component.width = 1454063389;
                }
            }
        }
        if (component.contentType * 1584180271 == anInt2354 * 1217733147) {
            Client.aClass226_10798 = component;
        }
        if (bool && null != component.anObjectArray2523
                && (i_2_ != component.width * 688089097 || i_3_ != component.height * 1362321717)) {
            ScriptContext class480_sub35 = new ScriptContext();
            class480_sub35.source = component;
            class480_sub35.arguments = component.anObjectArray2523;
            Client.scriptEvents.pushBack(class480_sub35);
        }
    }

    static final void method7527(Component component, Interface root, boolean bool, int i, ScriptExecutionContext class613) {
        class613.anInt7924 -= -2049596966;
        int id = class613.anIntArray7942[1841827045 * class613.anInt7924];
        int amount = class613.anIntArray7942[1 + 1841827045 * class613.anInt7924];

        if (-1 == component.index * -592186295 && !root.closed) {
            PulseEvent.method17525(1857819631 * component.uid);
            PulseEvent.method4741(1857819631 * component.uid);
            PulseEvent.method17579(component.uid * 1857819631);
        }

        if (-1 == id) {
            component.modelType = -512645613;
            component.modelId = -1265546033;
            component.itemId = 702084843;
        } else {
            component.itemId = id * -702084843;
            component.itemAmount = amount * 1985329561;
            component.item = bool;
            ItemDefinition definition = ItemDefinition.loader.get(id);
            component.spritePitch = 2032618151 * definition.modelPitch;
            component.spriteRoll = -1760530027 * definition.modelRoll;
            component.spriteYaw = 892689883 * definition.modelYaw;
            component.spriteOffsetX = definition.modelTranslateX * -1774654731;
            component.spriteOffsetY = definition.modelTranslateY * -1762851215;
            component.spriteScale = definition.modelScale * -1917655991;
            component.anInt2435 = i * 1855506017;

            if (459297459 * component.anInt2431 > 0) {
                component.spriteScale = component.spriteScale * -350348896 / (component.anInt2431 * 459297459) * 1495301125;
            } else if (-759235537 * component.baseWidth > 0) {
                component.spriteScale = 1495301125 * (component.spriteScale * -350348896 / (component.baseWidth * -759235537));
            }
        }
    }

    public static final void method15337(boolean bool) {
        OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_4018, Client.gameConnection.encryptor);
        Client.gameConnection.sendFrame(frame);
        for (InterfaceNode node = Client.openInterfaces.first(); node != null; node = Client.openInterfaces.next()) {
            if (!node.isLinked()) {
                node = Client.openInterfaces.first();
                if (null == node) {
                    break;
                }
            }
            if (0 == node.state * -487784573) {
                InterfaceNode.method9830(node, true, bool);
            }
        }
        if (null != Client.aClass226_10793) {
            redraw(Client.aClass226_10793);
            Client.aClass226_10793 = null;
        }
    }

    static final void method3529(Component component) {
        if (component.contentType * 1584180271 == 1084594073 * anInt2353) {
            if (null == Client.localPlayer.accountName) {
                component.modelId = 0;
                component.anInt2420 = 0;
            } else {
                component.spritePitch = -603656738;
                component.spriteRoll = ((int) (Math.sin(Client.engineCycle / 40.0) * 256.0) & 0x7ff) * 1225722821;
                component.modelType = 1731739231;
                component.modelId = -1872598017 * Client.localPlayerIndex;
                component.anInt2420 = Queue.method13192(Client.localPlayer.accountName) * -903294167;
                Animator_Sub2 class650_sub2 = Client.localPlayer.aClass650_Sub2_11525;

                if (class650_sub2 != null) {
                    if (component.aAnimator_2541 == null) {
                        component.aAnimator_2541 = new Animator_Sub3();
                    }
                    component.animation = class650_sub2.getAnimationId() * 1473373853;
                    component.aAnimator_2541.method13514(class650_sub2);
                } else {
                    component.aAnimator_2541 = null;
                }
            }
        }
    }

    static final void method15440(int id, int i_1_) {
        if (loadInterface(id, null)) {
            Class427.method7091(Class598.loadedInterfaces[id].components, i_1_);
        }
    }

    public static void redraw(Component class226) {
        if (-1337319859 * class226.renderCycle == -1091196149 * Client.anInt10864) {
            Client.validComponents[class226.boundsIndex * -561182687] = true;
        }
    }

    static void method7346(Toolkit toolkit, ClippingMask class129, Component component, int i, int i_3_, int i_4_, int i_5_,
                           int i_6_, int i_7_) {
        Class224 class224 = (Class224) Queue.aClass678_Sub8_8139.get(i_6_);
        if (class224 != null && null != class224.morphisms
                && class224.method4205(PlayerFacade.instance, PlayerFacade.instance)) {
            class224 = class224.method4211(PlayerFacade.instance, PlayerFacade.instance);
        }
        if (null != class224 && class224.aBool2311
                && class224.method4205(PlayerFacade.instance, PlayerFacade.instance)) {
            if (class224.anIntArray2324 != null) {
                int[] is = new int[class224.anIntArray2324.length];
                for (int i_8_ = 0; i_8_ < is.length / 2; i_8_++) {
                    int i_9_;
                    if (3 == Client.mapState * 1212513917) {
                        i_9_ = (int) (Client.camera.getYaw() * 2607.5945876176133) + 1093165775
                                * Client.pendingWalkX & 0x3fff;
                    } else if (Client.mapState * 1212513917 == 6) {
                        i_9_ = (int) Client.aFloat10787 & 0x3fff;
                    } else {
                        i_9_ = (int) Client.aFloat10787 + Client.pendingWalkX * 1093165775 & 0x3fff;
                    }
                    int i_10_ = Class373.SINE[i_9_];
                    int i_11_ = Class373.COSINE[i_9_];
                    if (1212513917 * Client.mapState != 6) {
                        i_10_ = i_10_ * 256 / (Client.pendingWalkY * -1894746741 + 256);
                        i_11_ = 256 * i_11_ / (Client.pendingWalkY * -1894746741 + 256);
                    }
                    is[2 * i_8_] = 688089097
                            * component.width
                            / 2
                            + i
                            + ((i_5_ + class224.anIntArray2324[2 * i_8_ + 1] * 4) * i_10_ + i_11_
                            * (i_4_ + class224.anIntArray2324[2 * i_8_] * 4) >> 14);
                    is[1 + 2 * i_8_] = component.height
                            * 1362321717
                            / 2
                            + i_3_
                            - ((i_5_ + 4 * class224.anIntArray2324[i_8_ * 2 + 1]) * i_11_
                            - (class224.anIntArray2324[2 * i_8_] * 4 + i_4_) * i_10_ >> 14);
                }
                Class211 class211 = component.method4298(toolkit);
                if (null != class211) {
                    Class133.method2355(toolkit, is, class224.anInt2319 * -1269404395, class211.anIntArray2181,
                            class211.anIntArray2179);
                }
                if (-2038170095 * class224.anInt2343 > 0) {
                    for (int i_12_ = 0; i_12_ < is.length / 2 - 1; i_12_++) {
                        int i_13_ = is[2 * i_12_];
                        int i_14_ = is[1 + i_12_ * 2];
                        int i_15_ = is[(i_12_ + 1) * 2];
                        int i_16_ = is[(i_12_ + 1) * 2 + 1];
                        if (i_15_ < i_13_) {
                            int i_17_ = i_13_;
                            int i_18_ = i_14_;
                            i_13_ = i_15_;
                            i_14_ = i_16_;
                            i_15_ = i_17_;
                            i_16_ = i_18_;
                        } else if (i_13_ == i_15_ && i_16_ < i_14_) {
                            int i_19_ = i_14_;
                            i_14_ = i_16_;
                            i_16_ = i_19_;
                        }
                        if (null != class129) {
                            toolkit.method2813(i_13_, i_14_, i_15_, i_16_,
                                    class224.anIntArray2337[class224.aByteArray2323[i_12_] & 0xff], 1, class129, i,
                                    i_3_, -2038170095 * class224.anInt2343, -1863776093 * class224.anInt2331,
                                    class224.anInt2332 * -178285943);
                        } else {
                            toolkit.method2441(i_13_, i_14_, i_15_, i_16_,
                                    class224.anIntArray2337[class224.aByteArray2323[i_12_] & 0xff], 1, -2038170095
                                            * class224.anInt2343, class224.anInt2331 * -1863776093, class224.anInt2332
                                            * -178285943);
                        }
                    }
                    int i_20_ = is[is.length - 2];
                    int i_21_ = is[is.length - 1];
                    int i_22_ = is[0];
                    int i_23_ = is[1];
                    if (i_22_ < i_20_) {
                        int i_24_ = i_20_;
                        int i_25_ = i_21_;
                        i_20_ = i_22_;
                        i_21_ = i_23_;
                        i_22_ = i_24_;
                        i_23_ = i_25_;
                    } else if (i_20_ == i_22_ && i_23_ < i_21_) {
                        int i_26_ = i_21_;
                        i_21_ = i_23_;
                        i_23_ = i_26_;
                    }
                    if (class129 != null) {
                        toolkit.method2813(
                                i_20_,
                                i_21_,
                                i_22_,
                                i_23_,
                                class224.anIntArray2337[class224.aByteArray2323[class224.aByteArray2323.length - 1] & 0xff],
                                1, class129, i, i_3_, -2038170095 * class224.anInt2343, class224.anInt2331
                                        * -1863776093, class224.anInt2332 * -178285943);
                    } else {
                        toolkit.method2441(
                                i_20_,
                                i_21_,
                                i_22_,
                                i_23_,
                                class224.anIntArray2337[class224.aByteArray2323[class224.aByteArray2323.length - 1] & 0xff],
                                1, -2038170095 * class224.anInt2343, class224.anInt2331 * -1863776093,
                                class224.anInt2332 * -178285943);
                    }
                } else if (null != class129) {
                    for (int i_27_ = 0; i_27_ < is.length / 2 - 1; i_27_++) {
                        toolkit.method2440(is[i_27_ * 2], is[i_27_ * 2 + 1], is[2 * (1 + i_27_)],
                                is[1 + (1 + i_27_) * 2],
                                class224.anIntArray2337[class224.aByteArray2323[i_27_] & 0xff], 1, class129, i, i_3_);
                    }
                    toolkit.method2440(
                            is[is.length - 2],
                            is[is.length - 1],
                            is[0],
                            is[1],
                            class224.anIntArray2337[class224.aByteArray2323[class224.aByteArray2323.length - 1] & 0xff],
                            1, class129, i, i_3_);
                } else {
                    for (int i_28_ = 0; i_28_ < is.length / 2 - 1; i_28_++) {
                        toolkit.method2783(is[2 * i_28_], is[2 * i_28_ + 1], is[2 * (i_28_ + 1)],
                                is[2 * (i_28_ + 1) + 1],
                                class224.anIntArray2337[class224.aByteArray2323[i_28_] & 0xff], 1);
                    }
                    toolkit.method2783(
                            is[is.length - 2],
                            is[is.length - 1],
                            is[0],
                            is[1],
                            class224.anIntArray2337[class224.aByteArray2323[class224.aByteArray2323.length - 1] & 0xff],
                            1);
                }
            }
            Sprite class116 = null;
            if (class224.anInt2299 * 1584610185 != -1) {
                class116 = class224.method4207(toolkit, false);
                if (null != class116) {
                    int i_29_ = 1013076751 * class224.anInt2339 > 0 ? 1013076751 * class224.anInt2339
                            : Client.playerDefaults.anInt7600 * 734521737;
                    Class349.method5957(component, class129, i, i_3_, i_4_, i_5_, class116, i_29_,
                            class224.aClass203_2341, class224.aClass220_2336);
                }
            }
            if (null != class224.aString2301) {
                int i_30_ = 0;
                if (class116 != null) {
                    i_30_ = class116.method2119();
                }
                Font class132 = Class558.p11Full;
                FontSpecification class9 = Class24.p11Full;
                if (class224.anInt2335 * 42167249 == 1) {
                    class132 = Client.p12Full;
                    class9 = Class24.p12Full;
                }
                if (class224.anInt2335 * 42167249 == 2) {
                    class132 = Class450.b12Full;
                    class9 = Class281_Sub3.b12Full;
                }
                Class24.method775(component, class129, i, i_3_, i_4_, i_5_, i_30_, class224.aString2301, class132, class9,
                        class224.anInt2302 * -1423941133, -889257482);
            }
        }
    }

    static void method2287(Component class226, int i, int i_5_, short i_6_) {
        Class211 class211 = class226.method4298(Class60.activeToolkit);
        if (class211 != null) {
            Class60.activeToolkit.method2760(i, i_5_, i + class226.width * 688089097, i_5_ + 1362321717
                    * class226.height);
            if (Class63.anInt954 * 422203915 < 3) {
                int i_7_;
                if (3 == Client.mapState * 1212513917) {
                    i_7_ = (int) -(Client.camera.getYaw() * 2607.5945876176133);
                } else {
                    i_7_ = (int) -Client.aFloat10787;
                }
                i_7_ = i_7_ + -2108635746 * Client.pendingWalkX & 0x3fff;
                i_7_ <<= 2;
                CutsceneObject.compass.method2128(i + class226.width * 688089097 / 2.0F, i_5_ + class226.height
                        * 1362321717 / 2.0F, 4298, i_7_, class211.aClass129_2183, i, i_5_);
            } else {
                Class60.activeToolkit.method2467(-16777216, class211.aClass129_2183, i, i_5_);
            }
        }
    }

    public static boolean method3189(int i, int i_1_, int i_2_) {
        if (!Class56.menuOpen) {
            return false;
        }
        int i_3_ = i >> 16;
        int i_4_ = i & 0xffff;
        if (null == Class598.loadedInterfaces[i_3_] || null == Class598.loadedInterfaces[i_3_].components[i_4_]) {
            return false;
        }
        Component class226 = Class598.loadedInterfaces[i_3_].components[i_4_];
        if (i_1_ != -1 || class226.type * 1558474223 != 0) {
            for (MenuItem class480_sub31_sub17 = MenuItem.options.head(); null != class480_sub31_sub17; class480_sub31_sub17 = MenuItem.options
                    .next()) {
                if (i_1_ == -1800080575 * class480_sub31_sub17.secondary
                        && class226.uid * 1857819631 == 1353485821 * class480_sub31_sub17.tertiary
                        && (58 == -20536735 * class480_sub31_sub17.opcode
                        || 1007 == class480_sub31_sub17.opcode * -20536735
                        || -20536735 * class480_sub31_sub17.opcode == 25
                        || 57 == -20536735 * class480_sub31_sub17.opcode || 30 == -20536735
                        * class480_sub31_sub17.opcode)) {
                    return true;
                }
            }
        } else {
            for (MenuItem class480_sub31_sub17 = MenuItem.options.head(); null != class480_sub31_sub17; class480_sub31_sub17 = MenuItem.options
                    .next()) {
                if (class480_sub31_sub17.opcode * -20536735 == 58 || -20536735 * class480_sub31_sub17.opcode == 1007
                        || 25 == class480_sub31_sub17.opcode * -20536735 || -20536735 * class480_sub31_sub17.opcode == 57
                        || class480_sub31_sub17.opcode * -20536735 == 30) {
                    for (Component class226_5_ = lookup(class480_sub31_sub17.tertiary * 1353485821); class226_5_ != null; class226_5_ = Class339
                            .method5850(Class598.loadedInterfaces[class226_5_.uid * 1857819631 >> 16], class226_5_,
                                    308457455)) {
                        if (1857819631 * class226_5_.uid == class226.uid * 1857819631) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static void method3326(int maximumAge) {
        aClass168_2468.sweep(maximumAge);
        aClass168_2372.sweep(maximumAge);
        aClass168_2370.sweep(maximumAge);
        aClass168_2371.sweep(maximumAge);
    }

    public static boolean loadInterface(int id, int[] is) {
        if (aBoolArray2558[id]) {
            return true;
        }

        Class598.loadedInterfaces[id] = GameContext.method10444(id, is, Class598.loadedInterfaces[id], false);
        if (Class598.loadedInterfaces[id] == null) {
            return false;
        }

        aBoolArray2558[id] = true;
        return true;
    }

    public static Component lookup(int id) {
        int parent = id >> 16;
        if (Class598.loadedInterfaces[parent] == null || Class598.loadedInterfaces[parent].getChild(id) == null) {
            boolean loaded = Component.loadInterface(parent, null);
            if (!loaded) {
                return null;
            }
        }

        return Class598.loadedInterfaces[parent].getChild(id);
    }

    public static void method10427(int i) {
        aBoolArray2558[i] = false;
        Component.method5437(i);
    }

    static final void method13702(Component class226, Interface class221, ScriptExecutionContext class613, byte i) {
        String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
        if (ScriptExecutionContext.method9239(string, class613) != null) {
            string = string.substring(0, string.length() - 1);
        }

        class226.anObjectArray2397 = World.method16248(string, class613);
        class226.aBool2483 = true;
    }

    public static final void handleEvents(Component[] components, int i, int i_2_, int i_3_, int i_4_, int i_5_, int x, int y,
                                          int i_8_, boolean bool) {
        Class60.activeToolkit.method2760(i_2_, i_3_, i_4_, i_5_);
        for (Component component : components) {
            if (component != null && (component.parentUid * 1920469085 == i || i == -1412584499 && Client.aClass226_10801 == component)) {
                int i_11_;
                if (i_8_ == -1) {
                    Client.interfaceBounds[Client.anInt10848 * -573888519].setBounds(x + component.positionX
                                    * -346651673, component.positionY * -1901639223 + y, 688089097 * component.width,
                            component.height * 1362321717);
                    i_11_ = (Client.anInt10848 += 1959324233) * -573888519 - 1;
                } else {
                    i_11_ = i_8_;
                }

                component.boundsIndex = -1364952095 * i_11_;
                component.renderCycle = Client.engineCycle * -1515435387;
                if (!Client.method16857(component)) {
                    if (0 != 1584180271 * component.contentType) {
                        Component.method3529(component);
                    }

                    int i_12_ = x + component.positionX * -346651673;
                    int i_13_ = -1901639223 * component.positionY + y;
                    int i_14_ = component.anInt2406 * -5030949;

                    if (Client.aBool10603
                            && (Client.method17050(component).anInt10100 * -528482985 != 0 || 0 == component.type * 1558474223)
                            && i_14_ > 127) {
                        i_14_ = 127;
                    }

                    if (Client.aClass226_10801 == component) {
                        if (-1412584499 != i
                                && (-1326442559 * component.anInt2481 == -116477801 * anInt2351
                                || anInt2398 * -687311621 == component.anInt2481 * -1326442559 || Client
                                .method17050(component).method15630(1754788389)
                                && component.anInt2481 * -1326442559 != -721529179 * anInt2352)) {
                            SceneMod.mainComponents = components;
                            Class514.anInt7014 = -725918667 * x;
                            TurnMobCutsceneAction.anInt9435 = -2036018243 * y;
                            continue;
                        }

                        if (Client.aBool10814 && Client.aBool10806) {
                            int i_15_ = Client.recorder.getMouseX();
                            int i_16_ = Client.recorder.getMouseY();
                            i_15_ -= 1600472963 * Client.mouseX;
                            i_16_ -= 558940787 * Client.mouseY;
                            if (i_15_ < Client.anInt10849 * 1253169817) {
                                i_15_ = 1253169817 * Client.anInt10849;
                            }
                            if (i_15_ + component.width * 688089097 > 1253169817 * Client.anInt10849 + 1098611987
                                    * Client.anInt10809) {
                                i_15_ = 1253169817 * Client.anInt10849 + 1098611987 * Client.anInt10809 - 688089097
                                        * component.width;
                            }
                            if (i_16_ < 220249895 * Client.anInt10808) {
                                i_16_ = 220249895 * Client.anInt10808;
                            }
                            if (i_16_ + 1362321717 * component.height > 1332547005 * Client.anInt10810 + Client.anInt10808
                                    * 220249895) {
                                i_16_ = 1332547005 * Client.anInt10810 + Client.anInt10808 * 220249895 - 1362321717
                                        * component.height;
                            }
                            if (Client.method17050(component).method15630(1754788389)) {
                                Client.method8796(i_15_, i_16_, component.width * 688089097, 1362321717 * component.height);
                            }
                            if (component.anInt2481 * -1326442559 != anInt2352 * -721529179) {
                                i_12_ = i_15_;
                                i_13_ = i_16_;
                            }
                        }
                        if (component.anInt2481 * -1326442559 == anInt2398 * -687311621) {
                            i_14_ = 128;
                        }
                    }
                    int i_17_;
                    int i_18_;
                    int i_19_;
                    int i_20_;
                    if (1558474223 * component.type == 2) {
                        i_17_ = i_2_;
                        i_18_ = i_3_;
                        i_19_ = i_4_;
                        i_20_ = i_5_;
                    } else {
                        int i_21_ = i_12_ + 688089097 * component.width;
                        int i_22_ = i_13_ + component.height * 1362321717;
                        if (component.type * 1558474223 == 9) {
                            i_21_++;
                            i_22_++;
                        }
                        i_17_ = i_12_ > i_2_ ? i_12_ : i_2_;
                        i_18_ = i_13_ > i_3_ ? i_13_ : i_3_;
                        i_19_ = i_21_ < i_4_ ? i_21_ : i_4_;
                        i_20_ = i_22_ < i_5_ ? i_22_ : i_5_;
                    }
                    if (i_17_ < i_19_ && i_18_ < i_20_) {
                        if (0 != component.contentType * 1584180271) {
                            if (anInt2354 * 1217733147 == 1584180271 * component.contentType
                                    || 1584180271 * component.contentType == anInt2355 * -1388209991) {
                                if (Client.aBool10799) {
                                    Class60.activeToolkit.method2456();
                                    Class252.method4718(i_12_, i_13_, 688089097 * component.width,
                                            component.height * 1362321717,
                                            anInt2355 * -1388209991 == 1584180271 * component.contentType, -1464786379);
                                    Class44.method1071(i_11_, i_17_, i_18_, i_19_, i_20_, i_12_, i_13_);
                                    Class60.activeToolkit.method2494();
                                    Class60.activeToolkit.method2760(i_2_, i_3_, i_4_, i_5_);
                                    Client.validComponents[i_11_] = true;
                                }
                                continue;
                            }
                            if (anInt2356 * -1563899471 == component.contentType * 1584180271 && Client.cutsceneStatus * 2087248539 == 3) {
                                if (5 != component.type * 1558474223 || component.method4298(Class60.activeToolkit) != null) {
                                    Class622.method10436(Class60.activeToolkit, component, i_12_, i_13_, (byte) 79);
                                    Class60.activeToolkit.method2760(i_2_, i_3_, i_4_, i_5_);
                                }
                                continue;
                            }
                            if (1584180271 * component.contentType == anInt2369 * 1024467871) {
                                SceneFormat.method7545(Class60.activeToolkit, i_12_, i_13_, component, (byte) -84);
                                continue;
                            }
                            if (219388263 * anInt2514 == component.contentType * 1584180271) {
                                Class296_Sub3_Sub1.method17523(Class60.activeToolkit, i_12_, i_13_, component,
                                        component.textColor * 923665021 % 64, (byte) 0);
                                continue;
                            }
                            if (component.contentType * 1584180271 == anInt2413 * -1997453031) {
                                if (component.method4298(Class60.activeToolkit) != null) {
                                    Class60.activeToolkit.method2456();
                                    Component.method2287(component, i_12_, i_13_, (short) 8192);
                                    Class60.activeToolkit.method2760(i_2_, i_3_, i_4_, i_5_);
                                }
                                continue;
                            }
                            if (1584180271 * component.contentType == anInt2537 * 1655048567) {
                                Class522.method8954(Class60.activeToolkit, i_12_, i_13_, component.width * 688089097,
                                        component.height * 1362321717, -63976445);
                                Client.validComponents[i_11_] = true;
                                Class60.activeToolkit.method2760(i_2_, i_3_, i_4_, i_5_);
                                continue;
                            }
                            if (1073954765 * anInt2457 == 1584180271 * component.contentType) {
                                Class452.method7410(Class60.activeToolkit, i_12_, i_13_, component.width * 688089097,
                                        component.height * 1362321717, 2036939663);
                                Client.validComponents[i_11_] = true;
                                Class60.activeToolkit.method2760(i_2_, i_3_, i_4_, i_5_);
                                continue;
                            }
                            if (-433861965 * anInt2360 == component.contentType * 1584180271) {
                                if (Client.displayFps || Client.aBool10693) {
                                    ShaderMetaBuffer.method4369(i_12_, i_13_, component, (byte) -23);
                                    Client.validComponents[i_11_] = true;
                                }
                                continue;
                            }
                            if (anInt2365 * 1022755101 == 1584180271 * component.contentType) {
                                Sprite class116 = FontSpecification.method641();
                                if (null != class116) {
                                    int i_23_ = i_4_ - i_2_;
                                    int i_24_ = i_5_ - i_3_;
                                    float f = (float) i_23_ / (float) i_24_;
                                    float f_25_ = (float) class116.method2157() / (float) class116.method2119();
                                    int i_26_;
                                    int i_27_;
                                    if (f < f_25_) {
                                        i_26_ = i_23_;
                                        i_27_ = (int) (i_23_ / f_25_);
                                    } else {
                                        i_26_ = (int) (i_24_ * f_25_);
                                        i_27_ = i_24_;
                                    }
                                    int i_28_ = (i_23_ - i_26_) / 2 + i_2_;
                                    int i_29_ = (i_24_ - i_27_) / 2 + i_3_;
                                    class116.method2145(i_28_, i_29_, i_26_, i_27_);
                                }
                                continue;
                            }
                            if (anInt2509 * -994128605 == component.contentType * 1584180271) {
                                if (TwitchTV.isStreaming() && Class410.method6951()) {
                                    DynamicGameObject.method18082(i_2_, i_3_, i_4_, i_5_);
                                }
                                continue;
                            }
                        }
                        if (component.type * 1558474223 == 0) {
                            if (829737401 * anInt2362 == 1584180271 * component.contentType) {
                                Class60.activeToolkit.method2456();
                                Client.scene.method7690().method9727(Client.scene);
                                Class60.activeToolkit.method2730(i_12_, i_13_, Engine.screenWidth * 1319181337,
                                        Engine.screenHeight * -551672947);
                            }
                            handleEvents(components, component.uid * 1857819631, i_17_, i_18_, i_19_, i_20_, i_12_
                                            - component.anInt2382 * -1909412215, i_13_ - component.scrollPosition * -1881455913,
                                    i_11_, bool);
                            if (component.subComponents != null) {
                                handleEvents(component.subComponents, 1857819631 * component.uid, i_17_, i_18_, i_19_,
                                        i_20_, i_12_ - component.anInt2382 * -1909412215, i_13_ - component.scrollPosition
                                                * -1881455913, i_11_, bool);
                            }
                            InterfaceNode node = Client.openInterfaces.get(component.uid * 1857819631);
                            if (node != null) {
                                Class449.loadInterface(1021060255 * node.id, i_17_, i_18_, i_19_, i_20_,
                                        i_12_ - component.anInt2382 * -1909412215, i_13_ - -1881455913
                                                * component.scrollPosition, i_11_);
                            }
                            if (1584180271 * component.contentType == anInt2362 * 829737401) {
                                if (Class60.activeToolkit.method2678()) {
                                    Class60.activeToolkit.method2487(component.width * 688089097,
                                            component.height * 1362321717);
                                    if (16 == -1501875989 * Client.connectionState) {
                                        Class296_Sub1.method15196(i_12_, i_13_, 688089097 * component.width,
                                                1362321717 * component.height);
                                    }
                                }
                                if (1 == Client.cutsceneStatus * 2087248539) {
                                    int i_30_ = Client.anInt10684 * -1926091511;
                                    int i_31_ = -319380787 * Client.anInt10685;
                                    int i_32_ = Client.anInt10774 * -199882515;
                                    int i_33_ = Client.anInt10689 * 1775409077;
                                    if (Client.engineCycle < 1779708161 * Client.anInt10700) {
                                        float f = 1.0F * (Client.engineCycle - 513337573 * Client.anInt10872)
                                                / (1779708161 * Client.anInt10700 - 513337573 * Client.anInt10872);
                                        i_30_ = (int) (-521512767 * BaseVarpDefinitionLoader.anInt1130 * (1.0F - f) + f
                                                * (Client.anInt10684 * -1926091511));
                                        i_31_ = (int) (BufferedConnectionContext.anInt1211 * -1551903347 * (1.0F - f) + f
                                                * (Client.anInt10685 * -319380787));
                                        i_32_ = (int) (-1099881767 * Class166_Sub21.anInt546 * (1.0F - f) + -199882515
                                                * Client.anInt10774 * f);
                                        i_33_ = (int) (Client.anInt10689 * 1775409077 * f + 1532721931
                                                * Class338.anInt3624 * (1.0F - f));
                                    }
                                    if (i_30_ > 0) {
                                        Class60.activeToolkit.method2805(i_17_, i_18_, i_19_ - i_17_, i_20_ - i_18_,
                                                i_30_ << 24 | i_31_ << 16 | i_32_ << 8 | i_33_);
                                    }
                                }
                            }
                            Class60.activeToolkit.method2760(i_2_, i_3_, i_4_, i_5_);
                        }
                        if (Client.aBoolArray10851[i_11_] || 2114392935 * Client.anInt10853 > 1) {
                            if (component.type * 1558474223 == 3) {
                                if (i_14_ == 0) {
                                    if (component.filled) {
                                        Class60.activeToolkit.method2434(i_12_, i_13_, component.width * 688089097,
                                                component.height * 1362321717, ~0xffffff | component.textColor * 923665021, 0);
                                    } else {
                                        Class60.activeToolkit.method2625(i_12_, i_13_, 688089097 * component.width,
                                                component.height * 1362321717, ~0xffffff | 923665021 * component.textColor, 0);
                                    }
                                } else if (component.filled) {
                                    Class60.activeToolkit.method2434(i_12_, i_13_, 688089097 * component.width,
                                            component.height * 1362321717, 255 - (i_14_ & 0xff) << 24 | 923665021
                                                    * component.textColor & 0xffffff, 1);
                                } else {
                                    Class60.activeToolkit.method2625(i_12_, i_13_, 688089097 * component.width,
                                            component.height * 1362321717, 255 - (i_14_ & 0xff) << 24 | component.textColor
                                                    * 923665021 & 0xffffff, 1);
                                }
                            } else if (component.type * 1558474223 == 4) {
                                int i_34_ = 255 - (i_14_ & 0xff);
                                if (0 != i_34_) {
                                    Font class132 = component.method4229(Class509.aClass374_6997,
                                            Client.anInterface47_10645, -1428946199);
                                    if (null == class132) {
                                        if (aBool2512) {
                                            Component.redraw(component);
                                        }
                                    } else {
                                        int i_35_ = 923665021 * component.textColor;
                                        String string = component.text;
                                        if (-1 != component.itemId * 1391525437) {
                                            ItemDefinition itemDefinition = ItemDefinition.loader
                                                    .get(1391525437 * component.itemId);
                                            string = itemDefinition.name;
                                            if (null == string) {
                                                string = "null";
                                            }
                                            if ((1146503759 * itemDefinition.stackable == 1 || component.itemAmount
                                                    * -1212380503 != 1)
                                                    && -1 != -1212380503 * component.itemAmount) {
                                                string = new StringBuilder()
                                                        .append(Item.getColorTags(16748608))
                                                        .append(string)
                                                        .append(Class60.CLOSING_COLOUR_TAG)
                                                        .append(" x")
                                                        .append(ReflectiveDefinitionProvider.method13895(-1212380503
                                                                * component.itemAmount, 917829094)).toString();
                                            }
                                        }
                                        if (Client.aClass226_10793 == component) {
                                            string = TranslatableString.PLEASE_WAIT.translate(Client.currentLanguage);
                                            i_35_ = 923665021 * component.textColor;
                                        }
                                        if (Client.aBool10739) {
                                            Class60.activeToolkit.method2511(i_12_, i_13_, 688089097 * component.width
                                                    + i_12_, component.height * 1362321717 + i_13_);
                                        }
                                        i_34_ <<= 24;
                                        if (component.aBool2461) {
                                            class132.method2300(string, i_12_, i_13_, component.width * 688089097,
                                                    1362321717 * component.height, i_34_ | i_35_, component.inventory ? i_34_
                                                            : -1, 747852125 * component.anInt2546,
                                                    982465999 * component.anInt2458, Client.aRandom10887,
                                                    Class54.anInt608, Client.anIntArray10854,
                                                    WeakReferenceTable.nameIcons, null, 2146753376);
                                        } else {
                                            class132.method2295(string, i_12_, i_13_, 688089097 * component.width,
                                                    1362321717 * component.height, i_34_ | i_35_, component.inventory ? i_34_
                                                            : -1, component.anInt2546 * 747852125,
                                                    982465999 * component.anInt2458, component.anInt2456 * -1873663917,
                                                    266341159 * component.anInt2374, WeakReferenceTable.nameIcons, null,
                                                    null, 0, 0);
                                        }
                                        if (Client.aBool10739) {
                                            Class60.activeToolkit.method2760(i_2_, i_3_, i_4_, i_5_);
                                        }
                                    }
                                }
                            } else if (5 == 1558474223 * component.type) {
                                if (-2141876157 * component.anInt2533 >= 0) {
                                    component.method4269(SkyboxDefinition.loader, SunDefinition.loader, 2103217409)
                                            .method8257(Class60.activeToolkit, 0, i_12_, i_13_,
                                                    component.width * 688089097, component.height * 1362321717,
                                                    component.anInt2534 * -107198099 << 3,
                                                    component.anInt2535 * -23340955 << 3, 0, 0);
                                } else {
                                    Sprite sprite;
                                    if (-1 != 1391525437 * component.itemId) {
                                        PlayerAppearance appearance = component.item ? Client.localPlayer.appearance
                                                : null;
                                        sprite = ItemDefinition.loader.getCachedSprite(Class60.activeToolkit,
                                                component.itemId * 1391525437, -1212380503 * component.itemAmount,
                                                component.borderThickness * 972044571, ~0xffffff | component.shadowColor
                                                        * -1694773323, 1276796321 * component.anInt2435, appearance);
                                    } else if (-1863708489 * component.anInt2396 != -1) {
                                        sprite = (Sprite) Client.aClass168_10778.get(component.anInt2396 * -1863708489);
                                        if (sprite == null
                                                && !Client.aMap10908.containsKey(Integer.valueOf(component.anInt2396
                                                * -1863708489))) {
                                            try {
                                                Client.aMap10908
                                                        .put(Integer.valueOf(component.anInt2396 * -1863708489),
                                                                IsaacCipher.aClass52_8356.submit(new URL(
                                                                        new StringBuilder().append(Client.aString10759)
                                                                                .append("/img/image_")
                                                                                .append(component.anInt2396 * -1863708489)
                                                                                .append(".png?a=")
                                                                                .append(TimeUtil.time()).toString())));
                                            } catch (MalformedURLException malformedurlexception) {
                                                HitsplatDefinitionProvider.reportError(null, malformedurlexception);
                                            }
                                        }
                                    } else {
                                        sprite = component.method4231(Class60.activeToolkit, -275272222);
                                    }
                                    if (sprite != null) {
                                        int i_36_ = sprite.scaleWidth();
                                        int i_37_ = sprite.scaleHeight();
                                        int i_38_ = 255 - (i_14_ & 0xff);
                                        if (i_38_ != 0) {
                                            int i_39_;
                                            if (923665021 * component.textColor == -1) {
                                                i_39_ = 16777215;
                                            } else {
                                                i_39_ = component.textColor * 923665021 & 0xffffff;
                                                if (0 == i_39_) {
                                                    i_39_ = 16777215;
                                                }
                                            }
                                            i_39_ |= i_38_ << 24;
                                            boolean bool_40_ = i_39_ != -1;
                                            if (component.aBool2475) {
                                                Class60.activeToolkit.method2511(i_12_, i_13_, i_12_ + 688089097
                                                        * component.width, i_13_ + 1362321717 * component.height);
                                                if (component.anInt2391 * -1168337917 != 0) {
                                                    int i_41_ = (component.width * 688089097 + i_36_ - 1) / i_36_;
                                                    int i_42_ = (component.height * 1362321717 + i_37_ - 1) / i_37_;
                                                    for (int i_43_ = 0; i_43_ < i_41_; i_43_++) {
                                                        for (int i_44_ = 0; i_44_ < i_42_; i_44_++) {
                                                            if (bool_40_) {
                                                                sprite.method2080(i_12_ + i_36_ * i_43_ + i_36_ / 2.0F,
                                                                        i_37_ / 2.0F + (i_13_ + i_37_ * i_44_), 4096,
                                                                        -1168337917 * component.anInt2391, 0, i_39_, 1);
                                                            } else {
                                                                sprite.method2091(i_36_ * i_43_ + i_12_ + i_36_ / 2.0F,
                                                                        i_13_ + i_44_ * i_37_ + i_37_ / 2.0F, 4096,
                                                                        -1168337917 * component.anInt2391);
                                                            }
                                                        }
                                                    }
                                                } else if (bool_40_) {
                                                    sprite.method2085(i_12_, i_13_, component.width * 688089097,
                                                            component.height * 1362321717, 0, i_39_, 1);
                                                } else {
                                                    sprite.method2084(i_12_, i_13_, component.width * 688089097,
                                                            component.height * 1362321717);
                                                }
                                                Class60.activeToolkit.method2760(i_2_, i_3_, i_4_, i_5_);
                                            } else if (bool_40_) {
                                                if (0 != -1168337917 * component.anInt2391) {
                                                    sprite.method2080(688089097 * component.width / 2.0F + i_12_,
                                                            1362321717 * component.height / 2.0F + i_13_, component.width
                                                                    * 914395136 / i_36_,
                                                            -1168337917 * component.anInt2391, 0, i_39_, 1);
                                                } else if (688089097 * component.width != i_36_
                                                        || component.height * 1362321717 != i_37_) {
                                                    sprite.method2082(i_12_, i_13_, component.width * 688089097,
                                                            component.height * 1362321717, 0, i_39_, 1);
                                                } else {
                                                    sprite.method2142(i_12_, i_13_, 0, i_39_, 1);
                                                }
                                            } else if (component.anInt2391 * -1168337917 != 0) {
                                                sprite.method2130(688089097 * component.width / 2.0F + i_12_,
                                                        component.height * 1362321717 / 2.0F + i_13_, i_36_ / 2.0F,
                                                        i_37_ / 2.0F, component.width * 914395136 / i_36_, 907235328
                                                                * component.height / i_37_,
                                                        component.anInt2391 * -1168337917, 1, -1, 1);
                                            } else if (688089097 * component.width != i_36_
                                                    || 1362321717 * component.height != i_37_) {
                                                sprite.method2145(i_12_, i_13_, 688089097 * component.width,
                                                        component.height * 1362321717);
                                            } else {
                                                sprite.method2079(i_12_, i_13_);
                                            }
                                        }
                                    } else if (aBool2512) {
                                        Component.redraw(component);
                                    }
                                }
                            } else if (6 == 1558474223 * component.type) {
                                Class60.activeToolkit.method2456();
                                Model class143 = null;
                                int i_45_ = 2048;
                                if (component.anInt2412 * 82398819 != 0) {
                                    i_45_ |= 0x80000;
                                }
                                int i_46_ = 0;
                                if (-1 != component.itemId * 1391525437) {
                                    ItemDefinition itemDefinition = ItemDefinition.loader.get(1391525437 * component.itemId);
                                    if (itemDefinition != null) {
                                        itemDefinition = itemDefinition.getStack(component.itemAmount * -1212380503);
                                        class143 = itemDefinition.method13583(Class60.activeToolkit, i_45_, 1,
                                                component.item ? Client.localPlayer.appearance : null,
                                                component.aAnimator_2541, 0, 0, 0, 0);
                                        if (null != class143) {
                                            i_46_ = -class143.minimumY() >> 1;
                                        } else {
                                            Component.redraw(component);
                                        }
                                    }
                                } else if (component.modelType * 286135323 == 3) {
                                    int i_47_ = component.modelId * -643054127;
                                    if (i_47_ >= 0 && i_47_ < 2048) {
                                        Player class600_sub1_sub3_sub1_sub1 = Client.players[i_47_];
                                        if (null != class600_sub1_sub3_sub1_sub1
                                                && (i_47_ == Client.localPlayerIndex * -406165969 || Queue
                                                .method13192(class600_sub1_sub3_sub1_sub1.accountName) == component.anInt2420 * 405633305)) {
                                            class143 = component.method4232(Class60.activeToolkit, i_45_,
                                                    ProxyingVariableLoader.aClass678_Sub6_3003,
                                                    IdentikitDefinition.loader, NpcDefinition.loader,
                                                    ItemDefinition.loader, Animation.loader,
                                                    PlayerFacade.instance, PlayerFacade.instance,
                                                    component.aAnimator_2541, class600_sub1_sub3_sub1_sub1.appearance,
                                                    (byte) 13);
                                            if (class143 == null && aBool2512) {
                                                Component.redraw(component);
                                            }
                                        }
                                    }
                                } else if (5 == 286135323 * component.modelType) {
                                    int i_48_ = component.modelId * -643054127;
                                    Player class600_sub1_sub3_sub1_sub1 = null;
                                    if (i_48_ >= 0 && i_48_ < 2048) {
                                        class600_sub1_sub3_sub1_sub1 = Client.players[i_48_];
                                    } else if (i_48_ == -1) {
                                        class600_sub1_sub3_sub1_sub1 = Client.localPlayer;
                                    } else if (i_48_ == 387935885 * HashTableIterator.aClass600_Sub1_Sub3_Sub1_Sub1_8361.index) {
                                        class600_sub1_sub3_sub1_sub1 = HashTableIterator.aClass600_Sub1_Sub3_Sub1_Sub1_8361;
                                    }
                                    if (class600_sub1_sub3_sub1_sub1 != null
                                            && null != class600_sub1_sub3_sub1_sub1.appearance
                                            && (i_48_ == -1 || i_48_ == -2
                                            || i_48_ == -406165969 * Client.localPlayerIndex || Queue
                                            .method13192(class600_sub1_sub3_sub1_sub1.accountName) == 405633305 * component.anInt2420)) {
                                        class143 = class600_sub1_sub3_sub1_sub1.appearance.method9773(
                                                Class60.activeToolkit, i_45_,
                                                ProxyingVariableLoader.aClass678_Sub6_3003, IdentikitDefinition.loader,
                                                NpcDefinition.loader, ItemDefinition.loader,
                                                PlayerFacade.instance, PlayerFacade.instance,
                                                component.aAnimator_2541, null, null, null, 0, true,
                                                EquipmentDefaults.defaults);
                                    }
                                } else if (component.modelType * 286135323 == 8 || component.modelType * 286135323 == 9) {
                                    ItemTable itemTable = ItemTable.lookup(-643054127 * component.modelId, false);
                                    if (itemTable != null) {
                                        class143 = itemTable.method15450(Class60.activeToolkit, i_45_,
                                                component.aAnimator_2541, component.anInt2420 * 405633305,
                                                9 == 286135323 * component.modelType,
                                                component.item ? Client.localPlayer.appearance : null);
                                    }
                                } else if (component.aAnimator_2541 == null || !component.aAnimator_2541.hasAnimation()) {
                                    class143 = component.method4232(Class60.activeToolkit, i_45_,
                                            ProxyingVariableLoader.aClass678_Sub6_3003, IdentikitDefinition.loader,
                                            NpcDefinition.loader, ItemDefinition.loader, Animation.loader,
                                            PlayerFacade.instance, PlayerFacade.instance, null,
                                            Client.localPlayer.appearance, (byte) 13);
                                    if (class143 == null && aBool2512) {
                                        Component.redraw(component);
                                    }
                                } else {
                                    class143 = component.method4232(Class60.activeToolkit, i_45_,
                                            ProxyingVariableLoader.aClass678_Sub6_3003, IdentikitDefinition.loader,
                                            NpcDefinition.loader, ItemDefinition.loader, Animation.loader,
                                            PlayerFacade.instance, PlayerFacade.instance,
                                            component.aAnimator_2541, Client.localPlayer.appearance, (byte) 13);
                                    if (class143 == null && aBool2512) {
                                        Component.redraw(component);
                                    }
                                }
                                if (null != class143) {
                                    if (82398819 * component.anInt2412 != 0) {
                                        class143.recolor(-782603395 * component.anInt2540, -1899239005
                                                        * component.anInt2555, 822564919 * component.anInt2442,
                                                82398819 * component.anInt2412);
                                    }
                                    int i_49_;
                                    if (459297459 * component.anInt2431 > 0) {
                                        i_49_ = (component.width * 688089097 << 9) / (component.anInt2431 * 459297459);
                                    } else {
                                        i_49_ = 512;
                                    }
                                    int i_50_;
                                    if (component.anInt2551 * 557360821 > 0) {
                                        i_50_ = (component.height * 1362321717 << 9) / (component.anInt2551 * 557360821);
                                    } else {
                                        i_50_ = 512;
                                    }
                                    int i_51_ = i_12_ + 688089097 * component.width / 2;
                                    int i_52_ = 1362321717 * component.height / 2 + i_13_;
                                    if (!component.aBool2511) {
                                        i_51_ += i_49_ * 2029250227 * component.anInt2554 >> 9;
                                        i_52_ += component.anInt2428 * 202477057 * i_50_ >> 9;
                                    }
                                    Client.aClass405_10612.method6730();
                                    Class60.activeToolkit.method2471(Client.aClass405_10612);
                                    Matrix4f class399 = Class60.activeToolkit.getMatrix4f();
                                    int i_53_ = Client.scene.method7685();
                                    int i_54_ = Client.scene.method7686();
                                    i_54_ += component.spriteScale * 1331228877;
                                    if (component.aBool2423) {
                                        if (Client.mapState * 1212513917 == 3) {
                                            if (component.aBool2511) {
                                                class399.method6560(i_51_, i_52_, i_49_, i_50_,
                                                        Client.camera.method4829(2083608683),
                                                        Client.camera.method4852(-1117167181),
                                                        Engine.screenWidth * 1319181337, -551672947
                                                                * Engine.screenHeight, 1331228877 * component.spriteScale);
                                            } else {
                                                class399.method6560(i_51_, i_52_, i_49_, i_50_,
                                                        Client.camera.method4829(1924893158),
                                                        Client.camera.method4852(2049800142),
                                                        1319181337 * Engine.screenWidth, Engine.screenHeight
                                                                * -551672947, component.spriteScale * 1331228877 << 2);
                                            }
                                        } else if (component.aBool2511) {
                                            class399.method6560(i_51_, i_52_, i_49_, i_50_, i_53_, i_54_,
                                                    Engine.screenWidth * 1319181337, -551672947 * Engine.screenHeight,
                                                    component.spriteScale * 1331228877);
                                        } else {
                                            class399.method6560(i_51_, i_52_, i_49_, i_50_, i_53_, i_54_,
                                                    1319181337 * Engine.screenWidth, Engine.screenHeight * -551672947,
                                                    component.spriteScale * 1331228877 << 2);
                                        }
                                    } else if (Client.mapState * 1212513917 == 3) {
                                        class399.method6559(i_51_, i_52_, i_49_, i_50_,
                                                Client.camera.method4829(1987880513),
                                                Client.camera.method4852(-481187663),
                                                1319181337 * Engine.screenWidth, Engine.screenHeight * -551672947);
                                    } else {
                                        class399.method6559(i_51_, i_52_, i_49_, i_50_, i_53_, i_54_,
                                                Engine.screenWidth * 1319181337, -551672947 * Engine.screenHeight);
                                    }
                                    Class60.activeToolkit.method2540(class399);
                                    Class60.activeToolkit.method2426(2, 0);
                                    if (component.aBool2434) {
                                        Class60.activeToolkit.method2473(false);
                                    }
                                    if (component.aBool2511) {
                                        Client.aClass405_10715.method6758(1.0F, 0.0F, 0.0F,
                                                Class373.method6114(component.spritePitch * -322294683));
                                        Client.aClass405_10715.method6739(0.0F, 1.0F, 0.0F,
                                                Class373.method6114(-1831978227 * component.spriteRoll));
                                        Client.aClass405_10715.method6739(0.0F, 0.0F, 1.0F,
                                                Class373.method6114(1151952653 * component.spriteYaw));
                                        Client.aClass405_10715.method6744(2029250227 * component.anInt2554,
                                                202477057 * component.anInt2428, component.anInt2429 * 1656592175);
                                    } else {
                                        int i_55_ = Class373.SINE[-322294683 * component.spritePitch << 3]
                                                * (1331228877 * component.spriteScale << 2) >> 14;
                                        int i_56_ = Class373.COSINE[-322294683 * component.spritePitch << 3]
                                                * (1331228877 * component.spriteScale << 2) >> 14;
                                        Client.aClass405_10715.method6758(0.0F, 0.0F, 1.0F,
                                                Class373.method6114(-(component.spriteYaw * 1151952653) << 3));
                                        Client.aClass405_10715.method6739(0.0F, 1.0F, 0.0F,
                                                Class373.method6114(-1831978227 * component.spriteRoll << 3));
                                        Client.aClass405_10715.method6744(component.spriteOffsetX * 2134977475 << 2, i_55_
                                                        + (2141391961 * component.spriteOffsetY << 2) + i_46_,
                                                (component.spriteOffsetY * 2141391961 << 2) + i_56_);
                                        Client.aClass405_10715.method6739(1.0F, 0.0F, 0.0F,
                                                Class373.method6114(-322294683 * component.spritePitch << 3));
                                    }
                                    component.method4247(Class60.activeToolkit, class143, Client.aClass405_10715,
                                            Client.engineCycle, 1359565111);
                                    Class60.activeToolkit.method2494();
                                    Class60.activeToolkit.method2419(true);
                                    Class60.activeToolkit.method2760(i_2_, i_3_, i_4_, i_5_);
                                    if (Client.aBool10739) {
                                        Class60.activeToolkit.method2511(i_12_, i_13_,
                                                i_12_ + 688089097 * component.width, i_13_ + component.height * 1362321717);
                                    }
                                    if (component.aBool2444) {
                                        Client.scene.method7690().method9711(
                                                component.anInt2450 * 2143344029 / 256.0F,
                                                -902630033 * component.anInt2421 / 256.0F,
                                                component.anInt2449 * -957992483 / 256.0F, -1912219661 * component.anInt2448,
                                                component.anInt2445 * -377437189, -551715477 * component.anInt2459,
                                                component.anInt2349 * 256509351, -2074835423 * component.anInt2543);
                                    } else {
                                        Client.scene.method7690().method9718();
                                    }
                                    class143.method2917(Client.aClass405_10715, null, 1);
                                    if (!component.aBool2423 && null != component.aClass564_2556) {
                                        Class60.activeToolkit.method2470(component.aClass564_2556.method9494());
                                    }
                                    if (Client.aBool10739) {
                                        Class60.activeToolkit.method2760(i_2_, i_3_, i_4_, i_5_);
                                    }
                                    Class60.activeToolkit.method2419(false);
                                    Class60.activeToolkit.method2421();
                                    Class60.activeToolkit.method2760(i_2_, i_3_, i_4_, i_5_);
                                    if (component.aBool2444) {
                                        Client.scene.method7690().method9718();
                                    }
                                    if (component.aBool2434) {
                                        Class60.activeToolkit.method2473(true);
                                    }
                                }
                            } else if (9 == component.type * 1558474223) {
                                int i_57_;
                                int i_58_;
                                int i_59_;
                                int i_60_;
                                if (component.aBool2539) {
                                    i_57_ = i_12_;
                                    i_58_ = i_13_ + component.height * 1362321717;
                                    i_59_ = i_12_ + 688089097 * component.width;
                                    i_60_ = i_13_;
                                } else {
                                    i_57_ = i_12_;
                                    i_58_ = i_13_;
                                    i_59_ = i_12_ + component.width * 688089097;
                                    i_60_ = 1362321717 * component.height + i_13_;
                                }
                                if (1 == component.anInt2407 * -794611863) {
                                    Class60.activeToolkit.method2783(i_57_, i_58_, i_59_, i_60_, ~0xffffff
                                            | component.textColor * 923665021, 0);
                                } else {
                                    Class60.activeToolkit.method2748(i_57_, i_58_, i_59_, i_60_, ~0xffffff | 923665021
                                            * component.textColor, -794611863 * component.anInt2407, 0);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public Font method4229(Class374 class374, FontProvider fontProvider, int i) {
        Font class132 = (Font) class374.method6124(fontProvider, 1668905963 * fontId, false, aBool2536);
        aBool2512 = class132 == null;
        return class132;
    }

    public FontSpecification method4230(Class374 class374, FontProvider fontProvider, byte i) {
        FontSpecification class9 = class374.method6125(fontProvider, fontId * 1668905963);
        aBool2512 = null == class9;
        return class9;
    }

    public Sprite method4231(Toolkit class134, int i) {
        aBool2512 = false;
        long l = ((long) (-1694773323 * shadowColor) << 40)
                + ((horizontallyFlipped ? 1L : 0L) << 38)
                + ((long) (borderThickness * 972044571) << 36)
                + textureId * -370763243
                + ((aBool2416 ? 1L : 0L) << 35)
                + ((verticallyFlipped ? 1L : 0L) << 39);
        Sprite class116 = (Sprite) aClass168_2468.get(l);
        if (null != class116) {
            return class116;
        }
        Image class152 = ImageUtils.loadFirst(Class128.sprites, -370763243 * textureId, 0);
        if (null == class152) {
            aBool2512 = true;
            return null;
        }
        if (horizontallyFlipped) {
            class152.flipHorizontal();
        }
        if (verticallyFlipped) {
            class152.flipVertical();
        }
        if (borderThickness * 972044571 > 0) {
            class152.scale(972044571 * borderThickness);
        } else if (-1694773323 * shadowColor != 0) {
            class152.scale(1);
        }
        if (972044571 * borderThickness >= 1) {
            class152.setBorderColor(1);
        }
        if (borderThickness * 972044571 >= 2) {
            class152.setBorderColor(0xffffff);
        }
        if (shadowColor * -1694773323 != 0) {
            class152.setShadowColor(~0xffffff | shadowColor * -1694773323);
        }
        class116 = class134.createSprite(class152, true);
        aClass168_2468.put(l, class116, class116.method2157() * class116.method2119() * 4);
        return class116;
    }

    public Model method4232(Toolkit class134, int i, Class678_Sub6 class678_sub6,
                            IdentikitDefinitionLoader class678_sub11, NpcDefinitionLoader class678_sub7,
                            ItemDefinitionLoader class678_sub14, AnimationDefinitionLoader class678_sub10, VariableLoader interface14,
                            VariableProvider interface12, Animator animator, PlayerAppearance class576, byte i_0_) {
        aBool2512 = false;
        if (0 == modelType * 286135323) {
            return null;
        }
        if (286135323 * modelType == 1 && modelId * -643054127 == -1) {
            return null;
        }
        if (modelType * 286135323 == 1) {
            int i_1_ = i;
            if (animator != null) {
                i |= animator.method13457();
            }
            long l = -1L;
            long[] ls = Buffer.CRC_64;
            if (null != aShortArray2436) {
                for (int i_2_ = 0; i_2_ < aShortArray2436.length; i_2_++) {
                    l = l >>> 8 ^ ls[(int) ((l ^ aShortArray2436[i_2_] >> 8) & 0xffL)];
                    l = l >>> 8 ^ ls[(int) ((l ^ aShortArray2436[i_2_]) & 0xffL)];
                    l = l >>> 8 ^ ls[(int) ((l ^ aShortArray2437[i_2_] >> 8) & 0xffL)];
                    l = l >>> 8 ^ ls[(int) ((l ^ aShortArray2437[i_2_]) & 0xffL)];
                }
                i |= 0x4000;
            }
            if (null != aShortArray2438) {
                for (int i_3_ = 0; i_3_ < aShortArray2438.length; i_3_++) {
                    l = l >>> 8 ^ ls[(int) ((l ^ aShortArray2438[i_3_] >> 8) & 0xffL)];
                    l = l >>> 8 ^ ls[(int) ((l ^ aShortArray2438[i_3_]) & 0xffL)];
                    l = l >>> 8 ^ ls[(int) ((l ^ aShortArray2363[i_3_] >> 8) & 0xffL)];
                    l = l >>> 8 ^ ls[(int) ((l ^ aShortArray2363[i_3_]) & 0xffL)];
                }
                i |= 0x8000;
            }
            long l_4_ = (long) (class134.id * 976039213) << 59 | (long) (286135323 * modelType) << 55
                    | (long) (-643054127 * modelId) << 38 | l & 0x3fffffffffL;
            Model model = (Model) aClass168_2372.get(l_4_);
            if (model == null || class134.method2637(model.functionMask(), i) != 0) {
                if (null != model) {
                    i = class134.mergeFunctionMasks(i, model.functionMask());
                }
                BaseModel class144 = BaseModel.lookup(Class54.models, -643054127 * modelId, 0);
                if (null == class144) {
                    aBool2512 = true;
                    return null;
                }
                if (class144.version < 13) {
                    class144.method3103(2);
                }
                model = class134.createModel(class144, i, QuestDefinitionProvider.anInt2664 * -1749929127, 64, 768);
                if (null != aShortArray2436) {
                    for (int i_5_ = 0; i_5_ < aShortArray2436.length; i_5_++) {
                        model.recolour(aShortArray2436[i_5_], aShortArray2437[i_5_]);
                    }
                }
                if (aShortArray2438 != null) {
                    for (int i_6_ = 0; i_6_ < aShortArray2438.length; i_6_++) {
                        model.retexture(aShortArray2438[i_6_], aShortArray2363[i_6_]);
                    }
                }
                aClass168_2372.put(l_4_, model);
            }
            if (null != animator) {
                model = model.method2890((byte) 1, i, true);
                animator.method13458(model, 0);
            }
            model.updateFunctionMask(i_1_);
            return model;
        }
        if (2 == modelType * 286135323) {
            Model class143 = class678_sub7.get(modelId * -643054127).method5105(class134, i, interface14,
                    interface12, animator, aClass267_2361);
            if (class143 == null) {
                aBool2512 = true;
                return null;
            }
            return class143;
        }
        if (modelType * 286135323 == 3) {
            if (null == class576) {
                return null;
            }
            Model class143 = class576.createHeadModel(class134, i, class678_sub11, class678_sub7, class678_sub14,
                    interface14, interface12, animator);
            if (null == class143) {
                aBool2512 = true;
                return null;
            }
            return class143;
        }
        if (4 == 286135323 * modelType) {
            ItemDefinition itemDefinition = class678_sub14.get(modelId * -643054127);
            Model class143 = itemDefinition.method13583(class134, i, 10, class576, animator, 0, 0, 0, 0);
            if (null == class143) {
                aBool2512 = true;
                return null;
            }
            return class143;
        }
        if (modelType * 286135323 == 6) {
            Model class143 = class678_sub7.get(modelId * -643054127).method5103(class134, i, class678_sub6,
                    interface14, interface12, animator, null, null, null, 0, aClass267_2361);
            if (null == class143) {
                aBool2512 = true;
                return null;
            }
            return class143;
        }
        if (7 == modelType * 286135323) {
            if (class576 == null) {
                return null;
            }
            int i_7_ = -643054127 * modelId >>> 16;
            int i_8_ = modelId * -643054127 & 0xffff;
            int i_9_ = anInt2420 * 405633305;
            Model class143 = class576.createHeadModel(class134, i, class678_sub11, class678_sub10, animator, i_7_,
                    i_8_, i_9_, 1723143967);
            if (class143 == null) {
                aBool2512 = true;
                return null;
            }
            return class143;
        }
        return null;
    }

    public void method4234() {
        loadListeners = null;
        anObjectArray2359 = null;
        anObjectArray2357 = null;
        anObjectArray2487 = null;
        anObjectArray2557 = null;
        mouseEnterListeners = null;
        hoverListeners = null;
        mouseLeaveListeners = null;
        anObjectArray2492 = null;
        anObjectArray2493 = null;
        anObjectArray2494 = null;
        anObjectArray2495 = null;
        anObjectArray2496 = null;
        configListeners = null;
        anInt2547 = 0;
        anObjectArray2498 = null;
        anIntArray2499 = null;
        anInt2548 = 0;
        anObjectArray2500 = null;
        anIntArray2501 = null;
        anInt2460 = 0;
        anObjectArray2502 = null;
        anIntArray2503 = null;
        anInt2550 = 0;
        anObjectArray2504 = null;
        anIntArray2505 = null;
        anInt2419 = 0;
        anObjectArray2506 = null;
        anIntArray2507 = null;
        anInt2552 = 0;
        anObjectArray2508 = null;
        anObjectArray2553 = null;
        parameterListeners = null;
        anObjectArray2452 = null;
        anObjectArray2447 = null;
        anObjectArray2513 = null;
        anObjectArray2364 = null;
        anObjectArray2515 = null;
        anObjectArray2516 = null;
        anObjectArray2517 = null;
        anObjectArray2518 = null;
        anObjectArray2519 = null;
        anObjectArray2366 = null;
        anObjectArray2454 = null;
        anObjectArray2522 = null;
        anObjectArray2523 = null;
        anObjectArray2397 = null;
        anObjectArray2525 = null;
        anObjectArray2526 = null;
        anInt2389 = 1271108187;
    }

    public void method4235(int i, String string, int i_10_) {
        if (null == actions || actions.length <= i) {
            String[] strings = new String[i + 1];
            if (null != actions) {
                for (int i_11_ = 0; i_11_ < actions.length; i_11_++) {
                    strings[i_11_] = actions[i_11_];
                }
            }
            actions = strings;
        }
        actions[i] = string;
    }

    public void method4236(int i, int i_12_, int i_13_) {
        if (null == cursors || cursors.length <= i) {
            int[] is = new int[i + 1];
            if (cursors != null) {
                for (int i_14_ = 0; i_14_ < cursors.length; i_14_++) {
                    is[i_14_] = cursors[i_14_];
                }
                for (int i_15_ = cursors.length; i_15_ < i; i_15_++) {
                    is[i_15_] = -1;
                }
            }
            cursors = is;
        }
        cursors[i] = i_12_;
    }

    public int getIntOrDefault(int i, int i_16_) {
        if (parameters == null) {
            return i_16_;
        }
        IntegerNode class480_sub24 = (IntegerNode) parameters.get(i);
        if (class480_sub24 == null) {
            return i_16_;
        }
        return class480_sub24.value * -1189875169;
    }

    public String getStringOrDefault(int i, String string) {
        if (null == parameters) {
            return string;
        }
        ObjectNode class480_sub25 = (ObjectNode) parameters.get(i);
        if (null == class480_sub25) {
            return string;
        }
        return (String) class480_sub25.referent;
    }

    public void putInt(int i, int i_19_) {
        if (null == parameters) {
            parameters = new HashTable(16);
            parameters.put(i, new IntegerNode(i_19_));
        } else {
            IntegerNode class480_sub24 = (IntegerNode) parameters.get(i);
            if (class480_sub24 == null) {
                parameters.put(i, new IntegerNode(i_19_));
            } else {
                class480_sub24.value = -1975318049 * i_19_;
            }
        }
    }

    public void putString(int i, String string) {
        if (null == parameters) {
            parameters = new HashTable(16);
            parameters.put(i, new ObjectNode(string));
        } else {
            ObjectNode class480_sub25 = (ObjectNode) parameters.get(i);
            if (class480_sub25 != null) {
                class480_sub25.unlink();
            }
            parameters.put(i, new ObjectNode(string));
        }
    }

    public void method4242(int i) {
        if (parameters != null) {
            Node class480 = parameters.get(i);
            if (null != class480) {
                class480.unlink();
            }
        }
    }

    public void method4243(int i, short i_23_, short i_24_) {
        if (i < 5) {
            if (null == aShortArray2436) {
                aShortArray2436 = new short[5];
                aShortArray2437 = new short[5];
            }
            aShortArray2436[i] = i_23_;
            aShortArray2437[i] = i_24_;
        }
    }

    public void method4247(Toolkit class134, Model class143, Matrix4x3 class405, int i, int i_26_) {
        class143.method3063(class405);
        Class145[] class145s = class143.method2942();
        Class115[] class115s = class143.method2943();
        if ((null == aClass564_2556 || aClass564_2556.stopped) && (null != class145s || class115s != null)) {
            aClass564_2556 = ParticleSystem.create(i, false);
        }
        if (aClass564_2556 != null) {
            aClass564_2556.method9488(class134, i, class145s, class115s, false);
        }
    }

    public void method4249(int i, short i_27_, short i_28_) {
        if (i < 5) {
            if (aShortArray2438 == null) {
                aShortArray2438 = new short[5];
                aShortArray2363 = new short[5];
            }
            aShortArray2438[i] = i_27_;
            aShortArray2363[i] = i_28_;
        }
    }

    public Class487 method4269(SkyboxDefinitionLoader class678_sub9, SunDefinitionLoader class678_sub1, int i) {
        if (anInt2533 * -2141876157 == -1) {
            return null;
        }
        long l = (1249493721 * anInt2464 & 0xffffL) << 48 | (anInt2482 * 51414865 & 0xffffL) << 32
                | (-1384584013 * anInt2538 & 0xffffL) << 16 | -2141876157 * anInt2533 & 0xffffL;
        Class487 class487 = (Class487) aClass168_2371.get(l);
        if (null == class487) {
            class487 = Class487.createSkybox(-2141876157 * anInt2533, anInt2464 * 1249493721, anInt2482 * 51414865,
                    -1384584013 * anInt2538, class678_sub9, class678_sub1);
            aClass168_2371.put(l, class487);
        }
        return class487;
    }

    public Class211 method4298(Toolkit toolkit) {
        long l = (long) (uid * 1857819631) << 32 | index * -592186295 & 0xffffffffL;
        Class211 class211 = (Class211) aClass168_2370.get(l);
        if (class211 != null) {
            if (textureId * -370763243 != class211.anInt2184 * -1899051811) {
                aClass168_2370.remove(l);
                class211 = null;
            }
            if (class211 != null) {
                return class211;
            }
        }
        Image class152 = ImageUtils.loadFirst(Class128.sprites, -370763243 * textureId, 0);
        if (class152 == null) {
            return null;
        }
        int i_35_ = class152.getScaleWidth();
        int i_36_ = class152.getScaleHeight();
        int[] is = new int[i_36_];
        int[] is_37_ = new int[i_36_];
        for (int i_38_ = 0; i_38_ < class152.getHeight(); i_38_++) {
            int i_39_ = 0;
            int i_40_ = class152.getWidth();
            for (int i_41_ = 0; i_41_ < class152.getWidth(); i_41_++) {
                if (class152.getColour(i_41_, i_38_) != 0) {
                    i_39_ = i_41_;
                    break;
                }
            }
            for (int i_42_ = class152.getWidth() - 1; i_42_ >= i_39_; i_42_--) {
                if (class152.getColour(i_42_, i_38_) != 0) {
                    i_40_ = i_42_ + 1;
                    break;
                }
            }
            is[i_38_ + class152.getOffsetY()] = i_39_ + class152.getOffsetX();
            is_37_[i_38_ + class152.getOffsetY()] = i_40_ - i_39_;
        }
        ClippingMask class129 = toolkit.createClippingMask(i_35_, i_36_, is, is_37_);
        if (null == class129) {
            return null;
        }

        class211 = new Class211(i_35_, i_36_, is_37_, is, class129, textureId * -370763243);
        aClass168_2370.put(l, class211);
        return class211;
    }

    int[] readTriggers(Buffer buffer) {
        int i_30_ = buffer.readUByte();
        if (i_30_ == 0) {
            return null;
        }
        int[] is = new int[i_30_];
        for (int i_31_ = 0; i_31_ < i_30_; i_31_++) {
            is[i_31_] = buffer.readInt();
        }
        return is;
    }

    Object[] readScript(Buffer buffer) {
        int i_32_ = buffer.readUByte();
        if (0 == i_32_) {
            return null;
        }
        Object[] objects = new Object[i_32_];
        for (int i_33_ = 0; i_33_ < i_32_; i_33_++) {
            int i_34_ = buffer.readUByte();
            if (i_34_ == 0) {
                objects[i_33_] = new Integer(buffer.readInt());
            } else if (i_34_ == 1) {
                objects[i_33_] = buffer.readString();
            }
        }
        aBool2483 = true;
        return objects;
    }

    void method4301(Buffer buffer) {
        int parameterCount = buffer.readUByte();
        if (255 == parameterCount) {
            parameterCount = -1;
        }
        type = buffer.readUByte() * 1147822351;
        if ((1558474223 * type & 0x80) != 0) {
            type = (type * 1558474223 & 0x7f) * 1147822351;
            aString2394 = buffer.readString();
        }
        contentType = buffer.readUShort() * 1352407759;
        basePositionX = buffer.readShort() * 2065256071;
        basePositionY = buffer.readShort() * -970876179;
        baseWidth = buffer.readUShort() * 1719388879;
        baseHeight = buffer.readUShort() * 2033732677;
        aByte2358 = buffer.readByte();
        aByte2383 = buffer.readByte();
        aByte2400 = buffer.readByte();
        aByte2381 = buffer.readByte();
        parentUid = buffer.readUShort() * -107738123;
        if (65535 == 1920469085 * parentUid) {
            parentUid = 107738123;
        } else {
            parentUid = -107738123 * ((uid * 1857819631 & ~0xffff) + 1920469085 * parentUid);
        }
        int i_44_ = buffer.readUByte();
        hidden = 0 != (i_44_ & 0x1);
        if (parameterCount >= 0) {
            disableHover = (i_44_ & 0x2) != 0;
        }
        if (1558474223 * type == 0) {
            scrollWidth = buffer.readUShort() * 1011153391;
            scrollHeight = buffer.readUShort() * 1575701533;
            if (parameterCount < 0) {
                disableHover = buffer.readUByte() == 1;
            }
        }
        if (5 == type * 1558474223) {
            textureId = buffer.readInt() * -470325955;
            anInt2391 = buffer.readUShort() * 1873131179;
            int i_45_ = buffer.readUByte();
            aBool2475 = (i_45_ & 0x1) != 0;
            aBool2416 = (i_45_ & 0x2) != 0;
            anInt2406 = buffer.readUByte() * 76171347;
            borderThickness = buffer.readUByte() * -1184204525;
            shadowColor = buffer.readInt() * 1380050589;
            horizontallyFlipped = buffer.readUByte() == 1;
            verticallyFlipped = buffer.readUByte() == 1;
            textColor = buffer.readInt() * -742586667;
            if (parameterCount >= 3) {
                aBool2417 = buffer.readUByte() == 1;
            }
        }
        if (1558474223 * type == 6) {
            modelType = -512645613;
            modelId = buffer.readSmart32() * 1265546033;
            int i_46_ = buffer.readUByte();
            boolean bool = (i_46_ & 0x1) == 1;
            aBool2511 = (i_46_ & 0x2) == 2;
            aBool2423 = 4 == (i_46_ & 0x4);
            aBool2434 = 8 == (i_46_ & 0x8);
            if (bool) {
                anInt2554 = buffer.readShort() * -87869317;
                anInt2428 = buffer.readShort() * 1722970625;
                spritePitch = buffer.readUShort() * 1513530733;
                spriteRoll = buffer.readUShort() * 1225722821;
                spriteYaw = buffer.readUShort() * 746962885;
                spriteScale = buffer.readUShort() * 1495301125;
            } else if (aBool2511) {
                anInt2554 = buffer.readShort() * -87869317;
                anInt2428 = buffer.readShort() * 1722970625;
                anInt2429 = buffer.readShort() * -86437937;
                spritePitch = buffer.readUShort() * 1513530733;
                spriteRoll = buffer.readUShort() * 1225722821;
                spriteYaw = buffer.readUShort() * 746962885;
                spriteScale = buffer.readShort() * 1495301125;
            }
            animation = buffer.readSmart32() * 1473373853;
            if (0 != aByte2358) {
                anInt2431 = buffer.readUShort() * -835146629;
            }
            if (aByte2383 != 0) {
                anInt2551 = buffer.readUShort() * -581331043;
            }
        }
        if (4 == 1558474223 * type) {
            fontId = buffer.readSmart32() * -1584868157;
            if (parameterCount >= 2) {
                aBool2536 = buffer.readUByte() == 1;
            }
            text = buffer.readString();
            anInt2456 = buffer.readUByte() * -522822693;
            anInt2546 = buffer.readUByte() * -61633803;
            anInt2458 = buffer.readUByte() * 557492527;
            inventory = buffer.readUByte() == 1;
            textColor = buffer.readInt() * -742586667;
            anInt2406 = buffer.readUByte() * 76171347;
            if (parameterCount >= 0) {
                anInt2374 = buffer.readUByte() * 1445901463;
            }
        }
        if (1558474223 * type == 3) {
            textColor = buffer.readInt() * -742586667;
            filled = buffer.readUByte() == 1;
            anInt2406 = buffer.readUByte() * 76171347;
        }
        if (9 == type * 1558474223) {
            anInt2407 = buffer.readUByte() * -1334030119;
            textColor = buffer.readInt() * -742586667;
            aBool2539 = buffer.readUByte() == 1;
        }
        int i_47_ = buffer.readUTriByte();
        int i_48_ = buffer.readUByte();
        if (i_48_ != 0) {
            aByteArrayArray2549 = new byte[11][];
            aByteArrayArray2467 = new byte[11][];
            anIntArray2466 = new int[11];
            anIntArray2380 = new int[11];
            for (; i_48_ != 0; i_48_ = buffer.readUByte()) {
                int i_49_ = (i_48_ >> 4) - 1;
                i_48_ = i_48_ << 8 | buffer.readUByte();
                i_48_ &= 0xfff;
                if (i_48_ == 4095) {
                    i_48_ = -1;
                }
                byte i_50_ = buffer.readByte();
                if (i_50_ != 0) {
                    visible = true;
                }
                byte i_51_ = buffer.readByte();
                anIntArray2466[i_49_] = i_48_;
                aByteArrayArray2549[i_49_] = new byte[]{i_50_};
                aByteArrayArray2467[i_49_] = new byte[]{i_51_};
            }
        }
        name = buffer.readString();
        int i_52_ = buffer.readUByte();
        int i_53_ = i_52_ & 0xf;
        int i_54_ = i_52_ >> 4;
        if (i_53_ > 0) {
            actions = new String[i_53_];
            for (int i_55_ = 0; i_55_ < i_53_; i_55_++) {
                actions[i_55_] = buffer.readString();
            }
        }
        if (i_54_ > 0) {
            int i_56_ = buffer.readUByte();
            cursors = new int[1 + i_56_];
            for (int i_57_ = 0; i_57_ < cursors.length; i_57_++) {
                cursors[i_57_] = -1;
            }
            cursors[i_56_] = buffer.readUShort();
        }
        if (i_54_ > 1) {
            int i_58_ = buffer.readUByte();
            cursors[i_58_] = buffer.readUShort();
        }
        toolTip = buffer.readString();
        if (toolTip.equals("")) {
            toolTip = null;
        }
        anInt2446 = buffer.readUByte() * -1908006435;
        anInt2465 = buffer.readUByte() * 1912613655;
        anInt2481 = buffer.readUByte() * 1170733121;
        selectedAction = buffer.readString();
        int i_59_ = -1;
        if (ChatContainer.method4432(i_47_) != 0) {
            i_59_ = buffer.readUShort();
            if (i_59_ == 65535) {
                i_59_ = -1;
            }
            anInt2484 = buffer.readUShort() * -1887779447;
            if (anInt2484 * 326975673 == 65535) {
                anInt2484 = 1887779447;
            }
            anInt2463 = buffer.readUShort() * -1132968959;
            if (65535 == anInt2463 * -711476223) {
                anInt2463 = 1132968959;
            }
        }
        if (parameterCount >= 0) {
            anInt2427 = buffer.readUShort() * -592771235;
            if (anInt2427 * -1203862283 == 65535) {
                anInt2427 = 592771235;
            }
        }
        settings = new Class480_Sub16(i_47_, i_59_);
        if (parameterCount >= 0) {
            int i_60_ = buffer.readUByte();
            for (int i_61_ = 0; i_61_ < i_60_; i_61_++) {
                int i_62_ = buffer.readUTriByte();
                int i_63_ = buffer.readInt();
                parameters.put(i_62_, new IntegerNode(i_63_));
            }
            int i_64_ = buffer.readUByte();
            for (int i_65_ = 0; i_65_ < i_64_; i_65_++) {
                int i_66_ = buffer.readUTriByte();
                String string = buffer.readPrefixedString();
                parameters.put(i_66_, new ObjectNode(string));
            }
        }
        loadListeners = readScript(buffer);
        mouseEnterListeners = readScript(buffer);
        mouseLeaveListeners = readScript(buffer);
        anObjectArray2495 = readScript(buffer);
        anObjectArray2494 = readScript(buffer);
        anObjectArray2496 = readScript(buffer);
        anObjectArray2498 = readScript(buffer);
        anObjectArray2500 = readScript(buffer);
        anObjectArray2508 = readScript(buffer);
        anObjectArray2553 = readScript(buffer);
        if (parameterCount >= 0) {
            parameterListeners = readScript(buffer);
        }
        hoverListeners = readScript(buffer);
        anObjectArray2359 = readScript(buffer);
        anObjectArray2357 = readScript(buffer);
        anObjectArray2487 = readScript(buffer);
        anObjectArray2557 = readScript(buffer);
        anObjectArray2492 = readScript(buffer);
        anObjectArray2493 = readScript(buffer);
        anObjectArray2452 = readScript(buffer);
        anObjectArray2502 = readScript(buffer);
        anObjectArray2504 = readScript(buffer);
        configListeners = readTriggers(buffer);
        anIntArray2499 = readTriggers(buffer);
        anIntArray2501 = readTriggers(buffer);
        anIntArray2503 = readTriggers(buffer);
        anIntArray2505 = readTriggers(buffer);
    }
}
