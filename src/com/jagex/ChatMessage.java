package com.jagex;

public class ChatMessage extends Cacheable {
    public int cycle;
    public ChatMessageIcon icon;
    public int type;
    public int anInt11376;
    public String source;
    public String aString11378;
    public String aString11379;
    public String content;
    public int anInt11381;
    public int anInt11382 = Class248.method8773() * 1519526845;
    public String aString11383;
    ChatMessage(int type, int i_0_, String source, String string_1_, String string_2_, String content,
                int i_4_, String string_5_, ChatMessageIcon chatMessageIcon) {
        cycle = -2023056447 * Client.engineCycle;
        this.type = 805274409 * type;
        anInt11376 = i_0_ * 853146267;
        this.source = source;
        aString11378 = string_1_;
        aString11379 = string_2_;
        this.content = content;
        anInt11381 = -796438857 * i_4_;
        aString11383 = string_5_;
        icon = chatMessageIcon;
    }

    static final void method17837(Component class226, Interface class221, ScriptExecutionContext class613) {
        class226.anInt2407 = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] * -1334030119;
        Component.redraw(class226);
    }

    public static int method3149(int i) {
        ChatMessage chatMessage = Class248.messageCache.get(i);
        if (chatMessage == null) {
            return -1;
        } else if (chatMessage.previousCacheable == Class248.aClass638_2668.tail) {
            return -1;
        }

        return ((ChatMessage) chatMessage.previousCacheable).anInt11382 * -482365547;
    }

    public static ChatMessage method3150(int i) {
        return Class248.messageCache.get(i);
    }

    void method17836(int i, int i_6_, String string, String string_7_, String string_8_, String string_9_, int i_10_,
                     String string_11_, ChatMessageIcon chatMessageIcon) {
        anInt11382 = Class248.method8773() * 1519526845;
        cycle = -2023056447 * Client.engineCycle;
        type = i * 805274409;
        anInt11376 = i_6_ * 853146267;
        source = string;
        aString11378 = string_7_;
        aString11379 = string_8_;
        content = string_9_;
        anInt11381 = -796438857 * i_10_;
        aString11383 = string_11_;
        icon = chatMessageIcon;
    }

}