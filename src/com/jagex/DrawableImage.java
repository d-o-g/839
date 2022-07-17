package com.jagex;

import java.awt.*;
import java.awt.Image;

public class DrawableImage extends Drawable {
    Image image;
    Class263 this$0;
    DrawableImage(Class263 class263, Image image, int offsetX, int offsetY) {
        super(class263, offsetX, offsetY);
        this$0 = class263;
        this.image = image;
    }

    static void method15208(int i) {
        ItemTable.modelAttrs = -1740504919 * i;
        ItemTable.models.clear();
    }

    @Override
    void draw(Graphics graphics) {
        int x = this$0.method4973(image.getWidth(null)) + offsetX * -232126773;
        int y = this$0.method4974(image.getHeight(null)) + offsetY * 2095638499;
        graphics.drawImage(image, x, y, null);
    }

}