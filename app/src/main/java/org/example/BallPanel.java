package org.example;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class BallPanel extends JPanel {

    private final ArrayList<Ball> balls;

    public BallPanel(ArrayList<Ball> balls) {
        this.balls = balls;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Ball b : balls) {
            b.draw(g);
        }
    }
}
