package org.example.n3exercici1;

import org.example.n3exercici1.currencies.*;
import org.example.n3exercici1.demoClasses.Item;
import org.example.n3exercici1.demoClasses.PriceDisplay;

public class Main {
    public static void main (String[] args) {
        PriceDisplay priceDisplay = new PriceDisplay();
        priceDisplay.addCurrency(new USDollarConverter());
        priceDisplay.addCurrency(new MXNPesoConverter());

        priceDisplay.addItem(new Item("Item 1", 11.1f));
        priceDisplay.addItem(new Item("Item 2", 22.2f));
        priceDisplay.addItem(new Item("Item 3", 33.3f));
        priceDisplay.addItem(new Item("Item 4", 44.4f));
        priceDisplay.addItem(new Item("Item 5", 55.5f));

        priceDisplay.display();
    }


}
