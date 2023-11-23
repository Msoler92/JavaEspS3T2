package org.example.n3exercici1.demoClasses;

import org.example.n3exercici1.currencies.CurrencyConverter;

import java.util.ArrayList;


public class PriceDisplay {
    private ArrayList<Item> items;
    private ArrayList<CurrencyConverter> currencies;
    public PriceDisplay () {
        items = new ArrayList<>();
        currencies = new ArrayList<>();
    }
    public void addItem(Item item) {
        items.add(item);
    }
    public void addCurrency(CurrencyConverter currency) {
        currencies.add(currency);
    }
    public void display() {
        StringBuilder sb = new StringBuilder();
        sb.append("ITEMS");
        currencies.forEach(currency -> sb.append(" - ").append(currency.getName()));
        System.out.println(sb);
        for(Item item: items) {
            sb.setLength(0);
            sb.append(item.getName());
            currencies.forEach(currency -> sb.append(" - ").append(currency.convert(item.getPrice())));
            System.out.println(sb);
        }
    }
}
