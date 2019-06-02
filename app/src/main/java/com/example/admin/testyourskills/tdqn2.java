package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class tdqn2 extends AppCompatActivity {
Button b93,b94;
    RadioGroup rg50;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tdqn2);
        b93=(Button)findViewById(R.id.button67);
        b93.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(tdqn2.this, tdqn1.class);
                startActivity(i);
            }
        }));
        b94=(Button)findViewById(R.id.button68);
        b94.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(tdqn2.this, tdqn3.class);
                startActivity(i);
                int totalscore = totalscore();
            }
        }));
    }
    public int totalscore() {
        rg50 = findViewById(R.id.radioGroup53);
        int radioId2 = rg50.getCheckedRadioButtonId();
        if (radioId2 == R.id.b51) {
            tdqn1.total15 = tdqn1.total15 + 1;

        } else {
            return tdqn1.total15;
        }
        return radioId2;
    }
}
