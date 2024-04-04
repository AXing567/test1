package com.axing.StudentManagementSystem;

import static com.axing.StudentManagementSystem.App.verificationCode;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(verificationCode());
        }
    }

}
