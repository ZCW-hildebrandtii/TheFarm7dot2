package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Storage;
import com.zipcodewilmington.froilansfarm.vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicle.Tractor;

import java.util.ArrayList;
import java.util.List;

public final class Farm implements Storage {

    private static final Farm INSTANCE = new Farm(4, 3);

    private CropDuster cropDuster = new CropDuster();
    private Tractor tractor = new Tractor();
    private FarmHouse farmHouse = new FarmHouse();
    private List<Edible> edibles = new ArrayList<>();
    private List<Stable> stables;
    private List<ChickenCoop> listOfCoops;
    private Field field;


    public Farm(int numOfCoops, int numOfStables) {
        this.field = new Field();
        this.listOfCoops = new ArrayList<>();
        this.stables = new ArrayList<>();

        for(int i = 0; i < numOfCoops; i++) {
            this.listOfCoops.add(new ChickenCoop());
        }

        for(int i = 0; i < numOfStables; i++) {
            this.stables.add(new Stable());
        }
    }

    public static Farm getInstance() {
        return INSTANCE;
    }

    @Override
    public void store() {

    }
}
