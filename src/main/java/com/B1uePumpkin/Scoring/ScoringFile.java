package com.B1uePumpkin.Scoring;

import java.io.*;

public class ScoringFile {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("scores.txt");//throws
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();
            while (line!=null) {
//                System.out.println(line);
                String[] token = line.split(",");
                String name = token[0];
                int english = Integer.parseInt(token[1]);
                int math = Integer.parseInt(token[2]);
                Student stu = new Student(name, english, math);
                stu.print();
                line = reader.readLine();
            }
        } catch (Exception e){
            System.out.println("讀取錯誤");
        }
        System.out.println("Testing");
    }
}
