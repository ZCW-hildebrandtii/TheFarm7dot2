package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;

// Rider` can `mount` and `dismount` a `Rideable` object.
// Vehicle` are `NoiseMaker` and `Rideable

public abstract class Vehicle implements FarmVehicle, Rideable, NoiseMaker {

    private Boolean isMounted;

    public Vehicle() {
        this.isMounted = false;
    }

    public abstract void operate(Farm farm);

    public Boolean isMounted() {
        return isMounted;
    }

    public void setMounted(boolean mount) {
        this.isMounted = mount;
    }
}
