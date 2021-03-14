package com.company;

import javax.swing.*;

public class JComboBoxDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI Interface");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("证件类型：");
        JComboBox cb = new JComboBox();

        cb.addItem("--请选择--");
        cb.addItem("身份证");
        cb.addItem("驾驶证");
        cb.addItem("军官证");

        panel.add(label);
        panel.add(cb);
        frame.add(panel);

        frame.setBounds(300, 200, 400, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
