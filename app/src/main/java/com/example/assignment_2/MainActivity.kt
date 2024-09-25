package com.example.myapp;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBox;
    private RadioButton radioButton1, radioButton2;
    private RatingBar ratingBar;
    private SeekBar seekBar;
    private Switch switchToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI components
        checkBox = findViewById(R.id.checkBox);
        radioButton1 = findViewById(R.id.radioButton1);
        radioButton2 = findViewById(R.id.radioButton2);
        ratingBar = findViewById(R.id.ratingBar);
        seekBar = findViewById(R.id.seekBar);
        switchToggle = findViewById(R.id.switchToggle);

        // Set up listeners
        checkBox.setOnCheckedChangeListener((buttonView, isChecked) -> {
        if (isChecked) {
            Toast.makeText(MainActivity.this, "CheckBox Checked", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "CheckBox Unchecked", Toast.LENGTH_SHORT).show();
        }
    });

        ratingBar.setOnRatingBarChangeListener((ratingBar, rating, fromUser) ->
        Toast.makeText(MainActivity.this, "Rating: " + rating, Toast.LENGTH_SHORT).show());

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Toast.makeText(MainActivity.this, "SeekBar Progress: " + progress, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        switchToggle.setOnCheckedChangeListener((buttonView, isChecked) -> {
        if (isChecked) {
            Toast.makeText(MainActivity.this, "Switch ON", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "Switch OFF", Toast.LENGTH_SHORT).show();
        }
    });
    }
}
