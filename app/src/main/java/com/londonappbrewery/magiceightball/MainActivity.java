package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    ImageView ballDisplay;
    int[] ballArray;

    Button btnAskButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set display elements
        ballDisplay = (ImageView) findViewById(R.id.image_eightBall);
        btnAskButton = (Button) findViewById(R.id.askButton);

        // Set array images
        ballArray = new int[5];
        ballArray[0] = R.drawable.ball1;
        ballArray[1] = R.drawable.ball2;
        ballArray[2] = R.drawable.ball3;
        ballArray[3] = R.drawable.ball4;
        ballArray[4] = R.drawable.ball5;

        // Set button listener
        btnAskButton.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view)
            {
                Random randomNumber = new Random();

                int indexImage = randomNumber.nextInt(ballArray.length);
                ballDisplay.setImageResource(ballArray[indexImage]);

            }
        });

    }
}
