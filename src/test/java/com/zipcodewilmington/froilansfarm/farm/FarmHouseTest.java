package com.zipcodewilmington.froilansfarm.farm;

import org.junit.Assert;
import org.junit.Test;

public class FarmHouseTest {

    @Test
    public void testConstructor() {
        // Given
        FarmHouse farmHouse = new FarmHouse();

        // Then
        Assert.assertNotNull(farmHouse.getFroilan());
        Assert.assertNotNull(farmHouse.getFroilanda());
    }
}
