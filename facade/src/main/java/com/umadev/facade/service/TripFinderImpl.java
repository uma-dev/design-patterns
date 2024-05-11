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
  public boolean searchTrip(
      String origin, String destination, String departureDate, String returnDate) {

    // Here is where the magic occurs, we can manage and create the objects according to our
    // bussiness logic
    Flight flight = new Flight(departureDate, returnDate, origin, destination);
    Flight foundedFlight = flightApi.findFlight(flight);
    boolean isFlightFinded = foundedFlight.equals(flight);

    Hotel hotel = new Hotel(departureDate, returnDate, destination);
    Hotel findedHotel = hotelApi.findHotel(hotel);
    boolean isHotelFound = findedHotel.equals(hotel);

    return isHotelFound && isFlightFinded;
  }
}
