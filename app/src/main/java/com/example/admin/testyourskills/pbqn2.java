package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class pbqn2 extends AppCompatActivity {
Button b65,b66;
    RadioGroup rg34;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pbqn2);
        b65=(Button)findViewById(R.id.button87);
        b65.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(pbqn2.this, pbqn1.class);
                startActivity(i);
            }
        }));
        b66=(Button)findViewById(R.id.button88);
        b66.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(pbqn2.this, pbqn3.class);
                startActivity(i);
                int totalscore = totalscore();
            }
        }));

    }
    public int totalscore() {
        rg34 = findViewById(R.id.radioGroup35);
        int radioId2 = rg34.getCheckedRadioButtonId();
        if (radioId2 == R.id.a80) {
            pbqn1.total9 = pbqn1.total9 + 1;

        } else {
            return pbqn1.total9;
        }
        return radioId2;
    }
}
