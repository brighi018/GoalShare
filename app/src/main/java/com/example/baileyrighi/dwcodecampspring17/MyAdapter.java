package com.example.baileyrighi.dwcodecampspring17;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Bailey Righi on 4/8/2017.
 */

public class MyAdapter extends ArrayAdapter<Goal> {

    private final Context context;
    private ArrayList<Goal> goalList;

    public MyAdapter(Context context, ArrayList<Goal> goalList) {
        super(context, R.layout.row, goalList);
        this.context = context;
        this.goalList = goalList;
    }

    @Override
    public int getCount() {
        return goalList.size();
    }

    @Override
    public Goal getItem(int location) {
        return goalList.get(location);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //create inflater
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //get rowView from inflater
        View rowView = inflater.inflate(R.layout.row, parent, false);

        //get views from rowView
        CheckBox checkBox = (CheckBox)rowView.findViewById(R.id.check_box);
        TextView goalLabel = (TextView)rowView.findViewById(R.id.goal_label);

        //set the text/conditions/states for views
        checkBox.setChecked(false);
        goalLabel.setText(goalList.get(position).getTitle());

        //return rowView
        return rowView;

    }

}
