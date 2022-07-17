package com.jagex;

public class ItemPile extends TileObject {
    static Matrix4x3 aClass405_11756 = new Matrix4x3();
    public int secondaryAmount;
    public int primaryId;
    public int primaryAmount;
    public int secondaryId = 1436680777;
    public Matrix4x3 aClass405_11747;
    public int tertiaryId = -49073473;
    public int tertiaryAmount;
    public Matrix4x3 aClass405_11750 = null;
    public Matrix4x3 aClass405_11751 = null;
    public int anInt11753;
    int anInt11752;
    int anInt11754;
    int anInt11755;
    int anInt11757;
    int anInt11758;
    boolean aBool11759;

    public ItemPile(SceneGraph sceneGraph, int i, int i_30_, int i_31_, int i_32_, int i_33_) {
        super(sceneGraph, i, i_30_, i_31_, i_32_, i_33_);
        aClass405_11747 = null;
        anInt11753 = 0;
        anInt11757 = 0;
        aBool11759 = false;
        method16274(3);
        method18236();
    }

    @Override
    public Class498 method16293(Toolkit toolkit) {
        return null;
    }

    @Override
    public int getStartY() {
        return -10;
    }

    @Override
    public int method16307() {
        return anInt11753 * -233203207 - getStartY();
    }

    @Override
    boolean method16257(Toolkit toolkit, int i, int i_28_) {
        Matrix4x3 class405 = toolkit.getMatrix4x3();
        class405.method6728(getCoordinateSpace());
        class405.method6744(0.0F, -10.0F, 0.0F);

        Model model = ItemDefinition.loader.get(primaryId * 1984247053).method13583(toolkit, 131072,
                primaryAmount * -1512703491, null, null, 0, 0, 0, 0);
        if (null != model) {
            if (null == aClass405_11750) {
                aClass405_11756.method6730();
            } else {
                aClass405_11756.copyFrom(aClass405_11750);
            }
            aClass405_11756.method6745(class405);

            if (model.method2918(i, i_28_, aClass405_11756, true, 0)) {
                return true;
            }
        }

        if (-1425903609 * secondaryId != -1) {
            model = ItemDefinition.loader.get(secondaryId * -1425903609).method13583(toolkit, 131072,
                    -2046603417 * secondaryAmount, null, null, 0, 0, 0, 0);
            if (model != null) {
                if (aClass405_11751 == null) {
                    aClass405_11756.method6730();
                } else {
                    aClass405_11756.copyFrom(aClass405_11751);
                }
                aClass405_11756.method6745(class405);
                if (model.method2918(i, i_28_, aClass405_11756, true, 0)) {
                    return true;
                }
            }
        }

        if (-1 != -1502690623 * tertiaryId) {
            model = ItemDefinition.loader.get(tertiaryId * -1502690623).method13583(toolkit, 131072,
                    tertiaryAmount * 1531521965, null, null, 0, 0, 0, 0);
            if (model != null) {
                if (null == aClass405_11747) {
                    aClass405_11756.method6730();
                } else {
                    aClass405_11756.copyFrom(aClass405_11747);
                }
                aClass405_11756.method6745(class405);
                return model.method2918(i, i_28_, aClass405_11756, true, 0);
            }
        }
        return false;
    }

    @Override
    int itemAndNpcDefRelated() {
        ItemDefinition primary = ItemDefinition.loader.get(this.primaryId * 1984247053);
        int i_25_ = primary.anInt8332 * 327461957;

        if (-1425903609 * secondaryId != -1) {
            ItemDefinition secondary = ItemDefinition.loader.get(this.secondaryId * -1425903609);
            if (327461957 * secondary.anInt8332 > i_25_) {
                i_25_ = secondary.anInt8332 * 327461957;
            }
        }

        if (-1502690623 * tertiaryId != -1) {
            ItemDefinition tertiary = ItemDefinition.loader.get(-1502690623 * this.tertiaryId);
            if (327461957 * tertiary.anInt8332 > i_25_) {
                i_25_ = tertiary.anInt8332 * 327461957;
            }
        }

        return i_25_;
    }

    @Override
    boolean isTextured() {
        return false;
    }

    @Override
    boolean isCached() {
        return aBool11759;
    }

    @Override
    void method16265(Toolkit toolkit) {

    }

    @Override
    LoadedEntity method16271(Toolkit toolkit) {
        Vector3f vector3f = Vector3f.copyOf(getCoordinateSpace().translation);
        EntityIterator entityIterator = graph
                .getEntityIterator(plane, (int) vector3f.x >> 9, (int) vector3f.z >> 9, -1805913001);
        TileDecoration class600_sub1_sub4 = graph.getTileDecoration(plane, (int) vector3f.x >> 9,
                (int) vector3f.z >> 9);

        int i_0_ = 0;
        if (entityIterator != null && entityIterator.current.aBool11461) {
            i_0_ = entityIterator.current.getStartY();
        }

        if (null != class600_sub1_sub4 && class600_sub1_sub4.aShort11466 > -i_0_) {
            i_0_ = -class600_sub1_sub4.aShort11466;
        }

        if (i_0_ != -233203207 * anInt11753) {
            vector3f.y += i_0_ - anInt11753 * -233203207;
            setPosition(vector3f);
            anInt11753 = i_0_ * 223467593;
        }

        Matrix4x3 class405 = toolkit.getMatrix4x3();
        class405.method6730();
        if (-233203207 * anInt11753 == 0) {
            SceneGraphLevel ground = graph.levels1[collisionPlane];
            int i_3_ = anInt11757 * -1048113839 << 1;
            int i_4_ = i_3_;
            int i_5_ = -i_3_ / 2;
            int i_6_ = -i_4_ / 2;
            int i_7_ = ground.averageHeightAt((int) vector3f.x + i_5_, i_6_ + (int) vector3f.z);
            int i_8_ = i_3_ / 2;
            int i_9_ = -i_4_ / 2;
            int i_10_ = ground.averageHeightAt((int) vector3f.x + i_8_, (int) vector3f.z + i_9_);
            int i_11_ = -i_3_ / 2;
            int i_12_ = i_4_ / 2;
            int i_13_ = ground.averageHeightAt(i_11_ + (int) vector3f.x, i_12_ + (int) vector3f.z);
            int i_14_ = i_3_ / 2;
            int i_15_ = i_4_ / 2;
            int i_16_ = ground.averageHeightAt(i_14_ + (int) vector3f.x, i_15_ + (int) vector3f.z);
            int i_17_ = i_7_ < i_10_ ? i_7_ : i_10_;
            int i_18_ = i_13_ < i_16_ ? i_13_ : i_16_;
            int i_19_ = i_10_ < i_16_ ? i_10_ : i_16_;
            int i_20_ = i_7_ < i_13_ ? i_7_ : i_13_;
            if (0 != i_4_) {
                int i_21_ = (int) (Math.atan2(i_17_ - i_18_, i_4_) * 2607.5945876176133) & 0x3fff;
                if (i_21_ != 0) {
                    class405.method6739(1.0F, 0.0F, 0.0F, Class373.method6114(i_21_));
                }
            }
            if (i_3_ != 0) {
                int i_22_ = (int) (Math.atan2(i_20_ - i_19_, i_3_) * 2607.5945876176133) & 0x3fff;
                if (0 != i_22_) {
                    class405.method6739(0.0F, 0.0F, 1.0F, Class373.method6114(-i_22_));
                }
            }
            int i_23_ = i_16_ + i_7_;
            if (i_10_ + i_13_ < i_23_) {
                i_23_ = i_13_ + i_10_;
            }
            i_23_ = (i_23_ >> 1) - (int) vector3f.y;
            if (0 != i_23_) {
                class405.method6744(0.0F, i_23_, 0.0F);
            }
        }
        vector3f.cache();
        Vector3f vector3f_24_ = getCoordinateSpace().translation;
        class405.method6744(vector3f_24_.x, vector3f_24_.y - 10.0F, vector3f_24_.z);
        LoadedEntity class506 = LoadedEntity.method570(true);
        aBool11759 = false;
        anInt11757 = 0;
        if (-1502690623 * tertiaryId != -1) {
            Model model = ItemDefinition.loader.get(-1502690623 * tertiaryId).method13583(toolkit, 526336,
                    1531521965 * tertiaryAmount, null, null, anInt11755 * 593348181, anInt11752 * 1774949501,
                    -472079585 * anInt11754, -218845363 * anInt11758);
            if (null != model) {
                if (null == aClass405_11747) {
                    aClass405_11756.method6730();
                } else {
                    aClass405_11756.copyFrom(aClass405_11747);
                }
                aClass405_11756.method6745(class405);
                model.method2917(aClass405_11756, class139Array[2], 0);
                aBool11759 |= model.method2939();
                anInt11757 = model.method3016() * 681860017;
            }
        }
        if (-1425903609 * secondaryId != -1) {
            Model model = ItemDefinition.loader.get(-1425903609 * secondaryId).method13583(toolkit, 526336,
                    secondaryAmount * -2046603417, null, null, anInt11755 * 593348181, 1774949501 * anInt11752,
                    anInt11754 * -472079585, -218845363 * anInt11758);
            if (null != model) {
                if (null == aClass405_11751) {
                    aClass405_11756.method6730();
                } else {
                    aClass405_11756.copyFrom(aClass405_11751);
                }
                aClass405_11756.method6745(class405);
                model.method2917(aClass405_11756, class139Array[1], 0);
                aBool11759 |= model.method2939();
                if (model.method3016() > -1048113839 * anInt11757) {
                    anInt11757 = model.method3016() * 681860017;
                }
            }
        }
        Model model = ItemDefinition.loader.get(1984247053 * primaryId).method13583(toolkit, 526336,
                primaryAmount * -1512703491, null, null, 593348181 * anInt11755, anInt11752 * 1774949501,
                anInt11754 * -472079585, anInt11758 * -218845363);
        if (null != model) {
            if (aClass405_11750 == null) {
                aClass405_11756.method6730();
            } else {
                aClass405_11756.copyFrom(aClass405_11750);
            }
            aClass405_11756.method6745(class405);
            model.method2917(aClass405_11756, class139Array[0], 0);
            aBool11759 |= model.method2939();
            if (model.method3016() > anInt11757 * -1048113839) {
                anInt11757 = model.method3016() * 681860017;
            }
        }
        return class506;
    }

    void method18236() {
        anInt11755 = (32 + (int) (Math.random() * 4.0)) * 771294973;
        anInt11752 = (3 + (int) (Math.random() * 2.0)) * -1814985515;
        anInt11754 = (16 + (int) (Math.random() * 3.0)) * -2028136225;
        if (Class199.preferences.textures.getValue() == 1) {
            anInt11758 = (int) (Math.random() * 10.0) * -1721228923;
        } else {
            anInt11758 = (int) (Math.random() * 20.0) * -1721228923;
        }
    }

}