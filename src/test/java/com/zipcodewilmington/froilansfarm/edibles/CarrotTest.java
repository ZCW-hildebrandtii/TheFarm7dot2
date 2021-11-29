package com.zipcodewilmington.froilansfarm.edibles;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import org.junit.Assert;
import org.junit.Test;

public class CarrotTest {

    @Test
    public void testConstructor() {
        // Given
        Carrot carrot = new Carrot();

        // Then
        Assert.assertTrue(carrot.isEdible());
    }

    @Test
    public void testInstanceOfEdible() {
        // Given
        Carrot carrot = new Carrot();

        // Then
        Assert.assertTrue(carrot instanceof Edible);
    }

    @Test
    public void testSetEdible() {
        // Given
        Carrot carrot = new Carrot();

        // When
        carrot.setEdible(false);

        // Then
        Assert.assertFalse(carrot.isEdible());
    }
}
