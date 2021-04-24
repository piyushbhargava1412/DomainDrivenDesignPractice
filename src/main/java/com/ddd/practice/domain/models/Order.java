package com.ddd.practice.domain.models;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@ToString
public class Order {
    private List<Product> products;
}
