package com.junqueira.shoppinglist.models;

import java.io.Serializable;
import java.util.ArrayList;

public class List implements Serializable {

    private String name;
    private ArrayList<Item> list;

    public List(String name) {
        this.name = name;
        this.list = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Item> getList() {
        return list;
    }

    public void setList(ArrayList<Item> list) {
        this.list = list;
    }

    public void addItem(Item item) {
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(item);
    }
}
