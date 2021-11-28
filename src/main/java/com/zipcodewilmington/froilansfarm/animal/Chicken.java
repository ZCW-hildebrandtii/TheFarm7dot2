package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.edibles.Egg;
import com.zipcodewilmington.froilansfarm.crop.CornStalk;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public class Chicken extends Animal implements Produce {
    @Override
    public Boolean eat(Edible edible) {
        if (edible == null) {
            return false;
        }
        if (edible.isEdible()) {
            edible.setEdible(false);
            return true;
        }
        return false;
    }

    @Override
    public String makeNoise() {
        return "bwak";
    }

    @Override
    public Edible yield() {
        if (this.getEggFertilized()) {
            this.setEggFertilized(true);
            return new Egg();
        }

        return null;
    }
}
