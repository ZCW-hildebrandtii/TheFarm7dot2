package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.crop.CarrotPlant;
import com.zipcodewilmington.froilansfarm.crop.CornStalk;
import com.zipcodewilmington.froilansfarm.crop.PepperPlant;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class CropRowTest {
    @Test
    public void testConstructor() {
        // Given
        CropRow cropRow = new CropRow();
        Integer expected = 0;

        // When
        Integer actual = cropRow.cropRowSize();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAddCrop() {
        // Given
        CropRow cropRow = new CropRow();
        CarrotPlant carrotPlant = new CarrotPlant();
        CornStalk cornStalk = new CornStalk();
        Integer expected = 2;

        // When
        cropRow.addCrop(carrotPlant);
        cropRow.addCrop(cornStalk);
        Integer actual = cropRow.cropRowSize();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveCrop() {
        // Given
        CropRow cropRow = new CropRow();
        CarrotPlant carrotPlant = new CarrotPlant();
        CornStalk cornStalk = new CornStalk();
        Integer expected = 1;

        // When
        cropRow.addCrop(carrotPlant);
        cropRow.addCrop(cornStalk);
        cropRow.removeCrop(cornStalk);
        Integer actual = cropRow.cropRowSize();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFertilizeCropRow() {
        // Given
        CropRow cropRow = new CropRow();
        CarrotPlant carrotPlant = new CarrotPlant();

        // When
        cropRow.addCrop(carrotPlant);
        cropRow.fertilizeCropRow();
        Boolean actual = cropRow.getCropRow().get(0).hasBeenFertilized();

        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void testHarvestCropRow() {
        // Given
        CropRow cropRow = new CropRow();
        CarrotPlant carrotPlant = new CarrotPlant();
        CornStalk cornStalk = new CornStalk();
        PepperPlant pepperPlant = new PepperPlant();
        Integer expected = 3;

        // When
        cropRow.addCrop(carrotPlant);
        cropRow.addCrop(cornStalk);
        cropRow.addCrop(pepperPlant);
        Integer actual = cropRow.harvestCropRow().size();

        // Then
        Assert.assertEquals(expected, actual);

    }
}
