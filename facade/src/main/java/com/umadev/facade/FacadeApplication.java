package com.umadev.facade;

import com.umadev.facade.model.Flight;
import com.umadev.facade.model.Hotel;
import com.umadev.facade.service.FlightApi;
import com.umadev.facade.service.HotelApi;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FacadeApplication {

  public static void main(String[] args) {
    Hotel hotel1 = new Hotel("10am", "1pm", "CMDX");
    Hotel hotel2 = new Hotel("10am", "1pm", "CMDX");
    HotelApi hotelApi = new HotelApi();
    hotelApi.addHotel(hotel1);
    hotelApi.addHotel(hotel2);
    hotelApi.findHotel(hotel2);

    Flight flight1 = new Flight("10-15-2023", "30-15-2023", "MTY", "CDMX");
    Flight flight2 = new Flight("10-15-2023", "30-15-2023", "MTY", "CDMX");
    FlightApi flightApi = new FlightApi();
    flightApi.addFlight(flight1);
    flightApi.findFlight(flight2);
  }
}
