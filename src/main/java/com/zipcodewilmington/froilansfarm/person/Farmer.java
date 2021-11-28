package com.zipcodewilmington.froilansfarm.person;

import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.farm.CropRow;
import com.zipcodewilmington.froilansfarm.interfaces.*;
import com.zipcodewilmington.froilansfarm.vehicle.Tractor;

public class Farmer extends Person implements Botanist, Rider {

    Rideable rideable;

    public Farmer() {

    }

    public Farmer(String name) {
        this.name = name;
    }

    @Override
    public Boolean eat(Edible edible) {

        return null;
    }

    @Override
    public Object makeNoise() {
        return "Hello";
    }

    @Override
    public void plant(Crop crop, CropRow cropRow) {

    }

    @Override
    public void mount(Rideable rideable) {

    }

    @Override
    public void dismount(Rideable rideable) {

    }

    public void harvest(FarmVehicle farmVehicle, CropRow cropRow) {
        farmVehicle.operate();
    }
}
