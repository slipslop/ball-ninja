package org.example;

import javax.swing.JFrame;

public class Frame extends JFrame {
    public Frame() {
        setTitle("a window");
        setResizable(false);
        setSize(640, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
