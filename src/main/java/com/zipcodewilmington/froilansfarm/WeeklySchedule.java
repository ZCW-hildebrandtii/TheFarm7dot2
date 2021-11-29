package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.animal.Chicken;
import com.zipcodewilmington.froilansfarm.animal.Horse;
import com.zipcodewilmington.froilansfarm.crop.*;
import com.zipcodewilmington.froilansfarm.edibles.Carrot;
import com.zipcodewilmington.froilansfarm.edibles.EarOfCorn;
import com.zipcodewilmington.froilansfarm.edibles.Egg;
import com.zipcodewilmington.froilansfarm.edibles.Tomato;
import com.zipcodewilmington.froilansfarm.farm.CropRow;
import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.Field;
import com.zipcodewilmington.froilansfarm.interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.person.Farmer;
import com.zipcodewilmington.froilansfarm.person.Pilot;
import com.zipcodewilmington.froilansfarm.vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicle.Tractor;
import com.zipcodewilmington.froilansfarm.vehicle.Vehicle;

public class WeeklySchedule {
//    Farm farm = new Farm(4, 3);
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
    Vehicle tractor = new Tractor();
    Aircraft cropDuster = new CropDuster();
    Field field = new Field();
    private boolean dailyTasks = false;
    private boolean sundayTasks = false;
    private boolean mondayTasks = false;
    private boolean tuesdayTasks = false;
    private boolean wednesdayTasks = false;
    private boolean thursdayTasks = false;
    private boolean fridayTasks = false;
    private boolean saturdayTasks = false;

    public boolean dailyActivities() {
        /*TODO : Every morning, Froilan and Froilanda:
            - Ride each HORSE in each STABLE
            - Feed each HORSE 3 EAROFCORN
            - Breakfast:
                - Froilan eats 1 EAROFCORN, 2 TOMATO, 5 EGG
                - FROILANDA eats 2 EAROFCORN, 1 TOMATO, 2 EGG
     */
        chicken.setHasBeenFertilized(true);

        froilan.mount(horse);
        froilanda.mount(horse);
        froilan.dismount(horse);
        froilanda.dismount(horse);

        if (horse.eat(carrot) && chicken.eat(corn)) {
            dailyTasks = true;
        } else {
            dailyTasks = false;
        }

        if (froilan.eat(corn) && froilan.eat(tomato) && froilan.eat(egg)) {
            dailyTasks = true;
        } else {
            dailyTasks = false;
        }

        if (froilanda.eat(corn) && froilanda.eat(tomato) && froilanda.eat(egg)) {
            dailyTasks = true;
        } else {
            dailyTasks = false;
        }

        return dailyTasks;
    }

    public boolean sunday() {
        //TODO : Froilan plants 3 Crops (CORNSTALK, TOMATOPLANT, POTATOPLANT) in CropRow 1, 2, 3
        if (dailyActivities()) {
            sundayTasks = true;
        }

        froilan.plant(cornStalk, cropRow);
        froilan.plant(tomatoPlant, cropRow);
        froilan.plant(potatoPlant, cropRow);

        return sundayTasks;
    }

    public boolean monday() {
        //TODO : Froilanda uses CROPDUSTER to FLY over FIELD and FERTILIZE each CROPROW 1, 2, 3
        if (dailyActivities()) {
            mondayTasks = true;
        }

        //froilanda.mount(cropDuster);
        //cropDuster.operate();

        if (cropDuster.fly(field).equals("All crops have been fertilized in CropRow")) {
            mondayTasks = true;
        } else {
            mondayTasks = false;
        }

        if (froilanda.fertilize(cropDuster, field) != null) {
            mondayTasks = true;
        } else {
            mondayTasks = false;
        }

        //froilanda.dismount(cropDuster);

        return mondayTasks;
    }

    public boolean tuesday() {
        //TODO : FROILAN uses TRACTOR to HARVEST each CROP in each CROPROW
        if (dailyActivities()) {
            tuesdayTasks = true;
        }

        froilan.mount(tractor);
        //tractor.operate();
        //froilan.harvest(tractor, cropRow);
        froilan.dismount(tractor);

        return tuesdayTasks;
    }

    public boolean wednesday() {
        //TODO : FROILAN harvests EGGS from each CHICKEN
        if (dailyActivities()) {
            wednesdayTasks = true;
        }

        if (chicken.yield() != null) {
            wednesdayTasks = true;
        } else {
            wednesdayTasks = false;
        }

        return wednesdayTasks;
    }

    public boolean thursday() {
        //TODO : Froilan plants 2 CROPS (PEPPERPLANT, CARROTPLANT) in CropRow 4, 5
        if (dailyActivities()) {
            thursdayTasks = true;
        }

        froilan.plant(pepperPlant, cropRow);
        froilan.plant(carrotPlant, cropRow);

        return thursdayTasks;
    }

    public boolean friday() {
        //TODO : Froilanda uses CROPDUSTER to FLY over FIELD and FERTILIZE each CROPROW 4, 5
        if (dailyActivities()) {
            fridayTasks = true;
        }

        //froilanda.mount(cropDuster);
        //cropDuster.operate();

        if (cropDuster.fly(field).equals("All crops have been fertilized in CropRow")) {
            fridayTasks = true;
        } else {
            fridayTasks = false;
        }

        if (froilanda.fertilize(cropDuster, field) != null) {
            fridayTasks = true;
        } else {
            fridayTasks = false;
        }

        //froilanda.dismount(cropDuster);

        return fridayTasks;
    }

    public boolean saturday() {
        //TODO : Froilan uses Tractor to Harvest each Crop in each CropRow 4, 5
        if (dailyActivities()) {
            saturdayTasks = true;
        }

        froilan.mount(tractor);
        //tractor.operate();
        //froilan.harvest(tractor, cropRow);
        froilan.dismount(tractor);

        return saturdayTasks;
    }
}
