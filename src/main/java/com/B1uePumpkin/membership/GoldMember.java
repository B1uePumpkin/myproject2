package com.B1uePumpkin.membership;

public class GoldMember extends SilverMember{
    public GoldMember(String id,int total){
        super(id, total);
        off=0.2f;
    }

}
