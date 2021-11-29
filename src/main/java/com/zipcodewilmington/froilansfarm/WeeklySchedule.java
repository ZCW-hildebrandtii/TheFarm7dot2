package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.animal.Chicken;
import com.zipcodewilmington.froilansfarm.animal.Horse;
import com.zipcodewilmington.froilansfarm.crop.*;
import com.zipcodewilmington.froilansfarm.edibles.Carrot;
import com.zipcodewilmington.froilansfarm.edibles.EarOfCorn;
import com.zipcodewilmington.froilansfarm.edibles.Egg;
import com.zipcodewilmington.froilansfarm.edibles.Tomato;
import com.zipcodewilmington.froilansfarm.farm.CropRow;
import com.zipcodewilmington.froilansfarm.person.Farmer;
import com.zipcodewilmington.froilansfarm.person.Pilot;
import java.util.ArrayList;

public class WeeklySchedule {
    Farmer froilan = new Farmer();
    Pilot froilanda = new Pilot();
    Horse horse = new Horse();
    Chicken chicken = new Chicken();
    CropRow cropRow = new CropRow();
    CornStalk cornStalk = new CornStalk();
    EarOfCorn corn = new EarOfCorn();
    TomatoPlant tomatoPlant = new TomatoPlant();
    Tomato tomato = new Tomato();
    Egg egg = new Egg();
    PotatoPlant potatoPlant = new PotatoPlant();
    PepperPlant pepperPlant = new PepperPlant();
    CarrotPlant carrotPlant = new CarrotPlant();
    Carrot carrot = new Carrot();

    public void dailyActivities() {
        /*TODO : Every morning, Froilan and Froilanda:
            - Ride each HORSE in each STABLE
            - Feed each HORSE 3 EAROFCORN
            - Breakfast:
                - Froilan eats 1 EAROFCORN, 2 TOMATO, 5 EGG
                - FROILANDA eats 2 EAROFCORN, 1 TOMATO, 2 EGG
     */
        froilan.mount(horse);
        horse.eat(carrot);
        chicken.eat(corn);
//        froilan.eat(corn, tomato, egg);
//        froilanda.eat(corn, tomato, egg);
    }

    public void sunday() {
        //TODO : Froilan plants 3 Crops (CORNSTALK, TOMATOPLANT, POTATOPLANT) in CropRow 1, 2, 3
        dailyActivities();
        froilan.plant(cornStalk, cropRow);
        froilan.plant(tomatoPlant, cropRow);
        froilan.plant(potatoPlant, cropRow);
    }

    public void monday() {
        //TODO : Froilanda uses CROPDUSTER to FLY over FIELD and FERTILIZE each CROPROW 1, 2, 3
        dailyActivities();
    }

    public void tuesday() {
        //TODO : FROILAN uses TRACTOR to HARVEST each CROP in each CROPROW
        dailyActivities();
    }

    public void wednesday() {
        //TODO : FROILAN harvests EGGS from each CHICKEN
        dailyActivities();
        chicken.yield();
    }

    public void thursday() {
        //TODO : Froilan plants 2 CROPS (PEPPERPLANT, CARROTPLANT) in CropRow 4, 5
        dailyActivities();
        froilan.plant(pepperPlant, cropRow);
        froilan.plant(carrotPlant, cropRow);
    }

    public void friday() {
        //TODO : Froilanda uses CROPDUSTER to FLY over FIELD and FERTILIZE each CROPROW 4, 5
        dailyActivities();
    }

    public void saturday() {
        //TODO : Froilan uses Tractor to Harvest each Crop in each CropRow 4, 5
        dailyActivities();
    }
}
