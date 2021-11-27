package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.edibles.EarOfCorn;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class CornStalk extends Crop {

    @Override
    public Edible yield() {
        if (this.hasBeenFertilized() && !this.hasBeenHarvested()) {
            this.setHasBeenHarvested(true);
            this.setHasBeenFertilized(false);
            return new EarOfCorn();
        }
        return null;
    }
}
