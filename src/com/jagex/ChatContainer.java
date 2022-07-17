package com.jagex;

public class ChatContainer {
    static final int anInt2621 = 100;
    public static Class461 aClass461_2622;
    int messageCount;
    ChatMessage[] messages = new ChatMessage[100];

    static final int method4432(int i) {
        return i >> 11 & 0x7f;
    }

    ChatMessage method4421(int i) {
        if (i < 0 || i >= messageCount * 2064451505) {
            return null;
        }

        return messages[i];
    }

    int getMessageCount() {
        return messageCount * 2064451505;
    }

    ChatMessage method4423(int type, int i_1_, String string, String string_2_, String string_3_,
                           String string_4_, String string_5_, int i_6_, ChatMessageIcon chatMessageIcon) {
        ChatMessage chatMessage = messages[99];
        for (int i_8_ = messageCount * 2064451505; i_8_ > 0; i_8_--) {
            if (i_8_ != 100) {
                messages[i_8_] = messages[i_8_ - 1];
            }
        }
        if (chatMessage == null) {
            chatMessage = new ChatMessage(type, i_1_, string, string_2_, string_3_, string_5_, i_6_,
                    string_4_, chatMessageIcon);
        } else {
            chatMessage.unlink();
            chatMessage.uncache();
            chatMessage.method17836(type, i_1_, string, string_2_, string_3_, string_5_, i_6_, string_4_,
                    chatMessageIcon);
        }
        messages[0] = chatMessage;
        if (2064451505 * messageCount < 100) {
            messageCount += 343859537;
        }
        return chatMessage;
    }

}