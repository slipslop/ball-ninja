package org.example;

import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        ArrayList<Ball> balls = new ArrayList<Ball>();
        Ball a = getRandomBall();
        Ball b = getRandomBall();
        Ball c = getRandomBall();
        balls.add(a);
        balls.add(b);
        balls.add(c);

        Frame f = new Frame();
        BallPanel panel = new BallPanel(balls);
        f.add(panel);
        f.repaint();
    }

    private static Ball getRandomBall() {
        Random r = new Random();

        int width = r.nextInt(50);
        int height = r.nextInt(50);
        int x = r.nextInt(640);
        int y = r.nextInt(480);
        return new Ball(width, height, x, y);
    }

}
