package com.xtel.training.LyThuyet.JavaOOP.Inheritance;

public class SubClass extends SuperClass{
    int number = 20;
    public void show(){
        System.out.println("com.xtel.training.LyThuyet.This is show() of SubClass");
    }

    public void subClassMethod(){
        SubClass subClass = new SubClass();

        super.show();
        subClass.show();

        System.out.println("SuperClass value: " + super.number);
        System.out.println("SubClass value: " + subClass.number);
    }

    public static void main(String[] args){
        SubClass subClass = new SubClass();
        subClass.subClassMethod();
    }

}
