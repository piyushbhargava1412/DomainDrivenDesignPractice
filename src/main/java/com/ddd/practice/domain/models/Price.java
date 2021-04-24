package com.ddd.practice.domain.models;

import lombok.ToString;
import java.util.Currency;

@ToString
public class Price {
    private final Double amount;
    private final Currency currency;

    public Price(Double amount, Currency currency) {
        this.amount = getDiscountedPrice(amount);
        this.currency = currency;
    }

    private Double getDiscountedPrice(Double baseAmount) {
        return baseAmount * 0.9;
    }
}
