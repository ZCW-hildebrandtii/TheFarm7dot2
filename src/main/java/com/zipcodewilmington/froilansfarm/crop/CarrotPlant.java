package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.edibles.Carrot;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class CarrotPlant extends Crop {

    @Override
    public Edible yield() {
        if (this.hasBeenFertilized() && !this.hasBeenHarvested()) {
            this.setHasBeenHarvested(true);
            this.setHasBeenFertilized(false);
            return new Carrot();
        }
        return null;
    }
}
