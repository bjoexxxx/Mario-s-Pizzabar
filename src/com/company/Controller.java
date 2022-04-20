package com.company;

import java.io.IOException;
import java.util.*;

public class Controller {
    Scanner scanner = new Scanner(System.in);
    Creator creator = new Creator();

    public String readLine() {
        return scanner.nextLine();
    }

    public void createOrder() {
        creator.orders.addOrder(new Order("Stefan", UUID.randomUUID(), new Date(), new ArrayList<Pizza>(Arrays.asList(creator.menu.get(0)))));
    }

    public void deleteOrder() {

    }

    public void commandHandler(String command) {
        switch (command) {
            case "create" -> {createOrder();}
            case "delete" -> {deleteOrder();}
            case "menu" -> {
                System.out.println(creator.displayMenu());}
            case "orders" -> {
                System.out.println(creator.orders);
            }
        }
    }

    public void run() {

        creator.start();
        creator.orders.addOrder(new Order("Stefan", UUID.randomUUID(), new Date(), new ArrayList<Pizza>(Arrays.asList(creator.menu.get(0), creator.menu.get(1)))));

        //System.out.println(creator.orders);
        boolean isRunning = true;
        while (isRunning) {
            String command = readLine();
            commandHandler(command);
        }
    }
}
