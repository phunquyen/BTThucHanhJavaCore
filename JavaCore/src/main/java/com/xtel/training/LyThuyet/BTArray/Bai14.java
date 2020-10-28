package com.xtel.training.LyThuyet.BTArray;

import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        int n;
        int[] soNguyen;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        n = sc.nextInt();
        soNguyen = new int[n];
        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter numberInt:");
            soNguyen[i] = sc.nextInt();
        }
        System.out.println("Array: ");
        for (int i = 0; i < n; i++)
            System.out.print(soNguyen[i] + " ");
        //dao nguoc mang
        for (int i = 0; i < n/2; i++)
        {
            int empty;
            empty = soNguyen[i];
            soNguyen[i] = soNguyen[n-i-1];
            soNguyen[n-i-1] = empty;
        }
        System.out.println("\nArray: ");
        for (int i = 0; i < n; i++)
            System.out.print(soNguyen[i] + " ");
    }
}
