package com.zipcodewilmington.froilansfarm.edibles;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import org.junit.Assert;
import org.junit.Test;

public class PepperTest {

    @Test
    public void testConstructor() {
        // Given
        Pepper pepper = new Pepper();

        // Then
        Assert.assertTrue(pepper.isEdible());
    }

    @Test
    public void testInstanceOfEdible() {
        // Given
        Pepper pepper = new Pepper();

        // Then
        Assert.assertTrue(pepper instanceof Edible);
    }

    @Test
    public void testSetEdible() {
        // Given
        Pepper pepper = new Pepper();

        // When
        pepper.setEdible(false);

        // Then
        Assert.assertFalse(pepper.isEdible());
    }
}
