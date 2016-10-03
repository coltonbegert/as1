package com.example.colton.habittracker;

import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by colton on 2016-09-23.
 *
 */

//Habit provides accessors for its datemanager and stores the message value
public class Habit implements HabitInterface{
    private String message;
    private DateManager dateManager;

    public Habit(String text) {
        this.dateManager = new DateManager();
        setMessage(text);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    //the rest of these functions are just accessors to dateManager

    public Integer getCompletedCount() {
        return dateManager.getCompletionDates().size();
    }


    public void complete() {
        dateManager.addCompletionDate();
    }


    public ArrayList<Date> getCompletionDates() {
        return dateManager.getCompletionDates();
    }
    public String getFormattedDate(Date date){
        return dateManager.getFormattedDate(date);
    }
    public void removeCompletionDate(Date date){
        dateManager.removeCompletionDate(date);
    }

    public DateManager getDateManager() {
        return dateManager;
    }

    @Override
    public String toString() {
        return this.message.toString();
    }
}
