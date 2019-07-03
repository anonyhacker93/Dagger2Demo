package com.example.dagger2demo;

// Created by Dinesh Kumar on 7/3/2019

import dagger.Component;

@Component
public interface PersonComponent {
    Person getPerson();
    Address getAddress();
    ParentDetail getParentDetails();
}
