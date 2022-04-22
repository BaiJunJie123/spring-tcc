package com.bank1.ceshi;

import org.springframework.beans.factory.annotation.Value;

public class Customer {

    @Value("${customer.name}")
    public String name;

    @Value("${customer.address}")
    public Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
