package com.zipcodewilmington.froilansfarm.person;

import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;

public abstract class Person implements Eater, NoiseMaker {

    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
