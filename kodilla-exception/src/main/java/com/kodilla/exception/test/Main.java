package com.kodilla.exception.test;

public class Main {
    public static void main(String[] args) {
        AirportMap airportMap = new AirportMap();

        airportMap.addFlightToRepository("WAW", true);
        airportMap.addFlightToRepository("KRK", true);
        airportMap.addFlightToRepository("GDN", true);
        airportMap.addFlightToRepository("WRO", true);
        airportMap.addFlightToRepository("WMI", true);
        airportMap.addFlightToRepository("SZZ", false);
        airportMap.addFlightToRepository("POZ", true);


        FlightLogic flightLogic = new FlightLogic(airportMap);

        Flight flight1 = new Flight("WAW", "KRK");
        Flight flight2 = new Flight("GDN", "WRO");
        Flight flight3 = new Flight("POZ", "CPL");
        Flight flight4 = new Flight("WMI", "SZZ");
        Flight flight5 = new Flight("CPL", "WAW");

        checkFlightIsExist(flightLogic, flight1);
        checkFlightIsExist(flightLogic, flight2);
        checkFlightIsExist(flightLogic, flight3);
        checkFlightIsExist(flightLogic, flight4);

    }

    private static void checkFlightIsExist(FlightLogic flightLogic, Flight flight) {
        try {
            boolean isAvailable = flightLogic.findFilght(flight);
            System.out.println(flight.toString() + ((flightLogic.findFilght(flight)) ? " - is available" : " - is not available"));
        } catch (RouteNotFoundException e) {
            System.out.println(flight.toString() + " - can't find the airport");
        }
    }
}
