package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class cloqn1 extends AppCompatActivity {
Button b80;
    RadioGroup rg28;
    static int total7 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cloqn1);
        b80=(Button)findViewById(R.id.button101);
        b80.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(cloqn1.this, cloqn2.class);
                startActivity(i);
                int totalscore = totalscore();
            }
        }));
                }
    public int totalscore() {
        rg28= findViewById(R.id.radioGroup18);
        int radioId1 = rg28.getCheckedRadioButtonId();
        if (radioId1 == R.id.a52) {
            total7 = total7 + 1;

        } else {
            return total7;
        }
        return radioId1;
    }
                }
