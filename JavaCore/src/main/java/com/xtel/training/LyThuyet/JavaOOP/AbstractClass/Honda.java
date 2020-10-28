package com.xtel.training.LyThuyet.JavaOOP.AbstractClass;

public class Honda extends Bike {
    void run(){
        System.out.println("Running");
    }

    public static void main(String[] args) {
        Bike bike = new Honda();
        bike.run();
    }
}
