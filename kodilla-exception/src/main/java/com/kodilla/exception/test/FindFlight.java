package com.kodilla.exception.test;
import java.util.HashMap;
import java.util.Map;

public class FindFlight {


    private HashMap<String, Boolean> flights = new HashMap<>();

    public FindFlight() {
        flights.put("Paris", true);
        flights.put("London", true);
        flights.put("Warsaw", true);
        flights.put("New York", false);
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {

            String arrivalAirport = flight.getArrivalAirport();
            String departureAirport = flight.getDepartureAirport();
            boolean isContainArrivalAirport = flights.containsKey(arrivalAirport);
            boolean isContainDepartureAirport = flights.containsKey(departureAirport);

            if (isContainArrivalAirport && isContainDepartureAirport) {
                if (flights.get(arrivalAirport) && flights.get(departureAirport)) {
                    System.out.println("You can book ticket from " + departureAirport + " to " + arrivalAirport);
                }
                if (!(flights.get(arrivalAirport)) || !(flights.get(departureAirport))) {
                    System.out.println("Flight from " + departureAirport + " to " + arrivalAirport + " is not available");
                }
            } else {
                throw new RouteNotFoundException("There no this airport in database");
            }
    }




    public static void main(String args[]) {


        Flight flight1 = new Flight("New York","Paris");
        FindFlight findFlight1  = new FindFlight();

        Flight flight2 = new Flight("Warsaw","Paris");
        FindFlight findFlight2  = new FindFlight();

        Flight flight3 = new Flight("Warsaw","Lewer");
        FindFlight findFlight3  = new FindFlight();


        try {
            findFlight1.findFlight(flight1);
        }catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }


        try {
            findFlight2.findFlight(flight2);
        }catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            findFlight3.findFlight(flight3);
        }catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}






