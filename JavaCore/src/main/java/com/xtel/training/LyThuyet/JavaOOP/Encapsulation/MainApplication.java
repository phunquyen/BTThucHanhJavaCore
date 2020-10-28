package com.xtel.training.LyThuyet.JavaOOP.Encapsulation;

public class MainApplication {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Phu");
        person.setAge(22);

        System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
    }
}
