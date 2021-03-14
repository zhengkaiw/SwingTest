package com.company;

import javax.swing.*;
import java.awt.*;

public class JPanelDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI Interface");
        frame.setBounds(300, 100, 400, 200);
        JPanel panel = new JPanel();
        JLabel label = new JLabel("This is a label on panel");
        panel.setBackground(Color.CYAN);
        panel.add(label);
        frame.add(panel);
        frame.setVisible(true);
    }
}
