package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.crop.CornStalk;
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
        Chicken chicken = new Chicken();
        CornStalk corn = new CornStalk();

        //when
        corn.setHasBeenHarvested(true);
        Boolean actual = chicken.eat(null);

        //assert
        Assert.assertEquals(true, actual);
    }

    @Test
    public void eatTestFalse() {
        //given
        Chicken chicken = new Chicken();

        //when
        Boolean actual = chicken.eat(null);

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
