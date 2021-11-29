package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.farm.CropRow;
import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.Field;
import com.zipcodewilmington.froilansfarm.interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;

import java.util.List;

// 1a. "CropDuster` is a `FarmVehicle` and `Aircraft` which can `fertilize` a `CropRow`"
// 1b. Meaning that CropDuster can operate and Fly.
// 2a. "On `Monday`, his sister, `Froilanda` uses the `CropDuster` to `fly` over the `Field` and `fertilize` each of the `CropRow"`
// 2b. Meaning that CropDuster can fertilize.


public class CropDuster extends Vehicle implements Aircraft {

    private  String valueOperate = "The CropDuster is starting operation!";
    private  String valueFly = "The CropDuster Machine is FLYING over the field!!";

    public CropDuster() {

    }

    @Override
    public void operate(Farm farm) {

        System.out.println(valueOperate);
        int cropRowIndex = 1;
        for (CropRow cropRow : farm.getField().getCropRows()) {

            if (cropRow.getCropRow().size() > 0) {
                List<Edible> harvestedEdibles = cropRow.harvestCropRow();
                System.out.println(harvestedEdibles.size() + " " + harvestedEdibles.get(0).getClass().getSimpleName() + " produced from Crop Row: " + cropRowIndex);
                for (Edible edible : harvestedEdibles) {
                    farm.addFood(edible);
                }
            }
            else {
                System.out.println("No crop available to harvest from Crop Row: " + cropRowIndex);
            }
        }
    }


    public String fly(Field field) {

        System.out.println(valueFly);
        int rowIndex = 1;
        for (CropRow cropRow : field.getCropRows()) {
            if (cropRow.getCropRow().size() > 0) {
                cropRow.fertilizeCropRow();
                System.out.println(cropRow.cropRowSize() + " " + cropRow.getCropRow().get(0).getClass().getSimpleName() + " crops have been fertilized in CropRow: " + rowIndex++);
            }
            else {
                System.out.println("No crops available to fertilize in CropRow: " + rowIndex++);
            }
        }
        return "All crops have been fertilized in CropRow";
    }

    @Override
    public String toString () {

        return "CropDuster{}";
    }

    @Override
    public Object makeNoise() {
        return null;
    }
}
