package com.B1uePumpkin.membership;

public class membership {
    public static void main(String[] args) {

        Customer c1=new Customer("0001",1200);
        c1.print();
        SilverMember c2=new SilverMember("0002",2300);
        c2.print();
    }
}

