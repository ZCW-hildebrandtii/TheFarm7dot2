package com.zipcodewilmington.froilansfarm.vehicle;
import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;

//public class Tractor extends Vehicle

// " FarmVehicle` can `operate` on a `Farm`"
// " Tractor` is a `FarmVehicle` which can `harvest` a `Crop`."
// Comment : meaning that FarmVehicle can ONLY Operate ,but Tractor can operate and harvest.


public class Tractor implements FarmVehicle {

    private  String valueOperate = "The Tractor Machine is starting operation!";
    private  String valueHarvest = "The Tractor is harvesting";


    public Tractor(String valueOperate, String valueHarvest) {
        this.valueOperate = valueOperate;
        this.valueHarvest= valueHarvest;
    }

    public Crop harvest(Crop crop) {

        System.out.println(valueHarvest);
        return crop;
    }


    public String operate() {

        return valueOperate;

    }


    @Override
    public String toString () {

        return "Tractor{}";
    }



}
