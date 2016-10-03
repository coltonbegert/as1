package com.example.colton.habittracker;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by colton on 2016-10-01.
 */

public class DateManagerTest extends ActivityInstrumentationTestCase2 {
    public DateManagerTest() {
        super(com.example.colton.habittracker.DateManagerTest.class);
    }

    public void testAddRepeatingDays(){
        DateManager dateManager = new DateManager();
        dateManager.AddRepeatingDay("Sunday");
        assertTrue(dateManager.getRepeatDays().contains("Sunday"));
        dateManager.AddRepeatingDay("fadsjfskajldf");
        assertFalse(dateManager.getRepeatDays().contains("fadsjfskajldf"));
    }

    public void testRemoveRepeatingDays(){
        DateManager dateManager = new DateManager();
        dateManager.AddRepeatingDay("Sunday");
        dateManager.RemoveRepeatingDay("fjahsdfjkah");
        dateManager.RemoveRepeatingDay("Sunday");
        assertFalse(dateManager.getRepeatDays().contains("Sunday"));

    }
    public void testGetRepeatDays(){
        DateManager dateManager = new DateManager();
        dateManager.AddRepeatingDay("Sunday");
        assertTrue(dateManager.getRepeatDays().contains("Sunday"));
        assertFalse(dateManager.getRepeatDays().contains("Monday"));
        dateManager.AddRepeatingDay("Monday");
        assertTrue(dateManager.getRepeatDays().contains("Monday"));
        assertTrue(dateManager.getRepeatDays().contains("Sunday"));
    }
    public void testCurrentDay(){
        DateManager dateManager = new DateManager();
        assertEquals(dateManager.CurrentDay(),"Monday");
    }
}
