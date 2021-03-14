package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class CalculatorDemo extends JFrame {

    private JPanel contentPanel;
    private JTextField textField;
    public CalculatorDemo() {
        setTitle("计算器");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 250, 200);
        contentPanel = new JPanel();
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPanel.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPanel);
        JPanel panel1 = new JPanel();
        contentPanel.add(panel1, BorderLayout.NORTH);
        textField = new JTextField();
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        panel1.add(textField);
        textField.setColumns(18);

        JPanel panel2 = new JPanel();
        contentPanel.add(panel2, BorderLayout.CENTER);
        panel2.setLayout(new GridLayout(4, 4, 5, 5));
        String[] list = new String[]{"7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "*", "0", ".", "=", "/"};

        for (String s : list) {
            JButton button = new JButton(s);
            panel2.add(button);
        }
    };

    public static void main(String[] args) {
        CalculatorDemo frame = new CalculatorDemo();
        frame.setVisible(true);
    }
}
