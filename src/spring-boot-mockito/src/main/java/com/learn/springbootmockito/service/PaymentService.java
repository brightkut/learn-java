package com.learn.springbootmockito.service;

public class PaymentService {
    private int allPayment = 0;

    public int buy(int money) {
        allPayment += money;

        return allPayment;
    }

    public String sell(int money, String name) {
        return "sell";
    }
}
