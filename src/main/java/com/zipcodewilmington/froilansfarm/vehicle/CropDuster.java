package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.farm.CropRow;
import com.zipcodewilmington.froilansfarm.interfaces.Aircraft;


public class CropDuster extends Vehicle implements Aircraft {

    //CropDuster` is a `FarmVehicle` and `Aircraft` which can `fertilize` a `CropRow`
    // His sister, `Froilanda`, is a `Pilot` who uses a `CropDuster
    // On `Monday`, his sister, `Froilanda` uses the `CropDuster` to `fly` over the `Field` and `fertilize` each of the `CropRow`


    public void fly() {

        System.out.println( "The CropDuster Machine is FLYING over the field!!");
    }


    public void operate() {

        System.out.println( "The CropDuster Machine is starting operation!");
    }


    public void fertilize( CropRow cropRow) {

        System.out.println( "All crops have been fertilized " + cropRow);
    }



    @Override
    public String toString () {
        return "CropDuster";
    }
}
