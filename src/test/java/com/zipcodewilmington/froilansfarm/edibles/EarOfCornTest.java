package com.zipcodewilmington.froilansfarm.edibles;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import org.junit.Assert;
import org.junit.Test;

public class EarOfCornTest {

    @Test
    public void testConstructor() {
        // Given
        EarOfCorn earOfCorn = new EarOfCorn();

        // Then
        Assert.assertTrue(earOfCorn.isEdible());
    }

    @Test
    public void testInstanceOfEdible() {
        // Given
        EarOfCorn earOfCorn = new EarOfCorn();

        // Then
        Assert.assertTrue(earOfCorn instanceof Edible);
    }

    @Test
    public void testSetEdible() {
        // Given
        EarOfCorn earOfCorn = new EarOfCorn();

        // When
        earOfCorn.setEdible(false);

        // Then
        Assert.assertFalse(earOfCorn.isEdible());
    }
}
