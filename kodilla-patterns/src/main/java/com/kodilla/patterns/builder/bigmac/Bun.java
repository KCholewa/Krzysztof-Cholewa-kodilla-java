package com.kodilla.patterns.builder.bigmac;

import java.util.Arrays;
import java.util.List;

public class Bun {

    private final List<String> typeOfBun = Arrays.asList("with sesame", "without sezame");
    private final String bun;

    public Bun (String bun){
        if(typeOfBun.contains(bun)) {
            this.bun = bun;
        } else {
            throw new IllegalStateException("You can only choose: with sezam or without sezam");
        }
    }

    public String getBun() {
        return bun;
    }
}
