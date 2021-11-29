package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.animal.Chicken;

import java.util.ArrayList;
import java.util.List;

public class ChickenCoop {

    private List<Chicken> chickenList;

    public ChickenCoop() {
        this.chickenList = new ArrayList<>();
    }

    public void addChicken() {
        this.chickenList.add(new Chicken());
    }

    public List<Chicken> getChickenList() {
        return this.chickenList;
    }

    public Chicken getChicken(int index) {
        if (index < 0 || index >= chickenList.size()) {
            return null;
        } else {
            return this.chickenList.get(index);
        }
    }

}
