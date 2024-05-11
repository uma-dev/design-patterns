package com.umadev.template.model;

public class MenuClassic extends MenuTemplate {

  public MenuClassic() {
    super();
  }

  @Override
  public double getPrice() {
    return basePrice;
  }

  @Override
  public String howToPrepare() {
    return "Add the base ingredients to the menu";
  }
}
