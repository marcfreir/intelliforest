package com.azo.marcfreir.intelliforest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivityIntelliForest extends AppCompatActivity {
    private Spinner spinnerState = null;
    private Button buttonTableRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_intelli_forest);

        spinnerState = (Spinner) findViewById(R.id.spinnerState);

        ArrayAdapter<CharSequence> adapter_state = ArrayAdapter.createFromResource(this, R.array.states,
                android.R.layout.simple_spinner_item);

        adapter_state.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerState.setAdapter(adapter_state);

        //Button Calc
        Button buttonCalc = (Button) findViewById(R.id.buttonCalc);
        buttonCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textboxCutTree = (EditText) findViewById(R.id.textboxCutTree);
                EditText textboxVolume = (EditText) findViewById(R.id.textboxVolume);
                EditText textboxReplacedTree = (EditText) findViewById(R.id.textboxReplacedTree);
                TextView textlineTreesReplace = (TextView) findViewById(R.id.textlineTreesReplace);
                TextView textlineTotalPrice = (TextView) findViewById(R.id.textlineTotalPrice);

                //Logic
                int boxCutTree = Integer.parseInt(textboxCutTree.getText().toString());
                float boxVolume = Integer.parseInt(textboxVolume.getText().toString());
                float boxReplacedTree = Integer.parseInt(textboxReplacedTree.getText().toString());
                //float lineTreesReplace = Integer.parseInt(textlineTreesReplace.getText().toString());

                //float lineVolume = (3.14f * 0.5f * 0.5f * 20f * boxCutTree);
                //float lineNTreeVol = (lineVolume);
                //float lineTotalPrice = ((0.75f * lineVolume) - (boxReplacedTree / 8f));
                //float lineTreesReplace = ((lineVolume * 6f) - boxReplacedTree);


                //Just a empty variable
                String jav = ("");
                //Replaced Trees
                if (boxVolume > 0) {
                    float lineTreesReplace = ((boxVolume * 6f) - boxReplacedTree);
                    textlineTreesReplace.setText(lineTreesReplace + "");

                    //For Total Price
                    if ((lineTreesReplace % 6) > 0) {
                        float x = (lineTreesReplace - (lineTreesReplace % 6f));
                        float y = x/6f;
                        float lineTotalPrice = ((y * 0.75f) + 0.75f);
                        textlineTotalPrice.setText(lineTotalPrice + "");
                    }
                    else {
                        float a = (lineTreesReplace / 6f);
                        float lineTotalPrice = (a * 0.75f);
                        textlineTotalPrice.setText(lineTotalPrice + "");
                    }
                }
                /*
                else if (textboxVolume.getText().toString().matches("")) {
                    float lineTreesReplace = 0f;
                    textlineTreesReplace.setText(lineTreesReplace + "");

                    //For Total Price
                    float lineTotalPrice = 0f;
                    textlineTotalPrice.setText(lineTotalPrice + "");

                }
                */
                else {
                    float lineTreesReplace = 0f;
                    textlineTreesReplace.setText(lineTreesReplace + "");

                    //For Total Price
                    float lineTotalPrice = 0f;
                    textlineTotalPrice.setText(lineTotalPrice + "");
                }

                /*

                //TextView textlineTreesReplace with the value already set
                TextView newtextlineTreesReplace = (TextView) findViewById(R.id.textlineTreesReplace);

                //Converting the TextView in a String/Interger(float) again as global
                float num_textlineTreesReplace = Integer.valueOf(newtextlineTreesReplace.getText().toString());

                //float lineTreesReplace = Integer.parseInt(textlineTreesReplace.getText().toString());
                */
                /*
                //Total Price
                if (num_textlineTreesReplace == 0) {
                    float lineTotalPrice = 0f;
                    textlineTotalPrice.setText(lineTotalPrice + "");
                }
                else if ((num_textlineTreesReplace % 6) > 0) {
                    float x = (num_textlineTreesReplace - (num_textlineTreesReplace % 6f));
                    float y = x/6f;
                    float lineTotalPrice = ((y * 0.75f) + 0.75f);
                    textlineTotalPrice.setText(lineTotalPrice + "");
                }
                else {
                    float a = (num_textlineTreesReplace / 6f);
                    float lineTotalPrice = (a * 0.75f);
                    textlineTotalPrice.setText(lineTotalPrice + "");
                }
                */


                //textlineTotalPrice.setText(lineTotalPrice + "");
                //textlineTreesReplace.setText(lineTreesReplace + "");
            }
        });

        //Button Reforestation Table
        buttonTableRef = (Button) findViewById(R.id.buttonTableRef);
        buttonTableRef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityTableForm();
            }
        });
    }
    public void openActivityTableForm() {
        Intent intent = new Intent(this, TableFormActivity.class);
        startActivity(intent);
    }
}
