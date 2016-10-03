package com.example.colton.habittracker;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ToggleButton;

/**
 * Created by colton on 2016-10-02.
 */

//links the layout with the adpater
public class DayViewHolder extends RecyclerView.ViewHolder {
    private ToggleButton dayToggleButton;
    private FrameLayout dayFrameLayout;
    public DayViewHolder(View itemView) {
        super(itemView);
        dayToggleButton = (ToggleButton) itemView.findViewById(R.id.DayToggle);
        dayFrameLayout = (FrameLayout) itemView.findViewById(R.id.dayFrameLayout);
    }



    public ToggleButton getDayToggleButton() {
        return dayToggleButton;
    }
}
