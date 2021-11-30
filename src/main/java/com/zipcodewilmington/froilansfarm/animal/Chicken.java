package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.edibles.Egg;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public class Chicken extends Animal implements Produce {
    private boolean hasBeenFertilized;

    public Chicken() {
        this.hasBeenFertilized = false;
    }

    @Override
    public String makeNoise() {
        return "bwak";
    }

    @Override
    public Edible yield() {
        if (this.hasBeenFertilized()) {
            this.setHasBeenFertilized(false);
            return new Egg();
        }
        return null;
    }

    public void setHasBeenFertilized(boolean fertilized) {
        this.hasBeenFertilized = fertilized;
    }

    public boolean hasBeenFertilized() {
        return this.hasBeenFertilized;
    }

    @Override
    public Boolean eat(Edible... edible) {
        return null;
    }
}
