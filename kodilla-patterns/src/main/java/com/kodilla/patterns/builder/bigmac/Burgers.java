package com.kodilla.patterns.builder.bigmac;

import java.util.Arrays;
import java.util.List;

public class Burgers {

    private final List<Integer> burgers = Arrays.asList(1, 2, 3);
    private final int burgersQty;

    public Burgers(int burgersQty){
        if(burgers.contains(burgersQty)) {
            this.burgersQty = burgersQty;
        } else {
            throw new IllegalStateException("You can only choose: 1, 2 or 3");
        }
    }

    public int getBurgersQty() {
        return burgersQty;
    }

}