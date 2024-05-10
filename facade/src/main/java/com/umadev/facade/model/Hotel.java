package com.umadev.facade.model;

public class Hotel {

  private String checkIn;
  private String checkOut;
  private String city;

  public Hotel(String checkIn, String checkOut, String city) {
    this.checkIn = checkIn;
    this.checkOut = checkOut;
    this.city = city;
  }

  public Hotel() {
    this.checkIn = null;
    this.checkOut = null;
    this.city = null;
  }

  public String getCheckIn() {
    return checkIn;
  }

  public String getCheckOut() {
    return checkOut;
  }

  public String getCity() {
    return city;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    boolean checkInEqual = this.getCheckIn().equals(((Hotel) obj).getCheckIn());
    boolean checkOutEqual = this.getCheckOut().equals(((Hotel) obj).getCheckOut());
    boolean checkCityEqual = this.getCity().equals(((Hotel) obj).getCity());
    return checkInEqual && checkOutEqual && checkCityEqual;
  }

  @Override
  public String toString() {
    return "Hotel in " + city + " " + checkIn + "-" + checkOut;
  }
}
