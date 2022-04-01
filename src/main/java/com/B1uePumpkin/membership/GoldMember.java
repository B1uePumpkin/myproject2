package com.B1uePumpkin.membership;

public class GoldMember extends SilverMember{
    public GoldMember(String id,int total){
        super(id, total);
        back=off;
    }
    public float backMoney() {
        return (total / 1000) * back;
    }
    @Override
    public void print() {
        System.out.println(id+"\t"+total+"\t"+(total-discount()+"("+backMoney()+")"));
    }
}
