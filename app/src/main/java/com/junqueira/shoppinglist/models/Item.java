package com.junqueira.shoppinglist.models;

import java.io.Serializable;

public class Item implements Serializable {
    private String name;
    private int amount;
    private String details;

    public Item(String name, int amount, String details) {
        this.name = name;
        this.amount = amount;
        this.details = details;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
