package com.jagex;

import java.awt.*;

public class IntegerNode extends Node {
    public int value;

    public IntegerNode(int value) {
        this.value = value * -1975318049;
    }

    static void method16019(int oldMode, int newMode, int height, int width, boolean fullscreen) {
        if (Client.supportsFullScreen && null != Client.fullScreenFrame
                && (newMode != 3 || 3099199 * Class403.anInt4553 != height || width != 1670967737 * Engine.anInt6500)) {
            KeyType.method7032(Class589.fullScreenAdapter, Client.fullScreenFrame, 517522038);
            Client.fullScreenFrame = null;
        }
        if (Client.supportsFullScreen && newMode == 3 && Client.fullScreenFrame == null) {
            Client.fullScreenFrame = Client.getBestFrame(Class589.fullScreenAdapter, height, width, 0, 0);
            if (Client.fullScreenFrame != null) {
                Class403.anInt4553 = height * 1961076159;
                Engine.anInt6500 = -1992440695 * width;
                Client.savePreferences();
            }
        }
        if (newMode == 3 && (!Client.supportsFullScreen || null == Client.fullScreenFrame)) {
            method16019(oldMode, Class199.preferences.screenSize.getValue(), -1, -1, true);
        } else {
            Container container = Client.getActiveContainer();
            if (null != Client.fullScreenFrame) {
                Engine.anInt6494 = height * 2133658683;
                Class166_Sub15.anInt9602 = 1525026869 * width;
            } else if (null != Engine.frame) {
                Insets insets = Engine.frame.getInsets();
                Engine.anInt6494 = (Engine.frame.getSize().width - (insets.right + insets.left)) * 2133658683;
                Class166_Sub15.anInt9602 = (Engine.frame.getSize().height - (insets.top + insets.bottom)) * 1525026869;
            } else {
                Engine.anInt6494 = container.getSize().width * 2133658683;
                Class166_Sub15.anInt9602 = container.getSize().height * 1525026869;
            }
            if (Engine.anInt6494 * -562696973 <= 0) {
                Engine.anInt6494 = 2133658683;
            }
            if (Class166_Sub15.anInt9602 * -1308048867 <= 0) {
                Class166_Sub15.anInt9602 = 1525026869;
            }
            if (newMode != 1) {
                Class391.method6322(358740617);
            } else {
                Engine.screenWidth = Client.anInt10682 * 917933125;
                Engine.anInt6498 = (Engine.anInt6494 * -562696973 - Client.anInt10682 * -1936703811) / 2 * -1766002387;
                Engine.screenHeight = Client.anInt10813 * 1711850063;
                Engine.anInt6499 = 0;
            }
            if (Class622.aClass622_8012 != ArchiveLoader.aClass622_4521 && 1319181337 * Engine.screenWidth < 1024
                    && Engine.screenHeight * -551672947 >= 768) {

            }
            if (!fullscreen) {
                Engine.gameCanvas.setSize(1319181337 * Engine.screenWidth, Engine.screenHeight * -551672947);
                Class60.activeToolkit.method2396(Engine.gameCanvas, 1319181337 * Engine.screenWidth,
                        Engine.screenHeight * -551672947, -2029013060);
                if (Engine.frame == container) {
                    Insets insets = Engine.frame.getInsets();
                    Engine.gameCanvas.setLocation(1489471141 * Engine.anInt6498 + insets.left, Engine.anInt6499
                            * -1495234169 + insets.top);
                } else {
                    Engine.gameCanvas.setLocation(1489471141 * Engine.anInt6498, Engine.anInt6499 * -1495234169);
                }
            } else {
                DecodingFontProvider.method915();
            }
            Client.resizableScreen = newMode >= 2;
            ComponentKeyRecorder.method16355();
            if (-1 != Client.anInt10790 * 1764783361) {
                ShaderMetaBuffer.method4370(true);
            }
            if (Client.getActiveConnection().getConnection() != null
                    && (BaseAnimationDefinitionProvider.method3320(-1501875989 * Client.connectionState) || Class456
                    .lobbyState(Client.connectionState * -1501875989))) {
                Class530.sendWindowInfo(Client.getActiveConnection());
            }
            for (int i_4_ = 0; i_4_ < 104; i_4_++) {
                Client.validComponents[i_4_] = true;
            }
            Engine.aBool6502 = true;
        }
    }

}