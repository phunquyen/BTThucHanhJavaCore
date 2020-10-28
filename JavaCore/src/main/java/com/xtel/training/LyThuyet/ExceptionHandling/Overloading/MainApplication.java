package com.xtel.training.LyThuyet.ExceptionHandling.Overloading;

public class MainApplication {
    public static void main(String[] args) {
        System.out.println(Add.add(21,11));
        System.out.println(Add.add(21,01, 98));

        System.out.println(AddDouble.add1(21,01));
        System.out.println(AddDouble.add1(21.1,0.1, 9.8));
    }
}
