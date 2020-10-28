package com.xtel.training.LyThuyet.Equal;

public class Equal {
    public static void main(String[] args) {
        String string1 = new String("com.xtel.training.LyThuyet.This is a string");
        String string2  = new String("com.xtel.training.LyThuyet.This is a string");

        System.out.println("string1 == string2: " + (string1 == string2));
        System.out.println("string1.equal(String2): " + (string1.equals(string2)));
    }
}
