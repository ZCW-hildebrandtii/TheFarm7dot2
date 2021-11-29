package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.animal.Chicken;
import com.zipcodewilmington.froilansfarm.animal.Horse;

import java.util.ArrayList;
import java.util.List;

public class Stable {

    private List<Horse> horseList;

    public Stable() {
        this.horseList = new ArrayList<>();
    }

    public void addHorse() {
        this.horseList.add(new Horse());
    }

    public List<Horse> getHorseList() {
        return this.horseList;
    }

    public Horse getHorse(int index) {
        if (index < 0 || index >= horseList.size()) {
            return null;
        } else {
            return this.horseList.get(index);
        }
    }
}
