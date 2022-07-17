package com.jagex;

public class Class49 {
    static Deque aClass644_579 = new Deque();
    static Font aClass132_580;
    static Toolkit aClass134_581;

    Class49() throws Throwable {
        throw new Error();
    }

    public static void method1112(float f, Vector3f vector3f, Quaternion quaternion, Vector3f vector3f_1_,
                                  Vector3f vector3f_2_, Vector3f vector3f_3_, Vector3f vector3f_4_, float f_5_, float f_6_, float f_7_,
                                  float f_8_, int i) {
        if (!vector3f_1_.equals(vector3f)) {
            Vector3f vector3f_9_ = Vector3f.create(0.0F, 0.0F, 0.0F);
            Vector3f vector3f_10_ = Vector3f.copyOf(Vector3f.difference(vector3f_1_, vector3f));
            vector3f_10_.invertAndMultiply(quaternion);
            Vector3f vector3f_11_ = Vector3f.difference(vector3f_10_, vector3f_9_);
            float f_12_ = vector3f_11_.distance();
            if (f_5_ > 0.0F) {
                vector3f_3_ = Vector3f.copyOf(vector3f_3_);
                vector3f_3_.multiply(f_6_ * (f_12_ / f_5_));
            }
            if (vector3f_3_.x == Float.POSITIVE_INFINITY || Float.isNaN(vector3f.x) || f_12_ > f_7_ || f_12_ < f_8_) {
                vector3f.copyFrom(vector3f_1_);
                vector3f_2_.reset();
            } else {
                quaternion.invert();
                Vector3f vector3f_13_ = Vector3f.create(1.0F, 0.0F, 0.0F);
                Vector3f vector3f_14_ = Vector3f.create(0.0F, 1.0F, 0.0F);
                Vector3f vector3f_15_ = Vector3f.create(0.0F, 0.0F, 1.0F);
                vector3f_13_.invertAndMultiply(quaternion);
                vector3f_14_.invertAndMultiply(quaternion);
                vector3f_15_.invertAndMultiply(quaternion);
                Vector3f vector3f_16_ = Vector3f.create(Vector3f.method6452(vector3f_13_, vector3f_2_),
                        Vector3f.method6452(vector3f_14_, vector3f_2_), Vector3f.method6452(vector3f_15_, vector3f_2_));
                Vector3f vector3f_17_ = Vector3f.copyOf(vector3f_16_);
                vector3f_17_.abs();
                Vector3f vector3f_18_ = Vector3f.quotient(Vector3f.product(vector3f_17_, vector3f_17_),
                        Vector3f.product(vector3f_3_, 2.0F));
                Vector3f vector3f_19_ = Vector3f.copyOf(vector3f_11_);
                vector3f_19_.abs();
                Vector3f vector3f_20_ = Vector3f.copyOf(vector3f_16_);
                if (vector3f_18_.x > vector3f_19_.x) {
                    if (vector3f_11_.x < 0.0F) {
                        vector3f_20_.x += f * vector3f_3_.x;
                        if (vector3f_20_.x > 0.0F) {
                            vector3f_20_.x = 0.0F;
                        }
                    } else {
                        vector3f_20_.x -= f * vector3f_3_.x;
                        if (vector3f_20_.x < 0.0F) {
                            vector3f_20_.x = 0.0F;
                        }
                    }
                } else if (vector3f_17_.x < vector3f_4_.x) {
                    if (vector3f_11_.x < 0.0F) {
                        vector3f_20_.x -= f * vector3f_3_.x;
                        if (vector3f_20_.x < -vector3f_4_.x) {
                            vector3f_20_.x = -vector3f_4_.x;
                        }
                    } else {
                        vector3f_20_.x += f * vector3f_3_.x;
                        if (vector3f_20_.x > vector3f_4_.x) {
                            vector3f_20_.x = vector3f_4_.x;
                        }
                    }
                }
                if (vector3f_18_.y > vector3f_19_.y) {
                    if (vector3f_11_.y < 0.0F) {
                        vector3f_20_.y += f * vector3f_3_.y;
                        if (vector3f_20_.y > 0.0F) {
                            vector3f_20_.y = 0.0F;
                        }
                    } else {
                        vector3f_20_.y -= f * vector3f_3_.y;
                        if (vector3f_20_.y < 0.0F) {
                            vector3f_20_.y = 0.0F;
                        }
                    }
                } else if (vector3f_17_.y < vector3f_4_.y) {
                    if (vector3f_11_.y < 0.0F) {
                        vector3f_20_.y -= f * vector3f_3_.y;
                        if (vector3f_20_.y < -vector3f_4_.y) {
                            vector3f_20_.y = -vector3f_4_.y;
                        }
                    } else {
                        vector3f_20_.y += vector3f_3_.y * f;
                        if (vector3f_20_.y > vector3f_4_.y) {
                            vector3f_20_.y = vector3f_4_.y;
                        }
                    }
                }
                if (vector3f_18_.z > vector3f_19_.z) {
                    if (vector3f_11_.z < 0.0F) {
                        vector3f_20_.z += f * vector3f_3_.z;
                        if (vector3f_20_.z > 0.0F) {
                            vector3f_20_.z = 0.0F;
                        }
                    } else {
                        vector3f_20_.z -= f * vector3f_3_.z;
                        if (vector3f_20_.z < 0.0F) {
                            vector3f_20_.z = 0.0F;
                        }
                    }
                } else if (vector3f_17_.z < vector3f_4_.z) {
                    if (vector3f_11_.z < 0.0F) {
                        vector3f_20_.z -= vector3f_3_.z * f;
                        if (vector3f_20_.z < -vector3f_4_.z) {
                            vector3f_20_.z = -vector3f_4_.z;
                        }
                    } else {
                        vector3f_20_.z += f * vector3f_3_.z;
                        if (vector3f_20_.z > vector3f_4_.z) {
                            vector3f_20_.z = vector3f_4_.z;
                        }
                    }
                }
                Vector3f vector3f_21_ = Vector3f.product(vector3f_13_, vector3f_20_.x);
                vector3f_21_.method6448(vector3f_14_, vector3f_20_.y);
                vector3f_21_.method6448(vector3f_15_, vector3f_20_.z);
                vector3f_2_.method6467(vector3f_21_, 0.8F);
                vector3f.add(Vector3f.product(vector3f_2_, f));
                vector3f_17_.cache();
                vector3f_20_.cache();
                vector3f_19_.cache();
            }
        }
    }

    static final void method1110(Component class226, Interface class221, ScriptExecutionContext class613, int i) {
        String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
        if (ScriptExecutionContext.method9239(string, class613) != null) {
            string = string.substring(0, string.length() - 1);
        }
        class226.anObjectArray2364 = World.method16248(string, class613);
        class226.aBool2483 = true;
    }

    static final void method1111(ScriptExecutionContext class613, int i) {
        int i_0_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
        class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = ItemDefinition.aMappingVarpProvider_8339
                .method3806(i_0_).method3921();
    }

    static final void method1113() {
        ParticleSystem.method3934(Class60.activeToolkit, Client.engineCycle);
        if (1764783361 * Client.anInt10790 != -1) {
            Interface.method9889(Client.anInt10790 * 1764783361);
        }
        for (int i_22_ = 0; i_22_ < -573888519 * Client.anInt10848; i_22_++) {
            Client.aBoolArray10851[i_22_] = Client.validComponents[i_22_];
            Client.validComponents[i_22_] = false;
        }
        Client.anInt10864 = -401913693 * Client.engineCycle;
        if (-1 != 1764783361 * Client.anInt10790) {
            Client.anInt10848 = 0;
            Class671.method13823((byte) 0);
        }
        Class60.activeToolkit.method2421();
        Class471.method8052(Class60.activeToolkit);
        int i_23_ = Class480_Sub31_Sub1.method17278();
        if (i_23_ == -1) {
            i_23_ = Client.anInt10782 * -1573005291;
        }
        if (-1 == i_23_) {
            i_23_ = Client.anInt10781 * 918063407;
        }
        CursorDefinition.createCursor(i_23_);
        Client.anInt10595 = 0;
    }

    static final void method1114(ScriptExecutionContext class613, int i) {
        int i_24_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
        Component class226 = Component.lookup(i_24_);
        Interface class221 = Class598.loadedInterfaces[i_24_ >> 16];
        ScriptExecutionContext.method753(class226, class221, class613);
    }
}
