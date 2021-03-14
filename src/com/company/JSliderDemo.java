package com.company;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class JSliderDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI Interface");
        frame.setSize(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JSlider slider = new JSlider(0, 100);
        slider.setMajorTickSpacing(10);
        slider.setMinorTickSpacing(5);
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        JLabel label = new JLabel("");

        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                label.setText("刻度: " + slider.getValue());
            }
        });

        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setVisible(true);
    }
}
