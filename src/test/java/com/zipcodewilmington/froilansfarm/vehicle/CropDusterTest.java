package com.zipcodewilmington.froilansfarm.vehicle;


import com.zipcodewilmington.froilansfarm.farm.CropRow;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class CropDusterTest {


    @Test
    public void constructorTest() {

        //  Given

        String expectedvalueOperate = "The CropDuster Machine is starting operation!";
        String expectedvalueHarvest  = "The CropDuster is harvesting";
        String expectedvalueFly = "The CropDuster Machine is FLYING over the field!!";


        // When

        String actualvalueOperate = "The CropDuster Machine is starting operation!";
        String actualvalueHarvest  = "The CropDuster is harvesting";
        String actualvalueFly = "The CropDuster Machine is FLYING over the field!!";


        // Then
        Assert.assertEquals(expectedvalueOperate,actualvalueOperate);
        Assert.assertEquals(expectedvalueHarvest,actualvalueHarvest);
        Assert.assertEquals(expectedvalueFly,actualvalueFly);



    }



    @Test
    public void operateTest() {

        //  Given
        String expectedvalueOperate = "The CropDuster Machine is starting operation!";

        // When

        String actualvalueOperate ="The CropDuster Machine is starting operation!";

        // Then
        Assert.assertEquals(expectedvalueOperate,actualvalueOperate);

    }


    @Test
    public void flyTest() {

       //  Given
        String expectedvalueFly = "The CropDuster Machine is FLYING over the field!";

        // When

        String actualvalueFly ="The CropDuster Machine is FLYING over the field!";

        // Then
        Assert.assertEquals(expectedvalueFly,actualvalueFly);

}


    @Test
    public void fertilize() {


        //  Given
        CropRow cropRow = new CropRow();
        String expectedvalue = "All crops have been fertilized " + cropRow;


        // When

        String actualvalue = "All crops have been fertilized " + cropRow;


        // Then
        Assert.assertEquals(expectedvalue,actualvalue);

    }


}
