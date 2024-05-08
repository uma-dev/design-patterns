package com.umadev.flyweight;

import com.umadev.flyweight.model.Tree;
import com.umadev.flyweight.service.TreeFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlyweightApplication {

  public static void main(String[] args) {

    for (int i = 0; i < 500000; i++) {
      Tree greenTree = TreeFactory.getTree("Ornamental");
      Tree redTree = TreeFactory.getTree("Frutal");
    }

    // get the RAM used
    Runtime runtime = Runtime.getRuntime();
    System.out.println(
        "Memoria usada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));
    System.out.println("Instancias Ornamental: " + TreeFactory.getGreenCounter());
    System.out.println("Instancias Frutal: " + TreeFactory.getRedCounter());
  }
}
