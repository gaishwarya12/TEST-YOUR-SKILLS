package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class pqn2 extends AppCompatActivity {
Button b61,b62;
    RadioGroup rg40;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pqn2);
        b61=(Button)findViewById(R.id.button53);
        b61.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(pqn2.this, pqn3.class);
                startActivity(i);
                int totalscore = totalscore();
            }
        }));
        b62=(Button)findViewById(R.id.button52);
        b62.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(pqn2.this, pqn1.class);
                startActivity(i);
            }
        }));

    }
    public int totalscore() {
        rg40 = findViewById(R.id.radioGroup41);
        int radioId2 = rg40.getCheckedRadioButtonId();
        if (radioId2 == R.id.b3) {
            pqn1.total11 = pqn1.total11 + 1;

        } else {
            return pqn1.total11;
        }
        return radioId2;
    }
}
