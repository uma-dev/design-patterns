package com.umadev.proxy.model;

public class User {
  private TypeOfUser typeOfUser;
  private String name;

  public User(TypeOfUser theTypeOfUser, String theName) {
    this.typeOfUser = theTypeOfUser;
    this.name = theName;
  }

  public TypeOfUser getTypeOfUser() {
    return typeOfUser;
  }

  public String getName() {
    return name;
  }
}
