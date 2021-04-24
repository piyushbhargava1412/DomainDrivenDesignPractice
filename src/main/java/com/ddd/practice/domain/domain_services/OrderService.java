package com.ddd.practice.domain.domain_services;

import com.ddd.practice.domain.models.Cart;
import com.ddd.practice.domain.models.Order;
import com.ddd.practice.domain.models.Product;

import java.util.List;

public class OrderService {
    public Order checkoutCart(Cart cart){
        //set cart field to checkout
        //getlist of products from the cart
        final List<Product> products = cart.checkout();
        //create and return the order
        return new Order(products);
    }
}
