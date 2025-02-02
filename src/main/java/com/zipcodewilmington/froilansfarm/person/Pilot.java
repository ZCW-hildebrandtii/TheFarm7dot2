package com.zipcodewilmington.froilansfarm.person;

import com.zipcodewilmington.froilansfarm.farm.Field;
import com.zipcodewilmington.froilansfarm.interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

public class Pilot extends Person implements Rider {

    public Pilot() {

    }

    public Pilot(String name) {
        this.name = name;
    }

    @Override
    public void mount(Rideable rideable) {
        rideable.setMounted(true);
    }

    @Override
    public void dismount(Rideable rideable) {
        rideable.setMounted(false);
    }

    public String fertilize(Aircraft aircraft, Field field) {
        return aircraft.fly(field);
    }
}
