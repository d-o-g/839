package com.jagex;

import java.awt.*;

public class Class166_Sub8 extends CutsceneAction {
    static int anInt9550;
    String aString9545;
    int worldZ;
    int worldX;
    int anInt9548;
    int longetivity;
    Class166_Sub8(Buffer buffer) {
        super(buffer);
        worldX = buffer.readUShort() * 823623809;
        worldZ = buffer.readUShort() * -1113990883;
        aString9545 = buffer.readString();
        anInt9548 = buffer.readInt() * -728537099;
        longetivity = buffer.readUShort() * 518977151;
    }

    static void method15090() {
        Class193.keyRecorder.stop();
        Client.recorder.stop();
        Class642_Sub3.aclient10561.method7919();
        Engine.gameCanvas.setBackground(Color.black);
        Client.anInt10784 = -1137457249;
        Class193.keyRecorder = LoadedEntityContainer.method8673(Engine.gameCanvas);
        Client.recorder = ComponentMouseRecorder.create(Engine.gameCanvas, true);
    }

    @Override
    public void execute() {
        Class477_Sub6.create(1611577177 * ProxyingVariableLoader.localPlane, worldX * -1773617279, 450736437 * worldZ,
                SceneGraph.getAverageHeight(worldX * -1773617279, 450736437 * worldZ, 1611577177 * ProxyingVariableLoader.localPlane),
                longetivity * -1491678849, 1001180253 * anInt9548, aString9545);
    }

}