package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class pqn1 extends AppCompatActivity {
Button b60;
    RadioGroup rg39;
    static int total11 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pqn1);
        b60=(Button)findViewById(R.id.button51);
        b60.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(pqn1.this, pqn2.class);
                startActivity(i);
                int totalscore = totalscore();
            }
        }));
    }
    public int totalscore() {
        rg39= findViewById(R.id.radioGroup40);
        int radioId1 = rg39.getCheckedRadioButtonId();
        if (radioId1 == R.id.a100) {
            total11 = total11 + 1;

        } else {
            return total11;
        }
        return radioId1;
    }
    }
