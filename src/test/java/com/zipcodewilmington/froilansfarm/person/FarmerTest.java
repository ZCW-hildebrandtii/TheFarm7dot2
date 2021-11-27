package com.zipcodewilmington.froilansfarm.person;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import org.junit.Assert;
import org.junit.Test;

public class FarmerTest {

    @Test
    public void makeNoiseTest(){
        //given
        Farmer farmer = new Farmer();
        String expected = "HOWDY";

        //When
        String actual = farmer.makeNoise();

        //then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void nameTest(){
        //Given
        String expected = "Froilan";
        Farmer farmer = new Farmer(expected);

        //When
        String actual = farmer.getName();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setNameTest(){
        //Given
        String expected = "Froilan";
        Person person = new Farmer(expected);

        //When
        String actual = person.getName();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void eatTest(){
        //Given
        Person froilan = new Farmer("Froilan");
        Egg egg = new Egg();
        Integer expected = 1;
        //When

        froilan.eat(egg);
        froilan.getMealList();

        //Then
        Assert.assertTrue(farmer.meals.contains(egg));

    }

    @Test
    public void eatTest(){
        //Given
        Person froilan = new Farmer("Froilan");
        Tomato tomato = new Tomato();
        Integer expected = 1;
        //When

        froilan.eat(egg);
        froilan.getMealList();

        //Then
        Assert.assertTrue(farmer.meals.contains(egg));


    }
