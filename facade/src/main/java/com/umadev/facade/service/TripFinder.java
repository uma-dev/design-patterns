package com.umadev.facade.service;


public interface TripFinder {
  public void searchTrip(
      String origin, String destination, String departureDate, String returnDate);
}
