package com.zipcodewilmington.froilansfarm.edibles;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class Egg implements Edible {
    private Boolean edible;

    public Egg() {
        this.edible = false;
    }

    @Override
    public boolean isEdible() {
        return this.edible;
    }

    @Override
    public void setEdible(Boolean isEdible) {
        this.edible = isEdible;
    }
}
