package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.vehicle.CropDuster;
import org.junit.Assert;
import org.junit.Test;

public class FarmTest {

    @Test
    public void testInstance() {
        // Given
        Farm farm = Farm.getInstance();

        // Then
        Assert.assertNotNull(farm);
        Assert.assertNotNull(farm.getCropDuster());
        Assert.assertNotNull(farm.getTractor());
        Assert.assertNotNull(farm.getFarmHouse());
        Assert.assertNotNull(farm.getField());
        Assert.assertNotNull(farm.getStables());
        Assert.assertNotNull(farm.getListOfCoops());
        Assert.assertNotNull(farm.getFood());
    }
}
