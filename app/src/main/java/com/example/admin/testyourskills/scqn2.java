package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class scqn2 extends AppCompatActivity {
Button b50,b51;
    RadioGroup rg45;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scqn2);
        b50=(Button)findViewById(R.id.button38);
        b50.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(scqn2.this,scqn1.class);
                startActivity(i);
            }
        }));

        b51=(Button)findViewById(R.id.button37);
        b51.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scqn2.this,scqn3.class);
                startActivity(i);
                int totalscore = totalscore();
            }
        }));
    }
    public int totalscore() {
        rg45 = findViewById(R.id.radioGroup47);
        int radioId2 = rg45.getCheckedRadioButtonId();
        if (radioId2 == R.id.b28) {
            scqn1.total13 = scqn1.total13 + 1;

        } else {
            return scqn1.total13;
        }
        return radioId2;
    }
}
