package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public abstract class Crop implements Produce {
    private Boolean hasBeenHarvested;
    private Boolean hasBeenFertilized;

    public Crop() {
        this.hasBeenFertilized = false;
        this.hasBeenHarvested = false;
    }

    public Boolean hasBeenHarvested() {
        return this.hasBeenHarvested;
    }

    public Boolean hasBeenFertilized() {
        return this.hasBeenFertilized;
    }

    public void setHasBeenHarvested(Boolean harvested) {
        this.hasBeenHarvested = harvested;
    }

    public void setHasBeenFertilized(Boolean fertilized) {
        this.hasBeenFertilized = fertilized;
    }
}
