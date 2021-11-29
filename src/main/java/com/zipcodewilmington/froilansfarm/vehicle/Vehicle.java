package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;

// Rider` can `mount` and `dismount` a `Rideable` object.
// Vehicle` are `NoiseMaker` and `Rideable

public abstract class Vehicle implements FarmVehicle, Rideable, NoiseMaker {

    private String valueOperate = "The Tractor Machine is starting operation!";
    private Boolean isMounted;

    public Vehicle() {
        this.isMounted = false;
    }


    public Vehicle(String valueOperate, Boolean isMounted) {
        this.valueOperate = valueOperate;
        this.isMounted = isMounted;
    }

    public abstract void operate(Farm farm);

    public Boolean isMounted() {
        return true;
    }
}
