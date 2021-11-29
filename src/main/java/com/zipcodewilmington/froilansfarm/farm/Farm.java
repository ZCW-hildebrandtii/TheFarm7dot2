package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Storage;
import com.zipcodewilmington.froilansfarm.vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicle.Tractor;

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
        this.farmHouse = new FarmHouse();
        this.field = new Field(5);
        this.listOfCoops = new ArrayList<>();
        this.stables = new ArrayList<>();

        for (int i = 0; i < numOfCoops; i++) {
            this.listOfCoops.add(new ChickenCoop());
            if (i == 3) {
                for (int j = 0; j < 3; j++) {
                    this.listOfCoops.get(i).addChicken();
                }
            } else {
                for (int j = 0; j < 4; j++) {
                    this.listOfCoops.get(i).addChicken();
                }
            }
        }

        for (int i = 0; i < numOfStables; i++) {
            this.stables.add(new Stable());

            if (i == 0) {
                for (int j = 0; j < 4; j++) {
                    this.stables.get(i).addHorse();
                }
            } else {
                for (int j = 0; j < 3; j++) {
                    this.stables.get(i).addHorse();
                }
            }
        }
    }

    public static Farm getInstance() {
        return INSTANCE;
    }

    @Override
    public void store() {

    }
}
