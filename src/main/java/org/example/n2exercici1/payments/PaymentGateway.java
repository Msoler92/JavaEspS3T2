package org.example.n2exercici1.payments;

public class PaymentGateway {
    public void executePayment(Payment paymentMethod, float amount) {
        paymentMethod.pay(amount);
    }
}
