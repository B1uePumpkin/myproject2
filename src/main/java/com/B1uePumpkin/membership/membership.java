package com.B1uePumpkin.membership;

import java.util.ArrayList;

public class membership {
    public static void main(String[] args) {

//        Customer c1=new Customer("0001",1200);
//        c1.print();
//        SilverMember c2=new SilverMember("0002",2300);
//        c2.print();
//        GoldMember c3=new GoldMember("0003",5000);
//        c3.print();

        ArrayList<Customer> customers=new ArrayList<>();
        customers.add(new Customer("0001",1000));
        customers.add(new Customer("0002",800));
        customers.add(new SilverMember("0003",1200));
        customers.add(new GoldMember("0004",2200));

        for (int i = 0; i < 4; i++) {
            customers.get(i).print();
        }
        for(Customer c: customers){
            c.print();
        }
    }
}

