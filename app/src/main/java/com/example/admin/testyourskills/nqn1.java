package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class nqn1 extends AppCompatActivity {
Button b45;
    RadioGroup rg31;
    static int total8 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nqn1);
        b45=(Button)findViewById(R.id.button31);
        b45.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(nqn1.this,nqn2.class);
                startActivity(i);
                int totalscore = totalscore();
            }
        }));
    }
    public int totalscore() {
        rg31= findViewById(R.id.radioGroup31);
        int radioId1 = rg31.getCheckedRadioButtonId();
        if (radioId1 == R.id.a64) {
            total8= total8 + 1;

        } else {
            return total8;
        }
        return radioId1;
    }
}
