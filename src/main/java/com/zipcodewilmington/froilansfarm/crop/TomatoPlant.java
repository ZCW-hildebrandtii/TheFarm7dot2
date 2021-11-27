package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.edibles.Tomato;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class TomatoPlant extends Crop {

    @Override
    public Edible yield() {
        if (this.hasBeenFertilized() && !this.hasBeenHarvested()) {
            this.setHasBeenHarvested(true);
            this.setHasBeenFertilized(false);
            return new Tomato();
        }
        return null;
    }
}
