package com.kodilla.good.patterns.findFlight;

import java.time.LocalTime;

public class FlightFinder {
    public static void main(String[] args) {
        FlightRepository flightRepository = new FlightRepository();

        flightRepository.addFlightToList(new Flight(1, City.WAW, City.GDN, LocalTime.of(19,30)));
        flightRepository.addFlightToList(new Flight(2,City.WRO, City.KRK, LocalTime.of(13,00)));
        flightRepository.addFlightToList(new Flight(3, City.KRK, City.GDN, LocalTime.of(14,30)));
        flightRepository.addFlightToList(new Flight(4,City.WMI, City.KRK, LocalTime.of(15,00)));
        flightRepository.addFlightToList(new Flight(5,City.KRK, City.POZ, LocalTime.of(16,30)));
        flightRepository.addFlightToList(new Flight(6,City.POZ, City.KTW, LocalTime.of(17,00)));
        flightRepository.addFlightToList(new Flight(7,City.KRK, City.WAW, LocalTime.of(11,30)));
        flightRepository.addFlightToList(new Flight(8,City.WAW, City.KTW, LocalTime.of(06,00)));
        flightRepository.addFlightToList(new Flight(9,City.WAW, City.KTW, LocalTime.of(06,00)));


        System.out.println("flight to WAW:");
        flightRepository.findFlightByCityOfArrivals(City.WAW).stream().forEach(System.out::println);
        System.out.println("flight to KRK:");
        flightRepository.findFlightByCityOfArrivals(City.KRK).stream().forEach(System.out::println);
        System.out.println("flight from WAW:");
        flightRepository.findFlightByCityOfDeparture(City.WAW).stream().forEach(System.out::println);
        System.out.println("flight from WMI:");
        flightRepository.findFlightByCityOfDeparture(City.WMI).stream().forEach(System.out::println);
        System.out.println("flight from KRK to KTW with a change:");
        flightRepository.findFlightWithTransfer(City.KRK,City.KTW).stream().forEach(System.out::println);

    }
}
