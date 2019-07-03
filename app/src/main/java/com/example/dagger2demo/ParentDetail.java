package com.example.dagger2demo;

import javax.inject.Inject;

// Created by Dinesh Kumar on 7/3/2019
public class ParentDetail {
    public String fname;
    public int fage;

    @Inject
    public ParentDetail() {
        this.fname = "Abc";
        this.fage = 55;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public int getFage() {
        return fage;
    }

    public void setFage(int fage) {
        this.fage = fage;
    }
}
