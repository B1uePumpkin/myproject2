package com.B1uePumpkin.membership;

public class SilverMember extends Customer{
    public SilverMember(String name,int total){
        super(name, total);
    }

    @Override
    public void print() {
        int discount=(total/1000)*200;
        super.print();
    }
}
