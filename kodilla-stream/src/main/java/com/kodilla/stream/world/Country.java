package com.kodilla.stream.world;
import java.math.BigDecimal;

public final class Country {

    private final BigDecimal peopleQuantity;
    private final String nameOfCountry;

    public Country(final BigDecimal peopleQuantity, final String nameOfCountry) {
        this.peopleQuantity = peopleQuantity;
        this.nameOfCountry = nameOfCountry;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }


}

