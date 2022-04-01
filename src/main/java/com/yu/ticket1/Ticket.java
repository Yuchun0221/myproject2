package com.yu.ticket1;

public class Ticket {
    public static final int TAIPEI_STATION=100;
    public static final int TAICHUNG_STATION=200;
    public static final int KAOHSIUNG_STATION=300;

    Station start;
    Station end;
    float off=0.1f;
    int price;
    public Ticket(Station start,Station end) {
        this.start = start;
        this.end = end;
        if (start == Station.TAIPEI_STATION) {
            if (end == Station.TAICHUNG_STATION) {
                price = 600;
            } else {
                price = 1500;
            }
        }
        if (start == Station.TAICHUNG_STATION) {
            if (end == Station.KAOHSIUNG_STATION) {
                price = 900;
            } else {
                price = 600;
            }
        }
        if (start == Station.KAOHSIUNG_STATION) {
            if (end == Station.TAICHUNG_STATION) {
                price = 900;
            } else {
                price = 1500;
            }
        }
    }public void print(){
        System.out.println(start.name+"\t"+end.name+"\t"+price);
    }
}

