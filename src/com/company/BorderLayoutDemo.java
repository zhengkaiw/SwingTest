package com.company;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("GUI Interface");
        f.setSize(400, 200);
        f.setLayout(new BorderLayout());
        JButton bUp = new JButton("UP");
        JButton bLeft = new JButton("LEFT");
        JButton bCenter = new JButton("CENTER");
        JButton bRight = new JButton("RIGHT");
        JButton bDown = new JButton("DOWN");
        f.add(bUp, BorderLayout.NORTH);
        f.add(bLeft, BorderLayout.WEST);
        f.add(bCenter, BorderLayout.CENTER);
        f.add(bRight, BorderLayout.EAST);
        f.add(bDown, BorderLayout.SOUTH);
        f.setBounds(300, 200, 600, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
