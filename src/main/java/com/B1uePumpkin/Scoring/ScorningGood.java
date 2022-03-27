package com.B1uePumpkin.Scoring;

public class ScorningGood {
    public static void main(String[] args) {
        Student jack=new Student("Jack",98,45);
//        jack.name="Jack";
//        jack.math=98;
//        jack.english=45;
        Student andy=new Student("Andy");
        Student s=new Student();
        GraduateStudent jane=
                new GraduateStudent("Jane",67,88,94);
        jane.name="Jane";
        jack.print();
        andy.print();
        s.print();
        jane.print();
    }
}
