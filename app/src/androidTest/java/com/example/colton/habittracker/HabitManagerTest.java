package com.example.colton.habittracker;

import android.test.ActivityInstrumentationTestCase2;

import com.google.gson.Gson;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

/**
 * Created by colton on 2016-10-02.
 */

public class HabitManagerTest extends ActivityInstrumentationTestCase2 {
    public HabitManagerTest() {
        super(com.example.colton.habittracker.HabitManagerTest.class);
    }

//    public void testAddHabit(){
//        Habit habit = new Habit("test");
//        HabitManager habitManager = new HabitManager();
//    }
    public void testGetHabbitList(){
        ArrayList<Habit> habitArrayList = new ArrayList<>();
        habitArrayList.add(new Habit("hello"));
        HabitManager habitManager = new HabitManager(habitArrayList);
        assertEquals(habitManager.getHabitList(),habitArrayList);

        HabitManager habitManager1 = new HabitManager(habitManager.getHabitList());
        assertEquals(habitManager1.getHabitList(),habitArrayList);
    }
    public void testSavetoDisk(){
        ArrayList<Habit> habitArrayList = new ArrayList<>();
        HabitManager habitManager = new HabitManager(habitArrayList);
        habitManager.addHabit(new Habit("test"));

//        FileOutputStream fos = openFileOutput("hello.sav",0);
////        OutputStreamWriter writer = new OutputStreamWriter(fos);
//        String[] serialized = new String[];
//        Gson gson = new Gson();
//        gson.toJson(habitArrayList, serialized);
//        writer.flush();

    }
}
