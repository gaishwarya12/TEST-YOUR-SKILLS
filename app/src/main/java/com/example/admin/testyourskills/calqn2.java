package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class calqn2 extends AppCompatActivity {
Button b77,b78;
    RadioGroup rg26;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calqn2);
        b77=(Button)findViewById(R.id.button98);
        b77.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(calqn2.this, calqn3.class);
                startActivity(i);
                int totalscore = totalscore();
            }
        }));
        b78=(Button)findViewById(R.id.button97);
        b78.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(calqn2.this, calqn1.class);
                startActivity(i);
            }
        }));
    }
    public int totalscore() {
        rg26 = findViewById(R.id.radioGroup16);
        int radioId2 = rg26.getCheckedRadioButtonId();
        if (radioId2 == R.id.a42) {
            calqn1.total6= calqn1.total6+ 1;

        } else {
            return calqn1.total6;
        }
        return radioId2;
    }
}
