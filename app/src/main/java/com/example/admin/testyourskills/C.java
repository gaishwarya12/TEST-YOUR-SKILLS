package com.example.admin.testyourskills;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class C extends AppCompatActivity {
    Button b6;
    RadioGroup rg1;
static int total = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        Button b6 = findViewById(R.id.button4);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in = new Intent(C.this, cqn2.class);
                startActivity(in);
                int totalscore = totalscore();
            }
        });
            }
    public int totalscore() {
        rg1 = findViewById(R.id.radioGroup2);
        int radioId1 = rg1.getCheckedRadioButtonId();
        if (radioId1 == R.id.r1) {
          total = total + 1;

        } else {
            return total;
        }
        return radioId1;
    }

    }

