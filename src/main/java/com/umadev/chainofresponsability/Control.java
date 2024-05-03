package com.umadev.chainofresponsability;

public abstract class Control {

  private Control nextControl;

  public void setNext(Control theNextControl) {
    this.nextControl = theNextControl;
  }

  public Control getNext() {
    return this.nextControl;
  }

  abstract void checkQuality(Article articleToCheck);
}
