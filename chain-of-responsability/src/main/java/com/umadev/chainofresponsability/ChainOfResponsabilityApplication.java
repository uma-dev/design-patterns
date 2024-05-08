package com.umadev.chainofresponsability;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChainOfResponsabilityApplication {

  public static void main(String[] args) {
    Article articleOk = new Article("Article Ok", 1010, 1250, "sano");
    Control batchControl = new BatchControl();
    Control weightControl = new WeightControl();
    Control packControl = new PackControl();

    batchControl.setNext(weightControl);
    weightControl.setNext(packControl);
    // check the quality
    batchControl.checkQuality(articleOk);
  }
}
