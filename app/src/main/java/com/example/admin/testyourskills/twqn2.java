package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class twqn2 extends AppCompatActivity {
Button b97, b98;
    RadioGroup rg56;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twqn2);
        b97=(Button)findViewById(R.id.button63);
        b97.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(twqn2.this, twqn1.class);
                startActivity(i);
            }
        }));
        b98=(Button)findViewById(R.id.button62);
        b98.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(twqn2.this, twqn3.class);
                startActivity(i);
                int totalscore = totalscore();
            }
        }));
    }
    public int totalscore() {
        rg56 = findViewById(R.id.radioGroup59);
        int radioId2 = rg56.getCheckedRadioButtonId();
        if (radioId2 == R.id.b73) {
            twqn1.total17 = twqn1.total17 + 1;

        } else {
            return twqn1.total17;
        }
        return radioId2;
    }
}
