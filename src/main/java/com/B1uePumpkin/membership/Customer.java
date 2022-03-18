package com.B1uePumpkin.membership;

public class Customer {
    String id;
    int total;
    public Customer(String id, int total){
        this.id=id;
        this.total=total;
    }
    public Customer(){
        this("0000",0000);
    }

    public void print(){
        int discount=(total/1000)*100;
        System.out.println(id+"\t"+total+"\t"+(total-discount));
    }
}
