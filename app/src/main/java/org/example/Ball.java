package org.example;

import java.awt.Color;
import java.awt.Graphics;

public class Ball implements Drawable {

    private final int width;
    private final int height;
    private final int x;
    private final int y;

    public Ball(int width, int height, int x, int y) {
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics g) {
        g.setColor(Color.black);
        g.fillOval(x, y, width, height);
    }
}
