package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class tqn2 extends AppCompatActivity {
    Button b101, b102;
    RadioGroup rg53;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tqn2);

        b101 = (Button) findViewById(R.id.button72);
        b101.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(tqn2.this, tqn3.class);
                startActivity(i);
                int totalscore = totalscore();
            }
        }));
        b102 = (Button) findViewById(R.id.button73);
        b102.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(tqn2.this, tqn1.class);
                startActivity(i);
            }
        }));
    }
    public int totalscore() {
        rg53= findViewById(R.id.radioGroup56);
        int radioId2 = rg53.getCheckedRadioButtonId();
        if (radioId2 == R.id.b63) {
            tqn1.total16= tqn1.total16 + 1;

        } else {
            return tqn1.total16;
        }
        return radioId2;
    }
}

