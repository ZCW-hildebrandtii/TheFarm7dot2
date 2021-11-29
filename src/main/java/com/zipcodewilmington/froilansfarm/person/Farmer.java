package com.zipcodewilmington.froilansfarm.person;

import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.farm.CropRow;
import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

public class Farmer extends Person implements Botanist, Rider {

    public Farmer() {

    }

    public Farmer(String name) {
        this.name = name;
    }

    @Override
    public void plant(Crop crop, CropRow cropRow) {
        cropRow.addCrop(crop);
        System.out.println(this.name + " is planting the crop - " + crop.getClass().getSimpleName() + " in Crop Row : " + cropRow.getCropRow().size());
    }

    @Override
    public void mount(Rideable rideable) {
        rideable.setMounted(true);
    }

    @Override
    public void dismount(Rideable rideable) {
        rideable.setMounted(false);
    }

    public void harvest(FarmVehicle farmVehicle, Farm farm) {
        farmVehicle.operate(farm);
    }
}
