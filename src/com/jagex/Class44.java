package com.jagex;

public class Class44 {
    Class44() throws Throwable {
        throw new Error();
    }

    public static void method1067(boolean hsv, boolean bool_0_) {
        if (hsv) {
            Class598.anInt7849 += -1935474425;
            Class207.createHsvTable();
        }

        if (bool_0_) {
            Class598.anInt7848 += 325974101;
            Class367.method6093();
        }
    }

    public static void method1072(float f, Vector3f vector3f, Vector3f vector3f_15_, Vector3f vector3f_16_,
                                  Vector3f vector3f_17_, Vector3f vector3f_18_, float f_19_, float f_20_, float f_21_, float f_22_, short i) {
        if (!vector3f_15_.equals(vector3f)) {
            Vector3f vector3f_23_ = Vector3f.difference(vector3f_15_, vector3f);
            float f_24_ = vector3f_23_.distance();
            if (f_19_ > 0.0F) {
                vector3f_17_ = Vector3f.copyOf(vector3f_17_);
                vector3f_17_.multiply(f_24_ / f_19_ * f_20_);
            }
            if (vector3f_17_.x == Float.POSITIVE_INFINITY || Float.isNaN(vector3f.x) || f_24_ > f_21_) {
                vector3f.copyFrom(vector3f_15_);
                vector3f_16_.reset();
            } else {
                Vector3f vector3f_25_ = Vector3f.copyOf(vector3f_16_);
                vector3f_25_.abs();
                Vector3f vector3f_26_ = Vector3f.quotient(vector3f_25_, vector3f_17_);
                Vector3f vector3f_27_ = Vector3f.product(vector3f_25_, vector3f_26_);
                vector3f_27_.multiply(0.5F);
                Vector3f vector3f_28_ = Vector3f.copyOf(vector3f_16_);
                Vector3f vector3f_29_ = Vector3f.copyOf(vector3f_23_);
                vector3f_29_.abs();
                if (vector3f_27_.x > vector3f_29_.x) {
                    if (vector3f_23_.x < 0.0F) {
                        vector3f_28_.x += f * vector3f_17_.x;
                        if (vector3f_28_.x > 0.0F) {
                            vector3f_28_.x = 0.0F;
                        }
                    } else {
                        vector3f_28_.x -= vector3f_17_.x * f;
                        if (vector3f_28_.x < 0.0F) {
                            vector3f_28_.x = 0.0F;
                        }
                    }
                } else if (vector3f_25_.x < vector3f_18_.x) {
                    if (vector3f_23_.x < 0.0F) {
                        vector3f_28_.x -= vector3f_17_.x * f;
                        if (vector3f_28_.x < -vector3f_18_.x) {
                            vector3f_28_.x = -vector3f_18_.x;
                        }
                    } else {
                        vector3f_28_.x += vector3f_17_.x * f;
                        if (vector3f_28_.x > vector3f_18_.x) {
                            vector3f_28_.x = vector3f_18_.x;
                        }
                    }
                }
                if (vector3f_27_.y > vector3f_29_.y) {
                    if (vector3f_23_.y < 0.0F) {
                        vector3f_28_.y += f * vector3f_17_.y;
                        if (vector3f_28_.y > 0.0F) {
                            vector3f_28_.y = 0.0F;
                        }
                    } else {
                        vector3f_28_.y -= f * vector3f_17_.y;
                        if (vector3f_28_.y < 0.0F) {
                            vector3f_28_.y = 0.0F;
                        }
                    }
                } else if (vector3f_25_.y < vector3f_18_.y) {
                    if (vector3f_23_.y < 0.0F) {
                        vector3f_28_.y -= f * vector3f_17_.y;
                        if (vector3f_28_.y < -vector3f_18_.y) {
                            vector3f_28_.y = -vector3f_18_.y;
                        }
                    } else {
                        vector3f_28_.y += f * vector3f_17_.y;
                        if (vector3f_28_.y > vector3f_18_.y) {
                            vector3f_28_.y = vector3f_18_.y;
                        }
                    }
                }
                if (vector3f_27_.z > vector3f_29_.z) {
                    if (vector3f_23_.z < 0.0F) {
                        vector3f_28_.z += vector3f_17_.z * f;
                        if (vector3f_28_.z > 0.0F) {
                            vector3f_28_.z = 0.0F;
                        }
                    } else {
                        vector3f_28_.z -= f * vector3f_17_.z;
                        if (vector3f_28_.z < 0.0F) {
                            vector3f_28_.z = 0.0F;
                        }
                    }
                } else if (vector3f_25_.z < vector3f_18_.z) {
                    if (vector3f_23_.z < 0.0F) {
                        vector3f_28_.z -= vector3f_17_.z * f;
                        if (vector3f_28_.z < -vector3f_18_.z) {
                            vector3f_28_.z = -vector3f_18_.z;
                        }
                    } else {
                        vector3f_28_.z += vector3f_17_.z * f;
                        if (vector3f_28_.z > vector3f_18_.z) {
                            vector3f_28_.z = vector3f_18_.z;
                        }
                    }
                }
                vector3f_16_.method6467(vector3f_28_, 0.8F);
                if (f_24_ < f_22_ && vector3f_16_.distance() < f_22_) {
                    vector3f.copyFrom(vector3f_15_);
                    vector3f_16_.reset();
                } else {
                    vector3f.add(Vector3f.product(vector3f_16_, f));
                }
                vector3f_25_.cache();
                vector3f_28_.cache();
                vector3f_29_.cache();
            }
        }
    }

    static final void method1071(int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_) {
        if (3 == Client.cutsceneStatus * 2087248539) {
            int i_11_ = -1784886003 * Class80.playerCount;
            int[] is = Class80.playerIndices;
            for (int i_12_ = 0; i_12_ < i_11_; i_12_++) {
                Player class600_sub1_sub3_sub1_sub1 = Client.players[is[i_12_]];
                if (null != class600_sub1_sub3_sub1_sub1) {
                    class600_sub1_sub3_sub1_sub1.method17972(i, i_4_, i_5_, i_6_, i_7_, i_8_, i_9_);
                }
            }
            for (int i_13_ = 0; i_13_ < Client.npcCount * 1746328619; i_13_++) {
                int i_14_ = Client.npcIndices[i_13_];
                ObjectNode class480_sub25 = Client.npcTable.get(i_14_);
                if (class480_sub25 != null) {
                    ((Mobile) class480_sub25.referent).method17972(i, i_4_, i_5_, i_6_, i_7_, i_8_, i_9_);
                }
            }
        }
    }

}