package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.animal.Chicken;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ChickenCoopTest {

    @Test
    public void testGetChickenList() {
        // Given
        ChickenCoop chickenCoop = new ChickenCoop();

        // Then
        Assert.assertNotNull(chickenCoop.getChickenList());
    }

    @Test
    public void testGetChicken() {
        // Given
        ChickenCoop chickenCoop = new ChickenCoop();

        // When
        chickenCoop.addChicken();
        chickenCoop.addChicken();

        Chicken actual = chickenCoop.getChicken(1);

        // Then
        Assert.assertTrue(actual instanceof Chicken);
        Assert.assertNotNull(actual);
    }
}
