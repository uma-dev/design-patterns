package com.umadev.facade.service;

import com.umadev.facade.model.Hotel;
import java.util.ArrayList;
import java.util.List;

public class HotelApi {
  private List<Hotel> hotels;

  public HotelApi() {
    hotels = new ArrayList<Hotel>();
    fillHotels();
  }

  public Hotel findHotel(Hotel hotel) {
    for (Hotel h : hotels) {
      if (h.equals(hotel)) {
        return h;
      }
    }
    return new Hotel();
  }

  public void fillHotels() {
    Hotel hotel1 = new Hotel("10am", "1pm", "CMDX");
    Hotel hotel2 = new Hotel("10am", "1pm", "CMDX");
    hotels.add(hotel1);
    hotels.add(hotel2);
  }
}
