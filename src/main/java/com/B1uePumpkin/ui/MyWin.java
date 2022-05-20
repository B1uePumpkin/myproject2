package com.B1uePumpkin.ui;

import javax.swing.*;
import java.awt.*;
import java.rmi.MarshalException;

public class MyWin {
    public static void main(String[] args) {
        //swing, SWT, JavaFX
        //eXtension
        JFrame frame = new JFrame();
        frame.setSize(600,400);
        frame.setLocation(300,200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //關掉視窗後清理資源

        //add component
        JButton button = new JButton("ok");

        //匿名類別, Anonymous class
        MyActionListener listener = new MyActionListener();
        button.addActionListener(listener);

        //layout
        //frame.setLayout(new BorderLayout());
        frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.add(new JButton("Testing"));
        frame.setVisible(true);
        System.out.println("END?");
    }
}
