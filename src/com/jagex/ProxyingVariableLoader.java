package com.jagex;

import com.jagex.twitch.TwitchEventResult;
import com.jagex.twitch.TwitchTV;

import java.util.Map;

final class ProxyingVariableLoader implements VariableLoader {
    public static Class678_Sub6 aClass678_Sub6_3003;
    public static Map<VarpType, DefinitionLoader<Varp>> parameters;

    public static int method5080() {
        if (!Class533.aBool7275) {
            return 12;
        }

        BaseGraphicDefinitionProvider.method10303();
        return TwitchTV.tv.Logout();
    }

    static void method5081(int i, int i_2_) {
        TwitchEventResult result = new TwitchEventResult(i, i_2_);
        Class527 class527 = result.method6187();
        if (class527 != null) {
            Class60.method1369(class527.getId(), result);
        }
    }

    static int charOccurrences(CharSequence sequence, char c) {
        int count = 0;
        int length = sequence.length();

        for (int index = 0; index < length; index++) {
            if (sequence.charAt(index) == c) {
                count++;
            }
        }

        return count;
    }

    @Override
    public Varp getVarp(VarpType type, int id) {
        return parameters.get(type).get(id);
    }

    @Override
    public VarpBit getVarpBit(int id) {
        return VarpBit.loader.get(id);
    }

}