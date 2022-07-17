package com.jagex;

import java.util.Arrays;

public class Class166_Sub19 extends CutsceneAction {
    public static Sprite aClass116_9633;
    int index;
    int animation;
    int anInt9631;
    int[] animations;
    Class166_Sub19(Buffer buffer) {
        super(buffer);

        index = buffer.readUShort() * 677979063;
        animations = new int[4];
        animation = buffer.readSmart32() * -715148741;
        Arrays.fill(animations, 0, animations.length, animation * 306075379);
        anInt9631 = buffer.readInt() * -1092967349;
    }

    public static World method15132(int i) {
        if (!Class572.aBool7655 || i < Class80.anInt2578 * -910063499 || i > -397285031 * Class572.anInt7654) {
            return null;
        }
        return Class289_Sub1.worlds[i - -910063499 * Class80.anInt2578];
    }

    @Override
    public void execute() {
        Mobile mobile = CutsceneMobile.cutsceneMobiles[-1394857465 * index].get();
        if (0 == anInt9631 * -1936259741) {
            Mobile.method8795(mobile, animations, 0, false);
        } else {
            Class166_Sub14.method15118(mobile, new int[]{animation * 306075379}, new int[]{0}, new int[]{anInt9631
                    * -1936259741});
        }
    }

    @Override
    boolean ready() {
        Animation animation = Animation.loader.get(306075379 * this.animation);
        return animation.ready();
    }
}
