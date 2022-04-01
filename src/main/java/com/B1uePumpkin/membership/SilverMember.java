package com.B1uePumpkin.membership;

public class SilverMember extends Customer{
    public SilverMember(String id,int total){
        super(id, total);
        off=200;

    }


    public void print() {
        super.print();
    }
}
