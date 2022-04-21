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

    public String displayCommands() {
        StringBuilder builder = new StringBuilder();
        builder.append("Commands\n\t");
        builder.append("Create [customer name] [pickup time] [pizza 1 ID] <Optional [pizza 2 ID] [pizza 3 ID]...>\n\t");
        builder.append("Delete [orderID]\n\t");
        builder.append("menu\n\t");
        builder.append("orders\n\t");
        builder.append("commands\n\t");
        builder.append("exit");
        return builder.toString();
    }



    public void start() {
        menu = initializeMenu.menu();
    }
}
