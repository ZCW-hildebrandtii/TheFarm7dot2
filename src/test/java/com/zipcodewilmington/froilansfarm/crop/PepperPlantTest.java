package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import org.junit.Assert;
import org.junit.Test;

public class PepperPlantTest {

    @Test
    public void testNullYield() {
        // Given
        PepperPlant pepperPlant = new PepperPlant();
        Edible expected = null;

        // When
        Edible actual = pepperPlant.yield();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCropYield() {
        // Given
        Crop pepperPlant = new PepperPlant();

        // When
        pepperPlant.setHasBeenFertilized(true);
        Edible actual = pepperPlant.yield();

        // Then
        Assert.assertNotNull(actual);
    }
}
