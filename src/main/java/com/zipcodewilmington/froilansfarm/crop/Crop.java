package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public abstract class Crop implements Produce {
    private Boolean isHarvested;

    public Boolean hasBeenHarvested() {
        return isHarvested;
    }
}
