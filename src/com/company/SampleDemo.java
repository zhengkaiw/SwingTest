package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class SampleDemo {

    private JPanel panel;
    private JComboBox cb;
    private JLabel label;
    private JLabel info;
    private JTextField textField;
    private JButton bAdd;
    private JButton bDel;

    public SampleDemo() {
        JFrame frame = new JFrame("GUI Interface");
        panel = new JPanel();
        cb = new JComboBox();
        label = new JLabel("添加星座:");
        info = new JLabel();
        textField = new JTextField(16);
        bAdd = new JButton("新增");
        bDel = new JButton("删除");

        cb.addItem("--请选择--");
        cb.addItem("巨蟹座");
        cb.addItem("狮子座");
        cb.addItem("双鱼座");
        panel.add(cb);
        panel.add(label);
        panel.add(textField);
        panel.add(bAdd);
        panel.add(bDel);

        frame.add(panel);
        bAdd.addActionListener(new MyActionListener());
        bDel.addActionListener(new MyActionListener());
        cb.addItemListener(new MyItemListener());
        frame.setBounds(300, 200, 600, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    class MyItemListener implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            String s = e.getItem().toString();
            panel.add(info);
            info.setText("选择的星座是:" + s);
        }
    }

    class MyActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String s = e.getActionCommand();

            if (s.equals("新增")) {
                if (textField.getText().length() != 0) {
                    cb.addItem(textField.getText());
                    panel.add(info);
                    info.setText("添加成功， 新增了: " + textField.getText());
                } else {
                    panel.add(info);
                    info.setText("请输入要添加的星座");
                }
            }

            if (s.equals("删除")) {
                if (cb.getSelectedIndex() != -1) {
                    String item = cb.getSelectedItem().toString();
                    if (item.equals("--请选择--")) {
                        panel.add(info);
                        info.setText("请选择要删除的星座");
                        return;
                    }
                    cb.removeItem(item);
                    panel.add(info);
                    info.setText("删除成功, 删除了: " + item);
                } else {
                    panel.add(info);
                    info.setText("请选择要删除的星座");
                }
            }
        }
    }

    public static void main(String[] args) {
        new SampleDemo();
    }
}
