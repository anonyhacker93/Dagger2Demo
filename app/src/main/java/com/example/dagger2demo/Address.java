package com.example.dagger2demo;

import javax.inject.Inject;

// Created by Dinesh Kumar on 7/3/2019
public class Address {
    public String cityName;
    public int pinCode;

    @Inject
    public Address() {
        this.cityName = "Yadon ka sahar";
        this.pinCode = 123123;
    }
}
