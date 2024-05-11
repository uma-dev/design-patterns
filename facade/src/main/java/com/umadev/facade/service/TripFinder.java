package com.umadev.facade.service;

public interface TripFinder {
  public boolean searchTrip(
      String origin, String destination, String departureDate, String returnDate);
}
