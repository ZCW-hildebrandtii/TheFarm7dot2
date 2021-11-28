package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.crop.CarrotPlant;
import com.zipcodewilmington.froilansfarm.crop.CornStalk;
import com.zipcodewilmington.froilansfarm.edibles.Carrot;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import org.junit.Assert;
import org.junit.Test;

public class HorseTest {
    @Test
    public void makeNoiseTest() {
        //given
        Horse horse = new Horse();
        String expected = "neigh";

        //assert
        Assert.assertEquals(expected, horse.makeNoise());
    }

    @Test
    public void eatTest() {
        //given
        Horse horse = new Horse();
        CarrotPlant carrotPlant = new CarrotPlant();

        //when
        carrotPlant.setHasBeenFertilized(true);
        Edible carrot = carrotPlant.yield();
        Boolean actual = horse.eat(carrot);

        //assert
        Assert.assertEquals(true, actual);
    }

    @Test
    public void eatTestFalse() {
        //given
        Horse horse = new Horse();

        //when
        Boolean actual = horse.eat(null);

        //assert
        Assert.assertEquals(false, actual);
    }

    @Test
    public void isMountedTest() {

    }

    @Test
    public void isMountedTestFalse() {

    }

    @Test
    public void isDismountedTest() {

    }

    @Test
    public void isDismountedTestFalse() {

    }
}
