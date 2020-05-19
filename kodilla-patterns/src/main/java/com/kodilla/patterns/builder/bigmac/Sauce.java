package com.kodilla.patterns.builder.bigmac;

import java.util.Arrays;
import java.util.List;

public class Sauce {

    private final List<String> typeOfSauce = Arrays.asList("standard", "1000 islands", "barbecue");
    private final String sauce;

    public Sauce (String sauce){
        if(typeOfSauce.contains(sauce)) {
            this.sauce = sauce;
        } else {
            throw new IllegalStateException("You can only choose: standard, 1000 islands, barbecue");
        }
    }

    public String getSauce() {
        return sauce;
    }
}
