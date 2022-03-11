package com.B1uePumpkin;

public class GraduateStudent extends Student{
    int thesis;
    public GraduateStudent(String name,
                           int math,
                           int english,
                           int thesis){
//        this.name=name;
//        this.math=math;
//        this.english=english;
        super(name, math, english);
        this.thesis=thesis;
//        super()呼叫副類別建構子
//        this()呼叫主類別建構子
    }

    @Override
    public void print() {
        System.out.println(name+"\t"+math+"\t"+english+"\t"+getAverage()+"\t"+thesis);
    }
}
