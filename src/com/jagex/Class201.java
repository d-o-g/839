package com.jagex;

import java.util.Iterator;

public class Class201 implements VarpInstrution {
    Class195 this$0;
    DefaultMapEntry aClass383_2113;
    Class201(Class195 class195, Buffer buffer) {
        this$0 = class195;
        if (buffer.readUShort() != 65535) {
            buffer.caret -= -1778683038;
            aClass383_2113 = class195.anBigBoyVarpProvider_2085.method119().decode(buffer);
        } else {
            aClass383_2113 = null;
        }
    }

    static final void method3943() {
        Iterator<CacheableEffect> iterator = Client.effects.iterator();
        while (iterator.hasNext()) {
            CacheableEffect cached = iterator.next();
            Effect animated = cached.object;
            animated.method18222(1);

            if (animated.method18212()) {
                cached.unlink();
                animated.method18224();
            }
        }
    }

    @Override
    public void execute(MappingVarpProvider mappingVarpProvider) {
        if (aClass383_2113 != null) {
            mappingVarpProvider.method3836().setStringVarp(
                    this$0.anBigBoyVarpProvider_2085.method119().get(aClass383_2113.key * 1960527763), aClass383_2113.value);
        }
    }

}