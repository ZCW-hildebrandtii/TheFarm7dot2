package com.zipcodewilmington.froilansfarm.vehicle;
import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.farm.CropRow;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;

import java.util.List;

//public class Tractor extends Vehicle

// " FarmVehicle` can `operate` on a `Farm`"
// " Tractor` is a `FarmVehicle` which can `harvest` a `Crop`."
// Comment : meaning that FarmVehicle can ONLY Operate ,but Tractor can operate and harvest.


public class Tractor extends Vehicle {

    private  String valueOperate = "The Tractor Machine is starting operation!";
    private  String valueHarvest = "The Tractor is harvesting";


    public Tractor(String valueOperate, String valueHarvest) {
        this.valueOperate = valueOperate;
        this.valueHarvest= valueHarvest;
    }

    public Tractor() {

    }

    public Crop harvest(Crop crop) {

        System.out.println(valueHarvest);
        crop.setHasBeenHarvested(true);
        return crop;
    }


    public List<Edible> operate(CropRow cropRow) {

        List<Edible> edibles = cropRow.harvestCropRow();
        return edibles;
    }


    @Override
    public String toString () {

        return "Tractor{}";
    }

    @Override
    public void setMounted(boolean mount) {

    }

    @Override
    public Boolean isMounted() {
        return null;
    }

    @Override
    public Object makeNoise() {
        return null;
    }
}
