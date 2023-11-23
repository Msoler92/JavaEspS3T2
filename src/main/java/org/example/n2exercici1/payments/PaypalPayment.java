package org.example.n2exercici1.payments;

public class PaypalPayment implements Payment {
    public void pay(float amount) {
        System.out.println("Processing Paypal payment");
    }
}
