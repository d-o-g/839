package com.jagex;

public class Class252 {
    public static boolean aBool2693 = false;
    static int accountInfoSize;

    Class252() throws Throwable {
        throw new Error();
    }

    public static long hashString(CharSequence sequence) {
        int length = sequence.length();
        long hash = 0L;

        for (int index = 0; index < length; index++) {
            hash = (hash << 5) - hash + sequence.charAt(index);
        }

        return hash;
    }

    static final void method4718(int i, int i_5_, int i_6_, int i_7_, boolean bool, int i_8_) {
        if (Client.scene.getGraph() == null) {
            Class60.activeToolkit.method2805(i, i_5_, i_6_, i_7_, -16777216);
        } else {
            Vector3f vector3f = Client.localPlayer.getCoordinateSpace().translation;
            boolean bool_9_ = false;
            if (2087248539 * Client.cutsceneStatus != 3) {
                if (!Client.aBool10678) {
                    bool_9_ = true;
                }
            } else {
                if ((int) vector3f.x < 0 || (int) vector3f.x >= Client.scene.getMapWidth() * 512
                        || (int) vector3f.z < 0 || (int) vector3f.z >= Client.scene.getMapLength() * 512) {
                    bool_9_ = true;
                }
                if (1212513917 * Client.mapState == 3 && !Client.camera.method4830()) {
                    bool_9_ = true;
                }
            }
            if (bool_9_) {
                Class60.activeToolkit.method2805(i, i_5_, i_6_, i_7_, -16777216);
            } else {
                Client.anInt10730 += 2078756833;
                if (null != Client.localPlayer
                        && (int) vector3f.x - (Client.localPlayer.boundSize() - 1) * 256 >> 9 == 1134492539 * Class63.destinationX
                        && (int) vector3f.z - (Client.localPlayer.boundSize() - 1) * 256 >> 9 == 650498389 * Class63.destinationY) {
                    Class63.destinationX = 517887053;
                    Class63.destinationY = -224109565;
                    PulseEvent.method16137();
                }
                Class504.method8724();
                if (!bool) {
                    method4719();
                }
                Effect.method916();
                for (int i_10_ = 0; i_10_ < Client.aClass473Array10624.length; i_10_++) {
                    if (Client.aClass473Array10624[i_10_] != null && !Client.aClass473Array10624[i_10_].method8067()
                            && Client.aClass473Array10624[i_10_].hasModel(Class60.activeToolkit)) {
                        Client.aClass473Array10624[i_10_].method8064(Client.scene.getGraph());
                    }
                }
                Class437.method7274(i, i_5_, i_6_, i_7_, true);
                i = Client.anInt10728 * -674483459;
                i_5_ = Client.anInt10655 * 1180573087;
                i_6_ = 101040205 * Client.anInt10888;
                i_7_ = -1154672011 * Client.anInt10889;
                Billboard.method6007(i, i_5_, 1277578711);
                if (1212513917 * Client.mapState == 2) {
                    int i_11_ = (int) Client.aFloat10708;
                    if (1848927567 * Client.anInt10717 >> 8 > i_11_) {
                        i_11_ = 1848927567 * Client.anInt10717 >> 8;
                    }
                    if (Client.aBoolArray10873[4] && 128 + Client.anIntArray10875[4] > i_11_) {
                        i_11_ = Client.anIntArray10875[4] + 128;
                    }
                    int i_12_ = 1902938021 * Client.anInt10615 + (int) Client.aFloat10787 & 0x3fff;
                    NativeLibraryLoadException
                            .method17347(
                                    Class215.anInt2196 * -55942707,
                                    SceneGraph.getAverageHeight((int) vector3f.x, (int) vector3f.z,
                                            SceneGraph.localPlane * 1611577177)
                                            - -1160922663
                                            * Client.anInt10912, Class115.anInt1444 * -457862351, i_11_, i_12_,
                                    600 + 3 * (i_11_ >> 3) << 2, i_7_, 935030189);
                } else if (6 == 1212513917 * Client.mapState) {
                    int i_13_ = (int) Client.aFloat10708;
                    if (1848927567 * Client.anInt10717 >> 8 > i_13_) {
                        i_13_ = Client.anInt10717 * 1848927567 >> 8;
                    }
                    if (Client.aBoolArray10873[4] && Client.anIntArray10875[4] + 128 > i_13_) {
                        i_13_ = Client.anIntArray10875[4] + 128;
                    }
                    int i_14_ = (int) Client.aFloat10787 & 0x3fff;
                    NativeLibraryLoadException.method17347(
                            Class215.anInt2196 * -55942707,
                            SceneGraph.getAverageHeight(Client.anInt10706 * 1327138123, Client.anInt10707 * -2128941351,
                                    SceneGraph.localPlane * 1611577177) - -1160922663 * Client.anInt10912,
                            Class115.anInt1444 * -457862351, i_13_, i_14_, 600 + 3 * (i_13_ >> 3) << 2, i_7_,
                            -304872783);
                } else if (4 == Client.mapState * 1212513917) {
                    Class38.method1021(i_7_, -1144832548);
                }
                int cameraX = Client.cameraX * 2006359481;
                int cameraY = Class268.cameraY * 1525233901;
                int cameraZ = Client.cameraZ * 1829446257;
                int cameraPitch = Class155.cameraPitch * 912649057;
                int cameraYaw = Class550.cameraYaw * 1686504405;
                for (int i_20_ = 0; i_20_ < 5; i_20_++) {
                    if (Client.aBoolArray10873[i_20_]) {
                        int i_21_ = (int) (Math.random() * (1 + 2 * Client.anIntArray10709[i_20_])
                                - Client.anIntArray10709[i_20_] + Math.sin(Client.anIntArray10876[i_20_] / 100.0
                                * Client.anIntArray10877[i_20_])
                                * Client.anIntArray10875[i_20_]);
                        if (i_20_ == 0) {
                            Client.cameraX += (i_21_ << 2) * -224503671;
                        }
                        if (i_20_ == 1) {
                            Class268.cameraY += (i_21_ << 2) * -1128143643;
                        }
                        if (i_20_ == 2) {
                            Client.cameraZ += (i_21_ << 2) * -187933039;
                        }
                        if (3 == i_20_) {
                            Class550.cameraYaw = (1686504405 * Class550.cameraYaw + i_21_ & 0x3fff) * -1726145155;
                        }
                        if (i_20_ == 4) {
                            Class155.cameraPitch += i_21_ * -1300105055;
                            if (Class155.cameraPitch * 912649057 < 1024) {
                                Class155.cameraPitch = 132285440;
                            } else if (912649057 * Class155.cameraPitch > 3072) {
                                Class155.cameraPitch = 396856320;
                            }
                        }
                    }
                }
                if (2006359481 * Client.cameraX < 0) {
                    Client.cameraX = 0;
                }
                if (2006359481 * Client.cameraX > (Client.scene.getGraph().width * 173827901 << 9) - 1) {
                    Client.cameraX = ((Client.scene.getGraph().width * 173827901 << 9) - 1) * -224503671;
                }
                if (Client.cameraZ * 1829446257 < 0) {
                    Client.cameraZ = 0;
                }
                if (Client.cameraZ * 1829446257 > (Client.scene.getGraph().length * 134933557 << 9) - 1) {
                    Client.cameraZ = ((Client.scene.getGraph().length * 134933557 << 9) - 1) * -187933039;
                }
                if (Class199.preferences.aClass632_Sub22_10284.getValue() == 2) {
                    Class530.method9026((byte) 8);
                } else if (Class199.preferences.aClass632_Sub22_10284.getValue() == 3) {
                    AnimateObjectCutsceneAction.method15078(1484624939);
                }
                Class60.activeToolkit.method2566(i, i_5_, i_6_, i_7_);
                Class60.activeToolkit.method2419(true);
                Class60.activeToolkit.method2760(i, i_5_, i_6_ + i, i_7_ + i_5_);
                Class569 class569 = Client.scene.method7690().method9707();
                int i_22_ = class569.method9600();
                Class268 class268 = new Class268();
                CoordGrid class553 = Client.scene.getBase();
                if (Class56.method1348()) {
                    Class50.camera.method4891(class268, Client.aClass405_10612, Client.aClass399_10752,
                            class553.x * 2051316501 << 9, -180305283 * class553.z << 9, (byte) -33);
                } else if (3 == Client.mapState * 1212513917) {
                    Client.camera.method4891(class268, Client.aClass405_10612, Client.aClass399_10752,
                            2051316501 * class553.x << 9, -180305283 * class553.z << 9, (byte) -33);
                } else {
                    Client.aClass405_10612.method6742(-(Client.cameraX * 2006359481), -(Class268.cameraY * 1525233901),
                            -(Client.cameraZ * 1829446257));
                    Client.aClass405_10612.method6739(0.0F, -1.0F, 0.0F,
                            Class373.method6114(-(Class550.cameraYaw * 1686504405) & 0x3fff));
                    Client.aClass405_10612.method6739(-1.0F, 0.0F, 0.0F,
                            Class373.method6114(-(Class155.cameraPitch * 912649057) & 0x3fff));
                    Client.aClass405_10612.method6739(0.0F, 0.0F, -1.0F,
                            Class373.method6114(-(IncomingFrameMeta.anInt4473 * -572932877) & 0x3fff));
                    Class330.method5806(Client.aClass399_10752, true, i_6_ / 2, i_7_ / 2,
                            Client.anInt10906 * 749919243 << 1, 749919243 * Client.anInt10906 << 1, i_6_, i_7_);
                }
                Class60.activeToolkit.method2471(Client.aClass405_10612);
                Class60.activeToolkit.method2540(Client.aClass399_10752);
                if (class569.method9621() != null) {
                    Class60.activeToolkit.method2476(1.0F);
                    Class60.activeToolkit.method2477(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
                    if (1212513917 * Client.mapState == 3) {
                        int i_23_ = (int) (Client.camera.getPitch((byte) 1) * 2607.5945876176133);
                        int i_24_ = (int) (Client.camera.getYaw() * 2607.5945876176133);
                        class569.method9621().method8258(Class60.activeToolkit, -846817037 * Class611.anInt7915 << 3,
                                i, i_5_, i_6_, i_7_, i_23_, i_24_, 0, i_22_, true, false);
                    } else {
                        class569.method9621().method8258(Class60.activeToolkit, -846817037 * Class611.anInt7915 << 3,
                                i, i_5_, i_6_, i_7_, 912649057 * Class155.cameraPitch, 1686504405 * Class550.cameraYaw,
                                IncomingFrameMeta.anInt4473 * -572932877, i_22_, true, false);
                    }
                    Class60.activeToolkit.method2456();
                } else {
                    Class60.activeToolkit.method2426(3, i_22_);
                }
                Class60.activeToolkit.method2419(false);
                Class380.method6233(Client.aClass405_10612, Client.aClass399_10752, i_6_, i_7_, 1673046452);
                Client.scene.method7690().method9694(Client.scene);
                int i_25_ = Class199.preferences.aClass632_Sub22_10284.getValue();
                byte i_26_;
                if (i_25_ == 2) {
                    i_26_ = (byte) (Client.anInt10730 * 764752929);
                } else if (i_25_ == 3) {
                    i_26_ = (byte) (Client.aBool10643 ? 1 : -1);
                } else {
                    i_26_ = (byte) 1;
                }
                if (Class56.method1348() || 3 == 1212513917 * Client.mapState) {
                    Client.scene.getGraph().method8355(Client.engineCycle, 1885320733 * class268.anInt2983,
                            class268.anInt2982 * -1797142999, class268.anInt2984 * -196721903,
                            Client.scene.method7694(), Client.anIntArray10746, Client.anIntArray10747,
                            Client.anIntArray10748, Client.anIntArray10749, Client.anIntArray10750,
                            Client.localPlayer.plane + 1, i_26_, (int) vector3f.x >> 9, (int) vector3f.z >> 9,
                            Class199.preferences.flickeringEffects.getValue() == 0, true, 0, true);
                } else {
                    Client.scene.getGraph().method8355(Client.engineCycle, 2006359481 * Client.cameraX,
                            Class268.cameraY * 1525233901, Client.cameraZ * 1829446257,
                            Client.scene.method7694(), Client.anIntArray10746, Client.anIntArray10747,
                            Client.anIntArray10748, Client.anIntArray10749, Client.anIntArray10750,
                            1 + Client.localPlayer.plane, i_26_, (int) vector3f.x >> 9, (int) vector3f.z >> 9,
                            Class199.preferences.flickeringEffects.getValue() == 0, true, 0, true);
                }
                Client.anInt10631 += -471715127;
                if (!Class60.activeToolkit.method2678() && -1501875989 * Client.connectionState == 16) {
                    Class296_Sub1.method15196(i, i_5_, i_6_, i_7_);
                }
                Client.scene.getGraph().deleteEntities();
                Client.cameraX = -224503671 * cameraX;
                Class268.cameraY = cameraY * -1128143643;
                Client.cameraZ = -187933039 * cameraZ;
                Class155.cameraPitch = cameraPitch * -1300105055;
                Class550.cameraYaw = -1726145155 * cameraYaw;
                if (Client.aBool10616 && Class364.netWorker.priorities() == 0) {
                    Client.aBool10616 = false;
                }
                if (Client.aBool10616) {
                    Class60.activeToolkit.method2805(i, i_5_, i_6_, i_7_, -16777216);
                    Class62.method1382(TranslatableString.LOADING_PLEASE_WAIT.translate(Client.currentLanguage), false,
                            Class60.activeToolkit, Client.p12Full, Class24.p12Full);
                }
                Class330.method5806(Client.aClass399_10752, false, i_6_ / 2 + i, i_5_ + i_7_ / 2,
                        Client.anInt10906 * 749919243 << 1, Client.anInt10906 * 749919243 << 1, i_6_, i_7_);
                Class60.activeToolkit.method2540(Client.aClass399_10752);
                Class167.method3414(Client.aClass399_10752);
            }
        }
    }

    static final void method4719() {
        for (CacheableProjectile pnode = Client.projectiles.head(); pnode != null; pnode = Client.projectiles.next()) {
            Projectile projectile = pnode.projectile;
            if (Client.engineCycle > -103567215 * projectile.endCycle) {
                pnode.unlink();
                projectile.disableParticleSystem();
            } else if (Client.engineCycle >= 1986315865 * projectile.startTick) {
                projectile.method1625();
                if (projectile.targetIndex * -261488919 > 0) {
                    if (1 == Client.cutsceneStatus * 2087248539) {
                        Mobile mobile = CutsceneMobile.cutsceneMobiles[-261488919 * projectile.targetIndex - 1].get();
                        if (null != mobile) {
                            Vector3f vector3f = mobile.getCoordinateSpace().translation;
                            if ((int) vector3f.x >= 0 && (int) vector3f.x < Client.scene.getMapWidth() * 512
                                    && (int) vector3f.z >= 0
                                    && (int) vector3f.z < Client.scene.getMapLength() * 512) {
                                projectile.target((int) vector3f.x, (int) vector3f.z,
                                        SceneGraph.getAverageHeight((int) vector3f.x, (int) vector3f.z, mobile.plane)
                                                - 1480791067 * projectile.anInt11719, Client.engineCycle);
                            }
                        }
                    } else {
                        ObjectNode linkable = Client.npcTable.get(-261488919 * projectile.targetIndex - 1);
                        if (null != linkable) {
                            Npc npc = (Npc) linkable.referent;
                            Vector3f vector3f = npc.getCoordinateSpace().translation;
                            if ((int) vector3f.x >= 0 && (int) vector3f.x < Client.scene.getMapWidth() * 512
                                    && (int) vector3f.z >= 0
                                    && (int) vector3f.z < Client.scene.getMapLength() * 512) {
                                projectile.target((int) vector3f.x, (int) vector3f.z,
                                        SceneGraph.getAverageHeight((int) vector3f.x, (int) vector3f.z, projectile.plane)
                                                - projectile.anInt11719 * 1480791067, Client.engineCycle);
                            }
                        }
                    }
                }
                if (-261488919 * projectile.targetIndex < 0) {
                    int index = -(-261488919 * projectile.targetIndex) - 1;
                    Player player;
                    if (index == -406165969 * Client.localPlayerIndex) {
                        player = Client.localPlayer;
                    } else {
                        player = Client.players[index];
                    }
                    if (null != player) {
                        Vector3f vector3f = player.getCoordinateSpace().translation;
                        if ((int) vector3f.x >= 0 && (int) vector3f.x < Client.scene.getMapWidth() * 512
                                && (int) vector3f.z >= 0
                                && (int) vector3f.z < Client.scene.getMapLength() * 512) {
                            projectile.target((int) vector3f.x, (int) vector3f.z,
                                    SceneGraph.getAverageHeight((int) vector3f.x, (int) vector3f.z, projectile.plane)
                                            - projectile.anInt11719 * 1480791067, Client.engineCycle);
                        }
                    }
                }
                projectile.method18203(Client.anInt10595 * 360018919);
                Client.scene.getGraph().method8423(projectile, true);
            }
        }
    }

}