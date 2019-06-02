package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class agqn2 extends AppCompatActivity {
Button b53,b54;
    RadioGroup rg17;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agqn2);
        b53=(Button)findViewById(R.id.button48);
        b53.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(agqn2.this, agqn3.class);
                startActivity(i);
                int totalscore = totalscore();
            }
        }));
        b54=(Button)findViewById(R.id.button47);
        b54.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(agqn2.this, avqn1.class);
                startActivity(i);
            }
        }));

    }
    public int totalscore() {
        rg17 = findViewById(R.id.radioGroup7);
        int radioId2 = rg17.getCheckedRadioButtonId();
        if (radioId2 == R.id.a8) {
            agqn1.total3 = agqn1.total3 + 1;

        } else {
            return agqn1.total3;
        }
        return radioId2;
    }
}
