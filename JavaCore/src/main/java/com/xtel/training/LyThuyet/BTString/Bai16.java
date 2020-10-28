package com.xtel.training.LyThuyet.BTString;

import java.util.Scanner;

public class Bai16 {
    public static void main(String[] args) {
        System.out.print("Moi nhap chuoi");
        Scanner scanner = new Scanner(System.in);
        String chuoi = scanner.nextLine();
        System.out.println("Nhap ky tu kiem tra");
        char kyTu = scanner.nextLine().charAt(0);

        char[] mangKyTu = chuoi.toCharArray();
        boolean tonTai = false;
        for (int i = 0; i < mangKyTu.length; i++) {
            if (kyTu == mangKyTu[i]) {
                System.out.println("Co");
                tonTai = true;
            }
        }
        if (tonTai = false)
            System.out.println("Khong");
    }
}
