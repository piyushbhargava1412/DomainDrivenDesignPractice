package com.ddd.practice.domain.models;

import lombok.Getter;
import lombok.ToString;
import java.util.Currency;

@ToString
@Getter
public class Price {
    private final Double amount;
    private final Currency currency;

    public Price(Double marketPriceAmount, Currency currency) {
        this.amount = getDiscountedPrice(marketPriceAmount);
        this.currency = currency;
    }

    public Price(Price marketPrice) {
        this.amount = getDiscountedPrice(marketPrice.getAmount());
        this.currency = marketPrice.getCurrency();
    }

    private Double getDiscountedPrice(Double baseAmount) {
        return baseAmount * 0.9;
    }

    public Price getDiscountedPrice(double discountRate) {
        return new Price(amount*(1 - discountRate), currency);
    }
}
