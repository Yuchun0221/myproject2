package com.yu.ticketpratice;

public class Station {
    public static final Station TAIPEI = new Station(100,"Taipei");
    public static final Station TAICHUNG = new Station(200,"Taichung");
    public static final Station KAOHSIUND = new Station(300,"Kaohsung");
    int id;
    String name;
    public Station(int id, String name){
        this.id = id;
        this.name = name;
    }
}
