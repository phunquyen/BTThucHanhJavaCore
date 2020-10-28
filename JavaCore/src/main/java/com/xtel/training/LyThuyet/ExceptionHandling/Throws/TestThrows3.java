package com.xtel.training.LyThuyet.ExceptionHandling.Throws;

import java.io.IOException;

class Test1 {
    void method() throws IOException {
        System.out.println("Thiet bi dang hoat dong tot");
    }
}

public class TestThrows3 {
    public static void main(String args[]) throws IOException {
        Test m = new Test();
        m.method();
        System.out.println("Luong binh thuong...");
    }
}