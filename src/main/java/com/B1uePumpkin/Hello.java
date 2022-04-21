package com.B1uePumpkin;

import com.B1uePumpkin.membership.Customer;
import com.B1uePumpkin.membership.GoldMember;
import com.B1uePumpkin.membership.SilverMember;

import java.util.ArrayList;

public class Hello {
    public static void main(String[] args) {
        ArrayList<Customer>customers =new ArrayList<>();
        customers.add(new Customer("0001",800));
        customers.add(new Customer("0002",1200));
        customers.add(new SilverMember("0003",2000));
        customers.add(new GoldMember("0004",5000));
        for (int i = 0; i < 5; i++) {
            customers.get(i).print();
        }
        for (Customer c: customers){
            c.print();
        }
        System.out.println("Hello World!");
    }
}
