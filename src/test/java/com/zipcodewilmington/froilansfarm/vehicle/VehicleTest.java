package com.zipcodewilmington.froilansfarm.vehicle;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class VehicleTest {


    @Test
    public void Vehicle() {
        String expectedvalueOperate = "The Tractor Machine is starting operation!";
        Boolean expectedisMounted = true;
        Boolean expectedisDismounted = true;

        // When

        String actualvalueOperate = "The Tractor Machine is starting operation!";
        Boolean actualisMounted = true;
        Boolean actualisDismounted = true;

        // Then
        Assert.assertEquals(expectedvalueOperate,actualvalueOperate);
        Assert.assertEquals(true,actualisMounted);
        Assert.assertEquals(true,actualisDismounted);

    }



    @Test
    public  void operateTest() {

        // Given
        String expectedvalueOperate = "The vehicle is starting operation!";

        // When

        String actualvalueOperate = "The vehicle is starting operation!";

        // Then
        Assert.assertEquals(expectedvalueOperate,actualvalueOperate);

    }



    @Test
    public void isMountedTest() {

        Vehicle vehicle = new Tractor();
        assertTrue(vehicle.isMounted());
        assertFalse(vehicle.isMounted());

    }




}
