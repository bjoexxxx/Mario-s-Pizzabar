package com.company;

import java.util.*;

public class ApplicationController {
    private Scanner scanner = new Scanner(System.in);
    private ApplicationCreator creator = new ApplicationCreator();
    private UI ui = new UI();
    private boolean isRunning = true;
    public String readLine() {
        System.out.print(">> ");
        return scanner.nextLine();
    }

    public void createOrder(String[] command) {
        String customerName = command[0];
        String pickupTime = command[1];
        String[] pizzaIDs = Arrays.copyOfRange(command, 2, command.length);
        boolean response = creator.makeOrder(customerName, pickupTime, pizzaIDs);
        if (response) ui.successfulOrderCreation(customerName, pickupTime);
    }

    public void deleteOrder(String[] command) {
        int orderID = Integer.parseInt(command[0]);
        String customerName = creator.deleteOrder(orderID);
        ui.successfulOrderDeletion(customerName, orderID);
    }

    public void stopApplication() {
        isRunning = false;
    }

    public void commandHandler(String[] command) {
        switch (command[0]) {
            case "create" -> {createOrder(Arrays.copyOfRange(command, 1, command.length));}
            case "delete" -> {deleteOrder(Arrays.copyOfRange(command, 1, command.length));}
            case "menu" -> {ui.printMenu(creator.menu());}
            case "orders" -> {
                if (!creator.orders().isBlank()){
                    ui.displayOrders(creator.orders());
                }
            }
            case "commands" -> {ui.displayCommands(creator.commands());}
            case "exit" -> {stopApplication();}
            default -> {ui.badCommands();}
        }
    }


    public void run() {
        creator.setMenu();
        ui.displayCommands(creator.commands());
        while (isRunning) {
            String command = readLine();
            commandHandler(command.split(" "));
        }
    }
}


