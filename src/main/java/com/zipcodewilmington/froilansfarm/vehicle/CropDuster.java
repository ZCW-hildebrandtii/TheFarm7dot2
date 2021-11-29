package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.farm.CropRow;
import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.Field;
import com.zipcodewilmington.froilansfarm.interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;

import java.util.List;

// 1a. "CropDuster` is a `FarmVehicle` and `Aircraft` which can `fertilize` a `CropRow`"
// 1b. Meaning that CropDuster can operate and Fly.
// 2a. "On `Monday`, his sister, `Froilanda` uses the `CropDuster` to `fly` over the `Field` and `fertilize` each of the `CropRow"`
// 2b. Meaning that CropDuster can fertilize.


public class CropDuster extends Vehicle implements Aircraft {

    private  String valueOperate = "The Tractor Machine is starting operation!";
    private  String valueHarvest = "The Tractor is harvesting";
    private  String valueFly = "The CropDuster Machine is FLYING over the field!!";

    public CropDuster (String valueOperate, String valueHarvest, String valueFly) {
        this.valueOperate = valueOperate;
        this.valueHarvest = valueHarvest;
        this.valueFly=valueFly;
    }

    public CropDuster() {

    }

    public List<Edible> operate(CropRow cropRow) {

        return cropRow.harvestCropRow();
    }


    public String fly(Field field) {
        int rowIndex = 1;
        for (CropRow cropRow : field.getCropRows()) {
            cropRow.fertilizeCropRow();
            System.out.println(cropRow.cropRowSize() + " crops have been fertilized in CropRow: " + rowIndex++);
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

    @Override
    public void setMounted(boolean mount) {

    }

    @Override
    public void operate(Farm farm) {

    }
}
