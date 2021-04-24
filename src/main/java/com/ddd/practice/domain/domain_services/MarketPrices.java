package com.ddd.practice.domain.domain_services;

import com.ddd.practice.domain.models.Price;

import java.util.Currency;
import java.util.HashMap;
import java.util.Map;

public class MarketPrices {
    private static final Map <String, Price> marketPriceList = new HashMap<>();
    private static double DISCOUNT_PERCENTAGE = 0.1;

    static {
        MarketPrices.addProductPrice("IPad Pro", new Price(50000.0, Currency.getInstance("INR")));
        MarketPrices.addProductPrice("Hero ink Pen", new Price(5.0, Currency.getInstance("INR")));
        MarketPrices.addProductPrice("GM Cricket bat", new Price(2500.0, Currency.getInstance("INR")));
    }

    public static void addProductPrice(String productName, Price marketPrice) {
        marketPriceList.put(productName, marketPrice);
    }

    public static Price getDiscountedPriceFor(String productName) {
        return marketPriceList.get(productName).getDiscountedPrice(DISCOUNT_PERCENTAGE);
    }
}
