package com.company;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class Pizza {
  private String name;
  private int id;
  private String[] ingredients;
  private double price;
  public Pizza(String name, int id, String[] ingredients, double price){
    this.name = name;
    this.id = id;
    this.ingredients = ingredients;
    this.price = price;
  }

  public int getId() {
    return this.id;
  }

  private String ingredientsToString() {
    StringBuilder builder = new StringBuilder();
    Arrays.stream(ingredients).forEach(ingredient -> builder.append(ingredient == ingredients[ingredients.length-1] ? ingredient + "" : ingredient + ", "));
    return builder.toString();
  }

  public String toString(String spaces) {
    NumberFormat fmt = NumberFormat.getCurrencyInstance();
    return String.format("%s%sID: %s%sIngredients: %s%sPrice: %s", name, spaces, id, spaces, ingredientsToString(), spaces, fmt.format(price));
  }
}
