package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double averageTemperature() {
        double sumOfTemperature = 0.0;

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            sumOfTemperature += temperature.getValue();
        }

        return (Math.round((sumOfTemperature / temperatures.getTemperatures().size())*100.0)/100.0);
    }

    public double medianTemperatures() {
        List<Double> listOfTemperatures = new ArrayList<>(temperatures.getTemperatures().values());
        Collections.sort(listOfTemperatures);
        if (listOfTemperatures.size() % 2 != 0) {
            return listOfTemperatures.get(listOfTemperatures.size()/2);
        }

        return ((listOfTemperatures.get(listOfTemperatures.size() / 2))
                + (listOfTemperatures.get(listOfTemperatures.size() / (2+1))))
                /2;
    }
}
