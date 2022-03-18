package com.B1uePumpkin.membership;

public class GoldMember extends SilverMember{
    public GoldMember(String id,int total){
        super(id, total);
    }

    @Override
    public float discount() {
        return super.discount();
    }

    @Override
    public void print() {
        System.out.println(id+"\t"+total+"\t"+(total-discount()+"("+discount()+")"));
    }
}
