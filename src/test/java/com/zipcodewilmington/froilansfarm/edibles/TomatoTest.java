package com.zipcodewilmington.froilansfarm.edibles;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import org.junit.Assert;
import org.junit.Test;

public class TomatoTest {

    @Test
    public void testConstructor() {
        // Given
        Tomato tomato = new Tomato();

        // Then
        Assert.assertTrue(tomato.isEdible());
    }

    @Test
    public void testInstanceOfEdible() {
        // Given
        Tomato tomato = new Tomato();

        // Then
        Assert.assertTrue(tomato instanceof Edible);
    }

    @Test
    public void testSetEdible() {
        // Given
        Tomato tomato = new Tomato();

        // When
        tomato.setEdible(false);

        // Then
        Assert.assertFalse(tomato.isEdible());
    }
}
