package org.example.n2exercici1.store;

import org.example.n2exercici1.payments.Payment;
import org.example.n2exercici1.payments.PaymentGateway;

import java.util.HashMap;

public class ShoeShop {
    private HashMap<Integer, Shoe> stock;
    private int idCounter;

    public ShoeShop() {
        stock = new HashMap<>();
        idCounter = 1;
    }
    public void addStock(float price) {
        stock.put(idCounter, new Shoe(price));
        idCounter++;
    }
    public void processPurchase(int productId, Payment paymentMethod) {
        PaymentGateway paymentGateway = new PaymentGateway();
        paymentGateway.executePayment(paymentMethod, stock.get(productId).getPrice());
        stock.remove(productId);
        System.out.println("Purchase of product with id " + productId + " complete.");
    }
}
