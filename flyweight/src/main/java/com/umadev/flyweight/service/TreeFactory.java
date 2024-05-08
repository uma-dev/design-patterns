package com.umadev.flyweight.service;

import com.umadev.flyweight.model.Tree;
import java.util.HashMap;

// Instructions at:
// https://drive.google.com/file/d/1waHTdx1OA5pZ4cyC9dac9MNjOJX3-Lg7/view
public class TreeFactory {

  // we need class variable to track all trees
  // untill its final we can add objects to the hash map, only the reference to the object is final
  private static final HashMap<String, Tree> treePool = new HashMap<>();
  private static Integer greenCounter = 0;
  private static Integer redCounter = 0;
  private static Integer blueCounter = 0;

  // static method because we don't need to make an instance of class to use it
  public static Tree getTree(String treeType) {
    Tree tree = treePool.get(treeType);

    if (tree == null) {
      switch (treeType) {
        case "Ornamental":
          tree = new Tree(treeType, 200, 400, "green");
          break;

        case "Frutal":
          tree = new Tree(treeType, 500, 300, "red");
          break;

        case "Floral":
          tree = new Tree(treeType, 100, 200, "blue");
          break;

        default:
          System.out.println("This type is not supported");
          break;
      }
      System.out.println("New tree added" + tree);
      treePool.put(treeType, tree);
    }

    // Increase counter
    switch (treeType) {
      case "Ornamental":
        greenCounter++;
        break;

      case "Frutal":
        redCounter++;
        break;

      case "Floral":
        blueCounter++;
        break;
    }
    // System.out.println("Founded tree" + tree);
    return tree;
  }

  public static Integer getGreenCounter() {
    return greenCounter;
  }

  public static Integer getRedCounter() {
    return redCounter;
  }

  public static Integer getBlueCounter() {
    return blueCounter;
  }
}
