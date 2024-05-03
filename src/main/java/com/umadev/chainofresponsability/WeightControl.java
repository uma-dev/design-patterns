package com.umadev.chainofresponsability;

public class WeightControl extends Control {
  @Override
  public void checkQuality(Article articleToCheck) {

    int articleWeight = articleToCheck.getWeight();
    if (articleWeight > 1200 && articleWeight < 1300) {
      System.out.println("weight ok");
    }
    if (this.getNext() != null) {
      this.getNext().checkQuality(articleToCheck);
    }
  }
}
