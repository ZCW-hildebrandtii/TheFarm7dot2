package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.interfaces.Storage;

import java.util.ArrayList;
import java.util.List;

public final class Farm implements Storage {

    private static final Farm INSTANCE = new Farm(4, 3);

    private CropDuster cropDuster;
    private Tractor tractor;
    private FarmHouse farmHouse;
    private List<Edible> edibles = new ArrayList<>();
    private List<Stable> stables;
    private List<ChickenCoop> listOfCoops;
    private Field field;


    private Farm(int numOfCoops, int numOfStables) {
        this.cropDuster = new CropDuster();
        this.tractor = new Tractor();
        this.field = new Field(5);
        this.listOfCoops = new ArrayList<>();
        this.stables = new ArrayList<>();
        this.farmHouse = new FarmHouse();

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
