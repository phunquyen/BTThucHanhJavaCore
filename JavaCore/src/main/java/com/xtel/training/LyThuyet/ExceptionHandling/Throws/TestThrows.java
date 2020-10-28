package com.xtel.training.LyThuyet.ExceptionHandling.Throws;

import java.io.IOException;

public class TestThrows {
    void method() throws IOException {
        throw new IOException("Loi thiet bi");
    }

    void method2() throws IOException {
        method();
    }

    void test() {
        try {
            method2();
        } catch (Exception e) {
            System.out.println("ngoai le duoc xu ly");
        }
    }

    public static void main(String args[]) {
        TestThrows obj = new TestThrows();
        obj.test();
        System.out.println("luong binh thuong.");
    }
}
