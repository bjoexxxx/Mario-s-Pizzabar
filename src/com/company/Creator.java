package com.company;

import java.util.ArrayList;

public class Creator {
    InitializeMenu initializeMenu = new InitializeMenu();
    ArrayList<Pizza> menu;
    OrderController orders = new OrderController();


    public String displayMenu() {
        StringBuilder builder = new StringBuilder("");
        menu.stream().forEach(pizza -> builder.append(pizza.toString("\n\t") + "\n"));
        return builder.toString();
    }

    public void addToOrder(Order order) {
        orders.addOrder(order);
    }

    public void removeOrder(Order order) {
        orders.removeOrder(order);
    }



    public void start() {
        menu = initializeMenu.menu();
    }
}
