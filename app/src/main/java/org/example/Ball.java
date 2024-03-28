package org.example;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Ball extends JPanel {

    private final int width;
    private final int height;
    private final int x;
    private final int y;

    public Ball(int width, int height, int x, int y) {
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
        setSize(500, 500);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillOval(this.x, this.y, this.width, this.height);
    }
}
