package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given

        Country poland = new Country(new BigDecimal("1111111"), "Poland");
        Country germany = new Country(new BigDecimal("2222222"), "Germany");
        Country nigeria = new Country(new BigDecimal("1111111"), "Nigeria");
        Country egypt = new Country(new BigDecimal("2222222"), "Egypt");
        Country usa = new Country(new BigDecimal("1111111"), "Usa");
        Country canada = new Country(new BigDecimal("2222222"), "Canada");
        Country china = new Country(new BigDecimal("1111111"), "China");
        Country japan = new Country(new BigDecimal("2222222"), "Japan");
        Country australiaCountry = new Country(new BigDecimal("1111111"), "Australia");
        Country newZeland = new Country(new BigDecimal("2222222"), "New Zeland");

        Continent europe = new Continent("Europe");
        Continent africa = new Continent("Africa");
        Continent america = new Continent("America");
        Continent asia = new Continent("Asia");
        Continent australia = new Continent("Australia");

        europe.addCountry(poland);
        europe.addCountry(germany);
        africa.addCountry(nigeria);
        africa.addCountry(egypt);
        america.addCountry(usa);
        america.addCountry(canada);
        asia.addCountry(china);
        asia.addCountry(japan);
        australia.addCountry(australiaCountry);
        australia.addCountry(newZeland);

        World w = new World();
        w.addContinents(europe);
        w.addContinents(africa);
        w.addContinents(asia);
        w.addContinents(america);
        w.addContinents(australia);

        //When
        BigDecimal totalPeopleQuantity = w.getPeopleQuantity();
        BigDecimal expected = new BigDecimal("16666665");

        //Then
        Assert.assertEquals(expected, totalPeopleQuantity);
    }
}



