package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class AirportMap {
    private final Map<String, Boolean> flightRepository = new HashMap<>();

    public Map<String, Boolean> getFlightRepository() {
        return flightRepository;
    }

    public void addFlightToRepository(String airport, Boolean isOpen) {
        flightRepository.put(airport, isOpen);
    }
}
