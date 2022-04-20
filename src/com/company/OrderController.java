package com.company;

import java.util.ArrayList;

public class OrderController {

    ArrayList<Order> orderList;

    public OrderController() {
        orderList = new ArrayList<>();
    }

    public void removeOrder(Order order) {
        orderList.remove(order);
    }

    public void addOrder(Order order) {
        orderList.add(order);
    }



    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        orderList.stream().forEach(order -> builder.append(order.toString() + "\n"));
        return builder.toString();
    }
}
