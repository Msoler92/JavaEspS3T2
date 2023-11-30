package org.example.n2exercici1;

import org.example.n2exercici1.payments.BankAccountPayment;
import org.example.n2exercici1.payments.CardPayment;
import org.example.n2exercici1.payments.PaypalPayment;
import org.example.n2exercici1.store.ShoeShop;

public class Main {
    public static void main(String[] args) {
        ShoeShop shop = new ShoeShop();
        shop.addStock(24.99f);
        shop.addStock(9.99f);
        shop.addStock(39.99f);

        shop.processPurchase(1, new CardPayment());
        shop.processPurchase(2, new PaypalPayment());
        shop.processPurchase(3, new BankAccountPayment());
    }
}
