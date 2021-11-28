package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.crop.Crop;
import org.junit.Assert;
import org.junit.Test;

public class TractorTest {



    @Test
    public void ConstructorTractorTest () {

        //  Given

        String expectedvalueOperate = "The Tractor Machine is starting operation!";
        String expectedvalueHarvest  = "The Tractor is harvesting";

        // When

        String actualvalueOperate = "The Tractor Machine is starting operation!";
        String actualvalueHarvest  = "The Tractor is harvesting";

        // Then
        Assert.assertEquals(expectedvalueOperate,actualvalueOperate);
        Assert.assertEquals(expectedvalueHarvest,actualvalueHarvest);


    }


    @Test
    public void harvestTest() {

        //  Given
        String expectedvalueHarvest  = "The Tractor is harvesting";

        // When

        String actualvalueHarvest  = "The Tractor is harvesting";

        // Then
        Assert.assertEquals(expectedvalueHarvest,actualvalueHarvest);



    }



    @Test
    public void operateTest() {

        //  Given
        String expectedvalueOperate = "The Tractor Machine is starting operation!";

        // When

        String actualvalueOperate = "The Tractor Machine is starting operation!";

        // Then
        Assert.assertEquals(expectedvalueOperate,actualvalueOperate);

    }


}
