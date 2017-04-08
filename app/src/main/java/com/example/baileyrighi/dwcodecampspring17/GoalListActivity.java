package com.example.baileyrighi.dwcodecampspring17;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Bailey Righi on 4/7/2017.
 */

public class GoalListActivity extends ListActivity {

    public static ArrayList<Goal> goalList;

    private Button mNewGoal;

    private Button mHome;

    private ListView mListView;

    public static MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_goal_list);

        goalList = new ArrayList<Goal>();

        adapter = new MyAdapter(this, goalList);

        mListView = (ListView)findViewById(android.R.id.list);
        mListView.setAdapter(adapter);

        adapter.notifyDataSetChanged();

        mNewGoal = (Button)findViewById(R.id.new_goal);
        mNewGoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(GoalListActivity.this, CreateGoalActivity.class);
                //i.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(i);
            }
        });

        mHome = (Button)findViewById(R.id.home_button);
        mHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(GoalListActivity.this, MainActivity.class);
                i.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(i);
            }
        });

    }

}
