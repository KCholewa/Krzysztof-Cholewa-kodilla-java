package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;

public class SampleFlights {

    Airport warszawa = new Airport("Warszawa");
    Airport gdansk = new Airport("Gdansk");
    Airport krakow = new Airport("Krakow");
    Airport poznan = new Airport("Poznan");
    Airport lublin = new Airport("Lublin");
    Airport wroclaw = new Airport("Wroclaw");

    public FlightsList getSampleFlights() {

        List<Flight> flightlist = new ArrayList<>();
        flightlist.add(new Flight(warszawa, gdansk));
        flightlist.add(new Flight(warszawa, krakow));
        flightlist.add(new Flight(warszawa, poznan));
        flightlist.add(new Flight(warszawa, lublin));
        flightlist.add(new Flight(warszawa, wroclaw));
        flightlist.add(new Flight(gdansk, warszawa));
        flightlist.add(new Flight(gdansk, krakow));
        flightlist.add(new Flight(gdansk, wroclaw));
        flightlist.add(new Flight(krakow, warszawa));
        flightlist.add(new Flight(krakow, gdansk));
        flightlist.add(new Flight(krakow, poznan));
        flightlist.add(new Flight(poznan, warszawa));
        flightlist.add(new Flight(poznan, krakow));
        flightlist.add(new Flight(lublin, warszawa));
        flightlist.add(new Flight(wroclaw, warszawa));

        return new FlightsList(flightlist);
    }

    @Override
    public String toString() {
        return "SampleFlights{" +
                "warszawa=" + warszawa +
                ", gdansk=" + gdansk +
                ", krakow=" + krakow +
                ", poznan=" + poznan +
                ", lublin=" + lublin +
                ", wroclaw=" + wroclaw +
                '}';
    }
}
