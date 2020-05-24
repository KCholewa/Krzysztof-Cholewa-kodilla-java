package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BurgerBuilder()
                .bun("with sesame")
                .burgers(2)
                .sauce("barbecue")
                .indigrents("lettuce")
                .indigrents("mushrooms")
                .indigrents("prawns")
                .indigrents("onion")
                .build();

        System.out.println(bigmac);

        //When
        int indigrentsQty = bigmac.getIndigrents().size();
        Sauce sauceType = bigmac.getSauce();
        Burgers burgers = bigmac.getBurgers();
        Bun bun = bigmac.getBun();

        //Then
        Assert.assertEquals(4, indigrentsQty);
        Assert.assertEquals("barbecue", sauceType.getSauce());
        Assert.assertEquals(2, burgers.getBurgersQty());
        Assert.assertEquals("with sesame", bun.getBun());

    }

    @Test(expected = IllegalStateException.class)
    public void testExeptions() {
        //Given & When

        Bigmac bigmac = new Bigmac.BurgerBuilder()
                .bun("with sesame")
                .burgers(2)
                .sauce("barbecue")
                .indigrents("tomatoes")
                .build();
    }
}

