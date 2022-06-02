package com.kodilla.good.patterns.findFlight;

public enum City {
    WAW("Warszawa"), WMI("Modlin"), WRO("Wrocław"), POZ("Poznań"), KRK("Kraków"), KTW("Katowice"), GDN("Gdańsk");

    private final String cityName;
    City(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }
}
