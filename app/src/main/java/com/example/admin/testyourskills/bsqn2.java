package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class bsqn2 extends AppCompatActivity {
Button b73,b74;
    RadioGroup rg23;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bsqn2);
        b73=(Button)findViewById(R.id.button77);
        b73.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(bsqn2.this, bsqn1.class);
                startActivity(i);
            }
        }));
        b74=(Button)findViewById(R.id.button78);
        b74.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(bsqn2.this, bsqn3.class);
                startActivity(i);
                int totalscore = totalscore();
            }
        }));
    }
    public int totalscore() {
        rg23 = findViewById(R.id.radioGroup13);
        int radioId2 = rg23.getCheckedRadioButtonId();
        if (radioId2 == R.id.a31) {
            bsqn1.total5 = bsqn1.total5 + 1;

        } else {
            return bsqn1.total5;
        }
        return radioId2;
    }
}
