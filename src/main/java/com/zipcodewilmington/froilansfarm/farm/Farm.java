package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Storage;
import com.zipcodewilmington.froilansfarm.vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicle.Tractor;

import java.util.ArrayList;
import java.util.List;

public final class Farm implements Storage {

    private static final Farm INSTANCE = new Farm();

    private CropDuster cropDuster = new CropDuster();
    private Tractor tractor = new Tractor();
    private FarmHouse farmHouse = new FarmHouse();
    private List<Stable> stables = new ArrayList<>();
    private List<ChickenCoop> chickenCoops = new ArrayList<>();
    private Field field = new Field();
    private List<Edible> edibles = new ArrayList<>();

    public Farm() {

    }

    @Override
    public void store() {

    }
}
