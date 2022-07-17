package com.jagex;

public class ZoneProt {

    public static ZoneProt aClass358_3820 = new ZoneProt(-1);
    public static ZoneProt SPAWN_FIRED_PROJECTILE = new ZoneProt(21);
    public static ZoneProt aClass358_3822 = new ZoneProt(6);
    public static ZoneProt aClass358_3823 = new ZoneProt(-1);
    public static ZoneProt aClass358_3824 = new ZoneProt(2);
    public static ZoneProt ANIMATE_OBJECT = new ZoneProt(7);
    public static ZoneProt aClass358_3826 = new ZoneProt(5);
    public static ZoneProt SPAWN_PRIVATE_GROUND_ITEM = new ZoneProt(5);
    public static ZoneProt REMOVE_GROUND_ITEM = new ZoneProt(3);
    public static ZoneProt aClass358_3829 = new ZoneProt(9);
    public static ZoneProt SET_GROUND_ITEM_AMOUNT = new ZoneProt(7);
    public static ZoneProt SPAWN_ANIMABLE = new ZoneProt(10);
    public static ZoneProt SPAWN_PUBLIC_GROUND_ITEM = new ZoneProt(7);
    public static ZoneProt aClass358_3833 = new ZoneProt(8);
    public static ZoneProt SPAWN_PROJECTILE = new ZoneProt(18);

    ZoneProt(int i) {

    }

    static void method6026() {
        if (null == Class533.aClass116_7274
                || Class533.aClass116_7274.method2157() != Class533.aTwitchWebcamFrameData7282.width
                || Class533.aClass116_7274.method2119() != Class533.aTwitchWebcamFrameData7282.height) {
            Class533.aClass116_7274 = Class60.activeToolkit.createSprite(Class533.aTwitchWebcamFrameData7282.buffer, 0,
                    Class533.aTwitchWebcamFrameData7282.width, Class533.aTwitchWebcamFrameData7282.width,
                    Class533.aTwitchWebcamFrameData7282.height, false);
        } else {
            Class533.aClass116_7274.method2100(0, 0, Class533.aTwitchWebcamFrameData7282.width,
                    Class533.aTwitchWebcamFrameData7282.height, Class533.aTwitchWebcamFrameData7282.buffer, 0,
                    Class533.aTwitchWebcamFrameData7282.width);
        }
    }

    static void method6030(int i, int i_4_) {
        if (Client.playerDefaults.aBool7601
                || 1 != 84366055 * Class56.menuOptionCount
                && (!TextureMetrics.aBool1729 || 84366055 * Class56.menuOptionCount != 2 || !Class56.topMenuItem.action
                .equals(TranslatableString.FACE_HERE.translate(Client.currentLanguage)))) {
            FontSpecification specification = Class179.method3543();
            int maximumWidth = specification.textWidth(TranslatableString.CHOOSE_OPTION
                    .translate(Client.currentLanguage));
            int i_7_;

            if (!Class56.aBool620) {
                for (MenuItem class480_sub31_sub17 = MenuItem.options.head(); class480_sub31_sub17 != null; class480_sub31_sub17 = MenuItem.options
                        .next()) {
                    int width = ParameterDefinitionLoader.method16838(class480_sub31_sub17, specification);
                    if (width > maximumWidth) {
                        maximumWidth = width;
                    }
                }
                maximumWidth += 8;
                i_7_ = Class56.anInt616 * -1427683309 * Class56.menuOptionCount * 84366055 + 21;
                Class593.menuHeight = -137318435
                        * ((Class56.aBool642 ? 26 : 22) + 84366055 * Class56.menuOptionCount * -1427683309
                        * Class56.anInt616);
            } else {
                for (ExpandableMenuItem class480_sub31_sub4 = Class56.expandableMenuItems.getFront(); null != class480_sub31_sub4; class480_sub31_sub4 = Class56.expandableMenuItems
                        .next()) {
                    int i_9_;
                    if (713555001 * class480_sub31_sub4.optionCount == 1) {
                        i_9_ = ParameterDefinitionLoader.method16838(
                                (MenuItem) class480_sub31_sub4.options.tail.nextCacheable, specification);
                    } else {
                        i_9_ = ExpandableMenuItem.getTitleWidth(class480_sub31_sub4, specification);
                    }
                    if (i_9_ > maximumWidth) {
                        maximumWidth = i_9_;
                    }
                }
                maximumWidth += 8;
                i_7_ = 21 + -1427683309 * Class56.anInt616 * ExpandableMenuItem.count * 1469668737;
                Class593.menuHeight = (1469668737 * ExpandableMenuItem.count * Class56.anInt616 * -1427683309 + (Class56.aBool642 ? 26
                        : 22))
                        * -137318435;
            }
            maximumWidth += 10;
            int i_10_ = i - maximumWidth / 2;
            if (i_10_ + maximumWidth > 1319181337 * Engine.screenWidth) {
                i_10_ = Engine.screenWidth * 1319181337 - maximumWidth;
            }
            if (i_10_ < 0) {
                i_10_ = 0;
            }
            int i_11_ = i_4_;
            if (i_7_ + i_11_ > -551672947 * Engine.screenHeight) {
                i_11_ = Engine.screenHeight * -551672947 - i_7_;
            }
            if (i_11_ < 0) {
                i_11_ = 0;
            }
            TextureMetricsList.menuX = -461201527 * i_10_;
            MobVariableCollection.menuY = -774173079 * i_11_;
            PlayerInterfaceNode.menuWidth = -273682277 * maximumWidth;
            Class56.anInt648 = (int) (Math.random() * 24.0) * 1677581865;
            Class56.menuOpen = true;
        }
    }

    static void method6032(int id, int i_13_) {
        VarpBit variable = VarpBit.loader.get(id);
        PulseEvent event = PulseEvent.create(1, variable.varp.index * 169834903);

        try {
            if (PulseEvent.aBool11307) {
                event.primary = Class199.aVarcs_2099.getVarpValue(variable.varp) * 106711445;
            }

            event.primary = variable.getValue(-1750222403 * event.primary, i_13_) * 106711445;
            event.immediate();
        } catch (VarpBitException exception) {
            HitsplatDefinitionProvider.reportError(new StringBuilder().append(id).toString(), exception);
        }
    }

    public static ZoneProt[] values() {
        return new ZoneProt[]{SPAWN_FIRED_PROJECTILE, aClass358_3826, aClass358_3822, aClass358_3823,
                aClass358_3824, SET_GROUND_ITEM_AMOUNT, ANIMATE_OBJECT, SPAWN_PRIVATE_GROUND_ITEM, REMOVE_GROUND_ITEM,
                aClass358_3829, aClass358_3820, aClass358_3833, SPAWN_PUBLIC_GROUND_ITEM, SPAWN_ANIMABLE,
                SPAWN_PROJECTILE};
    }

}