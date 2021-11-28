package com.zipcodewilmington.froilansfarm.person;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

public class Pilot extends Person implements Rider {
    @Override
    public void eat(Edible edible) {

    }

    @Override
    public String makeNoise() {

        return null;
    }

    @Override
    public void mount(Rideable rideable) {

    }

    @Override
    public void dismount(Rideable rideable) {

    }
}
