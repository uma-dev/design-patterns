package com.umadev.facade;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.umadev.facade.model.Flight;
import com.umadev.facade.model.Hotel;
import com.umadev.facade.service.FlightApi;
import com.umadev.facade.service.HotelApi;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FacadeApplicationTests {

  @Test
  void checkHotelApi() {
    Hotel hotel = new Hotel("10am", "1pm", "CMDX");
    HotelApi hotelApi = new HotelApi();
    Hotel findedHotel = hotelApi.findHotel(hotel);
    assertTrue(hotel.equals(findedHotel));
  }

  @Test
  void checkFlightApi() {
    Flight flight = new Flight("10-15-2023", "30-15-2023", "MTY", "CDMX");
    FlightApi flightApi = new FlightApi();
    Flight findedFlight = flightApi.findFlight(flight);
    assertTrue(flight.equals(findedFlight));
  }
}
