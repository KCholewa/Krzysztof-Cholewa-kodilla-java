package com.kodilla.patterns.builder.bigmac;

import java.util.Arrays;
import java.util.List;

public class Indigrents {

    private final List<String> indigerntsList = Arrays.asList("lettuce", "onion", "bacon", "cucumber", "chili", "mushrooms", "prawns", "chease");
    private final String indigrent;

    public Indigrents(String indigrent){
        if(indigerntsList.contains(indigrent)) {
            this.indigrent = indigrent;
        } else {
            throw new IllegalStateException("You can only choose: lettuce, onion, bacon, cucumber, chili, mushrooms, prawns, chease");
        }
    }

    @Override
    public String toString() {
        return indigrent;

    }
}
