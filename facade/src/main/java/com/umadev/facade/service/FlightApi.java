package com.umadev.facade.service;

import com.umadev.facade.model.Flight;
import java.util.ArrayList;
import java.util.List;

public class FlightApi {
  private List<Flight> flights;

  public FlightApi() {
    flights = new ArrayList<Flight>();
  }

  public void findFlight(Flight flight) {
    for (Flight f : flights) {
      if (f.equals(flight)) {
        System.out.println("Flight found! " + f.toString());
      }
    }
  }

  public void addFlight(Flight newFlight) {
    flights.add(newFlight);
  }
}
