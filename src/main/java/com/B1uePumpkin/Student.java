package com.B1uePumpkin;

public class Student {
//    filed*3(區域變數)
//    1)name
//    2)math grade
//    3)english grade
    String name;
    int math;
    int english;

//    建構子(區域變數)
    public Student(String name,int math,int english) {
        this.name = name;
        this.math = math;
        this.english = english;
//        this=self
    }
    public void print(){
        System.out.println(name+"\t"+english+"\t"+math);
    }
}
