package com.ddd.practice.domain.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@EqualsAndHashCode
@ToString
public class Cart {
    private final UUID id;
    private final List<Item> items;
    private final List<Product> deletedProducts;
    private boolean isCheckedOut;

    public Cart() {
        this.id = UUID.randomUUID();
        this.items = new ArrayList<>();
        this.deletedProducts = new ArrayList<>();
        this.isCheckedOut = false;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
        deletedProducts.add(item.getProduct());
    }

    public List <Product> checkout() {
        this.isCheckedOut = true;
        List <Product> productList = new ArrayList<>();
        items.forEach(item -> {
            for(int i = 0; i < item.getQuantity(); i++) {
                productList.add(item.getProduct());
            }
        });
        return productList;
    }
}
