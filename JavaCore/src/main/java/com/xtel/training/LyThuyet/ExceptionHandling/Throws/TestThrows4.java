package com.xtel.training.LyThuyet.ExceptionHandling.Throws;

import java.io.IOException;

class Test2 {
    void method() throws IOException {
        throw new IOException("Thiet bi");
    }
}

public class TestThrows4 {
    public static void main(String args[]) throws IOException {
        Test2 m = new Test2();
        m.method();
        System.out.println("Luong binh thuong...");
    }
}