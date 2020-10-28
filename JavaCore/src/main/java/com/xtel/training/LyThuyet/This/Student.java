package com.xtel.training.LyThuyet.This;

class Student2 {
    int id;
    String name;

    // phương thức insertRecord
    void insertRecord(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // phương thức displayInformation
    void displayInformation() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        Student2 s1 = new Student2();
        Student2 s2 = new Student2();

        s1.insertRecord(111, "Viet");
        s2.insertRecord(222, "Tuts");

        s1.displayInformation();
        s2.displayInformation();

    }
}