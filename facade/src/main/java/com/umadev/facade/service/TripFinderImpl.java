package com.umadev.facade.service;

import com.umadev.facade.model.Flight;
import com.umadev.facade.model.Hotel;

public class TripFinderImpl implements TripFinder {

  HotelApi hotelApi;
  FlightApi flightApi;

  public TripFinderImpl() {
    hotelApi = new HotelApi();
    flightApi = new FlightApi();
  }

  @Override
  public void searchTrip(
      String origin, String destination, String departureDate, String returnDate) {

    Flight flight = new Flight(departureDate, returnDate, origin, destination);
    Hotel hotel = new Hotel(departureDate, returnDate, destination);

    flightApi.findFlight(flight);
    hotelApi.findHotel(hotel);
  }
}
