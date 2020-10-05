package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class FlightFinder {

    public List<Flight> findFlightFrom(String string) {
        Airport airport = new Airport(string);
        SampleFlights sampleFlights = new SampleFlights();
        List<Flight> flights =
        sampleFlights.getSampleFlights().getFlightList().stream()
                            .filter(a -> a.getFrom().equals(airport))
                            .collect(toList());
        return flights;
    }

    public List<Flight> findFlightTo(String string) {
        Airport airport = new Airport(string);
        SampleFlights sampleFlights = new SampleFlights();
        List<Flight> flights =
                sampleFlights.getSampleFlights().getFlightList().stream()
                        .filter(a -> a.getTo().equals(airport))
                        .collect(toList());
        return flights;
    }

    public List<String>findIndirectFlight(String flightFrom, String flightTo) {
        List<Flight> listFrom = findFlightFrom(flightFrom);
        List<Flight> listTo = findFlightTo(flightTo);
        String airport;
        List<String> indirectAirport = new ArrayList<>();

         for(Flight flight : listFrom ) {
             airport = flight.getTo().getAirportName();
             for(Flight flight1 : listTo) {
                 if (airport.equals(flight1.getFrom().getAirportName())) {
                     indirectAirport.add(airport);
                 }
             }
         }
       return indirectAirport;
    }
}
