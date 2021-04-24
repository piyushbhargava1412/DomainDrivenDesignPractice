package com.ddd.practice.misc;

import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.UUID;

@Data
@ToString
public class Customer {
  private UUID customerId;
  private List<Account> accounts;
  private Address address;

  public Customer(List<Account> accounts, Address customerAddress) {
    this.customerId = UUID.randomUUID();
    this.accounts = accounts;
    this.address = customerAddress;
  }

  public void updateAddress(Address newAddress) {
    this.address = newAddress;
    this.accounts.forEach(account -> account.updateAddress(newAddress));
  }
}
