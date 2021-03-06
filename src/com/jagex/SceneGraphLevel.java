package com.jagex;

public abstract class SceneGraphLevel {
    public static Archive graphics;
    public int length;
    public int[][] tileHeights;
    public int tileScale;
    public int tileUnits;
    public int width;

    SceneGraphLevel(int width, int length, int units, int[][] heights) {
        this.width = width * 1000359407;
        this.length = length * -1569543467;

        int scale = 0;
        for (; units > 1; units >>= 1) {
            scale++;
        }

        tileUnits = -2147468247 * (1 << scale);
        tileScale = -592172723 * scale;
        tileHeights = heights;
    }

    public static void main(String[] args) {
        int units = 512;
        int scale = 0;
        for (; units > 1; units >>= 1) {
            scale++;
        }

        int tileUnits = (1 << scale);
        int tileScale = scale;

        System.out.println(tileUnits + " " + tileScale);
    }

    static final int calculateTileHeight(int x, int z) {
        int height = PerlinUtils.interpolatedNoise(45365 + x, 91923 + z, 4) - 128
                + (PerlinUtils.interpolatedNoise(10294 + x, 37821 + z, 2) - 128 >> 1)
                + (PerlinUtils.interpolatedNoise(x, z, 1) - 128 >> 2);
        height = (int) (height * 0.3) + 35;
        if (height < 10) {
            height = 10;
        } else if (height > 60) {
            height = 60;
        }
        return height;
    }

    static void method2227(Toolkit toolkit) {
        int i_65_ = -10660793;
        QuickChatCategoryLoader.method7010(toolkit, TextureMetricsList.menuX * 907118265,
                MobVariableCollection.menuY * 1889755609, PlayerInterfaceNode.menuWidth * -1708755565,
                502538357 * Class593.menuHeight, i_65_, -16777216, -383121897);
        Class450.b12Full.method2291(TranslatableString.CHOOSE_OPTION.translate(Client.currentLanguage),
                3 + 907118265 * TextureMetricsList.menuX, MobVariableCollection.menuY * 1889755609 + 14, i_65_,
                -1);
        int i_66_ = Client.recorder.getMouseX();
        int i_67_ = Client.recorder.getMouseY();
        if (!Class56.aBool620) {
            int i_68_ = 0;
            for (MenuItem class480_sub31_sub17 = MenuItem.options.head(); null != class480_sub31_sub17; class480_sub31_sub17 = MenuItem.options
                    .next()) {
                int i_69_ = MobVariableCollection.menuY * 1889755609 + 31 + -1427683309 * Class56.anInt616
                        * (Class56.menuOptionCount * 84366055 - 1 - i_68_);
                JavaToolkit.method14153(i_66_, i_67_, 907118265 * TextureMetricsList.menuX,
                        MobVariableCollection.menuY * 1889755609, PlayerInterfaceNode.menuWidth * -1708755565,
                        Class593.menuHeight * 502538357, i_69_, class480_sub31_sub17, Class450.b12Full,
                        Class281_Sub3.b12Full, -1, -256, 2111166665);
                i_68_++;
            }
        } else {
            int i_70_ = 0;
            for (ExpandableMenuItem class480_sub31_sub4 = Class56.expandableMenuItems.getFront(); class480_sub31_sub4 != null; class480_sub31_sub4 = Class56.expandableMenuItems
                    .next()) {
                int i_71_ = 31 + 1889755609 * MobVariableCollection.menuY + i_70_ * Class56.anInt616 * -1427683309;
                if (class480_sub31_sub4.optionCount * 713555001 == 1) {
                    JavaToolkit.method14153(i_66_, i_67_, TextureMetricsList.menuX * 907118265,
                            MobVariableCollection.menuY * 1889755609, -1708755565 * PlayerInterfaceNode.menuWidth,
                            Class593.menuHeight * 502538357, i_71_,
                            (MenuItem) class480_sub31_sub4.options.tail.nextCacheable, Class450.b12Full,
                            Class281_Sub3.b12Full, -1, -256, 1897918664);
                } else {
                    Class50.method1125(i_66_, i_67_, 907118265 * TextureMetricsList.menuX,
                            MobVariableCollection.menuY * 1889755609, -1708755565 * PlayerInterfaceNode.menuWidth,
                            502538357 * Class593.menuHeight, i_71_, class480_sub31_sub4, Class450.b12Full,
                            Class281_Sub3.b12Full, -1, -256, 1817325487);
                }
                i_70_++;
            }
            if (null != Class56.expandedMenuItem) {
                QuickChatCategoryLoader.method7010(toolkit, -1393036739 * Class56.expandedMenuX, Class159.expandedMenuY
                                * -2036920667, EnvironmentContext.expandedMenuWidth * 328052667, FloatRaster.expandedMenuHeight * 217318921,
                        i_65_, -16777216, -383121897);
                Class450.b12Full.method2291(Class56.expandedMenuItem.title, -1393036739 * Class56.expandedMenuX + 3,
                        -2036920667 * Class159.expandedMenuY + 14, i_65_, -1);
                i_70_ = 0;
                for (MenuItem class480_sub31_sub17 = Class56.expandedMenuItem.options.getFront(); class480_sub31_sub17 != null; class480_sub31_sub17 = Class56.expandedMenuItem.options
                        .next()) {
                    int i_72_ = Class56.anInt616 * -1427683309 * i_70_ + 31 + Class159.expandedMenuY * -2036920667;
                    JavaToolkit.method14153(i_66_, i_67_, Class56.expandedMenuX * -1393036739, -2036920667
                                    * Class159.expandedMenuY, 328052667 * EnvironmentContext.expandedMenuWidth,
                            217318921 * FloatRaster.expandedMenuHeight, i_72_, class480_sub31_sub17, Class450.b12Full,
                            Class281_Sub3.b12Full, -1, -256, 2082915951);
                    i_70_++;
                }
            }
        }
    }

    public static final int method6964(int i, int i_40_, int i_41_) {
        if (i_41_ > 243) {
            i_40_ >>= 4;
        } else if (i_41_ > 217) {
            i_40_ >>= 3;
        } else if (i_41_ > 192) {
            i_40_ >>= 2;
        } else if (i_41_ > 179) {
            i_40_ >>= 1;
        }
        return (i_40_ >> 5 << 7) + ((i & 0xff) >> 2 << 10) + (i_41_ >> 1);
    }

    public final int averageHeightAt(int worldX, int worldZ) {
        int x = worldX >> -333236347 * tileScale;
        int z = worldZ >> tileScale * -333236347;
        if (x < 0 || z < 0 || x > 767658255 * width - 1 || z > 295124605 * length - 1) {
            return 0;
        }
        int dx = worldX & tileUnits * 1668096025 - 1;
        int dz = worldZ & 1668096025 * tileUnits - 1;
        int a = dx * tileHeights[x + 1][z] + tileHeights[x][z] * (1668096025 * tileUnits - dx) >> -333236347
                * tileScale;
        int b = (tileUnits * 1668096025 - dx) * tileHeights[x][z + 1] + dx * tileHeights[1 + x][z + 1] >> tileScale
                * -333236347;
        return dz * b + (1668096025 * tileUnits - dz) * a >> -333236347 * tileScale;
    }

    public final int getTileHeight(int x, int z) {
        return tileHeights[x][z];
    }

    public abstract void finish();

    public abstract void setShadowing(int x, int z, int value);

    public abstract void addBlendedTile(int x, int z, int[] offsetsX, int[] is_178_, int[] offsetsY, int[] is_180_,
                                        int[] colours, int[] blendColours, int[] textures, int[] scales, Class150 class150, boolean bool);

    public abstract Shadow method2194(int i, int i_20_, Shadow class480_sub31_sub12);

    public abstract void deleteShadow(Shadow shadow, int x, int y, int z, int i_23_, boolean bool);

    public abstract void addShadow(Shadow shadow, int x, int y, int z, int i_26_, boolean bool);

    public abstract boolean method2197(Shadow shadow, int x, int y, int z, int i_29_, boolean bool);

    public abstract void addLight(PointLight class480_sub23, int[] is);

    public abstract void renderPlan(int i, int i_30_, int i_31_, int i_32_, int i_33_, int i_34_, int i_35_,
                                    boolean[][] bools);

    public final int method2206(int i, int i_36_, int i_37_) {
        int i_38_ = i >> tileScale * -333236347;
        int i_39_ = i_36_ >> tileScale * -333236347;
        i_38_ = Math.min(width * 767658255 - 1, Math.max(0, i_38_));
        i_39_ = Math.min(295124605 * length - 1, Math.max(0, i_39_));
        int i_40_ = Math.min(width * 767658255 - 1, 1 + i_38_);
        int i_41_ = Math.min(295124605 * length - 1, i_39_ + 1);
        int i_42_ = i & 1668096025 * tileUnits - 1;
        int i_43_ = i_36_ & tileUnits * 1668096025 - 1;
        int i_44_ = i_42_ * tileHeights[i_40_][i_39_] + (tileUnits * 1668096025 - i_42_) * tileHeights[i_38_][i_39_] >> tileScale
                * -333236347;
        int i_45_ = i_42_ * tileHeights[i_40_][i_41_] + tileHeights[i_38_][i_41_] * (tileUnits * 1668096025 - i_42_) >> -333236347
                * tileScale;
        return i_44_ * (tileUnits * 1668096025 - i_43_) + i_43_ * i_45_ >> tileScale * -333236347;
    }

    public final int method2214(int i, int i_46_) {
        return tileHeights[Math.min(width * 767658255 - 1, Math.max(0, i))][Math.min(length * 295124605 - 1,
                Math.max(0, i_46_))];
    }

    public abstract void method2216(int i, int i_51_, int i_52_, boolean[][] bools, boolean bool, int i_53_);

    public abstract void method2224(int i, int i_54_, int[] is, int[] is_55_, int[] is_56_, int[] is_57_, int[] is_58_,
                                    int[] is_59_, int[] is_60_, int[] is_61_, int[] is_62_, int[] is_63_, int[] is_64_, Class150 class150,
                                    boolean bool);

}