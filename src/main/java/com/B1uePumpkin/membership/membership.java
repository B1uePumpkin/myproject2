package com.B1uePumpkin.membership;

public class membership {
    public static void main(String[] args) {

        Customer c1=new Customer("0001",1200);
        c1.print();
        SilverMember c2=new SilverMember("0002",2300);
        c2.print();
        GoldMember c3=new GoldMember("0003",5000);
        c3.print();
        PlatinumMember c4=new PlatinumMember("0004",5000);
        c4.print();
    }
}

