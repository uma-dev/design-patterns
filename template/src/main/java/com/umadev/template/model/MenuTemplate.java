package com.umadev.template.model;

public abstract class MenuTemplate {

  public static double basePrice = 49.99;

  public abstract double getPrice();

  public abstract String howToPrepare();

  public String deliver() {
    return "How to prepare: " + howToPrepare() + "The total is: " + getPrice();
  }
}
