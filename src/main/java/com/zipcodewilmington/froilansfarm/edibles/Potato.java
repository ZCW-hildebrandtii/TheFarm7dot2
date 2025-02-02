package com.zipcodewilmington.froilansfarm.edibles;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class Potato implements Edible {
    private Boolean isEdible;

    public Potato() {
        this.isEdible = true;
    }

    @Override
    public boolean isEdible() {
        return this.isEdible;
    }

    @Override
    public void setEdible(Boolean isEdible) {
        this.isEdible = isEdible;
    }
}
