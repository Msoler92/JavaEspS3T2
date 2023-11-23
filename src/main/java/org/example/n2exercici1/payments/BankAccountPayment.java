package org.example.n2exercici1.payments;

public class BankAccountPayment implements Payment {
    public void pay(float amount) {
        System.out.println("Processing bank account payment");
    }
}
