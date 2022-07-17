package com.jagex;

import java.util.Date;

public class Class181 implements Interface21 {
    SkillVarpProvider aSkillVarpProvider_2001;
    Class195 this$0;

    Class181(Class195 class195, Buffer buffer) {
        this$0 = class195;
        boolean bool = buffer.readUByte() != 255;
        if (bool) {
            buffer.caret -= 1258142129;
        }
        aSkillVarpProvider_2001 = new SkillVarpProvider(buffer, bool, true, class195.anBigBoyVarpProvider_2085);
    }

    public static void method3550() {
        Sprite.aClass116_7904 = null;
        Class272.aClass116_3008 = null;
        Class338.aClass116_3626 = null;
        LatencyMonitor.aClass116_552 = null;
        Class255.aClass116_2834 = null;
        BufferedConnectionContext.aClass116_1212 = null;
        Class166_Sub19.aClass116_9633 = null;
        MobChatCutsceneAction.aClass116_9646 = null;
        VarpBitProvider.aClass132_9779 = null;
        Class592.aClass9_7834 = null;
    }

    static void method3557(long l) {
        CalendarUtils.GMT_CALENDAR.setTime(new Date(l));
    }

    @Override
    public void execute(MappingVarpProvider mappingVarpProvider) {
        mappingVarpProvider.method3776(aSkillVarpProvider_2001);
    }

}