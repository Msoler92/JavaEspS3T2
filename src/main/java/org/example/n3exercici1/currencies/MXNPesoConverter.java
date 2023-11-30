package org.example.n3exercici1.currencies;

public class MXNPesoConverter extends CurrencyConverter {

    private static final String NAME = "MXN";
    private static final float CONVERSION_FACTOR = 18.77f;

    public MXNPesoConverter() {
        super(NAME, CONVERSION_FACTOR);
    }

}

