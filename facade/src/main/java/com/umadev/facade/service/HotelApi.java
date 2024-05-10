package com.umadev.facade.service;

import com.umadev.facade.model.Hotel;
import java.util.ArrayList;
import java.util.List;

public class HotelApi {
  private List<Hotel> hotels;

  public HotelApi() {
    hotels = new ArrayList<Hotel>();
  }

  public void findHotel(Hotel hotel) {
    for (Hotel h : hotels) {
      if (h.equals(hotel)) {
        System.out.println("Hotel found! " + h.toString());
      }
    }
  }

  public void addHotel(Hotel newHotel) {
    hotels.add(newHotel);
  }
}
