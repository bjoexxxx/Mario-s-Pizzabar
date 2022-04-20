package com.company;

import java.util.ArrayList;

public class InitializeMenu {

    public ArrayList<Pizza> menu() {
        ArrayList<Pizza> menu = new ArrayList<>();
        menu.add(new Pizza("Vesuvio", 1, new String[] {"Tomatsauce", "Ost", "Skinke", "Oregano"}, 57));
        menu.add(new Pizza("Amerikaner", 2, new String[] {"Tomatsauce", "Ost", "Oksefars", "Oregano"}, 53));
        menu.add(new Pizza("Cacciotore", 3, new String[] {"Tomatsauce", "Ost", "pepperoni", "Oregano"}, 57));
        menu.add(new Pizza("Carbona", 4, new String[] {"Tomatsauce", "Ost", "Kødsauce", "Spaghetti", "Cocktailpølser", "Oregano"}, 63));
        menu.add(new Pizza("Dennis", 5, new String[] {"Tomatsauce", "Ost", "Skinke", "Pepperoni", "Cocktailpølser", "Oregano"}, 65));
        menu.add(new Pizza("Bertil", 6, new String[] {"Tomatsauce", "Ost", "Bacon", "Oregano"}, 57));
        menu.add(new Pizza("Silvia", 7, new String[] {"Tomatsauce", "Ost", "Pepperoni", "Rød peber", "Løg", "Oliven", "Oregano"}, 61));
        menu.add(new Pizza("Victoria", 8, new String[] {"Tomatsauce", "Ost", "Skinke", "Ananas", "Champignon", "Løg", "Oregano"}, 61));
        menu.add(new Pizza("Toronfo", 9, new String[] {"Tomatsauce", "Ost", "Skinke", "Bacon", "Kebab", "Chili", "Oregano"}, 61));
        menu.add(new Pizza("Capricciosa", 10, new String[] {"Tomatsauce", "Ost", "Skinke", "Champignon", "Oregano"}, 61));
        menu.add(new Pizza("Hawai", 11, new String[] {"Tomatsauce", "Ost", "Skinke", "Ananas", "Rejer", "Oregano"}, 61));
        menu.add(new Pizza("Le Blissola", 12, new String[] {"Tomatsauce", "Ost", "Skinke", "Rejer", "Oregano"}, 61));
        menu.add(new Pizza("Venezia", 13, new String[] {"Tomatsauce", "Ost", "Skinke", "Bacon", "Oregano"}, 61));
        menu.add(new Pizza("Mafia", 14, new String[] {"Tomatsauce", "Ost", "Pepperoni", "Bacon", "Løg", "Oregano"}, 61));
        return menu;
    }

}
