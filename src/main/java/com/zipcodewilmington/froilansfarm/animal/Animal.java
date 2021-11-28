package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;

public abstract class Animal implements Eater, NoiseMaker {

    public Animal() {

    }

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
}
