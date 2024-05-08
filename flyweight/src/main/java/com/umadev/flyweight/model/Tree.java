package com.umadev.flyweight.model;

public class Tree {
  private String type;
  private Integer height;
  private Integer width;
  private String color;

  public Tree(String theType, Integer theHeight, Integer theWidth, String theColor) {
    type = theType;
    height = theHeight;
    width = theWidth;
    color = theColor;
  }

  @Override
  public String toString() {
    return "Tree: "
        + "type= "
        + type
        + ", height=  "
        + height
        + ", widht= "
        + width
        + ", color="
        + color;
  }
}
