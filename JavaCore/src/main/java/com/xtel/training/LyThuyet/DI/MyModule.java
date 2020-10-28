package com.xtel.training.LyThuyet.DI;

public class MyModule {
    private static Connect oracle = new Oracle();

    public static void main(String[] args) {
        oracle.connect();
    }
}
