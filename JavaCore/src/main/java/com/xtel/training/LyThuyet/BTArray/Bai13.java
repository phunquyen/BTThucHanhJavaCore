package com.xtel.training.LyThuyet.BTArray;

import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        System.out.println("Enter n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numberInt = new int[n];

        int min = 0;
        for(int i = 0; i < n; i++){
            System.out.println("Enter numberInt");
            numberInt[i] = scanner.nextInt();

            if(numberInt[i] < min)
                min = numberInt[i];
        }

        System.out.println("Min = " + min);
    }
}
