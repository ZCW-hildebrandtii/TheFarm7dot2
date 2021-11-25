package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;

public class Horse extends Animal implements Rideable {
    @Override
    public void eat(Edible edible) {

    }

    @Override
    public void makeNoise() {

    }

    @Override
    public Boolean isMounted() {
        return null;
    }

    @Override
    public Boolean isDismounted() {
        return null;
    }
}
