package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.edibles.Potato;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class PotatoPlant extends Crop {

    @Override
    public Edible yield() {
        if (this.hasBeenFertilized() && !this.hasBeenHarvested()) {
            this.setHasBeenHarvested(true);
            this.setHasBeenFertilized(false);
            return new Potato();
        }
        return null;
    }
}
