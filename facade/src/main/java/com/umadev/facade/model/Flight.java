package com.umadev.facade.model;

public class Flight {
  private String departureDate;
  private String returnDate;
  private String origin;
  private String destination;

  public Flight(String departureDate, String returnDate, String origin, String destination) {
    this.departureDate = departureDate;
    this.returnDate = returnDate;
    this.origin = origin;
    this.destination = destination;
  }

  public Flight() {
    this.departureDate = null;
    this.returnDate = null;
    this.origin = null;
    this.destination = null;
  }

  public String getDepartureDate() {
    return departureDate;
  }

  public String getReturnDate() {
    return returnDate;
  }

  public String getOrigin() {
    return origin;
  }

  public String getDestination() {
    return destination;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }

    boolean checkDepartureDate = this.getDepartureDate().equals(((Flight) obj).getDepartureDate());
    boolean checkReturnDate = this.getReturnDate().equals(((Flight) obj).getReturnDate());
    boolean checkOrigin = this.getOrigin().equals(((Flight) obj).getOrigin());
    boolean checkDestination = this.getDestination().equals(((Flight) obj).getDestination());
    return checkDepartureDate && checkReturnDate && checkOrigin && checkDestination;
  }

  @Override
  public String toString() {
    return "Flight to "
        + destination
        + " from "
        + origin
        + " "
        + departureDate
        + " / "
        + returnDate;
  }
}
