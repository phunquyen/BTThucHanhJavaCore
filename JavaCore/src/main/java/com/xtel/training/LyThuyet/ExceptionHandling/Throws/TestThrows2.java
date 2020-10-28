package com.xtel.training.LyThuyet.ExceptionHandling.Throws;

import java.io.IOException;

class Test {
    void method() throws IOException {
        throw new IOException("Loi thiet bi");
    }
}

public class TestThrows2 {
    public static void main(String args[]) {
        try {
            Test m = new Test();
            m.method();
        } catch (Exception e) {
            System.out.println("Ngoai le duoc xu ly");
        }

        System.out.println("Luong binh thuong.");
    }
}
