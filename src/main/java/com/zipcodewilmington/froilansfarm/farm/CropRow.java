package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;

import java.util.ArrayList;
import java.util.List;

public class CropRow {

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

    public List<Edible> harvestCropRow() {
        List<Edible> edibleList = new ArrayList<>();

        for(Crop crop : cropRow) {
            Edible edible = crop.yield();
            if (edible == null) {
                System.out.println("Crop Row is not ready to harvest");
                return null;
            }
            System.out.println("Harvesting " + crop.getClass().getSimpleName() + " from CropRow and produced " + edible.getClass().getSimpleName());
            edibleList.add(edible);
        }
        cropRow.clear();
        return edibleList;
    }
}
