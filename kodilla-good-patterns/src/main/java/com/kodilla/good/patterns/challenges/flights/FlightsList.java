package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;

public class FlightsList {

     private List<Flight> flightList = new ArrayList<>();

     public FlightsList(List<Flight> flightList) {
          this.flightList = flightList;
     }

     public List<Flight> getFlightList() {
          return flightList;
     }



     @Override
     public String toString() {
          return "FlightsList{" +
                  "flightList=" + flightList +
                  '}';
     }
}
