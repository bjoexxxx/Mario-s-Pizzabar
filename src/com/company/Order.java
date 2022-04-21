package com.company;

import java.util.ArrayList;

public class Order {
    private String customerName;
    private int orderID;
    private String date;
    private ArrayList<Pizza> content;

    public Order(String customerName, int id, String date, ArrayList<Pizza> content) {
        this.customerName = customerName;
        this.orderID = id;
        this.date = date;
        this.content = content;
    }


    public String getCustomerName() {
        return this.customerName;
    }

    public int getOrderID() {
        return this.orderID;
    }


    private String contentAsString() {
        StringBuilder builder = new StringBuilder();
        content.stream().forEach(pizza -> builder.append(pizza.toString("\n\t\t\t") + "\n\t\t"));
        return builder.toString();
    }

    @Override
    public String toString() {
        return String.format("%s\n\tOrderID: %s\n\tPickup time: %s\n\tPizza(s):\n\t\t%s", customerName, orderID, date, contentAsString());
    }
}
