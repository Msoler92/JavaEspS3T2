package org.example.n3exercici1.currencies;

public abstract class CurrencyConverter {
    private final float CONVERSION_FACTOR;
    private final String NAME;
    protected CurrencyConverter(String NAME, float CONVERSION_FACTOR) {
        this.NAME = NAME;
        this.CONVERSION_FACTOR = CONVERSION_FACTOR;
    }
    public String getName() {
        return NAME;
    }
    public float convert(float amount) {
        return amount * CONVERSION_FACTOR;
    }
}
