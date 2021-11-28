package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.farm.CropRow;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;

public class Tractor extends Vehicle implements FarmVehicle {

    @Override
    public void harvest(CropRow cropRow) {

    }

    @Override
    public Boolean isMounted() {
        return null;
    }

    @Override
    public Boolean isDismounted() {
        return null;
    }
}
