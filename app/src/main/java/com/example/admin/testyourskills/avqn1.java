package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class avqn1 extends AppCompatActivity {
Button b56;
    RadioGroup rg19;
    static int total4 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avqn1);
        b56=(Button)findViewById(R.id.button43);
        b56.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(avqn1.this, avqn2.class);
                startActivity(i);
                int totalscore = totalscore();
            }
        }));
    }
    public int totalscore() {
        rg19 = findViewById(R.id.radioGroup9);
        int radioId1 = rg19.getCheckedRadioButtonId();
        if (radioId1 == R.id.a16) {
            total4 = total4 + 1;

        } else {
            return total4;
        }
        return radioId1;
    }
    }

