package com.example.colton.habittracker;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by colton on 2016-10-02.
 */

public class StatisticViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ArrayList<String> completionArray;
    private Habit habit;
//    private ImageView imageView;
//    private HabitAdapter habitAdapter;

    public StatisticViewAdapter(Habit habit){
        this.habit = habit;
//        this.imageView = imageView;
//        this.habitAdapter = habitAdapter;
//        this.completionArray = completionArray;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder viewHolder;
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.child_layout, parent, false);
        viewHolder = new ChildViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        final  ChildViewHolder childViewHolder = (ChildViewHolder) holder;
        childViewHolder.getDateTextView().setText(habit.getFormattedDate(habit.getCompletionDates().get(position)));
        childViewHolder.getHabitCompletionDelete().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                habit.removeCompletionDate(habit.getCompletionDates().get(position));
                notifyDataSetChanged();
//                imageView.setVisibility(View.INVISIBLE);
//                completionArray.remove(completionArray.get(position));
//                habitAdapter.notifyDataSetChanged();
            }
        });


    }

    @Override
    public int getItemCount() {
        return this.habit.getCompletionDates().size();
    }
}
