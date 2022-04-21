package com.B1uePumpkin.membership;

public class Customer {
    String id;
    int total;
    float off=0.1f;
    public Customer(String id, int total){
        this.id=id;
        this.total=total;
    }
    public Customer(){

        this("0000",0000);
    }
    public float discount(){
        return (total/1000)*off*1000;
    }
    public void print(){
        System.out.println(id+"\t"+total+"\t"+(total-discount()));
    }
}
