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
        chicken.setHasBeenFertilized(true);
        Edible actual = chicken.yield();

        //assert
        Assert.assertNotNull(actual);
    }

    @Test
    public void eatTest() {
        //given
        Chicken chicken = new Chicken();
        CornStalk cornStalk = new CornStalk();

        //when
        cornStalk.setHasBeenFertilized(true);
        Edible earOfCorn = cornStalk.yield();
        Boolean actual = chicken.eat(earOfCorn);

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
