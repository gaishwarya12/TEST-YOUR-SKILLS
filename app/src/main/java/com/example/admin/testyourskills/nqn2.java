package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class nqn2 extends AppCompatActivity {
Button b46,b47;
    RadioGroup rg32;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nqn2);
        b46=(Button)findViewById(R.id.button33);
        b46.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(nqn2.this,nqn1.class);
                startActivity(i);
            }
        }));

        b47=(Button)findViewById(R.id.button32);
        b47.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(nqn2.this, nqn3.class);
                startActivity(i);
                int totalscore = totalscore();
            }
        }));
    }
    public int totalscore() {
        rg32 = findViewById(R.id.radioGroup32);
        int radioId2 = rg32.getCheckedRadioButtonId();
        if (radioId2 == R.id.a65) {
            nqn1.total8 = nqn1.total8+ 1;

        } else {
            return nqn1.total8;
        }
        return radioId2;
    }
}
