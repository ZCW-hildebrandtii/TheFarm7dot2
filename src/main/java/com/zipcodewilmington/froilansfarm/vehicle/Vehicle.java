package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;


// Rider` can `mount` and `dismount` a `Rideable` object.
// Vehicle` are `NoiseMaker` and `Rideable

public abstract class Vehicle implements FarmVehicle, Rideable {

    private  String valueOperate = "The Tractor Machine is starting operation!";
    private  Boolean isMounted = true;
    private  Boolean isDismounted = true;


    public Vehicle(String valueOperate, Boolean isMounted, Boolean isDismounted ) {
        this.valueOperate = valueOperate;
        this.isMounted = isMounted;
        this.isDismounted = isDismounted;

    }



    public String operate() {
        return valueOperate;
    }


//    public Boolean isMounted() {
//
//        return true;
//    }
//
//
//    public Boolean isDismounted() {
//
//        return true;
//    }

}
