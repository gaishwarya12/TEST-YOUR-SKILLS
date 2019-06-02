package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class pqn3 extends AppCompatActivity {
Button b63,b111;
    RadioGroup rg41;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pqn3);
        b63=(Button)findViewById(R.id.button54);
        b111=(Button)findViewById(R.id.button55);
        b63.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(pqn3.this, pqn2.class);
                startActivity(i);
            }
        }));
        b111.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int total_score = totalscore();
            }
        }));

    }
    public int totalscore() {
        rg41 = findViewById(R.id.radioGroup42);
        int radioId2 = rg41.getCheckedRadioButtonId();
        if (radioId2 == R.id.b5) {
            pqn1.total11 = pqn1.total11 + 1;
            openDialog();
        } else {
            openDialog();
            return pqn1.total11;
        }
        return radioId2;
    }
        public void openDialog() {
            ED9 exampleDialog = new ED9();
            exampleDialog.show(getSupportFragmentManager(), "example dialog");
        }
    }

