package com.umadev.template;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.umadev.template.model.MenuClassic;
import com.umadev.template.model.MenuKids;
import com.umadev.template.model.MenuTemplate;
import com.umadev.template.model.MenuVegie;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TemplateDesignPatternApplicationTests {

  @Test
  void menuVegieIsWorking() {
    MenuTemplate menuVegie = new MenuVegie(1, 2);
    double expectedPrice = 53.99;
    assertEquals(menuVegie.getPrice(), expectedPrice);
    // contains the price
    assertTrue(menuVegie.deliver().contains(String.valueOf(expectedPrice)));
  }

  @Test
  void menuKidsIsWorking() {
    MenuTemplate menuKids = new MenuKids(1);
    double expectedPrice = 59.99;
    assertEquals(menuKids.getPrice(), expectedPrice);
    // contains the price
    assertTrue(menuKids.deliver().contains(String.valueOf(expectedPrice)));
  }

  @Test
  void menuClassicIsWorking() {
    MenuTemplate menuClassic = new MenuClassic();
    double expectedPrice = 49.99;
    assertEquals(menuClassic.getPrice(), expectedPrice);
    // contains the price
    assertTrue(menuClassic.deliver().contains(String.valueOf(expectedPrice)));
  }
}
