package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.crop.Crop;

import java.util.ArrayList;
import java.util.List;

public class CropRow extends Field {
    private List<Crop> cropRow;

    public CropRow() {
        this.cropRow =  new ArrayList<>();
    }

    public List<Crop> getCropRow() {
        return this.cropRow;
    }

    public Integer cropRowSize() {
        return cropRow.size();
    }

    public void addCrop(Crop crop) {
        cropRow.add(crop);
    }

    public void removeCrop(Crop crop) {
        cropRow.remove(crop);
    }

    public void fertilizeCropRow() {
        for(Crop crop : cropRow) {
            crop.setHasBeenFertilized(true);
        }
    }

    }

