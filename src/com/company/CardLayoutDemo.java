package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI Interface");
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel card = new JPanel(new CardLayout());



        panel1.add(new JButton("登录"));
        panel1.add(new JButton("注册"));
        panel1.add(new JButton("密码找回"));

        panel2.add(new JTextField("用户名", 20));
        panel2.add(new JTextField("密码", 20));
        panel2.add(new JTextField("验证码", 20));

        card.add(panel1, "card1");
        card.add(panel2, "card2");
        CardLayout c = (CardLayout)(card.getLayout());
        c.show(card, "card1");

        frame.add(card);
        frame.setBounds(300, 200, 400, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
