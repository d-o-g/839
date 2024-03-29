package com.jagex;

import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;

public class AnimateObjectCutsceneAction extends CutsceneAction {
    public static QuickChatCategoryLoader aClass420_9538;
    int animation;
    int index;

    AnimateObjectCutsceneAction(Buffer buffer) {
        super(buffer);
        index = buffer.readUShort() * 651806179;
        animation = buffer.readSmart32() * 2050294559;
    }

    static final void method15078(int i) {
        Client.aBool10643 = false;
        if (SceneGraph.localPlane * 1611577177 != 3) {
            Vector3f vector3f = Client.localPlayer.getCoordinateSpace().translation;
            TileFlags class425 = Client.scene.method7775();
            if (1212513917 * Client.mapState == 2 || 3 == 1212513917 * Client.mapState
                    || -1 != 1601470857 * Class156.anInt1886) {
                CoordGrid class553 = Client.scene.getBase();
                int i_0_;
                int i_1_;
                if (Client.mapState * 1212513917 == 3) {
                    Vector3f vector3f_2_ = Client.camera.method4834().method13222((byte) 1);
                    if (Float.isNaN(vector3f_2_.x)) {
                        return;
                    }
                    i_0_ = (int) vector3f_2_.x - (2051316501 * class553.x << 9);
                    i_1_ = (int) vector3f_2_.z - (-180305283 * class553.z << 9);
                    if (i_0_ < 0 || i_1_ < 0 || i_0_ >> 9 >= class425.flags[1611577177 * SceneGraph.localPlane].length
                            || i_1_ >> 9 >= class425.flags[SceneGraph.localPlane * 1611577177][i_0_ >> 9].length) {
                        return;
                    }
                } else if (2 == Client.mapState * 1212513917) {
                    i_0_ = (int) vector3f.x;
                    i_1_ = (int) vector3f.z;
                } else {
                    i_0_ = 1601470857 * Class156.anInt1886;
                    i_1_ = 56240793 * TurnMobCutsceneAction.anInt9433;
                }
                if ((class425.flags[1611577177 * SceneGraph.localPlane][i_0_ >> 9][i_1_ >> 9] & 0x4) != 0) {
                    Client.aBool10643 = true;
                } else {
                    int i_3_;
                    int i_4_;
                    if (1212513917 * Client.mapState == 3) {
                        Vector3f vector3f_5_ = Client.camera.method4876().method5224();
                        i_3_ = ((int) vector3f_5_.x >> 9) - 2051316501 * class553.x;
                        i_4_ = ((int) vector3f_5_.z >> 9) - class553.z * -180305283;
                        if (i_3_ < 0 || i_4_ < 0 || i_3_ >= class425.flags[SceneGraph.localPlane * 1611577177].length
                                || i_4_ >= class425.flags[1611577177 * SceneGraph.localPlane][i_3_].length) {
                            return;
                        }
                    } else {
                        i_3_ = 2006359481 * Client.cameraX >> 9;
                        i_4_ = 1829446257 * Client.cameraZ >> 9;
                    }
                    int i_6_ = i_0_ >> 9;
                    int i_7_ = i_1_ >> 9;
                    if (class425.method7066(i_3_, i_4_)) {
                        int i_8_ = SceneGraph.getAverageHeight(Client.cameraX * 2006359481, Client.cameraZ * 1829446257, 3);
                        if (Class268.cameraY * 1525233901 >= i_8_) {
                            Client.aBool10643 = true;
                        }
                    } else {
                        while_9_:
                        do {
                            if (912649057 * Class155.cameraPitch < 2560) {
                                int i_9_;
                                if (i_6_ > i_3_) {
                                    i_9_ = i_6_ - i_3_;
                                } else {
                                    i_9_ = i_3_ - i_6_;
                                }
                                int i_10_;
                                if (i_7_ > i_4_) {
                                    i_10_ = i_7_ - i_4_;
                                } else {
                                    i_10_ = i_4_ - i_7_;
                                }
                                if (0 == i_9_ && 0 == i_10_ || i_9_ <= -Client.scene.getMapWidth()
                                        || i_9_ >= Client.scene.getMapWidth()
                                        || i_10_ <= -Client.scene.getMapLength()
                                        || i_10_ >= Client.scene.getMapLength()) {
                                    if (Client.mapState * 1212513917 != 3) {
                                        HitsplatDefinitionProvider.reportError(
                                                new StringBuilder().append(i_3_).append(Class60.COMMA).append(i_4_)
                                                        .append(" ").append(i_6_).append(Class60.COMMA).append(i_7_)
                                                        .append(" ").append(2051316501 * class553.x)
                                                        .append(Class60.COMMA).append(class553.z * -180305283)
                                                        .toString(), new RuntimeException());
                                    }
                                    break;
                                }
                                if (i_9_ > i_10_) {
                                    int i_11_ = 65536 * i_10_ / i_9_;
                                    int i_12_ = 32768;
                                    while_8_:
                                    do {
                                        while (true) {
                                            if (i_3_ == i_6_) {
                                                break while_8_;
                                            }
                                            if (i_3_ < i_6_) {
                                                i_3_++;
                                            } else if (i_3_ > i_6_) {
                                                i_3_--;
                                            }
                                            if (0 != (class425.flags[SceneGraph.localPlane * 1611577177][i_3_][i_4_] & 0x4)) {
                                                Client.aBool10643 = true;
                                                return;
                                            }
                                            if (1 + i_4_ < class425.flags[1611577177 * SceneGraph.localPlane][i_3_].length
                                                    && (class425.flags[1611577177 * SceneGraph.localPlane][i_3_][i_4_ + 1] & 0x4) != 0) {
                                                Client.aBool10643 = true;
                                                return;
                                            }
                                            if (i_4_ > 0
                                                    && (class425.flags[1611577177 * SceneGraph.localPlane][i_3_][i_4_ - 1] & 0x4) != 0) {
                                                Client.aBool10643 = true;
                                                return;
                                            }
                                            i_12_ += i_11_;
                                            if (i_12_ >= 65536) {
                                                i_12_ -= 65536;
                                                if (i_4_ < i_7_) {
                                                    if (++i_4_ + 1 < class425.flags[1611577177 * SceneGraph.localPlane][i_3_].length
                                                            && 0 != (class425.flags[SceneGraph.localPlane * 1611577177][i_3_][i_4_ + 1] & 0x4)) {
                                                        Client.aBool10643 = true;
                                                        return;
                                                    }
                                                } else if (i_4_ > i_7_
                                                        && --i_4_ > 0
                                                        && 0 != (class425.flags[1611577177 * SceneGraph.localPlane][i_3_][i_4_ - 1] & 0x4)) {
                                                    break;
                                                }
                                            }
                                        }
                                        Client.aBool10643 = true;
                                        return;
                                    } while (false);
                                } else {
                                    int i_13_ = i_9_ * 65536 / i_10_;
                                    int i_14_ = 32768;
                                    while (true) {
                                        if (i_7_ == i_4_) {
                                            break while_9_;
                                        }
                                        if (i_4_ < i_7_) {
                                            i_4_++;
                                        } else if (i_4_ > i_7_) {
                                            i_4_--;
                                        }
                                        if (0 != (class425.flags[1611577177 * SceneGraph.localPlane][i_3_][i_4_] & 0x4)) {
                                            Client.aBool10643 = true;
                                            return;
                                        }
                                        if (i_3_ + 1 < class425.flags[SceneGraph.localPlane * 1611577177].length
                                                && 0 != (class425.flags[1611577177 * SceneGraph.localPlane][i_3_ + 1][i_4_] & 0x4)) {
                                            Client.aBool10643 = true;
                                            return;
                                        }
                                        if (i_3_ > 0
                                                && (class425.flags[1611577177 * SceneGraph.localPlane][i_3_ - 1][i_4_] & 0x4) != 0) {
                                            Client.aBool10643 = true;
                                            return;
                                        }
                                        i_14_ += i_13_;
                                        if (i_14_ >= 65536) {
                                            i_14_ -= 65536;
                                            if (i_3_ < i_6_) {
                                                i_3_++;
                                                if (1 + i_3_ < class425.flags[1611577177 * SceneGraph.localPlane].length
                                                        && 0 != (class425.flags[SceneGraph.localPlane * 1611577177][1 + i_3_][i_4_] & 0x4)) {
                                                    Client.aBool10643 = true;
                                                    return;
                                                }
                                            } else if (i_3_ > i_6_
                                                    && --i_3_ > 0
                                                    && 0 != (class425.flags[SceneGraph.localPlane * 1611577177][i_3_ - 1][i_4_] & 0x4)) {
                                                break;
                                            }
                                        }
                                    }
                                    Client.aBool10643 = true;
                                    break;
                                }
                            }
                        } while (false);
                    }
                }
            } else {
                int i_15_ = SceneGraph.getAverageHeight(2006359481 * Client.cameraX, Client.cameraZ * 1829446257,
                        SceneGraph.localPlane * 1611577177);
                if (i_15_ - 1525233901 * Class268.cameraY < 3200
                        && (class425.flags[1611577177 * SceneGraph.localPlane][2006359481 * Client.cameraX >> 9][Client.cameraZ * 1829446257 >> 9] & 0x4) != 0) {
                    Client.aBool10643 = true;
                }
            }
        }
    }

    static final void method15079() {
        if (Client.anInt10622 * -1420335485 > 1) {
            Client.anInt10622 -= -461596629;
            Client.anInt10839 = Client.anInt10823 * 443759197;
        }
        if (Client.gameConnection.error) {
            Client.gameConnection.error = false;
            Client.dropConnection();
        } else {
            if (!Class56.menuOpen) {
                FriendsChatPlayer.method1540();
            }
            for (int i_16_ = 0; i_16_ < 100 && Client.decodeFrame(Client.gameConnection); i_16_++) {

            }

            if (16 == Client.connectionState * -1501875989) {
                while (ReflectionRequest.remaining()) {
                    OutgoingFrame buffer = OutgoingFrame.prepare(OutgoingFrameMeta.REFLECTION_RESPONSE,
                            Client.gameConnection.encryptor);
                    buffer.payload.writeByte(0);
                    int start = -165875887 * buffer.payload.caret;
                    ReflectionRequest.pulseActive(buffer.payload);
                    buffer.payload.writeSizeByte(-165875887 * buffer.payload.caret - start);
                    Client.gameConnection.sendFrame(buffer);
                }

                if (null != Class24.aClass587_336) {
                    if (Class24.aClass587_336.anInt7774 * 897654775 != -1) {
                        OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3954,
                                Client.gameConnection.encryptor);
                        if (null == Class530.collector
                                || !Class530.collector.isValid()) {
                            try {
                                Iterator<GarbageCollectorMXBean> iterator = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                                while (iterator.hasNext()) {
                                    GarbageCollectorMXBean collector = iterator.next();
                                    if (collector.isValid()) {
                                        Class530.collector = collector;
                                        Client.aLong10621 = 299448494646313335L;
                                        Client.aLong10651 = -6177003193931669139L;
                                    }
                                }
                            } catch (Throwable throwable) {

                            }
                        }

                        long l = TimeUtil.time();
                        int i_18_ = -1;
                        if (null != Class530.collector) {
                            long time = Class530.collector.getCollectionTime();
                            if (-1L != Client.aLong10651 * -6829097710898008165L) {
                                long l_20_ = time - Client.aLong10651 * -6829097710898008165L;
                                long l_21_ = l - Client.aLong10621 * 4985670860980623289L;

                                if (l_21_ != 0L) {
                                    i_18_ = (int) (100L * l_20_ / l_21_);
                                }
                            }
                            Client.aLong10651 = time * 6177003193931669139L;
                            Client.aLong10621 = l * -299448494646313335L;
                        }

                        frame.payload.writeShort(Class24.aClass587_336.anInt7774 * 897654775);
                        frame.payload.writeByteS(-1101491257 * Engine.anInt6488);
                        frame.payload.writeNegatedByte(i_18_);
                        Client.gameConnection.sendFrame(frame);
                        Class24.aClass587_336 = null;
                        Class224.aLong2344 = (30000L + l) * 1286494521448316599L;
                    }
                } else if (TimeUtil.time() >= -5666957709342572793L * Class224.aLong2344) {
                    Class24.aClass587_336 = Client.aClass588_10855.method9897(Class671.activeConnectionInfo.host);
                }
                Class157.method3302();
                Class540.method9217();
                MouseRecord record = Client.mouseRecords.head();
                if (Client.scene.getGraph() != null) {
                    if (Client.mapState * 1212513917 == 5) {
                        Client.method13191(1824640902);
                    } else if (1212513917 * Client.mapState == 1) {
                        Class51.method1136();
                    }
                }
                if (Client.aBool10828) {
                    Client.aBool10828 = false;
                } else {
                    Client.aFloat10711 /= 2.0F;
                }
                if (Client.aBool10740) {
                    Client.aBool10740 = false;
                } else {
                    Client.aFloat10710 /= 2.0F;
                }
                if (Class56.method1348()) {
                    Class22.method749();
                } else if (3 == Client.mapState * 1212513917) {
                    CoordGrid class553 = Client.scene.getBase();
                    int i_22_ = class553.x * 2051316501 << 9;
                    int i_23_ = -180305283 * class553.z << 9;
                    if (5632020189464950403L * Class171.aLong1960 <= 0L) {
                        Class171.aLong1960 = TimeUtil.time() * 9097145590394488875L;
                    }
                    float f = TimeUtil.time() - Class171.aLong1960 * 5632020189464950403L;
                    int i_24_ = 1000 / EntityQueue.getFps();
                    i_24_ *= 1.25;
                    while (f > 0.0F) {
                        float f_25_ = Math.min(f, i_24_);
                        Client.camera.method4804(f_25_ / 1000.0F,
                                Client.scene.method7696().tileHeights, Client.scene.method7775(),
                                i_22_, i_23_);
                        f -= i_24_;
                    }
                    Class171.aLong1960 = TimeUtil.time() * 9097145590394488875L;
                }
                EntityQueue.method13531();
                if (16 == -1501875989 * Client.connectionState) {
                    Client.scene.method7690().method9694(Client.scene);
                    Class341.method5866(-705357192);
                    if (-1075935367 * Client.anInt10631 > 10) {
                        Client.gameConnection.idleReadPulses += 1622822975;
                    }
                    if (-115761217 * Client.gameConnection.idleReadPulses > 2250) {
                        Client.dropConnection();
                    } else {
                        if (2087248539 * Client.cutsceneStatus == 3) {
                            BaseAnimationDefinitionProvider.method3318();
                            Npc.method750();
                        } else if (Class453.aClass558_5097.subscriber.valid(record, Client.anInterface59Array10640,
                                767783973 * Client.maximumHeldKeys, Class193.keyRecorder)) {
                            Class187.method3739(false);
                        } else {
                            if (4 == Client.cutsceneStatus * 2087248539
                                    && Class597.method10130(Client.currentCutscene * 1642530983)) {
                                Client.scene.method7706(new Class452(SceneFormat.aSceneFormat_5152, null));
                                Client.cutsceneStatus = 451307302;
                            }

                            if (2087248539 * Client.cutsceneStatus == 2 && 13 != -1501875989 * Client.connectionState) {
                                Class163.variables.clear();
                                Client.cutsceneStatus = 225653651;
                                Client.anInt10627 = Client.engineCycle * 2105868375;
                                Client.anInt10680 = 0;
                                Client.aBool10678 = false;
                                OrthoModePreference.method16569();
                            }

                            if (Client.cutsceneStatus * 2087248539 == 1) {
                                int i_26_ = Client.engineCycle - Client.anInt10627 * 958131047;
                                if (-1639495075 * Client.anInt10680 < CutsceneAction.actions.length) {
                                    do {
                                        CutsceneAction action = CutsceneAction.actions[Client.anInt10680 * -1639495075];
                                        if (-688288591 * action.startTime > i_26_) {
                                            break;
                                        }

                                        action.execute();
                                    } while (Client.cutsceneStatus * 2087248539 == 1
                                            && (Client.anInt10680 += -320742923) * -1639495075 < CutsceneAction.actions.length);
                                }

                                if (1 == 2087248539 * Client.cutsceneStatus) {
                                    for (int index = 0; index < CutsceneMobile.cutsceneMobiles.length; index++) {
                                        CutsceneMobile mob = CutsceneMobile.cutsceneMobiles[index];
                                        if (mob.initialised) {
                                            TranslatableString.method559(mob.get(), true);
                                        }
                                    }
                                }
                            }
                        }
                        Client.pulseChat();
                        Class201.method3943();
                        PulseEvent.method9831();
                        GraphicsCard.method2248(false);
                        ReflectiveDefinitionProvider.method13897(Class60.activeToolkit,
                                CachedParticleDefinitionLoader.aClass147_3727, -1727251557);
                        Client.anInt10595 += 1052897239;
                        if (1212199165 * Client.crosshairState != 0) {
                            Client.anInt10679 += -553352372;
                            if (Client.anInt10679 * -1156246329 >= 400) {
                                Client.crosshairState = 0;
                            }
                        }
                        if (DrawableText.aClass226_9829 != null) {
                            Client.anInt10741 += -1012912079;
                            if (Client.anInt10741 * 444672209 >= 15) {
                                Component.redraw(DrawableText.aClass226_9829);
                                DrawableText.aClass226_9829 = null;
                            }
                        }
                        Client.aClass226_10805 = null;
                        Client.aBool10811 = false;
                        Client.aBool10806 = false;
                        ParticleProducer.aClass226_7678 = null;
                        Class427.method7086(null, -1, -1);
                        if (!Client.componentSelected) {
                            Client.anInt10782 = -2101032765;
                        }
                        Class341.method5867();
                        Client.anInt10823 += -1878559865;
                        if (Client.aBool10817) {
                            OutgoingFrame class480_sub15 = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3949,
                                    Client.gameConnection.encryptor);
                            class480_sub15.payload.writeMEInt(Class578.anInt7740 * 701693211 << 28
                                    | Mobile.anInt11561 * -1732858573 << 14 | 1795044107 * MouseOverEntity.anInt6966);
                            Client.gameConnection.sendFrame(class480_sub15);
                            Client.aBool10817 = false;
                        }
                        while (true) {
                            ScriptContext class480_sub35 = (ScriptContext) Client.aClass644_10844.popHead();
                            if (class480_sub35 == null) {
                                break;
                            }
                            Component class226 = class480_sub35.source;
                            if (-592186295 * class226.index >= 0) {
                                Component class226_28_ = Component.lookup(1920469085 * class226.parentUid);
                                if (null == class226_28_ || null == class226_28_.components2
                                        || class226.index * -592186295 >= class226_28_.components2.length
                                        || class226 != class226_28_.components2[class226.index * -592186295]) {
                                    continue;
                                }
                            }
                            Script.execute(class480_sub35);
                        }
                        while (true) {
                            ScriptContext class480_sub35 = (ScriptContext) Client.aClass644_10897.popHead();
                            if (null == class480_sub35) {
                                break;
                            }
                            Component class226 = class480_sub35.source;
                            if (class226.index * -592186295 >= 0) {
                                Component class226_29_ = Component.lookup(class226.parentUid * 1920469085);
                                if (class226_29_ == null || class226_29_.components2 == null
                                        || class226.index * -592186295 >= class226_29_.components2.length
                                        || class226 != class226_29_.components2[class226.index * -592186295]) {
                                    continue;
                                }
                            }
                            Script.execute(class480_sub35);
                        }
                        while (true) {
                            ScriptContext class480_sub35 = Client.scriptEvents.popHead();
                            if (class480_sub35 == null) {
                                break;
                            }
                            Component class226 = class480_sub35.source;
                            if (-592186295 * class226.index >= 0) {
                                Component class226_30_ = Component.lookup(class226.parentUid * 1920469085);
                                if (null == class226_30_ || null == class226_30_.components2
                                        || -592186295 * class226.index >= class226_30_.components2.length
                                        || class226 != class226_30_.components2[-592186295 * class226.index]) {
                                    continue;
                                }
                            }
                            Script.execute(class480_sub35);
                        }
                        if (ParticleProducer.aClass226_7678 == null) {
                            Client.anInt10815 = 0;
                        }
                        if (Client.aClass226_10801 != null) {
                            Class54.method1165();
                        }
                        VarpBitLoader.method16717();
                        if (1667858447 * Client.localPrivilege > 0 && Class193.keyRecorder.held(82)
                                && Class193.keyRecorder.held(81) && 0 != -199372903 * Client.anInt10818) {
                            int plane = Client.localPlayer.plane - Client.anInt10818 * -199372903;
                            if (plane < 0) {
                                plane = 0;
                            } else if (plane > 3) {
                                plane = 3;
                            }
                            CoordGrid base = Client.scene.getBase();
                            Client.teleport(plane, Client.localPlayer.pathX[0] + 2051316501 * base.x,
                                    Client.localPlayer.pathZ[0] + base.z * -180305283);
                        }
                        for (int i_32_ = 0; i_32_ < 5; i_32_++) {
                            Client.anIntArray10877[i_32_]++;
                        }
                        if (Class199.aVarcs_2099.aBool8692
                                && 8485778212217677161L * Class199.aVarcs_2099.aLong8687 < TimeUtil.time() - 60000L) {
                            Class536.method9176();
                        }
                        Class199.aVarcs_2099.writeFrame();

                        for (FriendLoginUpdate upd = Client.friendLogins.head(); null != upd; upd = Client.friendLogins.next()) {
                            if (1856954959 * upd.time < TimeUtil.time() / 1000L - 5L) {
                                if (upd.world > 0) {
                                    Class176.addChatMessage(5, 0, "", "", "", upd.name
                                            + TranslatableString.HAS_LOGGED_IN.translate(Client.currentLanguage), null);
                                } else if (0 == upd.world) {
                                    Class176.addChatMessage(5, 0, "", "", "", upd.name
                                            + TranslatableString.HAS_LOGGED_OUT.translate(Client.currentLanguage), null);
                                }

                                upd.unlink();
                            }
                        }

                        Client.anInt10698 += -413718509;
                        if (-543497701 * Client.anInt10698 > 500) {
                            Client.anInt10698 = 0;
                            int i_33_ = (int) (Math.random() * 8.0);
                            if ((i_33_ & 0x1) == 1) {
                                Client.anInt10692 += -1183163553 * Client.anInt10792;
                            }
                            if ((i_33_ & 0x2) == 2) {
                                Client.anInt10694 += Client.anInt10695 * -116954263;
                            }
                            if ((i_33_ & 0x4) == 4) {
                                Client.anInt10615 += 1069768069 * Client.anInt10812;
                            }
                        }
                        if (-123944055 * Client.anInt10692 < -55) {
                            Client.anInt10792 = -533225010;
                        }
                        if (-123944055 * Client.anInt10692 > 52) {
                            Client.anInt10792 = 533225010;
                        }
                        if (-861250759 * Client.anInt10694 < -59) {
                            Client.anInt10695 = -988000958;
                        }
                        if (Client.anInt10694 * -861250759 > 61) {
                            Client.anInt10695 = 988000958;
                        }
                        if (1902938021 * Client.anInt10615 < -41) {
                            Client.anInt10812 = -269431671;
                        }
                        if (1902938021 * Client.anInt10615 > 44) {
                            Client.anInt10812 = 269431671;
                        }
                        Client.anInt10703 += 776404163;
                        if (Client.anInt10703 * 73831403 > 503) {
                            Client.anInt10703 = 0;
                            int i_34_ = (int) (Math.random() * 8.0);
                            if ((i_34_ & 0x1) == 1) {
                                Client.pendingWalkX += -5618339 * Client.anInt10755;
                            }
                            if (2 == (i_34_ & 0x2)) {
                                Client.pendingWalkY += Client.anInt10702 * 867010281;
                            }
                        }
                        if (Client.pendingWalkX * 1093165775 < -69) {
                            Client.anInt10755 = -587360778;
                        }
                        if (1093165775 * Client.pendingWalkX > 61) {
                            Client.anInt10755 = 587360778;
                        }
                        if (Client.pendingWalkY * -1894746741 < -20) {
                            Client.anInt10702 = -1102431957;
                        }
                        if (Client.pendingWalkY * -1894746741 > 12) {
                            Client.anInt10702 = 1102431957;
                        }
                        Client.gameConnection.idleWritePulses += -1224738573;
                        if (1834999867 * Client.gameConnection.idleWritePulses > 50) {
                            OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.KEEP_ALIVE,
                                    Client.gameConnection.encryptor);
                            Client.gameConnection.sendFrame(frame);
                        }
                        if (Client.aBool10667) {
                            Class671.method13824();
                            Client.aBool10667 = false;
                        }
                        try {
                            Client.gameConnection.flush();
                        } catch (IOException ioexception) {
                            Client.dropConnection();
                        }
                    }
                }
            }
        }
    }

    @Override
    public void execute() {
        CutsceneObject object = CutsceneObject.objects[-2026657845 * index];
        Client.animateObject(-1399477555 * object.plane, 615186799 * object.x, object.z * -625996537,
                1481811911 * object.category.group, -1050493863 * object.category.type, -2095101887
                        * object.orientation, animation * 1340913887, 0);
    }

    @Override
    boolean ready() {
        Animation animation = Animation.loader.get(this.animation * 1340913887);
        return animation.ready();
    }

}