package com.learn.springbootmockito;

import org.springframework.beans.factory.annotation.Autowired;

public class AccountService {
    @Autowired
    private PaymentService paymentService;

    public String buy(int money) {
        return this.paymentService.buy(money) > 10 ? "rich" : "poor";
    }

    public String sell(int money, String name) {
        return this.paymentService.sell(money, name);
    }
}
