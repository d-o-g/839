package com.jagex;

import java.awt.*;
import java.awt.Image;
import java.awt.image.*;
import java.util.Hashtable;

public final class JavaImageDelegatingDisplay extends JavaDelegatingDisplay {
    Image image;

    JavaImageDelegatingDisplay(JavaToolkit toolkit, Canvas canvas, int width, int height) {
        super(toolkit, canvas, width, height);
        init();
    }

    @Override
    public int draw() {
        return draw(0, 0);
    }

    @Override
    public final int draw(int x, int y) {
        Graphics graphics = canvas.getGraphics();
        if (graphics == null) {
            return 0;
        }

        graphics.drawImage(image, x, y, canvas);
        return 0;
    }

    @Override
    public void delete() {

    }

    @Override
    void init() {
        super.init();
        DataBufferInt buffer = new DataBufferInt(data, data.length);
        DirectColorModel model = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster raster = Raster.createWritableRaster(
                model.createCompatibleSampleModel(1603341171 * width, height * 1240882509), buffer, null);
        image = new BufferedImage(model, raster, false, new Hashtable());
    }

}