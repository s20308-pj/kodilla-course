package com.kodilla.stream.world;

import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given

        //Europe
        Country poland = new Country(new BigDecimal(38179800));
        Country italy = new Country(new BigDecimal(60461826));
        Country germany = new Country(new BigDecimal(83783942));
        Country unitedKingdom = new Country(new BigDecimal(67886011));
        //Asia
        Country china = new Country(new BigDecimal(1439323776));
        Country india = new Country(new BigDecimal(1380004385));
        Country indonesia = new Country(new BigDecimal(273523615));
        Country pakistan = new Country(new BigDecimal(220892340));
        //Africa
        Country nigeria = new Country(new BigDecimal(206139589));
        Country ethiopia = new Country(new BigDecimal(114963588));
        Country egypt= new Country(new BigDecimal(1102334404));
        Country southAfrica= new Country(new BigDecimal(59308690));

        //add country to continent
        Continent europa = new Continent();
        Continent asia = new Continent();
        Continent africa = new Continent();

        europa.addCountry(poland);
        europa.addCountry(italy);
        europa.addCountry(germany);
        europa.addCountry(unitedKingdom);

        asia.addCountry(china);
        asia.addCountry(india);
        asia.addCountry(indonesia);
        asia.addCountry(pakistan);

        africa.addCountry(nigeria);
        africa.addCountry(egypt);
        africa.addCountry(ethiopia);
        africa.addCountry(southAfrica);

        //add continent to world
        World world = new World();

        world.addContinent(europa);
        world.addContinent(asia);
        world.addContinent(africa);

        BigDecimal expectedSum = BigDecimal.ZERO;
        expectedSum = expectedSum.add(poland.getPeopleQuantity());
        expectedSum = expectedSum.add(italy.getPeopleQuantity());
        expectedSum = expectedSum.add(germany.getPeopleQuantity());
        expectedSum = expectedSum.add(unitedKingdom.getPeopleQuantity());
        expectedSum = expectedSum.add(china.getPeopleQuantity());
        expectedSum = expectedSum.add(india.getPeopleQuantity());
        expectedSum = expectedSum.add(indonesia.getPeopleQuantity());
        expectedSum = expectedSum.add(pakistan.getPeopleQuantity());
        expectedSum = expectedSum.add(nigeria.getPeopleQuantity());
        expectedSum = expectedSum.add(egypt.getPeopleQuantity());
        expectedSum = expectedSum.add(ethiopia.getPeopleQuantity());
        expectedSum = expectedSum.add(southAfrica.getPeopleQuantity());

        //When
        BigDecimal peopleSum = world.getPeopleQuantity();

        //Then
        Assertions.assertEquals(expectedSum,peopleSum);
    }
}
