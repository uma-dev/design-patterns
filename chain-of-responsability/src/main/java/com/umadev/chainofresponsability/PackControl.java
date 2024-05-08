package com.umadev.chainofresponsability;

public class PackControl extends Control {
  @Override
  public void checkQuality(Article articleToCheck) {

    String articlePack = articleToCheck.getPack();
    if (articlePack.equals("sano") || articlePack.equals("casi sano")) {
      System.out.println("pack ok");
    }
    if (this.getNext() != null) {
      this.getNext().checkQuality(articleToCheck);
    }
  }
}
