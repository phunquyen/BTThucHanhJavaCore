package com.xtel.training.LyThuyet.BTArray;

import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        int max = 0;
        System.out.print("Enter n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numberInt = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter numberInt: ");
            numberInt[i] = scanner.nextInt();
            do{
                System.out.println("Enter again!. Enter numberInt:");
                numberInt[i] = scanner.nextInt();
            }
            while (numberInt[i] < 0);
            if (numberInt[i] > max) {
                max = numberInt[i];
            }
        }
        System.out.println("max = " + max);
    }
}
