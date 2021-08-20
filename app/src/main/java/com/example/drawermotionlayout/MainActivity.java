package com.example.drawermotionlayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout navBarl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        navBarl=findViewById (R.id.constraintLayoutNavBar);

        findViewById (R.id.textViewHome).setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Toast.makeText (getApplicationContext (),"Home Clicked",Toast.LENGTH_SHORT).show ();
            }
        });
        findViewById (R.id.textViewBooking).setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Toast.makeText (getApplicationContext (),"Booking Clicked",Toast.LENGTH_SHORT).show ();
            }
        });
    }
}