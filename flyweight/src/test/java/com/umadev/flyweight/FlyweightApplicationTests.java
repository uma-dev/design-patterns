package com.umadev.flyweight;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.umadev.flyweight.model.Tree;
import com.umadev.flyweight.service.TreeFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FlyweightApplicationTests {

  @Test
  void verifyNumberOfInstancesInFactoryAreCorrect() {

    for (int i = 0; i < 500000; i++) {
      Tree greenTree = TreeFactory.getTree("Ornamental");
      Tree redTree = TreeFactory.getTree("Frutal");
    }

    assertEquals(500000, TreeFactory.getGreenCounter());
    assertEquals(500000, TreeFactory.getRedCounter());
  }
}
