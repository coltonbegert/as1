package com.example.colton.habittracker;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by colton on 2016-10-02.
 * creates links between ids and viewAdapter
 */

public class ChildViewHolder extends RecyclerView.ViewHolder {
    private TextView dateTextView;
    private Button habitCompletionDelete;

    public Button getHabitCompletionDelete() {
        return habitCompletionDelete;
    }

    public ChildViewHolder(View itemView) {
        super(itemView);
        dateTextView = (TextView) itemView.findViewById(R.id.childTextView);
        habitCompletionDelete = (Button) itemView.findViewById(R.id.habitCompletionDelete);

    }

    public TextView getDateTextView() {
        return dateTextView;
    }
}
