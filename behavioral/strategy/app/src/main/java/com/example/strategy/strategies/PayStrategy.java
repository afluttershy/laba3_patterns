package com.example.strategy.strategies;


//Общий интерфейс стратегий оплаты
public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
