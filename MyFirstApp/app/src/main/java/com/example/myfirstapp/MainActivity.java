package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    // needs to be a public void method with sole parameter View
    public void sendMessage(View view) {
        /** Intent provides runtime binding between separate components.
         Represents app's intent to do something */
        // Intent parameter takes in Context parameter and the Class parameter, in this case
        // the activity to start 
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        // putExtra method adds value of EditText to the intent.
        // Intent can carry data types as key-value pairs called extras
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}