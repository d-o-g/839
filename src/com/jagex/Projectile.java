package com.jagex;

public class Projectile extends SceneEntity {

    public int endCycle;
    public int startTick;
    public int targetIndex;
    public int anInt11719;
    int anInt11702;
    int initialHeight;
    double verticalAcceleration;
    boolean aBool11705;
    int verticalPitch;
    int initialDisplacement;
    int parentIndex;
    boolean aBool11711;
    int graphic;
    boolean aBool11713 = false;
    double speedX;
    double speedZ;
    double speed;
    double velocityY;
    int anInt11720 = 0;
    int equipmentSlot;
    ParticleSystem particles;
    Animator aAnimator_11723;

    public Projectile(SceneGraph sceneGraph, int graphic, int plane, int collisionPlane, int worldX, int worldZ,
                      int initialHeight, int startTick, int endTick, int verticalPitch, int initialDisplacement, int senderIndex,
                      int targetIndex, int i_32_, boolean bool, int equipmentSlot, int i_34_) {
        super(sceneGraph, plane, collisionPlane, worldX,
                SceneGraph.getAverageHeight(worldX, worldZ, plane) - initialHeight, worldZ, worldX >> 9, worldX >> 9,
                worldZ >> 9, worldZ >> 9, false, (byte) 0);
        aBool11705 = false;
        anInt11702 = 0;
        this.graphic = graphic * 709898979;
        this.startTick = 1537614313 * startTick;
        this.endCycle = 958795889 * endTick;
        this.verticalPitch = 1075247367 * verticalPitch;
        this.initialDisplacement = initialDisplacement * -1153489871;
        this.parentIndex = senderIndex * -234470757;
        this.targetIndex = 1819326809 * targetIndex;
        this.initialHeight = initialHeight * 2037858367;
        anInt11719 = i_32_ * -2085313005;
        aBool11711 = bool;
        aBool11713 = false;
        this.equipmentSlot = 1421371761 * equipmentSlot;
        anInt11702 = i_34_ * 9261423;
        int animation = GraphicDefinition.loader.get(graphic * 926720715).animation * 2053507375;
        aAnimator_11723 = new EntityAnimator(this, false);
        aAnimator_11723.update(animation);
        method16274(1);
    }

    static void create(int graphic, int senderIndex, int targetIndex, int equipmentSlot, int initialHeight,
                       int heightOffset, int originX, int originZ, int targetX, int targetZ, int delay, int longetivity,
                       int verticalPitch, int initialDisplacement, boolean bool, int i_21_) {
        if (0 != senderIndex && -1 != equipmentSlot) {
            Mobile mobile = null;
            if (senderIndex < 0) {
                int index = -senderIndex - 1;
                if (-406165969 * Client.localPlayerIndex == index) {
                    mobile = Client.localPlayer;
                } else {
                    mobile = Client.players[index];
                }
            } else {
                int index = senderIndex - 1;
                ObjectNode<Npc> linkable = Client.npcTable.get(index);
                if (linkable != null) {
                    mobile = linkable.referent;
                }
            }

            if (null != mobile) {
                Class515 class515 = mobile.method17958();
                if (null != class515.anIntArrayArray7043 && class515.anIntArrayArray7043[equipmentSlot] != null) {
                    initialHeight -= class515.anIntArrayArray7043[equipmentSlot][1];
                }

                if (class515.anIntArrayArray7044 != null && class515.anIntArrayArray7044[equipmentSlot] != null) {
                    initialHeight -= class515.anIntArrayArray7044[equipmentSlot][1];
                }
            }
        }

        Projectile projectile = new Projectile(Client.scene.getGraph(), graphic,
                SceneGraph.floorLevel * -1123616625, -1123616625 * SceneGraph.floorLevel,
                originX, originZ, initialHeight, delay + Client.engineCycle, longetivity + Client.engineCycle, verticalPitch,
                initialDisplacement, senderIndex, targetIndex, heightOffset, bool, equipmentSlot, i_21_);
        projectile.target(targetX, targetZ,
                SceneGraph.getAverageHeight(targetX, targetZ, SceneGraph.floorLevel * -1123616625)
                        - heightOffset, delay + Client.engineCycle);
        Client.projectiles.pushBack(new CacheableProjectile(projectile));
    }

    @Override
    public Class498 method16293(Toolkit toolkit) {
        return null;
    }

    @Override
    public int getStartY() {
        return anInt11720 * -339957419;
    }

    public int method18191() {
        return anInt11702 * 884026767;
    }

    public final void target(int targetX, int targetZ, int height, int tick) {
        Vector3f position = Vector3f.copyOf(getCoordinateSpace().translation);
        if (!aBool11713) {
            float dx = targetX - position.x;
            float dz = targetZ - position.z;
            float distance = (float) Math.sqrt(dx * dx + dz * dz);
            if (0.0F != distance) {
                position.x += dx * (819049681 * initialDisplacement) / distance;
                position.z += dz * (819049681 * initialDisplacement) / distance;
            }

            if (aBool11711) {
                position.y = SceneGraph.getAverageHeight((int) position.x, (int) position.z, plane) - -1645957185
                        * initialHeight;
            }

            setPosition(position);
        }

        double dt = 1 + endCycle * -103567215 - tick;
        speedX = (targetX - position.x) / dt;
        speedZ = (targetZ - position.z) / dt;
        speed = Math.sqrt(speedZ * speedZ + speedX * speedX);

        if (-1 != verticalPitch * -298244937) {
            if (!aBool11713) {
                velocityY = -speed * Math.tan(0.02454369 * (-298244937 * verticalPitch));
            }

            verticalAcceleration = 2.0 * (height - position.y - dt * velocityY) / (dt * dt);
        } else {
            velocityY = (height - position.y) / dt;
        }

        position.cache();
    }

    public void method1625() {
        if (!aBool11713) {
            if (parentIndex * 1470550931 != 0) {
                Mobile mobile = null;

                if (1 == 2087248539 * Client.cutsceneStatus) {
                    mobile = CutsceneMobile.cutsceneMobiles[parentIndex * 1470550931 - 1].get();
                } else if (parentIndex * 1470550931 < 0) {
                    int index = -(parentIndex * 1470550931) - 1;

                    if (index == -406165969 * Client.localPlayerIndex) {
                        mobile = Client.localPlayer;
                    } else {
                        mobile = Client.players[index];
                    }
                } else {
                    int index = 1470550931 * parentIndex - 1;
                    ObjectNode<Npc> linkable = Client.npcTable.get(index);

                    if (null != linkable) {
                        mobile = linkable.referent;
                    }
                }

                if (null != mobile) {
                    Vector3f vector3f = mobile.getCoordinateSpace().translation;
                    setPosition(vector3f.x, SceneGraph.getAverageHeight((int) vector3f.x, (int) vector3f.z, plane)
                            - initialHeight * -1645957185, vector3f.z);
                    if (equipmentSlot * 1488271249 >= 0) {
                        Class515 class515 = mobile.method17958();
                        int i_11_ = 0;
                        int i_12_ = 0;

                        if (class515.anIntArrayArray7043 != null
                                && class515.anIntArrayArray7043[equipmentSlot * 1488271249] != null) {
                            i_11_ += class515.anIntArrayArray7043[1488271249 * equipmentSlot][0];
                            i_12_ += class515.anIntArrayArray7043[1488271249 * equipmentSlot][2];
                        }

                        if (null != class515.anIntArrayArray7044
                                && null != class515.anIntArrayArray7044[equipmentSlot * 1488271249]) {
                            i_11_ += class515.anIntArrayArray7044[equipmentSlot * 1488271249][0];
                            i_12_ += class515.anIntArrayArray7044[1488271249 * equipmentSlot][2];
                        }

                        if (0 != i_11_ || 0 != i_12_) {
                            int yaw = mobile.yaw.value();
                            int raw = yaw;
                            if (null != mobile.anIntArray11518 && mobile.anIntArray11518[equipmentSlot * 1488271249] != -1) {
                                raw = mobile.anIntArray11518[1488271249 * equipmentSlot];
                            }

                            int angle = raw - yaw & 0x3fff;
                            int sin = Class373.SINE[angle];
                            int cos = Class373.COSINE[angle];

                            int i_18_ = sin * i_12_ + i_11_ * cos >> 14;
                            i_12_ = i_12_ * cos - sin * i_11_ >> 14;
                            i_11_ = i_18_;

                            Vector3f vector3f_19_ = Vector3f.copyOf(getCoordinateSpace().translation);
                            vector3f_19_.x += i_11_;
                            vector3f_19_.z += i_12_;
                            setPosition(vector3f_19_);
                            vector3f_19_.cache();
                        }
                    }
                }
            }
        }
    }

    public void disableParticleSystem() {
        if (particles != null) {
            particles.method9484();
        }
    }

    public final void method18203(int elapsed) {
        aBool11713 = true;
        CoordinateSpace coordinateSpace = new CoordinateSpace(getCoordinateSpace());
        coordinateSpace.translation.x += speedX * elapsed;
        coordinateSpace.translation.z += speedZ * elapsed;

        if (aBool11711) {
            coordinateSpace.translation.y = SceneGraph.getAverageHeight((int) coordinateSpace.translation.x,
                    (int) coordinateSpace.translation.z, plane) - initialHeight * -1645957185;
        } else if (verticalPitch * -298244937 != -1) {
            coordinateSpace.translation.y += elapsed * velocityY + elapsed * (verticalAcceleration * 0.5) * elapsed;
            velocityY += verticalAcceleration * elapsed;
        } else {
            coordinateSpace.translation.y += elapsed * velocityY;
        }

        coordinateSpace.rotation.setByAngle(1.0F, 0.0F, 0.0F, (float) Math.atan2(velocityY, speed));
        Quaternion quaternion = Quaternion.cached();
        quaternion.setByAngle(0.0F, 1.0F, 0.0F, (float) (Math.atan2(speedX, speedZ) - Math.PI));
        coordinateSpace.rotation.multiplyBy(quaternion);

        quaternion.cache();
        method10171(coordinateSpace);

        if (aAnimator_11723.method13465(1) && aAnimator_11723.method13461()) {
            aAnimator_11723.method13463();
        }
    }

    @Override
    boolean method16257(Toolkit toolkit, int i, int i_36_) {
        return false;
    }

    @Override
    boolean isTextured() {
        return false;
    }

    @Override
    boolean isCached() {
        return aBool11705;
    }

    @Override
    final void method16262(Toolkit toolkit, SceneNode class600_sub1, int i, int i_0_, int i_1_, boolean bool,
                           int i_2_) {
        throw new IllegalStateException();
    }

    @Override
    final void method16263() {
        throw new IllegalStateException();
    }

    @Override
    void method16265(Toolkit toolkit) {
        Model model = method18194(toolkit, 0);
        if (model != null) {
            Matrix4x3 class405 = updateAndGetMatrix();
            anInt11720 = model.minimumY() * -2043802627;
            model.method3016();
            method18205(toolkit, model, class405);
        }
    }

    @Override
    LoadedEntity method16271(Toolkit toolkit) {
        Model model = method18194(toolkit, 2048);
        if (model == null) {
            return null;
        }

        Matrix4x3 class405 = updateAndGetMatrix();
        method18205(toolkit, model, class405);
        LoadedEntity class506 = LoadedEntity.method570(false);
        model.method2917(class405, class139Array[0], 0);

        if (particles != null) {
            ParticleEntities particleEntities = particles.method9492();
            toolkit.method2470(particleEntities);
        }

        aBool11705 = model.method2939();
        model.method3016();
        anInt11720 = model.minimumY() * -2043802627;
        return class506;
    }

    @Override
    final boolean method16302() {
        return false;
    }

    @Override
    void method17912() {
        Vector3f vector3f = getCoordinateSpace().translation;
        startX = endX = (short) (vector3f.x / 512.0F);
        startY = endY = (short) (vector3f.z / 512.0F);
    }

    Model method18194(Toolkit toolkit, int i) {
        GraphicDefinition graphic = GraphicDefinition.loader.get(926720715 * this.graphic);
        return graphic.method10394(toolkit, i, aAnimator_11723, (byte) 2);
    }

    void method18205(Toolkit toolkit, Model model, Matrix4x3 class405) {
        model.method3063(class405);
        Class145[] class145s = model.method2942();
        Class115[] class115s = model.method2943();

        if ((particles == null || particles.stopped) && (null != class145s || class115s != null)) {
            particles = ParticleSystem.create(Client.engineCycle, true);
        }

        if (null != particles) {
            particles.method9488(toolkit, Client.engineCycle, class145s, class115s, false);
            particles.method9485(plane, startX, endX, startY, endY);
        }
    }

}