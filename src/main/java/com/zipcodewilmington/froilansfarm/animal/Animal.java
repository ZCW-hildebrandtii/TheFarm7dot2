package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;

public abstract class Animal implements Eater, NoiseMaker {
    private boolean isEggFertilized;

    public Animal() {
        this.isEggFertilized = false;
    }

    public void setEggFertilized(boolean isEggFertilized) {
        this.isEggFertilized = isEggFertilized;
    }

    public boolean getEggFertilized() {
        return this.isEggFertilized;
    }
}
