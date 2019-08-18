package com.example.abhinaykukkadapu.vault;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Facing_Screen extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facing__screen);

        Button connectBtn       = (Button) findViewById(R.id.connect);
        Button disconnectBtn    = (Button) findViewById(R.id.disconnect);
        RadioGroup rGroup       = (RadioGroup) findViewById(R.id.radioGroup);


        if (connectBtn      != null) {
            connectBtn.setOnClickListener(this);
        }
        if (disconnectBtn   != null) {
            disconnectBtn.setOnClickListener(this);
        }


    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.connect:
                Toast.makeText(Facing_Screen.this, "Connecting...", Toast.LENGTH_LONG).show();
                break;
            case R.id.disconnect:
                Toast.makeText(Facing_Screen.this, "Disconnecting...", Toast.LENGTH_LONG).show();
                break;

        }
    }

    public void onRadioButtonClicked(View v){
        RadioButton in_home     = (RadioButton) findViewById(R.id.in_home_button);
        RadioButton away_home   = (RadioButton) findViewById(R.id.away_home_button);
        RadioButton disarm      = (RadioButton) findViewById(R.id.disarm_button);

        boolean  checked        = ((RadioButton) v).isChecked();

        switch (v.getId()){
            case R.id.disarm_button:
                if (checked){
                    disarm.setTextColor(Color.RED);
                    in_home.setTextColor(Color.BLACK);
                    away_home.setTextColor(Color.BLACK);


                    //Place holder to start disarm process
                }
                break;
            case R.id.in_home_button:
                if (checked){
                    disarm.setTextColor(Color.BLACK);
                    in_home.setTextColor(Color.RED);
                    away_home.setTextColor(Color.BLACK);
                    //Place holder to start In home connection process
                }
                break;
            case R.id.away_home_button:
                if (checked){
                    disarm.setTextColor(Color.BLACK);
                    in_home.setTextColor(Color.BLACK);
                    away_home.setTextColor(Color.RED);
                    //Place holder to start Away from home process
                }
                break;
        }


    }
}
