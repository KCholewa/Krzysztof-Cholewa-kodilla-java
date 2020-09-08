package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.patterns2.decorator.pizza.extras.ExtraCheeseDecorator;
import com.kodilla.patterns2.decorator.pizza.ingredients.*;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testPizzaWithBacon() {
        //given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new BaconDecorator(pizzaOrder);
        //when
        BigDecimal theCost = pizzaOrder.getCost();
        String description = pizzaOrder.getDescription();
        //then
        assertEquals(new BigDecimal(35), theCost);
        assertEquals("Pizza: base, tomato sauce, cheese, bacon", description);
    }

    @Test
    public void testPizzaWithBaconAndExtraCheese() {
        //given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new BaconDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        //when
        BigDecimal theCost = pizzaOrder.getCost();
        String description = pizzaOrder.getDescription();
        //then
        assertEquals(new BigDecimal(45), theCost);
        assertEquals("Pizza: base, tomato sauce, cheese, bacon + extra cheese", description);
    }

    @Test
    public void testPizzaWithAllIngredientsAndExtraCheese() {
        //given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new BaconDecorator(pizzaOrder);
        pizzaOrder = new ChickenDecorator(pizzaOrder);
        pizzaOrder = new MozzarellaDecorator(pizzaOrder);
        pizzaOrder = new MushroomsDecorator(pizzaOrder);
        pizzaOrder = new OnionDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        //when
        BigDecimal theCost = pizzaOrder.getCost();
        String description = pizzaOrder.getDescription();
        //then
        assertEquals(new BigDecimal(85), theCost);
        assertEquals("Pizza: base, tomato sauce, cheese, bacon, chicken, mozzarella, mushrooms, onion + extra cheese", description);
    }
}
