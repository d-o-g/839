package com.jagex;

import java.awt.*;

public class ChatMessageIcon implements Identifiable {
    static ChatMessageIcon aChatMessageIcon_3695;
    static ChatMessageIcon aChatMessageIcon_3698;
    static ChatMessageIcon aChatMessageIcon_3699;
    static ChatMessageIcon aChatMessageIcon_3700;
    static ChatMessageIcon aChatMessageIcon_3701;
    static ChatMessageIcon aChatMessageIcon_3702;
    static ChatMessageIcon aChatMessageIcon_3703;
    static ChatMessageIcon aChatMessageIcon_3704;
    static ChatMessageIcon aChatMessageIcon_3705 = new ChatMessageIcon(0, -1, false, true);
    static Sprite[] mapflags;

    static {
        aChatMessageIcon_3695 = new ChatMessageIcon(1, 0, true, true);
        aChatMessageIcon_3700 = new ChatMessageIcon(2, 1, true, false);
        aChatMessageIcon_3704 = new ChatMessageIcon(3, 8, true, true);
        aChatMessageIcon_3699 = new ChatMessageIcon(4, 9, false, true);
        aChatMessageIcon_3698 = new ChatMessageIcon(5, 10, true, true);
        aChatMessageIcon_3701 = new ChatMessageIcon(6, 11, false, true);
        aChatMessageIcon_3702 = new ChatMessageIcon(7, 12, false, true);
        aChatMessageIcon_3703 = new ChatMessageIcon(8, 13, false, true);
    }

    public int crown;
    public boolean aBool3706;
    public boolean aBool3707;
    int id;

    ChatMessageIcon(int i, int i_0_, boolean bool_1_, boolean bool_2_) {
        id = -2117400295 * i;
        crown = i_0_ * 935562711;
        aBool3706 = bool_1_;
        aBool3707 = bool_2_;
    }

    public static ChatMessageIcon[] values() {
        return new ChatMessageIcon[]{aChatMessageIcon_3695, aChatMessageIcon_3705, aChatMessageIcon_3700, aChatMessageIcon_3702, aChatMessageIcon_3703,
                aChatMessageIcon_3704, aChatMessageIcon_3699, aChatMessageIcon_3701, aChatMessageIcon_3698};
    }

    public static void method5970() {
        if (Client.fullScreenFrame == null) {
            int width = 1489471141 * Engine.anInt6498;
            int height = -1495234169 * Engine.anInt6499;
            int widthOffset = Engine.anInt6494 * -562696973 - Engine.screenWidth * 1319181337 - width;
            int heightOffset = -1308048867 * Class166_Sub15.anInt9602 - Engine.screenHeight * -551672947 - height;
            if (width > 0 || widthOffset > 0 || height > 0 || heightOffset > 0) {
                try {
                    Container container = Client.getActiveContainer();
                    int leftInset = 0;
                    int topInset = 0;
                    if (container == Engine.frame) {
                        Insets insets = Engine.frame.getInsets();
                        leftInset = insets.left;
                        topInset = insets.top;
                    }
                    Graphics graphics = container.getGraphics();
                    graphics.setColor(Color.black);
                    if (width > 0) {
                        graphics.fillRect(leftInset, topInset, width, -1308048867 * Class166_Sub15.anInt9602);
                    }
                    if (height > 0) {
                        graphics.fillRect(leftInset, topInset, Engine.anInt6494 * -562696973, height);
                    }
                    if (widthOffset > 0) {
                        graphics.fillRect(leftInset + Engine.anInt6494 * -562696973 - widthOffset, topInset, widthOffset, -1308048867
                                * Class166_Sub15.anInt9602);
                    }
                    if (heightOffset > 0) {
                        graphics.fillRect(leftInset, topInset + -1308048867 * Class166_Sub15.anInt9602 - heightOffset, -562696973
                                * Engine.anInt6494, heightOffset);
                    }
                } catch (Exception exception) {

                }
            }
        }
    }

    static final void method5967(ScriptExecutionContext class613, int i) {
        class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = ItemDefinition.aMappingVarpProvider_8339
                .method3811();
    }

    static final void method5968(long l) {
        int i = 1327138123 * Client.anInt10706;
        int i_3_ = -2128941351 * Client.anInt10707;
        if (i != -55942707 * Class215.anInt2196) {
            int i_4_ = i - Class215.anInt2196 * -55942707;
            int i_5_ = (int) (i_4_ * l / 320L);
            if (i_4_ > 0) {
                if (0 == i_5_) {
                    i_5_ = 1;
                } else if (i_5_ > i_4_) {
                    i_5_ = i_4_;
                }
            } else if (0 == i_5_) {
                i_5_ = -1;
            } else if (i_5_ < i_4_) {
                i_5_ = i_4_;
            }
            Class215.anInt2196 += i_5_ * -2001636603;
        }
        if (i_3_ != -457862351 * Class115.anInt1444) {
            int i_6_ = i_3_ - -457862351 * Class115.anInt1444;
            int i_7_ = (int) (l * i_6_ / 320L);
            if (i_6_ > 0) {
                if (0 == i_7_) {
                    i_7_ = 1;
                } else if (i_7_ > i_6_) {
                    i_7_ = i_6_;
                }
            } else if (0 == i_7_) {
                i_7_ = -1;
            } else if (i_7_ < i_6_) {
                i_7_ = i_6_;
            }
            Class115.anInt1444 += i_7_ * 1452860881;
        }
        Client.aFloat10787 += 8.0F * (Client.aFloat10710 * l / 40.0F);
        Client.aFloat10708 += l * Client.aFloat10711 / 40.0F * 8.0F;
        MovementType.method10452();
    }

    static final void method5969(Component class226, Interface class221, ScriptExecutionContext class613) {
        String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
        if (ScriptExecutionContext.method9239(string, class613) != null) {
            string = string.substring(0, string.length() - 1);
        }
        class226.anObjectArray2522 = World.method16248(string, class613);
        class226.aBool2483 = true;
    }

    @Override
    public int getId() {
        return -584432855 * id;
    }

}