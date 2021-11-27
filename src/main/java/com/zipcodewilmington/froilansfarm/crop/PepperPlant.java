package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.edibles.Pepper;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class PepperPlant extends Crop {

    @Override
    public Edible yield() {
        if (this.hasBeenFertilized() && !this.hasBeenHarvested()) {
            this.setHasBeenHarvested(true);
            this.setHasBeenFertilized(false);
            return new Pepper();
        }
        return null;
    }
}
