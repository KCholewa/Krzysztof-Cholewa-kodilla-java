package com.kodilla.good.patterns.challenges.flights;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FlightFinderTest {

    @Test
    public void FlightFinderTest() {

        //Given
        SampleFlights sampleFlights = new SampleFlights();
        FlightFinder flightFinder = new FlightFinder();

        //When
        List<Flight> flightsFrom = flightFinder.findFlightFrom("Warszawa");
        List<Flight> flightsTo = flightFinder.findFlightTo("Krakow");
        List<String > indirectAirports = flightFinder.findIndirectFlight("Warszawa", "Krakow");

        //Then
        assertEquals(2, indirectAirports.size());
        assertEquals(5, flightsFrom.size());
        assertEquals(3, flightsTo.size());

    }

}
