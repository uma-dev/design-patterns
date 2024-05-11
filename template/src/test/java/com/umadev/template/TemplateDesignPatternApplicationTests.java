package com.umadev.template;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
}
