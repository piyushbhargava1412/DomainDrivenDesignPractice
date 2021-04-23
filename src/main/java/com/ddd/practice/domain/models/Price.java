package com.ddd.practice.domain.models;

import java.util.Currency;

public class Price {
    private final Double amount;
    private final Currency currency;

    public Price(Double amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }
}
