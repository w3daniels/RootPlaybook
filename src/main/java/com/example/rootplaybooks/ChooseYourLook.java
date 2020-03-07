package com.example.rootplaybooks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ChooseYourLook extends AppCompatActivity {

    private CheckBox detail1;
    private CheckBox detail2;
    private CheckBox detail3;
    private CheckBox detail4;
    private CheckBox detail5;
    private CheckBox detail6;
    private CheckBox detail7;
    private CheckBox detail8;
    private String arbiterDetail1 = "Large";
    private String arbiterDetail2 = "Scarred";
    private String arbiterDetail3 = "Well-Groomed";
    private String arbiterDetail4 = "Old";
    private String arbiterDetail5 = "Faded Military Insignia";
    private String arbiterDetail6 = "Eyepatch";
    private String arbiterDetail7 = "Repaired Clothes";
    private String arbiterDetail8 = "Tarnished Locket";
    private String rangerDetail1 = "Unkempt";
    private String rangerDetail2 = "Scarred";
    private String rangerDetail3 = "Natural";
    private String rangerDetail4 = "Practical";
    private String rangerDetail5 = "Forest Charm";
    private String rangerDetail6 = "Leafy Cloak";
    private String rangerDetail7 = "Smoking Pipe";
    private String rangerDetail8 = "Stolen Ring";
    private String scoundrelDetail1 = "Suspicious";
    private String scoundrelDetail2 = "Impoverished";
    private String scoundrelDetail3 = "Flea-Bitten";
    private String scoundrelDetail4 = "Scarred";
    private String scoundrelDetail5 = "Full Face Mask";
    private String scoundrelDetail6 = "Mousesteel Spark Lighter";
    private String scoundrelDetail7 = "Overly Large Coat";
    private String scoundrelDetail8 = "Sulphurous Pouches";
    private String thiefDetail1 = "Worn";
    private String thiefDetail2 = "Fidgety";
    private String thiefDetail3 = "Inconspicuous";
    private String thiefDetail4 = "Flamboyant";
    private String thiefDetail5 = "Black Cape";
    private String thiefDetail6 = "Large Bag";
    private String thiefDetail7 = "Old Broken Weapon";
    private String thiefDetail8 = "Stolen Scarf";
    private String tinkerDetail1 = "Scattered";
    private String tinkerDetail2 = "Organized";
    private String tinkerDetail3 = "Grubby";
    private String tinkerDetail4 = "Singed";
    private String tinkerDetail5 = "Eccentric Tool Belt";
    private String tinkerDetail6 = "Beautiful Whetstone";
    private String tinkerDetail7 = "Former Patron's Insignia";
    private String tinkerDetail8 = "Massive Packs";
    private String vagrantDetail1 = "Mangy";
    private String vagrantDetail2 = "Wild";
    private String vagrantDetail3 = "Cobbled-Together";
    private String vagrantDetail4 = "Inconspicuous";
    private String vagrantDetail5 = "Stolen Military Insignia";
    private String vagrantDetail6 = "Tattered Cloak";
    private String vagrantDetail7 = "Makeshift Luck Charm";
    private String vagrantDetail8 = "Gambling Dice, Cards, or Sticks";

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

        detail1 = findViewById(R.id.checkBoxDetail1);
        detail2 = findViewById(R.id.checkBoxDetail2);
        detail3 = findViewById(R.id.checkBoxDetail3);
        detail4 = findViewById(R.id.checkBoxDetail4);
        detail5 = findViewById(R.id.checkBoxDetail5);
        detail6 = findViewById(R.id.checkBoxDetail6);
        detail7 = findViewById(R.id.checkBoxDetail7);
        detail8 = findViewById(R.id.checkBoxDetail8);

        if (charClass.contains("Arbiter")){
            detail1.setText(arbiterDetail1);
            detail2.setText(arbiterDetail2);
            detail3.setText(arbiterDetail3);
            detail4.setText(arbiterDetail4);
            detail5.setText(arbiterDetail5);
            detail6.setText(arbiterDetail6);
            detail7.setText(arbiterDetail7);
            detail8.setText(arbiterDetail8);
        }

        else if (charClass.contains("Ranger")) {
            detail1.setText(rangerDetail1);
            detail2.setText(rangerDetail2);
            detail3.setText(rangerDetail3);
            detail4.setText(rangerDetail4);
            detail5.setText(rangerDetail5);
            detail6.setText(rangerDetail6);
            detail7.setText(rangerDetail7);
            detail8.setText(rangerDetail8);
        }

        else if (charClass.contains("Scoundrel")) {
            detail1.setText(scoundrelDetail1);
            detail2.setText(scoundrelDetail2);
            detail3.setText(scoundrelDetail3);
            detail4.setText(scoundrelDetail4);
            detail5.setText(scoundrelDetail5);
            detail6.setText(scoundrelDetail6);
            detail7.setText(scoundrelDetail7);
            detail8.setText(scoundrelDetail8);
        }

        else if (charClass.contains("Thief")) {
            detail1.setText(thiefDetail1);
            detail2.setText(thiefDetail2);
            detail3.setText(thiefDetail3);
            detail4.setText(thiefDetail4);
            detail5.setText(thiefDetail5);
            detail6.setText(thiefDetail6);
            detail7.setText(thiefDetail7);
            detail8.setText(thiefDetail8);
        }

        else if (charClass.contains("Tinker")) {
            detail1.setText(tinkerDetail1);
            detail2.setText(tinkerDetail2);
            detail3.setText(tinkerDetail3);
            detail4.setText(tinkerDetail4);
            detail5.setText(tinkerDetail5);
            detail6.setText(tinkerDetail6);
            detail7.setText(tinkerDetail7);
            detail8.setText(tinkerDetail8);
        }

        else {
            detail1.setText(vagrantDetail1);
            detail2.setText(vagrantDetail2);
            detail3.setText(vagrantDetail3);
            detail4.setText(vagrantDetail4);
            detail5.setText(vagrantDetail5);
            detail6.setText(vagrantDetail6);
            detail7.setText(vagrantDetail7);
            detail8.setText(vagrantDetail8);
        }


    }
}
