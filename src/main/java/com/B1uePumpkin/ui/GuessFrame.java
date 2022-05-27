package com.B1uePumpkin.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessFrame extends JFrame {
    //Field
    //Structure
    public GuessFrame(){
        setSize(600,400);
        setLocation(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);

        int answer = 5;

        JButton button = new JButton("GUESS!");
        JLabel label=new JLabel("zzz...");
        JTextField number = new JTextField(8);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num=Integer.parseInt(number.getText());
                System.out.println(num);
                if (num<answer){
                    label.setText("bigger!");
                }else if (num>answer){
                    label.setText("smaller!");
                }else{
                    label.setText("BINGO!!!the number is : "+answer);
                }
            }
        });
        setLayout(new FlowLayout());
        add(number);
        add(button);
        add(label);
        setVisible(true);

    }
    //Method










    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();

    }
}
