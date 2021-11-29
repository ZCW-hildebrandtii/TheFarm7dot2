package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.edibles.*;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Storage;
import com.zipcodewilmington.froilansfarm.vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicle.Tractor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class Farm {

    private static Farm INSTANCE = null;

    private CropDuster cropDuster;
    private Tractor tractor;
    private FarmHouse farmHouse;
    private Field field;
    private List<Stable> stables;
    private List<ChickenCoop> listOfCoops;
    private Map<Integer, Edible> food;

    private Farm(int numOfCoops, int numOfStables) {
        this.cropDuster = new CropDuster();
        this.tractor = new Tractor();
        this.farmHouse = new FarmHouse();
        this.field = new Field(5);
        this.listOfCoops = new ArrayList<>();
        this.stables = new ArrayList<>();
        this.food = new HashMap<>();

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

    public void addFood(Edible food) {
        if (food instanceof Carrot) {
            this.food.put(1, food);
        } else if (food instanceof EarOfCorn) {
            this.food.put(2, food);
        } else if (food instanceof Egg) {
            this.food.put(3, food);
        } else if (food instanceof Pepper) {
            this.food.put(4, food);
        } else if (food instanceof Potato) {
            this.food.put(5, food);
        } else if (food instanceof Tomato) {
            this.food.put(6, food);
        }
    }

    public Edible getCarrot() {
        Edible carrot = this.food.get(1);
        this.food.remove(1);
        return carrot;
    }

    public Edible getEarOfCorn() {
        Edible earOfCorn = this.food.get(2);
        this.food.remove(2);
        return earOfCorn;
    }

    public Edible getEgg() {
        Edible egg = this.food.get(3);
        this.food.remove(3);
        return egg;
    }

    public Edible getPepper() {
        Edible pepper = this.food.get(4);
        this.food.remove(4);
        return pepper;
    }

    public Edible getPotato() {
        Edible potato = this.food.get(5);
        this.food.remove(5);
        return potato;
    }

    public Edible getTomato() {
        Edible tomato = this.food.get(6);
        this.food.remove(6);
        return tomato;
    }

    public CropDuster getCropDuster() {
        return this.cropDuster;
    }

    public Tractor getTractor() {
        return this.tractor;
    }

    public FarmHouse getFarmHouse() {
        return this.farmHouse;
    }

    public Field getField() {
        return this.field;
    }

    public List<Stable> getStables() {
        return this.stables;
    }

    public List<ChickenCoop> getListOfCoops() {
        return this.listOfCoops;
    }

    public Map<Integer, Edible> getFood() {
        return this.food;
    }

    public static Farm getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Farm(4, 3);
        }
        return INSTANCE;
    }

}
