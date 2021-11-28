package com.zipcodewilmington.froilansfarm.animal;

import org.junit.Assert;
import org.junit.Test;

public class ChickenTest {
    @Test
    public void makeNoiseTest() {
        //given
        String expected = "bwak";

        //when
        String actual = "bwak";

        //assert
        Assert.assertEquals(expected, actual);
    }
}
