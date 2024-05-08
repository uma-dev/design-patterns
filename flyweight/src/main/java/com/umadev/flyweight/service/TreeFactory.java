package com.umadev.flyweight.service;

import com.umadev.flyweight.model.Tree;
import java.util.HashMap;

// Instructions at:
// https://drive.google.com/file/d/1waHTdx1OA5pZ4cyC9dac9MNjOJX3-Lg7/view
public class TreeFactory {

  // we need class variable to track all trees
  private static HashMap<String, Tree> treePool = new HashMap<>();

  // static method because we don't need to make an instance of class to use it
  public static TreeFactory(String treeType) {
    Tree tree = treePool.get(treeType);

    if (tree == null) {
      switch (treeType) {
        case "Ornamental":
          tree = new Tree(treeType, 200, 400, "verde");
          break;

        case "Frutal":
          tree = new Tree(treeType, 500, 300, "rojo");
          break;

        case "Floral":
          tree = new Tree(treeType, 100, 200, "celeste");
          break;

        default:
          System.out.println("Tree type not supported");
          break;
      }
      System.out.println("New tree added" + tree);
      treePool.put(treeType, tree);
    } else {
      System.out.println("Founded tree" + tree);
    }
  }
}
