package com.xtel.training.LyThuyet.ExceptionHandling.TryCatch;

public class Calculate {
    public static void main(String[] args) {
        try {
            int data = 50/0;
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("rest of the code.");
    }
}
