package com.zipcodewilmington.froilansfarm.person;

import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;

public abstract class Person implements Eater, NoiseMaker {

    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Boolean eat(Edible edible) {

        if (edible.isEdible()) {
            System.out.println("Already Ate");
        }
        else {
            System.out.println(this.name + " is eating the " + edible.getClass().getSimpleName());
            edible.setEdible(Boolean.TRUE);
        }
        return edible.isEdible();
    }

    @Override
    public Object makeNoise() {
        return "HOWDY";
    }
}
