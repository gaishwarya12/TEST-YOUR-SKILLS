package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class rpqn2 extends AppCompatActivity {
Button b85,b86;
    RadioGroup rg42;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rpqn2);
        b85=(Button)findViewById(R.id.button93);
        b85.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(rpqn2.this, rpqn3.class);
                startActivity(i);
                int totalscore = totalscore();
                }

        }));
        b86=(Button)findViewById(R.id.button92);
        b86.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(rpqn2.this, rpqn1.class);
                startActivity(i);
            }
        }));

    }
    public int totalscore() {
        rg42 = findViewById(R.id.radioGroup44);
        int radioId2 = rg42.getCheckedRadioButtonId();
        if (radioId2 == R.id.b16) {
            rpqn1.total12 = rpqn1.total12 + 1;

        } else {
            return rpqn1.total12;
        }
        return radioId2;
    }
}
