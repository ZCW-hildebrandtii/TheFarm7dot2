package com.zipcodewilmington.froilansfarm.person;

import com.zipcodewilmington.froilansfarm.animal.Horse;
import com.zipcodewilmington.froilansfarm.crop.CornStalk;
import com.zipcodewilmington.froilansfarm.edibles.Carrot;
import com.zipcodewilmington.froilansfarm.edibles.EarOfCorn;
import com.zipcodewilmington.froilansfarm.edibles.Potato;
import com.zipcodewilmington.froilansfarm.edibles.Tomato;
import com.zipcodewilmington.froilansfarm.farm.CropRow;
import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import org.junit.Assert;
import org.junit.Test;

public class FarmerTest {

    @Test
    public void test_makeNoise(){
        //given
        Farmer farmer = new Farmer();
        String expectedNoise = "HOWDY";

        //When
        String actualNoise = farmer.makeNoise();

        //then
        Assert.assertEquals(expectedNoise, actualNoise);
    }

    @Test
    public void test_farmer_name_by_constructor(){
        //Given
        String expectedName = "Froilan";
        Farmer farmer = new Farmer(expectedName);

        //When
        String actualName = farmer.getName();

        //Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void test_farmer_name_by_setter(){
        //Given
        String expectedName = "Froilan";
        Person person = new Farmer();
        person.setName(expectedName);

        //When
        String actualName = person.getName();

        //Then
        Assert.assertEquals(expectedName,actualName);
    }

    @Test
    public void test_eat_carrot(){
        //Given
        Farmer farmer = new Farmer();
        Carrot carrot = new Carrot();

        //When
        farmer.eat(carrot);

        //Then
        Assert.assertTrue(carrot.isEaten());
    }

    @Test
    public void test_eat_tomato() {
        //Given
        Farmer farmer = new Farmer();
        Tomato tomato = new Tomato();

        //When
        farmer.eat(tomato);

        //Then
        Assert.assertTrue(tomato.isEaten());
    }

    @Test
    public void test_eat_earOfCorn() {
        //Given
        Farmer farmer = new Farmer();
        EarOfCorn earOfCorn = new EarOfCorn();

        //When
        farmer.eat(earOfCorn);

        //Then
        Assert.assertTrue(earOfCorn.isEaten());
    }

    @Test
    public void test_mount_rideable(){
        //Given
        Horse horse = new Horse();
        boolean expected = true;

        //When
        Farmer farmer = new Farmer();
        farmer.mount(horse);
        boolean actual = horse.isMounted();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_dismount_rideable(){
        //Given
        Horse horse = new Horse();
        boolean expected = true;

        //When
        Farmer farmer = new Farmer();
        farmer.dismount(horse);
        boolean actual = horse.isDismounted();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_plant_cornstalk(){
        //Given
        CornStalk cornStalk = new CornStalk();
        CropRow cropRow = new CropRow();

        //When
        Farmer farmer = new Farmer();
        farmer.plant(cornStalk, cropRow);
        boolean actual = horse.isDismounted();

        //Then
        Assert.assertEquals(expected, actual);
    }


}
