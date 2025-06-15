package com.example.javastudy;

import com.example.javastudy.thread.BankAccount;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaStudyApplication implements BankAccount {

    public static void main(String[] args) {
        SpringApplication.run(JavaStudyApplication.class, args);


    }

    @Override
    public boolean withdraw(int amount) {
        return false;
    }
    
    public boolean withdraw(String amount) {
        return false;
    }

    @Override
    public int getBalance() {
        return 0;
    }
}
