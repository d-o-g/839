package com.jagex;

import java.awt.*;
import java.awt.Component;

public final class DelegatingCanvas extends Canvas {

    Component delegate;

    DelegatingCanvas(Component component) {
        delegate = component;
    }

    @Override
    public final void paint(Graphics graphics) {
        delegate.paint(graphics);
    }

    @Override
    public final void update(Graphics graphics) {
        delegate.update(graphics);
    }

}