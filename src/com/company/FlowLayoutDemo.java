package com.company;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI Interface");
        JPanel panel = new JPanel();

        for (int i = 1; i < 10; i++) {
            JButton button = new JButton(String.valueOf(i));
            panel.add(button);
        }

        panel.setLayout(new FlowLayout(FlowLayout.LEADING, 20, 20));
        panel.setBackground(Color.gray);
        frame.add(panel);
        frame.setBounds(300, 200, 300, 150);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
