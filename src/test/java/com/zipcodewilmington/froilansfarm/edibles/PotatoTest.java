package com.zipcodewilmington.froilansfarm.edibles;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import org.junit.Assert;
import org.junit.Test;

public class PotatoTest {

    @Test
    public void testConstructor() {
        // Given
        Potato potato = new Potato();

        // Then
        Assert.assertTrue(potato.isEdible());
    }

    @Test
    public void testInstanceOfEdible() {
        // Given
        Potato potato = new Potato();

        // Then
        Assert.assertTrue(potato instanceof Edible);
    }

    @Test
    public void testSetEdible() {
        // Given
        Potato potato = new Potato();

        // When
        potato.setEdible(false);

        // Then
        Assert.assertFalse(potato.isEdible());
    }
}
