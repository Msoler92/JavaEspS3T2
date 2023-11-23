package org.example.n3exercici1.currencies;

public class USDollarConverter extends CurrencyConverter{
    private static final String NAME = "USD";
    private static final float CONVERSION_FACTOR = 1.09f;

    public USDollarConverter() {
        super(NAME, CONVERSION_FACTOR);
    }

}
