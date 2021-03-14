package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerDemo extends JFrame {

    JButton button;
    JLabel label;
    int click = 0;

    public ActionListenerDemo() {
        setTitle("GUI Interface");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 200);
        JPanel panel = new JPanel();
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        panel.setLayout(new BorderLayout(0, 0));
        setContentPane(panel);
        label = new JLabel(" ");
        panel.add(label, BorderLayout.SOUTH);
        button = new JButton("Button");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("按钮被点击了" + ++click + " 次");
            }
        });
        panel.add(button);
    }

    public static void main(String[] args) {
        ActionListenerDemo frame = new ActionListenerDemo();
        frame.setVisible(true);
    }
}
