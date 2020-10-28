package com.xtel.training.LyThuyet.JavaOOP.Clone;

public class Student implements Cloneable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String args[]) {
        try {
            Student s1 = new Student(1998, "Phu");
            Student s2 = (Student) s1.clone();
            System.out.println(s1.id + " " + s1.name);
            System.out.println(s2.id + " " + s2.name);
        } catch (CloneNotSupportedException c) {
        }
    }
}