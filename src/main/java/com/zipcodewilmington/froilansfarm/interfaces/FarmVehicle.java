package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.farm.CropRow;

public interface FarmVehicle {
    // FarmVehicle` can `operate` on a `Farm`
    // Tractor` is a `FarmVehicle` which can `harvest` a `Crop`.
    // Comment : meaning that FarmVehicle can ONLY Operate ,but Tractor can operate and harvest.
    String operate();
}
