package com.jagex;

public class Class281_Sub2 extends Class281 {
    public Quaternion aQuaternion_9749;
    Vector3f aVector3f_9748;
    int anInt9750;
    boolean aBool9751;
    Vector3f aVector3f_9752 = new Vector3f();
    int anInt9753;
    GameCharacter character;
    Vector3f aVector3f_9755;

    Vector3f aVector3f_9756;

    Quaternion aQuaternion_9757;

    public Class281_Sub2(Camera class261) {
        super(class261);
        aQuaternion_9749 = new Quaternion();
        anInt9750 = -101644456;
        aVector3f_9748 = new Vector3f(Float.NaN, Float.NaN, Float.NaN);
        aVector3f_9755 = new Vector3f(Float.NaN, Float.NaN, Float.NaN);
        aVector3f_9756 = new Vector3f();
        aQuaternion_9757 = new Quaternion();
    }

    public void method15237(GameCharacter interface26, Vector3f vector3f, Quaternion quaternion, boolean bool, int i,
                            int[][][] is, TileFlags class425, int i_0_, int i_1_) {
        character = interface26;
        aVector3f_9752.copyFrom(vector3f);
        aQuaternion_9749.copyFrom(quaternion);
        aBool9751 = bool;
        anInt9750 = i * -301155933;
        anInt9753 = character.method140().plane * 428396617;
        method15241(is, class425, i_0_, i_1_, 572148952);
    }

    public void method15238() {
        if (character != null) {
            character = camera.getCharacterProvider().get(character.getType(), character.getIndex());
        }
    }

    public Vector3f method15243(byte i) {
        return aVector3f_9748;
    }

    public Vector3f method15244(byte i) {
        return aVector3f_9752;
    }

    public float method15246(int i) {
        return QuestDefinition.method4406(aQuaternion_9749);
    }

    public float method15263(int i) {
        return LoadingRequirementType.method592(aQuaternion_9749, -2069688416);
    }

    @Override
    public Vector3f method5224() {
        Vector3f vector3f = Vector3f.copyOf(aVector3f_9752);
        vector3f.invertAndMultiply(aQuaternion_9757);
        Vector3f vector3f_16_ = Vector3f.sum(aVector3f_9748, vector3f);
        vector3f.cache();
        return vector3f_16_;
    }

    @Override
    public void method5225(float f, int[][][] is, TileFlags class425, int i, int i_20_, byte i_21_) {
        if (character != null) {
            method15241(is, class425, i, i_20_, 572148952);
            Quaternion quaternion = method15240(1117123175);
            aQuaternion_9757.method6381(quaternion, camera.method4851(-1878101346));
            if (Float.isNaN(aQuaternion_9757.x)) {
                aQuaternion_9757.copyFrom(quaternion);
            }
            quaternion.cache();
            aVector3f_9755.copyFrom(character.method140().toVector3f());
            camera.method4862(true, f, aVector3f_9748, camera.jagexAngleToQuaternion((byte) 66), aVector3f_9755,
                    aVector3f_9756, -958958229);
        }
    }

    @Override
    public boolean method5226() {
        return !Float.isNaN(aVector3f_9748.x);
    }

    @Override
    public double[] method5228() {
        double[] ds = new double[3];
        Vector3f vector3f = method5224();
        ds[0] = vector3f.x;
        ds[1] = vector3f.y;
        ds[2] = vector3f.z;
        return ds;
    }

    @Override
    public float method5230(byte i) {
        return 0.0F;
    }

    @Override
    public Vector4i method5238(short i) {
        Vector3f vector3f = method5224();
        Vector4i vector4i = new Vector4i(808162555 * anInt9753, (int) vector3f.x, (int) vector3f.y,
                (int) vector3f.z);
        vector3f.cache();
        return vector4i;
    }

    @Override
    public void method5248(Class268 class268, int i, int i_17_, byte i_18_) {
        Vector3f vector3f = method5224();
        class268.anInt2983 = 1771748405 * ((int) vector3f.x - i);
        class268.anInt2982 = 600782361 * (int) -vector3f.y;
        class268.anInt2984 = 994250225 * ((int) vector3f.z - i_17_);
        vector3f.cache();
    }

    @Override
    public void method5256(Buffer buffer, byte i) {
        CharacterType class260 = CharacterType.valueOf(buffer.readUByte());
        int i_19_ = buffer.readUShort();
        aVector3f_9752.decode(buffer);
        aQuaternion_9749.decode(buffer);
        aBool9751 = buffer.readUByte() == 1;
        anInt9750 = buffer.readUShort() * -301155933;
        character = camera.getCharacterProvider().get(class260, i_19_);
    }

    Quaternion method15240(int i) {
        Quaternion quaternion = Quaternion.copy(aQuaternion_9749);
        if (aBool9751) {
            Vector3f vector3f = character.method143();
            if (vector3f.distance() < -1786232309 * anInt9750) {
                vector3f = Vector3f.create(0.0F, 0.0F, 1.0F);
                Quaternion quaternion_3_ = character.method142();
                vector3f.invertAndMultiply(quaternion_3_);
            }
            vector3f.y = 0.0F;
            float f = (float) Math.atan2(vector3f.x, vector3f.z);
            vector3f.cache();
            Quaternion quaternion_4_ = new Quaternion();
            quaternion_4_.setByAngle(0.0F, 1.0F, 0.0F, f);
            quaternion.multiplyBy(quaternion_4_);
        }
        return quaternion;
    }

    void method15241(int[][][] is, TileFlags class425, int i, int i_5_, int i_6_) {
        if (method5226() && (camera.method4845() || camera.method4855())) {
            Vector4i vector4i = character.method140();
            anInt9753 = vector4i.plane * 428396617;
            int i_7_ = 808162555 * anInt9753;
            boolean bool = true;
            if (anInt9753 * 808162555 == 3) {
                bool = false;
            } else if (class425 != null
                    && class425.isBridge(vector4i.x * -61099889 - i >> 9, -980788885
                    * vector4i.z - i_5_ >> 9)) {
                i_7_ = anInt9753 * 808162555 + 1;
                bool = false;
            }
            if (camera.method4855() && is != null) {
                float f = method15251(is, class425, i, i_5_, i_7_, bool, (short) 10076);
                if (!Float.isNaN(f)) {
                    if (f > 0.0F) {
                        float f_8_ = ((float) Math.PI);
                        Vector3f vector3f = Vector3f.create(0.0F, 0.0F, 1.0F);
                        vector3f.invertAndMultiply(aQuaternion_9749);
                        Vector3f vector3f_9_ = Vector3f.create(vector3f.x, 0.0F, vector3f.z);
                        vector3f_9_.normalise();
                        float f_10_ = Vector3f.method6452(vector3f, vector3f_9_);
                        for (int i_11_ = 0; i_11_ < 10; i_11_++) {
                            float f_12_ = (f_10_ + f_8_) / 2.0F - f_10_;
                            float f_13_ = f_12_;
                            if (f > 0.0F) {
                                f_13_ *= -1.0F;
                            }
                            Vector3f vector3f_14_ = Vector3f.create(1.0F, 0.0F, 0.0F);
                            vector3f_14_.invertAndMultiply(aQuaternion_9749);
                            Quaternion quaternion = Quaternion.cached();
                            quaternion.setByAngle(vector3f_14_, f_13_);
                            aQuaternion_9749.multiplyBy(quaternion);
                            aQuaternion_9749.normalize();
                            vector3f_14_.cache();
                            quaternion.cache();
                            f = method15251(is, class425, i, i_5_, i_7_, bool, (short) 7219);
                            if (Float.isNaN(f)) {
                                break;
                            }
                            if (f > 0.0F) {
                                f_10_ += f_12_;
                            } else {
                                f_8_ -= f_12_;
                            }
                        }
                    }
                }
            }
        }
    }

    Vector3f method15242(Quaternion quaternion, int i) {
        Vector3f vector3f = Vector3f.copyOf(aVector3f_9752);
        vector3f.invertAndMultiply(quaternion);
        Vector3f vector3f_15_ = Vector3f.sum(aVector3f_9755, vector3f);
        vector3f.cache();
        return vector3f_15_;
    }

    float method15251(int[][][] is, TileFlags class425, int i, int i_22_, int i_23_, boolean bool, short i_24_) {
        Quaternion quaternion = method15240(315949093);
        Vector3f vector3f = method15242(quaternion, 1169311691);
        quaternion.cache();
        int i_25_ = (int) vector3f.x - i >> 9;
        int i_26_ = (int) vector3f.z - i_22_ >> 9;
        if (i_25_ >= 0 && i_26_ >= 0 && 1 + i_25_ < is[0].length && i_26_ + 1 < is[0][0].length) {
            int i_27_ = i_23_;
            if (bool && class425.isBridge(i_25_, i_26_)) {
                i_27_ = i_23_ + 1;
            }
            long l = (long) vector3f.x % 512L;
            long l_28_ = (long) vector3f.z % 512L;
            long l_29_ = (512L - l_28_) * is[i_27_][i_25_][i_26_] * (512L - l);
            l_29_ += is[i_27_][1 + i_25_][i_26_] * l * (512L - l_28_);
            l_29_ += l_28_ * is[i_27_][i_25_][i_26_ + 1] * (512L - l);
            l_29_ += l * is[i_27_][1 + i_25_][1 + i_26_] * l_28_;
            l_29_ /= 262144L;
            l_29_ -= 1024L;
            float f = (-l_29_) - vector3f.y;
            vector3f.cache();
            return f;
        }
        vector3f.cache();
        return Float.NaN;
    }
}
