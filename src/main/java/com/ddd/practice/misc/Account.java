package com.ddd.practice.misc;

import lombok.ToString;

import java.util.UUID;

@ToString
public class Account {
  private final UUID id;
  private Address address;

  public Account(Address address) {
    this.id = UUID.randomUUID();
    this.address = address;
  }

  protected void updateAddress(Address newAddress) {
    this.address = newAddress;
  }
}
