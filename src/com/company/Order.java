package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class Order {
    private String customerName;
    private UUID orderID;
    private Date date;
    private ArrayList<Pizza> content;

    public Order(String customerName, UUID id, Date date, ArrayList<Pizza> content) {
        this.customerName = customerName;
        this.orderID = id;
        this.date = date;
        this.content = content;
    }

    public ArrayList<Pizza> getContent() {
        return this.content;
    }

    public String pizzasToString() {
        StringBuilder builder = new StringBuilder();
        content.stream().forEach(pizza -> builder.append(pizza.getId() + (pizza == content.get(content.size()-1) ? "" : " ")));
        return builder.toString();
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public UUID getOrderID() {
        return this.orderID;
    }

    public Date getDate() {
        return this.date;
    }


    private String contentAsString() {
        StringBuilder builder = new StringBuilder();
        content.stream().forEach(pizza -> builder.append(pizza.toString("\n\t\t\t") + (content.size() > 1 && pizza != content.get(content.size()-1) ? "\n\t\t" : "")));
        return builder.toString();
    }

    @Override
    public String toString() {
        return String.format("%s\n\tOrdrenummer: %s\n\nTime: %s\n\tPizza(s):\n\t\t%s", customerName, orderID, date, contentAsString());
    }
}
