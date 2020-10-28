package com.xtel.training.LyThuyet.BTArray;

import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        int ketqua = 0;
        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] numberInt = new int[number];

        for (int i = 0; i < number; i++) {
            System.out.println("Enter numberInt: ");
            numberInt[i] = scanner.nextInt();
            ketqua += numberInt[i];
        }

        ketqua = ketqua / number;
        System.out.println(ketqua);
    }
}
