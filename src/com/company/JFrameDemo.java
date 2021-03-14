package com.company;

import javax.swing.*;
import java.awt.*;

public class JFrameDemo extends JFrame {

    public JFrameDemo() {
        setTitle("GUI Interface");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("This is a label");
        Container c = getContentPane();
        c.add(label);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JFrameDemo();
    }
}
