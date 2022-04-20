package com.company;

import java.io.IOException;
import java.util.*;

public class Controller {
    Scanner scanner = new Scanner(System.in);
    Creator engine = new Creator();
    FileHandler handler = new FileHandler();

    public String readLine() {
        return scanner.nextLine();
    }

    public void run() {

        engine.start();
        engine.orders.addOrder(new Order("Stefan", UUID.randomUUID(), new Date(), new ArrayList<Pizza>(Arrays.asList(engine.menu.get(0)))));
        engine.orders.addOrder(new Order("Stefan", UUID.randomUUID(), new Date(), new ArrayList<Pizza>(Arrays.asList(engine.menu.get(0), engine.menu.get(1)))));

        try {
            //handler.removeLine("Hello world");
            handler.write(engine.orders);
        } catch (IOException e) {
            System.out.println("Something went wrong");
        }
        System.out.println(engine.orders);
        //boolean isRunning = true;
//        while (isRunning) {
//
//        }
    }
}
