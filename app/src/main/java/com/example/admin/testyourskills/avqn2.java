package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class avqn2 extends AppCompatActivity {
Button b57,b58;
    RadioGroup rg20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avqn2);
        b57=(Button)findViewById(R.id.button41);
        b57.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(avqn2.this, avqn3.class);
                startActivity(i);
                int totalscore = totalscore();
            }
        }));
        b58=(Button)findViewById(R.id.button42);
        b58.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(avqn2.this, avqn1.class);
                startActivity(i);
            }
        }));

    }
    public int totalscore() {
        rg20 = findViewById(R.id.radioGroup10);
        int radioId2 = rg20.getCheckedRadioButtonId();
        if (radioId2 == R.id.a17) {
            avqn1.total4 = avqn1.total4 + 1;

        } else {
            return avqn1.total4;
        }
        return radioId2;
    }
}
