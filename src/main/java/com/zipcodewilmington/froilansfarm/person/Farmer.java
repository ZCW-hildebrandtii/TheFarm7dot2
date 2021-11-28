package com.zipcodewilmington.froilansfarm.person;

import com.zipcodewilmington.froilansfarm.interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

public class Farmer extends Person implements Botanist, Rider {
    @Override
    public Boolean eat(Edible edible) {

        return null;
    }

    @Override
    public Object makeNoise() {

        return null;
    }

    @Override
    public void plant() {

    }

    @Override
    public void mount() {

    }

    @Override
    public void dismount() {

    }
}
