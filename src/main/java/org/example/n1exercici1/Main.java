package org.example.n1exercici1;

import org.example.n1exercici1.observables.Broker;
import org.example.n1exercici1.observers.BrokerAgency;

public class Main {
    public static void main(String[] args) {
        Broker broker = new Broker(100);
        BrokerAgency agency1 = new BrokerAgency("Agency 1");
        BrokerAgency agency2 = new BrokerAgency("Agency 2");

        broker.subscribe(agency1);
        broker.subscribe(agency2);

        broker.updateStockValue(5.1f);
        broker.updateStockValue(-2.7f);
    }
}