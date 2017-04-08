package com.example.baileyrighi.dwcodecampspring17;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Bailey Righi on 4/7/2017.
 */

public class CreateGoalActivity extends AppCompatActivity {

    private EditText mGoalTitle;
    private String goalTitle = "";
    private EditText mGoalDescription;
    private String goalDescription;
    private EditText mForWho;
    private String forWho;
    private Button mCreateNewGoal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_goal);

        mGoalTitle = (EditText)findViewById(R.id.goal_title);
        mGoalTitle.setOnKeyListener(new EditText.OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent keyEvent) {
                goalTitle = mGoalTitle.getText().toString();
                return false;
            }
        });

        mGoalDescription = (EditText)findViewById(R.id.goal_description);
        mGoalDescription.setOnKeyListener(new EditText.OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent keyEvent) {
                goalDescription = mGoalDescription.getText().toString();
                return false;
            }
        });

        mForWho = (EditText)findViewById(R.id.for_who);
        mForWho.setOnKeyListener(new EditText.OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent keyEvent) {
                forWho = mForWho.getText().toString();
                return false;
            }
        });

        mCreateNewGoal = (Button)findViewById(R.id.create_new_goal);
        mCreateNewGoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoalListActivity.adapter.add(new Goal(goalTitle, goalDescription, forWho));
                Log.d("tag", "added " + goalTitle);
                GoalListActivity.adapter.notifyDataSetChanged();
                Intent i = new Intent(CreateGoalActivity.this, GoalListActivity.class);
                i.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(i);
            }
        });

    }


}
