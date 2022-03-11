package com.B1uePumpkin;

public class ScorningNG {
    public static void main(String[] args) {
        String name[]={"Andy","Nancy","Chris","Jhon","Frank"};
        int math[] ={98,87,76,65,54};
        int english[]={56,67,78,89,90};
        for (int i = 0; i < 5; i++) {
            System.out.println(name[i]+"\t"+math[i]+"\t"+english[i]+"\t"+(math[i]+english[i])/2);
        }
    }
}
