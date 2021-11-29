package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.farm.CropRow;
import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;

import java.util.List;

//public class Tractor extends Vehicle

// " FarmVehicle` can `operate` on a `Farm`"
// " Tractor` is a `FarmVehicle` which can `harvest` a `Crop`."
// Comment : meaning that FarmVehicle can ONLY Operate ,but Tractor can operate and harvest.


public class Tractor extends Vehicle {

    private  String valueOperate = "The Tractor Machine is starting operation!";

    public Tractor() {

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


    @Override
    public String toString () {

        return "Tractor{}";
    }

    @Override
    public Object makeNoise() {
        return "CHUG CHUG";
    }
}
