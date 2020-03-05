package com.example.rootplaybooks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {
    private RadioButton specialSpecies;
    private EditText customSpecies;
    private RadioGroup srg;
    private RadioButton fox;
    private RadioButton mouse;
    private RadioButton rabbit;
    private RadioButton bird;
    private RadioButton special;
    private String selectedSpecies = "Fox";

    public static final String CHAR_NAME = "com.example.myfirstapp.MESSAGE3";
    public static final String CLASS_CHOSEN = "com.example.myfirstapp.MESSAGE4";
    public static final String SPECIES_CHOSEN = "com.example.myfirstapp.MESSAGE5";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        srg = findViewById(R.id.speciesRadio);
        fox = findViewById(R.id.radioButton_FOX);
        mouse = findViewById(R.id.radioButton_MOUSE);
        rabbit = findViewById(R.id.radioButton_RABBIT);
        bird = findViewById(R.id.radioButton_BIRD);
        special = findViewById(R.id.radioButton_SPECIAL);


        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String name = extras.getString(MainActivity.EXTRA_MESSAGE);

        // Capture the Character Name and set the string as its text
        TextView nameTextView = findViewById(R.id.CharName);
        nameTextView.setText(name);

        //Capture the Character Class and set the string as it
        String charClass = extras.getString(MainActivity.CLASS_CHOSEN);
        TextView classTextView = findViewById(R.id.classTextView);
        classTextView.setText(charClass);

        customSpecies = findViewById(R.id.customSpecies);


        /**srg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if(checkedId == R.id.radioButton_FITB){
                    customSpecies.setEnabled(true);
                    customSpecies.setHint("Enter Your Custom Species");
                    customSpecies.setAlpha(1);
                }
                else {
                    customSpecies.setAlpha(0);
                    customSpecies.setEnabled(false);
                }
            }
        });*/

        specialSpecies = findViewById(R.id.radioButton_SPECIAL);
        //Determines special species and assigns it to radio button
        if (charClass.contains("Arbiter")) {
            specialSpecies.setText("Badger");
        } else if (charClass.contains("Ranger")) {
            specialSpecies.setText("Wolf");
        } else if (charClass.contains("Scoundrel")) {
            specialSpecies.setText("Cat");
        } else if (charClass.contains("Thief")) {
            specialSpecies.setText("Raccoon");
        } else if (charClass.contains("Tinker")) {
            specialSpecies.setText("Beaver");
        } else {
            specialSpecies.setText("Opossum");
        }

        srg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(i==R.id.radioButton_FOX){
                    selectedSpecies = fox.getText().toString();
                }
                else if(i==R.id.radioButton_MOUSE){
                    selectedSpecies = mouse.getText().toString();
                }
                else if(i==R.id.radioButton_RABBIT){
                    selectedSpecies = rabbit.getText().toString();
                }
                else if(i==R.id.radioButton_BIRD){
                    selectedSpecies = bird.getText().toString();
                }
                else if(i==R.id.radioButton_SPECIAL){
                    selectedSpecies = special.getText().toString();
                }
                else {
                    customSpecies.setEnabled(true);
                    customSpecies.setHint("Enter Your Custom Species");
                    customSpecies.setAlpha(1); //enables text box for custom species...does not set the input to selectedSpecies yet
                    EditText custSpecies = findViewById(R.id.customSpecies);
                    selectedSpecies = custSpecies.getText().toString();
                }
            }
        });


    }

    public void sendMessage(View view) {

        Intent intent = new Intent(this, ChooseYourLook.class);
        Bundle extras = new Bundle();
        TextView charName = findViewById(R.id.CharName);
        String name = charName.getText().toString();
        extras.putString(CHAR_NAME, name);
        TextView charClass = findViewById(R.id.classTextView);
        String classChosen = charClass.getText().toString();
        extras.putString(CLASS_CHOSEN, classChosen);
        extras.putString(SPECIES_CHOSEN, selectedSpecies);
        intent.putExtras(extras);
        startActivity(intent);

    }
}
