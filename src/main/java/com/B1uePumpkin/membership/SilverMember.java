package com.B1uePumpkin.membership;

public class SilverMember extends Customer{
    public SilverMember(String id,int total){
        super(id, total);

    }
    @Override
    public void print() {
        System.out.println(id+"\t"+total+"\t"+(total-discount())+"\t"+"("+discount()+")");
    }
}
