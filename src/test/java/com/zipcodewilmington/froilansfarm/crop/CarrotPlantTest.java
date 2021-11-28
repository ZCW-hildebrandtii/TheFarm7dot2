package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import org.junit.Assert;
import org.junit.Test;

public class CarrotPlantTest {

    @Test
    public void testNullYield() {
        // Given
        CarrotPlant carrotPlant = new CarrotPlant();
        Edible expected = null;

        // When
        Edible actual = carrotPlant.yield();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCropYield() {
        // Given
        Crop carrotPlant = new CarrotPlant();

        // When
        carrotPlant.setHasBeenFertilized(true);
        Edible actual = carrotPlant.yield();

        // Then
        Assert.assertNotNull(actual);
    }
}
