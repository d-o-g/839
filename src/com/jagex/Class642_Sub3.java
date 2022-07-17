package com.jagex;

public class Class642_Sub3 extends Class642 {
    public static Client aclient10561;
    Vector3f aVector3f_10555 = new Vector3f();
    boolean aBool10556;
    Vector3f aVector3f_10557;
    Vector3f aVector3f_10558 = new Vector3f(Float.NaN, Float.NaN, Float.NaN);
    Vector3f aVector3f_10559 = new Vector3f(Float.NaN, Float.NaN, Float.NaN);
    GameCharacter character;

    public Class642_Sub3(Camera class261) {
        super(class261);
        aVector3f_10557 = new Vector3f();
    }

    @Override
    public Vector3f method13222(byte i) {
        Vector3f vector3f = Vector3f.copyOf(aVector3f_10559);
        Vector3f vector3f_0_ = Vector3f.copyOf(aVector3f_10555);
        if (aBool10556) {
            vector3f_0_.invertAndMultiply(character.method142());
        }
        vector3f.add(vector3f_0_);
        vector3f_0_.cache();
        return vector3f;
    }

    @Override
    public void method13223(float f, int i) {
        if (null != character) {
            aVector3f_10559.copyFrom(character.method140().toVector3f());
            aClass261_8163.method4862(false, f, aVector3f_10558, aClass261_8163.jagexAngleToQuaternion((byte) 8), aVector3f_10559,
                    aVector3f_10557, -958958229);
        }
    }

    @Override
    public boolean method13224() {
        return !Float.isNaN(aVector3f_10558.x);
    }

    @Override
    public void method13227(Class268 class268, Matrix4x3 class405, int i, int i_3_, float f, int i_4_) {
        Vector3f vector3f = Vector3f.copyOf(aClass261_8163.getPosition());
        vector3f.x -= i;
        vector3f.z -= i_3_;
        vector3f.y *= -1.0F;
        Vector3f vector3f_5_ = method13235();
        vector3f_5_.x -= i;
        vector3f_5_.z -= i_3_;
        vector3f_5_.y *= -1.0F;
        class405.method6731(vector3f.x, vector3f.y, vector3f.z, vector3f_5_.x, vector3f_5_.y, vector3f_5_.z, 0.0F,
                1.0F, 0.0F);
        vector3f.cache();
        vector3f_5_.cache();
    }

    @Override
    public Vector3f method13235() {
        Vector3f vector3f = Vector3f.copyOf(aVector3f_10558);
        Vector3f vector3f_1_ = Vector3f.copyOf(aVector3f_10555);
        if (aBool10556) {
            vector3f_1_.invertAndMultiply(character.method142());
        }
        vector3f.add(vector3f_1_);
        vector3f_1_.cache();
        return vector3f;
    }

    @Override
    public void method13244(Buffer buffer, int i) {
        CharacterType class260 = CharacterType.valueOf(buffer.readUByte());
        int i_2_ = buffer.readUShort();
        character = aClass261_8163.method4835().get(class260, i_2_);
        aVector3f_10555.decode(buffer);
        aBool10556 = buffer.readUByte() == 1;
    }

    public void method16719(GameCharacter interface26, Vector3f vector3f, boolean bool, byte i) {
        character = interface26;
        aVector3f_10555.copyFrom(vector3f);
        aBool10556 = bool;
        interface26.method140();
    }

    public Vector3f method16720(int i) {
        return aVector3f_10558;
    }

    public void method16723() {
        if (character != null) {
            character = aClass261_8163.method4835().get(character.getType(),
                    character.getIndex());
        }
    }
}
