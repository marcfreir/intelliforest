package com.azo.marcfreir.intelliforest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TableFormActivity extends AppCompatActivity {
    private Button backButton;
    private Button totalButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_form);

        //Button Total
        totalButton = (Button) findViewById(R.id.buttonTotal);
        totalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Text Boxes Replaced Trees
                EditText textboxRepTrees_1 = (EditText) findViewById(R.id.textboxRepTrees_1);
                EditText textboxRepTrees_2 = (EditText) findViewById(R.id.textboxRepTrees_2);
                EditText textboxRepTrees_3 = (EditText) findViewById(R.id.textboxRepTrees_3);
                EditText textboxRepTrees_4 = (EditText) findViewById(R.id.textboxRepTrees_4);
                TextView lblTotalRepTrees = (TextView) findViewById(R.id.lblTotalRepTrees);

                //Text Boxes Volume
                EditText textboxVol_1 = (EditText) findViewById(R.id.textboxVol_1);
                EditText textboxVol_2 = (EditText) findViewById(R.id.textboxVol_2);
                EditText textboxVol_3 = (EditText) findViewById(R.id.textboxVol_3);
                EditText textboxVol_4 = (EditText) findViewById(R.id.textboxVol_4);
                TextView lblTotalVol = (TextView) findViewById(R.id.lblTotalVol);

                //Text Boxes Cut Trees
                EditText textboxCutTrees_1 = (EditText) findViewById(R.id.textboxCutTrees_1);
                EditText textboxCutTrees_2 = (EditText) findViewById(R.id.textboxCutTrees_2);
                EditText textboxCutTrees_3 = (EditText) findViewById(R.id.textboxCutTrees_3);
                EditText textboxCutTrees_4 = (EditText) findViewById(R.id.textboxCutTrees_4);
                TextView lblTotalCutTrees = (TextView) findViewById(R.id.lblTotalCutTrees);

                //Variables Replaced Trees
                int repTrees_1 = Integer.parseInt(textboxRepTrees_1.getText().toString());
                int repTrees_2 = Integer.parseInt(textboxRepTrees_2.getText().toString());
                int repTrees_3 = Integer.parseInt(textboxRepTrees_3.getText().toString());
                int repTrees_4 = Integer.parseInt(textboxRepTrees_4.getText().toString());

                //Variables Volume
                int vol_1 = Integer.parseInt(textboxVol_1.getText().toString());
                int vol_2 = Integer.parseInt(textboxVol_2.getText().toString());
                int vol_3 = Integer.parseInt(textboxVol_3.getText().toString());
                int vol_4 = Integer.parseInt(textboxVol_4.getText().toString());

                //Variables Cut Trees
                int cutTrees_1 = Integer.parseInt(textboxCutTrees_1.getText().toString());
                int cutTrees_2 = Integer.parseInt(textboxCutTrees_2.getText().toString());
                int cutTrees_3 = Integer.parseInt(textboxCutTrees_3.getText().toString());
                int cutTrees_4 = Integer.parseInt(textboxCutTrees_4.getText().toString());

                //Results (Total)
                int result_repTrees = (repTrees_1 + repTrees_2 + repTrees_3 + repTrees_4);
                int result_vol = (vol_1 + vol_2 + vol_3 + vol_4);
                int result_cutTrees = (cutTrees_1 + cutTrees_2 + cutTrees_3 + cutTrees_4);

                lblTotalRepTrees.setText(result_repTrees + "");
                lblTotalVol.setText(result_vol + "");
                lblTotalCutTrees.setText(result_cutTrees + "");
            }
        });

        //Button back
        backButton = (Button) findViewById(R.id.buttonBack);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TableFormActivity.this, MainActivityIntelliForest.class));
            }
        });

    }
}
