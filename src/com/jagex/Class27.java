package com.jagex;

import java.io.IOException;

final class Class27 implements SceneEntityPredicate {
    static void method787() {
        if (null != Class34.aClass40_450) {
            try {
                int maximumTicks;
                if (0 == -1507527029 * Class34.loginErrors) {
                    maximumTicks = 250;
                } else {
                    maximumTicks = 2000;
                }

                Class34.loginTicks += 216379739;
                if (-970778925 * Class34.loginTicks > maximumTicks) {
                    FriendsChatPlayer.method1538();
                }
                if (Class34.aClass40_450 == Class40.aClass40_542) {
                    Client.lobbyConnection.init(
                            AsynchronousConnection.create(Class671.lobbyConnectionInfo.createSocket(), 15000),
                            Class671.lobbyConnectionInfo.host);
                    Client.lobbyConnection.dropFrames();
                    OutgoingFrame frame = OutgoingFrame.empty();
                    frame.payload.writeByte(HandshakeType.aClass352_3712.type * 1262357869);
                    frame.payload.writeShort(0);
                    int start = frame.payload.caret * -165875887;
                    frame.payload.writeShort(839);
                    frame.payload.writeShort(1);
                    Class34.anIntArray447 = Class164.method3369(frame);
                    int i_2_ = -165875887 * frame.payload.caret;
                    frame.payload.writeCString(Client.aString10608);
                    frame.payload.writeShort(672060199 * Client.affiliateId);
                    frame.payload.writeInt(Client.anInt10597 * -1924912047);
                    frame.payload.writeInt(832706251 * Client.anInt10596);
                    frame.payload.writeCString(EquipmentDefaults.aString7549);
                    frame.payload.writeByte(Client.currentLanguage.getId());
                    frame.payload.writeByte(-1589762327 * Client.game.id);
                    Class326.readRandom(frame.payload);
                    String string = Client.additionalInfo;
                    frame.payload.writeByte(string == null ? 0 : 1);

                    if (string != null) {
                        frame.payload.writeCString(string);
                    }

                    SystemInformation.systemInfo.encode(frame.payload);
                    frame.payload.caret += 217060311;
                    frame.payload.encodeXtea(Class34.anIntArray447, i_2_, -165875887 * frame.payload.caret);
                    frame.payload.writeSizeShort(-165875887 * frame.payload.caret - start, -1195126801);
                    Client.lobbyConnection.sendFrame(frame);
                    Client.lobbyConnection.flush();
                    Class34.aClass40_450 = Class40.aClass40_541;
                }
                if (Class34.aClass40_450 == Class40.aClass40_541) {
                    if (Client.lobbyConnection.getConnection() == null) {
                        FriendsChatPlayer.method1538();
                    } else if (Client.lobbyConnection.getConnection().available(1)) {
                        Client.lobbyConnection.getConnection().read(Client.lobbyConnection.buffer.payload, 0, 1);
                        Class34.aClass653_451 = CompressionType.findIdentifiable(Class653.values(),
                                Client.lobbyConnection.buffer.payload[0] & 0xff);
                        if (Class653.aClass653_8229 == Class34.aClass653_451) {
                            Client.lobbyConnection.encryptor = new IsaacCipher(Class34.anIntArray447);
                            int[] is = new int[4];
                            for (int i_3_ = 0; i_3_ < 4; i_3_++) {
                                is[i_3_] = Class34.anIntArray447[i_3_] + 50;
                            }
                            Client.lobbyConnection.decryptor = new IsaacCipher(is);
                            new IsaacCipher(is);
                            Client.lobbyConnection.buffer.setCipher(Client.lobbyConnection.decryptor);
                            Class536.setConnectionState(6);
                            Client.lobbyConnection.dropFrames();
                            Client.lobbyConnection.buffer.caret = 0;
                            Client.lobbyConnection.lastFrame = null;
                            Client.lobbyConnection.secondLastFrame = null;
                            Client.lobbyConnection.thirdLastFrame = null;
                            Client.lobbyConnection.idleReadPulses = 0;
                            PlayerFacade.instance.collection.reset();
                            PulseEvent.clear();
                        } else {
                            Client.lobbyConnection.stopConnection();
                        }
                        Client.lobbyConnection.currentFrame = null;
                        Class34.aClass40_450 = null;
                    }
                }
            } catch (IOException ioexception) {
                FriendsChatPlayer.method1538();
            }
        }
    }

    static void method788() {
        Class31.accountAuthenticator = "";
        Class31.accountPassword = "";
        Class31.accountUsername = "";
        Class31.loginBool = true;
    }

    static final void method789(SceneMod sceneMod) {
        SceneGraph sceneGraph = Client.scene.getGraph();
        if (null != sceneGraph) {
            SceneObject interface55 = null;
            if (sceneMod.group * -677397461 == 0) {
                interface55 = (SceneObject) sceneGraph.getBoundary(-618261599 * sceneMod.plane,
                        1155137153 * sceneMod.localX, sceneMod.localZ * 51547319);
            }
            if (1 == -677397461 * sceneMod.group) {
                interface55 = (SceneObject) sceneGraph.getBoundaryDecoration(sceneMod.plane * -618261599,
                        1155137153 * sceneMod.localX, 51547319 * sceneMod.localZ);
            }
            if (2 == sceneMod.group * -677397461) {
                interface55 = (SceneObject) sceneGraph.getEntity(sceneMod.plane * -618261599,
                        1155137153 * sceneMod.localX, sceneMod.localZ * 51547319,
                        Client.anSceneEntityPredicate_10904);
            }
            if (sceneMod.group * -677397461 == 3) {
                interface55 = (SceneObject) sceneGraph.getTileDecoration(sceneMod.plane * -618261599,
                        sceneMod.localX * 1155137153, sceneMod.localZ * 51547319);
            }
            if (null != interface55) {
                sceneMod.anInt10070 = interface55.getId() * 1052783123;
                sceneMod.anInt10062 = interface55.getType() * -434992811;
                sceneMod.anInt10060 = interface55.getOrientation() * -1836104921;
            } else {
                sceneMod.anInt10070 = -1052783123;
                sceneMod.anInt10062 = 0;
                sceneMod.anInt10060 = 0;
            }
        }
    }

    @Override
    public boolean test(SceneEntity class600_sub1_sub3, byte i) {
        return class600_sub1_sub3 instanceof SceneObject && ((SceneObject) class600_sub1_sub3).method363();
    }

}