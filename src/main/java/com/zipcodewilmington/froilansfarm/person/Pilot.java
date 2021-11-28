package com.zipcodewilmington.froilansfarm.person;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

public class Pilot extends Person implements Rider {
    @Override
    public Boolean eat(Edible edible) {

        return null;
    }

    @Override
    public Object makeNoise() {

        return null;
    }

    @Override
    public void mount() {

    }

    @Override
    public void dismount() {

    }
}
