package com.ddd.practice.domain.models;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Item {
  private final Product product;
  private final int quantity;

  public Item(Product product, int quantity) {
    this.product = product;
    this.quantity = quantity;
  }
}
