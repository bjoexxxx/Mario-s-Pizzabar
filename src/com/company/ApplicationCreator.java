package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

public class ApplicationCreator {
    private InitializeMenu initializeMenu = new InitializeMenu();
    private ArrayList<Pizza> menu;
    private OrderController orders = new OrderController();


    public String menu() {
        StringBuilder builder = new StringBuilder("");
        menu.stream().forEach(pizza -> builder.append(pizza.toString("\n\t") + "\n"));
        return builder.toString();
    }

    public ArrayList<Pizza> getPizzasFromString(String[] strArr) {
        ArrayList<Pizza> pizzas = new ArrayList<>();
        Arrays.stream(strArr).forEach(id -> pizzas.add(menu.get(Integer.parseInt(id)-1)));
        return pizzas;
    }

    public boolean makeOrder(String customerName, String pickupTime, String[] pizzaIDs) {
        ArrayList<Pizza> pizzas = getPizzasFromString(pizzaIDs);
        String uuid = UUID.randomUUID().toString().substring(0, 4);
        orders.addOrder(new Order(customerName, uuid, pickupTime, pizzas));
        return true;
    }

    public String deleteOrder(String orderID) {
        Order toDelete = orders.orderList.stream().filter(order -> order.getOrderID().equals(orderID)).findFirst().get();
        orders.removeOrder(toDelete);
        return toDelete.getCustomerName();
    }

    public String orders() {
        return orders.toString();
    }

    public String commands() {
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



    public void setMenu() {
        menu = initializeMenu.menu();
    }
}
