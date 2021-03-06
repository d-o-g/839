package com.jagex;

public class MobWalkCutsceneAction extends CutsceneAction {
    int index;
    int walk;
    int plane;
    MobWalkCutsceneAction(Buffer buffer) {
        super(buffer);
        index = buffer.readUShort() * 117232353;
        walk = buffer.readUShort() * 1735991359;
        plane = buffer.readUByte() * 681273215;
    }

    static Component method15116(Component component) {
        Component class226_0_ = Client.method17024(component);
        if (null == class226_0_) {
            class226_0_ = component.parent;
        }
        return class226_0_;
    }

    @Override
    public void execute() {
        CutsceneMobile mob = CutsceneMobile.cutsceneMobiles[index * -1505496799];
        CutsceneWalk walk = CutsceneWalk.walks[-1594699841 * this.walk];
        walk.walk(mob, 447502463 * plane);
    }

}