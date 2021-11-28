package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.crop.CarrotPlant;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;

public class Horse extends Animal implements Rideable {

    private boolean mounted;

    @Override
    public Boolean eat(Edible edible) {
        CarrotPlant carrot = new CarrotPlant();

        if (carrot.hasBeenHarvested()) {
            edible = carrot.yield();
            return true;
        }

        return false;
    }

    @Override
    public String makeNoise() {
        return "neigh";
    }

    @Override
    public Boolean isMounted() {

        return mounted;
    }

    @Override
    public Boolean isDismounted() {

        return mounted;
    }

    @Override
    public void setMounted(boolean mount) {

        this.mounted = mount;
    }
}
