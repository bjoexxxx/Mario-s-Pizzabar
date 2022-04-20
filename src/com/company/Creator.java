package com.company;

import java.util.ArrayList;

public class Creator {
    InitializeMenu initializeMenu = new InitializeMenu();
    ArrayList<Pizza> menu;
    Orders orders = new Orders();


    public String displayMenu() {
        StringBuilder builder = new StringBuilder("");
        menu.stream().forEach(pizza -> builder.append(pizza.toString("\n\t") + "\n"));
        return builder.toString();
    }

    public void addToOrder(Order order) {
        orders.addOrder(order);
    }

    public void start() {
        menu = initializeMenu.menu();
    }
}
