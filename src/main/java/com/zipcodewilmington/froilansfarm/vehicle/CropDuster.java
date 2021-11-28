package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.farm.CropRow;
import com.zipcodewilmington.froilansfarm.interfaces.Aircraft;


public class CropDuster extends Vehicle implements Aircraft {

    //CropDuster` is a `FarmVehicle` and `Aircraft` which can `fertilize` a `CropRow`
    // His sister, `Froilanda`, is a `Pilot` who uses a `CropDuster
    // On `Monday`, his sister, `Froilanda` uses the `CropDuster` to `fly` over the `Field` and `fertilize` each of the `CropRow`



    public void fly() {


    }


    public void operate() {

    }


    public void fertilize( CropRow Crop) {

        return null;
    }




    @Override
    public String toString () {
        return "CropDuster";
    }
}
