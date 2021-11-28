package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.crop.CornStalk;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import org.junit.Assert;
import org.junit.Test;

public class ChickenTest {
    @Test
    public void makeNoiseTest() {
        //given
        Chicken chicken = new Chicken();
        String expected = "bwak";

        //assert
        Assert.assertEquals(expected, chicken.makeNoise());
    }

    @Test
    public void yieldTest() {
        //given
        Chicken chicken = new Chicken();

        //assert
        Assert.assertNull(chicken.yield());
    }

    @Test
    public void yieldTestFalse() {
        //given
        Chicken chicken = new Chicken();

        //when
        chicken.setEggFertilized(true);
        Edible actual = chicken.yield();

        //assert
        Assert.assertNotNull(actual);
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
}
