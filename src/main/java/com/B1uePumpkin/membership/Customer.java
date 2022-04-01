package com.B1uePumpkin.membership;

public class Customer {
    String id;
    int total;
    int off=100;
    int back=0;
    public Customer(String id, int total){
        this.id=id;
        this.total=total;
    }
    public Customer(){

        this("0000",0000);
    }
    public float discount(){
        return (total/1000)*off;
    }
    public void print(){
        System.out.println(id+"\t"+total+"\t"+(total-discount()));
    }
}
