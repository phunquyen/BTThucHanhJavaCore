package com.xtel.training.LyThuyet.JavaOOP.Inheritance;

public class MainApplication {
    public static void main(String[] args) {
       Cat cat = new Cat();
        cat.Meo();
        cat.eat();

        Dog dog = new Dog();
        dog.Bark();
        dog.eat();

        BabyDog babyDog = new BabyDog();
        babyDog.Weep();
        babyDog.Bark();
        babyDog.eat();

    }
}
