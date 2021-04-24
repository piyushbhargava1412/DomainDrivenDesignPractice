package com.ddd.practice.application;

import com.ddd.practice.domain.models.Cart;
import com.ddd.practice.domain.models.Item;
import com.ddd.practice.domain.models.Price;
import com.ddd.practice.domain.models.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Currency;

@SpringBootApplication
public class Application implements CommandLineRunner {

  private final Cart cart;
//  private final Cart cart2;

  public Application() {
    this.cart = new Cart();
//    this.cart2 = new Cart();
  }

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @Override
  public void run(String... args) {
    Item item1 =
        new Item(new Product("IPad Pro", new Price(50000.0, Currency.getInstance("INR"))), 1);
    Item item2 =
        new Item(new Product("Hero ink Pen", new Price(5.0, Currency.getInstance("INR"))), 1);
    Item item3 =
        new Item(new Product(" GM Cricket bat", new Price(2500.0, Currency.getInstance("INR"))), 2);

    cart.addItem(item1);
    cart.addItem(item2);
    cart.addItem(item3);

//    cart2.addItem(item1);
//    cart2.addItem(item2);
//    cart2.addItem(item3);

    cart.removeItem(item1);
    cart.removeItem(item2);
    //    cart.getDeletedProducts().forEach(product -> System.out.println(product.getName()));

    //    System.out.println(cart.equals(cart2));

    System.out.println(cart);
  }
}
