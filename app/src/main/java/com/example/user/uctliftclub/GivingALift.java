package com.example.user.uctliftclub;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by user on 7/23/2016.
 */
public class GivingALift extends Activity{

    public Button but1;

    public void setTime(){
        but1 = (Button)findViewById(R.id.button3);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent leaving = new Intent(GivingALift.this, MainActivity.class);
                startActivity(leaving);
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lift_leaving_time);
        setTime();
    }

}
