package com.ddd.practice.domain.models;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Product {
  private final String name;
  private final Price price;

  public Product(String name, Price price) {
    this.name = name;
    this.price = price;
  }
}
