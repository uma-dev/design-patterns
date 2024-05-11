package com.umadev.template.model;

public class MenuVegie extends MenuTemplate {

  private Integer numOfSpecies;
  private Integer numOfSauces;

  private static final double priceOfSauces = 2;

  public MenuVegie(Integer numOfSpecies, Integer numOfSauces) {
    this.numOfSpecies = numOfSpecies;
    this.numOfSauces = numOfSauces;
  }

  public MenuVegie() {
    this.numOfSpecies = 0;
    this.numOfSauces = 0;
  }

  @Override
  public double getPrice() {
    double priceOfSpecies = (double) ((100 + numOfSpecies) / (100));
    return (basePrice * priceOfSpecies) + (priceOfSauces * numOfSauces);
  }

  @Override
  public String howToPrepare() {
    return "Deliver the salad, then put "
        + numOfSpecies
        + " species and "
        + numOfSauces
        + " sauces";
  }
}
