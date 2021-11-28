package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.farm.CropRow;
import com.zipcodewilmington.froilansfarm.interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;

// 1a. "CropDuster` is a `FarmVehicle` and `Aircraft` which can `fertilize` a `CropRow`"
// 1b. Meaning that CropDuster can operate and Fly.
// 2a. "On `Monday`, his sister, `Froilanda` uses the `CropDuster` to `fly` over the `Field` and `fertilize` each of the `CropRow"`
// 2b. Meaning that CropDuster can fertilize.


public class CropDuster implements Aircraft, FarmVehicle {
    private  String valueOperate = "The Tractor Machine is starting operation!";
    private  String valueHarvest = "The Tractor is harvesting";
    private  String valueFly = "The CropDuster Machine is FLYING over the field!!";

    public CropDuster (String valueOperate, String valueHarvest, String valueFly) {
        this.valueOperate = valueOperate;
        this.valueHarvest = valueHarvest;
        this.valueFly=valueFly;
    }

    public String operate() {

        return this.valueOperate;
    }


    public String fly() {

      return this.valueFly;
    }


    public static String fertilize(CropRow cropRow) {

        return "All crops have been fertilized " + cropRow ;
    }


    @Override
    public String toString () {

        return "CropDuster{}";
    }

}
