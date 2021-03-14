package com.company;

import javax.swing.*;

public class JListDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI Interface");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("证件类型：");
        String[] items = new String[]{"身份证", "驾驶证", "军官证"};
        JList list = new JList(items);
        panel.add(label);
        panel.add(list);
        frame.add(panel);

        frame.setBounds(300, 200, 400, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
