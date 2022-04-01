package com.B1uePumpkin.membership;

public class PlatinumMember extends GoldMember{
    public PlatinumMember(String id,int total){
        super(id, total);
        off=300;
        back=200;
    }

    @Override
    public void print() {
        super.print();
    }
}
