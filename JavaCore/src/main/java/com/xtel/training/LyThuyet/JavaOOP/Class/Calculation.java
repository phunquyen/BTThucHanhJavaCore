package com.xtel.training.LyThuyet.JavaOOP.Class;

public class Calculation {
    void fact(int n) {
        int giaiThua = 1;
        for (int i = 1; i <= n; i++) {
            giaiThua *= i;
        }
        System.out.println("giai thua cua" + n + "la" + giaiThua);
    }

    public static void main(String[] args) {
        new Calculation().fact(5);
    }
}
