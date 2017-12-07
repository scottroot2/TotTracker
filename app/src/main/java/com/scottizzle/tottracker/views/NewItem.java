package com.scottizzle.tottracker.views;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;

import com.scottizzle.tottracker.R;
import com.scottizzle.tottracker.controllers.NewItemController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NewItem extends AppCompatActivity {

    private static final String TAG = "NewItem";
    private NewItemController controller;

    /**
     * Initial creation activity override
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_item);
        //// TODO: 12/4/2017 MVC or MVVM?
        controller = new NewItemController();
        showCurrentTime();
    }

    /**
     * Shows the current time in the appropriate UI element
     */
    private void showCurrentTime() {
        EditText timePicker = null;
        try {
            timePicker = (EditText) findViewById(R.id.editTextTime);
            DateFormat df = new SimpleDateFormat("hh:mm a");
            timePicker.setText(df.format(new Date()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Handles when the main submit button is clicked event
     * @param view
     */
    public void onSubmitButtonClicked(View view) {
        //// TODO: 12/4/2017 make something meaningful here
        //System.out.println("CLICKED!!");
        try {
            Log.v(TAG, "Clicked submit button!");
            Log.i(TAG, "onSubmitButtonClicked: timerSwitch:" + ((Switch) findViewById(R.id.timer_switch)).isChecked());
            Log.i(TAG, "onSubmitButtonClicked: poopSwitch:" + ((Switch) findViewById(R.id.poop_switch)).isChecked());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Handles when the timer switch is clicked
     * @param view
     */
    public void onTimerSwitchClick(View view) {
        try {
            Log.v(TAG, "Timer switch clicked");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}