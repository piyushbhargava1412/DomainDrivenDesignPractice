package com.ddd.practice.domain.models;

import lombok.Getter;
import lombok.ToString;
import java.util.Currency;

@ToString
@Getter
public class Price {
    private final Double amount;
    private final Currency currency;

    public Price(Double amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Price getDiscountedPrice(double discountRate) {
        return new Price(amount*(1 - discountRate), currency);
    }
}
