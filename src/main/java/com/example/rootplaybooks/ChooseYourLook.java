package com.example.rootplaybooks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ChooseYourLook extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_your_look);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String name = extras.getString(DisplayMessageActivity.CHAR_NAME);

        // Capture the Character Name, Class, and Species and set the strings as their text
        TextView nameTextView = findViewById(R.id.charName2);
        nameTextView.setText(name);
        String charClass = extras.getString(DisplayMessageActivity.CLASS_CHOSEN);
        TextView classTextView = findViewById(R.id.classTextView2);
        classTextView.setText(charClass);
        String charSpecies = extras.getString(DisplayMessageActivity.SPECIES_CHOSEN);
        TextView speciesTextView = findViewById(R.id.speciesTextView);
        speciesTextView.setText(charSpecies);


    }
}
