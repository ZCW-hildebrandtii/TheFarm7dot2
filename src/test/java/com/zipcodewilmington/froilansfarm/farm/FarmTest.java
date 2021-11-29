package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.edibles.*;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.vehicle.CropDuster;
import org.junit.Assert;
import org.junit.Test;

public class FarmTest {
    private Farm farm = Farm.getInstance();

    @Test
    public void testInstance() {
        // Then
        Assert.assertNotNull(farm);
        Assert.assertNotNull(farm.getCropDuster());
        Assert.assertNotNull(farm.getTractor());
        Assert.assertNotNull(farm.getFarmHouse());
        Assert.assertNotNull(farm.getField());
        Assert.assertNotNull(farm.getStables());
        Assert.assertNotNull(farm.getListOfCoops());
        Assert.assertNotNull(farm.getFood());
    }

    @Test
    public void testAddFood() {
        // Given
        Edible carrot = new Carrot();
        Edible earOfCorn = new EarOfCorn();
        Edible egg = new Egg();
        Edible pepper = new Pepper();
        Edible potato = new Potato();
        Edible tomato = new Tomato();

        // When
        farm.addFood(carrot);
        farm.addFood(earOfCorn);
        farm.addFood(egg);
        farm.addFood(pepper);
        farm.addFood(potato);
        farm.addFood(tomato);

        // Then
        Assert.assertEquals(carrot, farm.getCarrot());
        Assert.assertEquals(earOfCorn, farm.getEarOfCorn());
        Assert.assertEquals(egg, farm.getEgg());
        Assert.assertEquals(pepper, farm.getPepper());
        Assert.assertEquals(potato, farm.getPotato());
        Assert.assertEquals(tomato, farm.getTomato());
    }

    @Test
    public void testGetFood() {
        // Given
        Edible carrot = new Carrot();
        Edible egg = new Egg();
        Edible tomato = new Tomato();
        Integer expected = 2;

        // When
        farm.addFood(carrot);
        farm.addFood(egg);
        farm.addFood(tomato);
        farm.getCarrot();
        Integer actual = farm.getFood().size();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
