package com.example.akshay.mobievisionday2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class secondactivity extends Activity {

    TextView numberText;
    Button incrementButton, decrementButton, nextActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
        numberText = (TextView) findViewById(R.id.numberText);
        decrementButton = (Button) findViewById(R.id.DecrementButton);
        incrementButton = (Button) findViewById(R.id.IncrementButton);

        decrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int number = (Integer.parseInt(numberText.getText().toString()));
                number--;
                numberText.setText(Integer.toString(number));
            }

        });
        incrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number = (Integer.parseInt(numberText.getText().toString()));
                number++;
                numberText.setText(Integer.toString(number));

            }
        });
        nextActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(secondactivity.this , thirdactivity.class);
                startActivity(i);
            }

        });
    }
}




