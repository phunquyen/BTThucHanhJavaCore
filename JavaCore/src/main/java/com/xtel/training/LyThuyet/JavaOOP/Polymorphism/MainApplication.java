package com.xtel.training.LyThuyet.JavaOOP.Polymorphism;

public class MainApplication {
    public static void main(String[] args){
        Shape shape = new Shape();
        shape.show();

        shape = new Rectangle();
        shape.show();

        shape = new Square();
        shape.show();
    }
}
