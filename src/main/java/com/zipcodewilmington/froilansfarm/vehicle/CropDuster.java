package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.farm.CropRow;
import com.zipcodewilmington.froilansfarm.interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;


// 1a. "CropDuster` is a `FarmVehicle` and `Aircraft` which can `fertilize` a `CropRow`"
// 1b. Meaning that CropDuster can operate and Fly.
// 2a. "On `Monday`, his sister, `Froilanda` uses the `CropDuster` to `fly` over the `Field` and `fertilize` each of the `CropRow"`
// 2b. Meaning that CropDuster can fertilize.

public class CropDuster implements Aircraft, FarmVehicle {
    private CropRow cropRow;

    public CropDuster() {

    }


    public void operate() {

        System.out.println( "The CropDuster Machine is starting operation!");
    }

    public void fly() {
        System.out.println( "The CropDuster Machine is FLYING over the field!!");
    }


    public void fertilize( CropRow cropRow) {

        System.out.println( "All crops have been fertilized " + cropRow);
    }


    @Override
    public String toString () {
        return "CropDuster";
    }
}
