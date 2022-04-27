package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightLogic {
    AirportMap airportMap = new AirportMap();

    public FlightLogic(AirportMap airportMap) {
        this.airportMap = airportMap;
    }

    public boolean findFilght(Flight flight) throws RouteNotFoundException {

        if (airportMap.getFlightRepository().get(flight.getDepartureAirport()) != null
                && (airportMap.getFlightRepository().get(flight.getArrivalAirport()) != null)) {
            boolean departures = airportMap.getFlightRepository().get(flight.getDepartureAirport());
            boolean arrival = airportMap.getFlightRepository().get(flight.getArrivalAirport());

            return departures && arrival;
        } else {
            throw new RouteNotFoundException();
        }
    }
}
