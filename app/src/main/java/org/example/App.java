package org.example;

public class App {
    public static void main(String[] args) {
        Frame f = new Frame();

        Ball a = new Ball(50,50,50,50);
        Ball b = new Ball(50,50,100,100);
        f.add(a);
        f.add(b);
        f.repaint();
    }
}
