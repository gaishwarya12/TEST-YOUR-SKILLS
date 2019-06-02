package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class plqn2 extends AppCompatActivity {
Button b69,b70;
    RadioGroup rg37;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plqn2);
        b69=(Button)findViewById(R.id.button57);
        b69.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(plqn2.this, plqn3.class);
                startActivity(i);
                int totalscore = totalscore();
            }
        }));
        b70=(Button)findViewById(R.id.button58);
        b70.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(plqn2.this, plqn1.class);
                startActivity(i);
            }
        }));
    }
    public int totalscore() {
        rg37 = findViewById(R.id.radioGroup38);
        int radioId2 = rg37.getCheckedRadioButtonId();
        if (radioId2 == R.id.a91) {
            plqn1.total10 = plqn1.total10+ 1;

        } else {
            return plqn1.total10;
        }
        return radioId2;
    }
    }
