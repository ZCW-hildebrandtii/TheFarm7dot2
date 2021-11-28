package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.crop.Crop;

public class CropRow extends Field {

    private Crop crop;
    
    public void store(Crop crop) {
        this.crop = crop;
    }
}
