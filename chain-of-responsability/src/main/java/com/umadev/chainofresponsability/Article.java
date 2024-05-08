package com.umadev.chainofresponsability;

public class Article {
  private String name;
  private int batch;
  private int weight;
  private String pack;

  public Article(String theName, int theBatch, int theWeight, String thePack) {
    this.name = theName;
    this.batch = theBatch;
    this.weight = theWeight;
    this.pack = thePack;
  }

  public String getName() {
    return this.name;
  }

  public int getBatch() {
    return this.batch;
  }

  public int getWeight() {
    return this.weight;
  }

  public String getPack() {
    return this.pack;
  }
}
