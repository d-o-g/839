package com.jagex;

public class Class498 {
    int anInt6885;
    int absoluteY;
    int floorLevel;
    int anInt6888;
    int anInt6889;
    int anInt6890;
    int absoluteX;
    int anInt6892;
    int anInt6893;
    int anInt6894;

    Class498(int absoluteX, int absoluteY, int floorLevel, int i_11_,
            int minimumX, int maximumX,
            int minimumY, int maximumY,
            int minimumZ, int maximumZ) {
        this.absoluteX = absoluteX;
        this.absoluteY = absoluteY;
        this.floorLevel = floorLevel;
        anInt6888 = i_11_ * i_11_;
        anInt6885 = this.absoluteX + minimumX;
        anInt6890 = this.absoluteX + maximumX;
        anInt6889 = this.absoluteY + minimumY;
        anInt6892 = this.absoluteY + maximumY;
        anInt6893 = this.floorLevel + minimumZ;
        anInt6894 = this.floorLevel + maximumZ;
    }

    static Class498 create(int absoluteX, int absoluteY, int floorLevel, Model model) {
        if (model == null) {
            return null;
        }

        Class498 class498 = new Class498(absoluteX, absoluteY, floorLevel,
                model.method2920(), model.minimumX(), model.maximumX(),
                model.minimumY(), model.maximumY(), model.minimumZ(), model.maximumZ());
        return class498;
    }

    public boolean method8681(int i, int i_18_, int i_19_) {
        if (i < anInt6885 || i > anInt6890) {
            return false;
        }
        if (i_18_ < anInt6889 || i_18_ > anInt6892) {
            return false;
        }
        if (i_19_ < anInt6893 || i_19_ > anInt6894) {
            return false;
        }
        int i_20_ = i - absoluteX;
        int i_21_ = i_19_ - floorLevel;
        return i_20_ * i_20_ + i_21_ * i_21_ < anInt6888;
    }

    void method8679(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
        absoluteX = i;
        absoluteY = i_0_;
        floorLevel = i_1_;
        anInt6888 = i_2_ * i_2_;
        anInt6885 = absoluteX + i_3_;
        anInt6890 = absoluteX + i_4_;
        anInt6889 = absoluteY + i_5_;
        anInt6892 = absoluteY + i_6_;
        anInt6893 = floorLevel + i_7_;
        anInt6894 = floorLevel + i_8_;
    }
}
