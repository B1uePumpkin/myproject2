package com.B1uePumpkin.membership;

public class SilverMember extends Customer{
    public SilverMember(String id,int total){

        super(id, total);
    }

    @Override
    public float discount() {
        off=200;
        return super.discount();
    }

    public void print() {
        super.print();
    }
}
