package com.company;

public class UI {

    public void successfulOrderCreation(String name, String pickupTme) {
        System.out.println(String.format(">> Created an order for %s at time %s", name, pickupTme));
    }

    public void successfulOrderDeletion(String name, String orderID) {
        System.out.println(String.format(">> Deleted order for %s - order number: %s", name, orderID));
    }
    public void badCommands() {
        System.out.println("Bad command!");
    }

    public void printMenu(String menu) {
        System.out.println(menu);
    }

    public void displayOrders(String orders) {
        System.out.println(orders);
    }
    public void displayCommands(String commands) {
        System.out.println(commands);
    }

    public void noCurrentOrders() {
        System.out.println("There are no current orders!");
    }
}
