package com.ddd.practice.domain.models;

import lombok.ToString;

import java.util.List;

@ToString
public class Order {
    private List<Product> products;
    private double totalAmount;

    public Order(List<Product> products) {
        this.products = products;
        this.totalAmount = calculateOrderValue();
    }

    private double calculateOrderValue() {
        double totalProductPrice = 0;
        double totalWeight = 0;
        for (Product product : products) {
            totalProductPrice += product.getPrice().getAmount();
            totalWeight += product.getWeightInGrams();
        }
        return totalProductPrice + (0.01 * totalWeight);
    }
}
