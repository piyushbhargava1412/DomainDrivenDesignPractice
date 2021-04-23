package com.ddd.practice.domain.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@EqualsAndHashCode
public class Cart {
    private final UUID id;
    private final List<Item> items;
    private final List<Product> deletedProducts;

    public Cart() {
        this.id = UUID.randomUUID();
        this.items = new ArrayList<>();
        this.deletedProducts = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
        deletedProducts.add(item.getProduct());
    }
}
