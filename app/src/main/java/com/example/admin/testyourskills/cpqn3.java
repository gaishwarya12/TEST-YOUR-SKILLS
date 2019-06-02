package com.example.admin.testyourskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class cpqn3 extends AppCompatActivity {
Button b17,b18;
    RadioGroup rg8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpqn3);
        b17=(Button)findViewById(R.id.button13);
        b17.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(cpqn3.this, cpqn2.class);
                startActivity(i);
            }
        }));
        b18=(Button)findViewById(R.id.button12);
        b18.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(cpqn3.this, cpqn4.class);
                startActivity(i);
                int totalscore = totalscore();
            }
        }));
    }
    public int totalscore() {
        rg8 = findViewById(R.id.radioGroup23);

        int radioId3 = rg8.getCheckedRadioButtonId();
        if (radioId3 == R.id.ra12) {
            CPlus.total2= CPlus.total2 + 1;
            //Toast.makeText(getApplicationContext(),"total"+ C.total,Toast.LENGTH_LONG).show();

        } else {
            return CPlus.total2;
        }
        return radioId3;
    }
}
