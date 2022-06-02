package com.kodilla.good.patterns.findFlight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightRepository {
    private List<Flight> flightList = new ArrayList<>();

    public FlightRepository() {
    }

    public void addFlightToList(Flight flight) {
        flightList.add(flight);
    }

    public List<Flight> getFlightList() {
        return flightList;
    }

    public List<Flight> findFlightByCityOfDeparture(City city) {
        return flightList.stream().filter(flight -> flight.getDeparturesCity().equals(city)).collect(Collectors.toList());
    }

    public List<Flight> findFlightByCityOfArrivals(City city) {
        return flightList.stream().filter(flight -> flight.getArrivalCity().equals(city)).collect(Collectors.toList());
    }

    public List<Flight> findFlightWithTransfer(City departuresCity, City arrivalCity) {
        List<Flight> listFlightFrom = findFlightByCityOfDeparture(departuresCity);
        List<Flight> listFlightsTo = findFlightByCityOfArrivals(arrivalCity);
        List<Flight> listFlightWithTransfer = new ArrayList<>();

        for (Flight flightFrom : listFlightFrom) {
            for (Flight flightTo : listFlightsTo) {
                if (flightFrom.getArrivalCity().equals(flightTo.getDeparturesCity())) {
                    listFlightWithTransfer.add(flightFrom);
                    listFlightWithTransfer.add(flightTo);
                }
            }
        }
        return listFlightWithTransfer;
    }
}
