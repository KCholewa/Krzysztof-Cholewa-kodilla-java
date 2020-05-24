package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {

    private final Bun bun;
    private final Burgers burgers;
    private final Sauce sauce;
    private final List<Indigrents> indigrents;

    public static class BurgerBuilder {
        private Bun bun;
        private Burgers burgers;
        private List<Indigrents> indigrents = new ArrayList<>();
        private Sauce sauce;

        public BurgerBuilder bun(String bun) {
            this.bun = new Bun(bun);
            return this;
        }

        public BurgerBuilder burgers(int burgers) {
            this.burgers = new Burgers(burgers);
            return this;
        }

        public BurgerBuilder indigrents(String indigrents) {
            this.indigrents.add(new Indigrents(indigrents));
            return this;
        }

        public BurgerBuilder sauce(String sauce) {
            this.sauce = new Sauce(sauce);
            return this;
        }

        public Bigmac build() {
            return new Bigmac (bun, burgers, sauce, indigrents);
        }
    }

    private Bigmac(Bun bun, Burgers burgers, Sauce sauce, List<Indigrents> indigrents) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.indigrents = indigrents;
    }

    public Bun getBun() {
        return bun;
    }

    public Burgers getBurgers() {
        return burgers;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public List<Indigrents> getIndigrents() {
        return indigrents;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun=" + bun.getBun() +
                ", burgers=" + burgers.getBurgersQty() +
                ", sauce=" + sauce.getSauce() +
                ", indigrents=" + indigrents +
                '}';
    }
}


