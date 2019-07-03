package com.example.dagger2demo;

import javax.inject.Inject;

// Created by Dinesh Kumar on 7/3/2019
public class Person {
    public String name;
    public int age;
    public Address address;
    public ParentDetail parentDetail;

    @Inject
    public Person(Address address, ParentDetail parentDetail) {
        this.name = "Nilesh Mishra";
        this.age = 36;
        this.address = address;
        this.parentDetail = parentDetail;
    }
}
