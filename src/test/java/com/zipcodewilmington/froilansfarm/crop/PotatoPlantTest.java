package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import org.junit.Assert;
import org.junit.Test;

public class PotatoPlantTest {

    @Test
    public void testNullYield() {
        // Given
        PotatoPlant potatoPlant = new PotatoPlant();
        Edible expected = null;

        // When
        Edible actual = potatoPlant.yield();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCropYield() {
        // Given
        Crop potatoPlant = new PotatoPlant();

        // When
        potatoPlant.setHasBeenFertilized(true);
        Edible actual = potatoPlant.yield();

        // Then
        Assert.assertNotNull(actual);
    }
}
