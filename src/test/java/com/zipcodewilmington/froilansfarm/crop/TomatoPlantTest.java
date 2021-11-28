package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import org.junit.Assert;
import org.junit.Test;

public class TomatoPlantTest {

    @Test
    public void testNullYield() {
        // Given
        TomatoPlant tomatoPlant = new TomatoPlant();
        Edible expected = null;

        // When
        Edible actual = tomatoPlant.yield();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCropYield() {
        // Given
        Crop tomatoPlant = new TomatoPlant();

        // When
        tomatoPlant.setHasBeenFertilized(true);
        Edible actual = tomatoPlant.yield();

        // Then
        Assert.assertNotNull(actual);
    }
}
