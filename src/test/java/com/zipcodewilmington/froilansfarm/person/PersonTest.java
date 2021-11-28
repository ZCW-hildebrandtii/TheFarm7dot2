package com.zipcodewilmington.froilansfarm.person;

import com.zipcodewilmington.froilansfarm.edibles.Tomato;
import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void testConstructor(){
        String expected = "Gaha";
        Person person = new Person(expected);

        //When
        String actual = person.getName();

        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testSetName(){
        //Given
        String expected = "keerthi";

        //When
        Person person = new Person();
        String actual = person.getName();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testMakeNoise() {
        //given
        String expected = "Hello";
        Person person = new Person();
        //when
        String actual = person.makeNoise();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEat() {
        //given
        Person person = new Person();
        //when
        Tomato tomato = new Tomato();
        person.eat(tomato);
        person.getMealList();
        //then
        Assert.assertTrue(person.meals.contains(tomato));
    }

}
