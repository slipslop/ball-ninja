package org.example;

import javax.swing.JFrame;

public class Frame {
    public Frame() {
        JFrame frame = new JFrame("a window");
        frame.setResizable(false);
        frame.setSize(640, 480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
