package com.yu.sale;

public class Customer1 {
    String id;
    int amount;
    float off=0.1f;
    float Pback=0.2f;
    public Customer1(String id,int amount){
        this.id=id;
        this.amount=amount;
    }
    public float backMoney() {
        return (amount/1000)*off*1000;
    }

    public void print(){
        System.out.println(id + "\t" + amount + "\t" +
                (amount-backMoney()));
    }
}
