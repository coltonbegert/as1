package com.example.colton.habittracker;

import android.graphics.Color;
import android.support.annotation.ColorRes;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by colton on 2016-10-02.
 */

public class DayToggleAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<String> daysOfWeek;
    private ArrayList<String> repeatDays;
    private DateManager dateManager;

    public DayToggleAdapter(DateManager dateManager) {
//        this.daysOfWeek = daysOfWeek;
        this.dateManager = dateManager;
        this.daysOfWeek = this.dateManager.getDaysOfTheWeek();

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //this is to create the layout and fill tell where things will go
        RecyclerView.ViewHolder viewHolder;
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.day_toggle_buton_layout, parent, false);
        viewHolder = new DayViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        final DayViewHolder viewHolder = (DayViewHolder) holder;

//sets the correct toggles
        if (dateManager.getRepeatDays().contains(daysOfWeek.get(position))) {
            viewHolder.getDayToggleButton().setChecked(true);
        } else {
            viewHolder.getDayToggleButton().setChecked(false);
        }
//        makes the buttons for each day pf the week
        viewHolder.getDayToggleButton().setText(daysOfWeek.get(position).substring(0,3));
        viewHolder.getDayToggleButton().setTextColor(ContextCompat.getColor(viewHolder.getDayToggleButton().getContext(),R.color.colorAccent));


//check for the toggle button and add or remove the correct day from the buttons. Manages highlight
        viewHolder.getDayToggleButton().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    dateManager.AddRepeatingDay(daysOfWeek.get(position));
                } else {
                    dateManager.RemoveRepeatingDay(daysOfWeek.get(position));
                }

            }
        });







    }

    @Override
    public int getItemCount() {
        return this.daysOfWeek.size();
    }
}
