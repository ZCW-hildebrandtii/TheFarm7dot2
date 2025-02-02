package com.zipcodewilmington.froilansfarm.edibles;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class Carrot implements Edible {

    // isEdible to be replaced to isEaten
    private Boolean isEdible;

    public Carrot() {
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
