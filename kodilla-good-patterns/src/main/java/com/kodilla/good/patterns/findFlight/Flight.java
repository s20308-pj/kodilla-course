package com.kodilla.good.patterns.findFlight;

import java.time.LocalTime;
import java.util.Objects;

public class Flight {

    private int flightNumber;
    private City departuresCity;
    private City arrivalCity;
    private LocalTime departuresTime;

    public Flight(int flightNumber, City formCity, City toCity, LocalTime departures) {
        this.flightNumber = flightNumber;
        this.departuresCity = formCity;
        this.arrivalCity = toCity;
        this.departuresTime = departures;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public City getDeparturesCity() {
        return departuresCity;
    }

    public City getArrivalCity() {
        return arrivalCity;
    }

    public LocalTime getDeparturesTime() {
        return departuresTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return departuresCity == flight.departuresCity && arrivalCity == flight.arrivalCity && Objects.equals(departuresTime, flight.departuresTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departuresCity, arrivalCity, departuresTime);
    }

    @Override
    public String toString() {
        return "flight number: " + flightNumber +
                ", departures City: " + departuresCity.getCityName() +
                ", arrival City: " + arrivalCity.getCityName() +
                ", departures time: " + departuresTime;
    }
}
