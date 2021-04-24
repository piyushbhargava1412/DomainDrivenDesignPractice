package com.ddd.practice.application;

import com.ddd.practice.domain.domain_services.OrderService;
import com.ddd.practice.domain.models.Cart;
import com.ddd.practice.domain.models.Item;
import com.ddd.practice.domain.domain_services.MarketPrices;
import com.ddd.practice.domain.models.Order;
import com.ddd.practice.domain.models.Product;
import com.ddd.practice.misc.Account;
import com.ddd.practice.misc.Address;
import com.ddd.practice.misc.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class Application implements CommandLineRunner {

  private final Cart cart;
  private final OrderService orderService;

  public Application() {
    this.cart = new Cart();
    this.orderService = new OrderService();
  }

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @Override
  public void run(String... args) {

    Item item1 = new Item(new Product("IPad Pro", MarketPrices.getDiscountedPriceFor("IPad Pro"), 1), 1);
    Item item2 = new Item(new Product("Hero ink Pen", MarketPrices.getDiscountedPriceFor("Hero ink Pen"), 1), 1);
    Item item3 = new Item(new Product("GM Cricket bat", MarketPrices.getDiscountedPriceFor("GM Cricket bat"), 1), 2);

    cart.addItem(item1);
    cart.addItem(item2);
    cart.addItem(item3);
    System.out.println(cart);

    //    cart.removeItem(item1);
    //    cart.removeItem(item2);
    //    cart.getDeletedProducts().forEach(product -> System.out.println(product.getName()));

    Order order = orderService.checkoutCart(cart);
    System.out.println(order);

//    Customer customer = new Customer(Arrays.asList(new Account(new Address("Hyderabad"))),new Address("Hyderabad"));
//    customer.updateAddress(new Address("Agra"));
//    System.out.println(customer);
  }
}
