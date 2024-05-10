package com.umadev.facade.service;

import com.umadev.facade.model.Flight;
import java.util.ArrayList;
import java.util.List;

public class FlightApi {
  private List<Flight> flights;

  public FlightApi() {
    flights = new ArrayList<Flight>();
    fillFlights();
  }

  public Flight findFlight(Flight flight) {
    for (Flight f : flights) {
      if (f.equals(flight)) {
        return f;
      }
    }
    return new Flight();
  }

  public void fillFlights() {
    Flight flight1 = new Flight("10-15-2023", "30-15-2023", "MTY", "CDMX");
    Flight flight2 = new Flight("10-15-2023", "30-15-2023", "MTY", "CDMX");
    flights.add(flight1);
    flights.add(flight2);
  }
}
