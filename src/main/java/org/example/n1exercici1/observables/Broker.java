package org.example.n1exercici1.observables;

import org.example.n1exercici1.observers.Observer;

import java.util.ArrayList;

public class Broker {
    private float stockValue;
    private ArrayList<Observer> observers;

    public Broker (float stockValue) {
        observers = new ArrayList<>();
        this.stockValue = stockValue;
    }

    public void updateStockValue(float amount) {
        stockValue += amount;
        notifyObservers(amount);
    }
    public void subscribe(Observer o) {
        observers.add(o);
    }
    public void unsubscribe(Observer o) {
        observers.remove(o);
    }

    private void notifyObservers(float amount) {
        observers.forEach(o -> o.update(amount, stockValue));
    }
}
