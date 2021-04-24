package com.ddd.practice.domain.models;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Product {
  private final String name;
  private final Price price;
  private final double weightInGrams;

  public Product(String name, Price price, double weightInGrams) {
    this.name = name;
    this.price = price;
    this.weightInGrams = weightInGrams;
  }
}
