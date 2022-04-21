package com.company;

import java.util.*;

public class Controller {
    Scanner scanner = new Scanner(System.in);
    Creator creator = new Creator();
    UI ui = new UI();
    public String readLine() {
        System.out.print(">> ");
        return scanner.nextLine();
    }

    public void createOrder(String[] command) {
        String customerName = command[0];
        String pickupTime = command[1];
        String[] pizzaIDs = Arrays.copyOfRange(command, 2, command.length);
        ArrayList<Pizza> pizzas = new ArrayList<>();
        for (String id : pizzaIDs) {
            pizzas.add(creator.menu.get(Integer.parseInt(id)));
        }
        creator.orders.addOrder(new Order(customerName, creator.orders.orderList.size()+1, pickupTime, pizzas));
        ui.successfulOrderCreation(customerName, pickupTime);
    }

    public void deleteOrder(String[] command) {
        int orderID = Integer.parseInt(command[0]);
        Order toDelete = creator.orders.orderList.stream().filter(order -> order.getOrderID() == orderID).findFirst().get();
        creator.orders.removeOrder(toDelete);
        ui.successfulOrderDeletion(toDelete.getCustomerName(), orderID);
    }

    public void commandHandler(String[] command) {
        switch (command[0]) {
            case "create" -> {createOrder(Arrays.copyOfRange(command, 1, command.length));}
            case "delete" -> {deleteOrder(Arrays.copyOfRange(command, 1, command.length));}
            case "menu" -> {
                ui.printMenu(creator.menu());
            }
            case "orders" -> {
                if (creator.orders.orderList.size() > 0){
                    ui.displayOrders(creator.orders);
                }
            }
            case "commands" -> {
                ui.displayCommands(creator.commands());
            }
            case "exit" -> {
                System.exit(1);
            }
            default -> {
                ui.badCommands();
            }
        }
    }


    public void run() {
        creator.start();
        boolean isRunning = true;
        ui.displayCommands(creator.commands());
        while (isRunning) {
            String command = readLine();
            commandHandler(command.split(" "));
        }
    }
}



