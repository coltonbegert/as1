package com.example.colton.habittracker;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

/**
 * Created by colton on 2016-09-24.
 */

public class EditTextPopup {
    private String habitMessage;
    private HabitManager habitManager;
    private HabitAdapter adapter;
    private Boolean newMessage = false;

//    this function got more complex as it needed to take in the habit manager which was not ideal
//    it does work though!
    public EditTextPopup(Context context, HabitManager habitManager, HabitAdapter habitAdapter){
//        this.habit = habit;
        this.habitManager = habitManager;
        this.adapter = habitAdapter;

//        http://stackoverflow.com/questions/4134117/edittext-on-a-popup-window
//        this was designed following this guide

        AlertDialog.Builder alert = new AlertDialog.Builder(context);

        alert.setTitle("Edit Habit");
        alert.setMessage("Message");

// Set an EditText view to get user input
        final android.widget.EditText input = new android.widget.EditText(context);
//        final android.widget.EditText dateinput = new android.widget.EditText(context);
        alert.setView(input);
//        final String test;

        alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
//    calls internal functions to extract the data from the box
                String test = input.getText().toString();
                setHabitMessage(test);
                setNewMessage(true);
                newHabit();
                // Do something with value!
            }
        });
        alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                setNewMessage(false);
                // Canceled.
            }
        });

        alert.show();

    }
    public void newHabit(){
        habitManager.addHabit(new Habit(getHabitMessage()));
        adapter.notifyDataSetChanged();
    }

    public void setNewMessage(Boolean newMessage) {
        this.newMessage = newMessage;
    }

    public void setHabitMessage(String habitMessage) {
        this.habitMessage = habitMessage;
    }

    public String getHabitMessage() {
        return habitMessage;
    }
    public boolean newMessage(){
        return this.newMessage;

    }
}

