package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.person.Farmer;
import com.zipcodewilmington.froilansfarm.person.Person;
import com.zipcodewilmington.froilansfarm.person.Pilot;

public class FarmHouse {
    private Person Froilan;
    private Person Froilanda;

    public FarmHouse() {
        this.Froilan = new Farmer();
        this.Froilanda = new Pilot();
    }

}
