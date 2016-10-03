package com.example.colton.habittracker;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by colton on 2016-10-01.
 */

//habit manager provides access to the habits and collects them into one object.
//    this helps to keep the data model neat and kept away form the ui

public class HabitManager {
    private ArrayList<Habit> habitList;

    public HabitManager(ArrayList<Habit> habitList) {
        this.habitList = habitList;
//        this.habitList = new ArrayList<>();

    }

    public void addHabit(Habit habit){
        if (!habitList.contains(habit)){
            habitList.add(habit);
        }

    }
    public void deleteHabit(Habit habit){
        if(habitList.contains(habit)) {
            habitList.remove(habit);
        }
    }

    public ArrayList<Habit> getHabitList() {
        return this.habitList;
    }

    public void setHabitList(ArrayList<Habit> habitList){
        this.habitList = habitList;
    }




    public  ArrayList getHabits(){
        return this.habitList;
    }

    public Habit newHabit() {
        Habit habit = new Habit("NULL");
        this.addHabit(habit);
        return habit;
    }

    public void completeHabit(Habit habit){
        habit.complete();
//        notifyAll();
    }

    public ArrayList<Date> getHabitCompletionList(Habit habit) {
        return habit.getCompletionDates();
    }

    public void removeHabitCompletion(Habit habit,String completion){

    }

    public String getHabitText(Habit habit){
        return habit.getMessage();
    }

    public String getCompletedCount(Habit habit) {
        return habit.getCompletedCount().toString();
    }

    public DateManager getHabitDateManager(Habit habit){
        return habit.getDateManager();
    }

//    private ArrayList HabitSort(ArrayList<Habit> habitList) {
//        //this is where the habit will get sorted into days and by date
//        //the headers for the days will also be added to this list in the correct order.
//    }
}
