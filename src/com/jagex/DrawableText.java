package com.jagex;

import java.awt.*;
import java.awt.Font;

public class DrawableText extends Drawable {
    static Component aClass226_9829;
    static int anInt9830;
    Font font;
    Class263 this$0;
    FontMetrics metrics;
    boolean aBool9827;
    Color color;
    DrawableText(Class263 class263, boolean bool, String name, int size, int colour, int offsetX, int offsetY) {
        super(class263, offsetX, offsetY);
        this$0 = class263;
        aBool9827 = bool;
        font = new Font(name, 0, size);
        metrics = Engine.gameCanvas.getFontMetrics(font);
        color = new Color(colour);
    }

    public static void method15317() {
        if (-1501875989 * Client.connectionState == 6) {
            OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_4035,
                    Client.lobbyConnection.encryptor);
            Client.lobbyConnection.sendFrame(frame);
            Class34.aClass636_454 = Class636.aClass636_8126;
            Class512.aString7005 = null;
        }
    }

    @Override
    void draw(Graphics graphics) {
        String text;
        if (aBool9827) {
            text = this$0.aString2949;
        } else {
            text = this$0.aString2950 + " " + this$0.aString2949;
        }

        graphics.setFont(font);
        graphics.setColor(color);
        graphics.drawString(text, this$0.method4973(metrics.stringWidth(text)) + offsetX * -232126773,
                this$0.method4974(0) + 2095638499 * offsetY);
    }

}