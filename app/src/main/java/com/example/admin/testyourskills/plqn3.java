package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class plqn3 extends AppCompatActivity {
Button b71,b110;
    RadioGroup rg38;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plqn3);
        b71=(Button)findViewById(R.id.button60);
        b110=(Button)findViewById(R.id.button59);
        b71.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(plqn3.this, plqn2.class);
                startActivity(i);
            }
        }));
        b110.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int totalscore = totalscore();
            }
        }));
    }
    public int totalscore() {
        rg38 = findViewById(R.id.radioGroup39);
        int radioId2 = rg38.getCheckedRadioButtonId();
        if (radioId2 == R.id.a94) {
            plqn1.total10 = plqn1.total10+ 1;
            openDialog();

        } else {
            openDialog();
            return plqn1.total10;
        }
        return radioId2;
    }
    public void openDialog() {
        ED8 exampleDialog = new ED8();
        exampleDialog.show(getSupportFragmentManager(), "example dialog");
    }
    }
