package com.B1uePumpkin.Scoring;

public class Student implements Printable{
//    filed*3(區域變數)
//    1)name
//    2)math grade
//    3)english grade
    String name;
    int math;
    int english;

//    建構子(區域變數)
    public Student(String name){
        this.name=name;
    }
    public Student(String name,int math,int english) {
        this(name);
        this.math = math;
        this.english = english;
//        this=self
//        this()=呼叫建構子
    }
    public Student(){
//        name="Jhon Doe";
//        math=-1;
//        english=-1;
        this("Jhon Doe",-1,-1);
    }
    public void print(){

        System.out.print(name+"\t"+english+"\t"+math+"\t"+getAverage());
        if (getAverage()>60){
            System.out.print("*");
        }
        System.out.println();
    }

    public int getAverage() {
        return (math+english)/2;
    }
}
