package com.zipcodewilmington.froilansfarm.vehicle;
import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;


//public class Tractor extends Vehicle

// " FarmVehicle` can `operate` on a `Farm`"
// " Tractor` is a `FarmVehicle` which can `harvest` a `Crop`."
// Comment : meaning that FarmVehicle can ONLY Operate ,but Tractor can operate and harvest.


public class Tractor implements FarmVehicle {


    public void harvest( Crop crop) {

        System.out.println( "Tractor is harvesting " + crop);

    }


    public void operate() {

        System.out.println( "The Tractor Machine is starting operation!");
    }


    @Override
    public String toString () {

        return "Tractor";
    }



}
