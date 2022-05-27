package com.B1uePumpkin.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//GUI test
public class GuessFrame extends JFrame {
    //Field
    //Structure
    public GuessFrame(){
        setSize(600,400);
        setLocation(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);

        JButton button = new JButton("Hi");
        JLabel label=new JLabel("zzz...");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello!");
                label.setText("Hello!");
            }
        });
        setLayout(new FlowLayout());
        add(button);
        add(label);
        setVisible(true);

    }
    //Method










    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();

    }
}
