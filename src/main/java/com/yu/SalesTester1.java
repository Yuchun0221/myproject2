package com.yu;

public class SalesTester1 {
    public static void main(String[] args) {
        Customer1 c1=new Customer1("0001",1200);
        Customer1 c2=new Customer1("0002",1000);
        SilverCustomer1 c3=new SilverCustomer1("0003",5000);
        GoldenCustomer1 c4=new GoldenCustomer1("0004",5000);
        c1.print();
        c2.print();
        c3.print();
        c4.print();
    }
}