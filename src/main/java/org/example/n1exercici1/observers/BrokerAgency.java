package org.example.n1exercici1.observers;

public class BrokerAgency implements Observer {
    private String name;
    public BrokerAgency(String name) {
        this.name = name;
    }
    public void update(float amount, float newValue) {
        System.out.println(name + " has been informed of an update:\n" +
                "Change: " + amount + "\n" +
                "New value: " + newValue);
    }
}
