package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public class Chicken extends Animal implements Produce {
    @Override
    public void eat(Edible edible) {

    }

    @Override
    public String makeNoise() {

        return null;
    }

    @Override
    public Edible yield() {
        return null;
    }
}
