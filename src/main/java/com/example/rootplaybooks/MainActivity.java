package com.example.rootplaybooks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private RadioGroup crdg;
        private RadioButton arbiter;
        private RadioButton ranger;
        private RadioButton scoundrel;
        private RadioButton thief;
        private RadioButton tinker;
        private RadioButton vagrant;
        private TextView pbDesc;
        private String selectedClass="Arbiter";
        private String arbiterDesc;
        private String rangerDesc;
        private String scoundrelDesc;
        private String thiefDesc;
        private String tinkerDesc;
        private String vagrantDesc;

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    public static final String CLASS_CHOSEN = "com.example.myfirstapp.MESSAGE2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        crdg = findViewById(R.id.playbookRadio);
        arbiter = findViewById(R.id.radioButton_ARBITER);
        ranger = findViewById(R.id.radioButton_RANGER);
        scoundrel = findViewById(R.id.radioButton_SCOUNDREL);
        thief = findViewById(R.id.radioButton_THIEF);
        tinker = findViewById(R.id.radioButton_TINKER);
        vagrant = findViewById(R.id.radioButton_VAGRANT);
        pbDesc = findViewById(R.id.pbDescription);

        arbiter.setSelected(true);

        //this sets a listener for each radio button to send the option as an intent and to set the description in the description box
        crdg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(i==R.id.radioButton_ARBITER){
                    selectedClass = arbiter.getText().toString();
                    pbDesc.setText(arbiterDesc);
                }
                else if(i==R.id.radioButton_RANGER){
                    selectedClass = ranger.getText().toString();
                    pbDesc.setText(rangerDesc);
                }
                else if(i==R.id.radioButton_SCOUNDREL){
                    selectedClass = scoundrel.getText().toString();
                    pbDesc.setText(scoundrelDesc);
                }
                else if(i==R.id.radioButton_THIEF){
                    selectedClass = thief.getText().toString();
                    pbDesc.setText(thiefDesc);
                }
                else if(i==R.id.radioButton_TINKER){
                    selectedClass = tinker.getText().toString();
                    pbDesc.setText(tinkerDesc);
                }
                else {
                    selectedClass = vagrant.getText().toString();
                    pbDesc.setText(vagrantDesc);
                }
            }
        });

        arbiterDesc = "A powerful, obstinate vagabond, serving as somewhere between a mercenary and a protector, perhaps taking sides to easily in the greater conflict between the factions.";
        rangerDesc = "A capable, stealthy vagabond, centered on the forests that fill the Woodland between the clearings, more interested in the wilds than in the company of other Woodland denizens or their society.";
        scoundrelDesc = "A lucky, dangerous vagabond, acting more as a destroyer and troublemaker than anything else, perhaps creating chaos and destruction for its own sake.";
        thiefDesc = "A cunning, criminal vagabond, capable of stealing even the most well-guarded treasures, perhaps committed to crime and theft for its own sake.";
        tinkerDesc = "An adept, clever vagabond, interested in mechanisms and craftsmanship, perhaps possessed of ideas that separate you from those around you.";
        vagrantDesc = "A charming, survivor vagabond, using words to get out of dangerous situations, perhaps even setting possible predators upon each other to keep them away from yourself.";

    }


    /** Called when the user taps the Send button */
    public void sendMessage(View view) {

        Intent intent = new Intent(this, DisplayMessageActivity.class);
        Bundle extras = new Bundle();
        EditText charName = findViewById(R.id.charName);
        String name = charName.getText().toString();
        extras.putString(EXTRA_MESSAGE, name);
        extras.putString(CLASS_CHOSEN, selectedClass);
        intent.putExtras(extras);
        startActivity(intent);

        Intent classIntent = new Intent(this, DisplayMessageActivity.class);
        classIntent.putExtra(CLASS_CHOSEN, selectedClass);

    }


}