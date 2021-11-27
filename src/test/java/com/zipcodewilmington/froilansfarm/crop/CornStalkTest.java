package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import org.junit.Assert;
import org.junit.Test;

public class CornStalkTest {
    @Test
    public void testNullYield() {
        // Given
        CornStalk cornStalk = new CornStalk();
        Edible expected = null;

        // When
        Edible actual = cornStalk.yield();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCropYield() {
        // Given
        Crop cornStalk = new CornStalk();

        // When
        cornStalk.setHasBeenFertilized(true);
        Edible actual = cornStalk.yield();

        // Then
        Assert.assertNotNull(actual);
    }
}
