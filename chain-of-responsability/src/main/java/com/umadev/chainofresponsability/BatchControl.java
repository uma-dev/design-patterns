package com.umadev.chainofresponsability;

public class BatchControl extends Control {
  @Override
  public void checkQuality(Article articleToCheck) {

    int articleBatch = articleToCheck.getBatch();
    if (articleBatch > 1000 && articleBatch < 2000) {
      System.out.println("batch ok");
    }
    if (this.getNext() != null) {
      this.getNext().checkQuality(articleToCheck);
    }
  }
}
