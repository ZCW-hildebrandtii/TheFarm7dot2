package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.farm.Farm;

public interface FarmVehicle {
    // FarmVehicle` can `operate` on a `Farm`
    // Tractor` is a `FarmVehicle` which can `harvest` a `Crop`. //when you harvest a crop u will yield a corressponding edibles
    //Here usually tractor harvesting will be happening by croprow or by field so i thot like will go by cropRow and yield the edibles
    //
    // Comment : meaning that FarmVehicle can ONLY Operate ,but Tractor can operate and harvest.
    void operate(Farm farm);
}
