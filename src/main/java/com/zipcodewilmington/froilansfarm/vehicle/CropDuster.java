package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.farm.CropRow;
import com.zipcodewilmington.froilansfarm.interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;

public class CropDuster extends Vehicle implements Aircraft {

    @Override
    public void fly(CropRow cropRow) {

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
