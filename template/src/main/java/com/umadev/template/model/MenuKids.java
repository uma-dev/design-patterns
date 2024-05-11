package com.umadev.template.model;

public class MenuKids extends MenuTemplate {

  private static final double priceOfToys = 10.99;
  private Integer numberOfToys;

  public MenuKids(Integer numberOfToys) {
    this.numberOfToys = numberOfToys;
  }

  public MenuKids() {
    this.numberOfToys = 0;
  }

  @Override
  public double getPrice() {
    double total = basePrice + (numberOfToys * priceOfToys);
    return total;
  }

  @Override
  public String howToPrepare() {
    return "Deliver the hamburguer and add " + numberOfToys + "toy/s";
  }
}
