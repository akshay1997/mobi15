package com.example.akshay.mobievisionday2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {
    TextView hideShowTextView , numberText;
    Button hideShowButton , incrementButton , decrementButton,nextActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hideShowTextView = (TextView) findViewById(R.id.hideShowTextView);
        hideShowButton = (Button) findViewById(R.id.hideShowButton);
        nextActivityButton = (Button) findViewById(R.id.nextActivityButton);

        hideShowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                if (hideShowTextView.getVisibility() == View.INVISIBLE)
                    hideShowTextView.setVisibility(View.VISIBLE);
                else
                    hideShowTextView.setVisibility(View.INVISIBLE);

            }
        });

        nextActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, secondactivity.class);
                startActivity(intent);
            }

        });
    }

}
