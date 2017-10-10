package com.example.johnnyhanly.csc413androidproject3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Switch;
import android.os.Vibrator;


public class MainActivity extends AppCompatActivity {
Switch aSwitch;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aSwitch=(Switch)findViewById(R.id.vibrator_switch);
        textView=(TextView)findViewById(R.id.intro_text);


    }public void changeVibrateState(View view){
        Vibrator v= (Vibrator)getSystemService(VIBRATOR_SERVICE);
        boolean checked= ((Switch)view).isChecked();
        if(checked){
            textView.setText("Activate switch to stop vibration");
            v.vibrate(100000);
        }else{
            textView.setText("Activate switch to start vibration");
            v.cancel();
        }
    }
}
