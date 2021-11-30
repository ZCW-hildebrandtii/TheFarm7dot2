package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class WeeklyScheduleTests {
    @Test
    public void dailyActivitiesTest() {
        //give
        WeeklySchedule week = new WeeklySchedule();

        //when

        //assert
        Assert.assertTrue(week.dailyActivities());
    }

    @Test
    public void sundayTest() {
        //give
        WeeklySchedule week = new WeeklySchedule();

        //when

        //assert
        Assert.assertTrue(week.sunday());
    }

    @Test
    public void mondayTest() {
        //give
        WeeklySchedule week = new WeeklySchedule();

        //when

        //assert
        Assert.assertTrue(week.monday());
    }

    @Test
    public void tuesdayTest() {
        //give
        WeeklySchedule week = new WeeklySchedule();

        //when

        //assert
        Assert.assertTrue(week.tuesday());
    }

    @Test
    public void wednesdayTest() {
        //give
        WeeklySchedule week = new WeeklySchedule();

        //when

        //assert
        Assert.assertTrue(week.wednesday());
    }

    @Test
    public void thursdayTest() {
        //give
        WeeklySchedule week = new WeeklySchedule();

        //when

        //assert
        Assert.assertTrue(week.thursday());
    }

    @Test
    public void fridayTest() {
        //give
        WeeklySchedule week = new WeeklySchedule();

        //when

        //assert
        Assert.assertTrue(week.friday());
    }

    @Test
    public void saturdayTest() {
        //give
        WeeklySchedule week = new WeeklySchedule();

        //when

        //assert
        Assert.assertTrue(week.saturday());
    }
}
